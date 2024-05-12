package com.bytedance.ies.ugc.aweme.commercialize.compliance.inference.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Gender implements Serializable {

    @InterfaceC65349Pkn("gender_tag_content")
    public String genderContent;

    @InterfaceC65349Pkn("gender_tag_source")
    public String genderSource;

    @InterfaceC65349Pkn("gender_tag_type")
    public String genderType;
    public int labelType;

    /* JADX WARN: Multi-variable type inference failed */
    public Gender() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Gender copy$default(Gender gender, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gender.genderSource;
        }
        if ((i2 & 2) != 0) {
            str2 = gender.genderType;
        }
        if ((i2 & 4) != 0) {
            str3 = gender.genderContent;
        }
        if ((i2 & 8) != 0) {
            i = gender.labelType;
        }
        return gender.copy(str, str2, str3, i);
    }

    public final Gender copy(String str, String str2, String str3, int i) {
        return new Gender(str, str2, str3, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gender)) {
            return false;
        }
        Gender gender = (Gender) obj;
        return o.LJ(this.genderSource, gender.genderSource) && o.LJ(this.genderType, gender.genderType) && o.LJ(this.genderContent, gender.genderContent) && this.labelType == gender.labelType;
    }

    public int hashCode() {
        String str = this.genderSource;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.genderType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.genderContent;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.labelType;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Gender(genderSource=");
        LIZ.append(this.genderSource);
        LIZ.append(", genderType=");
        LIZ.append(this.genderType);
        LIZ.append(", genderContent=");
        LIZ.append(this.genderContent);
        LIZ.append(", labelType=");
        return b0.LIZJ(LIZ, this.labelType, ')', LIZ);
    }

    public final String getGenderContent() {
        return this.genderContent;
    }

    public final String getGenderSource() {
        return this.genderSource;
    }

    public final String getGenderType() {
        return this.genderType;
    }

    public final int getLabelType() {
        return this.labelType;
    }

    public final void setGenderContent(String str) {
        this.genderContent = str;
    }

    public final void setGenderSource(String str) {
        this.genderSource = str;
    }

    public final void setGenderType(String str) {
        this.genderType = str;
    }

    public final void setLabelType(int i) {
        this.labelType = i;
    }

    public Gender(String str, String str2, String str3, int i) {
        this.genderSource = str;
        this.genderType = str2;
        this.genderContent = str3;
        this.labelType = i;
    }

    public /* synthetic */ Gender(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? -1 : i);
    }
}
