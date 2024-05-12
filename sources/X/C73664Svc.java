package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Svc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73664Svc<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ C73663Svb LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ Integer LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public C73664Svc(C73663Svb c73663Svb, int i, int i2, Integer num, String str) {
        this.LJLIL = c73663Svb;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = num;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        Throwable t = (Throwable) obj;
        o.LJIIIZ(t, "t");
        if (!MH6.LIZ) {
            MH6.LIZ = true;
            return this.LJLIL.LIZJ.getTrendingTopicsV2(this.LJLILLLLZI, this.LJLJI, 0, this.LJLJJI, this.LJLJJL);
        }
        return AbstractC73638SvC.LJIILJJIL(t);
    }
}
