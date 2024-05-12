package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment;

/* renamed from: X.Tfd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75221Tfd implements InterfaceC75226Tfi {
    public final /* synthetic */ MultiGuestEffectSwitchFragment LIZ;

    public C75221Tfd(MultiGuestEffectSwitchFragment multiGuestEffectSwitchFragment) {
        this.LIZ = multiGuestEffectSwitchFragment;
    }

    @Override // X.InterfaceC75226Tfi
    public final void LJIJJ(int i, int i2) {
        InterfaceC75220Tfc interfaceC75220Tfc;
        InterfaceC75220Tfc interfaceC75220Tfc2;
        if (i != 4 && i != 8) {
            if (i == 0) {
                if ((i2 != 4 && i2 != 8) || (interfaceC75220Tfc2 = this.LIZ.LJLLLLLL) == null) {
                    return;
                }
                interfaceC75220Tfc2.LIZ();
                return;
            }
            return;
        }
        if (i2 != 0 || (interfaceC75220Tfc = this.LIZ.LJLLLLLL) == null) {
            return;
        }
        interfaceC75220Tfc.LIZIZ();
    }
}
