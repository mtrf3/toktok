package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C221108m2;
import X.C62822Ol8;
import X.C80675VlP;
import X.C85599Xid;
import X.C85603Xih;
import X.C85604Xii;
import X.C85605Xij;
import X.C85606Xik;
import X.C85607Xil;
import X.C85712XkS;
import X.EnumC69113RAn;
import Y.IDiS276S0100000_15;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PhoneEmailSignUpFragment extends BaseI18nLoginFragment {
    public C85599Xid LJZL;
    public final Map<Integer, View> LLFII = new LinkedHashMap();
    public int LL = -1;
    public boolean LLD = true;
    public boolean LLF = true;
    public final C62822Ol8 LLFF = C221108m2.LIZIZ(new C85607Xil(this));
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(new C85606Xik(this));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFII).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFII;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int getLayout() {
        return R.layout.on;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        String string;
        if (Al() == EnumC69113RAn.COMBINED_LOGIN_SIGN_UP) {
            string = getString(R.string.di4);
        } else {
            string = getString(R.string.doj);
        }
        return new C85712XkS(string, null, false, null, null, false, "phone_sign_up_homepage", false, false, 126974);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        KeyboardUtils.LIZIZ(getView());
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        getChildFragmentManager().LJJLIL(new C85604Xii(this), true);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        int i = this.LL;
        if (i == -1) {
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getInt("child_page") == EnumC69113RAn.INPUT_EMAIL_SIGN_UP.getValue()) {
                i = 1;
            } else {
                i = 0;
            }
        }
        int i2 = this.LL;
        if (i2 != i) {
            if (i2 != -1) {
                this.LLD = false;
            }
            this.LL = i;
            ((ViewPager) _$_findCachedViewById(R.id.hng)).setCurrentItem(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        C85599Xid c85599Xid = new C85599Xid(childFragmentManager);
        this.LJZL = c85599Xid;
        c85599Xid.LJJIIJ((C85603Xih) this.LLFF.getValue());
        C85599Xid c85599Xid2 = this.LJZL;
        if (c85599Xid2 != null) {
            c85599Xid2.LJJIIJ((C85603Xih) this.LLFFF.getValue());
            ViewPager viewPager = (ViewPager) _$_findCachedViewById(R.id.hng);
            C85599Xid c85599Xid3 = this.LJZL;
            if (c85599Xid3 != null) {
                viewPager.setAdapter(c85599Xid3);
                ((C80675VlP) _$_findCachedViewById(R.id.hnh)).setCustomTabViewResId(R.layout.o6);
                ((C80675VlP) _$_findCachedViewById(R.id.hnh)).setupWithViewPager((ViewPager) _$_findCachedViewById(R.id.hng));
                ((ViewPager) _$_findCachedViewById(R.id.hng)).addOnPageChangeListener(new IDiS276S0100000_15(this, 1));
                ((C80675VlP) _$_findCachedViewById(R.id.hnh)).setOnTabClickListener(new C85605Xij(this));
                return;
            }
            o.LJIJI("tabAdapter");
            throw null;
        }
        o.LJIJI("tabAdapter");
        throw null;
    }
}
