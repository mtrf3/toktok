package X;

import com.ss.android.ugc.aweme.websocket.api.ab.WsPingExp;

/* renamed from: X.YPi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87334YPi extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C87334YPi LJLIL = new C87334YPi();

    public C87334YPi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(((WsPingExp.MetaData) WsPingExp.LIZIZ.getValue()).delaySeconds);
    }
}
