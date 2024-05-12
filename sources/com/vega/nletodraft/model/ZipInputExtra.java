package com.vega.nletodraft.model;

import X.C113554cx;
import X.C12400eC;
import X.C16880lQ;
import X.C47135Ieh;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ZipInputExtra {

    @InterfaceC65349Pkn("creation_id")
    public final String creationId;

    @InterfaceC65349Pkn("gameplay_algorithm")
    public final String gameplayAlgorithm;

    @InterfaceC65349Pkn("is_standard_nle_model")
    public final boolean isStandardNLEModel;

    @InterfaceC65349Pkn("package_name")
    public final String packageName;

    @InterfaceC65349Pkn("uri_map")
    public final Map<String, String> uriMap;

    @InterfaceC65349Pkn("vid")
    public final long vid;

    @InterfaceC65349Pkn("video_count")
    public final int videoCount;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ZipInputExtra() {
        /*
            r11 = this;
            r1 = 0
            r4 = 0
            r7 = 0
            r9 = 127(0x7f, float:1.78E-43)
            r0 = r11
            r2 = r1
            r3 = r1
            r5 = r4
            r6 = r1
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vega.nletodraft.model.ZipInputExtra.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZipInputExtra)) {
            return false;
        }
        ZipInputExtra zipInputExtra = (ZipInputExtra) obj;
        return o.LJ(this.creationId, zipInputExtra.creationId) && o.LJ(this.gameplayAlgorithm, zipInputExtra.gameplayAlgorithm) && o.LJ(this.packageName, zipInputExtra.packageName) && this.isStandardNLEModel == zipInputExtra.isStandardNLEModel && this.videoCount == zipInputExtra.videoCount && o.LJ(this.uriMap, zipInputExtra.uriMap) && this.vid == zipInputExtra.vid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.creationId.hashCode() * 31;
        String str = this.gameplayAlgorithm;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.packageName, (hashCode2 + hashCode) * 31, 31);
        boolean z = this.isStandardNLEModel;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return C16880lQ.LLJIJIL(this.vid) + C12400eC.LIZ(this.uriMap, (((LJ + i) * 31) + this.videoCount) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ZipInputExtra(creationId=");
        LIZ.append(this.creationId);
        LIZ.append(", gameplayAlgorithm=");
        LIZ.append((Object) this.gameplayAlgorithm);
        LIZ.append(", packageName=");
        LIZ.append(this.packageName);
        LIZ.append(", isStandardNLEModel=");
        LIZ.append(this.isStandardNLEModel);
        LIZ.append(", videoCount=");
        LIZ.append(this.videoCount);
        LIZ.append(", uriMap=");
        LIZ.append(this.uriMap);
        LIZ.append(", vid=");
        return C47135Ieh.LIZIZ(LIZ, this.vid, ')', LIZ);
    }

    public ZipInputExtra(String creationId, String str, String packageName, boolean z, int i, Map<String, String> uriMap, long j) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(packageName, "packageName");
        o.LJIIIZ(uriMap, "uriMap");
        this.creationId = creationId;
        this.gameplayAlgorithm = str;
        this.packageName = packageName;
        this.isStandardNLEModel = z;
        this.videoCount = i;
        this.uriMap = uriMap;
        this.vid = j;
    }

    public /* synthetic */ ZipInputExtra(String str, String str2, String str3, boolean z, int i, Map map, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? C113554cx.LJJJLIIL() : map, (i2 & 64) != 0 ? -1L : j);
    }
}
