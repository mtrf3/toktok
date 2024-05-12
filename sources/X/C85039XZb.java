package X;

import Y.AfS6S0000100_15;
import Y.IDhS2S0100100_15;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.discovery.api.DetailApi;
import com.ss.android.ugc.aweme.kids.discovery.model.KDisocverDetailList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XZb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85039XZb implements InterfaceC36195EIl {
    public final String LIZ;
    public boolean LIZIZ = true;
    public int LIZJ;

    @Override // X.InterfaceC36195EIl
    public final AbstractC73672Svk<OSZ<List<Aweme>, Integer>> LJIIJJI() {
        if (!this.LIZIZ) {
            return AbstractC73672Svk.LJJIJIL(new OSZ(C61878OQg.INSTANCE, -1));
        }
        long currentTimeMillis = System.currentTimeMillis();
        String challengeId = this.LIZ;
        int i = this.LIZJ;
        o.LJIIIZ(challengeId, "challengeId");
        return DetailApi.LIZ.getDetailList(challengeId, i, 8).LJJL(T16.LIZ()).LJIJJ(new AfS6S0000100_15(currentTimeMillis, 0)).LJJIJL(new IDhS2S0100100_15(currentTimeMillis, this, 0));
    }

    @Override // X.InterfaceC36195EIl
    public final C73805Sxt refresh() {
        long currentTimeMillis = System.currentTimeMillis();
        String challengeId = this.LIZ;
        o.LJIIIZ(challengeId, "challengeId");
        return DetailApi.LIZ.getDetailList(challengeId, 0, 10).LJJL(T16.LIZ()).LJIJJ(new AfS6S0000100_15(currentTimeMillis, 1)).LJJIJL(new IDhS2S0100100_15(currentTimeMillis, this, 1));
    }

    @Override // X.InterfaceC36195EIl
    public final boolean LJIILJJIL() {
        return this.LIZIZ;
    }

    public C85039XZb(String str) {
        this.LIZ = str;
    }

    public final OSZ<List<Aweme>, Integer> LIZ(KDisocverDetailList kDisocverDetailList) {
        int i;
        boolean z = true;
        if (kDisocverDetailList.hasMore != 1) {
            z = false;
        }
        this.LIZIZ = z;
        int i2 = this.LIZJ;
        int i3 = kDisocverDetailList.cursor;
        if (i2 >= i3) {
            this.LIZIZ = false;
            return new OSZ<>(C61878OQg.INSTANCE, -1);
        }
        List<? extends Aweme> list = kDisocverDetailList.items;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        this.LIZJ = Math.max(i3, i2 + i);
        List<? extends Aweme> list2 = kDisocverDetailList.items;
        if (list2 != null) {
            if (((Aweme) ListProtector.get(list2, 0)).getLogPbBean() == null) {
                Iterator<? extends Aweme> it = list2.iterator();
                while (it.hasNext()) {
                    it.next().setLogPbBean(kDisocverDetailList.logPbBean);
                }
            }
            if (list2.isEmpty()) {
                return new OSZ<>(C61878OQg.INSTANCE, -1);
            }
            return new OSZ<>(list2, 0);
        }
        return new OSZ<>(C61878OQg.INSTANCE, -1);
    }
}
