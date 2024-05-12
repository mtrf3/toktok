package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell;

/* renamed from: X.928, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass928 extends SJC {
    public final LandscapeVideoViewCell LJLIL;
    public final InterfaceC2302191t LJLILLLLZI;

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.LJLILLLLZI.handleDoubleClick(motionEvent);
        return super.onDoubleTap(motionEvent);
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        LandscapeVideoViewCell landscapeVideoViewCell = this.LJLIL;
        landscapeVideoViewCell.getClass();
        if (!C92A.LIZ || !landscapeVideoViewCell.LJLZ()) {
            return;
        }
        landscapeVideoViewCell.LLJJJJJIL = SystemClock.elapsedRealtime();
        landscapeVideoViewCell.Z1(true);
        C2313195z c2313195z = landscapeVideoViewCell.LLJILJILJ;
        if (c2313195z != null) {
            c2313195z.LIZJ();
        }
        landscapeVideoViewCell.LLJJJJ = IWF.LJJLIIIIJ().getSpeed();
        IWF.LJJLIIIIJ().LJFF(2.0f);
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        LandscapeVideoViewCell landscapeVideoViewCell = this.LJLIL;
        if (landscapeVideoViewCell.LLIIIZ) {
            landscapeVideoViewCell.Z1(false);
        } else {
            landscapeVideoViewCell.Z1(true);
        }
        return onSingleTapUp(motionEvent);
    }

    public AnonymousClass928(LandscapeVideoViewCell landscapeVideoViewCell, InterfaceC2302191t interfaceC2302191t) {
        this.LJLIL = landscapeVideoViewCell;
        this.LJLILLLLZI = interfaceC2302191t;
    }
}
