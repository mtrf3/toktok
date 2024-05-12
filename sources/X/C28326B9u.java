package X;

import Y.ARunnableS41S0100000_5;
import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* renamed from: X.B9u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28326B9u implements InterfaceC75158Tec {
    public final /* synthetic */ C28328B9w LJLIL;

    @Override // X.InterfaceC75158Tec
    public final void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public final void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
    }

    public C28326B9u(C28328B9w c28328B9w) {
        this.LJLIL = c28328B9w;
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        if (o.LJ(this.LJLIL.itemView.getTag(), 2)) {
            C28328B9w c28328B9w = this.LJLIL;
            c28328B9w.itemView.post(new ARunnableS41S0100000_5(c28328B9w, 200));
        }
    }
}
