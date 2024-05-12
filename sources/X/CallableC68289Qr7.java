package X;

import java.util.concurrent.Callable;

/* renamed from: X.Qr7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class CallableC68289Qr7 implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ BinderC68232QqC LJLJJI;

    public CallableC68289Qr7(BinderC68232QqC binderC68232QqC, String str, String str2, String str3) {
        this.LJLJJI = binderC68232QqC;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.LJLJJI.LJLIL.LJFF();
        C68242QqM c68242QqM = this.LJLJJI.LJLIL.LIZJ;
        C68241QqL.LJJIJIIJI(c68242QqM);
        return c68242QqM.LJJIJLIJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }
}
