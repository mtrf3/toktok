package X;

import Y.AfS1S0000100_6;
import Y.IDhS0S0100100_6;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.liked.api.FavoriteApi;
import com.ss.android.ugc.aweme.kids.liked.model.KidFeedItemList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.G4g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40922G4g implements InterfaceC36195EIl {
    public boolean LIZ = true;
    public long LIZIZ;
    public final FavoriteApi LIZJ;

    @Override // X.InterfaceC36195EIl
    public final AbstractC73672Svk<OSZ<List<Aweme>, Integer>> LJIIJJI() {
        if (!this.LIZ) {
            return AbstractC73672Svk.LJJIJIL(new OSZ(C61878OQg.INSTANCE, -1));
        }
        long currentTimeMillis = System.currentTimeMillis();
        return this.LIZJ.getFavoriteList(this.LIZIZ, 0L, 10).LJJL(T16.LIZ()).LJIJJ(new AfS1S0000100_6(currentTimeMillis, 1)).LJJIJL(new IDhS0S0100100_6(currentTimeMillis, this, 1));
    }

    public C40922G4g() {
        FavoriteApi.LIZ.getClass();
        this.LIZJ = (FavoriteApi) RetrofitFactory.LIZLLL().create(AFI.LIZ).create(FavoriteApi.class);
    }

    @Override // X.InterfaceC36195EIl
    public final C73805Sxt refresh() {
        long currentTimeMillis = System.currentTimeMillis();
        return this.LIZJ.getFavoriteList(0L, 0L, 20).LJJL(T16.LIZ()).LJIJJ(new AfS1S0000100_6(currentTimeMillis, 2)).LJJIJL(new IDhS0S0100100_6(currentTimeMillis, this, 2));
    }

    @Override // X.InterfaceC36195EIl
    public final boolean LJIILJJIL() {
        return this.LIZ;
    }

    public final OSZ<List<Aweme>, Integer> LIZ(KidFeedItemList kidFeedItemList) {
        boolean z = true;
        if (kidFeedItemList.getHasMore() != 1) {
            z = false;
        }
        this.LIZ = z;
        if (this.LIZIZ == kidFeedItemList.getMaxCursor()) {
            return new OSZ<>(C61878OQg.INSTANCE, -1);
        }
        this.LIZIZ = kidFeedItemList.getMaxCursor();
        List<Aweme> items = kidFeedItemList.getItems();
        if (items != null) {
            if (((Aweme) ListProtector.get(items, 0)).getLogPbBean() == null) {
                Iterator<Aweme> it = items.iterator();
                while (it.hasNext()) {
                    it.next().setLogPbBean(kidFeedItemList.getLogPb());
                }
            }
            if (items.isEmpty()) {
                return new OSZ<>(C61878OQg.INSTANCE, -1);
            }
            return new OSZ<>(items, 0);
        }
        return new OSZ<>(C61878OQg.INSTANCE, -1);
    }
}
