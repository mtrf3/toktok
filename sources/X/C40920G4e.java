package X;

import Y.AfS1S0000100_6;
import Y.IDhS0S0100100_6;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.liked.api.FavoriteApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.G4e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40920G4e implements OB7 {
    public final List<Aweme> LIZ;
    public final FavoriteApi LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;

    @Override // X.OB7
    public final boolean LIZ() {
        return false;
    }

    @Override // X.OB7
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.OB7
    public final AbstractC73672Svk<OSZ<List<Aweme>, Integer>> LIZJ() {
        return AbstractC73672Svk.LJJIJIL(new OSZ(this.LIZ, 0));
    }

    @Override // X.OB7
    public final AbstractC73672Svk<OSZ<List<Aweme>, Integer>> refresh() {
        return AbstractC73672Svk.LJJIJIL(new OSZ(C61878OQg.INSTANCE, -1));
    }

    @Override // X.OB7
    public final C73805Sxt LJIIJJI() {
        long currentTimeMillis = System.currentTimeMillis();
        return this.LIZIZ.getFavoriteList(this.LIZJ, 0L, 10).LJJL(T16.LIZ()).LJIJJ(new AfS1S0000100_6(currentTimeMillis, 0)).LJJIJL(new IDhS0S0100100_6(currentTimeMillis, this, 0));
    }

    @Override // X.OB7
    public final boolean LJIILJJIL() {
        return this.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C40920G4e(List<? extends Aweme> awemeList) {
        o.LJIIIZ(awemeList, "awemeList");
        this.LIZ = awemeList;
        FavoriteApi.LIZ.getClass();
        this.LIZIZ = (FavoriteApi) RetrofitFactory.LIZLLL().create(AFI.LIZ).create(FavoriteApi.class);
        this.LIZJ = awemeList.size();
        this.LIZLLL = true;
    }
}
