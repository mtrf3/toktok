package X;

import java.util.concurrent.Callable;

/* renamed from: X.QrB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class CallableC68293QrB implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ BinderC68232QqC LJLILLLLZI;

    public CallableC68293QrB(BinderC68232QqC binderC68232QqC, String str) {
        this.LJLILLLLZI = binderC68232QqC;
        this.LJLIL = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.LJLILLLLZI.LJLIL.LJFF();
        C68242QqM c68242QqM = this.LJLILLLLZI.LJLIL.LIZJ;
        C68241QqL.LJJIJIIJI(c68242QqM);
        return c68242QqM.LJJIJL(this.LJLIL);
    }
}
