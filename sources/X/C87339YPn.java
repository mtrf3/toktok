package X;

import com.bytedance.ies.im.core.exp.WsIMReconnectExp;

/* renamed from: X.YPn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87339YPn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87339YPn LJLIL = new C87339YPn();

    public C87339YPn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(((WsIMReconnectExp.MetaData) WsIMReconnectExp.LIZIZ.getValue()).reconnectWhenSendMsgWsFailed);
    }
}
