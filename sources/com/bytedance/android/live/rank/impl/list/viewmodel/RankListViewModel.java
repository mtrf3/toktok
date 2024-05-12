package com.bytedance.android.live.rank.impl.list.viewmodel;

import X.AbstractC78035Ujv;
import X.C31526CYw;
import X.C77980Uj2;
import X.C77999UjL;
import X.C78006UjS;
import X.C78009UjV;
import X.C78016Ujc;
import X.CXJ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RankListViewModel extends ViewModel {
    public RankListV2Response.RankView LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJL;
    public long LJLJLJ;
    public C31526CYw LJLIL = C31526CYw.LJFF;
    public final MutableLiveData<List<AbstractC78035Ujv>> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<RankListV2Response.RankInfo> LJLJJL = new MutableLiveData<>();
    public final MutableLiveData<C77999UjL> LJLJJLL = new MutableLiveData<>();

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0089, code lost:
    
        if (r4 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c5, code lost:
    
        if (r5 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01bf, code lost:
    
        if (r5 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ba, code lost:
    
        if (r5 != null) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gv0(com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankView r23) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel.gv0(com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankView):void");
    }

    public final void hv0(boolean z) {
        if (!z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C78016Ujc(this.LJLIL));
            this.LJLJJI.postValue(arrayList);
            this.LJLJJL.postValue(null);
        }
    }

    public final void iv0(List<AbstractC78035Ujv> list, RankListV2Response.RankView rankView) {
        List<RankListV2Response.RankInfo> list2 = rankView.ranks;
        if (list2 != null) {
            int i = 0;
            int i2 = 3;
            if (list2.size() > 3) {
                ((ArrayList) list).add(new C77980Uj2(list2.subList(0, Math.min(3, list2.size())), this.LJLIL));
            }
            if (list2.size() <= 3) {
                i2 = 0;
            }
            int size = list2.size();
            while (i2 < size) {
                List<RankListV2Response.CutOffLine> list3 = rankView.cutOffLine;
                if (list3 != null && i < list3.size() && i2 == ((int) ((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).cutOffIndex)) {
                    ((ArrayList) list).add(new C78009UjV(this.LJLIL, CXJ.LJFF(((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).content, "").toString()));
                    i++;
                }
                Object obj = ListProtector.get(list2, i2);
                o.LJIIIIZZ(obj, "this[index]");
                ((ArrayList) list).add(new C78006UjS((RankListV2Response.RankInfo) obj, this.LJLIL));
                i2++;
            }
            if (i < rankView.cutOffLine.size() && list2.size() <= ((int) ((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).cutOffIndex)) {
                ((ArrayList) list).add(new C78009UjV(this.LJLIL, CXJ.LJFF(((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).content, "").toString()));
            }
        }
    }

    public final void jv0(List<AbstractC78035Ujv> list, RankListV2Response.RankView rankView) {
        List<RankListV2Response.RankInfo> list2 = rankView.ranks;
        if (list2 != null) {
            int size = list2.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                List<RankListV2Response.CutOffLine> list3 = rankView.cutOffLine;
                if (list3 != null && i < list3.size() && i2 == ((int) ((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).cutOffIndex)) {
                    ((ArrayList) list).add(new C78009UjV(this.LJLIL, CXJ.LJFF(((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).content, "").toString()));
                    i++;
                }
                Object obj = ListProtector.get(list2, i2);
                o.LJIIIIZZ(obj, "this[index]");
                ((ArrayList) list).add(new C78006UjS((RankListV2Response.RankInfo) obj, this.LJLIL));
            }
            if (i < rankView.cutOffLine.size() && list2.size() <= ((int) ((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).cutOffIndex)) {
                ((ArrayList) list).add(new C78009UjV(this.LJLIL, CXJ.LJFF(((RankListV2Response.CutOffLine) ListProtector.get(rankView.cutOffLine, i)).content, "").toString()));
            }
        }
    }
}
