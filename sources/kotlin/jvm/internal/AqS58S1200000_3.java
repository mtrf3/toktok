package kotlin.jvm.internal;

import X.AbstractC211528Rw;
import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C177266xW;
import X.C177336xd;
import X.C211498Rt;
import X.C212428Vi;
import X.C221018lt;
import X.C48203Ivv;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55247LmF;
import X.C71Y;
import X.C76800UCe;
import X.C7C3;
import X.C8W0;
import X.FMX;
import X.InterfaceC55251LmJ;
import X.InterfaceC65784Pro;
import X.InterfaceC87283bg;
import X.Q8U;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import defpackage.m0;
import defpackage.t1;
import ujb.s;

/* loaded from: classes4.dex */
public class AqS58S1200000_3 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        String str;
        if (!C48203Ivv.LJ((Context) this.l1)) {
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) this.l2;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        String appLanguage = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getAppLanguage();
        if (s.LJJJLZIJ(this.s0, "%s", false)) {
            str = Q8U.LIZIZ(new Object[]{appLanguage}, 1, this.s0, "format(this, *args)");
        } else {
            str = this.s0;
        }
        SmartRoute LIZ = m0.LIZ((Context) this.l1, "aweme://webview", "url", str, "title", "");
        LIZ.withParam("show_separate_line", true);
        LIZ.open();
        t1.LJFF("enter_from", "privacy_setting", "nearby_visibility_learn_more");
    }

    public static final Object invoke$0(AqS58S1200000_3 aqS58S1200000_3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("store hierarchy data in ");
        LIZ.append((C7C3) aqS58S1200000_3.l1);
        LIZ.append(", key is ");
        LIZ.append(aqS58S1200000_3.s0);
        LIZ.append(", data is ");
        LIZ.append((InterfaceC87283bg) aqS58S1200000_3.l2);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$1(AqS58S1200000_3 aqS58S1200000_3) {
        String str;
        Aweme aweme;
        InterfaceC55251LmJ LIZLLL;
        Aweme aweme2;
        CommonCommentKeyboard commonCommentKeyboard = (CommonCommentKeyboard) aqS58S1200000_3.l1;
        String str2 = aqS58S1200000_3.s0;
        C177336xd c177336xd = (C177336xd) aqS58S1200000_3.l2;
        if (c177336xd != null && (aweme2 = c177336xd.LJLLI) != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (!o.LJ(str2, str)) {
            KeyboardVMV2 I3 = commonCommentKeyboard.I3();
            I3.getClass();
            C71Y.LIZLLL("KeyboardVM", "resetReplyCommentStateWhenSwitchAweme");
            I3.setState(C177266xW.LJLIL);
        }
        KeyboardVMV2 I32 = commonCommentKeyboard.I3();
        if (c177336xd != null) {
            aweme = c177336xd.LJLLI;
        } else {
            aweme = null;
        }
        I32.getClass();
        I32.setState(new AqS169S0100000_3(aweme, 625));
        InterfaceC55251LmJ LIZLLL2 = C55247LmF.LIZLLL(C55096Ljo.LJIIZILJ(commonCommentKeyboard), C177336xd.class, "source_default_key");
        if (LIZLLL2 != null) {
            LIZLLL2.LIZ(new AqS169S0100000_3(c177336xd, 88));
        }
        Fragment LIZLLL3 = C212428Vi.LIZLLL(commonCommentKeyboard);
        if (LIZLLL3 != null && (LIZLLL = C55247LmF.LIZLLL(C55230Lly.LIZJ(LIZLLL3, null), C177336xd.class, "source_default_key")) != null) {
            LIZLLL.LIZ(new AqS169S0100000_3(c177336xd, 89));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS58S1200000_3 aqS58S1200000_3) {
        Bundle arguments = ((Fragment) aqS58S1200000_3.l1).getArguments();
        Object obj = null;
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, aqS58S1200000_3.s0);
        }
        if (!(obj instanceof String) || obj == null) {
            return aqS58S1200000_3.l2;
        }
        return obj;
    }

    public static final Object invoke$11(AqS58S1200000_3 aqS58S1200000_3) {
        return ((C8W0) aqS58S1200000_3.l1).getSupervisor().LIZJ().LIZ((Class) aqS58S1200000_3.l2, aqS58S1200000_3.s0);
    }

    public static final Object invoke$12(AqS58S1200000_3 aqS58S1200000_3) {
        return ((C8W0) aqS58S1200000_3.l1).getSupervisor().LIZJ().LIZIZ((Class) aqS58S1200000_3.l2, aqS58S1200000_3.s0);
    }

    public static final Object invoke$13(AqS58S1200000_3 aqS58S1200000_3) {
        C7C3 c7c3 = ((AssemViewModel) aqS58S1200000_3.l1).hierarchyDataStore;
        if (c7c3 != null) {
            return c7c3.LIZIZ((Class) aqS58S1200000_3.l2, aqS58S1200000_3.s0);
        }
        return null;
    }

    public static final Object invoke$14(AqS58S1200000_3 aqS58S1200000_3) {
        C211498Rt c211498Rt = (C211498Rt) aqS58S1200000_3.l1;
        String str = ((AbstractC211528Rw) aqS58S1200000_3.l2).LJLIL;
        c211498Rt.getClass();
        FMX.LJIILJJIL("story_gesture_education", c211498Rt.LIZ(new AqS28S1000000_3(str, 17)));
        C211498Rt.LJIIIIZZ.getValue().storeBoolean(aqS58S1200000_3.s0, true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((AbstractC211528Rw) aqS58S1200000_3.l2).LJLIL);
        LIZ.append(" shown");
        C221018lt.LJFF("StoryGestureEducation", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AqS58S1200000_3 aqS58S1200000_3) {
        aqS58S1200000_3.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS58S1200000_3 aqS58S1200000_3) {
        Bundle arguments = ((Fragment) aqS58S1200000_3.l1).getArguments();
        Object obj = null;
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, aqS58S1200000_3.s0);
        }
        if (!(obj instanceof Aweme) || obj == null) {
            return aqS58S1200000_3.l2;
        }
        return obj;
    }

    public static final Object invoke$3(AqS58S1200000_3 aqS58S1200000_3) {
        Bundle arguments = ((Fragment) aqS58S1200000_3.l1).getArguments();
        Object obj = null;
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, aqS58S1200000_3.s0);
        }
        if (!(obj instanceof String) || obj == null) {
            return aqS58S1200000_3.l2;
        }
        return obj;
    }

    public static final Object invoke$4(AqS58S1200000_3 aqS58S1200000_3) {
        Bundle arguments = ((Fragment) aqS58S1200000_3.l1).getArguments();
        Object obj = null;
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, aqS58S1200000_3.s0);
        }
        if (((obj instanceof Integer) && obj != null) || (obj = aqS58S1200000_3.l2) != null) {
            return obj;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("value for ");
        LIZ.append(aqS58S1200000_3.s0);
        LIZ.append(" is null or not instance of ");
        LIZ.append(Integer.class);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static final Object invoke$5(AqS58S1200000_3 aqS58S1200000_3) {
        Bundle arguments = ((Fragment) aqS58S1200000_3.l1).getArguments();
        Object obj = null;
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, aqS58S1200000_3.s0);
        }
        if (((obj instanceof String) && obj != null) || (obj = aqS58S1200000_3.l2) != null) {
            return obj;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("value for ");
        LIZ.append(aqS58S1200000_3.s0);
        LIZ.append(" is null or not instance of ");
        LIZ.append(String.class);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static final Object invoke$6(AqS58S1200000_3 aqS58S1200000_3) {
        Bundle arguments = ((Fragment) aqS58S1200000_3.l1).getArguments();
        Object obj = null;
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, aqS58S1200000_3.s0);
        }
        if (((obj instanceof Boolean) && obj != null) || (obj = aqS58S1200000_3.l2) != null) {
            return obj;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("value for ");
        LIZ.append(aqS58S1200000_3.s0);
        LIZ.append(" is null or not instance of ");
        LIZ.append(Boolean.class);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static final Object invoke$7(AqS58S1200000_3 aqS58S1200000_3) {
        Bundle arguments = ((Fragment) aqS58S1200000_3.l1).getArguments();
        Object obj = null;
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, aqS58S1200000_3.s0);
        }
        if (((obj instanceof AddYoursTopic) && obj != null) || (obj = aqS58S1200000_3.l2) != null) {
            return obj;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("value for ");
        LIZ.append(aqS58S1200000_3.s0);
        LIZ.append(" is null or not instance of ");
        LIZ.append(AddYoursTopic.class);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static final Object invoke$8(AqS58S1200000_3 aqS58S1200000_3) {
        Bundle arguments = ((Fragment) aqS58S1200000_3.l1).getArguments();
        Object obj = null;
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, aqS58S1200000_3.s0);
        }
        if (((obj instanceof String) && obj != null) || (obj = aqS58S1200000_3.l2) != null) {
            return obj;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("value for ");
        LIZ.append(aqS58S1200000_3.s0);
        LIZ.append(" is null or not instance of ");
        LIZ.append(String.class);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static final Object invoke$9(AqS58S1200000_3 aqS58S1200000_3) {
        Bundle arguments = ((Fragment) aqS58S1200000_3.l1).getArguments();
        Object obj = null;
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, aqS58S1200000_3.s0);
        }
        if (!(obj instanceof AddYoursAvatar[]) || obj == null) {
            return aqS58S1200000_3.l2;
        }
        return obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1200000_3(C7C3 c7c3, String str, InterfaceC87283bg interfaceC87283bg, int i) {
        super(0);
        this.$t = i;
        this.l1 = c7c3;
        this.s0 = str;
        this.l2 = interfaceC87283bg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1200000_3(C211498Rt c211498Rt, AbstractC211528Rw abstractC211528Rw, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c211498Rt;
        this.l2 = abstractC211528Rw;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS58S1200000_3(C8W0 c8w0, C8W0 c8w02, Class<Object> cls, String str) {
        super(0);
        this.$t = str;
        this.l1 = c8w0;
        this.l2 = c8w02;
        this.s0 = cls;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1200000_3(Context context, String str, AqS153S0100000_3 aqS153S0100000_3, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.l2 = aqS153S0100000_3;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1200000_3(Fragment fragment, String str, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l1 = fragment;
        this.s0 = str;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS58S1200000_3(AssemViewModel assemViewModel, AssemViewModel<Object> assemViewModel2, Class<Object> cls, String str) {
        super(0);
        this.$t = str;
        this.l1 = assemViewModel;
        this.l2 = assemViewModel2;
        this.s0 = cls;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1200000_3(CommonCommentKeyboard commonCommentKeyboard, String str, C177336xd c177336xd, int i) {
        super(0);
        this.$t = i;
        this.l1 = commonCommentKeyboard;
        this.s0 = str;
        this.l2 = c177336xd;
    }
}
