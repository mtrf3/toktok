package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C39048FUe;
import X.C40048Fng;
import X.C65232Piu;
import X.C72972SkS;
import X.C76800UCe;
import X.EnumC39866Fkk;
import X.InterfaceC39049FUf;
import X.InterfaceC65784Pro;
import X.X1D;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AqS14S2200000_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS14S2200000_6 aqS14S2200000_6) {
        ((C39048FUe) aqS14S2200000_6.l2).getClass();
        if (C39048FUe.LIZ == null) {
            ((EnumC39866Fkk) aqS14S2200000_6.l3).ordinal();
        } else {
            ((C39048FUe) aqS14S2200000_6.l2).getClass();
            InterfaceC39049FUf interfaceC39049FUf = C39048FUe.LIZ;
            if (interfaceC39049FUf != null) {
                String str = aqS14S2200000_6.s1;
                EnumC39866Fkk enumC39866Fkk = (EnumC39866Fkk) aqS14S2200000_6.l3;
                StringBuilder LJFF = C72972SkS.LJFF("HybridKit", '_');
                LJFF.append(aqS14S2200000_6.s0);
                interfaceC39049FUf.LIZ(str, enumC39866Fkk, X1D.LIZIZ(LJFF));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS14S2200000_6 aqS14S2200000_6) {
        Map<String, String> map = C40048Fng.LIZ.get(aqS14S2200000_6.s0);
        JSONObject LIZJ = C65232Piu.LIZJ("sdk_version", "1.5.14-rc.16-oversea");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                LIZJ.put(entry.getKey(), entry.getValue());
            }
        }
        Map map2 = (Map) aqS14S2200000_6.l2;
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                LIZJ.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        JSONObject jSONObject = new JSONObject();
        Map map3 = (Map) aqS14S2200000_6.l3;
        if (map3 != null) {
            for (Map.Entry entry3 : map3.entrySet()) {
                jSONObject.put((String) entry3.getKey(), entry3.getValue());
            }
        }
        SDKMonitorUtils.LIZIZ("8560").LJIIJ(aqS14S2200000_6.s1, LIZJ, jSONObject, null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S2200000_6(C39048FUe c39048FUe, EnumC39866Fkk enumC39866Fkk, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = c39048FUe;
        this.l3 = enumC39866Fkk;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S2200000_6(String str, String str2, Map map, Map map2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l2 = map;
        this.l3 = map2;
        this.s1 = str2;
    }
}
