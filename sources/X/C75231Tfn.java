package X;

import com.bytedance.android.livesdk.dataChannel.VideoBelowBackgroundUpdateEvent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.Tfn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75231Tfn extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public static final C75231Tfn LJLIL = new C75231Tfn();

    public C75231Tfn() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        InterfaceC75579TlP LJJJIL;
        if (TV3.LIZJ() && ((LJJJIL = C78886Uxe.LJJJIL(C8E.LJ())) == null || !((U8H) LJJJIL).LJJIL())) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            if (str == null) {
                str = "";
            }
            dataChannelGlobal.sv0(VideoBelowBackgroundUpdateEvent.class, str);
        }
        return C76800UCe.LIZ;
    }
}
