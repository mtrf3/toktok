package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Uia, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77952Uia implements InterfaceC78032Ujs {
    public final /* synthetic */ Fragment LIZ;
    public final /* synthetic */ RankRootViewModel LIZIZ;
    public final /* synthetic */ RankTypeV2 LIZJ;
    public final /* synthetic */ InterfaceC78033Ujt LIZLLL;
    public final /* synthetic */ C77979Uj1 LJ;

    @Override // X.InterfaceC78032Ujs
    public final void LIZ(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        if (this.LIZ.isAdded()) {
            RankRootViewModel rankRootViewModel = this.LIZIZ;
            RankTypeV2 rankTypeV2 = this.LIZJ;
            int i = rankTypeV2.type;
            int i2 = rankTypeV2.rankPhase;
            C77979Uj1 c77979Uj1 = this.LJ;
            rankRootViewModel.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C78016Ujc(rankRootViewModel.gv0(rankRootViewModel.LJLJLJ)));
            rankRootViewModel.LJLLI.postValue(arrayList);
            C31524CYu.LJFF(throwable, i, i2, c77979Uj1.LIZ, c77979Uj1.LIZIZ, c77979Uj1.LIZJ, c77979Uj1.LIZLLL);
        }
    }

    @Override // X.InterfaceC78032Ujs
    public final void LIZIZ(String responseString) {
        o.LJIIIZ(responseString, "responseString");
        if (this.LIZ.isAdded()) {
            this.LIZIZ.iv0(responseString, this.LIZJ, this.LIZLLL, this.LJ, false);
        }
    }

    public C77952Uia(Fragment fragment, RankRootViewModel rankRootViewModel, RankTypeV2 rankTypeV2, C77944UiS c77944UiS, C77979Uj1 c77979Uj1) {
        this.LIZ = fragment;
        this.LIZIZ = rankRootViewModel;
        this.LIZJ = rankTypeV2;
        this.LIZLLL = c77944UiS;
        this.LJ = c77979Uj1;
    }
}
