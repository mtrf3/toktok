package X;

import android.app.Activity;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;

/* loaded from: classes8.dex */
public final class I04 extends WXA {
    public final /* synthetic */ I02 LJLIL;

    public I04(I02 i02) {
        this.LJLIL = i02;
    }

    @Override // X.WXB, X.WXG
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        WXA wxa;
        I02 i02 = this.LJLIL;
        if (!i02.LJLLILLLL || i02.getShortVideoContext().isDuetMode) {
            return false;
        }
        if (motionEvent == null || motionEvent2 == null) {
            return this instanceof W17;
        }
        InterfaceC82353WTt gestureApiComponent = this.LJLIL.getGestureApiComponent();
        if (gestureApiComponent != null) {
            wxa = gestureApiComponent.Zh(6);
        } else {
            wxa = null;
        }
        if (wxa != null && wxa.onFling(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        if (motionEvent2.getY() < motionEvent.getY() && C1I1.LIZIZ(motionEvent2, motionEvent.getY()) > C47959Irz.LIZ(motionEvent2, motionEvent.getX()) && !this.LJLIL.getRecordControlApi().isRecording().LIZ().booleanValue() && !this.LJLIL.LJJLI()) {
            G8G.LIZ.start(OpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
            this.LJLIL.getShortVideoContext().uploadMethod = "slide_full";
            this.LJLIL.getShortVideoContext().enterAlbumMethod = "slide_up";
            I02.LJJLIIJ(this.LJLIL, true, false, 2, null);
            HYT hyt = C46002I3q.LLI;
            Activity LJIJJ = C78688UuS.LJIJJ(this.LJLIL);
            ShortVideoContext shortVideoContext = this.LJLIL.getShortVideoContext();
            C82622Wbi diContainer = this.LJLIL.getDiContainer();
            hyt.getClass();
            HYT.LIZ(LJIJJ, shortVideoContext, diContainer, null);
        }
        return false;
    }
}
