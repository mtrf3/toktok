package X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

/* loaded from: classes14.dex */
public final class UIT implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ UIS LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ float LJLJJI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.LJLIL.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.LJLIL.getMeasuredWidth() <= 0) {
            return;
        }
        this.LJLIL.setDuraion(this.LJLILLLLZI);
        if (C74275TDb.LJI(this.LJLIL)) {
            UIS uis = this.LJLIL;
            uis.LJLJJI.right = uis.getMeasuredWidth();
            this.LJLIL.LJLJJI.left = (int) (r0.getMeasuredWidth() - this.LJLJI);
        } else {
            Rect rect = this.LJLIL.LJLJJI;
            rect.left = 0;
            rect.right = (int) this.LJLJI;
        }
        UIS uis2 = this.LJLIL;
        uis2.LJLJL = (int) this.LJLJJI;
        uis2.invalidate();
    }

    public UIT(UIS uis, long j, float f, float f2) {
        this.LJLIL = uis;
        this.LJLILLLLZI = j;
        this.LJLJI = f;
        this.LJLJJI = f2;
    }
}
