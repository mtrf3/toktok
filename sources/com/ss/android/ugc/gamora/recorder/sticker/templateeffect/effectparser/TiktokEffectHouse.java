package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TiktokEffectHouse {

    @InterfaceC65349Pkn("business")
    public final String business;

    @InterfaceC65349Pkn("minSdkVersion")
    public final String minSdkVersion;

    @InterfaceC65349Pkn("sdkVersion")
    public final String sdkVersion;

    @InterfaceC65349Pkn("toolVersion")
    public final String toolVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public TiktokEffectHouse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokEffectHouse)) {
            return false;
        }
        TiktokEffectHouse tiktokEffectHouse = (TiktokEffectHouse) obj;
        return o.LJ(this.toolVersion, tiktokEffectHouse.toolVersion) && o.LJ(this.sdkVersion, tiktokEffectHouse.sdkVersion) && o.LJ(this.minSdkVersion, tiktokEffectHouse.minSdkVersion) && o.LJ(this.business, tiktokEffectHouse.business);
    }

    public final int hashCode() {
        String str = this.toolVersion;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sdkVersion;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.minSdkVersion;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.business;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TiktokEffectHouse(toolVersion=");
        LIZ.append(this.toolVersion);
        LIZ.append(", sdkVersion=");
        LIZ.append(this.sdkVersion);
        LIZ.append(", minSdkVersion=");
        LIZ.append(this.minSdkVersion);
        LIZ.append(", business=");
        return q.LIZIZ(LIZ, this.business, ')', LIZ);
    }

    public TiktokEffectHouse(String str, String str2, String str3, String str4) {
        this.toolVersion = str;
        this.sdkVersion = str2;
        this.minSdkVersion = str3;
        this.business = str4;
    }

    public /* synthetic */ TiktokEffectHouse(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
