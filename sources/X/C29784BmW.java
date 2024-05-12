package X;

import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;

/* renamed from: X.BmW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29784BmW implements InterfaceC29986Bpm {
    @Override // X.InterfaceC29986Bpm
    public final String A4() {
        return "InteractionLikeHelper";
    }

    @Override // X.InterfaceC29986Bpm
    public final /* synthetic */ void dc(LikeHelper likeHelper, String str) {
    }

    @Override // X.InterfaceC29986Bpm
    public final void t3(LikeHelper likeHelper, int i) {
        B4U.LIZ().LJJII("like");
    }

    @Override // X.InterfaceC29986Bpm
    public final void g4(LikeHelper likeHelper, int i, int i2, float f, float f2, float f3, float f4) {
        LivePerformanceManager LIZ = B4U.LIZ();
        if (i2 == 1) {
            LIZ.LJJIFFI("like", null);
        }
        C31014CFe.LJIILLIIL();
        LIZ.LJJI("show_like");
    }
}
