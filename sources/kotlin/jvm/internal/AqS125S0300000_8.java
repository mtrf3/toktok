package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C43I;
import X.C49876Jho;
import X.C50191Jmt;
import X.C50248Jno;
import X.C51671KPr;
import X.C51757KSz;
import X.C76800UCe;
import X.EnumC51554KLe;
import X.InterfaceC88471Ynr;
import X.JYG;
import X.KPJ;
import X.SYL;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.search.detail.filter.viewmodel.FilterVM;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubTabsComponent;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchLabel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;
import java.util.List;

/* loaded from: classes9.dex */
public class AqS125S0300000_8 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[LOOP:0: B:22:0x0080->B:24:0x0086, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AqS125S0300000_8 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            X.43I r10 = (X.C43I) r10
            java.lang.String r0 = "$this$selectSubscribe"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.Object r1 = r10.LIZ()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L51
            java.lang.Object r1 = r8.l1
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            java.lang.Object r0 = r8.l2
            com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubTabsComponent r0 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubTabsComponent) r0
            com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM r0 = r0.H3()     // Catch: java.lang.Throwable -> L35
            X.33Q r0 = r0.getState()     // Catch: java.lang.Throwable -> L35
            X.Jn3 r0 = (X.C50201Jn3) r0     // Catch: java.lang.Throwable -> L35
            int r0 = r0.LJLJJLL     // Catch: java.lang.Throwable -> L35
            r1.LJLI(r0)     // Catch: java.lang.Throwable -> L35
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> L35
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> L35
            goto L3d
        L35:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        L3d:
            X.OzC r0 = X.KNV.LIZ()
            X.Jp0 r0 = (X.C50322Jp0) r0
            java.lang.String r6 = r0.LJLJI
            java.lang.Object r0 = r8.l0
            X.Jno r0 = (X.C50248Jno) r0
            java.lang.String r0 = r0.LJLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            if (r0 == 0) goto L54
        L51:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L54:
            java.lang.Object r7 = r8.l1
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r5 = 0
            if (r7 == 0) goto Lbf
            X.0A2 r1 = r7.getLayoutManager()
        L5f:
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L76
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            r0 = -1
            if (r1 == 0) goto L76
            int r4 = r1.LLILL()
            int r3 = r1.LLILLJJLI()
            if (r4 == r0) goto L76
            if (r3 == r0) goto L76
            if (r3 >= r4) goto La1
        L76:
            X.OQg r2 = X.C61878OQg.INSTANCE
        L78:
            java.lang.Object r5 = r8.l2
            com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubTabsComponent r5 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubTabsComponent) r5
            java.util.Iterator r4 = r2.iterator()
        L80:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lc1
            java.lang.Object r0 = r4.next()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r0
            int r3 = r0.getBindingAdapterPosition()
            com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM r2 = r5.H3()
            r2.getClass()
            kotlin.jvm.internal.AqS96S0101000_8 r1 = new kotlin.jvm.internal.AqS96S0101000_8
            r0 = 2
            r1.<init>(r3, r2, r0)
            r2.withState(r1)
            goto L80
        La1:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r4 > r3) goto L78
        La8:
            if (r7 == 0) goto Lbd
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r7.LJJIZ(r4)
        Lae:
            boolean r0 = r1 instanceof X.C50249Jnp
            if (r0 != 0) goto Lb7
        Lb2:
            if (r4 == r3) goto L78
            int r4 = r4 + 1
            goto La8
        Lb7:
            if (r1 == 0) goto Lb2
            r2.add(r1)
            goto Lb2
        Lbd:
            r1 = r5
            goto Lae
        Lbf:
            r1 = r5
            goto L5f
        Lc1:
            java.lang.Object r0 = r8.l0
            X.Jno r0 = (X.C50248Jno) r0
            r0.LJLL = r6
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS125S0300000_8.invoke$0(kotlin.jvm.internal.AqS125S0300000_8, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AqS125S0300000_8 aqS125S0300000_8, Object selectSubscribe, Object obj) {
        String str;
        C43I it = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        SearchLabel searchLabel = (SearchLabel) it.LIZ;
        if (searchLabel != null && (str = searchLabel.jumpQuery) != null) {
            SearchHubVM searchHubVM = (SearchHubVM) aqS125S0300000_8.l0;
            searchHubVM.getClass();
            searchHubVM.LJLJI = searchLabel;
            C50191Jmt.LIZ((RecyclerView) aqS125S0300000_8.l1, (ViewGroup) aqS125S0300000_8.l2, str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS125S0300000_8 aqS125S0300000_8, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((C51671KPr) aqS125S0300000_8.l0).LIZIZ(0);
        FilterVM LJIIIZ = ((KPJ) aqS125S0300000_8.l1).LJIIIZ();
        EnumC51554KLe enumC51554KLe = EnumC51554KLe.CLICK_VIDEO;
        KPJ kpj = (KPJ) aqS125S0300000_8.l1;
        SYL syl = (SYL) aqS125S0300000_8.l2;
        kpj.getClass();
        LJIIIZ.hv0(enumC51554KLe, KPJ.LJIIJJI(syl));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS125S0300000_8 aqS125S0300000_8, Object obj, Object obj2) {
        FeedbackMultipleChoice choice = (FeedbackMultipleChoice) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(choice, "choice");
        Context context = (Context) aqS125S0300000_8.l0;
        o.LJIIIIZZ(context, "context");
        C51757KSz.LIZ(context, (SearchFeedbackOptionalFragment) aqS125S0300000_8.l1, (JYG) aqS125S0300000_8.l2, choice, intValue, true);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AqS125S0300000_8 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r6 = (com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed) r6
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r4 = r7.booleanValue()
            java.lang.String r0 = "mixFeed"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.getAweme()
            if (r2 == 0) goto L21
            java.lang.Object r1 = r5.l2
            X.Ynt r1 = (X.InterfaceC88473Ynt) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.invoke(r2, r6, r0)
        L1e:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L21:
            boolean r0 = X.C78949Uyf.LJJIIJ(r6)
            if (r0 == 0) goto L4f
            java.lang.Object r0 = r5.l0
            X.Jho r0 = (X.C49876Jho) r0
            X.Jhq r0 = r0.LJLILLLLZI
            java.util.List r0 = r0.lv(r6)
            java.lang.Object r3 = r5.l2
            X.Ynt r3 = (X.InterfaceC88473Ynt) r3
            java.util.Iterator r2 = r0.iterator()
        L39:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r1 = r2.next()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r3.invoke(r1, r6, r0)
            goto L39
        L4b:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L1e
        L4f:
            com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r0 = r6.LJI()
            if (r0 == 0) goto L7e
            java.util.List r0 = r0.getAwemeList()
            if (r0 == 0) goto L7e
            java.lang.Object r3 = r5.l2
            X.Ynt r3 = (X.InterfaceC88473Ynt) r3
            java.util.Iterator r2 = r0.iterator()
        L63:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r1 = r2.next()
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r3.invoke(r1, r6, r0)
            goto L63
        L7a:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L1e
        L7e:
            java.lang.Object r0 = r5.l1
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.remove(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r0.booleanValue()
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r0 = "remove feed that has no aweme"
            r2[r1] = r0
            java.lang.String r0 = "fallbackHelper"
            X.C49133JQb.LIZ(r0, r2)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS125S0300000_8.invoke$4(kotlin.jvm.internal.AqS125S0300000_8, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS125S0300000_8(C49876Jho c49876Jho, List list, IDqS13S0400000_3 iDqS13S0400000_3, int i) {
        super(2);
        this.$t = i;
        this.l0 = c49876Jho;
        this.l1 = list;
        this.l2 = iDqS13S0400000_3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS125S0300000_8(C50248Jno c50248Jno, RecyclerView recyclerView, SearchHubTabsComponent searchHubTabsComponent, int i) {
        super(2);
        this.$t = i;
        this.l0 = c50248Jno;
        this.l1 = recyclerView;
        this.l2 = searchHubTabsComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS125S0300000_8(C51671KPr c51671KPr, KPJ kpj, SYL syl, int i) {
        super(2);
        this.$t = i;
        this.l0 = c51671KPr;
        this.l1 = kpj;
        this.l2 = syl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS125S0300000_8(Context context, SearchFeedbackOptionalFragment searchFeedbackOptionalFragment, JYG jyg, int i) {
        super(2);
        this.$t = i;
        this.l0 = context;
        this.l1 = searchFeedbackOptionalFragment;
        this.l2 = jyg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS125S0300000_8(SearchHubVM searchHubVM, RecyclerView recyclerView, ViewGroup viewGroup, int i) {
        super(2);
        this.$t = i;
        this.l0 = searchHubVM;
        this.l1 = recyclerView;
        this.l2 = viewGroup;
    }
}
