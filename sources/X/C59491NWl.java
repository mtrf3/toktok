package X;

import android.view.MotionEvent;
import com.ss.android.ugc.aweme.bullet.module.base.ui.BulletWebViewTouchDelegate;

/* renamed from: X.NWl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59491NWl extends SJC {
    public final /* synthetic */ BulletWebViewTouchDelegate LJLIL;

    public C59491NWl(BulletWebViewTouchDelegate bulletWebViewTouchDelegate) {
        this.LJLIL = bulletWebViewTouchDelegate;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.LJLIL.LJI = System.currentTimeMillis();
        return super.onSingleTapUp(motionEvent);
    }
}
