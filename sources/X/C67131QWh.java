package X;

import com.ss.android.ugc.aweme.notice.api.ab.WsNetAvailableDelayConnectExp;

/* renamed from: X.QWh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67131QWh extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C67131QWh LJLIL = new C67131QWh();

    public C67131QWh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C67124QWa.LIZLLL = false;
        C67143QWt c67143QWt = QWY.LJIIIZ;
        if (c67143QWt.LIZ().LIZLLL == EnumC66933QOr.CONNECTED) {
            C221018lt.LJFF("WsReconnectUtils", "[onNetworkChange], already connected, no need to reconnect");
        } else if (c67143QWt.LIZ().LIZLLL != EnumC66933QOr.CONNECTING || ((Boolean) WsNetAvailableDelayConnectExp.LJ.getValue()).booleanValue()) {
            C67124QWa.LIZ("NETWORK_DELAY_RECONNECT");
        }
        return C76800UCe.LIZ;
    }
}
