package X;

import com.ss.android.ugc.aweme.notice.api.ab.WsConnectTimeoutReconnectExp;

/* renamed from: X.YPg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87332YPg extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87332YPg LJLIL = new C87332YPg();

    public C87332YPg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(((WsConnectTimeoutReconnectExp.MetaData) WsConnectTimeoutReconnectExp.LIZIZ.getValue()).isOnlyOnConnectingReconnect);
    }
}
