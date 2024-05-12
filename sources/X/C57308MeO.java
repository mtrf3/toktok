package X;

import Y.IDuS81S0200000_12;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS172S0200000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MeO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57308MeO extends AbstractC65736Pr2<List<? extends Aweme>, C57309MeP> {
    public final InterfaceC54817LfJ LJLJI;
    public final AtomicBoolean LJLJJI;

    public C57308MeO(C54809LfB cache) {
        o.LJIIIZ(cache, "cache");
        this.LJLJI = cache;
        this.LJLJJI = new AtomicBoolean(true);
    }

    public final C73805Sxt LJII(C57309MeP c57309MeP) {
        XGR LIZIZ = XGJ.LIZ().LIZIZ(new C57296MeC((List) c57309MeP.LJLILLLLZI, this.LJLJJI));
        InterfaceC54817LfJ interfaceC54817LfJ = this.LJLJI;
        AqS172S0200000_9 aqS172S0200000_9 = new AqS172S0200000_9(this, c57309MeP, 21);
        C57303MeJ c57303MeJ = C57303MeJ.LJLIL;
        if (o.LJ(Aweme.class, C57295MeB.class) || c57303MeJ != null) {
            LIZIZ.LIZ(new C84569XGz(new C57354Mf8(interfaceC54817LfJ, aqS172S0200000_9, c57303MeJ, C57295MeB.class, Aweme.class)));
            C78977Uz7.LJJIJL(LIZIZ, (EnumC199577sP) c57309MeP.LJLJI);
            return AbstractC73672Svk.LJIIJ(new IDuS81S0200000_12(MBB.INSTANCE, new C57294MeA(LIZIZ.LIZIZ(), this, c57309MeP), 2)).LJJIJL(C78923UyF.LJLIL);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("po is ");
        LIZ.append(Aweme.class);
        LIZ.append(", do is ");
        LIZ.append(C57295MeB.class);
        LIZ.append(", please pass the onFetchCache and onQueryNet param to map cache");
        String LIZIZ2 = X1D.LIZIZ(LIZ);
        LIZIZ2.toString();
        throw new IllegalStateException(LIZIZ2);
    }
}
