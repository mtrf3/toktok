package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WKA extends SJC {
    public final /* synthetic */ WK9 LJLIL;

    public WKA(WK9 wk9) {
        this.LJLIL = wk9;
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
        this.LJLIL.LJLJJLL = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        this.LJLIL.LJLJL = new OSZ<>(Integer.valueOf((int) motionEvent.getX()), Integer.valueOf((int) motionEvent.getY()));
        return super.onDown(motionEvent);
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        WKQ wkq;
        WK9 wk9 = this.LJLIL;
        if (wk9.LJLJJLL) {
            C81975WFf LLJILJILJ = wk9.LLJILJILJ(1);
            if (LLJILJILJ != null && (wkq = LLJILJILJ.LJLLILLLL) != null) {
                wkq.LIZ();
            }
            Context requireSceneContext = this.LJLIL.requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            new C61995OUt(requireSceneContext).LIZIZ(12, LiveTryModeCountDownThresholdSetting.DEFAULT);
        }
    }
}
