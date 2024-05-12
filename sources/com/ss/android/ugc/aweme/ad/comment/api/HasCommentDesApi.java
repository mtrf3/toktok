package com.ss.android.ugc.aweme.ad.comment.api;

import X.C221108m2;
import X.C48339Iy7;
import X.C62822Ol8;
import X.C79062V1e;
import X.C9V5;
import X.E8L;
import X.InterfaceC247159mx;
import X.InterfaceC36621EYv;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import X.InterfaceC65349Pkn;
import X.SPA;
import X.X1D;
import com.ss.android.ugc.aweme.ad.comment.api.HasCommentDesApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HasCommentDesApi {
    public static InterfaceC247159mx LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C9V5.LJLIL);

    /* loaded from: classes5.dex */
    public interface Api {
        @E8L("/tiktok/v1/ad/privacy/settings/description/")
        InterfaceC37276Ek4<HasCResponse> getResponse(@InterfaceC64986Pew("item_id") String str);
    }

    /* loaded from: classes5.dex */
    public static final class HasCResponse {

        @InterfaceC65349Pkn("has_ad_comment_des")
        public final boolean hasAdCommentDes;

        @InterfaceC65349Pkn("status_code")
        public final int statusCode;

        @InterfaceC65349Pkn("status_msg")
        public final String statusMsg;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HasCResponse)) {
                return false;
            }
            HasCResponse hasCResponse = (HasCResponse) obj;
            return this.statusCode == hasCResponse.statusCode && o.LJ(this.statusMsg, hasCResponse.statusMsg) && this.hasAdCommentDes == hasCResponse.hasAdCommentDes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int LJ = C79062V1e.LJ(this.statusMsg, this.statusCode * 31, 31);
            boolean z = this.hasAdCommentDes;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return LJ + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HasCResponse(statusCode=");
            LIZ.append(this.statusCode);
            LIZ.append(", statusMsg=");
            LIZ.append(this.statusMsg);
            LIZ.append(", hasAdCommentDes=");
            return C48339Iy7.LIZJ(LIZ, this.hasAdCommentDes, ')', LIZ);
        }

        public HasCResponse(int i, String statusMsg, boolean z) {
            o.LJIIIZ(statusMsg, "statusMsg");
            this.statusCode = i;
            this.statusMsg = statusMsg;
            this.hasAdCommentDes = z;
        }

        public /* synthetic */ HasCResponse(int i, String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? false : z);
        }
    }

    public static void LIZ(String str, SPA spa) {
        LIZ = spa;
        ((Api) LIZIZ.getValue()).getResponse(str).enqueue(new InterfaceC36621EYv<HasCResponse>() { // from class: X.9mv
            @Override // X.InterfaceC36621EYv
            public final void LIZJ(InterfaceC37276Ek4<HasCommentDesApi.HasCResponse> interfaceC37276Ek4, Throwable th) {
                HasCommentDesApi.LIZ = null;
            }

            @Override // X.InterfaceC36621EYv
            public final void LJII(InterfaceC37276Ek4<HasCommentDesApi.HasCResponse> interfaceC37276Ek4, C64797Pbt<HasCommentDesApi.HasCResponse> c64797Pbt) {
                if (c64797Pbt != null && c64797Pbt.LIZIZ() && c64797Pbt.LIZIZ.hasAdCommentDes) {
                    C1DH.LJJIJIIJI(new Runnable() { // from class: X.9mw
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ2;
                            try {
                                InterfaceC247159mx interfaceC247159mx = HasCommentDesApi.LIZ;
                                if (interfaceC247159mx != null) {
                                    interfaceC247159mx.call();
                                }
                                HasCommentDesApi.LIZ = null;
                            } finally {
                                if (LIZ2) {
                                }
                            }
                        }
                    });
                } else {
                    HasCommentDesApi.LIZ = null;
                }
            }
        });
    }
}
