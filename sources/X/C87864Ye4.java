package X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.Ye4, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87864Ye4 extends AbstractC87863Ye3 {
    @Override // X.AbstractC87863Ye3
    public final int LIZJ() {
        return 2;
    }

    @Override // X.AbstractC87863Ye3
    public final void LIZ() {
        ((Handler) this.LIZIZ.LIZLLL(new Object[0])).removeCallbacks(this.LJFF);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZLLL);
        LIZ.append("cancelPoll");
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC87863Ye3
    public final void LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZLLL);
        LIZ.append("start send poll");
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
        this.LIZJ.LJJJJI(false);
    }

    @Override // X.AbstractC87863Ye3
    public final boolean LIZLLL(C67101QVd c67101QVd) {
        List<QVZ> list;
        if (c67101QVd != null && (list = c67101QVd.topics) != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public C87864Ye4(String str, InterfaceC87871YeB interfaceC87871YeB, InterfaceC67096QUy interfaceC67096QUy, AbstractC48851JFf abstractC48851JFf, C87869Ye9 c87869Ye9) {
        super(str, interfaceC87871YeB, interfaceC67096QUy, abstractC48851JFf, c87869Ye9);
    }
}
