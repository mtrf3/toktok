package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C76800UCe;
import X.GHH;
import X.GIW;
import X.InterfaceC88472Yns;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserSettingsActivity;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.AdPersonalizationActivity;
import com.ss.android.ugc.aweme.compliance.api.model.ResetEntryTextData;

/* loaded from: classes8.dex */
public class AqS12S2200000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS12S2200000_7 aqS12S2200000_7, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(aqS12S2200000_7.s0, new AqS138S0200000_7((AdvertiserSettingsActivity) aqS12S2200000_7.l2, (AdvertiserModel) aqS12S2200000_7.l3, 62));
        actionGroup.LJII(aqS12S2200000_7.s1, GIW.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS12S2200000_7 aqS12S2200000_7, Object obj) {
        String str;
        String str2;
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        if (!TextUtils.isEmpty(((ResetEntryTextData) aqS12S2200000_7.l2).getWithdraw())) {
            str = String.valueOf(((ResetEntryTextData) aqS12S2200000_7.l2).getWithdraw());
        } else {
            str = aqS12S2200000_7.s0;
        }
        actionGroup.LJII(str, new AqS173S0100000_7((AdPersonalizationActivity) aqS12S2200000_7.l3, 342));
        if (!TextUtils.isEmpty(((ResetEntryTextData) aqS12S2200000_7.l2).getCancel())) {
            str2 = String.valueOf(((ResetEntryTextData) aqS12S2200000_7.l2).getCancel());
        } else {
            str2 = aqS12S2200000_7.s1;
        }
        actionGroup.LJII(str2, GHH.LJLIL);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S2200000_7(ResetEntryTextData resetEntryTextData, String str, String str2, AdPersonalizationActivity adPersonalizationActivity, int i) {
        super(1);
        this.$t = i;
        this.l2 = resetEntryTextData;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = adPersonalizationActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S2200000_7(String str, String str2, AdvertiserSettingsActivity advertiserSettingsActivity, AdvertiserModel advertiserModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = advertiserSettingsActivity;
        this.l3 = advertiserModel;
    }
}
