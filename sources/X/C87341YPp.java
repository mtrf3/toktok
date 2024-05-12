package X;

import com.bytedance.ies.im.core.exp.WsIMReconnectExp;

/* renamed from: X.YPp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87341YPp extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87341YPp LJLIL = new C87341YPp();

    public C87341YPp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(((WsIMReconnectExp.MetaData) WsIMReconnectExp.LIZIZ.getValue()).reconnectWhenTriggerPolling);
    }
}
