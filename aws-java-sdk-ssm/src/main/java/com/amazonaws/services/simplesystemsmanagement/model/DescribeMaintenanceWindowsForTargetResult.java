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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowsForTarget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMaintenanceWindowsForTargetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the Maintenance Window targets and tasks an instance is associated with.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MaintenanceWindowIdentityForTarget> windowIdentities;
    /**
     * <p>
     * The token for the next set of items to return. (You use this token in the next call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the Maintenance Window targets and tasks an instance is associated with.
     * </p>
     * 
     * @return Information about the Maintenance Window targets and tasks an instance is associated with.
     */

    public java.util.List<MaintenanceWindowIdentityForTarget> getWindowIdentities() {
        if (windowIdentities == null) {
            windowIdentities = new com.amazonaws.internal.SdkInternalList<MaintenanceWindowIdentityForTarget>();
        }
        return windowIdentities;
    }

    /**
     * <p>
     * Information about the Maintenance Window targets and tasks an instance is associated with.
     * </p>
     * 
     * @param windowIdentities
     *        Information about the Maintenance Window targets and tasks an instance is associated with.
     */

    public void setWindowIdentities(java.util.Collection<MaintenanceWindowIdentityForTarget> windowIdentities) {
        if (windowIdentities == null) {
            this.windowIdentities = null;
            return;
        }

        this.windowIdentities = new com.amazonaws.internal.SdkInternalList<MaintenanceWindowIdentityForTarget>(windowIdentities);
    }

    /**
     * <p>
     * Information about the Maintenance Window targets and tasks an instance is associated with.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWindowIdentities(java.util.Collection)} or {@link #withWindowIdentities(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param windowIdentities
     *        Information about the Maintenance Window targets and tasks an instance is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowsForTargetResult withWindowIdentities(MaintenanceWindowIdentityForTarget... windowIdentities) {
        if (this.windowIdentities == null) {
            setWindowIdentities(new com.amazonaws.internal.SdkInternalList<MaintenanceWindowIdentityForTarget>(windowIdentities.length));
        }
        for (MaintenanceWindowIdentityForTarget ele : windowIdentities) {
            this.windowIdentities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Maintenance Window targets and tasks an instance is associated with.
     * </p>
     * 
     * @param windowIdentities
     *        Information about the Maintenance Window targets and tasks an instance is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowsForTargetResult withWindowIdentities(java.util.Collection<MaintenanceWindowIdentityForTarget> windowIdentities) {
        setWindowIdentities(windowIdentities);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You use this token in the next call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You use this token in the next call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You use this token in the next call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You use this token in the next call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You use this token in the next call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You use this token in the next call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowsForTargetResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getWindowIdentities() != null)
            sb.append("WindowIdentities: ").append(getWindowIdentities()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMaintenanceWindowsForTargetResult == false)
            return false;
        DescribeMaintenanceWindowsForTargetResult other = (DescribeMaintenanceWindowsForTargetResult) obj;
        if (other.getWindowIdentities() == null ^ this.getWindowIdentities() == null)
            return false;
        if (other.getWindowIdentities() != null && other.getWindowIdentities().equals(this.getWindowIdentities()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowIdentities() == null) ? 0 : getWindowIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMaintenanceWindowsForTargetResult clone() {
        try {
            return (DescribeMaintenanceWindowsForTargetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
