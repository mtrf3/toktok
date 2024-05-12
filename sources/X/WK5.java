package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WK5 extends SJC {
    public final /* synthetic */ WK3 LJLIL;

    public WK5(WK3 wk3) {
        this.LJLIL = wk3;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        Rect rect = new Rect();
        View LLJILJILJ = this.LJLIL.LLJILJILJ(1);
        if (LLJILJILJ != null) {
            rect.left = LLJILJILJ.getLeft();
            rect.right = LLJILJILJ.getRight();
            rect.bottom = LLJILJILJ.getBottom();
            rect.top = LLJILJILJ.getTop();
        }
        this.LJLIL.LJLJLLL = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        this.LJLIL.LJLL = new OSZ<>(Integer.valueOf((int) motionEvent.getX()), Integer.valueOf((int) motionEvent.getY()));
        return super.onDown(motionEvent);
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        WKQ wkq;
        WK3 wk3 = this.LJLIL;
        if (wk3.LJLJLLL) {
            C81975WFf LLJILJIL = wk3.LLJILJIL(1);
            if (LLJILJIL != null && (wkq = LLJILJIL.LJLLILLLL) != null) {
                wkq.LIZ();
            }
            Context requireSceneContext = this.LJLIL.requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            new C61995OUt(requireSceneContext).LIZIZ(12, LiveTryModeCountDownThresholdSetting.DEFAULT);
        }
    }
}
