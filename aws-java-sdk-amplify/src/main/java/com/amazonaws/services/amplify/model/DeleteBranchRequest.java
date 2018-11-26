/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure for delete branch request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteBranch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBranchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Name for the branch.
     * </p>
     */
    private String branchName;

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an Amplify App.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @return Unique Id for an Amplify App.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * Unique Id for an Amplify App.
     * </p>
     * 
     * @param appId
     *        Unique Id for an Amplify App.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBranchRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Name for the branch.
     * </p>
     * 
     * @param branchName
     *        Name for the branch.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * Name for the branch.
     * </p>
     * 
     * @return Name for the branch.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * Name for the branch.
     * </p>
     * 
     * @param branchName
     *        Name for the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBranchRequest withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBranchRequest == false)
            return false;
        DeleteBranchRequest other = (DeleteBranchRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBranchRequest clone() {
        return (DeleteBranchRequest) super.clone();
    }

}
