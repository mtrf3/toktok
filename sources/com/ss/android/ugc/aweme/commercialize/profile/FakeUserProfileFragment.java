package com.ss.android.ugc.aweme.commercialize.profile;

import X.AW4;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C207668Da;
import X.C221108m2;
import X.C27740Aue;
import X.C29S;
import X.C3C5;
import X.C45631qh;
import X.C59671NbP;
import X.C59744Nca;
import X.C59745Ncb;
import X.C61447O9r;
import X.C62562cu;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C76800UCe;
import X.C90903hW;
import X.NPC;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.ACListenerS30S0100000_10;
import Y.AObjectS50S0101000_5;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.commercialize.model.FakeAuthor;
import com.ss.android.ugc.aweme.commercialize.utils.ViewWrapper;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileNewBottomBarWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoNewDescWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget;
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
public final class FakeUserProfileFragment extends CommonPageFragment implements AW4, Observer<C207668Da> {
    public static final /* synthetic */ int LL = 0;
    public Aweme LJLLLLLL;
    public String LJLZ;
    public DataCenter LJZ;
    public WidgetManager LJZI;
    public final Map<Integer, View> LJZL = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 117));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 121));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 114));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 118));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 122));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 124));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 123));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 119));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 112));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 113));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 125));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 116));
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 115));

    @Override // X.AW4
    public final void LJJLL(String str) {
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.ui.CommonPageFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZL;
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

    @Override // X.AW4
    public final Fragment qd() {
        return this;
    }

    static {
        C16880lQ.LJLLJ(FakeUserProfileFragment.class);
    }

    public final boolean Al() {
        AwemeRawAd awemeRawAd;
        FakeAuthor fakeAuthor;
        Integer fakeAuthorVersion;
        Aweme aweme = this.LJLLLLLL;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null || (fakeAuthorVersion = fakeAuthor.getFakeAuthorVersion()) == null || fakeAuthorVersion.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final View wl() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-mRootView>(...)");
        return (View) value;
    }

    public final TextView xl() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-mTitle>(...)");
        return (TextView) value;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataCenter dataCenter = this.LJZ;
        if (dataCenter != null) {
            dataCenter.kv0(this);
        }
    }

    @Override // X.AW4
    public final void X4(AObjectS50S0101000_5 aObjectS50S0101000_5) {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-mBack>(...)");
        C16880lQ.LJIILLIIL((ImageView) value, new ACListenerS30S0100000_10(aObjectS50S0101000_5, 26));
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 == null || (str = c207668Da2.LIZ) == null || str.hashCode() != 860337036 || !str.equals("ON_VIDEO_CONTAINER_SIZE_CHANGE")) {
            return;
        }
        Rect LIZLLL = C27740Aue.LIZLLL(wl().findViewById(R.id.n4r));
        View findViewById = wl().findViewById(R.id.n4q);
        Rect LIZLLL2 = C27740Aue.LIZLLL(findViewById);
        float LJIILL = (C27740Aue.LIZLLL(wl().findViewById(R.id.qb)).top + (C17N.LJIILL(-16.0d) - wl().findViewById(R.id.qb).getTranslationY())) - LIZLLL.top;
        if (Al()) {
            LJIILL = C27740Aue.LIZLLL(wl().findViewById(R.id.cvu)).top - LIZLLL.top;
        }
        if (LJIILL - LIZLLL2.height() > 0.0f) {
            findViewById.setTranslationY((LJIILL - LIZLLL2.height()) / 2.0f);
        }
        Rect LIZLLL3 = C27740Aue.LIZLLL(wl());
        View findViewById2 = wl().findViewById(R.id.n4v);
        int i = LIZLLL3.bottom - C27740Aue.LIZLLL(findViewById2).top;
        if (i <= 0) {
            return;
        }
        ViewWrapper viewWrapper = new ViewWrapper(findViewById2);
        viewWrapper.setWidth(LIZLLL3.width());
        viewWrapper.setHeight(i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-7463102876187665113");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/commercialize/profile/FakeUserProfileFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/profile/FakeUserProfileFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        DataCenter dataCenter = this.LJZ;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.valueOf(z), "AD_PROFILE_VISIBILITY_CHANGED");
        }
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
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/profile/FakeUserProfileFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.AW4
    public final void setVisible(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("visible=");
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        setUserVisibleHint(z);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        User user;
        String str5;
        AwemeRawAd awemeRawAd;
        FakeAuthor fakeAuthor;
        String str6;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        String str7;
        String str8;
        String str9;
        AwemeRawAd awemeRawAd4;
        AwemeRawAd awemeRawAd5;
        AwemeRawAd awemeRawAd6;
        FakeAuthor fakeAuthor2;
        User author;
        User author2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str10 = null;
        if (arguments != null) {
            str = arguments.getString("aweme_id");
        } else {
            str = null;
        }
        this.LJLLLLLL = NPC.LIZJ(str);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("enter_from");
        } else {
            str2 = null;
        }
        this.LJLZ = str2;
        DataCenter gv0 = DataCenter.gv0(ViewModelProviders.of(this), this);
        this.LJZ = gv0;
        C59671NbP c59671NbP = new C59671NbP();
        new AqS176S0100000_10(this, 33).invoke(c59671NbP.LIZ);
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
        TextView xl = xl();
        Aweme aweme = this.LJLLLLLL;
        if (aweme != null && (author2 = aweme.getAuthor()) != null) {
            str3 = author2.getNickname();
        } else {
            str3 = null;
        }
        xl.setText(str3);
        Object value3 = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value3, "<get-mScrollView>(...)");
        ((C45631qh) value3).setOnScrollChangeListener(new C59744Nca(this));
        Object value4 = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value4, "<get-mUserName>(...)");
        TextView textView = (TextView) value4;
        Aweme aweme2 = this.LJLLLLLL;
        if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
            str4 = author.getNickname();
        } else {
            str4 = null;
        }
        textView.setText(str4);
        Aweme aweme3 = this.LJLLLLLL;
        if (aweme3 != null) {
            user = aweme3.getAuthor();
        } else {
            user = null;
        }
        C62562cu LIZ = C59745Ncb.LIZ(user);
        if (LIZ != null) {
            W5F LJIIIZ = W5U.LJIIIZ(LIZ);
            Object value5 = this.LJLJL.getValue();
            o.LJIIIIZZ(value5, "<get-mUserAvatar>(...)");
            LJIIIZ.LJJIIJ = (SmartImageView) value5;
            C16880lQ.LLJJJ(LJIIIZ);
        }
        if (Al()) {
            Object value6 = this.LJLL.getValue();
            o.LJIIIIZZ(value6, "<get-mTips>(...)");
            ((View) value6).setVisibility(0);
            Object value7 = this.LJLJLLL.getValue();
            o.LJIIIIZZ(value7, "<get-mUserDesc>(...)");
            ((View) value7).setVisibility(8);
            Object value8 = this.LJLL.getValue();
            o.LJIIIIZZ(value8, "<get-mTips>(...)");
            TextView textView2 = (TextView) value8;
            Aweme aweme4 = this.LJLLLLLL;
            if (aweme4 != null && (awemeRawAd6 = aweme4.getAwemeRawAd()) != null && (fakeAuthor2 = awemeRawAd6.getFakeAuthor()) != null) {
                str7 = fakeAuthor2.getDescription();
            } else {
                str7 = null;
            }
            textView2.setText(str7);
            Object value9 = this.LJLLI.getValue();
            o.LJIIIIZZ(value9, "<get-mAdBottomBarLayout>(...)");
            ((View) value9).setVisibility(8);
            Object value10 = this.LJLLJ.getValue();
            o.LJIIIIZZ(value10, "<get-mVideoDesc>(...)");
            ((View) value10).setVisibility(8);
            Object value11 = this.LJLLLL.getValue();
            o.LJIIIIZZ(value11, "<get-mEmptyView>(...)");
            ((View) value11).setVisibility(0);
            Aweme aweme5 = this.LJLLLLLL;
            if (aweme5 != null && (awemeRawAd5 = aweme5.getAwemeRawAd()) != null) {
                str8 = awemeRawAd5.getOpenUrl();
            } else {
                str8 = null;
            }
            if (!NPC.LJI(str8)) {
                Aweme aweme6 = this.LJLLLLLL;
                if (aweme6 != null && (awemeRawAd4 = aweme6.getAwemeRawAd()) != null) {
                    str9 = awemeRawAd4.getType();
                } else {
                    str9 = null;
                }
                if (!o.LJ(str9, "app")) {
                    Object value12 = this.LJLLILLLL.getValue();
                    o.LJIIIIZZ(value12, "<get-mAdBottomBarNewLayout>(...)");
                    ((View) value12).setVisibility(8);
                }
            }
        } else {
            Object value13 = this.LJLL.getValue();
            o.LJIIIIZZ(value13, "<get-mTips>(...)");
            ((View) value13).setVisibility(8);
            Object value14 = this.LJLJLLL.getValue();
            o.LJIIIIZZ(value14, "<get-mUserDesc>(...)");
            ((View) value14).setVisibility(0);
            Object value15 = this.LJLJLLL.getValue();
            o.LJIIIIZZ(value15, "<get-mUserDesc>(...)");
            TextView textView3 = (TextView) value15;
            Aweme aweme7 = this.LJLLLLLL;
            if (aweme7 != null && (awemeRawAd = aweme7.getAwemeRawAd()) != null && (fakeAuthor = awemeRawAd.getFakeAuthor()) != null) {
                str5 = fakeAuthor.getDescription();
            } else {
                str5 = null;
            }
            textView3.setText(str5);
            Object value16 = this.LJLLL.getValue();
            o.LJIIIIZZ(value16, "<get-mNewVideoDesc>(...)");
            ((View) value16).setVisibility(8);
            Object value17 = this.LJLLILLLL.getValue();
            o.LJIIIIZZ(value17, "<get-mAdBottomBarNewLayout>(...)");
            ((View) value17).setVisibility(8);
            Object value18 = this.LJLLLL.getValue();
            o.LJIIIIZZ(value18, "<get-mEmptyView>(...)");
            ((View) value18).setVisibility(8);
        }
        DataCenter dataCenter = this.LJZ;
        if (dataCenter != null) {
            dataCenter.iv0("ON_VIDEO_CONTAINER_SIZE_CHANGE", this, false);
        }
        WidgetManager xl2 = WidgetManager.xl(null, this, wl(), getContext());
        this.LJZI = xl2;
        if (xl2 != null) {
            xl2.Hl(this.LJZ);
        }
        WidgetManager widgetManager = this.LJZI;
        if (widgetManager != null) {
            widgetManager.vl(R.id.n4r, new AdFakeUserProfileVideoPlayWidget());
            if (Al()) {
                widgetManager.vl(R.id.n5h, new AdFakeUserProfileVideoNewDescWidget());
                Aweme aweme8 = this.LJLLLLLL;
                if (aweme8 != null && (awemeRawAd3 = aweme8.getAwemeRawAd()) != null) {
                    str6 = awemeRawAd3.getOpenUrl();
                } else {
                    str6 = null;
                }
                if (!NPC.LJI(str6)) {
                    Aweme aweme9 = this.LJLLLLLL;
                    if (aweme9 != null && (awemeRawAd2 = aweme9.getAwemeRawAd()) != null) {
                        str10 = awemeRawAd2.getType();
                    }
                    if (!o.LJ(str10, "app")) {
                        widgetManager.vl(R.id.rh, new AdFakePopUpWebPageWidget());
                        return;
                    }
                }
                widgetManager.vl(R.id.qc, new AdFakeUserProfileNewBottomBarWidget());
                return;
            }
            widgetManager.vl(R.id.qb, new AdFakeUserProfileBottomBarWidget());
            widgetManager.vl(R.id.n5f, new AdFakeUserProfileVideoDescWidget());
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awh, viewGroup, false);
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
