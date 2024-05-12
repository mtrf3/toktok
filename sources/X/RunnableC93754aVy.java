package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: X.aVy, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class RunnableC93754aVy implements Runnable {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public RunnableC93754aVy(View view, View view2, int i) {
        this.LJLIL = view;
        this.LJLILLLLZI = view2;
        this.LJLJI = i;
    }

    public final void LIZ() {
        Rect rect = new Rect();
        this.LJLIL.getHitRect(rect);
        int i = rect.left;
        int i2 = this.LJLJI;
        rect.left = i - i2;
        rect.top -= i2;
        rect.right += i2;
        rect.bottom += i2;
        TouchDelegate touchDelegate = this.LJLILLLLZI.getTouchDelegate();
        if (touchDelegate == null) {
            touchDelegate = new TouchDelegate(rect, this.LJLIL);
        }
        this.LJLILLLLZI.setTouchDelegate(touchDelegate);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
