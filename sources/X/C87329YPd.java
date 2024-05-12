package X;

import com.ss.android.ugc.aweme.notice.api.ab.WsConnectTimeoutReconnectExp;

/* renamed from: X.YPd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87329YPd extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C87329YPd LJLIL = new C87329YPd();

    public C87329YPd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(((WsConnectTimeoutReconnectExp.MetaData) WsConnectTimeoutReconnectExp.LIZIZ.getValue()).delaySeconds);
    }
}
