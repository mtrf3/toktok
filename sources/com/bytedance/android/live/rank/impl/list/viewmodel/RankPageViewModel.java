package com.bytedance.android.live.rank.impl.list.viewmodel;

import X.AbstractC78035Ujv;
import X.BPN;
import X.C31526CYw;
import X.C77942UiQ;
import X.C78005UjR;
import X.C78016Ujc;
import X.C78020Ujg;
import X.C78021Ujh;
import X.EnumC31514CYk;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import webcast.api.ranklist.LynxRankView;

/* loaded from: classes14.dex */
public final class RankPageViewModel extends ViewModel {
    public EnumC31514CYk LJLIL = EnumC31514CYk.DEFAULT;
    public RankTypeV2 LJLILLLLZI;
    public boolean LJLJI;
    public final MutableLiveData<List<AbstractC78035Ujv>> LJLJJI;
    public final MutableLiveData<C78021Ujh> LJLJJL;
    public List<? extends SubRankTabInfo> LJLJJLL;
    public final MutableLiveData<C78005UjR> LJLJL;
    public final MutableLiveData<C78020Ujg> LJLJLJ;
    public final MutableLiveData<List<RankListV2Response.Bulletin>> LJLJLLL;
    public final MutableLiveData<LynxRankView> LJLL;
    public final MutableLiveData<RankListV2Response.RankView> LJLLI;
    public final MutableLiveData<C77942UiQ> LJLLILLLL;
    public int LJLLJ;
    public RankTypeV2 LJLLL;

    public final void hv0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C78016Ujc(gv0(this.LJLLL)));
        this.LJLJJI.postValue(arrayList);
    }

    public RankPageViewModel() {
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIILL;
        this.LJLILLLLZI = rankTypeV2;
        this.LJLJJI = new MutableLiveData<>();
        this.LJLJJL = new MutableLiveData<>();
        this.LJLJL = new MutableLiveData<>();
        this.LJLJLJ = new MutableLiveData<>();
        this.LJLJLLL = new MutableLiveData<>();
        this.LJLL = new MutableLiveData<>();
        this.LJLLI = new MutableLiveData<>();
        this.LJLLILLLL = new MutableLiveData<>();
        this.LJLLL = rankTypeV2;
    }

    public final C31526CYw gv0(RankTypeV2 rankTypeV2) {
        return new C31526CYw(this.LJLIL, rankTypeV2, rankTypeV2, this.LJLILLLLZI, this.LJLJI);
    }

    public final void kv0(int i) {
        int i2;
        int i3;
        SubRankTabInfo subRankTabInfo;
        SubRankTabInfo subRankTabInfo2;
        this.LJLLJ = i;
        List<? extends SubRankTabInfo> list = this.LJLJJLL;
        if (list != null && (subRankTabInfo2 = (SubRankTabInfo) ListProtector.get(list, i)) != null) {
            i2 = subRankTabInfo2.rankType;
        } else {
            i2 = -1;
        }
        List<? extends SubRankTabInfo> list2 = this.LJLJJLL;
        if (list2 != null && (subRankTabInfo = (SubRankTabInfo) ListProtector.get(list2, this.LJLLJ)) != null) {
            i3 = subRankTabInfo.LIZ;
        } else {
            i3 = 0;
        }
        this.LJLLL = BPN.LIZ(i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void iv0(java.lang.String r23, com.bytedance.android.livesdk.rank.api.RankTypeV2 r24, boolean r25, boolean r26, X.InterfaceC78033Ujt r27, X.C77979Uj1 r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel.iv0(java.lang.String, com.bytedance.android.livesdk.rank.api.RankTypeV2, boolean, boolean, X.Ujt, X.Uj1, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jv0(com.bytedance.android.livesdk.rank.api.RankTypeV2 r29, androidx.fragment.app.Fragment r30, long r31, long r33, boolean r35, boolean r36, X.C77979Uj1 r37, X.InterfaceC78033Ujt r38, X.C77987Uj9 r39) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel.jv0(com.bytedance.android.livesdk.rank.api.RankTypeV2, androidx.fragment.app.Fragment, long, long, boolean, boolean, X.Uj1, X.Ujt, X.Uj9):void");
    }
}
