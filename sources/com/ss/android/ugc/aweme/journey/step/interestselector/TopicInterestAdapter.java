package com.ss.android.ugc.aweme.journey.step.interestselector;

import X.AbstractC88823eA;
import X.C0A2;
import X.C0A7;
import X.C1FL;
import X.C40864G2a;
import X.C40865G2b;
import X.C76800UCe;
import X.G2Y;
import X.G32;
import X.G33;
import X.G34;
import X.G35;
import X.G3B;
import X.G3C;
import X.G3G;
import X.InterfaceC88472Yns;
import X.KL2;
import X.W5F;
import X.W5U;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.plugin.journey.TopicInterestCategoryItemStruct;
import com.ss.android.ugc.aweme.plugin.journey.TopicInterestCategoryStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TopicInterestAdapter extends AbstractC88823eA {
    public final List<TopicInterestCategoryStruct> LJLILLLLZI;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLJI;
    public final C40865G2b LJLJJI;
    public final LinearLayoutManager LJLJJL;
    public final G3C LJLJJLL;
    public final C40864G2a LJLJL;
    public final HashSet<G2Y> LJLJLJ;

    @Override // X.AbstractC88823eA
    public final int LJLLLLLL() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC88823eA
    public final RecyclerView.ViewHolder LJLZ(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new TopicInterestViewHolder(C1FL.LIZIZ(parent, R.layout.bf2, parent, false, "from(parent.context).inf…st_select, parent, false)"));
    }

    @Override // X.AbstractC88823eA
    public final G35 LJZ(ViewGroup parent) {
        String str;
        o.LJIIIZ(parent, "parent");
        String str2 = this.LJLIL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        C40865G2b c40865G2b = this.LJLJJI;
        if (c40865G2b != null && (str = c40865G2b.LIZIZ) != null) {
            str3 = str;
        }
        G35 LIZ = G34.LIZ(parent, str2, str3);
        ViewGroup.LayoutParams layoutParams = LIZ.itemView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = (int) KL2.LIZJ(LIZ.itemView.getContext(), 28.0f);
        LIZ.itemView.setLayoutParams(marginLayoutParams);
        return LIZ;
    }

    /* loaded from: classes7.dex */
    public final class TopicInterestViewHolder extends RecyclerView.ViewHolder {
        public TopicInterestViewHolder(View view) {
            super(view);
            ((RecyclerView) this.itemView.findViewById(R.id.li7)).setLayoutManager(new StaggeredGridLayoutManager() { // from class: com.ss.android.ugc.aweme.journey.step.interestselector.TopicInterestAdapter.TopicInterestViewHolder.1
                @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, X.C0A2
                public final void LJJLJ(RecyclerView view2, C0A7 c0a7) {
                    o.LJIIIZ(view2, "view");
                }
            });
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof TopicInterestViewHolder) {
            TopicInterestViewHolder topicInterestViewHolder = (TopicInterestViewHolder) holder;
            RecyclerView recyclerView = (RecyclerView) topicInterestViewHolder.itemView.findViewById(R.id.li7);
            int adapterPosition = topicInterestViewHolder.getAdapterPosition() - 1;
            TopicInterestCategoryStruct topicInterestCategoryStruct = (TopicInterestCategoryStruct) ListProtector.get(TopicInterestAdapter.this.LJLILLLLZI, adapterPosition);
            ((TextView) topicInterestViewHolder.itemView.findViewById(R.id.text)).setText(topicInterestCategoryStruct.localizedTitle);
            String str = ((TopicInterestCategoryStruct) ListProtector.get(TopicInterestAdapter.this.LJLILLLLZI, topicInterestViewHolder.getAdapterPosition() - 1)).iconUrl;
            if (str == null) {
                str = "";
            }
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            LJIIIIZZ.LIZIZ(topicInterestViewHolder.itemView.getContext().getClass().getName());
            LJIIIIZZ.LJJIIJ = (SmartImageView) topicInterestViewHolder.itemView.findViewById(R.id.eiq);
            LJIIIIZZ.LIZLLL(new G3B(TopicInterestAdapter.this.LJLJJLL));
            List<TopicInterestCategoryItemStruct> list = topicInterestCategoryStruct.topics;
            C0A2 layoutManager = ((RecyclerView) topicInterestViewHolder.itemView.findViewById(R.id.li7)).getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            TopicInterestAdapter topicInterestAdapter = TopicInterestAdapter.this;
            InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = topicInterestAdapter.LJLJI;
            HashSet<G2Y> hashSet = topicInterestAdapter.LJLJLJ;
            topicInterestViewHolder.getAdapterPosition();
            recyclerView.setAdapter(new G3G(list, interfaceC88472Yns, adapterPosition, hashSet));
            recyclerView.LJIIJJI(new G33(adapterPosition, staggeredGridLayoutManager, TopicInterestAdapter.this));
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new G32(adapterPosition, staggeredGridLayoutManager, TopicInterestAdapter.this));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TopicInterestAdapter(java.util.List r2, kotlin.jvm.internal.AqS172S0100000_6 r3, X.C40865G2b r4, androidx.recyclerview.widget.LinearLayoutManager r5, X.G2Q r6, X.C40864G2a r7) {
        /*
            r1 = this;
            java.lang.String r0 = "topicUserInterestStruct"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "sizeListener"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "imageLoadingFailureCallback"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "visibleCategoryTracking"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            if (r4 == 0) goto L2f
            java.lang.String r0 = r4.LIZ
        L18:
            r1.<init>(r0)
            r1.LJLILLLLZI = r2
            r1.LJLJI = r3
            r1.LJLJJI = r4
            r1.LJLJJL = r5
            r1.LJLJJLL = r6
            r1.LJLJL = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.LJLJLJ = r0
            return
        L2f:
            r0 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.journey.step.interestselector.TopicInterestAdapter.<init>(java.util.List, kotlin.jvm.internal.AqS172S0100000_6, X.G2b, androidx.recyclerview.widget.LinearLayoutManager, X.G2Q, X.G2a):void");
    }
}
