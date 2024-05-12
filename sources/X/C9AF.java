package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: X.9AF, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9AF implements Runnable {
    public final /* synthetic */ int LJLIL = 0;
    public final /* synthetic */ int LJLILLLLZI = 0;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ C56968MXk LJLJJL;

    public final void LIZ() {
        Rect rect = new Rect();
        this.LJLJJL.getHitRect(rect);
        rect.left -= this.LJLIL;
        rect.right += this.LJLILLLLZI;
        rect.top -= this.LJLJI;
        rect.bottom += this.LJLJJI;
        ((View) this.LJLJJL.getParent()).setTouchDelegate(new TouchDelegate(rect, this.LJLJJL));
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

    public C9AF(C56968MXk c56968MXk, int i, int i2) {
        this.LJLJJL = c56968MXk;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
