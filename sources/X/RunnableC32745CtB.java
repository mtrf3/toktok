package X;

import kotlin.jvm.internal.AqS62S0110000_5;

/* renamed from: X.CtB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC32745CtB implements Runnable {
    public final /* synthetic */ android.net.Uri LJLIL;
    public final /* synthetic */ InterfaceC73573Su9<ZCF> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJI;

    public RunnableC32745CtB(android.net.Uri uri, C73433Srt c73433Srt, long j, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = uri;
        this.LJLILLLLZI = c73433Srt;
        this.LJLJI = j;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            boolean LJ = C15620jO.LJ(this.LJLIL);
            this.LJLILLLLZI.onNext(new C32744CtA(LJ, this.LJLJI));
            this.LJLILLLLZI.onComplete();
            C29306Beo.LJJJIL(new AqS62S0110000_5((InterfaceC88472Yns) this.LJLJJI, (InterfaceC88472Yns<? super Boolean, C76800UCe>) LJ, true));
        } finally {
            if (LIZ) {
            }
        }
    }
}
