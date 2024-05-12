package com.ss.android.ugc.aweme.client.experiment;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC27211Am7;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public interface UploadVidApi {
    @E4T("/tiktok/v1/upload/vid/")
    AbstractC73672Svk<UploadVidResponse> uploadVid(@InterfaceC27211Am7 UploadVidRequest uploadVidRequest);

    /* loaded from: classes7.dex */
    public static final class UploadVidRequest {

        @InterfaceC65349Pkn("vids")
        public final String vids;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UploadVidRequest) && o.LJ(this.vids, ((UploadVidRequest) obj).vids);
        }

        public final int hashCode() {
            return this.vids.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UploadVidRequest(vids=");
            return q.LIZIZ(LIZ, this.vids, ')', LIZ);
        }

        public UploadVidRequest(String vids) {
            o.LJIIIZ(vids, "vids");
            this.vids = vids;
        }
    }

    /* loaded from: classes7.dex */
    public static final class UploadVidResponse {

        @InterfaceC65349Pkn("status_code")
        public final int statusCode;

        @InterfaceC65349Pkn("status_msg")
        public final String statusMsg;

        @InterfaceC65349Pkn("vid")
        public final String vid;

        /* JADX WARN: Multi-variable type inference failed */
        public UploadVidResponse() {
            this(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UploadVidResponse)) {
                return false;
            }
            UploadVidResponse uploadVidResponse = (UploadVidResponse) obj;
            return o.LJ(this.vid, uploadVidResponse.vid) && this.statusCode == uploadVidResponse.statusCode && o.LJ(this.statusMsg, uploadVidResponse.statusMsg);
        }

        public final int hashCode() {
            String str = this.vid;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.statusCode) * 31;
            String str2 = this.statusMsg;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UploadVidResponse(vid=");
            LIZ.append(this.vid);
            LIZ.append(", statusCode=");
            LIZ.append(this.statusCode);
            LIZ.append(", statusMsg=");
            return q.LIZIZ(LIZ, this.statusMsg, ')', LIZ);
        }

        public UploadVidResponse(String str, int i, String str2) {
            this.vid = str;
            this.statusCode = i;
            this.statusMsg = str2;
        }

        public /* synthetic */ UploadVidResponse(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2);
        }
    }
}
