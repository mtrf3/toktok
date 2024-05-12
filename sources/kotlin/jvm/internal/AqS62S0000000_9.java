package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C32I;
import X.InterfaceC88471Ynr;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class AqS62S0000000_9 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS62S0000000_9(AqS69S0000000_9 aqS69S0000000_9, int i) {
        super(2);
        this.$t = i;
    }

    public final List<User> invoke$0(User user, List<? extends User> curV) {
        o.LJIIJ(curV, "curV");
        ArrayList arrayList = new ArrayList(C32I.LJJL(curV, 10));
        for (User user2 : curV) {
            if (o.LJ(user2.getUid(), user.getUid()) && (user instanceof Object) && user != null) {
                user2 = user;
            }
            arrayList.add(user2);
        }
        return arrayList;
    }

    public final List<User> invoke$1(User user, List<? extends User> curV) {
        o.LJIIJ(curV, "curV");
        ArrayList arrayList = new ArrayList(C32I.LJJL(curV, 10));
        for (User user2 : curV) {
            if (o.LJ(user2.getUid(), user.getUid()) && (user instanceof Object) && user != null) {
                user2 = user;
            }
            arrayList.add(user2);
        }
        return arrayList;
    }

    public final List<User> invoke$2(User user, List<? extends User> curV) {
        o.LJIIJ(curV, "curV");
        ArrayList arrayList = new ArrayList(C32I.LJJL(curV, 10));
        for (User user2 : curV) {
            if (o.LJ(user2.getUid(), user.getUid()) && (user instanceof Object) && user != null) {
                user2 = user;
            }
            arrayList.add(user2);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS62S0000000_9 aqS62S0000000_9, Object obj, Object obj2) {
        return aqS62S0000000_9.invoke$0(obj, (List) obj2);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS62S0000000_9 aqS62S0000000_9, Object obj, Object obj2) {
        return aqS62S0000000_9.invoke$1(obj, (List) obj2);
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS62S0000000_9 aqS62S0000000_9, Object obj, Object obj2) {
        return aqS62S0000000_9.invoke$2(obj, (List) obj2);
    }
}
