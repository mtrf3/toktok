package com.ss.android.ugc.aweme.commercialize.profile;

import X.AW4;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C27740Aue;
import X.C29S;
import X.C3C5;
import X.C58704N2e;
import X.C59671NbP;
import X.C59742NcY;
import X.C61447O9r;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78977Uz7;
import X.C80648Vky;
import X.C90903hW;
import X.InterfaceC65784Pro;
import X.NPC;
import Y.ACListenerS30S0100000_10;
import Y.AObjectS50S0101000_5;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdNewFakeUserProfileFragment extends CommonPageFragment implements AW4 {
    public static final /* synthetic */ int LJLLLL = 0;
    public Aweme LJLL;
    public DataCenter LJLLI;
    public InterfaceC65784Pro<C76800UCe> LJLLILLLL;
    public WidgetManager LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 104));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 106));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 107));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 102));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 101));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 105));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 100));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 103));

    @Override // X.AW4
    public final void LJJLL(String str) {
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
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

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.AW4
    public final Fragment qd() {
        return this;
    }

    public final TextView wl() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-mTitleBarNickname>(...)");
        return (TextView) value;
    }

    @Override // X.AW4
    public final void X4(AObjectS50S0101000_5 aObjectS50S0101000_5) {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-mBackBtn>(...)");
        C16880lQ.LJIIJ(new ACListenerS30S0100000_10(aObjectS50S0101000_5, 27), (View) value);
        this.LJLLILLLL = aObjectS50S0101000_5;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        AwemeRawAd awemeRawAd;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "509082750617057486");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/commercialize/profile/AdNewFakeUserProfileFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/profile/AdNewFakeUserProfileFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        C27740Aue.LJIIIIZZ(mo49getActivity());
        if (z) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null && Build.VERSION.SDK_INT >= 23) {
                mo49getActivity.getWindow().getDecorView().setSystemUiVisibility(mo49getActivity.getWindow().getDecorView().getSystemUiVisibility() | FileUtils.BUFFER_SIZE);
            }
        } else {
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null && Build.VERSION.SDK_INT >= 23) {
                mo49getActivity2.getWindow().getDecorView().setSystemUiVisibility(1024);
            }
        }
        DataCenter dataCenter = this.LJLLI;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.valueOf(z), "AD_PROFILE_VISIBILITY_CHANGED");
        }
        if (!z) {
            Aweme aweme = this.LJLL;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C58704N2e.LIZLLL("homepage_ad", "close", awemeRawAd).LJI();
            AwemeService.LIZ().R1(this.LJLL);
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/profile/AdNewFakeUserProfileFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.AW4
    public final void setVisible(boolean z) {
        setUserVisibleHint(z);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Aweme aweme;
        String str2;
        boolean z;
        boolean z2;
        AwemeRawAd awemeRawAd;
        User author;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("aweme_id");
        } else {
            str = null;
        }
        this.LJLL = NPC.LIZJ(str);
        DataCenter gv0 = DataCenter.gv0(ViewModelProviders.of(this), this);
        this.LJLLI = gv0;
        C59671NbP c59671NbP = new C59671NbP();
        new AqS176S0100000_10(this, 34).invoke(c59671NbP.LIZ);
        gv0.jv0(c59671NbP.LIZ, "AD_PROFILE_PARAMS");
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-mTitleBar>(...)");
        ViewGroup.LayoutParams layoutParams = ((View) value).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = C61447O9r.LIZJ(getContext());
            Object value2 = this.LJLJI.getValue();
            o.LJIIIIZZ(value2, "<get-mTitleBar>(...)");
            ((View) value2).setLayoutParams(marginLayoutParams);
        }
        Aweme aweme2 = this.LJLL;
        if ((aweme2 == null || !C63081OpJ.LLJILJIL(aweme2)) && ((aweme = this.LJLL) == null || !C63081OpJ.LLJI(aweme))) {
            Object value3 = this.LJLJJLL.getValue();
            o.LJIIIIZZ(value3, "<get-mBottomDescView>(...)");
            ((View) value3).setVisibility(8);
        }
        TextView wl = wl();
        Aweme aweme3 = this.LJLL;
        if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
            str2 = author.getNickname();
        } else {
            str2 = null;
        }
        wl.setText(str2);
        Object value4 = this.LJLJL.getValue();
        o.LJIIIIZZ(value4, "<get-mScrollView>(...)");
        ((C80648Vky) value4).LIZIZ(new C59742NcY(this));
        Object value5 = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value5, "<get-mMoreBtn>(...)");
        C16880lQ.LJIIJ(new ACListenerS30S0100000_10(this, 28), (View) value5);
        Object value6 = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value6, "<get-mRootView>(...)");
        WidgetManager xl = WidgetManager.xl(null, this, (View) value6, getContext());
        this.LJLLJ = xl;
        if (xl != null) {
            xl.Hl(this.LJLLI);
        }
        WidgetManager widgetManager = this.LJLLJ;
        if (widgetManager != null) {
            Aweme aweme4 = this.LJLL;
            if (aweme4 != null && C63081OpJ.LLJILJIL(aweme4)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                widgetManager.vl(R.id.sz, new AdNewFakeBottomDescBarWidget(false));
            } else {
                Aweme aweme5 = this.LJLL;
                if (aweme5 == null || (awemeRawAd = aweme5.getAwemeRawAd()) == null || !C78977Uz7.LJJLIIIJJI(awemeRawAd) || TextUtils.isEmpty(awemeRawAd.getWebUrl()) || ((C78977Uz7.LJJJJL(awemeRawAd) || C63081OpJ.LJJL(aweme5) || !C78977Uz7.LJJLIIIJILLIZJL(awemeRawAd) || !C63081OpJ.LLIILII(aweme5)) && ((C78977Uz7.LJJJJL(awemeRawAd) || C63081OpJ.LJJL(aweme5) || C78977Uz7.LJJLIIIJILLIZJL(awemeRawAd) || !C63081OpJ.LLIILII(aweme5)) && (!C78977Uz7.LJJJJL(awemeRawAd) || !C63081OpJ.LLIILII(aweme5))))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    widgetManager.vl(R.id.t4, new AdNewFakePopUpWebPageWidget());
                } else {
                    Aweme aweme6 = this.LJLL;
                    if (aweme6 != null && C63081OpJ.LLJI(aweme6)) {
                        widgetManager.vl(R.id.sz, new AdNewFakeBottomDescBarWidget(true));
                        widgetManager.vl(R.id.t4, new AdNewFakePopUpWebPageWidget());
                    }
                }
            }
            widgetManager.vl(R.id.d3n, new AdNewFakeUserProfileHeaderWidget());
            AdNewFakeUserProfileDetailFragmentWidget adNewFakeUserProfileDetailFragmentWidget = new AdNewFakeUserProfileDetailFragmentWidget();
            adNewFakeUserProfileDetailFragmentWidget.LLF = new AqS160S0100000_10(this, 126);
            adNewFakeUserProfileDetailFragmentWidget.LJIJJLI();
            widgetManager.vl(R.id.jd1, adNewFakeUserProfileDetailFragmentWidget);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c4k, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
