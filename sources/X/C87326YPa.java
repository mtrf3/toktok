package X;

import com.ss.android.ugc.aweme.notice.api.ab.WsNetAvailableDelayConnectExp;

/* renamed from: X.YPa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87326YPa extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87326YPa LJLIL = new C87326YPa();

    public C87326YPa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(((WsNetAvailableDelayConnectExp.MetaData) WsNetAvailableDelayConnectExp.LIZIZ.getValue()).enableConnectingReconnect);
    }
}
