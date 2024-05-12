package com.bytedance.ttmock.data;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NetworkInterceptMockConfig {

    @InterfaceC65349Pkn("all_response")
    public final boolean allResponse;

    @InterfaceC65349Pkn("fake_img_url")
    public final String fakeImgUrl;

    @InterfaceC65349Pkn("fake_video_url")
    public final String fakeVideoUrl;

    @InterfaceC65349Pkn("intercept_list")
    public final String[] interceptList;

    @InterfaceC65349Pkn("white_list")
    public final String[] whiteList;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkInterceptMockConfig() {
        this(null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NetworkInterceptMockConfig copy$default(NetworkInterceptMockConfig networkInterceptMockConfig, String str, String str2, boolean z, String[] strArr, String[] strArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkInterceptMockConfig.fakeImgUrl;
        }
        if ((i & 2) != 0) {
            str2 = networkInterceptMockConfig.fakeVideoUrl;
        }
        if ((i & 4) != 0) {
            z = networkInterceptMockConfig.allResponse;
        }
        if ((i & 8) != 0) {
            strArr = networkInterceptMockConfig.interceptList;
        }
        if ((i & 16) != 0) {
            strArr2 = networkInterceptMockConfig.whiteList;
        }
        return networkInterceptMockConfig.copy(str, str2, z, strArr, strArr2);
    }

    public final NetworkInterceptMockConfig copy(String fakeImgUrl, String fakeVideoUrl, boolean z, String[] strArr, String[] strArr2) {
        o.LJIIIZ(fakeImgUrl, "fakeImgUrl");
        o.LJIIIZ(fakeVideoUrl, "fakeVideoUrl");
        return new NetworkInterceptMockConfig(fakeImgUrl, fakeVideoUrl, z, strArr, strArr2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkInterceptMockConfig)) {
            return false;
        }
        NetworkInterceptMockConfig networkInterceptMockConfig = (NetworkInterceptMockConfig) obj;
        return o.LJ(this.fakeImgUrl, networkInterceptMockConfig.fakeImgUrl) && o.LJ(this.fakeVideoUrl, networkInterceptMockConfig.fakeVideoUrl) && this.allResponse == networkInterceptMockConfig.allResponse && o.LJ(this.interceptList, networkInterceptMockConfig.interceptList) && o.LJ(this.whiteList, networkInterceptMockConfig.whiteList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.fakeVideoUrl, this.fakeImgUrl.hashCode() * 31, 31);
        boolean z = this.allResponse;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LJ + i) * 31;
        String[] strArr = this.interceptList;
        int i3 = 0;
        if (strArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(strArr);
        }
        int i4 = (i2 + hashCode) * 31;
        String[] strArr2 = this.whiteList;
        if (strArr2 != null) {
            i3 = Arrays.hashCode(strArr2);
        }
        return i4 + i3;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NetworkInterceptMockConfig(fakeImgUrl=");
        LIZ.append(this.fakeImgUrl);
        LIZ.append(", fakeVideoUrl=");
        LIZ.append(this.fakeVideoUrl);
        LIZ.append(", allResponse=");
        LIZ.append(this.allResponse);
        LIZ.append(", interceptList=");
        LIZ.append(Arrays.toString(this.interceptList));
        LIZ.append(", whiteList=");
        return q.LIZIZ(LIZ, Arrays.toString(this.whiteList), ')', LIZ);
    }

    public final boolean getAllResponse() {
        return this.allResponse;
    }

    public final String getFakeImgUrl() {
        return this.fakeImgUrl;
    }

    public final String getFakeVideoUrl() {
        return this.fakeVideoUrl;
    }

    public final String[] getInterceptList() {
        return this.interceptList;
    }

    public final String[] getWhiteList() {
        return this.whiteList;
    }

    public NetworkInterceptMockConfig(String fakeImgUrl, String fakeVideoUrl, boolean z, String[] strArr, String[] strArr2) {
        o.LJIIIZ(fakeImgUrl, "fakeImgUrl");
        o.LJIIIZ(fakeVideoUrl, "fakeVideoUrl");
        this.fakeImgUrl = fakeImgUrl;
        this.fakeVideoUrl = fakeVideoUrl;
        this.allResponse = z;
        this.interceptList = strArr;
        this.whiteList = strArr2;
    }

    public /* synthetic */ NetworkInterceptMockConfig(String str, String str2, boolean z, String[] strArr, String[] strArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : strArr, (i & 16) == 0 ? strArr2 : null);
    }
}
