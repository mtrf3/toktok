package X;

import android.view.ViewTreeObserver;

/* renamed from: X.U2q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC76552U2q implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C76549U2n LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f;
        int i;
        ViewTreeObserver viewTreeObserver;
        if (this.LJLIL) {
            f = 193.0f;
        } else {
            f = 169.0f;
        }
        int LIZ = C15380j0.LIZ(f);
        C47121t6 c47121t6 = this.LJLILLLLZI.LJLJJL;
        if (c47121t6 != null) {
            i = c47121t6.getWidth();
        } else {
            i = 0;
        }
        int i2 = LIZ + i;
        C47121t6 c47121t62 = this.LJLILLLLZI.LJLJJI;
        if (c47121t62 != null) {
            c47121t62.setMaxWidth(C15380j0.LJIIL() - i2);
        }
        C47121t6 c47121t63 = this.LJLILLLLZI.LJLJJL;
        if (c47121t63 != null && (viewTreeObserver = c47121t63.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC76552U2q(boolean z, C76549U2n c76549U2n) {
        this.LJLIL = z;
        this.LJLILLLLZI = c76549U2n;
    }
}
