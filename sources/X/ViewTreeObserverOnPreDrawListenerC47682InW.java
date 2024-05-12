package X;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: X.InW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnPreDrawListenerC47682InW implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ViewGroup LJLIL;
    public final /* synthetic */ C47680InU LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i;
        int width = this.LJLILLLLZI.LJLIL.getWidth();
        int height = this.LJLILLLLZI.LJLIL.getHeight();
        int i2 = this.LJLILLLLZI.LJLIL.getLayoutParams().width;
        int i3 = this.LJLILLLLZI.LJLIL.getLayoutParams().height;
        int width2 = this.LJLIL.getWidth();
        int height2 = this.LJLIL.getHeight();
        if (i2 == -1) {
            width = width2;
        } else if (i2 != -2) {
            width = i2;
        }
        if (i3 == -1) {
            height = height2;
        } else if (i3 != -2) {
            height = i3;
        }
        this.LJLILLLLZI.LJLIL.getLeft();
        this.LJLILLLLZI.LJLIL.getRight();
        this.LJLILLLLZI.LJLIL.getTop();
        this.LJLILLLLZI.LJLIL.getBottom();
        int i4 = 0;
        if (width > width2) {
            i = 0;
        } else {
            i = (width2 - width) / 2;
        }
        if (height <= height2) {
            i4 = (height2 - height) / 2;
            height2 = i4 + height;
        }
        this.LJLILLLLZI.LJLIL.setLeftTopRightBottom(i, i4, width2, height2);
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC47682InW(C47680InU c47680InU, ViewGroup viewGroup) {
        this.LJLILLLLZI = c47680InU;
        this.LJLIL = viewGroup;
    }
}
