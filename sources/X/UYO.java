package X;

import android.view.ViewTreeObserver;

/* loaded from: classes14.dex */
public final class UYO implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ UYP LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ float LJLJJL;

    public UYO(UYP uyp, C76732zl c76732zl, int i, float f, float f2) {
        this.LJLIL = uyp;
        this.LJLILLLLZI = c76732zl;
        this.LJLJI = i;
        this.LJLJJI = f;
        this.LJLJJL = f2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.LJLIL.LJLILLLLZI.invoke().booleanValue()) {
            return;
        }
        int[] iArr = new int[2];
        this.LJLIL.L().getLocationOnScreen(iArr);
        int i = iArr[0];
        if (i == 0) {
            C76732zl c76732zl = this.LJLILLLLZI;
            int i2 = c76732zl.element;
            if (i2 >= 3) {
                UYP uyp = this.LJLIL;
                uyp.LJLIL.invoke(Integer.valueOf(uyp.getAdapterPosition()), Float.valueOf(0.0f));
                return;
            } else {
                c76732zl.element = i2 + 1;
                return;
            }
        }
        this.LJLILLLLZI.element = 0;
        int i3 = i - (this.LJLJI / 2);
        float f = i3;
        float f2 = this.LJLJJI;
        if (f >= f2) {
            float f3 = this.LJLJJL;
            if (f <= f3) {
                if (i3 <= 0) {
                    f = f3 - f;
                }
                UYP uyp2 = this.LJLIL;
                uyp2.LJLIL.invoke(Integer.valueOf(uyp2.getAdapterPosition()), Float.valueOf(f / (f3 - f2)));
                return;
            }
        }
        UYP uyp3 = this.LJLIL;
        uyp3.LJLIL.invoke(Integer.valueOf(uyp3.getAdapterPosition()), Float.valueOf(0.0f));
    }
}
