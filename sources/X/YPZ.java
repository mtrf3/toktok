package X;

import com.ss.android.ugc.aweme.notice.api.ab.WsNetAvailableDelayConnectExp;

/* loaded from: classes16.dex */
public final class YPZ extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final YPZ LJLIL = new YPZ();

    public YPZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(((WsNetAvailableDelayConnectExp.MetaData) WsNetAvailableDelayConnectExp.LIZIZ.getValue()).delaySeconds);
    }
}
