package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WK6 extends SJC {
    public final /* synthetic */ WK2 LJLIL;

    public WK6(WK2 wk2) {
        this.LJLIL = wk2;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        Rect rect = new Rect();
        View LLJJ = this.LJLIL.LLJJ(1);
        if (LLJJ != null) {
            rect.left = LLJJ.getLeft();
            rect.right = LLJJ.getRight();
            rect.bottom = LLJJ.getBottom();
            rect.top = LLJJ.getTop();
        }
        this.LJLIL.LJLL = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        this.LJLIL.LJLLI = new OSZ<>(Integer.valueOf((int) motionEvent.getX()), Integer.valueOf((int) motionEvent.getY()));
        return super.onDown(motionEvent);
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        WKQ wkq;
        WK2 wk2 = this.LJLIL;
        if (wk2.LJLL) {
            C81975WFf LLJILJILJ = wk2.LLJILJILJ(1);
            if (LLJILJILJ != null && (wkq = LLJILJILJ.LJLLILLLL) != null) {
                wkq.LIZ();
            }
            Context requireSceneContext = this.LJLIL.requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            new C61995OUt(requireSceneContext).LIZIZ(12, LiveTryModeCountDownThresholdSetting.DEFAULT);
        }
    }
}
