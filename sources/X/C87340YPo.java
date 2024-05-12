package X;

import com.bytedance.ies.im.core.exp.WsIMReconnectExp;

/* renamed from: X.YPo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87340YPo extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87340YPo LJLIL = new C87340YPo();

    public C87340YPo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(((WsIMReconnectExp.MetaData) WsIMReconnectExp.LIZIZ.getValue()).reconnectWhenSendMsgWsUnavailable);
    }
}
