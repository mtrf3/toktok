package X;

import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAdaptMicRoomSwitchSetting;
import com.zhiliaoapp.musically.R;

/* renamed from: X.TkZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75527TkZ implements InterfaceC74841TYv {
    public final /* synthetic */ C75525TkX LIZ;

    public C75527TkZ(C75525TkX c75525TkX) {
        this.LIZ = c75525TkX;
    }

    @Override // X.InterfaceC74841TYv
    public final void LIZ(boolean z) {
        if (z && C75650TmY.LJI.compareTo(EnumC75673Tmv.IDLE) > 0) {
            C75650TmY.LIZ(false);
        }
        if (C74726TUk.LIZ() && z) {
            this.LIZ.LJIIIZ(R.drawable.cxo);
            C75525TkX c75525TkX = this.LIZ;
            c75525TkX.LLFFF = true;
            TYQ.LIZLLL(c75525TkX.LJLJJI, "setCohostIconInMultiGuest, multi-guest start");
            return;
        }
        if (RandomLinkMicManager.LJIIIZ()) {
            return;
        }
        if (!MultiGuestAdaptMicRoomSwitchSetting.INSTANCE.isEnable() && !C74726TUk.LIZ()) {
            return;
        }
        String str = this.LIZ.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setLinkDrawable, multi-guest close. linkCrossRoomState:");
        LIZ.append(this.LIZ.LLIIIJ);
        TYQ.LIZLLL(str, X1D.LIZIZ(LIZ));
        this.LIZ.LJIIL();
        this.LIZ.LLFFF = false;
    }
}
