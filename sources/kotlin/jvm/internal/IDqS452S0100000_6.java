package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C35744E1c;
import X.C38930FPq;
import X.C38934FPu;
import X.C39973FmT;
import X.C76800UCe;
import X.EnumC39958FmE;
import X.FUW;
import X.InterfaceC37120EhY;
import X.InterfaceC38186Eyk;
import X.InterfaceC38189Eyn;
import X.InterfaceC38202Ez0;
import X.InterfaceC38203Ez1;
import X.InterfaceC38217EzF;
import X.InterfaceC38932FPs;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;
import X.JVO;
import X.JVP;
import X.ORZ;
import X.X1D;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.b;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class IDqS452S0100000_6 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS452S0100000_6(C38934FPu c38934FPu, int i) {
        super(4);
        this.$t = i;
        this.l0 = c38934FPu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS452S0100000_6(JVO jvo, int i) {
        super(4);
        this.$t = i;
        this.l0 = jvo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS452S0100000_6(JVP jvp, int i) {
        super(4);
        this.$t = i;
        this.l0 = jvp;
    }

    public static final Object invoke$0(IDqS452S0100000_6 iDqS452S0100000_6, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        C35744E1c LIZ;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        if (((Boolean) obj4).booleanValue()) {
            return Boolean.TRUE;
        }
        RecyclerView.RecycledViewPool recycledViewPool = ((JVP) iDqS452S0100000_6.l0).LJLIL.getRecycledViewPool();
        o.LJIIIIZZ(recycledViewPool, "mRecyclerView.recycledViewPool");
        int recycledViewCount = recycledViewPool.getRecycledViewCount(intValue) + intValue2;
        if (recycledViewPool instanceof FUW) {
            FUW fuw = (FUW) recycledViewPool;
            synchronized (fuw) {
                z = true;
                LIZ = fuw.LIZ(1);
            }
            if (recycledViewCount < LIZ.LIZ - 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(IDqS452S0100000_6 iDqS452S0100000_6, Object funcName, Object params, Object obj, Object obj2) {
        String str;
        InterfaceC38189Eyn callback = (InterfaceC38189Eyn) obj;
        InterfaceC88472Yns reject = (InterfaceC88472Yns) obj2;
        o.LJIIJ(funcName, "funcName");
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        o.LJIIJ(reject, "reject");
        C38934FPu c38934FPu = (C38934FPu) iDqS452S0100000_6.l0;
        List<? extends String> invoke = C38934FPu.LJLLI.invoke(funcName);
        c38934FPu.getClass();
        if (!invoke.isEmpty()) {
            str = (String) ListProtector.get(invoke, 0);
        } else {
            str = "";
        }
        o.LJI(str);
        if (str.length() == 0) {
            new JSONObject();
        } else {
            InterfaceC38217EzF ti = c38934FPu.ti(str);
            if (ti == null) {
                new JSONObject();
            } else if (ti instanceof InterfaceC38186Eyk) {
                try {
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    new JSONObject();
                }
            }
        }
        if (!c38934FPu.LJLJJI) {
            int size = invoke.size();
            if (size != 0) {
                if (size != 1) {
                    String str2 = (String) ORZ.LJLLJ(invoke);
                    InterfaceC38932FPs interfaceC38932FPs = (InterfaceC38932FPs) ((LinkedHashMap) c38934FPu.LJLIL).get(str2);
                    if (interfaceC38932FPs == 0) {
                        reject.invoke(new C38930FPq(str2));
                    } else {
                        c38934FPu.LJLJL = c38934FPu.LJLJL;
                        interfaceC38932FPs.k7(invoke.subList(1, invoke.size()), params, callback, reject);
                    }
                } else {
                    String str3 = (String) ORZ.LJLLJ(invoke);
                    InterfaceC38217EzF interfaceC38217EzF = (InterfaceC38217EzF) ((LinkedHashMap) c38934FPu.Zd()).get(str3);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("call Lynx/RN bridge method named ");
                    LIZ.append(str3);
                    LIZ.append(" with parameters ");
                    LIZ.append(params);
                    C39973FmT.LIZIZ(c38934FPu, X1D.LIZIZ(LIZ), EnumC39958FmE.D, null, 4);
                    SystemClock.elapsedRealtime();
                    if (interfaceC38217EzF == null) {
                        reject.invoke(new C38930FPq(str3));
                    } else if (interfaceC38217EzF instanceof InterfaceC38186Eyk) {
                        InterfaceC88472Yns<? super InterfaceC38217EzF, C76800UCe> interfaceC88472Yns = c38934FPu.LJLJL;
                        if (interfaceC88472Yns != null) {
                            interfaceC88472Yns.invoke(interfaceC38217EzF);
                        }
                        ((InterfaceC38186Eyk) interfaceC38217EzF).handle((JSONObject) params, (InterfaceC37120EhY) callback);
                    } else if (interfaceC38217EzF instanceof InterfaceC38202Ez0) {
                        InterfaceC88472Yns<? super InterfaceC38217EzF, C76800UCe> interfaceC88472Yns2 = c38934FPu.LJLJL;
                        if (interfaceC88472Yns2 != null) {
                            interfaceC88472Yns2.invoke(interfaceC38217EzF);
                        }
                        InterfaceC38202Ez0 interfaceC38202Ez0 = (InterfaceC38202Ez0) interfaceC38217EzF;
                        if (interfaceC38202Ez0 != null) {
                            b.LIZ(interfaceC38202Ez0, params, (InterfaceC38203Ez1) callback);
                        }
                    }
                }
            } else {
                reject.invoke(new C38930FPq("[unknown]"));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS452S0100000_6 iDqS452S0100000_6, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        C35744E1c LIZ;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        if (((Boolean) obj4).booleanValue()) {
            return Boolean.TRUE;
        }
        RecyclerView.RecycledViewPool recycledViewPool = ((JVO) iDqS452S0100000_6.l0).LJLIL.getRecycledViewPool();
        o.LJIIIIZZ(recycledViewPool, "rv.recycledViewPool");
        int recycledViewCount = recycledViewPool.getRecycledViewCount(intValue) + intValue2;
        if (recycledViewPool instanceof FUW) {
            FUW fuw = (FUW) recycledViewPool;
            synchronized (fuw) {
                z = true;
                LIZ = fuw.LIZ(1);
            }
            if (recycledViewCount < LIZ.LIZ - 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }
}
