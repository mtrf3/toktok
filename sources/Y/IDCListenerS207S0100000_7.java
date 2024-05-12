package Y;

import X.AEY;
import X.AI8;
import X.AI9;
import X.C135315St;
import X.C145995oB;
import X.C25991AHz;
import X.C41340GKi;
import X.C42509GmH;
import X.C42520GmS;
import X.C43327GzT;
import X.C45499HtP;
import X.C45500HtQ;
import X.C45501HtR;
import X.C5KN;
import X.C60903NvH;
import X.FMX;
import X.GKY;
import X.GUT;
import X.InterfaceC45480Ht6;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice.CustomizeYourExperienceFragment;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.twostep.TurnOnTwoStepVerificationFragment;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcTemplateEditPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDCListenerS207S0100000_7 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                return;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                return;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                return;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                return;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                return;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                return;
            case 6:
                onCheckedChanged$6(this, compoundButton, z);
                return;
            case 7:
                onCheckedChanged$7(this, compoundButton, z);
                return;
            case 8:
                onCheckedChanged$8(this, compoundButton, z);
                return;
            case 9:
                onCheckedChanged$9(this, compoundButton, z);
                return;
            case 10:
                onCheckedChanged$10(this, compoundButton, z);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onCheckedChanged$11(this, compoundButton, z);
                return;
            case 12:
                onCheckedChanged$12(this, compoundButton, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS207S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(IDCListenerS207S0100000_7 iDCListenerS207S0100000_7, CompoundButton compoundButton, boolean z) {
        ((TurnOnTwoStepVerificationFragment) iDCListenerS207S0100000_7.l0).vl("mobile_sms_verify", z);
    }

    public static final void onCheckedChanged$1(IDCListenerS207S0100000_7 iDCListenerS207S0100000_7, CompoundButton compoundButton, boolean z) {
        ((TurnOnTwoStepVerificationFragment) iDCListenerS207S0100000_7.l0).vl("email_verify", z);
    }

    public static final void onCheckedChanged$10(IDCListenerS207S0100000_7 iDCListenerS207S0100000_7, CompoundButton compoundButton, boolean z) {
        int i;
        float f;
        GKY gky = ((PUgcTemplateEditPreviewScene) iDCListenerS207S0100000_7.l0).LJLZ;
        if (gky != null) {
            gky.LJ(z);
        }
        View view = (View) ((PUgcTemplateEditPreviewScene) iDCListenerS207S0100000_7.l0).LLFZ.getValue();
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        ((PUgcTemplateEditPreviewScene) iDCListenerS207S0100000_7.l0).LLLIIIL(z);
        PUgcTemplateEditPreviewScene pUgcTemplateEditPreviewScene = (PUgcTemplateEditPreviewScene) iDCListenerS207S0100000_7.l0;
        if (pUgcTemplateEditPreviewScene.LJLLJ) {
            ((View) pUgcTemplateEditPreviewScene.LLFII.getValue()).setEnabled(z);
            View view2 = (View) pUgcTemplateEditPreviewScene.LLFII.getValue();
            if (z) {
                f = 1.0f;
            } else {
                f = 0.4f;
            }
            view2.setAlpha(f);
        }
        if (z) {
            C135315St c135315St = ((PUgcTemplateEditPreviewScene) iDCListenerS207S0100000_7.l0).LJLLLL;
            if (c135315St != null) {
                c135315St.LIZLLL();
                ((PUgcTemplateEditPreviewScene) iDCListenerS207S0100000_7.l0).LLLII().setVisibility(4);
            } else {
                o.LJIJI("presenter");
                throw null;
            }
        } else {
            C135315St c135315St2 = ((PUgcTemplateEditPreviewScene) iDCListenerS207S0100000_7.l0).LJLLLL;
            if (c135315St2 != null) {
                c135315St2.LIZJ();
                ((PUgcTemplateEditPreviewScene) iDCListenerS207S0100000_7.l0).LLLII().setVisibility(0);
            } else {
                o.LJIJI("presenter");
                throw null;
            }
        }
        PUgcTemplateEditPreviewScene pUgcTemplateEditPreviewScene2 = (PUgcTemplateEditPreviewScene) iDCListenerS207S0100000_7.l0;
        pUgcTemplateEditPreviewScene2.LJZ = z;
        C41340GKi c41340GKi = pUgcTemplateEditPreviewScene2.LLIIIZ;
        if (c41340GKi != null) {
            c41340GKi.LJLJJI = z;
            c41340GKi.notifyDataSetChanged();
            if (!z) {
                C5KN.LIZ();
                return;
            }
            return;
        }
        o.LJIJI("pugcSlotRecyclerViewAdapter");
        throw null;
    }

    public static final void onCheckedChanged$11(IDCListenerS207S0100000_7 iDCListenerS207S0100000_7, CompoundButton compoundButton, boolean z) {
        o.LJIIIZ(compoundButton, "compoundButton");
        ((C42520GmS) iDCListenerS207S0100000_7.l0).getListener().LIZ((C42520GmS) iDCListenerS207S0100000_7.l0);
    }

    public static final void onCheckedChanged$12(IDCListenerS207S0100000_7 iDCListenerS207S0100000_7, CompoundButton compoundButton, boolean z) {
        ((C42509GmH) iDCListenerS207S0100000_7.l0).LJFF.setValue(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$2(IDCListenerS207S0100000_7 iDCListenerS207S0100000_7, CompoundButton compoundButton, boolean z) {
        ((TurnOnTwoStepVerificationFragment) iDCListenerS207S0100000_7.l0).vl("totp_verify", z);
    }

    public static final void onCheckedChanged$3(IDCListenerS207S0100000_7 iDCListenerS207S0100000_7, CompoundButton compoundButton, boolean z) {
        ((TurnOnTwoStepVerificationFragment) iDCListenerS207S0100000_7.l0).vl("pwd_verify", z);
    }

    public static final void onCheckedChanged$4(IDCListenerS207S0100000_7 iDCListenerS207S0100000_7, CompoundButton compoundButton, boolean z) {
        int i;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) iDCListenerS207S0100000_7.l0;
        videoPublishContainerScene.LLZL(z);
        Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        repo.storeInt("USER_HD_VIDEO_SWITCH_SETTING", i);
        videoPublishContainerScene.A();
        C60903NvH.LJIIJJI().getPublishService().LJI();
        GUT.LIZ(videoPublishContainerScene.LLII(), "high_quality_setting_changed");
    }

    public static final void onCheckedChanged$5(IDCListenerS207S0100000_7 iDCListenerS207S0100000_7, CompoundButton compoundButton, boolean z) {
        AEY aey;
        if (z) {
            AI9 accessory = ((AI8) ((CustomizeYourExperienceFragment) iDCListenerS207S0100000_7.l0)._$_findCachedViewById(R.id.n9o)).getAccessory();
            if ((accessory instanceof C25991AHz) && (aey = (AEY) accessory) != null) {
                aey.LJIILIIL(false);
            }
        }
        ((CustomizeYourExperienceFragment) iDCListenerS207S0100000_7.l0).Dl();
    }

    public static final void onCheckedChanged$6(IDCListenerS207S0100000_7 iDCListenerS207S0100000_7, CompoundButton compoundButton, boolean z) {
        AEY aey;
        if (z) {
            AI9 accessory = ((AI8) ((CustomizeYourExperienceFragment) iDCListenerS207S0100000_7.l0)._$_findCachedViewById(R.id.n9p)).getAccessory();
            if ((accessory instanceof C25991AHz) && (aey = (AEY) accessory) != null) {
                aey.LJIILIIL(false);
            }
        }
        ((CustomizeYourExperienceFragment) iDCListenerS207S0100000_7.l0).Dl();
    }

    public static final void onCheckedChanged$7(IDCListenerS207S0100000_7 iDCListenerS207S0100000_7, CompoundButton compoundButton, boolean z) {
        AEY aey;
        if (z) {
            AI9 accessory = ((AI8) ((CustomizeYourExperienceFragment) iDCListenerS207S0100000_7.l0)._$_findCachedViewById(R.id.xn)).getAccessory();
            if (accessory instanceof C25991AHz) {
                aey = (AEY) accessory;
            } else {
                aey = null;
            }
            if (aey != null) {
                aey.LJIILIIL(false);
            }
            ((AI8) ((CustomizeYourExperienceFragment) iDCListenerS207S0100000_7.l0)._$_findCachedViewById(R.id.xq)).setCellEnabled(true);
            if (!CustomizeYourExperienceFragment.LJLLILLLL) {
                CustomizeYourExperienceFragment.LJLLILLLL = true;
            }
            if (((CustomizeYourExperienceFragment) iDCListenerS207S0100000_7.l0)._$_findCachedViewById(R.id.d1h).getVisibility() == 8) {
                ((CustomizeYourExperienceFragment) iDCListenerS207S0100000_7.l0)._$_findCachedViewById(R.id.d1h).setVisibility(0);
            }
        }
        ((CustomizeYourExperienceFragment) iDCListenerS207S0100000_7.l0).Dl();
    }

    public static final void onCheckedChanged$8(IDCListenerS207S0100000_7 iDCListenerS207S0100000_7, CompoundButton compoundButton, boolean z) {
        AEY aey;
        if (z) {
            AI9 accessory = ((AI8) ((CustomizeYourExperienceFragment) iDCListenerS207S0100000_7.l0)._$_findCachedViewById(R.id.xp)).getAccessory();
            if (accessory instanceof C25991AHz) {
                aey = (AEY) accessory;
            } else {
                aey = null;
            }
            if (aey != null) {
                aey.LJIILIIL(false);
            }
            ((AI8) ((CustomizeYourExperienceFragment) iDCListenerS207S0100000_7.l0)._$_findCachedViewById(R.id.xq)).setCellEnabled(false);
        }
        ((CustomizeYourExperienceFragment) iDCListenerS207S0100000_7.l0).Dl();
    }

    public static final void onCheckedChanged$9(IDCListenerS207S0100000_7 iDCListenerS207S0100000_7, CompoundButton compoundButton, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        InterfaceC45480Ht6 interfaceC45480Ht6 = ((MvChoosePhotoScene) iDCListenerS207S0100000_7.l0).LLLLIILLL;
        if (interfaceC45480Ht6 != null) {
            interfaceC45480Ht6.LJIIZILJ(z);
        }
        C45501HtR c45501HtR = ((MvChoosePhotoScene) iDCListenerS207S0100000_7.l0).LLIIIL;
        if (c45501HtR != null) {
            c45501HtR.LLJZIJLIL(z);
        }
        C45500HtQ c45500HtQ = ((MvChoosePhotoScene) iDCListenerS207S0100000_7.l0).LLIIJLIL;
        if (c45500HtQ != null) {
            c45500HtQ.LLJLILLLLZIIL(z);
        }
        C45499HtP c45499HtP = ((MvChoosePhotoScene) iDCListenerS207S0100000_7.l0).LLIIIZ;
        if (c45499HtP != null) {
            c45499HtP.LLJLIL(z);
        }
        boolean z2 = !z;
        Keva keva = C43327GzT.LIZ;
        if (z2) {
            str = "single";
        } else {
            str = "multiple";
        }
        keva.storeString("storeLastChoice", str);
        ((MvChoosePhotoScene) iDCListenerS207S0100000_7.l0).LJLL.LIZ.storeBoolean("select_multiple", z);
        C145995oB c145995oB = new C145995oB();
        ShortVideoContext shortVideoContext = ((MvChoosePhotoScene) iDCListenerS207S0100000_7.l0).LLJLLIL;
        String str5 = null;
        if (shortVideoContext != null) {
            str2 = shortVideoContext.enterFrom;
        } else {
            str2 = null;
        }
        c145995oB.LJI("enter_from", str2);
        ShortVideoContext shortVideoContext2 = ((MvChoosePhotoScene) iDCListenerS207S0100000_7.l0).LLJLLIL;
        if (shortVideoContext2 != null) {
            str3 = shortVideoContext2.shootWay;
        } else {
            str3 = null;
        }
        c145995oB.LJI("shoot_way", str3);
        ShortVideoContext shortVideoContext3 = ((MvChoosePhotoScene) iDCListenerS207S0100000_7.l0).LLJLLIL;
        if (shortVideoContext3 != null) {
            str5 = shortVideoContext3.LJI();
        }
        c145995oB.LJI("creation_id", str5);
        c145995oB.LJI("content_source", "upload");
        if (z) {
            str4 = "on";
        } else {
            str4 = "off";
        }
        c145995oB.LJI("to_status", str4);
        FMX.LJIIL("click_multiple_select", c145995oB.LIZ);
    }
}
