package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.1Jm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30981Jm implements C0R5 {
    public final C81120Vsa LIZ;

    public C30981Jm(Context context) {
        this.LIZ = new C81120Vsa(context);
    }

    @Override // X.C0R5
    public final void LIZ(int i, ViewGroup viewGroup, final C0R6 c0r6) {
        C81120Vsa c81120Vsa = this.LIZ;
        InterfaceC81123Vsd interfaceC81123Vsd = new InterfaceC81123Vsd() { // from class: X.1Jl
            @Override // X.InterfaceC81123Vsd
            public final void onInflateFinished(View view, int i2, ViewGroup viewGroup2) {
                o.LJIIIZ(view, "view");
                C0R6.this.LIZ(view);
            }
        };
        C81122Vsc LIZIZ = c81120Vsa.LIZJ.LJLILLLLZI.LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = new C81122Vsc();
        }
        LIZIZ.LIZ = c81120Vsa;
        LIZIZ.LIZJ = i;
        LIZIZ.LIZIZ = viewGroup;
        LIZIZ.LJ = interfaceC81123Vsd;
        C81121Vsb c81121Vsb = c81120Vsa.LIZJ;
        c81121Vsb.getClass();
        try {
            c81121Vsb.LJLIL.put(LIZIZ);
        } catch (InterruptedException e) {
            throw new RuntimeException("Failed to enqueue async inflate request", e);
        }
    }
}
