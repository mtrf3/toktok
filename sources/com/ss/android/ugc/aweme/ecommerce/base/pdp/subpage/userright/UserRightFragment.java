package com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C109824Ss;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16330kX;
import X.C221108m2;
import X.C234509Ig;
import X.C234529Ii;
import X.C235119Kp;
import X.C26706Ady;
import X.C26715Ae7;
import X.C27066Ajm;
import X.C27350AoM;
import X.C27531ArH;
import X.C27943Axv;
import X.C29S;
import X.C32I;
import X.C3C5;
import X.C5H3;
import X.C70414RkI;
import X.C70888Rrw;
import X.C70917RsP;
import X.C70921RsT;
import X.C70922RsU;
import X.C76542zS;
import X.C76800UCe;
import X.C78685UuP;
import X.C78946Uyc;
import X.C78948Uye;
import X.C7MY;
import X.C90903hW;
import X.C9KF;
import X.EnumC252729vw;
import X.InterfaceC219588ja;
import X.InterfaceC67352kd;
import X.ORZ;
import X.OSZ;
import X.OUP;
import X.ViewOnLayoutChangeListenerC27087Ak7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ContactDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PrivacyPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.view.PdpUserRightSheetItemView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class UserRightFragment extends ECBaseFragment implements InterfaceC219588ja, c {
    public static final C27066Ajm Companion = new C27066Ajm();
    public static InterfaceC67352kd<? super C76800UCe> continuation;
    public Integer bizType;
    public int rightCount;
    public Map<String, ? extends Object> trackParams;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final List<String> rightContentArray = new ArrayList();
    public int entrance = 2;
    public HashMap<String, Object> daInfo = new HashMap<>();
    public final C5H3 style$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 241));

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_ss_android_ugc_aweme_ecommerce_base_pdp_subpage_userright_UserRightFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    private final IUserRightPageStyle getStyle() {
        return (IUserRightPageStyle) this.style$delegate.getValue();
    }

    private final void logEnterPage() {
        int i = this.entrance;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            Map<String, ? extends Object> map = this.trackParams;
            if (map != null) {
                C76542zS.LIZJ("tiktokec_enter_page", new AqS135S0200000_4(this, (UserRightFragment) map, (Map<String, ? extends Object>) 49));
                return;
            }
            C70414RkI LIZ = C27350AoM.LIZ(getContext());
            if (LIZ == null) {
                return;
            }
            C76542zS.LIZJ("tiktokec_enter_page", new AqS135S0200000_4(LIZ, this, 50));
            return;
        }
        C78946Uyc.LJJII(this, new C70922RsU(), new AqS170S0100000_4(this, 310));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC37828Esy
    public String getPageName() {
        if (this.entrance == 1) {
            return "shop_with_confidence";
        }
        return "rights_service";
    }

    private final void logStayPage() {
        String str;
        if (ActivityStack.isAppBackGround()) {
            str = "close";
        } else {
            str = "return";
        }
        int i = this.entrance;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            Map<String, ? extends Object> map = this.trackParams;
            if (map != null) {
                C76542zS.LIZJ("tiktokec_stay_page", new AqS47S1200000_4(this, str, map, 8));
                return;
            }
            C70414RkI LIZ = C27350AoM.LIZ(mo49getActivity());
            if (LIZ == null) {
                return;
            }
            LIZ.LJJJJLI(getPageName(), getStayDuration(), str, C113554cx.LJJL(new OSZ("rights_cnt", Integer.valueOf(this.rightCount)), new OSZ("rights_content", ORZ.LLD(this.rightContentArray, ",", null, null, null, 62))));
            return;
        }
        C78946Uyc.LJJII(this, new C70921RsT(), new AqS58S1100000_4(this, str, 16));
    }

    @Override // X.InterfaceC219588ja
    public C235119Kp createNavActions() {
        UserRight userRight;
        ContactDetail contactDetail;
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            userRight = (UserRight) arguments.getParcelable("data");
        } else {
            userRight = null;
        }
        if (!(userRight instanceof UserRight)) {
            userRight = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("title");
        }
        String valueOf = String.valueOf(str);
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = valueOf;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 240));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        if (userRight != null && (contactDetail = userRight.contactDetail) != null) {
            C78946Uyc.LJJII(this, new C70888Rrw(), new AqS170S0100000_4(this, 309));
            if (C78685UuP.LJJJZ(contactDetail.text)) {
                C234509Ig c234509Ig = new C234509Ig();
                String content = contactDetail.text;
                o.LJIIIZ(content, "content");
                c234509Ig.LIZJ = content;
                c234509Ig.LIZ(EnumC252729vw.SECONDARY);
                c234509Ig.LJFF = true;
                c234509Ig.LIZ = new C109824Ss(new AqS151S0200000_4(this, contactDetail, 8));
                c235119Kp.LIZLLL(c234509Ig);
            } else {
                C234529Ii LIZJ2 = s1.LIZJ();
                LIZJ2.LIZJ = R.raw.icon_headset;
                LIZJ2.LIZLLL = true;
                LIZJ2.LIZIZ(new AqS151S0200000_4(this, contactDetail, 9));
                c235119Kp.LIZLLL(LIZJ2);
            }
        }
        return c235119Kp;
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC67352kd<? super C76800UCe> interfaceC67352kd = continuation;
        if (interfaceC67352kd != null) {
            C76800UCe c76800UCe = C76800UCe.LIZ;
            C3C5.m7constructorimpl(c76800UCe);
            interfaceC67352kd.resumeWith(c76800UCe);
        }
        continuation = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        logStayPage();
    }

    private final void logButtonShow(String str) {
        if (this.entrance != 2) {
            return;
        }
        Map<String, ? extends Object> map = this.trackParams;
        if (map != null) {
            C76542zS.LIZJ("tiktokec_button_show", new AqS47S1200000_4(this, str, map, 6));
            return;
        }
        C70414RkI LIZ = C27350AoM.LIZ(getContext());
        if (LIZ == null) {
            return;
        }
        C76542zS.LIZJ("tiktokec_button_show", new AqS47S1200000_4(LIZ, this, str, 7));
    }

    public final void addUserRightParams(C27943Axv c27943Axv) {
        c27943Axv.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c27943Axv.LIZJ("page_name", getPageName());
        c27943Axv.LIZJ("rights_cnt", Integer.valueOf(this.rightCount));
        c27943Axv.LIZJ("rights_content", ORZ.LLD(this.rightContentArray, ",", null, null, null, 62));
    }

    public final void logButtonClick(String str) {
        int i = this.entrance;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            Map<String, ? extends Object> map = this.trackParams;
            if (map != null) {
                C76542zS.LIZJ("tiktokec_button_click", new AqS47S1200000_4(this, str, map, 4));
                return;
            }
            C70414RkI LIZ = C27350AoM.LIZ(getContext());
            if (LIZ == null) {
                return;
            }
            C76542zS.LIZJ("tiktokec_button_click", new AqS47S1200000_4(LIZ, this, str, 5));
            return;
        }
        C78946Uyc.LJJII(this, new C70917RsP(), new AqS58S1100000_4(this, str, 15));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        UserRight userRight;
        List<UserRightDetail> list;
        Integer num;
        Serializable serializable;
        HashMap hashMap;
        Image image;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            userRight = (UserRight) arguments.getParcelable("data");
        } else {
            userRight = null;
        }
        if (!(userRight instanceof UserRight) || userRight == null || (list = userRight.userRightDetails) == null) {
            return;
        }
        Object obj = C78948Uye.LJIILJJIL(this, "lib_track_builtin_lane_business").get((Object) "biz_type");
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        this.bizType = num;
        this.rightCount = list.size();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("track_params");
        } else {
            serializable = null;
        }
        if (serializable instanceof HashMap) {
            hashMap = (HashMap) serializable;
        } else {
            hashMap = null;
        }
        this.trackParams = hashMap;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = C7MY.LIZIZ(13);
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (UserRightDetail userRightDetail : list) {
            String str = userRightDetail.nameEn;
            if (str != null) {
                this.rightContentArray.add(str);
            }
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            PdpUserRightSheetItemView pdpUserRightSheetItemView = new PdpUserRightSheetItemView(context, null, 0, this.entrance, this.bizType, 6, null);
            ((ViewGroup) view.findViewById(R.id.jci)).addView(pdpUserRightSheetItemView, layoutParams);
            if (C16330kX.LIZJ(pdpUserRightSheetItemView) && !pdpUserRightSheetItemView.isLayoutRequested()) {
                pdpUserRightSheetItemView.setTitle(userRightDetail.name, userRightDetail.headerFontColor, userRightDetail.headerFontDarkColor);
                if (pdpUserRightSheetItemView.getStyle().getIconVisibility() != 8) {
                    pdpUserRightSheetItemView.setIcon(userRightDetail.icon);
                }
                if (pdpUserRightSheetItemView.getStyle().getBackgroundVisibility() != 8) {
                    Context context2 = pdpUserRightSheetItemView.getContext();
                    o.LJIIIIZZ(context2, "context");
                    if (AnonymousClass636.LJIILJJIL(context2)) {
                        Icon icon = userRightDetail.background;
                        if (icon != null) {
                            image = icon.iconDark;
                            pdpUserRightSheetItemView.setBackground(image);
                            pdpUserRightSheetItemView.setColor(userRightDetail.themeColor);
                        }
                        image = null;
                        pdpUserRightSheetItemView.setBackground(image);
                        pdpUserRightSheetItemView.setColor(userRightDetail.themeColor);
                    } else {
                        Icon icon2 = userRightDetail.background;
                        if (icon2 != null) {
                            image = icon2.icon;
                            pdpUserRightSheetItemView.setBackground(image);
                            pdpUserRightSheetItemView.setColor(userRightDetail.themeColor);
                        }
                        image = null;
                        pdpUserRightSheetItemView.setBackground(image);
                        pdpUserRightSheetItemView.setColor(userRightDetail.themeColor);
                    }
                }
                pdpUserRightSheetItemView.setHeaderBackground(userRightDetail.headerBackgroundImage, userRightDetail.themeColor);
                List<UserRightDesc> list2 = userRightDetail.userRightDesc;
                boolean z = false;
                if (list2 == null || list2.isEmpty()) {
                    String str2 = userRightDetail.description;
                    Icon icon3 = userRightDetail.icon;
                    if (icon3 != null && icon3.icon != null) {
                        z = true;
                    }
                    pdpUserRightSheetItemView.setDesc(str2, z);
                } else {
                    Icon icon4 = userRightDetail.icon;
                    if (icon4 != null && icon4.icon != null) {
                        z = true;
                    }
                    pdpUserRightSheetItemView.setDesc(userRightDetail, z);
                }
            } else {
                pdpUserRightSheetItemView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC27087Ak7(pdpUserRightSheetItemView, userRightDetail));
            }
            arrayList.add(C76800UCe.LIZ);
        }
        List<PrivacyPolicy> list3 = userRight.privacyPolicy;
        if (list3 != null) {
            View user_right_privacy_policy = _$_findCachedViewById(R.id.n0g);
            o.LJIIIIZZ(user_right_privacy_policy, "user_right_privacy_policy");
            OUP.LJJLIIIJ(user_right_privacy_policy);
            for (PrivacyPolicy privacyPolicy : list3) {
                LinearLayout user_right_privacy_policy2 = (LinearLayout) _$_findCachedViewById(R.id.n0g);
                o.LJIIIIZZ(user_right_privacy_policy2, "user_right_privacy_policy");
                C26715Ae7.LIZ(user_right_privacy_policy2, privacyPolicy.buttonText, Integer.valueOf(getStyle().getPolicyTextFont()), Integer.valueOf(getStyle().getPolicyTextColor()), new AqS151S0200000_4(this, privacyPolicy, 10));
                String str3 = privacyPolicy.nameEn;
                if (str3 == null) {
                    str3 = "terms_of_use_and_sale";
                }
                logButtonShow(str3);
            }
        }
        logEnterPage();
    }

    public View com_ss_android_ugc_aweme_ecommerce_base_pdp_subpage_userright_UserRightFragment__onCreateView$___twin___(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        if (context != null) {
            View LIZ = C27531ArH.LIZ(R.layout.a54, context, viewGroup, false);
            LIZ.setPadding(getStyle().getPagePadding(), LIZ.getPaddingTop(), getStyle().getPagePadding(), LIZ.getPaddingBottom());
            return LIZ;
        }
        return null;
    }

    public static View com_ss_android_ugc_aweme_ecommerce_base_pdp_subpage_userright_UserRightFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(UserRightFragment userRightFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View com_ss_android_ugc_aweme_ecommerce_base_pdp_subpage_userright_UserRightFragment__onCreateView$___twin___ = userRightFragment.com_ss_android_ugc_aweme_ecommerce_base_pdp_subpage_userright_UserRightFragment__onCreateView$___twin___(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(com_ss_android_ugc_aweme_ecommerce_base_pdp_subpage_userright_UserRightFragment__onCreateView$___twin___ instanceof View)) {
            com_ss_android_ugc_aweme_ecommerce_base_pdp_subpage_userright_UserRightFragment__onCreateView$___twin___ = null;
        }
        if (com_ss_android_ugc_aweme_ecommerce_base_pdp_subpage_userright_UserRightFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(com_ss_android_ugc_aweme_ecommerce_base_pdp_subpage_userright_UserRightFragment__onCreateView$___twin___, userRightFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(com_ss_android_ugc_aweme_ecommerce_base_pdp_subpage_userright_UserRightFragment__onCreateView$___twin___, userRightFragment);
                C10A.LIZIZ(com_ss_android_ugc_aweme_ecommerce_base_pdp_subpage_userright_UserRightFragment__onCreateView$___twin___, userRightFragment);
                ActivityC45651qj mo49getActivity = userRightFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return com_ss_android_ugc_aweme_ecommerce_base_pdp_subpage_userright_UserRightFragment__onCreateView$___twin___;
    }
}
