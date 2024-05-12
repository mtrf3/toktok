package X;

import kotlin.jvm.internal.o;

/* renamed from: X.H2z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43437H2z implements H5B {
    public final /* synthetic */ C43423H2l LIZ;

    public C43437H2z(C43423H2l c43423H2l) {
        this.LIZ = c43423H2l;
    }

    @Override // X.H5B
    public final void LIZ(H52 resultState) {
        o.LJIIIZ(resultState, "resultState");
        if (resultState == H52.CANCEL) {
            C79081V1x LIZJ = this.LIZ.LJII().LIZJ();
            C188727au c188727au = new C188727au();
            C43397H1l c43397H1l = this.LIZ.LJIIL;
            if (c43397H1l != null) {
                c188727au.LJFF(c43397H1l, "publish_id");
                c188727au.LIZLLL(0, "video_type");
                c188727au.LIZLLL(1, "video_upload_type");
                c188727au.LJIIIZ("cancel_step", "call_uploader");
                java.util.Map<String, String> map = c188727au.LIZ;
                o.LJIIIIZZ(map, "newBuilder()\n           …call_uploader\").builder()");
                LIZJ.getClass();
                FMX.LJIIL("user_cancel_publish", map);
                AbstractC43436H2y abstractC43436H2y = this.LIZ.LJIJI;
                if (abstractC43436H2y != null) {
                    abstractC43436H2y.LIZIZ();
                    return;
                } else {
                    o.LJIJI("uploader");
                    throw null;
                }
            }
            o.LJIJI("publishId");
            throw null;
        }
    }
}
