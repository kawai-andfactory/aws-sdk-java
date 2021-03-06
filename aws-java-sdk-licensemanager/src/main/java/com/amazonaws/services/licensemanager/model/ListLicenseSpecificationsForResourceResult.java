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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseSpecificationsForResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLicenseSpecificationsForResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * License configurations associated with a resource.
     * </p>
     */
    private java.util.List<LicenseSpecification> licenseSpecifications;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * License configurations associated with a resource.
     * </p>
     * 
     * @return License configurations associated with a resource.
     */

    public java.util.List<LicenseSpecification> getLicenseSpecifications() {
        return licenseSpecifications;
    }

    /**
     * <p>
     * License configurations associated with a resource.
     * </p>
     * 
     * @param licenseSpecifications
     *        License configurations associated with a resource.
     */

    public void setLicenseSpecifications(java.util.Collection<LicenseSpecification> licenseSpecifications) {
        if (licenseSpecifications == null) {
            this.licenseSpecifications = null;
            return;
        }

        this.licenseSpecifications = new java.util.ArrayList<LicenseSpecification>(licenseSpecifications);
    }

    /**
     * <p>
     * License configurations associated with a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseSpecifications(java.util.Collection)} or
     * {@link #withLicenseSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseSpecifications
     *        License configurations associated with a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseSpecificationsForResourceResult withLicenseSpecifications(LicenseSpecification... licenseSpecifications) {
        if (this.licenseSpecifications == null) {
            setLicenseSpecifications(new java.util.ArrayList<LicenseSpecification>(licenseSpecifications.length));
        }
        for (LicenseSpecification ele : licenseSpecifications) {
            this.licenseSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * License configurations associated with a resource.
     * </p>
     * 
     * @param licenseSpecifications
     *        License configurations associated with a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseSpecificationsForResourceResult withLicenseSpecifications(java.util.Collection<LicenseSpecification> licenseSpecifications) {
        setLicenseSpecifications(licenseSpecifications);
        return this;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @return Token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseSpecificationsForResourceResult withNextToken(String nextToken) {
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
        if (getLicenseSpecifications() != null)
            sb.append("LicenseSpecifications: ").append(getLicenseSpecifications()).append(",");
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

        if (obj instanceof ListLicenseSpecificationsForResourceResult == false)
            return false;
        ListLicenseSpecificationsForResourceResult other = (ListLicenseSpecificationsForResourceResult) obj;
        if (other.getLicenseSpecifications() == null ^ this.getLicenseSpecifications() == null)
            return false;
        if (other.getLicenseSpecifications() != null && other.getLicenseSpecifications().equals(this.getLicenseSpecifications()) == false)
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

        hashCode = prime * hashCode + ((getLicenseSpecifications() == null) ? 0 : getLicenseSpecifications().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLicenseSpecificationsForResourceResult clone() {
        try {
            return (ListLicenseSpecificationsForResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
