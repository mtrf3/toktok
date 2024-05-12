package kotlin.jvm.internal;

import X.AGT;
import X.ARI;
import X.AbstractC65781Prl;
import X.C25859ACx;
import X.C27474AqM;
import X.C27762Av0;
import X.C4LX;
import X.C76800UCe;
import X.C9ZN;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.commercialize.adsetting.AdSettingsApi;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterFragment;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public class AqS11S1110000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS11S1110000_4 aqS11S1110000_4, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        MessageCenterFragment messageCenterFragment = (MessageCenterFragment) aqS11S1110000_4.l1;
        assemble.mv0(messageCenterFragment, new AqS11S1110000_4(messageCenterFragment, aqS11S1110000_4.s0, aqS11S1110000_4.z2, 1));
        MessageCenterFragment messageCenterFragment2 = (MessageCenterFragment) aqS11S1110000_4.l1;
        assemble.mv0(messageCenterFragment2, new AqS47S0110000_4(messageCenterFragment2, aqS11S1110000_4.z2, 3));
        assemble.wv0((MessageCenterFragment) aqS11S1110000_4.l1, C27762Av0.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS11S1110000_4 aqS11S1110000_4, Object obj) {
        String str;
        long j;
        Long l;
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        if (aqS11S1110000_4.z2) {
            str = "seller_message";
        } else {
            str = "shop_message";
        }
        String str2 = aqS11S1110000_4.s0;
        String str3 = (String) ((MessageCenterFragment) aqS11S1110000_4.l1).LJLIL.getValue();
        Object obj2 = ((MessageCenterFragment) aqS11S1110000_4.l1).vl().get("start_click_time");
        if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        hierarchyData.LIZ = new C27474AqM(str, str2, str3, j, aqS11S1110000_4.z2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS11S1110000_4 aqS11S1110000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(aqS11S1110000_4.s0, new AqS170S0100000_4((InterfaceC65784Pro) aqS11S1110000_4.l1, (InterfaceC65784Pro<C76800UCe>) 783));
        if (aqS11S1110000_4.z2) {
            actionGroup.LJIIIIZZ(R.string.cg_, null);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS11S1110000_4 aqS11S1110000_4, Object it) {
        int i;
        o.LJIIIZ(it, "it");
        AdSettingsApi adSettingsApi = ((AdSettingsActivity) aqS11S1110000_4.l1).LJLJJLL;
        String str = aqS11S1110000_4.s0;
        if (aqS11S1110000_4.z2) {
            i = 2;
        } else {
            i = 1;
        }
        adSettingsApi.requestDarkPostUpdate(str, i).enqueue(new AGT((AdSettingsActivity) aqS11S1110000_4.l1, aqS11S1110000_4.z2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS11S1110000_4 aqS11S1110000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.tm3, new AqS11S1110000_4((AdSettingsActivity) aqS11S1110000_4.l1, aqS11S1110000_4.s0, aqS11S1110000_4.z2, 3));
        actionGroup.LJIIIIZZ(R.string.tm2, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS11S1110000_4 aqS11S1110000_4, Object obj) {
        C25859ACx it = (C25859ACx) obj;
        o.LJIIIZ(it, "it");
        return C25859ACx.LJIILJJIL(it, null, null, false, null, aqS11S1110000_4.s0, false, false, ((C9ZN) aqS11S1110000_4.l1).LIZJ, aqS11S1110000_4.z2, false, false, false, 8376191);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS11S1110000_4(com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterFragment r3, java.lang.String r4, boolean r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.z2 = r5
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r3
            r1.z2 = r5
            r1.s0 = r4
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS11S1110000_4.<init>(com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterFragment, java.lang.String, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS11S1110000_4(C9ZN c9zn, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = c9zn;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS11S1110000_4(AdSettingsActivity adSettingsActivity, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = adSettingsActivity;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS11S1110000_4(String str, InterfaceC65784Pro interfaceC65784Pro, boolean z, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.z2 = z;
        this.l1 = interfaceC65784Pro;
    }
}
