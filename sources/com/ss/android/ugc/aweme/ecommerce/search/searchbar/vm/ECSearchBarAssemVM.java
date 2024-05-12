package com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm;

import X.C50948Jz6;
import X.C51163K6d;
import X.C86V;
import X.InterfaceC55235Lm3;
import X.K9E;
import X.K9G;
import X.K9O;
import X.KB1;
import X.X1D;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ECSearchBarAssemVM extends AssemViewModel<K9G> {
    public final InterfaceC55235Lm3 LJLIL;
    public final int LJLILLLLZI;
    public final MutableLiveData<K9O> LJLJI;
    public final ISearchBarContextAbility LJLJJI;
    public final C51163K6d LJLJJL;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r2 != null) goto L9;
     */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.K9G defaultState() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility r0 = r5.LJLJJI
            r4 = 0
            if (r0 == 0) goto L47
            X.K9E r3 = r0.g8()
            if (r3 == 0) goto Lf
            java.lang.String r2 = r3.LIZIZ
            if (r2 != 0) goto L11
        Lf:
            java.lang.String r2 = ""
        L11:
            java.lang.String r1 = "defaultState defaultKeyword = "
            java.lang.String r0 = ", defaultHint1="
            java.lang.StringBuilder r1 = X.C25620zW.LIZIZ(r1, r2, r0)
            if (r3 == 0) goto L45
            java.lang.String r0 = r3.LIZJ
        L1d:
            r1.append(r0)
            java.lang.String r0 = ", defaultHint2="
            r1.append(r0)
            java.lang.String r0 = r5.gv0()
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            if (r3 == 0) goto L33
            java.lang.String r4 = r3.LIZJ
        L33:
            boolean r0 = X.C78685UuP.LJJJZ(r4)
            if (r0 == 0) goto L40
        L39:
            X.K9G r1 = new X.K9G
            r0 = 0
            r1.<init>(r4, r2, r0)
            return r1
        L40:
            java.lang.String r4 = r5.gv0()
            goto L39
        L45:
            r0 = r4
            goto L1d
        L47:
            r3 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM.defaultState():X.33Q");
    }

    public final int hv0() {
        String str;
        K9E g8;
        C50948Jz6 c50948Jz6;
        K9E g82;
        C50948Jz6 c50948Jz62;
        ECSearchEntranceData ecSearchEntranceData;
        ISearchBarContextAbility iSearchBarContextAbility = this.LJLJJI;
        if (iSearchBarContextAbility != null && (g82 = iSearchBarContextAbility.g8()) != null && (c50948Jz62 = g82.LJIILIIL) != null && (ecSearchEntranceData = c50948Jz62.getEcSearchEntranceData()) != null) {
            str = ecSearchEntranceData.getDisableVisionSearch();
        } else {
            str = null;
        }
        if (o.LJ(str, "true") || o.LJ(str, "1")) {
            return 0;
        }
        ISearchBarContextAbility iSearchBarContextAbility2 = this.LJLJJI;
        if (iSearchBarContextAbility2 != null && (g8 = iSearchBarContextAbility2.g8()) != null && (c50948Jz6 = g8.LJIILIIL) != null && !KB1.LJIIIIZZ(KB1.LIZ(c50948Jz6))) {
            return 0;
        }
        return this.LJLILLLLZI;
    }

    public final String gv0() {
        String str;
        K9E g8;
        C50948Jz6 c50948Jz6;
        ECSearchEntranceData ecSearchEntranceData;
        String defaultHintWord;
        K9E g82;
        C50948Jz6 c50948Jz62;
        ECSearchEntranceData ecSearchEntranceData2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getDefaultHintWord = ");
        ISearchBarContextAbility iSearchBarContextAbility = this.LJLJJI;
        if (iSearchBarContextAbility != null && (g82 = iSearchBarContextAbility.g8()) != null && (c50948Jz62 = g82.LJIILIIL) != null && (ecSearchEntranceData2 = c50948Jz62.getEcSearchEntranceData()) != null) {
            str = ecSearchEntranceData2.getDefaultHintWord();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        ISearchBarContextAbility iSearchBarContextAbility2 = this.LJLJJI;
        if (iSearchBarContextAbility2 == null || (g8 = iSearchBarContextAbility2.g8()) == null || (c50948Jz6 = g8.LJIILIIL) == null || (ecSearchEntranceData = c50948Jz6.getEcSearchEntranceData()) == null || (defaultHintWord = ecSearchEntranceData.getDefaultHintWord()) == null) {
            String LJFF = C86V.LJFF(R.string.ju_);
            o.LJIIIIZZ(LJFF, "getString(R.string.please_input_search_keyword)");
            return LJFF;
        }
        return defaultHintWord;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r2.getEcomPromotionIcon() == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r5 != null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:10:0x003d, B:12:0x0043, B:14:0x005a, B:16:0x0060, B:17:0x0070, B:20:0x007d, B:22:0x0083, B:23:0x0085), top: B:9:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:10:0x003d, B:12:0x0043, B:14:0x005a, B:16:0x0060, B:17:0x0070, B:20:0x007d, B:22:0x0083, B:23:0x0085), top: B:9:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ECSearchBarAssemVM(X.InterfaceC55235Lm3 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r6.<init>()
            r6.LJLIL = r7
            X.K65 r0 = X.K65.LIZ
            r0.getClass()
            int r0 = X.K65.LIZIZ
            r6.LJLILLLLZI = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r6.LJLJI = r0
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility> r0 = com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility.class
            r3 = 0
            X.2K0 r5 = X.C55096Ljo.LIZ(r7, r0, r3)
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility r5 = (com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility) r5
            r6.LJLJJI = r5
            if (r5 == 0) goto L38
            X.K9E r0 = r5.g8()
            if (r0 == 0) goto L38
            java.lang.String r2 = r0.LJ
        L2f:
            X.K9E r0 = r5.g8()
            if (r0 == 0) goto L3c
            java.lang.String r4 = r0.LJFF
            goto L3d
        L38:
            r2 = r3
            if (r5 == 0) goto L3c
            goto L2f
        L3c:
            r4 = r3
        L3d:
            boolean r0 = X.C78685UuP.LJJJZ(r2)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L59
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = com.ss.android.ugc.aweme.utils.GsonHolder.LIZLLL()     // Catch: java.lang.Throwable -> L8a
            com.google.gson.Gson r1 = r0.LIZ()     // Catch: java.lang.Throwable -> L8a
            java.lang.Class<com.ss.android.ugc.aweme.model.EcHintVoucherInfo> r0 = com.ss.android.ugc.aweme.model.EcHintVoucherInfo.class
            java.lang.Object r2 = r1.LJI(r2, r0)     // Catch: java.lang.Throwable -> L8a
            com.ss.android.ugc.aweme.model.EcHintVoucherInfo r2 = (com.ss.android.ugc.aweme.model.EcHintVoucherInfo) r2     // Catch: java.lang.Throwable -> L8a
            com.ss.android.ugc.aweme.model.EcPromotionIcon r0 = r2.getEcomPromotionIcon()     // Catch: java.lang.Throwable -> L8a
            if (r0 != 0) goto L5a
        L59:
            r2 = r3
        L5a:
            boolean r0 = X.C78685UuP.LJJJZ(r4)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L76
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = com.ss.android.ugc.aweme.utils.GsonHolder.LIZLLL()     // Catch: java.lang.Throwable -> L8a
            com.google.gson.Gson r1 = r0.LIZ()     // Catch: java.lang.Throwable -> L8a
            java.lang.Class<com.ss.android.ugc.aweme.model.EcPromotionInfo> r0 = com.ss.android.ugc.aweme.model.EcPromotionInfo.class
            java.lang.Object r0 = r1.LJI(r4, r0)     // Catch: java.lang.Throwable -> L8a
            com.ss.android.ugc.aweme.model.EcPromotionInfo r0 = (com.ss.android.ugc.aweme.model.EcPromotionInfo) r0     // Catch: java.lang.Throwable -> L8a
        L70:
            X.K6d r1 = new X.K6d     // Catch: java.lang.Throwable -> L8a
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L8a
            goto L78
        L76:
            r0 = r3
            goto L70
        L78:
            if (r5 == 0) goto L7b
            goto L7d
        L7b:
            r0 = r3
            goto L85
        L7d:
            X.K9E r0 = r5.g8()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L7b
            X.K9g r0 = r0.LJI     // Catch: java.lang.Throwable -> L8a
        L85:
            r1.LJIIIZ = r0     // Catch: java.lang.Throwable -> L8a
            r6.LJLJJL = r1     // Catch: java.lang.Throwable -> L8a
            goto L95
        L8a:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
            X.K6d r0 = new X.K6d
            r0.<init>(r3, r3)
            r6.LJLJJL = r0
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM.<init>(X.Lm3):void");
    }
}
