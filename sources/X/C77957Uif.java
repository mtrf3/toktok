package X;

import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;

/* renamed from: X.Uif, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77957Uif extends AbstractViewOnClickListenerC28292B8m {
    public final /* synthetic */ RankListFragment LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        continue;
     */
    @Override // X.AbstractViewOnClickListenerC28292B8m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r10 = this;
            com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment r1 = r10.LJLJJL
            int r0 = r10.LJLJJLL
            long r3 = (long) r0
            com.bytedance.android.live.rank.impl.list.controller.RankListController r0 = r1.LJLJJLL
            r7 = -1
            if (r0 == 0) goto Lac
            com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel r0 = r0.LJII()
            if (r0 == 0) goto Lac
            androidx.lifecycle.MutableLiveData<java.util.List<X.Ujv>> r0 = r0.LJLJJI
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto Lac
            java.util.Iterator r9 = r0.iterator()
            r8 = 0
        L21:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lc6
            java.lang.Object r1 = r9.next()
            X.Ujv r1 = (X.AbstractC78035Ujv) r1
            boolean r0 = r1 instanceof X.C77980Uj2
            if (r0 == 0) goto Lb3
            X.Uj2 r1 = (X.C77980Uj2) r1
            java.util.List<com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo> r0 = r1.LIZ
            java.util.Iterator r6 = r0.iterator()
            r5 = 0
        L3a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lc2
            java.lang.Object r0 = r6.next()
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo r0 = (com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankInfo) r0
            long r1 = r0.rank
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto Lb0
            if (r5 == r7) goto Lc2
        L4e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            if (r0 == 0) goto Lac
            int r2 = r0.intValue()
            if (r2 < 0) goto Lac
            com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment r0 = r10.LJLJJL
            android.content.Context r0 = r0.getContext()
            X.Uji r1 = new X.Uji
            r1.<init>(r0)
            r1.LIZ = r2
            com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment r0 = r10.LJLJJL
            X.CHd r0 = r0.LJLLLLLL
            if (r0 == 0) goto L76
            X.0A2 r0 = r0.getLayoutManager()
            if (r0 == 0) goto L76
            r0.LLIIIILZ(r1)
        L76:
            java.lang.String r0 = "livesdk_bottom_bar_click"
            X.BZI r2 = X.C28787BRn.LIZ(r0)
            com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment r0 = r10.LJLJJL
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = X.C51029K0z.LJIILIIL(r0)
            r2.LJIILLIIL(r0)
            com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment r0 = r10.LJLJJL
            X.CYw r0 = r0.LJLJJI
            com.bytedance.android.livesdk.rank.api.RankTypeV2 r0 = r0.LIZIZ
            java.lang.String r1 = r0.rankName
            java.lang.String r0 = "rank_type"
            r2.LJIJJ(r1, r0)
            com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment r0 = r10.LJLJJL
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = X.C51029K0z.LJIILIIL(r0)
            boolean r0 = X.C29306Beo.LJIIJ(r0)
            if (r0 == 0) goto Lad
            java.lang.String r1 = "anchor"
        La0:
            java.lang.String r0 = "user_type"
            r2.LJIJJ(r1, r0)
            int r1 = r10.LJLJJLL
            java.lang.String r0 = "current_rank"
            X.UFE.LIZIZ(r1, r2, r0)
        Lac:
            return
        Lad:
            java.lang.String r1 = "user"
            goto La0
        Lb0:
            int r5 = r5 + 1
            goto L3a
        Lb3:
            boolean r0 = r1 instanceof X.C78006UjS
            if (r0 == 0) goto Lc2
            X.UjS r1 = (X.C78006UjS) r1
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo r0 = r1.LIZ
            long r1 = r0.rank
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto Lc2
            goto L4e
        Lc2:
            int r8 = r8 + 1
            goto L21
        Lc6:
            r8 = -1
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77957Uif.LIZ():void");
    }

    public C77957Uif(RankListFragment rankListFragment, int i) {
        this.LJLJJL = rankListFragment;
        this.LJLJJLL = i;
    }
}
