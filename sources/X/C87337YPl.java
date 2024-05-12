package X;

import com.ss.android.ugc.aweme.websocket.api.ab.WsPingExp;

/* renamed from: X.YPl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87337YPl extends AbstractC65781Prl implements InterfaceC65784Pro<WsPingExp.MetaData> {
    public static final C87337YPl LJLIL = new C87337YPl();

    public C87337YPl() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.websocket.api.ab.WsPingExp$MetaData, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final WsPingExp.MetaData invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        WsPingExp.MetaData metaData = WsPingExp.LIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "ws_ping_when_net_available", 31744, WsPingExp.MetaData.class, metaData);
        if (LJIJ == 0) {
            return metaData;
        }
        return LJIJ;
    }
}
