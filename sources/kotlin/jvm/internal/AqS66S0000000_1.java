package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C32I;
import X.C73920Szk;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.OSZ;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class AqS66S0000000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S0000000_1(int i) {
        super(1);
        this.$t = i;
    }

    public final List<OSZ<String, User>> invoke$0(List<? extends User> it) {
        o.LJIIJ(it, "it");
        ArrayList arrayList = new ArrayList(C32I.LJJL(it, 10));
        for (User user : it) {
            arrayList.add(new OSZ(user.getUid(), user));
        }
        return arrayList;
    }

    public final void invoke$1(C73920Szk<? extends Object, List<User>, String, User> receiver) {
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = new AqS66S0000000_1(this, 0);
    }

    public final List<OSZ<String, User>> invoke$2(List<? extends User> it) {
        o.LJIIJ(it, "it");
        ArrayList arrayList = new ArrayList(C32I.LJJL(it, 10));
        for (User user : it) {
            arrayList.add(new OSZ(user.getUid(), user));
        }
        return arrayList;
    }

    public final void invoke$3(C73920Szk<? extends Object, List<User>, String, User> receiver) {
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = new AqS66S0000000_1(this, 2);
    }

    public final List<OSZ<String, User>> invoke$4(List<? extends User> it) {
        o.LJIIJ(it, "it");
        ArrayList arrayList = new ArrayList(C32I.LJJL(it, 10));
        for (User user : it) {
            arrayList.add(new OSZ(user.getUid(), user));
        }
        return arrayList;
    }

    public final void invoke$5(C73920Szk<? extends Object, List<User>, String, User> receiver) {
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = new AqS66S0000000_1(this, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S0000000_1(ActivityC45651qj activityC45651qj, int i) {
        super(1);
        this.$t = i;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS66S0000000_1 aqS66S0000000_1, Object obj) {
        return aqS66S0000000_1.invoke$0((List) obj);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS66S0000000_1 aqS66S0000000_1, Object obj) {
        aqS66S0000000_1.invoke$1((C73920Szk) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS66S0000000_1 aqS66S0000000_1, Object obj) {
        return aqS66S0000000_1.invoke$2((List) obj);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AqS66S0000000_1 aqS66S0000000_1, Object obj) {
        aqS66S0000000_1.invoke$3((C73920Szk) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AqS66S0000000_1 aqS66S0000000_1, Object obj) {
        return aqS66S0000000_1.invoke$4((List) obj);
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AqS66S0000000_1 aqS66S0000000_1, Object obj) {
        aqS66S0000000_1.invoke$5((C73920Szk) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS66S0000000_1 aqS66S0000000_1, Object obj) {
        ((Boolean) obj).booleanValue();
        return Boolean.FALSE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S0000000_1(AqS66S0000000_1 aqS66S0000000_1, int i) {
        super(1);
        this.$t = i;
    }
}
