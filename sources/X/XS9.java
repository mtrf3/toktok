package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XS9<T> implements InterfaceC66992k3 {
    public final /* synthetic */ XS7 LJLIL;

    public XS9(XS7 xs7) {
        this.LJLIL = xs7;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<UploadVideoConfig> interfaceC65052gv) {
        UploadVideoConfig uploadVideoConfig = this.LJLIL.LIZJ;
        if (uploadVideoConfig == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C84674XLa<UploadVideoConfig> LIZJ = this.LJLIL.LIZJ();
            this.LJLIL.LJIIJJI.LIZIZ = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NewRecognizeCaptionPresenter step ");
            this.LJLIL.getClass();
            LIZ.append(XS5.LJFF(10));
            LIZ.append(" end failedCode: ");
            LIZ.append(LIZJ.LIZ);
            LIZ.append(" failedMsg ");
            LIZ.append(LIZJ.LIZIZ);
            H78.LJI(X1D.LIZIZ(LIZ));
            H78.LJI("NewRecognizeCaptionPresenter preprocess getAuthKey");
            if (this.LJLIL.LJIJJLI) {
                this.LJLIL.LJIIJJI.LJIIJJI = SystemClock.elapsedRealtime() - this.LJLIL.LJIILLIIL;
            }
            C73578SuE c73578SuE = (C73578SuE) interfaceC65052gv;
            if (c73578SuE.isDisposed()) {
                return;
            }
            if (LIZJ.LIZ()) {
                this.LJLIL.LJIIJJI.LJIILL = 10;
                this.LJLIL.LIZIZ(LIZJ.LIZ, LIZJ.LIZIZ);
                c73578SuE.onError(new RuntimeException());
                return;
            } else {
                XS7 xs7 = this.LJLIL;
                UploadVideoConfig uploadVideoConfig2 = LIZJ.LIZJ;
                xs7.LIZJ = uploadVideoConfig2;
                o.LJI(uploadVideoConfig2);
                c73578SuE.onSuccess(uploadVideoConfig2);
                return;
            }
        }
        ((C73578SuE) interfaceC65052gv).onSuccess(uploadVideoConfig);
    }
}
