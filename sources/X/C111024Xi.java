package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: X.4Xi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C111024Xi extends LinearLayout {
    public C182567Em LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public long LJLJJL;
    public boolean LJLJJLL;

    public C182567Em getKeyBoardObservable() {
        return this.LJLIL;
    }

    public void setKeyBoardObservable(C182567Em c182567Em) {
        this.LJLIL = c182567Em;
    }

    public C111024Xi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJI = -1;
        this.LJLIL = new C182567Em();
    }

    public final void LIZ(int i, boolean z) {
        if (C1DH.LJJIIZI()) {
            this.LJLILLLLZI++;
        }
        if (z && i != this.LJLJJI) {
            this.LJLJJI = i;
            this.LJLJJL = System.nanoTime() / 1000000;
            this.LJLJJLL = true;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LJLJJLL) {
            if ((System.nanoTime() / 1000000) - this.LJLJJL > 1000) {
                this.LJLJJLL = false;
            } else {
                super.onMeasure(i, i2);
                return;
            }
        }
        int i3 = this.LJLJI;
        int i4 = this.LJLILLLLZI;
        if (i3 == i4) {
            C182567Em c182567Em = this.LJLIL;
            if (c182567Em != null) {
                c182567Em.LIZIZ(i2, getContext());
            }
        } else {
            this.LJLJI = i4;
        }
        super.onMeasure(i, i2);
    }
}
