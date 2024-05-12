package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GV0 extends GUX implements InterfaceC41602GUk {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public final C41615GUx LJLJI;
    public final /* synthetic */ GUV LJLJJI;

    public GV0(GUV guv) {
        this.LJLJJI = guv;
        C41615GUx c41615GUx = new C41615GUx(guv);
        this.LJLJI = c41615GUx;
        C42470Gle c42470Gle = C41877Gc5.LIZ;
        c42470Gle.LIZLLL(c41615GUx);
        if (guv.LIZ.LJLJJL.LIZ.publishType == 0) {
            if (!GTN.LIZ()) {
                C41732GZk.LIZIZ();
                boolean z = true;
                this.LJLILLLLZI = true;
                if (C19N.LJ("studio_fix_publish_service_start_crash", false)) {
                    try {
                        C41730GZi.LIZIZ(guv.LIZ.LJLJJL.LIZIZ);
                    } catch (Exception unused) {
                        z = false;
                    }
                } else {
                    C41730GZi.LIZIZ(guv.LIZ.LJLJJL.LIZIZ);
                }
                this.LJLIL = z;
            }
            guv.LIZ(c42470Gle.LIZIZ());
        }
    }

    @Override // X.GUX
    public final void onProgress(int i, Object obj) {
        if (this.LJLJJI.LIZ.LJLJJL.LIZ.publishType != 0) {
            return;
        }
        if (!GTN.LIZ()) {
            boolean z = true;
            if (!this.LJLILLLLZI) {
                C41732GZk.LIZIZ();
                this.LJLILLLLZI = true;
            }
            if (!this.LJLIL) {
                if (C19N.LJ("studio_fix_publish_service_start_crash", false)) {
                    GUV guv = this.LJLJJI;
                    guv.getClass();
                    try {
                        C41730GZi.LIZIZ(guv.LIZ.LJLJJL.LIZIZ);
                    } catch (Exception unused) {
                        z = false;
                    }
                } else {
                    C41730GZi.LIZIZ(this.LJLJJI.LIZ.LJLJJL.LIZIZ);
                }
                this.LJLIL = z;
            }
        }
        this.LJLJJI.LIZ(C41877Gc5.LIZ.LIZIZ());
    }

    @Override // X.GUX
    public final void onFinish(AbstractC41479GPr result, Object obj, PublishModel publishModel) {
        o.LJIIIZ(result, "result");
        C41877Gc5.LIZ.LJ(this.LJLJI);
    }
}
