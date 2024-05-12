package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XS8<T> implements InterfaceC66992k3 {
    public final /* synthetic */ XS7 LJLIL;
    public final /* synthetic */ NLEModel LJLILLLLZI;

    public XS8(XS7 xs7, NLEModel nLEModel) {
        this.LJLIL = xs7;
        this.LJLILLLLZI = nLEModel;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<String> interfaceC65052gv) {
        double d;
        if (!C44687HgJ.LIZIZ(this.LJLIL.LIZLLL)) {
            this.LJLIL.LJIILIIL(20);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C126984yc LJ = this.LJLIL.LJ();
            VideoPublishEditModel videoPublishEditModel = this.LJLIL.LIZ;
            int LIZIZ = Q7K.LIZIZ("caption_audio_sample_rate", 16000);
            int LIZIZ2 = Q7K.LIZIZ("caption_audio_bps", 96000);
            int LIZIZ3 = Q7K.LIZIZ("caption_audio_channel_count", 1);
            NLEModel nLEModel = this.LJLILLLLZI;
            C73578SuE c73578SuE = (C73578SuE) interfaceC65052gv;
            AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(c73578SuE, 762);
            LJ.getClass();
            C84674XLa LIZ = C126984yc.LIZ(videoPublishEditModel, LIZIZ, LIZIZ2, LIZIZ3, nLEModel, aqS165S0100000_15);
            this.LJLIL.LJIIJJI.LIZJ = SystemClock.elapsedRealtime() - elapsedRealtime;
            XS7 xs7 = this.LJLIL;
            XSA xsa = xs7.LJIIJJI;
            if (xs7.LIZ.getVideoLength() > 0) {
                XS7 xs72 = this.LJLIL;
                d = xs72.LJIIJJI.LIZJ / xs72.LIZ.getVideoLength();
            } else {
                d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            }
            xsa.LJI = d;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("NewRecognizeCaptionPresenter step ");
            this.LJLIL.getClass();
            LIZ2.append(XS5.LJFF(20));
            LIZ2.append(" end failedCode: ");
            LIZ2.append(LIZ.LIZ);
            LIZ2.append(" failedMsg ");
            LIZ2.append(LIZ.LIZIZ);
            H78.LJI(X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("NewRecognizeCaptionPresenter preprocess extractAudio ");
            LIZ3.append((String) LIZ.LIZJ);
            H78.LJI(X1D.LIZIZ(LIZ3));
            if (this.LJLIL.LJIJJLI) {
                this.LJLIL.LJIIJJI.LJIIL = SystemClock.elapsedRealtime() - this.LJLIL.LJIILLIIL;
            }
            if (c73578SuE.isDisposed()) {
                return;
            }
            if (LIZ.LIZ()) {
                this.LJLIL.LJIIJJI.LJIILL = 20;
                this.LJLIL.LIZIZ(LIZ.LIZ, LIZ.LIZIZ);
                c73578SuE.onError(new RuntimeException());
                return;
            }
            XS7 xs73 = this.LJLIL;
            xs73.LIZLLL = (String) LIZ.LIZJ;
            T t = LIZ.LIZJ;
            o.LJI(t);
            xs73.LJIIL = new File((String) t).length() / 1024;
            XS7 xs74 = this.LJLIL;
            xs74.LJIJJ.getData(xs74.LIZ);
            c73578SuE.onSuccess(LIZ.LIZJ);
        }
    }
}
