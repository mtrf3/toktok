package X;

import Y.IDfS13S0300000_9;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: X.MeA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57294MeA implements InterfaceC65462ha<AbstractC57306MeM<List<? extends Aweme>>> {
    public final /* synthetic */ InterfaceC65462ha LJLIL;
    public final /* synthetic */ C57308MeO LJLILLLLZI;
    public final /* synthetic */ C57309MeP LJLJI;

    @Override // X.InterfaceC65462ha
    public final Object collect(InterfaceC64672gJ<? super AbstractC57306MeM<List<? extends Aweme>>> interfaceC64672gJ, InterfaceC67352kd interfaceC67352kd) {
        Object collect = this.LJLIL.collect(new IDfS13S0300000_9(interfaceC64672gJ, this.LJLILLLLZI, this.LJLJI, 1), interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public C57294MeA(InterfaceC65462ha interfaceC65462ha, C57308MeO c57308MeO, C57309MeP c57309MeP) {
        this.LJLIL = interfaceC65462ha;
        this.LJLILLLLZI = c57308MeO;
        this.LJLJI = c57309MeP;
    }
}
