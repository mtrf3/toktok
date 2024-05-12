package Y;

import X.ARI;
import X.C244659iv;
import X.C26227ARb;
import X.C48217Iw9;
import X.EnumC85788Xlg;
import X.EnumC85789Xlh;
import X.IMS;
import X.InterfaceC88472Yns;
import X.VL0;
import X.YNT;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ExitUnlinkPhoneEmailConfirmPageEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ShowUnlinkPhoneEmailConfirmPageEvent;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.videoshop.fullscreen.FullScreenOperator;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ARunnableS3S0220000_15 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (((FullScreenOperator) this.l1).isPortrait()) {
            C48217Iw9 c48217Iw9 = (C48217Iw9) this.l0;
            if (c48217Iw9 != null) {
                c48217Iw9.LIZ("portrait", "true");
            }
            FullScreenOperator fullScreenOperator = (FullScreenOperator) this.l1;
            YNT ynt = fullScreenOperator.fullScreenListener;
            if (ynt != null) {
                ynt.onFullScreen(false, fullScreenOperator.targetOrientation, this.z2, this.z3);
            }
            if (!((FullScreenOperator) this.l1).isPortraitAnimationEnable()) {
                ((FullScreenOperator) this.l1).exitFullScreenMode();
                FullScreenOperator fullScreenOperator2 = (FullScreenOperator) this.l1;
                fullScreenOperator2.videoScreenState = 0;
                fullScreenOperator2.resetLayoutInDisplayCutoutMode();
                return;
            }
            return;
        }
        C48217Iw9 c48217Iw92 = (C48217Iw9) this.l0;
        if (c48217Iw92 != null) {
            c48217Iw92.LIZ("portrait", "false");
        }
        FullScreenOperator fullScreenOperator3 = (FullScreenOperator) this.l1;
        YNT ynt2 = fullScreenOperator3.fullScreenListener;
        if (ynt2 != null) {
            ynt2.onFullScreen(false, fullScreenOperator3.targetOrientation, this.z2, this.z3);
        }
        ((FullScreenOperator) this.l1).exitFullScreenMode();
        FullScreenOperator fullScreenOperator4 = (FullScreenOperator) this.l1;
        fullScreenOperator4.videoScreenState = 0;
        fullScreenOperator4.resetLayoutInDisplayCutoutMode();
        ((FullScreenOperator) this.l1).videoContext.dismissSurfaceCoverFrameIfUseSurfaceView(true);
    }

    public static final void run$0(ARunnableS3S0220000_15 aRunnableS3S0220000_15) {
        boolean LIZ;
        try {
            aRunnableS3S0220000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S0220000_15 aRunnableS3S0220000_15) {
        int i;
        int i2;
        VL0 isEnvSafe;
        EnumC85789Xlh unlinkType;
        final I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aRunnableS3S0220000_15.l0;
        final boolean z = aRunnableS3S0220000_15.z2;
        ARI action = (ARI) aRunnableS3S0220000_15.l1;
        final boolean z2 = aRunnableS3S0220000_15.z3;
        i18nSettingManageMyAccountActivity.getClass();
        C26227ARb c26227ARb = new C26227ARb(i18nSettingManageMyAccountActivity);
        c26227ARb.LJIIIZ = new C244659iv(i18nSettingManageMyAccountActivity, R.raw.icon_exclamation_mark_circle, Integer.valueOf(R.attr.e7), 0);
        if (z) {
            i = R.string.c_8;
        } else {
            i = R.string.c_2;
        }
        c26227ARb.LJFF(i18nSettingManageMyAccountActivity.getString(i));
        if (z) {
            i2 = R.string.c_7;
        } else {
            i2 = R.string.c_1;
        }
        c26227ARb.LIZIZ(i18nSettingManageMyAccountActivity.getString(i2));
        o.LJIIIZ(action, "action");
        c26227ARb.LJIIL = action;
        c26227ARb.LIZJ(new InterfaceC88472Yns() { // from class: X.Xlb
            @Override // X.InterfaceC88472Yns
            public final Object invoke(Object obj) {
                VL1 vl1;
                EnumC85786Xle enumC85786Xle;
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity2 = I18nSettingManageMyAccountActivity.this;
                boolean z3 = z2;
                boolean z4 = z;
                i18nSettingManageMyAccountActivity2.getClass();
                if (((AbstractDialogInterfaceC26236ARk) obj).LJLJL == null) {
                    i18nSettingManageMyAccountActivity2.LLIL(false, EnumC85784Xlc.CLOSE, null);
                    ExitUnlinkPhoneEmailConfirmPageEvent exitUnlinkPhoneEmailConfirmPageEvent = new ExitUnlinkPhoneEmailConfirmPageEvent();
                    if (z3) {
                        vl1 = VL1.YES;
                    } else {
                        vl1 = VL1.NO;
                    }
                    exitUnlinkPhoneEmailConfirmPageEvent.LJIIIIZZ(vl1);
                    if (z4) {
                        enumC85786Xle = EnumC85786Xle.PHONE;
                    } else {
                        enumC85786Xle = EnumC85786Xle.EMAIL;
                    }
                    exitUnlinkPhoneEmailConfirmPageEvent.LJIIIZ(enumC85786Xle);
                    exitUnlinkPhoneEmailConfirmPageEvent.LJI(EnumC85785Xld.CHANGE);
                    exitUnlinkPhoneEmailConfirmPageEvent.LJII(IMQ.DIGITAL_1);
                    exitUnlinkPhoneEmailConfirmPageEvent.LJFF();
                }
                return null;
            }
        });
        c26227ARb.LJI().LIZLLL();
        ShowUnlinkPhoneEmailConfirmPageEvent showUnlinkPhoneEmailConfirmPageEvent = new ShowUnlinkPhoneEmailConfirmPageEvent();
        if (z2) {
            isEnvSafe = VL0.YES;
        } else {
            isEnvSafe = VL0.NO;
        }
        o.LJIIIZ(isEnvSafe, "isEnvSafe");
        showUnlinkPhoneEmailConfirmPageEvent.LIZLLL(Integer.valueOf(isEnvSafe.getValue()), "is_env_safe");
        if (z) {
            unlinkType = EnumC85789Xlh.PHONE;
        } else {
            unlinkType = EnumC85789Xlh.EMAIL;
        }
        o.LJIIIZ(unlinkType, "unlinkType");
        showUnlinkPhoneEmailConfirmPageEvent.LIZLLL(unlinkType.getValue(), "unlink_type");
        EnumC85788Xlg actionType = EnumC85788Xlg.CHANGE;
        o.LJIIIZ(actionType, "actionType");
        showUnlinkPhoneEmailConfirmPageEvent.LIZLLL(actionType.getValue(), "action_type");
        IMS is2svOn = IMS.DIGITAL_1;
        o.LJIIIZ(is2svOn, "is2svOn");
        showUnlinkPhoneEmailConfirmPageEvent.LIZLLL(Integer.valueOf(is2svOn.getValue()), "is_2sv_on");
        showUnlinkPhoneEmailConfirmPageEvent.LJFF();
    }

    public ARunnableS3S0220000_15(Object obj, boolean z, Object obj2, boolean z2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
        this.z3 = z2;
    }
}
