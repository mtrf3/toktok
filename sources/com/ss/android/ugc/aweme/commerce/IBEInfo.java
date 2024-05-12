package com.ss.android.ugc.aweme.commerce;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IBEInfo implements Serializable {

    @InterfaceC65349Pkn("ibe_type")
    public final int ibeType;

    @InterfaceC65349Pkn("lynx_schema")
    public final String lynxSchema;

    @InterfaceC65349Pkn("prop_id")
    public final String propId;

    /* JADX WARN: Multi-variable type inference failed */
    public IBEInfo() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IBEInfo copy$default(IBEInfo iBEInfo, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iBEInfo.ibeType;
        }
        if ((i2 & 2) != 0) {
            str = iBEInfo.lynxSchema;
        }
        if ((i2 & 4) != 0) {
            str2 = iBEInfo.propId;
        }
        return iBEInfo.copy(i, str, str2);
    }

    public final IBEInfo copy(int i, String lynxSchema, String str) {
        o.LJIIIZ(lynxSchema, "lynxSchema");
        return new IBEInfo(i, lynxSchema, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IBEInfo)) {
            return false;
        }
        IBEInfo iBEInfo = (IBEInfo) obj;
        return this.ibeType == iBEInfo.ibeType && o.LJ(this.lynxSchema, iBEInfo.lynxSchema) && o.LJ(this.propId, iBEInfo.propId);
    }

    public final String getGeckoChannel() {
        return UriProtector.getQueryParameter(UriProtector.parse(this.lynxSchema), "channel");
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.lynxSchema, this.ibeType * 31, 31);
        String str = this.propId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final boolean getHasGeckoChannel() {
        if (getGeckoChannel() != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IBEInfo(ibeType=");
        LIZ.append(this.ibeType);
        LIZ.append(", lynxSchema=");
        LIZ.append(this.lynxSchema);
        LIZ.append(", propId=");
        return q.LIZIZ(LIZ, this.propId, ')', LIZ);
    }

    public final int getIbeType() {
        return this.ibeType;
    }

    public final String getLynxSchema() {
        return this.lynxSchema;
    }

    public final String getPropId() {
        return this.propId;
    }

    public IBEInfo(int i, String lynxSchema, String str) {
        o.LJIIIZ(lynxSchema, "lynxSchema");
        this.ibeType = i;
        this.lynxSchema = lynxSchema;
        this.propId = str;
    }

    public /* synthetic */ IBEInfo(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : str2);
    }
}
