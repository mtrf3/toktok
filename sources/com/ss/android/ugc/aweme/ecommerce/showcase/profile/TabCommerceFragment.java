package com.ss.android.ugc.aweme.ecommerce.showcase.profile;

import X.BPU;
import X.C03880Dg;
import X.C221108m2;
import X.C27739Aud;
import X.C3C5;
import X.C5H3;
import X.C60726NsQ;
import X.C65300Pk0;
import X.C76800UCe;
import X.C78555UsJ;
import X.EnumC221088m0;
import X.EnumC58928NAu;
import X.InterfaceC60761Nsz;
import X.InterfaceC67352kd;
import X.InterfaceC87073YFh;
import X.M2U;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.XKS;
import android.os.Bundle;
import android.view.View;
import com.google.gson.m;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS70S1100000_2;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class TabCommerceFragment extends ProfileListFragment implements InterfaceC87073YFh {
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public int[] LJLJL;
    public String LJLJLJ;
    public HashMap<String, Object> LJLJLLL;
    public MiniUser LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public long LJLLJ;
    public long LJLLL;
    public final Map<String, Object> LJLLLL;
    public final Map<String, Object> LJLLLLLL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLZ;
    public String LJZ;
    public XKS LJZI;
    public final Map<Integer, View> LJZL = new LinkedHashMap();

    @Override // X.InterfaceC87073YFh
    public void LJ() {
    }

    @Override // X.C8Z7
    public final boolean LJJ() {
        return false;
    }

    @Override // X.C8Z7
    public final void LJJJJ() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void LL() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Oi() {
    }

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZL).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.InterfaceC87073YFh
    public void m4(MiniUser miniUser) {
    }

    public TabCommerceFragment() {
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLJJI = C221108m2.LIZ(enumC221088m0, new BPU(this));
        this.LJLJJL = C221108m2.LIZ(enumC221088m0, new AqS70S1100000_2(this, "enter_from", 0));
        this.LJLJJLL = C221108m2.LIZ(enumC221088m0, new AqS70S1100000_2(this, "entrance_type", 0));
        this.LJLJL = new int[0];
        this.LJLJLJ = "";
        this.LJLLI = "";
        this.LJLLILLLL = "";
        this.LJLLLL = new LinkedHashMap();
        this.LJLLLLLL = new LinkedHashMap();
    }

    public final C60726NsQ Hl() {
        InterfaceC60761Nsz interfaceC60761Nsz;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            interfaceC60761Nsz = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
        } else {
            interfaceC60761Nsz = null;
        }
        if (!(interfaceC60761Nsz instanceof C60726NsQ)) {
            return null;
        }
        return (C60726NsQ) interfaceC60761Nsz;
    }

    public final String Il() {
        m LIZ = M2U.LIZ(((LinkedHashMap) this.LJLLLL).get("list_source_content_id"), Jl().id);
        if (LIZ != null) {
            return LIZ.toString();
        }
        return null;
    }

    public final MiniUser Jl() {
        MiniUser miniUser = this.LJLL;
        if (miniUser != null) {
            return miniUser;
        }
        o.LJIJI("user");
        throw null;
    }

    public final boolean Kl() {
        return ((Boolean) this.LJLJJI.getValue()).booleanValue();
    }

    public final String getEnterFrom() {
        return (String) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getUserVisibleHint() && Hl() != null) {
            Ml(1);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        if (getUserVisibleHint() && Hl() != null) {
            Ll(1);
        }
        super.onStop();
    }

    @Override // X.InterfaceC87073YFh
    public final void E5(String feedId) {
        o.LJIIIZ(feedId, "feedId");
        this.LJZ = feedId;
    }

    public void Ll(int i) {
        C60726NsQ Hl = Hl();
        if (Hl != null) {
            Hl.onHide();
        }
    }

    public void Ml(int i) {
        C60726NsQ Hl = Hl();
        if (Hl != null) {
            Hl.onShow();
        }
    }

    public final Object Pl(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        XKS xks = this.LJZI;
        if (xks != null) {
            xks.LJJIJIL(null);
        }
        if (!getUserVisibleHint()) {
            XKS xks2 = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
            xks2.LJIIL();
            this.LJZI = xks2;
            Object LJIIJJI = xks2.LJIIJJI();
            if (LJIIJJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LJIIJJI;
            }
            return C76800UCe.LIZ;
        }
        return C76800UCe.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        HashMap<String, Object> hashMap;
        Bundle arguments;
        MiniUser miniUser;
        String string;
        String string2;
        int[] intArray;
        super.onCreate(bundle);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (intArray = arguments2.getIntArray("traffic_source_list")) != null) {
            this.LJLJL = intArray;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string2 = arguments3.getString("trackParams")) != null) {
            this.LJLJLJ = string2;
        }
        Bundle arguments4 = getArguments();
        String str = null;
        if (arguments4 != null) {
            hashMap = C27739Aud.LIZLLL(arguments4, "trackParams");
        } else {
            hashMap = null;
        }
        this.LJLJLLL = hashMap;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            str = arguments5.getString("group_id");
        }
        if (str != null && !ujb.o.LJJJJJL(str)) {
            this.LJZ = str;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null && (string = arguments6.getString("list_source_content_id")) != null && !ujb.o.LJJJJJL(string)) {
            this.LJLLLL.put("list_source_content_id", string);
        }
        if ((bundle != null && (miniUser = (MiniUser) bundle.getParcelable("user")) != null) || ((arguments = getArguments()) != null && (miniUser = (MiniUser) arguments.getParcelable("user")) != null)) {
            this.LJLL = miniUser;
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("user", Jl());
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "440784571649633006");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/ecommerce/showcase/profile/TabCommerceFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/showcase/profile/TabCommerceFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            if (this.LJLLL <= 0) {
                this.LJLLL = System.currentTimeMillis();
            }
            XKS xks = this.LJZI;
            if (xks != null) {
                C76800UCe c76800UCe = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe);
                xks.resumeWith(c76800UCe);
            }
            this.LJZI = null;
        } else if (Hl() != null) {
            Ll(0);
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/showcase/profile/TabCommerceFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    public final void Ol(String str, JSONObject jSONObject) {
        InterfaceC60761Nsz interfaceC60761Nsz;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (interfaceC60761Nsz = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJLIL) != null) {
            interfaceC60761Nsz.LJIIIZ(str, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00bf -> B:12:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Nl(X.C73305Spp r11, X.C61860OPo r12, X.InterfaceC67352kd r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C61909ORl
            if (r0 == 0) goto L2d
            r6 = r13
            X.ORl r6 = (X.C61909ORl) r6
            int r2 = r6.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r6.LJLJJLL = r2
        L12:
            java.lang.Object r1 = r6.LJLJJI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJLL
            r5 = 2
            r4 = 3
            r3 = 1
            if (r0 == 0) goto L45
            if (r0 == r3) goto L3b
            if (r0 == r5) goto L9f
            if (r0 != r4) goto L33
            X.Yns r12 = r6.LJLJI
            X.Spp r11 = r6.LJLILLLLZI
            com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment r2 = r6.LJLIL
            X.C141335gf.LIZJ(r1)
            goto L4e
        L2d:
            X.ORl r6 = new X.ORl
            r6.<init>(r10, r13)
            goto L12
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3b:
            X.Yns r12 = r6.LJLJI
            X.Spp r11 = r6.LJLILLLLZI
            com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment r2 = r6.LJLIL
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L5d java.util.concurrent.CancellationException -> Lc3
            goto L5e
        L45:
            X.C141335gf.LIZJ(r1)
            r0 = 8
            r11.setVisibility(r0)
            r2 = r10
        L4e:
            r6.LJLIL = r2     // Catch: java.lang.Throwable -> L5d java.util.concurrent.CancellationException -> Lc3
            r6.LJLILLLLZI = r11     // Catch: java.lang.Throwable -> L5d java.util.concurrent.CancellationException -> Lc3
            r6.LJLJI = r12     // Catch: java.lang.Throwable -> L5d java.util.concurrent.CancellationException -> Lc3
            r6.LJLJJLL = r3     // Catch: java.lang.Throwable -> L5d java.util.concurrent.CancellationException -> Lc3
            java.lang.Object r1 = r12.invoke(r6)     // Catch: java.lang.Throwable -> L5d java.util.concurrent.CancellationException -> Lc3
            if (r1 != r7) goto L5e
            goto Lc2
        L5d:
            r1 = 0
        L5e:
            if (r1 == 0) goto L61
            return r1
        L61:
            boolean r0 = r2.getUserVisibleHint()
            if (r0 == 0) goto Laf
            r6.LJLIL = r2
            r6.LJLILLLLZI = r11
            r6.LJLJI = r12
            r6.LJLJJLL = r5
            X.XKS r9 = new X.XKS
            X.2kd r0 = X.C78555UsJ.LJJII(r6)
            r9.<init>(r3, r0)
            r9.LJIIL()
            r0 = 0
            r11.setVisibility(r0)
            X.Spq r8 = new X.Spq
            r8.<init>()
            kotlin.jvm.internal.AqS148S0200000_1 r1 = new kotlin.jvm.internal.AqS148S0200000_1
            r0 = 43
            r1.<init>(r9, r11, r0)
            X.C73312Spw.LJI(r8, r1)
            r11.setStatus(r8)
            java.lang.Object r1 = r9.LJIIJJI()
            X.NAu r0 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            if (r1 != r0) goto L9c
        L99:
            if (r1 != r7) goto La8
            return r7
        L9c:
            X.UCe r1 = X.C76800UCe.LIZ
            goto L99
        L9f:
            X.Yns r12 = r6.LJLJI
            X.Spp r11 = r6.LJLILLLLZI
            com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment r2 = r6.LJLIL
            X.C141335gf.LIZJ(r1)
        La8:
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJLLL = r0
            goto L4e
        Laf:
            r0 = 0
            r2.LJLLL = r0
            r6.LJLIL = r2
            r6.LJLILLLLZI = r11
            r6.LJLJI = r12
            r6.LJLJJLL = r4
            java.lang.Object r0 = r2.Pl(r6)
            if (r0 != r7) goto L4e
            return r7
        Lc2:
            return r7
        Lc3:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragment.Nl(X.Spp, X.OPo, X.2kd):java.lang.Object");
    }
}
