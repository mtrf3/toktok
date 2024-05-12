package X;

import Y.ALAdapterS4S0200000_5;
import android.animation.Animator;

/* renamed from: X.Bq6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30006Bq6<T> implements InterfaceC66992k3 {
    public final /* synthetic */ C29701Eo LJLIL;
    public final /* synthetic */ ALAdapterS4S0200000_5 LJLILLLLZI;

    public C30006Bq6(C29701Eo c29701Eo, ALAdapterS4S0200000_5 aLAdapterS4S0200000_5) {
        this.LJLIL = c29701Eo;
        this.LJLILLLLZI = aLAdapterS4S0200000_5;
    }

    @Override // X.InterfaceC66992k3
    public final void subscribe(InterfaceC65052gv<Animator.AnimatorListener> interfaceC65052gv) {
        this.LJLIL.addAnimatorListener(this.LJLILLLLZI);
    }
}
