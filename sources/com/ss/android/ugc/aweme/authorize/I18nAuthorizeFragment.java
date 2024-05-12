package com.ss.android.ugc.aweme.authorize;

import X.AV9;
import X.ActivityC45651qj;
import X.C04330Ez;
import X.C0JT;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C29S;
import X.C32I;
import X.C3C5;
import X.C61949OSz;
import X.C62846OlW;
import X.C68322mC;
import X.C76800UCe;
import X.C78765Uvh;
import X.C90903hW;
import X.DialogC25756A8y;
import X.FMX;
import X.HG3;
import X.InterfaceC36163EHf;
import X.InterfaceC61966OTq;
import X.OQY;
import X.ORZ;
import X.OT0;
import X.OT6;
import X.OTK;
import X.OTN;
import X.OTT;
import X.RBX;
import X.SY4;
import X.V1B;
import Y.ACListenerS30S0100000_10;
import Y.IDCListenerS285S0100000_10;
import Y.IDCSpanS4S0200000_10;
import Y.IDDListenerS149S0100000_10;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedClient;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPage;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPageDetail;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPageText;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public class I18nAuthorizeFragment extends Fragment implements InterfaceC36163EHf, InterfaceC61966OTq {
    public static final /* synthetic */ int LJLZ = 0;
    public AuthCommonViewModel LJLIL;
    public AwemeAuthorizePlatformDepend LJLILLLLZI;
    public OTK LJLJI;
    public OT6 LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public AuthorizedPage LJLJL;
    public boolean LJLJLJ;
    public boolean LJLLI;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public DialogC25756A8y LJLLL;
    public boolean LJLLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public String LJLJLLL = "";
    public String LJLL = "";

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C188727au vl() {
        String str = this.LJLLILLLL;
        OT6 ot6 = this.LJLJJI;
        if (ot6 != null) {
            String str2 = ot6.LIZJ;
            boolean z = this.LJLJLJ;
            String str3 = this.LJLJJL;
            if (str3 != null) {
                String str4 = this.LJLJJLL;
                if (str4 != null) {
                    return OTN.LIZ(str, str2, str3, str4, z);
                }
                o.LJIJI("tikTokSdkVersion");
                throw null;
            }
            o.LJIJI("tikTokSdkName");
            throw null;
        }
        o.LJIJI("request");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // X.InterfaceC61966OTq
    public final void P2(String str) {
        IProfileService LIZ = ProfileServiceImpl.LIZ();
        Bundle LIZ2 = C0JT.LIZ("need_restart", false, "should_restart_later", false);
        String str2 = this.LJLJJL;
        if (str2 != null) {
            LIZ2.putString("sdk_name", str2);
            String str3 = this.LJLJJLL;
            if (str3 != null) {
                LIZ2.putString("sdk_version", str3);
                OT6 ot6 = this.LJLJJI;
                if (ot6 != null) {
                    String str4 = ot6.LIZJ;
                    String str5 = this.LJLJJL;
                    if (str5 != null) {
                        String str6 = this.LJLJJLL;
                        if (str6 != null) {
                            AV9 av9 = new AV9("authorize_screen", str, str4, str5, str6);
                            FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
                            o.LJIIIIZZ(supportFragmentManager, "requireActivity().supportFragmentManager");
                            LIZ.showInChooseAccountBottomSheet(supportFragmentManager, av9, "", LIZ2, new IDDListenerS149S0100000_10(this, 0), new IDCListenerS285S0100000_10(this, 0));
                            FMX.LJIIL("auth_switch_account_pressed", vl().LIZ);
                            return;
                        }
                        o.LJIJI("tikTokSdkVersion");
                        throw null;
                    }
                    o.LJIJI("tikTokSdkName");
                    throw null;
                }
                o.LJIJI("request");
                throw null;
            }
            o.LJIJI("tikTokSdkVersion");
            throw null;
        }
        o.LJIJI("tikTokSdkName");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        o.LJIIIIZZ(requireArguments, "requireArguments()");
        Bundle bundle2 = requireArguments.getBundle("_bytedance_params_extra");
        OT6 ot6 = new OT6(requireArguments);
        this.LJLJJI = ot6;
        if (ot6.callerPackage == null) {
            ot6.callerPackage = requireActivity().getCallingPackage();
        }
        this.LJLILLLLZI = new AwemeAuthorizePlatformDepend(this);
        Context context = getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.LJLILLLLZI;
        if (awemeAuthorizePlatformDepend != null) {
            this.LJLJI = new OTK(context, awemeAuthorizePlatformDepend);
            Application application = requireActivity().getApplication();
            o.LJIIIIZZ(application, "requireActivity().application");
            AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.LJLILLLLZI;
            if (awemeAuthorizePlatformDepend2 != null) {
                OTK otk = this.LJLJI;
                if (otk != null) {
                    OT6 ot62 = this.LJLJJI;
                    if (ot62 != null) {
                        this.LJLIL = (AuthCommonViewModel) ViewModelProviders.of(requireActivity(), new OTT(application, awemeAuthorizePlatformDepend2, otk, ot62, C61949OSz.LIZ(requireArguments))).get(AuthCommonViewModel.class);
                        this.LJLJJL = OT0.LIZ(requireArguments);
                        String string = requireArguments.getString("_aweme_params_caller_open_sdk_version");
                        String str = "";
                        if (string == null) {
                            string = "";
                        }
                        this.LJLJJLL = string;
                        Serializable serializable = requireArguments.getSerializable("auth_page_info");
                        o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPage");
                        this.LJLJL = (AuthorizedPage) serializable;
                        if (bundle2 != null) {
                            bundle2.getInt("authType");
                        }
                        this.LJLJLJ = requireArguments.getBoolean("key_qrcode_auth", false);
                        String string2 = requireArguments.getString("key_qrcode_token");
                        if (string2 == null) {
                            string2 = "";
                        }
                        this.LJLJLLL = string2;
                        this.LJLLI = requireArguments.getBoolean("is_ttbc_auth");
                        String string3 = requireArguments.getString("key_qrcode_redirect_uri");
                        if (string3 != null) {
                            str = string3;
                        }
                        this.LJLL = str;
                        requireArguments.getString("_bytedance_params_redirect_uri");
                        requireArguments.getString("_bytedance_params_code_challenge");
                        return;
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
        o.LJIJI("depend");
        throw null;
    }

    public final void wl(String str) {
        OT6 ot6 = this.LJLJJI;
        if (ot6 != null) {
            if (o.LJ(ot6.callerPackage, "com.mobile.legends")) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("action_type", str);
                FMX.LJIIL("mlbb_bind_page", c188727au.LIZ);
                return;
            }
            return;
        }
        o.LJIJI("request");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [T, X.OQY] */
    /* JADX WARN: Type inference failed for: r0v61, types: [T, java.util.Set] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        List<AuthorizedPageText> list;
        String str2;
        List<AuthorizedScope> scopeList;
        String str3;
        String textContent;
        String textContent2;
        String textContent3;
        String textContent4;
        String textContent5;
        String textContent6;
        String textContent7;
        AuthorizedClient clientInfo;
        AuthorizedClient clientInfo2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        boolean z2 = true;
        if (arguments != null && arguments.getBoolean("has_been_initialized", false)) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLJ = z;
        AuthorizedPage authorizedPage = this.LJLJL;
        if (authorizedPage != null) {
            _$_findCachedViewById(R.id.btg).setVisibility(0);
            C78765Uvh.LIZ((C62846OlW) _$_findCachedViewById(R.id.l7h), R.drawable.status_icon);
            C62846OlW c62846OlW = (C62846OlW) _$_findCachedViewById(R.id.eal);
            AuthorizedPageDetail pageDetail = authorizedPage.getPageDetail();
            if (pageDetail != null && (clientInfo2 = pageDetail.getClientInfo()) != null) {
                str = clientInfo2.getClientIcon();
            } else {
                str = null;
            }
            C78765Uvh.LJIIIZ(c62846OlW, str, -1, -1);
            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
            if (curUser != null) {
                C78765Uvh.LJFF((C62846OlW) _$_findCachedViewById(R.id.l7h), curUser.getAvatarThumb());
            }
            int i = R.id.kwx;
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.kwx), new ACListenerS30S0100000_10(this, 0));
            DialogC25756A8y dialogC25756A8y = this.LJLLL;
            if (dialogC25756A8y != null) {
                V1B.LJLILLLLZI(dialogC25756A8y);
            }
            AuthorizedPageDetail pageDetail2 = authorizedPage.getPageDetail();
            if (pageDetail2 != null) {
                list = pageDetail2.getTextList();
            } else {
                list = null;
            }
            String uniqueId = ((RBX) HG3.LJIILL()).getCurUser().getUniqueId();
            if (uniqueId == null && (uniqueId = ((RBX) HG3.LJIILL()).getCurUser().getShortId()) == null) {
                uniqueId = "";
            }
            ((TextView) _$_findCachedViewById(R.id.mxz)).setText(uniqueId);
            AuthorizedPageDetail pageDetail3 = authorizedPage.getPageDetail();
            if (pageDetail3 != null && (clientInfo = pageDetail3.getClientInfo()) != null) {
                str2 = clientInfo.getClientName();
            } else {
                str2 = null;
            }
            this.LJLLILLLL = str2;
            ((TextView) _$_findCachedViewById(R.id.bf1)).setText(this.LJLLILLLL);
            if (!this.LJLLJ) {
                C188727au vl = vl();
                vl.LIZLLL(authorizedPage.getShowSwitchAccount() ? 1 : 0, "has_switch_account_button");
                vl.LIZLLL(authorizedPage.getShowEditAccess() ? 1 : 0, "has_edit_access_button");
                FMX.LJIIL("auth_notify", vl.LIZ);
            }
            int i2 = R.id.ms_;
            ((TextView) _$_findCachedViewById(R.id.ms_)).setMovementMethod(LinkMovementMethod.getInstance());
            if (list != null) {
                for (AuthorizedPageText authorizedPageText : list) {
                    String textKey = authorizedPageText.getTextKey();
                    if (textKey != null) {
                        switch (textKey.hashCode()) {
                            case -2113411192:
                                if (textKey.equals("key_policy_authorized_desc") && (textContent7 = authorizedPageText.getTextContent()) != null) {
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(textContent7));
                                    URLSpan[] urls = (URLSpan[]) spannableStringBuilder.getSpans(0, textContent7.length(), URLSpan.class);
                                    o.LJIIIIZZ(urls, "urls");
                                    for (URLSpan span : urls) {
                                        o.LJIIIIZZ(span, "span");
                                        spannableStringBuilder.setSpan(new IDCSpanS4S0200000_10(this, span, 0), spannableStringBuilder.getSpanStart(span), spannableStringBuilder.getSpanEnd(span), spannableStringBuilder.getSpanFlags(span));
                                        spannableStringBuilder.removeSpan(span);
                                    }
                                    Context context = getContext();
                                    if (context != null) {
                                        ((TextView) _$_findCachedViewById(R.id.msd)).setHighlightColor(C04330Ez.LIZIZ(context, R.color.cz));
                                    }
                                    ((TextView) _$_findCachedViewById(R.id.msd)).setText(spannableStringBuilder);
                                    ((TextView) _$_findCachedViewById(R.id.msd)).setMovementMethod(LinkMovementMethod.getInstance());
                                    break;
                                }
                                break;
                            case -2046860252:
                                if (textKey.equals("key_authorized_pattern_desc")) {
                                    ((TextView) _$_findCachedViewById(R.id.ms4)).setText(new SpannableStringBuilder(Html.fromHtml(authorizedPageText.getTextContent())));
                                    break;
                                } else {
                                    break;
                                }
                            case -1996887414:
                                if (textKey.equals("key_authorize_confirm") && (textContent6 = authorizedPageText.getTextContent()) != null) {
                                    ((TextView) _$_findCachedViewById(R.id.ax4)).setText(new SpannableStringBuilder(textContent6));
                                    break;
                                }
                                break;
                            case -1585292565:
                                if (textKey.equals("key_policy_title") && (textContent5 = authorizedPageText.getTextContent()) != null) {
                                    ((TextView) _$_findCachedViewById(R.id.gd2)).setText(textContent5);
                                    break;
                                }
                                break;
                            case -1341103089:
                                if (textKey.equals("key_switch_account_button") && authorizedPage.getShowSwitchAccount() && (textContent4 = authorizedPageText.getTextContent()) != null) {
                                    ((TextView) _$_findCachedViewById(i)).setText(new SpannableStringBuilder(textContent4));
                                    break;
                                }
                                break;
                            case 250084841:
                                if (textKey.equals("key_authorized_scope_title") && (textContent3 = authorizedPageText.getTextContent()) != null) {
                                    ((TextView) _$_findCachedViewById(i2)).setText(new SpannableStringBuilder(Html.fromHtml(textContent3)));
                                    break;
                                }
                                break;
                            case 969882551:
                                if (textKey.equals("key_edit_access_desc")) {
                                    if (!authorizedPage.getShowEditAccess()) {
                                        ((ImageView) _$_findCachedViewById(R.id.ea5)).setVisibility(4);
                                        _$_findCachedViewById(R.id.ea5).setClickable(false);
                                        break;
                                    } else {
                                        String textContent8 = authorizedPageText.getTextContent();
                                        if (textContent8 != null) {
                                            ((TextView) _$_findCachedViewById(R.id.mrm)).setText(new SpannableStringBuilder(textContent8));
                                            _$_findCachedViewById(R.id.ea5).setClickable(z2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            case 1395520881:
                                if (textKey.equals("key_policy_business_center_supplement") && (textContent2 = authorizedPageText.getTextContent()) != null) {
                                    ((TextView) _$_findCachedViewById(R.id.mro)).setText(new SpannableStringBuilder(textContent2));
                                    _$_findCachedViewById(R.id.mro).setVisibility(0);
                                    break;
                                }
                                break;
                            case 1585219952:
                                if (textKey.equals("key_authorize_cancel") && (textContent = authorizedPageText.getTextContent()) != null) {
                                    ((TextView) _$_findCachedViewById(R.id.av8)).setText(new SpannableStringBuilder(textContent));
                                    break;
                                }
                                break;
                        }
                    }
                    z2 = true;
                    i = R.id.kwx;
                    i2 = R.id.ms_;
                }
            }
            ((ViewGroup) _$_findCachedViewById(R.id.jc1)).removeAllViews();
            AuthorizedPageDetail pageDetail4 = authorizedPage.getPageDetail();
            if (pageDetail4 != null && (scopeList = pageDetail4.getScopeList()) != null) {
                for (AuthorizedScope authorizedScope : scopeList) {
                    String scopeName = authorizedScope.getScopeName();
                    String scopeDesc = authorizedScope.getScopeDesc();
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null) {
                        str3 = arguments2.getString("_bytedance_params_scope");
                    } else {
                        str3 = null;
                    }
                    C68322mC c68322mC = new C68322mC();
                    c68322mC.element = OQY.INSTANCE;
                    if (str3 != null) {
                        List LJLJJL = s.LJLJJL(str3, new String[]{","}, 0, 6);
                        ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJL, 10));
                        Iterator it = LJLJJL.iterator();
                        while (it.hasNext()) {
                            arrayList.add(s.LJZI((String) it.next()).toString());
                        }
                        c68322mC.element = ORZ.LLJJ(arrayList);
                    }
                    if (!TextUtils.isEmpty(scopeName) && !TextUtils.isEmpty(scopeDesc) && ((Set) c68322mC.element).contains(scopeName)) {
                        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.be0, (ViewGroup) _$_findCachedViewById(R.id.jc1), false);
                        ((TextView) LLLLIILL.findViewById(R.id.m03)).setText(scopeDesc);
                        ((ViewGroup) _$_findCachedViewById(R.id.jc1)).addView(LLLLIILL);
                    }
                }
            }
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.ax4), new ACListenerS30S0100000_10(this, 16));
            C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.av8), new ACListenerS30S0100000_10(this, 17));
            wl("show");
            if (this.LJLLI) {
                _$_findCachedViewById(R.id.cn8).setVisibility(8);
                return;
            } else {
                C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.cn8), new ACListenerS30S0100000_10(this, 18));
                return;
            }
        }
        o.LJIJI("authPageInfo");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        C29S c29s = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ds, inflater, null);
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
