package X;

import Y.ARunnableS24S0200000_5;
import Y.ARunnableS41S0100000_5;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.user.BadgeStruct;

/* renamed from: X.CbM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31640CbM implements InterfaceC31664Cbk {
    public final /* synthetic */ C31635CbH LIZ;

    @Override // X.InterfaceC31664Cbk
    public final void onFail() {
        int i;
        C31635CbH c31635CbH = this.LIZ;
        c31635CbH.LJIIIIZZ(new ARunnableS41S0100000_5(c31635CbH, 228));
        C31635CbH c31635CbH2 = this.LIZ;
        BadgeStruct badgeStruct = c31635CbH2.LJ;
        if (badgeStruct != null && badgeStruct.badgeScene == 8) {
            C31647CbT c31647CbT = c31635CbH2.LJI;
            if (c31647CbT != null) {
                i = c31647CbT.LJLLLL;
            } else {
                i = -1;
            }
            c31635CbH2.LJII(i, false);
        }
    }

    public C31640CbM(C31635CbH c31635CbH) {
        this.LIZ = c31635CbH;
    }

    @Override // X.InterfaceC31664Cbk
    public final void LIZIZ(Bitmap bitmap) {
        int i;
        C31635CbH c31635CbH = this.LIZ;
        c31635CbH.LJIIIIZZ(new ARunnableS24S0200000_5(bitmap, c31635CbH, 54));
        C31635CbH c31635CbH2 = this.LIZ;
        BadgeStruct badgeStruct = c31635CbH2.LJ;
        if (badgeStruct != null && badgeStruct.badgeScene == 8) {
            C31647CbT c31647CbT = c31635CbH2.LJI;
            if (c31647CbT != null) {
                i = c31647CbT.LJLLLL;
            } else {
                i = -1;
            }
            c31635CbH2.LJII(i, true);
        }
    }
}
