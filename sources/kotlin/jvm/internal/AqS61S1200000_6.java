package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C38805FKv;
import X.C39291FbT;
import X.C66532Q9g;
import X.C76800UCe;
import X.InterfaceC38802FKs;
import X.InterfaceC39301Fbd;
import X.InterfaceC65784Pro;
import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;

/* loaded from: classes7.dex */
public class AqS61S1200000_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS61S1200000_6 aqS61S1200000_6) {
        AppsFlyerLib.getInstance().init(aqS61S1200000_6.s0, new C39291FbT((InterfaceC39301Fbd) aqS61S1200000_6.l2), (Context) aqS61S1200000_6.l1);
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }

    public static final Object invoke$1(AqS61S1200000_6 aqS61S1200000_6) {
        AppsFlyerLib.getInstance().logEvent((Context) aqS61S1200000_6.l1, aqS61S1200000_6.s0, (Map) aqS61S1200000_6.l2);
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }

    public static final Object invoke$2(AqS61S1200000_6 aqS61S1200000_6) {
        InterfaceC65784Pro interfaceC65784Pro;
        System.currentTimeMillis();
        String str = aqS61S1200000_6.s0;
        if (str != null) {
            C38805FKv c38805FKv = C38805FKv.LIZ;
            c38805FKv.getClass();
            InterfaceC38802FKs interfaceC38802FKs = C38805FKv.LJFF;
            if (interfaceC38802FKs != null) {
                c38805FKv.LIZJ();
                interfaceC38802FKs.LIZIZ(str);
            }
        }
        InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) aqS61S1200000_6.l1;
        if ((interfaceC65784Pro2 == null || interfaceC65784Pro2.invoke() == null) && (interfaceC65784Pro = (InterfaceC65784Pro) aqS61S1200000_6.l2) != null) {
            interfaceC65784Pro.invoke();
        }
        String str2 = aqS61S1200000_6.s0;
        if (str2 != null) {
            C38805FKv.LIZ.getClass();
            InterfaceC38802FKs interfaceC38802FKs2 = C38805FKv.LJFF;
            if (interfaceC38802FKs2 != null) {
                System.currentTimeMillis();
                interfaceC38802FKs2.LIZ(str2);
                return C76800UCe.LIZ;
            }
        }
        return null;
    }

    public static final Object invoke$3(AqS61S1200000_6 aqS61S1200000_6) {
        InterfaceC65784Pro interfaceC65784Pro;
        System.currentTimeMillis();
        String str = aqS61S1200000_6.s0;
        if (str != null) {
            C38805FKv c38805FKv = C38805FKv.LIZ;
            c38805FKv.getClass();
            InterfaceC38802FKs interfaceC38802FKs = C38805FKv.LJFF;
            if (interfaceC38802FKs != null) {
                c38805FKv.LIZJ();
                interfaceC38802FKs.LIZIZ(str);
            }
        }
        InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) aqS61S1200000_6.l1;
        if ((interfaceC65784Pro2 == null || interfaceC65784Pro2.invoke() == null) && (interfaceC65784Pro = (InterfaceC65784Pro) aqS61S1200000_6.l2) != null) {
            interfaceC65784Pro.invoke();
        }
        String str2 = aqS61S1200000_6.s0;
        if (str2 != null) {
            C38805FKv.LIZ.getClass();
            InterfaceC38802FKs interfaceC38802FKs2 = C38805FKv.LJFF;
            if (interfaceC38802FKs2 != null) {
                System.currentTimeMillis();
                interfaceC38802FKs2.LIZ(str2);
                return C76800UCe.LIZ;
            }
        }
        return null;
    }

    public static final Object invoke$4(AqS61S1200000_6 aqS61S1200000_6) {
        Object obj;
        System.currentTimeMillis();
        String str = aqS61S1200000_6.s0;
        if (str != null) {
            C38805FKv c38805FKv = C38805FKv.LIZ;
            c38805FKv.getClass();
            InterfaceC38802FKs interfaceC38802FKs = C38805FKv.LJFF;
            if (interfaceC38802FKs != null) {
                c38805FKv.LIZJ();
                interfaceC38802FKs.LIZIZ(str);
            }
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS61S1200000_6.l1;
        if (interfaceC65784Pro == null || (obj = interfaceC65784Pro.invoke()) == null) {
            InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) aqS61S1200000_6.l2;
            if (interfaceC65784Pro2 != null) {
                obj = interfaceC65784Pro2.invoke();
            } else {
                obj = null;
            }
        }
        String str2 = aqS61S1200000_6.s0;
        if (str2 != null) {
            C38805FKv.LIZ.getClass();
            InterfaceC38802FKs interfaceC38802FKs2 = C38805FKv.LJFF;
            if (interfaceC38802FKs2 != null) {
                System.currentTimeMillis();
                interfaceC38802FKs2.LIZ(str2);
            }
        }
        return obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS61S1200000_6(Context context, Context context2, String str, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.l1 = context;
        this.s0 = context2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S1200000_6(String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = interfaceC65784Pro;
        this.l2 = interfaceC65784Pro2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS61S1200000_6(String str, Context context, InterfaceC39301Fbd interfaceC39301Fbd, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = context;
        this.l2 = interfaceC39301Fbd;
    }
}
