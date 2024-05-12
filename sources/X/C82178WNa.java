package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.WNa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82178WNa extends WNY {
    public static final C78892Uxk LJLJJLL = new C78892Uxk(Rect.class);
    public Rect LJLJJI;
    public Rect LJLJJL;

    @Override // X.WNY
    public final void LIZIZ(boolean z) {
    }

    @Override // X.WNY
    public final WNT LIZJ(boolean z) {
        if (this.LJLJJI.equals(this.LJLJJL)) {
            return WNT.LIZIZ;
        }
        return new C82180WNc(new C82181WNd(this.LJLJI, LJLJJLL, new C30031BqV(), this.LJLJJI, this.LJLJJL));
    }

    @Override // X.WNY
    public final void LIZ(View view, View view2, View view3) {
        super.LIZ(view, view2, view3);
        int width = view.getWidth();
        int height = view.getHeight();
        int width2 = view2.getWidth();
        int height2 = view2.getHeight();
        if (view == view3) {
            this.LJLJJI = new Rect(view.getLeft(), view.getTop(), view.getLeft() + width, view.getTop() + height);
            this.LJLJJL = new Rect(view.getLeft(), view.getTop(), view.getLeft() + width2, view.getTop() + height2);
        } else {
            this.LJLJJI = new Rect(view2.getLeft(), view2.getTop(), view2.getLeft() + width, view2.getTop() + height);
            this.LJLJJL = new Rect(view2.getLeft(), view2.getTop(), view2.getLeft() + width2, view2.getTop() + height2);
        }
    }
}
