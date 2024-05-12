package com.ss.android.ugc.aweme.sticker.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class NatureClassificationStruct implements Serializable {

    @InterfaceC65349Pkn("genus_id")
    public String genusId;

    @InterfaceC65349Pkn("genus_name")
    public String genusName;

    @InterfaceC65349Pkn("redirection_schema")
    public String redirectionSchema;

    @InterfaceC65349Pkn("species_id")
    public String speciesId;

    @InterfaceC65349Pkn("species_name")
    public String speciesName;

    /* JADX WARN: Multi-variable type inference failed */
    public NatureClassificationStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NatureClassificationStruct(String str) {
        this(str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 30, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NatureClassificationStruct(String str, String str2) {
        this(str, str2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 28, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NatureClassificationStruct(String str, String str2, String str3) {
        this(str, str2, str3, null, 0 == true ? 1 : 0, 24, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NatureClassificationStruct(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, 16, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NatureClassificationStruct copy$default(NatureClassificationStruct natureClassificationStruct, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = natureClassificationStruct.speciesId;
        }
        if ((i & 2) != 0) {
            str2 = natureClassificationStruct.speciesName;
        }
        if ((i & 4) != 0) {
            str3 = natureClassificationStruct.genusId;
        }
        if ((i & 8) != 0) {
            str4 = natureClassificationStruct.genusName;
        }
        if ((i & 16) != 0) {
            str5 = natureClassificationStruct.redirectionSchema;
        }
        return natureClassificationStruct.copy(str, str2, str3, str4, str5);
    }

    public final NatureClassificationStruct copy(String str, String str2, String str3, String str4, String str5) {
        return new NatureClassificationStruct(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NatureClassificationStruct)) {
            return false;
        }
        NatureClassificationStruct natureClassificationStruct = (NatureClassificationStruct) obj;
        return o.LJ(this.speciesId, natureClassificationStruct.speciesId) && o.LJ(this.speciesName, natureClassificationStruct.speciesName) && o.LJ(this.genusId, natureClassificationStruct.genusId) && o.LJ(this.genusName, natureClassificationStruct.genusName) && o.LJ(this.redirectionSchema, natureClassificationStruct.redirectionSchema);
    }

    public int hashCode() {
        String str = this.speciesId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.speciesName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.genusId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.genusName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.redirectionSchema;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NatureClassificationStruct(speciesId=");
        LIZ.append(this.speciesId);
        LIZ.append(", speciesName=");
        LIZ.append(this.speciesName);
        LIZ.append(", genusId=");
        LIZ.append(this.genusId);
        LIZ.append(", genusName=");
        LIZ.append(this.genusName);
        LIZ.append(", redirectionSchema=");
        return q.LIZIZ(LIZ, this.redirectionSchema, ')', LIZ);
    }

    public final String getGenusId() {
        return this.genusId;
    }

    public final String getGenusName() {
        return this.genusName;
    }

    public final String getRedirectionSchema() {
        return this.redirectionSchema;
    }

    public final String getSpeciesId() {
        return this.speciesId;
    }

    public final String getSpeciesName() {
        return this.speciesName;
    }

    public NatureClassificationStruct(String str, String str2, String str3, String str4, String str5) {
        this.speciesId = str;
        this.speciesName = str2;
        this.genusId = str3;
        this.genusName = str4;
        this.redirectionSchema = str5;
    }

    public /* synthetic */ NatureClassificationStruct(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }
}
