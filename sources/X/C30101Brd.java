package X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.Brd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30101Brd extends C30099Brb {
    @Override // X.C30099Brb, android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            motionEvent.getX();
            motionEvent.getY();
            motionEvent.getAction();
        }
        return super.onTouchEvent(motionEvent);
    }

    public C30101Brd(Context context, C30100Brc c30100Brc) {
        super(context, c30100Brc);
    }
}
