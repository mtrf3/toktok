package com.ss.android.ugc.aweme.authorize;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C19N;
import X.C1B3;
import X.C1B6;
import X.C26227ARb;
import X.C29S;
import X.C2YJ;
import X.C36176EHs;
import X.C39086FVq;
import X.C39241Faf;
import X.C3C5;
import X.C5S1;
import X.C61948OSy;
import X.C61949OSz;
import X.C61957OTh;
import X.C73969T1h;
import X.C76800UCe;
import X.C90903hW;
import X.DialogC25756A8y;
import X.FMX;
import X.InterfaceC36163EHf;
import X.ORZ;
import X.OT0;
import X.OT1;
import X.OT6;
import X.OTD;
import X.OTE;
import X.OTI;
import X.OTJ;
import X.OTK;
import X.OTL;
import X.OTN;
import X.OTO;
import X.OTQ;
import X.OTS;
import X.OTT;
import X.OTW;
import X.OTZ;
import X.OU1;
import X.T16;
import X.UC0;
import X.V1B;
import X.XKX;
import Y.AObserverS74S0100000_6;
import Y.AObserverS78S0100000_10;
import Y.ARunnableS46S0100000_10;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedCheckResult;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes11.dex */
public final class BaseI18nAuthorizedFragment extends Fragment implements InterfaceC36163EHf {
    public static Fragment LLD;
    public AwemeAuthorizePlatformDepend LJLIL;
    public OTK LJLILLLLZI;
    public AuthCommonViewModel LJLJI;
    public OT6 LJLJJI;
    public OTD LJLJJL;
    public DialogC25756A8y LJLJJLL;
    public int LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public Boolean LJLLJ;
    public boolean LJLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public String LJZ;
    public String LJZI;
    public String LJZL;
    public final Map<Integer, View> LL = new LinkedHashMap();
    public String LJLLLL = "";

    public final String Al() {
        OT6 ot6 = this.LJLJJI;
        if (ot6 != null) {
            return ot6.LIZJ;
        }
        o.LJIJI("request");
        throw null;
    }

    public final void Ol() {
        Fragment fragment = LLD;
        if (fragment != null && (fragment instanceof I18nScopesFragment)) {
            AuthCommonViewModel authCommonViewModel = this.LJLJI;
            if (authCommonViewModel != null) {
                authCommonViewModel.LJLLI.observe(this, new OTJ(this));
                return;
            } else {
                o.LJIJI("viewModel");
                throw null;
            }
        }
        Dl(OT1.LIZ(-2, OTS.ACCESS_DENIED, null));
    }

    public final C188727au vl() {
        String str = this.LJLLILLLL;
        String Al = Al();
        boolean z = this.LJLLL;
        String str2 = this.LJLJLJ;
        if (str2 != null) {
            String str3 = this.LJLJLLL;
            if (str3 != null) {
                return OTN.LIZ(str, Al, str2, str3, z);
            }
            o.LJIJI("mTikTokSdkVersion");
            throw null;
        }
        o.LJIJI("mTikTokSdkName");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DialogC25756A8y dialogC25756A8y = this.LJLJJLL;
        if (dialogC25756A8y != null) {
            if (dialogC25756A8y.isShowing()) {
                DialogC25756A8y dialogC25756A8y2 = this.LJLJJLL;
                if (dialogC25756A8y2 != null) {
                    dialogC25756A8y2.dismiss();
                } else {
                    o.LJIJI("authLoading");
                    throw null;
                }
            }
            EventBus.LIZJ().LJIJ(this);
            return;
        }
        o.LJIJI("authLoading");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LL).clear();
    }

    public final String wl() {
        String str;
        Context requireContext = requireContext();
        OT6 ot6 = this.LJLJJI;
        if (ot6 != null) {
            String str2 = ot6.callerPackage;
            if (str2 == null) {
                str2 = requireActivity().getCallingPackage();
            }
            List<String> LIZ = C39241Faf.LIZ(requireContext, str2);
            if (LIZ == null || (str = (String) ORZ.LJLLLL(LIZ)) == null) {
                return "";
            }
            return str;
        }
        o.LJIJI("request");
        throw null;
    }

    public final String xl() {
        String callingPackage = requireActivity().getCallingPackage();
        PackageManager packageManager = requireContext().getPackageManager();
        o.LJIIIIZZ(packageManager, "requireContext().packageManager");
        return OU1.LIZ(packageManager, callingPackage);
    }

    public final void Dl(C61948OSy c61948OSy) {
        String Al = Al();
        String str = this.LJLJLJ;
        if (str != null) {
            String str2 = this.LJLJLLL;
            if (str2 != null) {
                String str3 = this.LJLL;
                if (str3 != null) {
                    String str4 = this.LJLLI;
                    if (str4 != null) {
                        C36176EHs.LIZ(2, 0, "", Al, str, str2, str3, str4);
                        Ll(c61948OSy.errorCode, c61948OSy.errorMsg, false);
                        Nl(c61948OSy);
                        ActivityC45651qj mo49getActivity = mo49getActivity();
                        if (mo49getActivity != null) {
                            mo49getActivity.finish();
                            return;
                        }
                        return;
                    }
                    o.LJIJI("mCommonSdkVersion");
                    throw null;
                }
                o.LJIJI("mCommonSdkName");
                throw null;
            }
            o.LJIJI("mTikTokSdkVersion");
            throw null;
        }
        o.LJIJI("mTikTokSdkName");
        throw null;
    }

    public final void Hl(String str) {
        DialogC25756A8y dialogC25756A8y = this.LJLJJLL;
        if (dialogC25756A8y != null) {
            dialogC25756A8y.hide();
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            if (!TextUtils.isEmpty(str)) {
                C5S1 c5s1 = new C5S1(requireActivity);
                c5s1.LIZLLL(str);
                c5s1.LJ();
                return;
            }
            return;
        }
        o.LJIJI("authLoading");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Il(C61948OSy c61948OSy) {
        int i;
        String Al = Al();
        String str = this.LJLJLJ;
        if (str != null) {
            String str2 = this.LJLJLLL;
            if (str2 != null) {
                String str3 = this.LJLL;
                if (str3 != null) {
                    String str4 = this.LJLLI;
                    if (str4 != null) {
                        C36176EHs.LIZ(0, 0, "", Al, str, str2, str3, str4);
                        C188727au vl = vl();
                        vl.LJFF(Boolean.TRUE, "is_login");
                        OT6 ot6 = this.LJLJJI;
                        if (ot6 != null) {
                            vl.LJIIIZ("auth_scope", ot6.LJII);
                            vl.LJIIIZ("disabled_scope", this.LJLLLLLL);
                            vl.LIZLLL(0, "is_mobile_show");
                            vl.LIZLLL(0, "is_mobile");
                            vl.LJIIIZ("platform", "native_click");
                            try {
                                Boolean isNewUser = C2YJ.LIZIZ.LIZ.getAwemeActivitySetting().getIsNewUser();
                                o.LJIIIIZZ(isNewUser, "{\n        SettingsReader…tySetting.isNewUser\n    }");
                                i = isNewUser.booleanValue();
                            } catch (Exception unused) {
                                i = 0;
                            }
                            vl.LIZLLL(i, "is_register");
                            FMX.LJIIL("auth_success", vl.LIZ);
                            Ll(0, null, true);
                            Nl(c61948OSy);
                            ActivityC45651qj mo49getActivity = mo49getActivity();
                            if (mo49getActivity != null) {
                                mo49getActivity.finish();
                                return;
                            }
                            return;
                        }
                        o.LJIJI("request");
                        throw null;
                    }
                    o.LJIJI("mCommonSdkVersion");
                    throw null;
                }
                o.LJIJI("mCommonSdkName");
                throw null;
            }
            o.LJIJI("mTikTokSdkVersion");
            throw null;
        }
        o.LJIJI("mTikTokSdkName");
        throw null;
    }

    public final boolean Jl(AuthorizedPage authorizedPage) {
        boolean showSwitchAccount = authorizedPage.getShowSwitchAccount();
        if (authorizedPage.getCheckResult() != null) {
            AuthorizedCheckResult checkResult = authorizedPage.getCheckResult();
            o.LJI(checkResult);
            if (mo49getActivity() != null) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                o.LJI(mo49getActivity);
                C26227ARb c26227ARb = new C26227ARb(mo49getActivity);
                c26227ARb.LJFF(getString(R.string.hxe));
                c26227ARb.LIZIZ(checkResult.getResultMsg());
                c26227ARb.LJII = false;
                UC0.LIZJ(c26227ARb, new OTQ(this, showSwitchAccount, authorizedPage, showSwitchAccount ? 1 : 0, checkResult));
                c26227ARb.LJI().LIZLLL();
                C188727au vl = vl();
                vl.LIZLLL(showSwitchAccount ? 1 : 0, "has_switch_account_button");
                vl.LJFF(C39086FVq.LIZ, "error_code");
                FMX.LJIIL("show_auth_error_toast", vl.LIZ);
                return true;
            }
        }
        return false;
    }

    public final void Kl(AuthorizedPage authorizedPage) {
        boolean z;
        boolean z2;
        Fragment i18nAuthorizeFragment;
        I18nAuthorizeFragment i18nAuthorizeFragment2;
        DialogC25756A8y dialogC25756A8y;
        Bundle arguments = getArguments();
        if (arguments == null) {
            Gl(this, OT1.LIZ(-1, OTS.INVALID_REQUEST, null));
            return;
        }
        arguments.putSerializable("auth_page_info", authorizedPage);
        DialogC25756A8y dialogC25756A8y2 = this.LJLJJLL;
        if (dialogC25756A8y2 != null) {
            dialogC25756A8y2.dismiss();
            Boolean isLite = authorizedPage.isLite();
            if (isLite != null) {
                z = isLite.booleanValue();
            } else {
                z = false;
            }
            if (z) {
                i18nAuthorizeFragment = new I18nLiteAuthorizeFragment();
                i18nAuthorizeFragment.setArguments(arguments);
                FragmentManager childFragmentManager = getChildFragmentManager();
                C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
                LIZ.LJIIIIZZ(R.id.dms, 1, i18nAuthorizeFragment, null);
                LIZ.LJI();
            } else {
                FragmentManager childFragmentManager2 = getChildFragmentManager();
                C1B3 LIZ2 = C1B6.LIZ(childFragmentManager2, childFragmentManager2);
                Fragment fragment = LLD;
                if (fragment != null) {
                    if ((fragment instanceof I18nAuthorizeFragment) && (i18nAuthorizeFragment2 = (I18nAuthorizeFragment) fragment) != null && (dialogC25756A8y = i18nAuthorizeFragment2.LJLLL) != null) {
                        V1B.LJLILLLLZI(dialogC25756A8y);
                    }
                    if (o.LJ(fragment.getFragmentManager(), getChildFragmentManager())) {
                        LIZ2.LJJI(fragment);
                    }
                }
                if (this.LJLZ != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i18nAuthorizeFragment = new I18nAuthorizeFragment();
                arguments.putBoolean("is_ttbc_auth", z2);
                arguments.putBoolean("has_been_initialized", false);
                i18nAuthorizeFragment.setArguments(arguments);
                LIZ2.LJIIIIZZ(R.id.dms, 1, i18nAuthorizeFragment, null);
                LIZ2.LJIILJJIL();
            }
            LLD = i18nAuthorizeFragment;
            return;
        }
        o.LJIJI("authLoading");
        throw null;
    }

    public final void Ml(boolean z) {
        if (this.LJLLL && this.LJLZ == null && this.LJZ == null) {
            String str = this.LJLLLL;
            Integer valueOf = Integer.valueOf(this.LJLJL);
            OT6 ot6 = this.LJLJJI;
            if (ot6 != null) {
                OTO oto = new OTO(str, valueOf, ot6.LIZJ, ot6.LIZLLL, ot6.LJII, ot6.LJ);
                AuthCommonViewModel authCommonViewModel = this.LJLJI;
                if (authCommonViewModel != null) {
                    C61957OTh c61957OTh = authCommonViewModel.LJLJJL;
                    OTZ otz = new OTZ(authCommonViewModel);
                    c61957OTh.getClass();
                    OTE.LIZIZ.scanQrcode(oto.LIZ, oto.LIZIZ, oto.LIZJ, oto.LIZLLL, oto.LJ, oto.LJFF, oto.LJI).LJIJJ(C73969T1h.LIZIZ()).LJJIIJ(T16.LIZ()).LIZ(new OTW(otz));
                    return;
                }
                o.LJIJI("viewModel");
                throw null;
            }
            o.LJIJI("request");
            throw null;
        }
        String str2 = "";
        if (z && this.LJLZ == null) {
            AuthCommonViewModel authCommonViewModel2 = this.LJLJI;
            if (authCommonViewModel2 != null) {
                String Al = Al();
                if (Al != null) {
                    str2 = Al;
                }
                int i = this.LJLJL;
                OT6 ot62 = this.LJLJJI;
                if (ot62 != null) {
                    String LIZ = OTL.LIZ(ot62);
                    o.LJIIIIZZ(LIZ, "getScope(request)");
                    authCommonViewModel2.hv0(i, str2, LIZ, this.LJZI, this.LJLZ, xl(), wl(), true);
                    return;
                }
                o.LJIJI("request");
                throw null;
            }
            o.LJIJI("viewModel");
            throw null;
        }
        AuthCommonViewModel authCommonViewModel3 = this.LJLJI;
        if (authCommonViewModel3 != null) {
            String Al2 = Al();
            if (Al2 != null) {
                str2 = Al2;
            }
            int i2 = this.LJLJL;
            String str3 = this.LJZL;
            if (str3 != null) {
                authCommonViewModel3.hv0(i2, str2, str3, this.LJZI, this.LJLZ, xl(), wl(), false);
                return;
            } else {
                o.LJIJI("originalScope");
                throw null;
            }
        }
        o.LJIJI("viewModel");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Nl(X.C61948OSy r11) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment.Nl(X.OSy):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        String str6;
        String string;
        super.onCreate(bundle);
        this.LJLIL = new AwemeAuthorizePlatformDepend(this);
        Context context = getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.LJLIL;
        if (awemeAuthorizePlatformDepend != null) {
            this.LJLILLLLZI = new OTK(context, awemeAuthorizePlatformDepend);
            this.LJLJJI = new OT6(getArguments());
            this.LJLJJL = C61949OSz.LIZ(getArguments());
            OT6 ot6 = this.LJLJJI;
            if (ot6 != null) {
                if (ot6.callerPackage == null) {
                    ot6.callerPackage = requireActivity().getCallingPackage();
                }
                OT6 ot62 = this.LJLJJI;
                if (ot62 != null) {
                    String str7 = ot62.LJII;
                    String str8 = "";
                    if (str7 == null) {
                        str7 = "";
                    }
                    this.LJZL = str7;
                    Bundle arguments = getArguments();
                    if (arguments != null) {
                        bundle2 = arguments.getBundle("_bytedance_params_extra");
                    } else {
                        bundle2 = null;
                    }
                    Bundle arguments2 = getArguments();
                    if (arguments2 == null || (str = arguments2.getString("_aweme_params_caller_open_sdk_common_name")) == null) {
                        str = "";
                    }
                    this.LJLL = str;
                    Bundle arguments3 = getArguments();
                    if (arguments3 == null || (str2 = arguments3.getString("_aweme_params_caller_open_sdk_common_version")) == null) {
                        str2 = "";
                    }
                    this.LJLLI = str2;
                    this.LJLJLJ = OT0.LIZ(getArguments());
                    Bundle arguments4 = getArguments();
                    if (arguments4 == null || (str3 = arguments4.getString("_aweme_params_caller_open_sdk_version")) == null) {
                        str3 = "";
                    }
                    this.LJLJLLL = str3;
                    boolean z = false;
                    if (bundle2 != null) {
                        i = bundle2.getInt("authType");
                    } else {
                        i = 0;
                    }
                    this.LJLJL = i;
                    Bundle arguments5 = getArguments();
                    if (arguments5 != null) {
                        z = arguments5.getBoolean("key_qrcode_auth", false);
                    }
                    this.LJLLL = z;
                    Bundle arguments6 = getArguments();
                    if (arguments6 != null && (string = arguments6.getString("key_qrcode_token")) != null) {
                        str8 = string;
                    }
                    this.LJLLLL = str8;
                    Bundle arguments7 = getArguments();
                    if (arguments7 != null) {
                        str4 = arguments7.getString("key_qrcode_bc_params");
                    } else {
                        str4 = null;
                    }
                    this.LJLZ = str4;
                    Bundle arguments8 = getArguments();
                    if (arguments8 != null) {
                        str5 = arguments8.getString("key_qrcode_redirect_uri");
                    } else {
                        str5 = null;
                    }
                    this.LJZ = str5;
                    Bundle arguments9 = getArguments();
                    if (arguments9 != null) {
                        str6 = arguments9.getString("_bytedance_params_redirect_uri");
                    } else {
                        str6 = null;
                    }
                    this.LJZI = str6;
                    Bundle arguments10 = getArguments();
                    if (arguments10 != null) {
                        arguments10.getString("_bytedance_params_code_challenge");
                    }
                    ActivityC45651qj requireActivity = requireActivity();
                    o.LJIIIIZZ(requireActivity, "requireActivity()");
                    DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(requireActivity);
                    dialogC25756A8y.LIZIZ(R.string.rjz);
                    this.LJLJJLL = dialogC25756A8y;
                    Application application = requireActivity().getApplication();
                    o.LJIIIIZZ(application, "requireActivity().application");
                    AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.LJLIL;
                    if (awemeAuthorizePlatformDepend2 != null) {
                        OTK otk = this.LJLILLLLZI;
                        if (otk != null) {
                            OT6 ot63 = this.LJLJJI;
                            if (ot63 != null) {
                                OTD otd = this.LJLJJL;
                                if (otd != null) {
                                    this.LJLJI = (AuthCommonViewModel) ViewModelProviders.of(requireActivity(), new OTT(application, awemeAuthorizePlatformDepend2, otk, ot63, otd)).get(AuthCommonViewModel.class);
                                    return;
                                } else {
                                    o.LJIJI("authExtraRequestParams");
                                    throw null;
                                }
                            }
                            o.LJIJI("request");
                            throw null;
                        }
                        o.LJIJI("model");
                        throw null;
                    }
                    o.LJIJI("depend");
                    throw null;
                }
                o.LJIJI("request");
                throw null;
            }
            o.LJIJI("request");
            throw null;
        }
        o.LJIJI("depend");
        throw null;
    }

    public static void Gl(BaseI18nAuthorizedFragment baseI18nAuthorizedFragment, C61948OSy c61948OSy) {
        baseI18nAuthorizedFragment.getClass();
        int i = c61948OSy.errorCode;
        String str = c61948OSy.LIZLLL;
        String Al = baseI18nAuthorizedFragment.Al();
        String str2 = baseI18nAuthorizedFragment.LJLJLJ;
        if (str2 != null) {
            String str3 = baseI18nAuthorizedFragment.LJLJLLL;
            if (str3 != null) {
                String str4 = baseI18nAuthorizedFragment.LJLL;
                if (str4 != null) {
                    String str5 = baseI18nAuthorizedFragment.LJLLI;
                    if (str5 != null) {
                        C36176EHs.LIZ(1, i, str, Al, str2, str3, str4, str5);
                        baseI18nAuthorizedFragment.Ll(c61948OSy.errorCode, c61948OSy.LIZLLL, false);
                        baseI18nAuthorizedFragment.Nl(c61948OSy);
                        ActivityC45651qj mo49getActivity = baseI18nAuthorizedFragment.mo49getActivity();
                        if (mo49getActivity != null) {
                            mo49getActivity.finish();
                            return;
                        }
                        return;
                    }
                    o.LJIJI("mCommonSdkVersion");
                    throw null;
                }
                o.LJIJI("mCommonSdkName");
                throw null;
            }
            o.LJIJI("mTikTokSdkVersion");
            throw null;
        }
        o.LJIJI("mTikTokSdkName");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DialogC25756A8y dialogC25756A8y = this.LJLJJLL;
        if (dialogC25756A8y != null) {
            V1B.LJLJJL(dialogC25756A8y);
            AuthCommonViewModel authCommonViewModel = this.LJLJI;
            if (authCommonViewModel != null) {
                if (C19N.LJ("gate_auth_info_fix", false)) {
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(authCommonViewModel), null, null, new OTI(authCommonViewModel, null), 3);
                } else {
                    AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = authCommonViewModel.LJLIL;
                    awemeAuthorizePlatformDepend.LIZIZ.execute(new ARunnableS46S0100000_10(authCommonViewModel, 93));
                }
                AuthCommonViewModel authCommonViewModel2 = this.LJLJI;
                if (authCommonViewModel2 != null) {
                    authCommonViewModel2.LJLJL.observe(this, new AObserverS78S0100000_10(this, 4));
                    AuthCommonViewModel authCommonViewModel3 = this.LJLJI;
                    if (authCommonViewModel3 != null) {
                        authCommonViewModel3.LJLJLLL.observe(this, new AObserverS78S0100000_10(this, 5));
                        AuthCommonViewModel authCommonViewModel4 = this.LJLJI;
                        if (authCommonViewModel4 != null) {
                            authCommonViewModel4.LJLZ.observe(this, new AObserverS78S0100000_10(this, 6));
                            AuthCommonViewModel authCommonViewModel5 = this.LJLJI;
                            if (authCommonViewModel5 != null) {
                                authCommonViewModel5.LJLLJ.observe(this, new AObserverS78S0100000_10(this, 7));
                                AuthCommonViewModel authCommonViewModel6 = this.LJLJI;
                                if (authCommonViewModel6 != null) {
                                    authCommonViewModel6.LJLLLL.observe(this, new AObserverS74S0100000_6(this, 2));
                                    AuthCommonViewModel authCommonViewModel7 = this.LJLJI;
                                    if (authCommonViewModel7 != null) {
                                        authCommonViewModel7.LL.observe(this, new AObserverS74S0100000_6(this, 3));
                                        AuthCommonViewModel authCommonViewModel8 = this.LJLJI;
                                        if (authCommonViewModel8 != null) {
                                            authCommonViewModel8.LJZI.observe(this, new AObserverS78S0100000_10(this, 8));
                                            return;
                                        } else {
                                            o.LJIJI("viewModel");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("viewModel");
                                    throw null;
                                }
                                o.LJIJI("viewModel");
                                throw null;
                            }
                            o.LJIJI("viewModel");
                            throw null;
                        }
                        o.LJIJI("viewModel");
                        throw null;
                    }
                    o.LJIJI("viewModel");
                    throw null;
                }
                o.LJIJI("viewModel");
                throw null;
            }
            o.LJIJI("viewModel");
            throw null;
        }
        o.LJIJI("authLoading");
        throw null;
    }

    public final void Ll(int i, String str, boolean z) {
        String str2;
        C188727au vl = vl();
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        vl.LJIIIZ("result", str2);
        vl.LIZLLL(o.LJ(this.LJLLJ, Boolean.TRUE) ? 1 : 0, "auto_auth");
        if (!z) {
            vl.LIZLLL(i, "error_code");
            vl.LJI("error_message", str);
        }
        FMX.LJIIL("auth_result", vl.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        C29S c29s = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dr, inflater, null);
        if (!(LLLZIIL instanceof View)) {
            LLLZIIL = null;
        }
        if (LLLZIIL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLZIIL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLZIIL, this);
                C10A.LIZIZ(LLLZIIL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLZIIL;
    }
}
