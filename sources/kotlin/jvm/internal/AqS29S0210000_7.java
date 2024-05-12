package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C145995oB;
import X.C1XY;
import X.C26048AKe;
import X.C41047G9b;
import X.C41458GOw;
import X.C44172HVg;
import X.C46142I9a;
import X.C60903NvH;
import X.C68322mC;
import X.C76800UCe;
import X.C78688UuS;
import X.FFL;
import X.FMX;
import X.G9M;
import X.G9P;
import X.GFJ;
import X.HIC;
import X.HYH;
import X.I9L;
import X.InterfaceC147355qN;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.X1D;
import Y.ARunnableS43S0100000_7;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BrandedContentSwitchStatus;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.view.ProfileNaviActivity;

/* loaded from: classes8.dex */
public class AqS29S0210000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
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

    public static final Object invoke$0(AqS29S0210000_7 aqS29S0210000_7, Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue <= 0) {
            ((C46142I9a) aqS29S0210000_7.l0).LIZIZ.LJJLIIJ(new HYH(intValue));
        }
        if (!aqS29S0210000_7.z2) {
            ((C46142I9a) aqS29S0210000_7.l0).LIZLLL.post(new ARunnableS43S0100000_7(aqS29S0210000_7, 24));
            ((C46142I9a) aqS29S0210000_7.l0).LIZLLL.post(new ARunnableS43S0100000_7(aqS29S0210000_7, 25));
        }
        ((C46142I9a) aqS29S0210000_7.l0).LIZIZ.LJLLILLLL();
        Runnable runnable = ((I9L) aqS29S0210000_7.l1).LJ;
        if (runnable != null) {
            ((C46142I9a) aqS29S0210000_7.l0).LIZLLL.post(runnable);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS29S0210000_7 aqS29S0210000_7, Object obj) {
        int intValue = ((Number) obj).intValue();
        ((C41047G9b) aqS29S0210000_7.l0).LJJLJLI(intValue);
        if (!aqS29S0210000_7.z2) {
            try {
                if (!G9P.LIZ()) {
                    TuxSheet tuxSheet = (TuxSheet) ((C68322mC) aqS29S0210000_7.l1).element;
                    if (tuxSheet != null) {
                        tuxSheet.xl();
                    }
                    FFL.LJIIIZ().getClass();
                    if (FFL.LJIIJ(31744, 0, "studio_creation_edit_privacy_toast", true) == 1) {
                        C60903NvH.LJIIJJI().getPublishService().LJJIIZI().getClass();
                        G9M.LIZ.LJI(((C41047G9b) aqS29S0210000_7.l0).LJJLI(), intValue, ((C41047G9b) aqS29S0210000_7.l0).LJLJL);
                        C26048AKe c26048AKe = new C26048AKe(C78688UuS.LJIJJ((C41047G9b) aqS29S0210000_7.l0));
                        c26048AKe.LJFF(((C41047G9b) aqS29S0210000_7.l0).LJJLIIIJJI(intValue));
                        c26048AKe.LJII();
                    }
                }
            } catch (IllegalStateException unused) {
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS29S0210000_7 aqS29S0210000_7, Object obj) {
        int i;
        HIC json = (HIC) obj;
        o.LJIIIZ(json, "$this$json");
        if (aqS29S0210000_7.z2) {
            i = C1XY.LJIILLIIL(((VideoPublishEditModel) aqS29S0210000_7.l0).videoFps(false));
        } else {
            i = 30;
        }
        json.LIZ.LJJIIJ("render_fps", Integer.valueOf(i));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((InterfaceC147355qN) aqS29S0210000_7.l1).LIZLLL());
        LIZ.append('x');
        LIZ.append(((InterfaceC147355qN) aqS29S0210000_7.l1).LJI());
        json.LIZ.LJJIIZ("render_resolution", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS29S0210000_7 aqS29S0210000_7, Object obj) {
        String str;
        String str2;
        if (aqS29S0210000_7.z2) {
            FMX.LJIIL("tcm_bc_toggle", GFJ.LIZIZ(5, "click_toggle").LIZ);
            CommerceToolsTcmModel commerceToolsTcmModel = (CommerceToolsTcmModel) aqS29S0210000_7.l0;
            if (commerceToolsTcmModel != null) {
                commerceToolsTcmModel.setBrandedContentSwitch(CardStruct.IStatusCode.DEFAULT);
            }
            CommerceToolsTcmModel commerceToolsTcmModel2 = (CommerceToolsTcmModel) aqS29S0210000_7.l0;
            if (commerceToolsTcmModel2 != null) {
                commerceToolsTcmModel2.setTcmCampaignInfo(null);
            }
            ((BrandedContentSwitchStatus) aqS29S0210000_7.l1).LJLIL.setValue(CardStruct.IStatusCode.DEFAULT);
        }
        if (aqS29S0210000_7.z2) {
            str = "passively_popup_highfans_bc";
        } else {
            str = "passively_popup_lowfans_bc";
        }
        C145995oB c145995oB = new C145995oB();
        if (aqS29S0210000_7.z2) {
            str2 = "highfans_choice";
        } else {
            str2 = "lowfans_choice";
        }
        c145995oB.LIZ(1, str2);
        FMX.LJIIL(str, c145995oB.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS29S0210000_7 aqS29S0210000_7, Object obj) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(C41458GOw.LIZIZ() ? 1 : 0, "is_tcm_creator");
        c145995oB.LJI("user_id", C44172HVg.LJIJ.getCurrentUserID());
        FMX.LJIIL("ttcm_turnon_disclosure_setting_click_cancel", c145995oB.LIZ);
        if (aqS29S0210000_7.z2) {
            CommerceToolsTcmModel commerceToolsTcmModel = (CommerceToolsTcmModel) aqS29S0210000_7.l0;
            if (commerceToolsTcmModel != null) {
                commerceToolsTcmModel.setBrandedContentSwitch(CardStruct.IStatusCode.DEFAULT);
            }
            CommerceToolsTcmModel commerceToolsTcmModel2 = (CommerceToolsTcmModel) aqS29S0210000_7.l0;
            if (commerceToolsTcmModel2 != null) {
                commerceToolsTcmModel2.setTcmCampaignInfo(null);
            }
            ((BrandedContentSwitchStatus) aqS29S0210000_7.l1).LJLIL.setValue(CardStruct.IStatusCode.DEFAULT);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS29S0210000_7 aqS29S0210000_7, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!aqS29S0210000_7.z2 || booleanValue) {
            ProfileNaviActivity.LLIIJLIL((ProfileNaviActivity) aqS29S0210000_7.l0, (Fragment) ((InterfaceC65784Pro) aqS29S0210000_7.l1).invoke());
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS29S0210000_7(C41047G9b c41047G9b, C41047G9b c41047G9b2, boolean z, C68322mC<TuxSheet> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.l0 = c41047G9b;
        this.z2 = c41047G9b2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S0210000_7(C46142I9a c46142I9a, boolean z, I9L i9l, int i) {
        super(1);
        this.$t = i;
        this.l0 = c46142I9a;
        this.z2 = z;
        this.l1 = i9l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S0210000_7(boolean z, CommerceToolsTcmModel commerceToolsTcmModel, BrandedContentSwitchStatus brandedContentSwitchStatus, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = commerceToolsTcmModel;
        this.l1 = brandedContentSwitchStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S0210000_7(boolean z, VideoPublishEditModel videoPublishEditModel, InterfaceC147355qN interfaceC147355qN, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = videoPublishEditModel;
        this.l1 = interfaceC147355qN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS29S0210000_7(boolean z, boolean z2, ProfileNaviActivity profileNaviActivity, InterfaceC65784Pro<? extends Fragment> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = profileNaviActivity;
    }
}
