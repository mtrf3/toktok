package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Syw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73870Syw<T> extends AbstractC73430Srq<T, T> {
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73946T0k LJLJJI;
    public final InterfaceC115714gR<? extends T> LJLJJL;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        if (this.LJLJJL == null) {
            C73868Syu c73868Syu = new C73868Syu(interfaceC116954iR, this.LJLILLLLZI, this.LJLJI, this.LJLJJI.LIZ());
            interfaceC116954iR.onSubscribe(c73868Syu);
            c73868Syu.LJLJJL.replace(c73868Syu.LJLJJI.LIZJ(new RunnableC73871Syx(0L, c73868Syu), c73868Syu.LJLILLLLZI, c73868Syu.LJLJI));
            this.LJLIL.LIZ(c73868Syu);
            return;
        }
        C73869Syv c73869Syv = new C73869Syv(interfaceC116954iR, this.LJLILLLLZI, this.LJLJI, this.LJLJJI.LIZ(), this.LJLJJL);
        interfaceC116954iR.onSubscribe(c73869Syv);
        c73869Syv.LJLJJL.replace(c73869Syv.LJLJJI.LIZJ(new RunnableC73871Syx(0L, c73869Syv), c73869Syv.LJLILLLLZI, c73869Syv.LJLJI));
        this.LJLIL.LIZ(c73869Syv);
    }

    public C73870Syw(AbstractC73672Svk<T> abstractC73672Svk, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k, InterfaceC115714gR<? extends T> interfaceC115714gR) {
        super(abstractC73672Svk);
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73946T0k;
        this.LJLJJL = interfaceC115714gR;
    }
}
