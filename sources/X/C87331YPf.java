package X;

import com.ss.android.ugc.aweme.notice.api.ab.WsConnectTimeoutReconnectExp;

/* renamed from: X.YPf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87331YPf extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87331YPf LJLIL = new C87331YPf();

    public C87331YPf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(((WsConnectTimeoutReconnectExp.MetaData) WsConnectTimeoutReconnectExp.LIZIZ.getValue()).isOnlyForegroundReconnect);
    }
}
