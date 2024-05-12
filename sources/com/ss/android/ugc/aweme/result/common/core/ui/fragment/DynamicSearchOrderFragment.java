package com.ss.android.ugc.aweme.result.common.core.ui.fragment;

import X.ActivityC45651qj;
import X.C214298b3;
import X.C214528bQ;
import X.C51396KFc;
import X.C51416KFw;
import X.C65352Pkq;
import X.C78926UyI;
import X.C8YN;
import X.InterfaceC65784Pro;
import X.KFY;
import X.TBT;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ab.RomaSchemaGroupSearchSettings;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment;
import com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultOrderViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class DynamicSearchOrderFragment extends EcSearchBaseRefactorFragment {
    public final C214298b3 LLFF;
    public final Map<Integer, View> LLFFF = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFFF).clear();
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LLFFF;
        Integer valueOf = Integer.valueOf(R.id.ck3);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.ck3)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public DynamicSearchOrderFragment() {
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 103);
        AqS158S0100000_8 aqS158S0100000_82 = new AqS158S0100000_8(this, 104);
        this.LLFF = new C214298b3(C65352Pkq.LIZ(EcSearchResultOrderViewModel.class), aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), aqS158S0100000_82, C51416KFw.INSTANCE, (InterfaceC65784Pro) null, 384);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:6|7|(1:9)(1:46)|(3:37|38|(8:42|12|13|14|(1:16)|(1:18)|19|(2:21|(2:23|24)(1:25))(6:26|(1:28)|29|(1:31)|32|33)))|11|12|13|14|(0)|(0)|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[Catch: Exception -> 0x00d4, TryCatch #1 {Exception -> 0x00d4, blocks: (B:7:0x0016, B:9:0x002d, B:14:0x005e, B:16:0x0064, B:18:0x0069, B:19:0x0072, B:21:0x007f, B:23:0x0083, B:26:0x0089, B:28:0x008d, B:29:0x00a4, B:31:0x00a8, B:32:0x00ab, B:36:0x0057), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[Catch: Exception -> 0x00d4, TryCatch #1 {Exception -> 0x00d4, blocks: (B:7:0x0016, B:9:0x002d, B:14:0x005e, B:16:0x0064, B:18:0x0069, B:19:0x0072, B:21:0x007f, B:23:0x0083, B:26:0x0089, B:28:0x008d, B:29:0x00a4, B:31:0x00a8, B:32:0x00ab, B:36:0x0057), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: Exception -> 0x00d4, TryCatch #1 {Exception -> 0x00d4, blocks: (B:7:0x0016, B:9:0x002d, B:14:0x005e, B:16:0x0064, B:18:0x0069, B:19:0x0072, B:21:0x007f, B:23:0x0083, B:26:0x0089, B:28:0x008d, B:29:0x00a4, B:31:0x00a8, B:32:0x00ab, B:36:0x0057), top: B:6:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[Catch: Exception -> 0x00d4, TryCatch #1 {Exception -> 0x00d4, blocks: (B:7:0x0016, B:9:0x002d, B:14:0x005e, B:16:0x0064, B:18:0x0069, B:19:0x0072, B:21:0x007f, B:23:0x0083, B:26:0x0089, B:28:0x008d, B:29:0x00a4, B:31:0x00a8, B:32:0x00ab, B:36:0x0057), top: B:6:0x0016 }] */
    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void refreshData() {
        /*
            r10 = this;
            super.refreshData()
            X.8b3 r0 = r10.LLFF
            java.lang.Object r4 = r0.getValue()
            com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultOrderViewModel r4 = (com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultOrderViewModel) r4
            com.ss.android.ugc.aweme.search.model.SearchResultParam r5 = r10.LJZI
            if (r5 != 0) goto L10
            return
        L10:
            java.lang.String r8 = "baseParams.optString(\"enter_from\")"
            java.lang.String r9 = "enter_from"
            java.lang.String r7 = "order"
            X.KDy r0 = r4.LJLIL     // Catch: java.lang.Exception -> Ld4
            org.json.JSONObject r6 = r0.LIZ(r5)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r0 = "source"
            r6.put(r0, r7)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r1 = "search_channel"
            java.lang.String r0 = "tiktok_order"
            r6.put(r1, r0)     // Catch: java.lang.Exception -> Ld4
            X.KE0 r0 = r4.LJLJJL     // Catch: java.lang.Exception -> Ld4
            r2 = 0
            if (r0 == 0) goto L32
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r0 = r0.LJI()     // Catch: java.lang.Exception -> Ld4
            goto L33
        L32:
            r0 = r2
        L33:
            if (r0 == 0) goto L51
            java.lang.String r0 = r0.getOrderSearchRegion()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L51
            java.lang.Integer r0 = X.C38350F3i.LJJIL(r0)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L51
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L4e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L4e
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L4e
            r1 = r2
            r2 = r0
            goto L52
        L4e:
            r0 = move-exception
            r1 = r2
            goto L57
        L51:
            r1 = r2
        L52:
            X.C3C5.m7constructorimpl(r2)     // Catch: java.lang.Throwable -> L56
            goto L5e
        L56:
            r0 = move-exception
        L57:
            X.3C4 r2 = X.C141335gf.LIZ(r0)     // Catch: java.lang.Exception -> Ld4
            X.C3C5.m7constructorimpl(r2)     // Catch: java.lang.Exception -> Ld4
        L5e:
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r2)     // Catch: java.lang.Exception -> Ld4
            if (r0 == 0) goto L67
            X.C78983UzD.LJIIZILJ(r0)     // Catch: java.lang.Exception -> Ld4
        L67:
            if (r1 == 0) goto L72
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Ld4
            java.lang.String r0 = "search_order_page_type"
            r6.put(r0, r1)     // Catch: java.lang.Exception -> Ld4
        L72:
            java.lang.String r0 = r6.optString(r9)     // Catch: java.lang.Exception -> Ld4
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r8)     // Catch: java.lang.Exception -> Ld4
            int r0 = r0.length()     // Catch: java.lang.Exception -> Ld4
            if (r0 != 0) goto L89
            X.KFQ r1 = r4.LJLJJI     // Catch: java.lang.Exception -> Ld4
            if (r1 == 0) goto Ldf
            java.lang.String r0 = "page_error"
            r1.LJ(r0)     // Catch: java.lang.Exception -> Ld4
            goto Ldf
        L89:
            X.KFQ r3 = r4.LJLJJI     // Catch: java.lang.Exception -> Ld4
            if (r3 == 0) goto La4
            java.lang.String r0 = "enter_method"
            java.lang.String r2 = r6.optString(r0)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r0 = "baseParams.optString(\"enter_method\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r1 = r6.optString(r9)     // Catch: java.lang.Exception -> Ld4
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r8)     // Catch: java.lang.Exception -> Ld4
            r0 = 9
            X.KFQ.LIZ(r3, r2, r1, r0)     // Catch: java.lang.Exception -> Ld4
        La4:
            X.KFQ r0 = r4.LJLJJI     // Catch: java.lang.Exception -> Ld4
            if (r0 == 0) goto Lab
            r0.LIZLLL()     // Catch: java.lang.Exception -> Ld4
        Lab:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld4
            r3.<init>()     // Catch: java.lang.Exception -> Ld4
            java.lang.String r0 = "searchInitParams"
            r3.put(r0, r6)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r2 = "rd_ec_fe_params"
            java.lang.String r0 = "tab_name"
            r6.put(r0, r7)     // Catch: java.lang.Exception -> Ld4
            java.lang.String r1 = "type"
            java.lang.String r0 = "online"
            r6.put(r1, r0)     // Catch: java.lang.Exception -> Ld4
            X.C48658J7u.LIZIZ(r2, r6)     // Catch: java.lang.Exception -> Ld4
            kotlin.jvm.internal.AqS172S0100000_6 r1 = new kotlin.jvm.internal.AqS172S0100000_6     // Catch: java.lang.Exception -> Ld4
            r0 = 57
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> Ld4
            r4.setState(r1)     // Catch: java.lang.Exception -> Ld4
            r4.gv0(r5)     // Catch: java.lang.Exception -> Ld4
            goto Ldf
        Ld4:
            r2 = move-exception
            kotlin.jvm.internal.AqS172S0100000_6 r1 = new kotlin.jvm.internal.AqS172S0100000_6
            r0 = 58
            r1.<init>(r2, r0)
            r4.setState(r1)
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchOrderFragment.refreshData():void");
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment
    public final void Il(KFY kfy) {
        int i;
        String str;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            i = mo49getActivity.hashCode();
        } else {
            i = 0;
        }
        String valueOf = String.valueOf(i);
        try {
            Uri.Builder buildUpon = UriProtector.parse(RomaSchemaGroupSearchSettings.LIZ().romaSchemaPageOrderStoreTab).buildUpon();
            o.LJIIIIZZ(buildUpon, "parse(schema).buildUpon()");
            if (valueOf == null) {
                valueOf = "";
            }
            buildUpon.appendQueryParameter("container_unique_id", valueOf);
            buildUpon.appendQueryParameter("use_forest", "1");
            buildUpon.appendQueryParameter("enable_memory_cache", "1");
            buildUpon.appendQueryParameter("enable_code_cache", "1");
            str = buildUpon.toString();
            o.LJIIIIZZ(str, "{\n            val schema…lder.toString()\n        }");
        } catch (Throwable unused) {
            str = "aweme://lynxview?use_new_container=1&url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ffe_tiktok_ecommerce_search_result_page%2Fpages%2Forder-list-search-page%2Ftemplate.js&use_spark=1&enable_code_cache=1";
        }
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = str;
        C51396KFc.LIZIZ(kfy, dynamicPatch, null, 6);
    }

    @Override // com.ss.android.ugc.aweme.result.common.core.ui.EcSearchBaseRefactorFragment, com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchVisibilityDetectFragmentNew, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8YN.LJII(this, (AssemViewModel) this.LLFF.getValue(), new TBT() { // from class: X.KFj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35652Dyy) obj).LJLIL;
            }
        }, null, new AqS190S0100000_8(this, 14), 6);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLFF.getValue(), new TBT() { // from class: X.KFk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C35652Dyy) obj).LJLILLLLZI;
            }
        }, null, new AqS174S0100000_8(this, 55), null, new AqS174S0100000_8(this, 56), 10, null);
    }
}
