package X;

import androidx.lifecycle.Observer;

/* renamed from: X.JkW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50044JkW implements Observer<Integer> {
    public InterfaceC50046JkY LJLIL;
    public boolean LJLILLLLZI = true;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Integer num) {
        Integer num2 = num;
        if (num2 == null) {
            return;
        }
        if (num2.intValue() == 5) {
            this.LJLIL.LIZ();
            return;
        }
        if (num2.intValue() == 6) {
            this.LJLIL.LIZJ();
            return;
        }
        if (num2.intValue() == 3) {
            this.LJLIL.LIZIZ(false);
        } else if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
        } else {
            this.LJLIL.LIZIZ(true);
        }
    }
}
