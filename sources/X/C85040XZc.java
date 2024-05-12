package X;

import Y.AfS6S0000100_15;
import Y.IDhS2S0100100_15;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.discovery.api.DetailApi;
import com.ss.android.ugc.aweme.kids.discovery.model.KDisocverDetailList;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XZc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85040XZc implements OB7 {
    public final String LIZ;
    public final boolean LIZIZ;
    public int LIZJ;

    @Override // X.OB7
    public final boolean LIZ() {
        return false;
    }

    @Override // X.OB7
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.OB7
    public final boolean LJIILJJIL() {
        return true;
    }

    @Override // X.OB7
    public final AbstractC73672Svk<OSZ<List<Aweme>, Integer>> LIZJ() {
        List<Aweme> list;
        List<Aweme> list2;
        if (this.LIZIZ) {
            WeakReference<List<Aweme>> weakReference = G4Y.LIZ;
            if (weakReference != null && (list = weakReference.get()) != null && (!list.isEmpty())) {
                WeakReference<List<Aweme>> weakReference2 = G4Y.LIZ;
                if (weakReference2 == null || (list2 = weakReference2.get()) == null) {
                    list2 = C61878OQg.INSTANCE;
                }
                return AbstractC73672Svk.LJJIJIL(new OSZ(list2, 0));
            }
            return AbstractC73672Svk.LJJIJIL(new OSZ(C61878OQg.INSTANCE, -1));
        }
        long currentTimeMillis = System.currentTimeMillis();
        String challengeId = this.LIZ;
        o.LJIIIZ(challengeId, "challengeId");
        return DetailApi.LIZ.getDetailList(challengeId, 0, 10).LJJL(T16.LIZ()).LJIJJ(new AfS6S0000100_15(currentTimeMillis, 2)).LJJIJL(new IDhS2S0100100_15(currentTimeMillis, this, 2));
    }

    @Override // X.OB7
    public final AbstractC73672Svk<OSZ<List<Aweme>, Integer>> refresh() {
        return AbstractC73672Svk.LJJIJIL(new OSZ(C61878OQg.INSTANCE, -1));
    }

    @Override // X.OB7
    public final C73805Sxt LJIIJJI() {
        long currentTimeMillis = System.currentTimeMillis();
        String challengeId = this.LIZ;
        int i = this.LIZJ;
        o.LJIIIZ(challengeId, "challengeId");
        return DetailApi.LIZ.getDetailList(challengeId, i, 8).LJJL(T16.LIZ()).LJIJJ(new AfS6S0000100_15(currentTimeMillis, 3)).LJJIJL(new IDhS2S0100100_15(currentTimeMillis, this, 3));
    }

    public final OSZ<List<Aweme>, Integer> LIZLLL(KDisocverDetailList kDisocverDetailList) {
        int i = this.LIZJ;
        int i2 = kDisocverDetailList.cursor;
        if (i == i2) {
            return new OSZ<>(C61878OQg.INSTANCE, -1);
        }
        this.LIZJ = i2;
        List<? extends Aweme> list = kDisocverDetailList.items;
        if (list != null) {
            if (((Aweme) ListProtector.get(list, 0)).getLogPbBean() == null) {
                Iterator<? extends Aweme> it = list.iterator();
                while (it.hasNext()) {
                    it.next().setLogPbBean(kDisocverDetailList.logPbBean);
                }
            }
            if (list.isEmpty()) {
                return new OSZ<>(C61878OQg.INSTANCE, -1);
            }
            return new OSZ<>(list, 0);
        }
        return new OSZ<>(C61878OQg.INSTANCE, -1);
    }

    public C85040XZc(String challengeId, boolean z) {
        o.LJIIIZ(challengeId, "challengeId");
        this.LIZ = challengeId;
        this.LIZIZ = z;
    }
}
