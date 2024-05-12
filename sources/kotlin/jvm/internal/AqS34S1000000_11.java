package kotlin.jvm.internal;

import X.AEL;
import X.AbstractC65781Prl;
import X.C66324Q1g;
import X.C68517Qun;
import X.C68710Qxu;
import X.C76800UCe;
import X.FMX;
import X.InterfaceC88472Yns;
import X.POW;
import X.X1D;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import java.io.File;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AqS34S1000000_11 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;

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
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(int i) {
        C68517Qun c68517Qun = C68517Qun.LIZ;
        String userId = this.s0;
        o.LJIIIIZZ(userId, "userId");
        c68517Qun.LIZJ(userId, null);
        C68710Qxu c68710Qxu = C68710Qxu.LIZ;
        String userId2 = this.s0;
        o.LJIIIIZZ(userId2, "userId");
        synchronized (c68710Qxu) {
            Set<String> set = C68710Qxu.LIZJ;
            set.remove(userId2);
            ((Keva) C68710Qxu.LIZIZ.getValue()).storeStringSet("refresh_key", set);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS34S1000000_11(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS34S1000000_11 aqS34S1000000_11, Object obj) {
        aqS34S1000000_11.invoke$0(((Number) obj).intValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS34S1000000_11 aqS34S1000000_11, Object obj) {
        int i;
        ((Number) obj).longValue();
        File file = new File(aqS34S1000000_11.s0);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                i = listFiles.length;
            } else {
                i = -1;
            }
        } else {
            i = -2;
        }
        JSONObject jSONObject = new JSONObject();
        String str = aqS34S1000000_11.s0;
        jSONObject.put("t_biz", "trace_log");
        jSONObject.put("t_m_cgy", "f_size");
        jSONObject.put("t_s_cgy", String.valueOf(i));
        jSONObject.put("t_sc", POW.LIZ(str));
        AppLogNewUtils.onEventV3("tt_network_metric", jSONObject);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS34S1000000_11 aqS34S1000000_11, Object obj) {
        boolean z;
        BaseLoginMethod it = (BaseLoginMethod) obj;
        o.LJIIIZ(it, "it");
        if (o.LJ(it.isHistoryOff(), Boolean.TRUE) && !o.LJ(it.getUid(), aqS34S1000000_11.s0)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$11(AqS34S1000000_11 aqS34S1000000_11, Object obj) {
        BaseLoginMethod it = (BaseLoginMethod) obj;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(o.LJ(it.getUid(), aqS34S1000000_11.s0));
    }

    public static final Object invoke$2(AqS34S1000000_11 aqS34S1000000_11, Object obj) {
        C66324Q1g receiver = (C66324Q1g) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = "Parse";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("expr:");
        LIZ.append(aqS34S1000000_11.s0);
        LIZ.append(" hash:");
        LIZ.append(aqS34S1000000_11.s0.hashCode());
        receiver.LIZ = X1D.LIZIZ(LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS34S1000000_11 aqS34S1000000_11, Object obj) {
        C66324Q1g receiver = (C66324Q1g) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = "Parse";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("expr hash:");
        LIZ.append(aqS34S1000000_11.s0.hashCode());
        LIZ.append(" parse from cache");
        receiver.LIZ = X1D.LIZIZ(LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS34S1000000_11 aqS34S1000000_11, Object obj) {
        C66324Q1g receiver = (C66324Q1g) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = "PreExecute";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("expr:");
        LIZ.append(aqS34S1000000_11.s0);
        LIZ.append(" hash:");
        LIZ.append(aqS34S1000000_11.s0.hashCode());
        receiver.LIZ = X1D.LIZIZ(LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS34S1000000_11 aqS34S1000000_11, Object obj) {
        C66324Q1g receiver = (C66324Q1g) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = "PreExecute";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("expr:");
        LIZ.append(aqS34S1000000_11.s0.hashCode());
        LIZ.append(" parse from cache");
        receiver.LIZ = X1D.LIZIZ(LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS34S1000000_11 aqS34S1000000_11, Object obj) {
        C66324Q1g receiver = (C66324Q1g) obj;
        o.LJIIJ(receiver, "$receiver");
        receiver.LIZIZ = "PreExecute";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("expr:");
        LIZ.append(aqS34S1000000_11.s0.hashCode());
        LIZ.append(" parse");
        receiver.LIZ = X1D.LIZIZ(LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS34S1000000_11 aqS34S1000000_11, Object obj) {
        AEL it = (AEL) obj;
        o.LJIIIZ(it, "it");
        String str = aqS34S1000000_11.s0;
        if (str == null) {
            str = "";
        }
        return AEL.LJIILJJIL(it, str, false, null, false, false, false, 15355);
    }

    public static final Object invoke$8(AqS34S1000000_11 aqS34S1000000_11, Object obj) {
        JSONObject it = (JSONObject) obj;
        o.LJIIIZ(it, "it");
        FMX.LJIILJJIL(aqS34S1000000_11.s0, it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS34S1000000_11 aqS34S1000000_11, Object obj) {
        BaseLoginMethod it = (BaseLoginMethod) obj;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(o.LJ(it.getUid(), aqS34S1000000_11.s0));
    }
}
