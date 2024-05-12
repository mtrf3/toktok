package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PackedSKUSaleProp {

    @InterfaceC65349Pkn("prop_id")
    public final String propId;

    @InterfaceC65349Pkn("prop_name")
    public final String propName;

    @InterfaceC65349Pkn("prop_value")
    public final String propValue;

    @InterfaceC65349Pkn("prop_value_id")
    public final String propValueId;

    public static /* synthetic */ PackedSKUSaleProp copy$default(PackedSKUSaleProp packedSKUSaleProp, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = packedSKUSaleProp.propId;
        }
        if ((i & 2) != 0) {
            str2 = packedSKUSaleProp.propValueId;
        }
        if ((i & 4) != 0) {
            str3 = packedSKUSaleProp.propName;
        }
        if ((i & 8) != 0) {
            str4 = packedSKUSaleProp.propValue;
        }
        return packedSKUSaleProp.copy(str, str2, str3, str4);
    }

    public final PackedSKUSaleProp copy(String str, String str2, String str3, String str4) {
        return new PackedSKUSaleProp(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackedSKUSaleProp)) {
            return false;
        }
        PackedSKUSaleProp packedSKUSaleProp = (PackedSKUSaleProp) obj;
        return o.LJ(this.propId, packedSKUSaleProp.propId) && o.LJ(this.propValueId, packedSKUSaleProp.propValueId) && o.LJ(this.propName, packedSKUSaleProp.propName) && o.LJ(this.propValue, packedSKUSaleProp.propValue);
    }

    public int hashCode() {
        String str = this.propId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.propValueId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.propName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.propValue;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PackedSKUSaleProp(propId=");
        LIZ.append(this.propId);
        LIZ.append(", propValueId=");
        LIZ.append(this.propValueId);
        LIZ.append(", propName=");
        LIZ.append(this.propName);
        LIZ.append(", propValue=");
        return q.LIZIZ(LIZ, this.propValue, ')', LIZ);
    }

    public final String getPropId() {
        return this.propId;
    }

    public final String getPropName() {
        return this.propName;
    }

    public final String getPropValue() {
        return this.propValue;
    }

    public final String getPropValueId() {
        return this.propValueId;
    }

    public final PackedSKUSaleProp merge(PackedSKUSaleProp packedSKUSaleProp) {
        if (packedSKUSaleProp == null) {
            return this;
        }
        String str = packedSKUSaleProp.propId;
        if (str == null) {
            str = this.propId;
        }
        String str2 = packedSKUSaleProp.propValueId;
        if (str2 == null) {
            str2 = this.propValueId;
        }
        String str3 = packedSKUSaleProp.propName;
        if (str3 == null) {
            str3 = this.propName;
        }
        String str4 = packedSKUSaleProp.propValue;
        if (str4 == null) {
            str4 = this.propValue;
        }
        return new PackedSKUSaleProp(str, str2, str3, str4);
    }

    public PackedSKUSaleProp(String str, String str2, String str3, String str4) {
        this.propId = str;
        this.propValueId = str2;
        this.propName = str3;
        this.propValue = str4;
    }
}
