package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GV1 extends GUX implements InterfaceC41602GUk {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public final C41617GUz LJLJI;
    public final /* synthetic */ GUV LJLJJI;

    public GV1(GUV guv) {
        this.LJLJJI = guv;
        C41617GUz c41617GUz = new C41617GUz(guv, this);
        this.LJLJI = c41617GUz;
        C41877Gc5.LIZ.LIZLLL(c41617GUz);
    }

    @Override // X.GUX
    public final void onProgress(int i, Object obj) {
        if (this.LJLJJI.LIZ.LJLJJL.LIZ.publishType != 0) {
            return;
        }
        if (!this.LJLILLLLZI) {
            C41732GZk.LIZIZ();
            this.LJLILLLLZI = true;
        }
        if (!this.LJLIL && C41877Gc5.LIZ.LIZIZ()) {
            if (C19N.LJ("studio_fix_publish_service_start_crash", false)) {
                GUV guv = this.LJLJJI;
                guv.getClass();
                try {
                    C41730GZi.LIZIZ(guv.LIZ.LJLJJL.LIZIZ);
                } catch (Exception unused) {
                }
            } else {
                C41730GZi.LIZIZ(this.LJLJJI.LIZ.LJLJJL.LIZIZ);
            }
            this.LJLJJI.LIZ(true);
            this.LJLIL = true;
        }
    }

    @Override // X.GUX
    public final void onFinish(AbstractC41479GPr result, Object obj, PublishModel publishModel) {
        o.LJIIIZ(result, "result");
        C41877Gc5.LIZ.LJ(this.LJLJI);
    }
}
