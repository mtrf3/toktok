package X;

import android.view.MotionEvent;
import com.ss.android.ugc.aweme.spark.SparkWebViewTouchDelegate;

/* renamed from: X.NWm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59492NWm extends SJC {
    public final /* synthetic */ SparkWebViewTouchDelegate LJLIL;

    public C59492NWm(SparkWebViewTouchDelegate sparkWebViewTouchDelegate) {
        this.LJLIL = sparkWebViewTouchDelegate;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.LJLIL.LJII = System.currentTimeMillis();
        return super.onSingleTapUp(motionEvent);
    }
}
