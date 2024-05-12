package com.ss.android.ugc.aweme.commercialize.ba.impl.ui;

import X.AbstractC59064NGa;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C199097rd;
import X.C19N;
import X.C221108m2;
import X.C26338AVi;
import X.C29S;
import X.C3C5;
import X.C58978NCs;
import X.C59066NGc;
import X.C59421NTt;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C72818Shy;
import X.C73305Spp;
import X.C73306Spq;
import X.C76800UCe;
import X.C78983UzD;
import X.C90903hW;
import X.EnumC59241NMv;
import X.HG3;
import X.InterfaceC65784Pro;
import X.InterfaceC72822Si2;
import X.InterfaceC87073YFh;
import X.NGY;
import X.NV4;
import X.Q8U;
import X.RBX;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class BusinessPageFragment extends ProfileListFragment implements InterfaceC87073YFh, NV4, InterfaceC72822Si2 {
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public String LJLLI;
    public boolean LJLLLLLL;
    public InterfaceC65784Pro<C76800UCe> LJLZ;
    public View LJZ;
    public AbstractC59064NGa LLD;
    public final Map<Integer, View> LLF = new LinkedHashMap();
    public String LJLLILLLL = "others";
    public String LJLLJ = "";
    public String LJLLL = "";
    public String LJLLLL = "";
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 65));
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 67));
    public final C62822Ol8 LL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 66));

    @Override // X.InterfaceC87073YFh
    public final void LJ() {
    }

    @Override // X.C8Z7
    public final boolean LJJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void LL() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Oi() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.InterfaceC87073YFh
    public final void onScrollEnd() {
    }

    public final void Kl() {
        AbstractC59064NGa abstractC59064NGa;
        AbstractC59064NGa abstractC59064NGa2 = this.LLD;
        if (abstractC59064NGa2 == null) {
            C59066NGc Il = Il();
            if (Il != null) {
                abstractC59064NGa = AdHybridContainerManager.LIZLLL().LIZJ(Il, (C59421NTt) this.LL.getValue());
            } else {
                abstractC59064NGa = null;
            }
            this.LLD = abstractC59064NGa;
            if (abstractC59064NGa != null) {
                abstractC59064NGa.LJIJJ((C59421NTt) this.LL.getValue(), this, null);
                return;
            }
            return;
        }
        abstractC59064NGa2.LJIJJ((C59421NTt) this.LJZL.getValue(), this, null);
    }

    @Override // X.OGG
    public final View LJIJJ() {
        ScrollView Hl = Hl(this.LJZ);
        if (Hl != null) {
            return Hl;
        }
        return new ScrollView(getContext());
    }

    public final C59066NGc Il() {
        Context context = getContext();
        if (context != null) {
            return new C59066NGc("profile_business_page", EnumC59241NMv.SPARK, context, new NGY((String) null, (String) null, (String) null, (Integer) null, (Integer) null, 63));
        }
        return null;
    }

    public final void Jl() {
        ViewGroup viewGroup;
        String str;
        String str2;
        if (!isViewValid()) {
            return;
        }
        if (this.LJLJL || this.LJLJJI || this.LJLJJL || this.LJLJJLL || this.LJLJLJ) {
            View view = getView();
            if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
                return;
            }
            viewGroup.removeAllViews();
            String str3 = "";
            if (this.LJLJL) {
                str = getString(R.string.a7z);
                o.LJIIIIZZ(str, "getString(R.string.abnormal_user_state)");
                str2 = getString(R.string.a7t);
                o.LJIIIIZZ(str2, "getString(R.string.abnormal_no_account_found)");
            } else if (!this.LJLJJLL) {
                str = "";
                str2 = "";
            } else {
                str = getString(R.string.a7g);
                o.LJIIIIZZ(str, "getString(R.string.abnormal_banned_title)");
                String string = getString(R.string.a7f);
                o.LJIIIIZZ(string, "getString(R.string.abnormal_banned_desc)");
                Object[] objArr = new Object[1];
                String str4 = this.LJLLJ;
                if (str4 == null) {
                    str4 = "";
                }
                objArr[0] = str4;
                str2 = Q8U.LIZIZ(objArr, 1, string, "format(format, *args)");
            }
            if (this.LJLJLJ) {
                str = getString(R.string.b5i);
                o.LJIIIIZZ(str, "getString(R.string.acct_…_restriction_error_title)");
                str2 = getString(R.string.b5h);
                o.LJIIIIZZ(str2, "getString(R.string.acct_…k_restriction_error_desc)");
            } else if (this.LJLJJI) {
                String string2 = getString(R.string.a7m);
                o.LJIIIIZZ(string2, "getString(R.string.abnormal_blocked_title)");
                str2 = getString(R.string.a7l);
                o.LJIIIIZZ(str2, "getString(R.string.abnormal_blocked_desc)");
                Object[] objArr2 = new Object[1];
                String str5 = this.LJLLJ;
                if (str5 != null) {
                    str3 = str5;
                }
                objArr2[0] = str3;
                str = Q8U.LIZIZ(objArr2, 1, string2, "format(format, *args)");
            } else if (this.LJLJJL) {
                str = getString(R.string.a7z);
                o.LJIIIIZZ(str, "getString(R.string.abnormal_user_state)");
                str2 = getString(R.string.a7t);
                o.LJIIIIZZ(str2, "getString(R.string.abnormal_no_account_found)");
            }
            Context context = getContext();
            if (context != null) {
                C73305Spp c73305Spp = new C73305Spp(context, null, 6);
                c73305Spp.setTopMargin(C17N.LJIILL(40.0d));
                c73305Spp.setLayoutVariant(1);
                C73306Spq c73306Spq = new C73306Spq();
                c73306Spq.LJFF = str;
                c73306Spq.LJI = str2;
                c73305Spp.setStatus(c73306Spq);
                viewGroup.addView(c73305Spp);
                this.LJLJLLL = true;
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C72818Shy.LJII("switch_to_shop", this);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLF).clear();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        ViewGroup viewGroup;
        View view;
        ViewGroup viewGroup2;
        super.onResume();
        View view2 = getView();
        if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null && (view = this.LJZ) != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C16880lQ.LJLLL(this.LJZ, viewGroup2);
            }
            viewGroup.removeAllViews();
            viewGroup.addView(view);
        }
    }

    @Override // X.C8Z7
    public final void LJJJJ() {
        Jl();
    }

    public static ScrollView Hl(View view) {
        if (view instanceof ScrollView) {
            return (ScrollView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ScrollView Hl = Hl(viewGroup.getChildAt(i));
                if (Hl != null) {
                    return Hl;
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC87073YFh
    public final void E5(String feedId) {
        o.LJIIIZ(feedId, "feedId");
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void H5(boolean z) {
        this.LJLJJI = z;
        if (z) {
            Jl();
        } else {
            if (!this.LJLJLLL) {
                return;
            }
            Kl();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Kh(boolean z) {
        this.LJLJJL = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Pf(boolean z) {
        this.LJLJL = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Sj(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Yk(boolean z) {
        this.LJLJLJ = z;
    }

    @Override // X.InterfaceC87073YFh
    public final void m4(MiniUser miniUser) {
        this.LJLLL = miniUser.bioUrl;
        this.LJLLLL = miniUser.bioSecureUrl;
        if (getUserVisibleHint()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("web_url", this.LJLLL);
                jSONObject.put("secure_web_url", this.LJLLLL);
                AbstractC59064NGa abstractC59064NGa = this.LLD;
                if (abstractC59064NGa != null) {
                    abstractC59064NGa.LJIIIIZZ("biz_page_refreshed", jSONObject);
                }
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        super.onCreate(bundle);
        C72818Shy.LIZLLL("switch_to_shop", this);
        Bundle arguments = getArguments();
        String str5 = null;
        if (arguments != null) {
            str = arguments.getString("author_id");
        } else {
            str = null;
        }
        this.LJLLI = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("enter_from");
        } else {
            str2 = null;
        }
        this.LJLLILLLL = String.valueOf(str2);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str3 = arguments3.getString("user_handle");
        } else {
            str3 = null;
        }
        this.LJLLJ = String.valueOf(str3);
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str4 = arguments4.getString("web_url");
        } else {
            str4 = null;
        }
        this.LJLLL = String.valueOf(str4);
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            str5 = arguments5.getString("secure_web_url");
        }
        this.LJLLLL = String.valueOf(str5);
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        if (o.LJ(c199097rd.LJLIL, "switch_to_shop")) {
            ((RBX) HG3.LJIILL()).queryUser();
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLZ;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            } else {
                o.LJIJI("getPlatformSelfInfo");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "8451498914358662383");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/commercialize/ba/impl/ui/BusinessPageFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/ba/impl/ui/BusinessPageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (!z) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/ba/impl/ui/BusinessPageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
            return;
        }
        if (this.LJLJL || this.LJLJJI || this.LJLJJL || this.LJLJJLL || this.LJLJLJ) {
            Jl();
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/ba/impl/ui/BusinessPageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("web_url", this.LJLLL);
        jSONObject.put("secure_web_url", this.LJLLLL);
        AbstractC59064NGa abstractC59064NGa = this.LLD;
        if (abstractC59064NGa != null) {
            abstractC59064NGa.LJIIIIZZ("biz_page_refreshed", jSONObject);
        }
        if (!this.LJLL) {
            Kl();
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/commercialize/ba/impl/ui/BusinessPageFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // X.NV4
    public final void ze(C58978NCs c58978NCs) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Resources resources;
        View view = getView();
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        viewGroup.removeAllViews();
        this.LJZ = null;
        View view2 = c58978NCs.LIZ;
        this.LJLL = true;
        view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (this.LJLLLLLL) {
            int i = 0;
            Context context = view2.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                i = (int) resources.getDimension(R.dimen.w4);
            }
            C26338AVi.LJIIIZ(view2, 0, 0, 0, Integer.valueOf(i), 16);
        }
        this.LJZ = view2;
        ViewParent parent = view2.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(this.LJZ, viewGroup2);
        }
        viewGroup.addView(this.LJZ);
        AbstractC59064NGa abstractC59064NGa = this.LLD;
        if (abstractC59064NGa != null) {
            abstractC59064NGa.LJIIJJI();
        }
    }

    @Override // X.NV4
    public final void Zi(String str, String str2) {
        this.LJLL = false;
        AbstractC59064NGa abstractC59064NGa = this.LLD;
        if (abstractC59064NGa != null) {
            abstractC59064NGa.LJIIJ(str2, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AbstractC59064NGa abstractC59064NGa;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C19N.LJ("enable_preload_biz_page", true)) {
            C59066NGc Il = Il();
            if (Il != null) {
                abstractC59064NGa = AdHybridContainerManager.LIZLLL().LIZIZ(Il, (C59421NTt) this.LJZL.getValue());
            } else {
                abstractC59064NGa = null;
            }
            this.LLD = abstractC59064NGa;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            C10A.LIZIZ(frameLayout, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return frameLayout;
    }
}
