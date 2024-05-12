package Y;

import X.C5S1;
import X.C76800UCe;
import X.C85114Xao;
import X.C85115Xap;
import X.C85119Xat;
import X.C85136XbA;
import X.C85144XbI;
import X.EnumC85151XbP;
import X.InterfaceC88472Yns;
import X.R47;
import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.twostep.RecentDevicesFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDeS98S0200000_15 implements R47 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                return;
            case 1:
                onResult$1(this, i, i2, obj);
                return;
            case 2:
                onResult$2(this, i, i2, obj);
                return;
            case 3:
                onResult$3(this, i, i2, obj);
                return;
            case 4:
                onResult$4(this, i, i2, obj);
                return;
            case 5:
                onResult$5(this, i, i2, obj);
                return;
            case 6:
                onResult$6(this, i, i2, obj);
                return;
            case 7:
                onResult$7(this, i, i2, obj);
                return;
            case 8:
                onResult$8(this, i, i2, obj);
                return;
            case 9:
                onResult$9(this, i, i2, obj);
                return;
            case 10:
                onResult$10(this, i, i2, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onResult$11(this, i, i2, obj);
                return;
            case 12:
                onResult$12(this, i, i2, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onResult$13(this, i, i2, obj);
                return;
            case 14:
                onResult$14(this, i, i2, obj);
                return;
            case 15:
                onResult$15(this, i, i2, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onResult$16(this, i, i2, obj);
                return;
            case 17:
                onResult$17(this, i, i2, obj);
                return;
            case 18:
                onResult$18(this, i, i2, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDeS98S0200000_15(Object obj, TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.l0 = obj;
        this.l1 = twoStepVerificationActivityViewModel;
    }

    public static final void onResult$0(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        BaseBundle baseBundle;
        if (i2 == 1) {
            if ((obj instanceof Bundle) && (baseBundle = (BaseBundle) obj) != null && baseBundle.getInt("error_code") != 0) {
                TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) iDeS98S0200000_15.l0;
                twoStepVerificationManageActivity.getClass();
                C5S1 c5s1 = new C5S1(twoStepVerificationManageActivity);
                c5s1.LIZLLL(twoStepVerificationManageActivity.getString(R.string.sg8));
                c5s1.LJ();
                return;
            }
            C85115Xap.LIZLLL = true;
            ((InterfaceC88472Yns) iDeS98S0200000_15.l1).invoke(null);
        }
    }

    public static final void onResult$1(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        BaseBundle baseBundle;
        if (i2 == 1) {
            if ((obj instanceof Bundle) && (baseBundle = (BaseBundle) obj) != null && baseBundle.getInt("error_code") != 0) {
                TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) iDeS98S0200000_15.l0;
                twoStepVerificationManageActivity.getClass();
                C5S1 c5s1 = new C5S1(twoStepVerificationManageActivity);
                c5s1.LIZLLL(twoStepVerificationManageActivity.getString(R.string.sg8));
                c5s1.LJ();
                return;
            }
            C85115Xap.LIZLLL = true;
            ((InterfaceC88472Yns) iDeS98S0200000_15.l1).invoke(null);
        }
    }

    public static final void onResult$10(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        C85136XbA c85136XbA;
        BaseBundle baseBundle;
        int i3;
        if (i2 == 1) {
            if ((obj instanceof Bundle) && (baseBundle = (BaseBundle) obj) != null && (i3 = baseBundle.getInt("error_code")) != 0) {
                TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0, Integer.valueOf(i3), null, 6);
                return;
            }
            Map<EnumC85151XbP, C85136XbA> map = ((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).LJLJJL;
            EnumC85151XbP enumC85151XbP = EnumC85151XbP.TOTP;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            C85136XbA c85136XbA2 = (C85136XbA) linkedHashMap.get(enumC85151XbP);
            if (c85136XbA2 != null) {
                c85136XbA = C85136XbA.LIZ(c85136XbA2, true, false, null, false, false, 62);
            } else {
                c85136XbA = new C85136XbA(true, false, enumC85151XbP, null, false, false, 58);
            }
            linkedHashMap.put(enumC85151XbP, c85136XbA);
            ((InterfaceC88472Yns) iDeS98S0200000_15.l1).invoke(null);
            return;
        }
        TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0, 0, null, 6);
    }

    public static final void onResult$11(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            String enterFrom = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String enterMethod = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            C85144XbI.LJIIIZ(enterFrom, enterMethod, "sms", true);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(new C85114Xao(str, "mobile_sms_verify"));
            return;
        }
        String enterFrom2 = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        String enterMethod2 = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod2, "enterMethod");
        C85144XbI.LJIIIZ(enterFrom2, enterMethod2, "sms", false);
        ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).LLIIJLIL();
    }

    public static final void onResult$12(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        C85136XbA c85136XbA;
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            Map<EnumC85151XbP, C85136XbA> map = ((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).LJLJJL;
            EnumC85151XbP enumC85151XbP = EnumC85151XbP.TOTP;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            C85136XbA c85136XbA2 = (C85136XbA) linkedHashMap.get(enumC85151XbP);
            if (c85136XbA2 != null) {
                c85136XbA = C85136XbA.LIZ(c85136XbA2, true, false, null, false, false, 62);
            } else {
                c85136XbA = new C85136XbA(true, false, enumC85151XbP, null, false, false, 58);
            }
            linkedHashMap.put(enumC85151XbP, c85136XbA);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(str);
            return;
        }
        TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0, 0, null, 6);
    }

    public static final void onResult$13(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            String enterFrom = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String enterMethod = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            C85144XbI.LJIIIZ(enterFrom, enterMethod, "email", true);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(new C85114Xao(str, "email_verify"));
            return;
        }
        String enterFrom2 = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        String enterMethod2 = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod2, "enterMethod");
        C85144XbI.LJIIIZ(enterFrom2, enterMethod2, "email", false);
        ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).LLIIJLIL();
    }

    public static final void onResult$14(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            C85144XbI.LJIIIZ(((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterFrom(), ((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterMethod(), "password", true);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(new C85119Xat(str, "pwd_verify"));
            return;
        }
        C85144XbI.LJIIIZ(((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterFrom(), ((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterMethod(), "password", false);
        TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0, 0, null, 6);
    }

    public static final void onResult$15(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            C85144XbI.LJIIIZ(((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterFrom(), ((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterMethod(), "sms", true);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(new C85119Xat(str, "mobile_sms_verify"));
            return;
        }
        C85144XbI.LJIIIZ(((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterFrom(), ((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterMethod(), "sms", false);
        TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0, 0, null, 6);
    }

    public static final void onResult$16(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            C85144XbI.LJIIIZ(((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterFrom(), ((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterMethod(), "sms", true);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(new C85119Xat(str, "mobile_sms_verify"));
            return;
        }
        C85144XbI.LJIIIZ(((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterFrom(), ((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterMethod(), "sms", false);
        TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0, 0, null, 6);
    }

    public static final void onResult$17(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            C85144XbI.LJIIIZ(((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterFrom(), ((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterMethod(), "email", true);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(new C85119Xat(str, "email_verify"));
            return;
        }
        C85144XbI.LJIIIZ(((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterFrom(), ((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterMethod(), "email", false);
        TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0, 0, null, 6);
    }

    public static final void onResult$18(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            C85144XbI.LJIIIZ(((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterFrom(), ((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterMethod(), "email", true);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(new C85119Xat(str, "email_verify"));
            return;
        }
        C85144XbI.LJIIIZ(((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterFrom(), ((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).getEnterMethod(), "email", false);
        TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0, 0, null, 6);
    }

    public static final void onResult$2(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            C85144XbI.LJIIIZ("add_trust_device", "normal", "password", true);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l0;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(new C85119Xat(str, "pwd_verify"));
            return;
        }
        C85144XbI.LJIIIZ("add_trust_device", "normal", "password", false);
        C85144XbI.LJJII(((RecentDevicesFragmentViewModel) iDeS98S0200000_15.l1).LJLIL.size(), 0, 0, ((RecentDevicesFragmentViewModel) iDeS98S0200000_15.l1).getEnterFrom());
        RecentDevicesFragmentViewModel recentDevicesFragmentViewModel = (RecentDevicesFragmentViewModel) iDeS98S0200000_15.l1;
        RecentDevicesFragmentViewModel.hv0(recentDevicesFragmentViewModel, 0, null, 6);
        recentDevicesFragmentViewModel.kv0();
    }

    public static final void onResult$3(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            C85144XbI.LJIIIZ("add_trust_device", "normal", "sms", true);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l0;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(new C85119Xat(str, "mobile_sms_verify"));
            return;
        }
        C85144XbI.LJIIIZ("add_trust_device", "normal", "sms", false);
        C85144XbI.LJJII(((RecentDevicesFragmentViewModel) iDeS98S0200000_15.l1).LJLIL.size(), 0, 0, ((RecentDevicesFragmentViewModel) iDeS98S0200000_15.l1).getEnterFrom());
        RecentDevicesFragmentViewModel recentDevicesFragmentViewModel = (RecentDevicesFragmentViewModel) iDeS98S0200000_15.l1;
        RecentDevicesFragmentViewModel.hv0(recentDevicesFragmentViewModel, 0, null, 6);
        recentDevicesFragmentViewModel.kv0();
    }

    public static final void onResult$4(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            C85144XbI.LJIIIZ("add_trust_device", "normal", "email", true);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l0;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(new C85119Xat(str, "email_verify"));
            return;
        }
        C85144XbI.LJIIIZ("add_trust_device", "normal", "email", false);
        C85144XbI.LJJII(((RecentDevicesFragmentViewModel) iDeS98S0200000_15.l1).LJLIL.size(), 0, 0, ((RecentDevicesFragmentViewModel) iDeS98S0200000_15.l1).getEnterFrom());
        RecentDevicesFragmentViewModel recentDevicesFragmentViewModel = (RecentDevicesFragmentViewModel) iDeS98S0200000_15.l1;
        RecentDevicesFragmentViewModel.hv0(recentDevicesFragmentViewModel, 0, null, 6);
        recentDevicesFragmentViewModel.kv0();
    }

    public static final void onResult$5(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            String enterFrom = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String enterMethod = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            C85144XbI.LJIIIZ(enterFrom, enterMethod, "password", true);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(new C85114Xao(str, "pwd_verify"));
            return;
        }
        String enterFrom2 = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        String enterMethod2 = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod2, "enterMethod");
        C85144XbI.LJIIIZ(enterFrom2, enterMethod2, "password", false);
        ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).LLIIJLIL();
    }

    public static final void onResult$6(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            String enterFrom = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String enterMethod = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            C85144XbI.LJIIIZ(enterFrom, enterMethod, "sms", true);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(new C85114Xao(str, "mobile_sms_verify"));
            return;
        }
        String enterFrom2 = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        String enterMethod2 = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod2, "enterMethod");
        C85144XbI.LJIIIZ(enterFrom2, enterMethod2, "sms", false);
        ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).LLIIJLIL();
    }

    public static final void onResult$7(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            String enterFrom = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String enterMethod = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            C85144XbI.LJIIIZ(enterFrom, enterMethod, "email", true);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(new C85114Xao(str, "email_verify"));
            return;
        }
        String enterFrom2 = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        String enterMethod2 = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod2, "enterMethod");
        C85144XbI.LJIIIZ(enterFrom2, enterMethod2, "email", false);
        ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).LLIIJLIL();
    }

    public static final void onResult$8(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        C85136XbA c85136XbA;
        BaseBundle baseBundle;
        int i3;
        if (i2 == 1) {
            if ((obj instanceof Bundle) && (baseBundle = (BaseBundle) obj) != null && (i3 = baseBundle.getInt("error_code")) != 0) {
                TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0, Integer.valueOf(i3), null, 6);
                return;
            }
            Map<EnumC85151XbP, C85136XbA> map = ((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0).LJLJJL;
            EnumC85151XbP enumC85151XbP = EnumC85151XbP.TOTP;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            C85136XbA c85136XbA2 = (C85136XbA) linkedHashMap.get(enumC85151XbP);
            if (c85136XbA2 != null) {
                c85136XbA = C85136XbA.LIZ(c85136XbA2, true, false, null, false, false, 62);
            } else {
                c85136XbA = new C85136XbA(true, false, enumC85151XbP, null, false, false, 58);
            }
            linkedHashMap.put(enumC85151XbP, c85136XbA);
            ((InterfaceC88472Yns) iDeS98S0200000_15.l1).invoke(null);
            return;
        }
        TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) iDeS98S0200000_15.l0, 0, null, 6);
    }

    public static final void onResult$9(IDeS98S0200000_15 iDeS98S0200000_15, int i, int i2, Object obj) {
        String str;
        BaseBundle baseBundle;
        if (i2 == 1) {
            String enterFrom = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String enterMethod = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            C85144XbI.LJIIIZ(enterFrom, enterMethod, "password", true);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS98S0200000_15.l1;
            if (!(obj instanceof Bundle) || (baseBundle = (BaseBundle) obj) == null || (str = baseBundle.getString("ticket")) == null) {
                str = "";
            }
            interfaceC88472Yns.invoke(new C85114Xao(str, "pwd_verify"));
            return;
        }
        String enterFrom2 = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        String enterMethod2 = ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod2, "enterMethod");
        C85144XbI.LJIIIZ(enterFrom2, enterMethod2, "password", false);
        ((TwoStepVerificationManageActivity) iDeS98S0200000_15.l0).LLIIJLIL();
    }
}
