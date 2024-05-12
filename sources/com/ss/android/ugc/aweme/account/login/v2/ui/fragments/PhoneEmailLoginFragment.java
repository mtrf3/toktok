package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C0JU;
import X.C12460eI;
import X.C221108m2;
import X.C39082FVm;
import X.C62822Ol8;
import X.C80672VlM;
import X.C80674VlO;
import X.C80675VlP;
import X.C85597Xib;
import X.C85599Xid;
import X.C85600Xie;
import X.C85601Xif;
import X.C85603Xih;
import X.C85712XkS;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.InterfaceC18010nF;
import X.InterfaceC36571c5;
import X.KL2;
import Y.IDiS276S0100000_15;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PhoneEmailLoginFragment extends BaseI18nLoginFragment {
    public C85599Xid LJZL;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public final C62822Ol8 LL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 186));
    public int LLD = -1;
    public boolean LLF = true;
    public boolean LLFF = true;
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(new C85601Xif(this));
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(new C85600Xie(this));

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
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFZ;
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
        return R.layout.om;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        boolean z;
        String string = getString(R.string.dq8);
        if (xl() != EnumC69116RAq.RECOVER_ACCOUNT) {
            z = true;
        } else {
            z = false;
        }
        return new C85712XkS(string, null, false, null, null, false, "phone_login_homepage", z, false, 118782);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C85599Xid c85599Xid = this.LJZL;
        if (c85599Xid != null) {
            InterfaceC36571c5 LJJIII = c85599Xid.LJJIII(this.LLD);
            if (LJJIII instanceof InterfaceC18010nF) {
                C12460eI.LJIIIIZZ((InterfaceC18010nF) LJJIII, mo49getActivity());
                return;
            }
            return;
        }
        o.LJIJI("tabAdapter");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        int i = this.LLD;
        if (i == -1) {
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getInt("child_page") == EnumC69113RAn.INPUT_EMAIL_LOGIN.getValue()) {
                i = 1;
            } else {
                i = 0;
            }
        }
        int i2 = this.LLD;
        if (i2 != i) {
            if (i2 != -1) {
                this.LLF = false;
            }
            this.LLD = i;
            ((ViewPager) _$_findCachedViewById(R.id.hne)).setCurrentItem(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        float f;
        C80672VlM c80672VlM;
        TextView customTextView;
        TextPaint paint;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C39082FVm.LIZ()) {
            LinkedHashMap LIZ = C0JU.LIZ("monitor_scene", "scene_login");
            LIZ.put("vv_code", 2212);
            C39082FVm.LIZJ(LIZ);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        C85599Xid c85599Xid = new C85599Xid(childFragmentManager);
        this.LJZL = c85599Xid;
        c85599Xid.LJJIIJ((C85603Xih) this.LLFFF.getValue());
        C85599Xid c85599Xid2 = this.LJZL;
        if (c85599Xid2 != null) {
            c85599Xid2.LJJIIJ((C85603Xih) this.LLFII.getValue());
            ViewPager viewPager = (ViewPager) _$_findCachedViewById(R.id.hne);
            C85599Xid c85599Xid3 = this.LJZL;
            if (c85599Xid3 != null) {
                viewPager.setAdapter(c85599Xid3);
                ((C80675VlP) _$_findCachedViewById(R.id.hnf)).setCustomTabViewResId(R.layout.o6);
                ((C80675VlP) _$_findCachedViewById(R.id.hnf)).setupWithViewPager((ViewPager) _$_findCachedViewById(R.id.hne));
                ((ViewPager) _$_findCachedViewById(R.id.hne)).addOnPageChangeListener(new IDiS276S0100000_15(this, 0));
                ((C80675VlP) _$_findCachedViewById(R.id.hnf)).setOnTabClickListener(new C85597Xib(this));
                C80674VlO LJIIJ = ((C80675VlP) _$_findCachedViewById(R.id.hnf)).LJIIJ(1);
                if (LJIIJ != null && (c80672VlM = LJIIJ.LJIIIIZZ) != null && (customTextView = c80672VlM.getCustomTextView()) != null && (paint = customTextView.getPaint()) != null) {
                    f = paint.measureText(((C85603Xih) this.LLFII.getValue()).LIZIZ);
                } else {
                    f = 0.0f;
                }
                if (KL2.LIZJ(getContext(), 24.0f) + f > KL2.LJIIJJI(getContext()) / 2) {
                    ((C80675VlP) _$_findCachedViewById(R.id.hnf)).setTabMode(0);
                }
                Integer num = (Integer) this.LL.getValue();
                if (num != null) {
                    ((ViewPager) _$_findCachedViewById(R.id.hne)).setCurrentItem(num.intValue());
                    return;
                }
                return;
            }
            o.LJIJI("tabAdapter");
            throw null;
        }
        o.LJIJI("tabAdapter");
        throw null;
    }
}
