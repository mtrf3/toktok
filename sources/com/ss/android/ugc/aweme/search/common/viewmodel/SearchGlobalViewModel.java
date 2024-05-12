package com.ss.android.ugc.aweme.search.common.viewmodel;

import X.C113554cx;
import X.C50109JlZ;
import X.C79853Bl;
import X.C79883Bo;
import X.C80023Cc;
import X.InterfaceC50111Jlb;
import X.JV6;
import X.OSZ;
import X.XKX;
import X.XLL;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchGlobalViewModel extends ViewModel {
    public final NextLiveData LJLIL;
    public final NextLiveData LJLILLLLZI;
    public final NextLiveData LJLJI;
    public final NextLiveData LJLJJI;
    public final NextLiveData LJLJJL;
    public final NextLiveData LJLJJLL;
    public final NextLiveData LJLJL;
    public final NextLiveData LJLJLJ;
    public final NextLiveData LJLJLLL;
    public final NextLiveData LJLL;
    public final XLL LJLLI;
    public final C79883Bo LJLLILLLL;
    public final XLL LJLLJ;
    public final C79883Bo LJLLL;
    public final NextLiveData LJLLLL;
    public final NextLiveData LJLLLLLL;
    public boolean LJLZ;
    public final MutableLiveData<Boolean> LJZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final String gv0() {
        String str;
        C50109JlZ c50109JlZ = (C50109JlZ) this.LJLJJL.getValue();
        if (c50109JlZ == null || (str = c50109JlZ.LJLJI) == null) {
            return "unknown";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String jv0() {
        String str;
        C50109JlZ c50109JlZ = (C50109JlZ) this.LJLJJL.getValue();
        if (c50109JlZ == null || (str = c50109JlZ.LJLILLLLZI) == null) {
            return "unknown";
        }
        return str;
    }

    public SearchGlobalViewModel() {
        NextLiveData nextLiveData = new NextLiveData();
        this.LJLIL = nextLiveData;
        this.LJLILLLLZI = nextLiveData;
        NextLiveData nextLiveData2 = new NextLiveData();
        this.LJLJI = nextLiveData2;
        this.LJLJJI = nextLiveData2;
        NextLiveData nextLiveData3 = new NextLiveData();
        this.LJLJJL = nextLiveData3;
        this.LJLJJLL = nextLiveData3;
        NextLiveData nextLiveData4 = new NextLiveData();
        this.LJLJL = nextLiveData4;
        this.LJLJLJ = nextLiveData4;
        NextLiveData nextLiveData5 = new NextLiveData();
        this.LJLJLLL = nextLiveData5;
        this.LJLL = nextLiveData5;
        XLL LIZ = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLLI = LIZ;
        this.LJLLILLLL = new C79883Bo(LIZ);
        XLL LIZ2 = C79853Bl.LIZ(0, 0, null, 7);
        this.LJLLJ = LIZ2;
        this.LJLLL = new C79883Bo(LIZ2);
        NextLiveData nextLiveData6 = new NextLiveData();
        this.LJLLLL = nextLiveData6;
        this.LJLLLLLL = nextLiveData6;
        this.LJZ = new MutableLiveData<>();
    }

    public final boolean lv0() {
        String hv0 = hv0(false);
        if (!(!o.LJ(hv0, "unknown")) || hv0 == null) {
            return false;
        }
        if (o.LJ(hv0, "auto")) {
            String jv0 = jv0();
            if ((!o.LJ(jv0, "unknown")) && jv0 != null) {
                return o.LJ(jv0, "single_column");
            }
            throw new IllegalStateException("Top feed sub style is not ready");
        }
        return o.LJ(hv0, "single_column");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String hv0(boolean z) {
        String str;
        C50109JlZ c50109JlZ = (C50109JlZ) this.LJLJJL.getValue();
        if (c50109JlZ != null) {
            str = c50109JlZ.LJLIL;
        } else {
            str = null;
        }
        if (z) {
            InterfaceC50111Jlb.LJI.getClass();
            if (str == null || (!o.LJ(str, "auto") && !o.LJ(str, "single_column") && !o.LJ(str, "double_column"))) {
                ov0(this, "double_column", null, 2);
                return "double_column";
            }
            return str;
        }
        if (str == null) {
            return "unknown";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer kv0(String str) {
        JV6 jv6;
        Map<String, Integer> map;
        if (str == null || (jv6 = (JV6) this.LJLIL.getValue()) == null || (map = jv6.LJLILLLLZI) == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void nv0(boolean z) {
        C50109JlZ c50109JlZ = (C50109JlZ) this.LJLJJL.getValue();
        if (c50109JlZ == null) {
            c50109JlZ = new C50109JlZ(0);
        }
        this.LJLJJL.setValue(C50109JlZ.L(c50109JlZ, null, null, null, z, 7));
    }

    public static void mv0(SearchGlobalViewModel searchGlobalViewModel, int i) {
        searchGlobalViewModel.getClass();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(searchGlobalViewModel), null, null, new C80023Cc(searchGlobalViewModel, i, 0, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void pv0(int i, String str) {
        Map<String, Integer> map;
        JV6 jv6 = (JV6) this.LJLIL.getValue();
        if (jv6 != null && (map = jv6.LJLILLLLZI) != null) {
            map.put(str, Integer.valueOf(i));
            this.LJLIL.postValue(new JV6(str, map));
        } else {
            this.LJLIL.postValue(new JV6(str, C113554cx.LJJLIIIIJ(new OSZ(str, Integer.valueOf(i)))));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ov0(com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r3 = r13
            r2 = r12
            r0 = r14 & 1
            r4 = 0
            if (r0 == 0) goto L8
            r2 = r4
        L8:
            r0 = r14 & 2
            if (r0 == 0) goto Ld
            r3 = r4
        Ld:
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r11.LJLJJL
            java.lang.Object r1 = r0.getValue()
            X.JlZ r1 = (X.C50109JlZ) r1
            if (r1 != 0) goto L1d
            X.JlZ r1 = new X.JlZ
            r0 = 0
            r1.<init>(r0)
        L1d:
            if (r2 == 0) goto L39
            if (r3 == 0) goto L2c
            r5 = 0
            r6 = 12
            X.JlZ r0 = X.C50109JlZ.L(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L4e
            if (r2 == 0) goto L39
        L2c:
            r9 = 0
            r10 = 14
            r5 = r1
            r6 = r2
            r7 = r4
            r8 = r4
            X.JlZ r0 = X.C50109JlZ.L(r5, r6, r7, r8, r9, r10)
            if (r0 != 0) goto L4c
        L39:
            if (r3 == 0) goto L46
            r5 = 0
            r6 = 13
            r1 = r1
            r2 = r4
            r3 = r3
            r4 = r4
            X.JlZ r4 = X.C50109JlZ.L(r1, r2, r3, r4, r5, r6)
        L46:
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r11.LJLJJL
            r0.setValue(r4)
            goto L50
        L4c:
            r4 = r0
            goto L46
        L4e:
            r4 = r0
            goto L46
        L50:
            com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService r0 = com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService.LJIIJJI()     // Catch: java.lang.IllegalStateException -> L5f
            X.NIP r1 = r0.LJIIIIZZ()     // Catch: java.lang.IllegalStateException -> L5f
            boolean r0 = r11.lv0()     // Catch: java.lang.IllegalStateException -> L5f
            r1.LJII(r0)     // Catch: java.lang.IllegalStateException -> L5f
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel.ov0(com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel, java.lang.String, java.lang.String, int):void");
    }
}
