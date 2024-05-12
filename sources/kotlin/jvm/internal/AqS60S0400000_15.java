package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C4LX;
import X.C76800UCe;
import X.C85359Xel;
import X.C85844Xma;
import X.C85845Xmb;
import X.EnumC85244Xcu;
import X.EnumC86061Xq5;
import X.IN4;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OPZ;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment;
import com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateFragment;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes16.dex */
public class AqS60S0400000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS60S0400000_15 aqS60S0400000_15, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.mv0((Fragment) aqS60S0400000_15.l0, new AqS146S0200000_15((AVPublishContentType) aqS60S0400000_15.l1, (ExtensionMisc) aqS60S0400000_15.l2, 35));
        assemble.wv0((Fragment) aqS60S0400000_15.l0, new AqS181S0100000_15((C85844Xma) aqS60S0400000_15.l3, 221));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS60S0400000_15 aqS60S0400000_15, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.mv0((Fragment) aqS60S0400000_15.l0, new AqS146S0200000_15((AVPublishContentType) aqS60S0400000_15.l1, (ExtensionMisc) aqS60S0400000_15.l2, 36));
        assemble.wv0((Fragment) aqS60S0400000_15.l0, new AqS181S0100000_15((C85845Xmb) aqS60S0400000_15.l3, 230));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS60S0400000_15 aqS60S0400000_15, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C85359Xel((AVPublishContentType) aqS60S0400000_15.l0, (ExtensionMisc) aqS60S0400000_15.l1, (PoiData) aqS60S0400000_15.l2, (EnumC85244Xcu) aqS60S0400000_15.l3);
        hierarchyData.LIZIZ = "PoiPublishExtensionDataV2";
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS60S0400000_15 aqS60S0400000_15, Object it) {
        o.LJIIIZ(it, "it");
        ((ARI) aqS60S0400000_15.l0).LJII(((PNSAgeConfirmOption) aqS60S0400000_15.l1).getOptionContent(), new AqS146S0200000_15((Map) aqS60S0400000_15.l2, (Map<String, String>) aqS60S0400000_15.l3, (AgeGateFragment) 56));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS60S0400000_15 aqS60S0400000_15, Object it) {
        o.LJIIIZ(it, "it");
        ((Map) aqS60S0400000_15.l0).put("type", String.valueOf((Integer) aqS60S0400000_15.l1));
        ((Map) aqS60S0400000_15.l0).put("result", "confirm");
        OPZ.LJ("age_gate_popup_show", (Map) aqS60S0400000_15.l0, ((AgeGateFragment) aqS60S0400000_15.l2).Ol());
        ((InterfaceC65784Pro) aqS60S0400000_15.l3).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS60S0400000_15 aqS60S0400000_15, Object obj) {
        boolean z;
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        List<PNSAgeConfirmOption> options = ((PNSDialogModel) aqS60S0400000_15.l0).getOptions();
        if (options != null) {
            PNSDialogModel pNSDialogModel = (PNSDialogModel) aqS60S0400000_15.l0;
            AgeGateFragment ageGateFragment = (AgeGateFragment) aqS60S0400000_15.l1;
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS60S0400000_15.l2;
            Integer num = (Integer) aqS60S0400000_15.l3;
            for (PNSAgeConfirmOption pNSAgeConfirmOption : options) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (pNSDialogModel.isDestructive() && pNSAgeConfirmOption.getOptionType() == EnumC86061Xq5.CONTINUE.getType()) {
                    actionGroup.LJFF(pNSAgeConfirmOption.getOptionContent(), new AqS119S0300000_15((Map) linkedHashMap, (Map<String, String>) ageGateFragment, (AgeGateFragment) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 5));
                } else if (pNSDialogModel.isDestructive() && pNSAgeConfirmOption.getOptionType() == EnumC86061Xq5.DISMISS.getType()) {
                    actionGroup.LJII(pNSAgeConfirmOption.getOptionContent(), new AqS60S0400000_15(actionGroup, (ARI) pNSAgeConfirmOption, (PNSAgeConfirmOption) linkedHashMap, (Map<String, String>) ageGateFragment, (AgeGateFragment) 3));
                } else if (pNSAgeConfirmOption.getOptionType() == EnumC86061Xq5.DISMISS.getType()) {
                    actionGroup.LJII(pNSAgeConfirmOption.getOptionContent(), new AqS119S0300000_15((Map) linkedHashMap, (Map<String, String>) num, (Integer) ageGateFragment, (AgeGateFragment) 6));
                } else {
                    actionGroup.LJII(pNSAgeConfirmOption.getOptionContent(), new AqS60S0400000_15((Map) linkedHashMap, (Map<String, String>) num, (Integer) ageGateFragment, (AgeGateFragment) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 4));
                }
            }
        }
        if (!((PNSDialogModel) aqS60S0400000_15.l0).getForceVertical() ? ((PNSDialogModel) aqS60S0400000_15.l0).getAlignmentType() == IN4.HORIZONTAL.getType() : ((PNSDialogModel) aqS60S0400000_15.l0).getAlignmentType() == IN4.VERTICAL.getType()) {
            z = true;
        } else {
            z = false;
        }
        actionGroup.LJI = z;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS60S0400000_15 aqS60S0400000_15, Object obj) {
        boolean z;
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        List<PNSAgeConfirmOption> options = ((PNSDialogModel) aqS60S0400000_15.l0).getOptions();
        if (options != null) {
            PNSDialogModel pNSDialogModel = (PNSDialogModel) aqS60S0400000_15.l0;
            TTKAgeGateRegistrationFragment tTKAgeGateRegistrationFragment = (TTKAgeGateRegistrationFragment) aqS60S0400000_15.l1;
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS60S0400000_15.l2;
            Integer num = (Integer) aqS60S0400000_15.l3;
            for (PNSAgeConfirmOption pNSAgeConfirmOption : options) {
                if (pNSDialogModel.isDestructive() && pNSAgeConfirmOption.getOptionType() == EnumC86061Xq5.CONTINUE.getType()) {
                    actionGroup.LJII(pNSAgeConfirmOption.getOptionContent(), new AqS179S0100000_13(tTKAgeGateRegistrationFragment, 661));
                } else if (pNSDialogModel.isDestructive() && pNSAgeConfirmOption.getOptionType() == EnumC86061Xq5.DISMISS.getType()) {
                    actionGroup.LJIIIZ(pNSAgeConfirmOption.getOptionContent(), new AqS144S0200000_13(tTKAgeGateRegistrationFragment, (TTKAgeGateRegistrationFragment) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 103));
                } else if (pNSAgeConfirmOption.getOptionType() == EnumC86061Xq5.DISMISS.getType()) {
                    actionGroup.LJII(pNSAgeConfirmOption.getOptionContent(), new AqS144S0200000_13(tTKAgeGateRegistrationFragment, num, 104));
                } else {
                    actionGroup.LJII(pNSAgeConfirmOption.getOptionContent(), new AqS117S0300000_13(tTKAgeGateRegistrationFragment, (TTKAgeGateRegistrationFragment) num, (Integer) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 21));
                }
            }
        }
        if (!((PNSDialogModel) aqS60S0400000_15.l0).getForceVertical() ? ((PNSDialogModel) aqS60S0400000_15.l0).getAlignmentType() == IN4.HORIZONTAL.getType() : ((PNSDialogModel) aqS60S0400000_15.l0).getAlignmentType() == IN4.VERTICAL.getType()) {
            z = true;
        } else {
            z = false;
        }
        actionGroup.LJI = z;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS60S0400000_15(ARI ari, ARI ari2, PNSAgeConfirmOption pNSAgeConfirmOption, Map<String, String> map, AgeGateFragment ageGateFragment) {
        super(1);
        this.$t = ageGateFragment;
        this.l0 = ari;
        this.l1 = ari2;
        this.l2 = pNSAgeConfirmOption;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S0400000_15(Fragment fragment, AVPublishContentType aVPublishContentType, ExtensionMisc extensionMisc, C85844Xma c85844Xma, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = aVPublishContentType;
        this.l2 = extensionMisc;
        this.l3 = c85844Xma;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S0400000_15(Fragment fragment, AVPublishContentType aVPublishContentType, ExtensionMisc extensionMisc, C85845Xmb c85845Xmb, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = aVPublishContentType;
        this.l2 = extensionMisc;
        this.l3 = c85845Xmb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS60S0400000_15(PNSDialogModel pNSDialogModel, PNSDialogModel pNSDialogModel2, TTKAgeGateRegistrationFragment tTKAgeGateRegistrationFragment, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Integer num) {
        super(1);
        this.$t = num;
        this.l0 = pNSDialogModel;
        this.l1 = pNSDialogModel2;
        this.l2 = tTKAgeGateRegistrationFragment;
        this.l3 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS60S0400000_15(PNSDialogModel pNSDialogModel, PNSDialogModel pNSDialogModel2, AgeGateFragment ageGateFragment, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Integer num) {
        super(1);
        this.$t = num;
        this.l0 = pNSDialogModel;
        this.l1 = pNSDialogModel2;
        this.l2 = ageGateFragment;
        this.l3 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS60S0400000_15(AVPublishContentType aVPublishContentType, ExtensionMisc extensionMisc, PoiData poiData, EnumC85244Xcu enumC85244Xcu, int i) {
        super(1);
        this.$t = i;
        this.l0 = aVPublishContentType;
        this.l1 = extensionMisc;
        this.l2 = poiData;
        this.l3 = enumC85244Xcu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS60S0400000_15(Map map, Map<String, String> map2, Integer num, AgeGateFragment ageGateFragment, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = num;
        this.l3 = ageGateFragment;
    }
}
