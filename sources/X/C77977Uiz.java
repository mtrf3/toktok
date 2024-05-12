package X;

import com.bytedance.android.live.rank.impl.list.controller.RankPageController;

/* renamed from: X.Uiz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77977Uiz implements InterfaceC78031Ujr {
    public final /* synthetic */ RankPageController LIZ;

    @Override // X.InterfaceC78031Ujr
    public final void LIZ() {
        InterfaceC77978Uj0 interfaceC77978Uj0 = this.LIZ.LJLJL;
        if (interfaceC77978Uj0 != null) {
            interfaceC77978Uj0.F9();
        }
        C31520CYq.LIZ.clear();
    }

    public C77977Uiz(RankPageController rankPageController) {
        this.LIZ = rankPageController;
    }

    @Override // X.InterfaceC78031Ujr
    public final void LJIILIIL(long j) {
        this.LIZ.LIZLLL(j / 1000);
    }
}
