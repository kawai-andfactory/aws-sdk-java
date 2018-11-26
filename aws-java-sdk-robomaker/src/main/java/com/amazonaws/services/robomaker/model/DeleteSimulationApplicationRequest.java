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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteSimulationApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSimulationApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application information for the simulation application to delete.
     * </p>
     */
    private String application;
    /**
     * <p>
     * The version of the simulation application to delete.
     * </p>
     */
    private String applicationVersion;

    /**
     * <p>
     * The application information for the simulation application to delete.
     * </p>
     * 
     * @param application
     *        The application information for the simulation application to delete.
     */

    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * <p>
     * The application information for the simulation application to delete.
     * </p>
     * 
     * @return The application information for the simulation application to delete.
     */

    public String getApplication() {
        return this.application;
    }

    /**
     * <p>
     * The application information for the simulation application to delete.
     * </p>
     * 
     * @param application
     *        The application information for the simulation application to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSimulationApplicationRequest withApplication(String application) {
        setApplication(application);
        return this;
    }

    /**
     * <p>
     * The version of the simulation application to delete.
     * </p>
     * 
     * @param applicationVersion
     *        The version of the simulation application to delete.
     */

    public void setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    /**
     * <p>
     * The version of the simulation application to delete.
     * </p>
     * 
     * @return The version of the simulation application to delete.
     */

    public String getApplicationVersion() {
        return this.applicationVersion;
    }

    /**
     * <p>
     * The version of the simulation application to delete.
     * </p>
     * 
     * @param applicationVersion
     *        The version of the simulation application to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSimulationApplicationRequest withApplicationVersion(String applicationVersion) {
        setApplicationVersion(applicationVersion);
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
        if (getApplication() != null)
            sb.append("Application: ").append(getApplication()).append(",");
        if (getApplicationVersion() != null)
            sb.append("ApplicationVersion: ").append(getApplicationVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSimulationApplicationRequest == false)
            return false;
        DeleteSimulationApplicationRequest other = (DeleteSimulationApplicationRequest) obj;
        if (other.getApplication() == null ^ this.getApplication() == null)
            return false;
        if (other.getApplication() != null && other.getApplication().equals(this.getApplication()) == false)
            return false;
        if (other.getApplicationVersion() == null ^ this.getApplicationVersion() == null)
            return false;
        if (other.getApplicationVersion() != null && other.getApplicationVersion().equals(this.getApplicationVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplication() == null) ? 0 : getApplication().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersion() == null) ? 0 : getApplicationVersion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSimulationApplicationRequest clone() {
        return (DeleteSimulationApplicationRequest) super.clone();
    }

}
