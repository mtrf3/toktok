package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import kotlin.jvm.internal.o;

/* renamed from: X.Uic, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77954Uic implements InterfaceC78032Ujs {
    public final /* synthetic */ Fragment LIZ;
    public final /* synthetic */ RankPageViewModel LIZIZ;
    public final /* synthetic */ RankTypeV2 LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ boolean LJ;
    public final /* synthetic */ InterfaceC78033Ujt LJFF;
    public final /* synthetic */ C77979Uj1 LJI;

    @Override // X.InterfaceC78032Ujs
    public final void LIZ(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        if (this.LIZ.isAdded()) {
            RankPageViewModel rankPageViewModel = this.LIZIZ;
            RankTypeV2 rankTypeV2 = this.LIZJ;
            int i = rankTypeV2.type;
            int i2 = rankTypeV2.rankPhase;
            boolean z = this.LIZLLL;
            boolean z2 = this.LJ;
            InterfaceC78033Ujt interfaceC78033Ujt = this.LJFF;
            C77979Uj1 c77979Uj1 = this.LJI;
            if (z) {
                rankPageViewModel.hv0();
            } else {
                rankPageViewModel.getClass();
                interfaceC78033Ujt.onError();
            }
            if (!z2) {
                C31524CYu.LJFF(throwable, i, i2, c77979Uj1.LIZ, c77979Uj1.LIZIZ, c77979Uj1.LIZJ, c77979Uj1.LIZLLL);
            }
        }
    }

    @Override // X.InterfaceC78032Ujs
    public final void LIZIZ(String responseString) {
        o.LJIIIZ(responseString, "responseString");
        if (this.LIZ.isAdded()) {
            this.LIZIZ.iv0(responseString, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, false);
        }
    }

    public C77954Uic(Fragment fragment, RankPageViewModel rankPageViewModel, RankTypeV2 rankTypeV2, boolean z, boolean z2, InterfaceC78033Ujt interfaceC78033Ujt, C77979Uj1 c77979Uj1) {
        this.LIZ = fragment;
        this.LIZIZ = rankPageViewModel;
        this.LIZJ = rankTypeV2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = interfaceC78033Ujt;
        this.LJI = c77979Uj1;
    }
}
