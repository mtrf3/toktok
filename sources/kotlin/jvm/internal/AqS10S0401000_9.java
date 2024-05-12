package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C56142M1q;
import X.C76800UCe;
import X.C78565UsT;
import X.C78613UtF;
import X.ECJ;
import X.EnumC56033Lyv;
import X.InterfaceC65784Pro;
import X.MX7;
import X.MXC;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
public class AqS10S0401000_9 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AqS10S0401000_9 aqS10S0401000_9) {
        ((EcVideoGuideAssem) aqS10S0401000_9.l0).q4(EnumC56033Lyv.CLICK_BUTTON, aqS10S0401000_9.i4);
        ((EcVideoGuideAssem) aqS10S0401000_9.l0).z4((C56142M1q) aqS10S0401000_9.l1, "click_no_anchor_video_pic");
        EcVideoGuideVM r4 = ((EcVideoGuideAssem) aqS10S0401000_9.l0).r4();
        ReachCfg reachCfg = (ReachCfg) aqS10S0401000_9.l2;
        int i = aqS10S0401000_9.i4;
        r4.getClass();
        if (reachCfg != null) {
            C78565UsT.LJJIJIIJI(r4, C78613UtF.LIZJ, new ECJ(reachCfg, r4, i, 2, null));
        }
        ((HashMap) aqS10S0401000_9.l3).put("enter_method", "click_no_anchor_video_pic");
        b.LJJIJIIJI("tiktokec_mall_entrance_click", (HashMap) aqS10S0401000_9.l3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS10S0401000_9 aqS10S0401000_9) {
        int i = 0;
        while (((List) aqS10S0401000_9.l0).size() + i < ((MX7) aqS10S0401000_9.l1).LJLILLLLZI + aqS10S0401000_9.i4 && i < ((List) aqS10S0401000_9.l2).size()) {
            ((List) aqS10S0401000_9.l3).add(ListProtector.get((List) aqS10S0401000_9.l2, i));
            i++;
        }
        if (i < ((List) aqS10S0401000_9.l2).size()) {
            List list = (List) aqS10S0401000_9.l3;
            MXC mxc = new MXC(1);
            DiggInfo diggInfo = new DiggInfo();
            diggInfo.user = mxc;
            list.add(diggInfo);
            List list2 = (List) aqS10S0401000_9.l3;
            List list3 = (List) aqS10S0401000_9.l2;
            list2.addAll(list3.subList(i, list3.size()));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS10S0401000_9(EcVideoGuideAssem ecVideoGuideAssem, EcVideoGuideAssem ecVideoGuideAssem2, int i, C56142M1q c56142M1q, ReachCfg reachCfg, HashMap<String, Object> hashMap) {
        super(0);
        this.$t = hashMap;
        this.l0 = ecVideoGuideAssem;
        this.i4 = ecVideoGuideAssem2;
        this.l1 = i;
        this.l2 = c56142M1q;
        this.l3 = reachCfg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS10S0401000_9(List list, List<DiggInfo> list2, MX7 mx7, int i, List<DiggInfo> list3, List<DiggInfo> list4) {
        super(0);
        this.$t = list4;
        this.l0 = list;
        this.l1 = list2;
        this.i4 = mx7;
        this.l2 = i;
        this.l3 = list3;
    }
}
