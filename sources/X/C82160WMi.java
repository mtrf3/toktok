package X;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: X.WMi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82160WMi extends FrameLayout {
    public boolean LJLIL;

    public C82160WMi(Context context) {
        super(context);
        this.LJLIL = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.LJLIL) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setTouchEnabled(boolean z) {
        this.LJLIL = z;
    }
}
