package X;

import Y.AfS66S0100000_14;
import Y.IDhS107S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQQ extends AbstractC65781Prl implements InterfaceC88471Ynr<AbstractC73672Svk<WQO>, AbstractC73672Svk<WQO>, AbstractC73672Svk<WQO>> {
    public final /* synthetic */ WQW LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WQQ(WQW wqw, boolean z, int i) {
        super(2);
        this.LJLIL = wqw;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final AbstractC73672Svk<WQO> invoke(AbstractC73672Svk<WQO> abstractC73672Svk, AbstractC73672Svk<WQO> abstractC73672Svk2) {
        AbstractC73672Svk<WQO> fetcher = abstractC73672Svk;
        AbstractC73672Svk<WQO> cache = abstractC73672Svk2;
        o.LJIIIZ(fetcher, "fetcher");
        o.LJIIIZ(cache, "cache");
        if (this.LJLILLLLZI) {
            C82891Wg3.LIZLLL().d("viki filter, DefaultFilterRepository#fetchDataWithReturn -> withCache");
        }
        return cache.LJJIII(new IDhS107S0100000_14(this, 9), false).LJJJJI(C73536StY.LJLIL).LJJLI(fetcher.LJIJJLI(new AfS66S0100000_14(this, 41)));
    }
}
