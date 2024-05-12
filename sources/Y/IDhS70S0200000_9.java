package Y;

import X.AbstractC73672Svk;
import X.C56745MOv;
import X.C56769MPt;
import X.C76732zl;
import X.HandlerC56918MVm;
import X.InterfaceC48038ItG;
import X.InterfaceC56756MPg;
import X.LY5;
import X.LYN;
import X.MP1;
import X.MP2;
import X.MRU;
import com.ss.android.ugc.aweme.feed.api.FollowFeedApi;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDhS70S0200000_9 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS70S0200000_9 iDhS70S0200000_9, Object it) {
        o.LJIIIZ(it, "it");
        ((HandlerC56918MVm) iDhS70S0200000_9.l0).LJFF().removeAll((List) iDhS70S0200000_9.l1);
        return it;
    }

    public static final Object apply$1(IDhS70S0200000_9 iDhS70S0200000_9, Object it) {
        o.LJIIIZ(it, "it");
        FollowFeedApi.LIZ.getClass();
        AbstractC73672Svk<FollowingInterestUsersResponse> interestUsers = LY5.LIZ().getInterestUsers(2, 0L, 2, ((C76732zl) iDhS70S0200000_9.l0).element);
        ((LYN) iDhS70S0200000_9.l1).LIZJ.set(true);
        return interestUsers;
    }

    public static final Object apply$2(IDhS70S0200000_9 iDhS70S0200000_9, Object obj) {
        C56769MPt it = (C56769MPt) obj;
        o.LJIIIZ(it, "it");
        Object obj2 = it.LIZ;
        if (((obj2 instanceof C56745MOv) || (obj2 instanceof MP1)) && ((AtomicInteger) iDhS70S0200000_9.l0).incrementAndGet() == 0) {
            MP2 mp2 = (MP2) iDhS70S0200000_9.l1;
            mp2.LJIIL.LJIIJJI(mp2.LJIIJJI.LJ());
            MP2 mp22 = (MP2) iDhS70S0200000_9.l1;
            mp22.LJIIL.LJIIJ(mp22.LJIIJJI.LJFF());
        }
        InterfaceC56756MPg<? extends MRU, DATA> interfaceC56756MPg = it.LIZ;
        return new C56769MPt(interfaceC56756MPg, interfaceC56756MPg.LIZIZ(), it.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDhS70S0200000_9(Object obj, HandlerC56918MVm handlerC56918MVm, List<String> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = handlerC56918MVm;
    }
}
