package Y;

import X.C3L4;
import X.C3L5;
import X.C3LK;
import X.C3Q9;
import X.C3TV;
import X.C55888Lwa;
import X.C63089OpR;
import X.C63120Opw;
import X.C76800UCe;
import X.C81243Gu;
import X.C84283Sm;
import X.EnumC96103pu;
import X.InterfaceC75532xp;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class ACallableS53S0300000_1 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS53S0300000_1 aCallableS53S0300000_1) {
        String str;
        String str2;
        C63120Opw LIZ = ((C3Q9) aCallableS53S0300000_1.l0).LIZ(((C3L4) aCallableS53S0300000_1.l1).LJFF());
        if (LIZ != null) {
            C3L4 c3l4 = (C3L4) aCallableS53S0300000_1.l1;
            InterfaceC75532xp interfaceC75532xp = (InterfaceC75532xp) aCallableS53S0300000_1.l2;
            C3TV.LIZ.getClass();
            Map<String, String> LIZIZ = C3TV.LIZIZ(c3l4);
            if (C84283Sm.LJIIIIZZ(LIZ)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZIZ.put("is_master", str);
            LIZIZ.put("chat_type", "group");
            LIZIZ.put("is_recommended_chat", CardStruct.IStatusCode.DEFAULT);
            if (C55888Lwa.LIZIZ.LJJI(true)) {
                C3L5 c3l5 = (C3L5) c3l4;
                if (c3l5 instanceof C3LK) {
                    str2 = "request";
                } else if (c3l5.LLIIII == EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY) {
                    str2 = "primary";
                } else {
                    str2 = "secondary";
                }
                LIZIZ.put("tab_name", str2);
            }
            interfaceC75532xp.LIZIZ("chat_show", LIZIZ);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public static final Object call$1(ACallableS53S0300000_1 aCallableS53S0300000_1) {
        List<C63089OpR> list = (List) aCallableS53S0300000_1.l0;
        List list2 = (List) aCallableS53S0300000_1.l2;
        List list3 = (List) aCallableS53S0300000_1.l1;
        for (C63089OpR c63089OpR : list) {
            if (!list2.contains(String.valueOf(c63089OpR.getUid()))) {
                C81243Gu c81243Gu = new C81243Gu(String.valueOf(c63089OpR.getUid()), c63089OpR.getSecUid());
                c81243Gu.setMember(c63089OpR);
                list3.add(c81243Gu);
            }
        }
        return (List) aCallableS53S0300000_1.l1;
    }

    public ACallableS53S0300000_1(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj3;
        this.l2 = obj2;
    }
}
