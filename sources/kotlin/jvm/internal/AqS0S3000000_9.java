package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C25776A9s;
import X.C30581Hy;
import X.C57855MnD;
import X.C57858MnG;
import X.C57866MnO;
import X.C76800UCe;
import X.EnumC57870MnS;
import X.EnumC57876MnY;
import X.InterfaceC88472Yns;

/* loaded from: classes10.dex */
public class AqS0S3000000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;
    public String s1;
    public String s2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S3000000_9 aqS0S3000000_9, Object obj) {
        EnumC57876MnY enumC57876MnY;
        C57866MnO configApi = (C57866MnO) obj;
        o.LJIIIZ(configApi, "$this$configApi");
        if (C30581Hy.LJIL(aqS0S3000000_9.s0)) {
            enumC57876MnY = EnumC57876MnY.FYP_VIDEO;
        } else {
            enumC57876MnY = EnumC57876MnY.FRIENDS_TAB_VIDEO;
        }
        configApi.LIZ(enumC57876MnY);
        EnumC57870MnS enumC57870MnS = EnumC57870MnS.RECOMMEND_MORE;
        o.LJIIIZ(enumC57870MnS, "<set-?>");
        configApi.LJIILIIL = enumC57870MnS;
        configApi.LIZLLL = 3;
        configApi.LIZJ = 3;
        configApi.LIZIZ = 1;
        configApi.LJFF = aqS0S3000000_9.s1;
        configApi.LJI = aqS0S3000000_9.s2;
        configApi.LJII = false;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S3000000_9 aqS0S3000000_9, Object obj) {
        C57858MnG setConfig = (C57858MnG) obj;
        o.LJIIIZ(setConfig, "$this$setConfig");
        setConfig.LIZ(new AqS0S3000000_9(aqS0S3000000_9.s0, aqS0S3000000_9.s1, aqS0S3000000_9.s2, 0));
        setConfig.LIZLLL(C57855MnD.LJLIL);
        setConfig.LIZJ(new AqS11S2000000_9(aqS0S3000000_9.s0, aqS0S3000000_9.s1, 5));
        setConfig.LIZIZ(C25776A9s.LJLIL);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S3000000_9(String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
