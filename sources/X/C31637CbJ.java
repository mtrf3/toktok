package X;

import Y.ARunnableS24S0200000_5;
import Y.ARunnableS41S0100000_5;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.user.BadgeStruct;

/* renamed from: X.CbJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31637CbJ implements InterfaceC31664Cbk {
    public final /* synthetic */ C31634CbG LIZ;

    @Override // X.InterfaceC31664Cbk
    public final void onFail() {
        int i;
        C31634CbG c31634CbG = this.LIZ;
        c31634CbG.LIZIZ.post(new ARunnableS41S0100000_5(c31634CbG, 224));
        C31634CbG c31634CbG2 = this.LIZ;
        BadgeStruct badgeStruct = c31634CbG2.LJ;
        if (badgeStruct != null && badgeStruct.badgeScene == 8) {
            C31647CbT c31647CbT = c31634CbG2.LJI;
            if (c31647CbT != null) {
                i = c31647CbT.LJLLLL;
            } else {
                i = -1;
            }
            c31634CbG2.LJII(i, false);
        }
    }

    public C31637CbJ(C31634CbG c31634CbG) {
        this.LIZ = c31634CbG;
    }

    @Override // X.InterfaceC31664Cbk
    public final void LIZIZ(Bitmap bitmap) {
        int i;
        C31634CbG c31634CbG = this.LIZ;
        c31634CbG.LIZIZ.post(new ARunnableS24S0200000_5(bitmap, c31634CbG, 51));
        C31634CbG c31634CbG2 = this.LIZ;
        BadgeStruct badgeStruct = c31634CbG2.LJ;
        if (badgeStruct != null && badgeStruct.badgeScene == 8) {
            C31647CbT c31647CbT = c31634CbG2.LJI;
            if (c31647CbT != null) {
                i = c31647CbT.LJLLLL;
            } else {
                i = -1;
            }
            c31634CbG2.LJII(i, true);
        }
    }
}
