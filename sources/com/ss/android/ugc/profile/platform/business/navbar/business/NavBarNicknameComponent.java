package com.ss.android.ugc.profile.platform.business.navbar.business;

import X.AV1;
import X.AV3;
import X.AV6;
import X.AV9;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.AnonymousClass899;
import X.C17J;
import X.C2068389v;
import X.C212428Vi;
import X.C221108m2;
import X.C234159Gx;
import X.C235599Ml;
import X.C235639Mp;
import X.C237429Tm;
import X.C237869Ve;
import X.C237889Vg;
import X.C252709vu;
import X.C255199zv;
import X.C255209zw;
import X.C26197APx;
import X.C32151Nz;
import X.C32I;
import X.C54305LSz;
import X.C54362LVe;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C78975Uz5;
import X.C7MY;
import X.C8FR;
import X.C8YN;
import X.C90193gN;
import X.C9H0;
import X.C9IL;
import X.C9KF;
import X.C9VG;
import X.C9VL;
import X.C9VW;
import X.HG3;
import X.InterfaceC55235Lm3;
import X.InterfaceC88472Yns;
import X.O6R;
import X.ORZ;
import X.RBX;
import X.T5U;
import X.TBT;
import X.X1D;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.google.gson.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditNicknameFragment;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarCenterAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarNicknameComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.data.NickNameData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public final class NavBarNicknameComponent extends NavbarBaseUIComponent<NickNameData> implements INavbarCenterAbility {
    public AV3 LJLILLLLZI;
    public SpannableStringBuilder LJLJI;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C78975Uz5 LJLIL = new C78975Uz5();
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C237889Vg.LJLIL);
    public final C9KF LJLJJL = new C9KF();
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 964));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C9VW.LJLIL);

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        ActivityC45651qj LIZ;
        AV3 av3 = this.LJLILLLLZI;
        if (av3 != null) {
            EventBus.LIZJ().LJIJ(av3);
            av3.LIZLLL = 0;
            AV3.LJ = false;
        }
        this.LJLILLLLZI = null;
        if (C26197APx.LIZJ() && (LIZ = C212428Vi.LIZ(this)) != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZLLL(LIZ, null), INavbarCenterAbility.class, null);
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        boolean z;
        String str2;
        UserProfileInfo userProfileInfo;
        String str3;
        C9H0 c9h0;
        String x3;
        C235639Mp c235639Mp;
        C8FR c8fr;
        String str4;
        C9H0 c9h02;
        Describe describe;
        Describe describe2;
        UserProfileInfo userProfileInfo2;
        List<String> boldFields;
        Icon icon;
        Integer iconInt$default;
        NickNameData nickNameData = (NickNameData) this.bizBaseData;
        String str5 = "";
        if (nickNameData == null || (str = nickNameData.getSubTitle()) == null) {
            str = "";
        }
        T t = this.bizBaseData;
        int i = R.raw.icon_chevron_down_fill;
        if (t != 0 && (icon = t.getIcon()) != null && (iconInt$default = Icon.getIconInt$default(icon, null, Integer.valueOf(R.raw.icon_chevron_down_fill), 1, null)) != null) {
            i = iconInt$default.intValue();
        }
        ProfileCommonInfo commonInfo = getCommonInfo();
        if (commonInfo != null && (userProfileInfo2 = commonInfo.getUserProfileInfo()) != null && (boldFields = userProfileInfo2.getBoldFields()) != null) {
            z = boldFields.contains("nickname");
        } else {
            z = false;
        }
        T t2 = this.bizBaseData;
        if ((t2 == 0 || (describe2 = t2.getDescribe()) == null || (str2 = describe2.getText()) == null) && (commonInfo == null || (userProfileInfo = commonInfo.getUserProfileInfo()) == null || (str2 = userProfileInfo.getNickname()) == null)) {
            str2 = "";
        }
        if (!C235599Ml.LIZ() || z || !o.LJ(x3(), str2)) {
            C9IL c9il = C9IL.NAV;
            String lowerCase = "HAS_PRONOUNS".toLowerCase();
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            C17J.LJIILLIIL(this, true, c9il, lowerCase, !TextUtils.isEmpty(str));
            C9KF c9kf = this.LJLJJL;
            c9kf.getClass();
            c9kf.LIZJ = str2;
            c9kf.LIZLLL = A3(str);
            c9kf.LJ = i;
            c9kf.LIZ = new C237869Ve(new AqS154S0100000_4(this, 965));
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
            C234159Gx data = getData();
            if (data == null || (c9h0 = data.LJLIL) == null || (str3 = c9h0.getValue()) == null) {
                str3 = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, str3);
            if (iNavbarBaseAbility != null) {
                String str6 = this.assemTagInternal;
                if (str6 != null) {
                    str5 = str6;
                }
                iNavbarBaseAbility.AC(c9kf, str5);
            }
            AV3 av3 = this.LJLILLLLZI;
            if (av3 != null) {
                av3.LIZJ = null;
            }
            F3();
            return;
        }
        T t3 = this.bizBaseData;
        if (t3 == 0 || (describe = t3.getDescribe()) == null || (x3 = describe.getText()) == null) {
            x3 = x3();
        }
        Context context = getContext();
        if (context != null) {
            c235639Mp = new C235639Mp(context);
            ((TuxTag) c235639Mp.LJLIL).setTagSize(3);
            c235639Mp.LIZ(x3);
            ((TuxTag) c235639Mp.LJLIL).setTagTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gu, context));
            ((TuxTag) c235639Mp.LJLIL).setTagBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cg, context));
        } else {
            c235639Mp = null;
        }
        AnonymousClass899 anonymousClass899 = new AnonymousClass899() { // from class: X.9VV
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                String str7;
                UserProfileInfo userProfileInfo3;
                o.LJIIIZ(widget, "widget");
                User curUser = HG3.LJIILL().getCurUser();
                ProfileCommonInfo commonInfo2 = NavBarNicknameComponent.this.getCommonInfo();
                if (commonInfo2 != null && (userProfileInfo3 = commonInfo2.getUserProfileInfo()) != null) {
                    str7 = userProfileInfo3.getSecUid();
                } else {
                    str7 = null;
                }
                curUser.setSecUid(str7);
                NavBarNicknameComponent navBarNicknameComponent = NavBarNicknameComponent.this;
                navBarNicknameComponent.LJLIL.LIZIZ(curUser, new C86204XsO(curUser, navBarNicknameComponent));
            }
        };
        Context context2 = getContext();
        if (context2 != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = i;
            c2068389v.LIZIZ = C7MY.LIZIZ(14);
            c2068389v.LIZJ = C7MY.LIZIZ(14);
            c8fr = c2068389v.LIZIZ(2, context2);
            if (c8fr != null) {
                C8FR.LIZJ(c8fr, C90193gN.LIZ(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), 0, 4);
            }
        } else {
            c8fr = null;
        }
        AnonymousClass899 anonymousClass8992 = new AnonymousClass899() { // from class: X.9Vb
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                o.LJIIIZ(widget, "widget");
                NavBarNicknameComponent.this.v3();
            }
        };
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "12");
        spannableStringBuilder.setSpan(c235639Mp, 0, 1, 17);
        spannableStringBuilder.setSpan(anonymousClass899, 0, 1, 17);
        spannableStringBuilder.setSpan(c8fr, 1, 2, 17);
        spannableStringBuilder.setSpan(anonymousClass8992, 1, 2, 17);
        AV3 av32 = this.LJLILLLLZI;
        if (av32 != null) {
            av32.LIZJ = spannableStringBuilder;
        }
        this.LJLJI = spannableStringBuilder;
        InterfaceC55235Lm3 LJIIZILJ2 = C55096Ljo.LJIIZILJ(this);
        C234159Gx data2 = getData();
        if (data2 == null || (c9h02 = data2.LJLIL) == null || (str4 = c9h02.getValue()) == null) {
            str4 = "";
        }
        INavbarBaseAbility iNavbarBaseAbility2 = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ2, INavbarBaseAbility.class, str4);
        if (iNavbarBaseAbility2 != null) {
            C9KF c9kf2 = this.LJLJJL;
            c9kf2.getClass();
            c9kf2.LIZJ = spannableStringBuilder;
            c9kf2.LIZLLL = A3(str);
            c9kf2.LJ = 0;
            c9kf2.LIZ = null;
            String str7 = this.assemTagInternal;
            if (str7 != null) {
                str5 = str7;
            }
            iNavbarBaseAbility2.AC(c9kf2, str5);
        }
        F3();
    }

    public final void E3() {
        C9H0 c9h0;
        String value;
        int LJFF;
        C9H0 c9h02;
        String value2;
        C9H0 c9h03;
        String value3;
        int LJIILLIIL;
        String str = "";
        if (HG3.LJIIIIZZ().isEnableMultiAccountLogin()) {
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            if (C54305LSz.LIZJ()) {
                List<String> allUidList = ((RBX) HG3.LJIILL()).allUidList();
                o.LJIIIIZZ(allUidList, "userService().allUidList()");
                ArrayList arrayList = new ArrayList(C32I.LJJL(allUidList, 10));
                for (String it : allUidList) {
                    if (o.LJ(curUserId, it)) {
                        LJIILLIIL = 0;
                    } else {
                        o.LJIIIIZZ(it, "it");
                        LJIILLIIL = C54362LVe.LJIILLIIL(it);
                    }
                    arrayList.add(Integer.valueOf(LJIILLIIL));
                }
                LJFF = ORZ.LLILLIZIL(arrayList);
            } else {
                LJFF = C54362LVe.LJFF();
            }
            updateComponentUIAndData();
            if (!C54305LSz.LIZJ()) {
                AV3 av3 = this.LJLILLLLZI;
                if (av3 != null) {
                    av3.LIZJ(true);
                    return;
                }
                return;
            }
            if (LJFF > 0) {
                InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
                C234159Gx data = getData();
                if (data != null && (c9h03 = data.LJLIL) != null && (value3 = c9h03.getValue()) != null) {
                    str = value3;
                }
                INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, str);
                if (iNavbarBaseAbility != null) {
                    iNavbarBaseAbility.showAlertBadge(true, 0);
                    return;
                }
                return;
            }
            InterfaceC55235Lm3 LJIIZILJ2 = C55096Ljo.LJIIZILJ(this);
            C234159Gx data2 = getData();
            if (data2 != null && (c9h02 = data2.LJLIL) != null && (value2 = c9h02.getValue()) != null) {
                str = value2;
            }
            INavbarBaseAbility iNavbarBaseAbility2 = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ2, INavbarBaseAbility.class, str);
            if (iNavbarBaseAbility2 == null) {
                return;
            }
            iNavbarBaseAbility2.showAlertBadge(false, 0);
            return;
        }
        updateComponentUIAndData();
        InterfaceC55235Lm3 LJIIZILJ3 = C55096Ljo.LJIIZILJ(this);
        C234159Gx data3 = getData();
        if (data3 != null && (c9h0 = data3.LJLIL) != null && (value = c9h0.getValue()) != null) {
            str = value;
        }
        INavbarBaseAbility iNavbarBaseAbility3 = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ3, INavbarBaseAbility.class, str);
        if (iNavbarBaseAbility3 != null) {
            iNavbarBaseAbility3.showAlertBadge(false, 0);
        }
    }

    public final void F3() {
        TuxTextView tuxTextView;
        String str;
        View view;
        C9H0 c9h0;
        if (!C54305LSz.LIZJ()) {
            AV3 av3 = this.LJLILLLLZI;
            if (av3 == null) {
                InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
                C234159Gx data = getData();
                String str2 = "";
                if (data == null || (c9h0 = data.LJLIL) == null || (str = c9h0.getValue()) == null) {
                    str = "";
                }
                INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, str);
                if (iNavbarBaseAbility != null) {
                    String str3 = this.assemTagInternal;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    view = iNavbarBaseAbility.rm(str2);
                } else {
                    view = null;
                }
                if (view instanceof TuxTextView) {
                    this.LJLILLLLZI = new AV3(getContext(), (TuxTextView) view, this.LJLJI);
                }
            } else if (AV3.LJ) {
                av3.LIZLLL();
            }
            AV3 av32 = this.LJLILLLLZI;
            if (av32 != null && (tuxTextView = av32.LIZIZ) != null) {
                tuxTextView.setMinTextSize(-1.0f);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        if (AV1.LIZIZ() != null) {
            E3();
        }
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            C8YN.LJII(this, profilePlatformVM, new TBT() { // from class: X.9Va
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PM) obj).LJLLJ;
                }
            }, null, new AqS186S0100000_4(this, 231), 6);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent
    public final void afterUpdateNavbarActions() {
        String str;
        C252709vu z5;
        TuxTextView tuxTextView;
        C9H0 c9h0;
        InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        C234159Gx data = getData();
        if (data == null || (c9h0 = data.LJLIL) == null || (str = c9h0.getValue()) == null) {
            str = "";
        }
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, str);
        if (iNavbarBaseAbility == null || (z5 = iNavbarBaseAbility.z5()) == null || (tuxTextView = (TuxTextView) z5.findViewById(R.id.gwk)) == null) {
            return;
        }
        tuxTextView.LJJIZ(17.0f, 22, (Typeface) this.LJLJL.getValue(), 0.02f);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        ActivityC45651qj LIZ;
        super.onCreate();
        if (C26197APx.LIZJ() && (LIZ = C212428Vi.LIZ(this)) != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LIZ, null), this, INavbarCenterAbility.class, null);
        }
    }

    public final void v3() {
        if (!HG3.LJIIIIZZ().isEnableMultiAccountLogin()) {
            return;
        }
        synchronized (this) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("profile_choose_account_dialog ");
            LIZ.append(((AV9) this.LJLJJI.getValue()).LIZ);
            String LIZIZ = X1D.LIZIZ(LIZ);
            FragmentManager fragmentManager = (FragmentManager) this.LJLJJLL.getValue();
            if (fragmentManager != null) {
                Fragment LJJJIL = fragmentManager.LJJJIL(LIZIZ);
                if (LJJJIL != null && LJJJIL.isAdded()) {
                } else {
                    AV6.LIZ(fragmentManager, (AV9) this.LJLJJI.getValue(), LIZIZ, null, null, null);
                }
            }
        }
    }

    public final String x3() {
        String str;
        Resources resources;
        Context context = getContext();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("+ ");
        if (context != null && (resources = context.getResources()) != null) {
            str = resources.getString(R.string.bfu);
        } else {
            str = null;
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public static CharSequence A3(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new T5U(62, false), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void C3(final User user) {
        C255209zw.LIZLLL("name", !C255199zv.LJIIJ(user, "nickname"));
        ProfileEditNicknameFragment LIZ = C9VG.LIZ(C255199zv.LJI(user, "click_card", "nickname"), "");
        LIZ.setUserVisibleHint(true);
        LIZ.LJLZ = new C9VL() { // from class: X.9VN
            @Override // X.C9VL
            public final void LIZ(String str, C237939Vl c237939Vl) {
                UserProfileInfo userProfileInfo;
                Describe describe;
                User.this.setNickname(str);
                NavBarNicknameComponent navBarNicknameComponent = this;
                ProfileCommonInfo commonInfo = navBarNicknameComponent.getCommonInfo();
                if (commonInfo == null) {
                    commonInfo = new ProfileCommonInfo();
                }
                ProfileCommonInfo commonInfo2 = navBarNicknameComponent.getCommonInfo();
                if (commonInfo2 == null || (userProfileInfo = commonInfo2.getUserProfileInfo()) == null) {
                    userProfileInfo = new UserProfileInfo();
                }
                userProfileInfo.setNickname(str);
                commonInfo.setUserProfileInfo(userProfileInfo);
                navBarNicknameComponent.updateCommonInfo(commonInfo);
                T t = this.bizBaseData;
                if (t != 0 && (describe = t.getDescribe()) != null) {
                    describe.setRemoteText(str);
                }
                ProfilePlatformViewModel profilePlatformVM = this.getProfilePlatformVM();
                if (profilePlatformVM == null) {
                    return;
                }
                ProfilePlatformViewModel.lv0(profilePlatformVM, 0, null, "onNicknameUpdated", 7);
                this.updateComponentUIAndData();
            }
        };
        FragmentManager fragmentManager = (FragmentManager) this.LJLJJLL.getValue();
        if (fragmentManager != null) {
            LIZ.show(fragmentManager, "EditWebsiteDialog");
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarCenterAbility
    public final AnimatorSet Ul(InterfaceC88472Yns<? super View, AnimatorSet> wrapMethod) {
        String str;
        C252709vu z5;
        View findViewById;
        C9H0 c9h0;
        o.LJIIIZ(wrapMethod, "wrapMethod");
        InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        C234159Gx data = getData();
        if (data == null || (c9h0 = data.LJLIL) == null || (str = c9h0.getValue()) == null) {
            str = "";
        }
        INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, str);
        if (iNavbarBaseAbility == null || (z5 = iNavbarBaseAbility.z5()) == null || (findViewById = z5.findViewById(R.id.gwm)) == null) {
            return null;
        }
        return wrapMethod.invoke(findViewById);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.bizBaseData = (T) C237429Tm.LIZ(jsonObject.toString(), NickNameData.class);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        m mVar = profileComponents.bizData;
        if (mVar != null) {
            parseComponentBizData(mVar);
        }
        updateComponentUIAndData();
    }
}
