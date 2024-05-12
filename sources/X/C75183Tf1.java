package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.Tf1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75183Tf1 extends AbstractC65781Prl implements InterfaceC65784Pro<Room> {
    public static final C75183Tf1 LJLIL = new C75183Tf1();

    public C75183Tf1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdkapi.depend.model.live.Room] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.livesdkapi.depend.model.live.Room] */
    @Override // X.InterfaceC65784Pro
    public final Room invoke() {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        ?? mv0 = dataChannelGlobal.mv0(C29044Baa.class);
        if (mv0 == 0) {
            return dataChannelGlobal.mv0(C29108Bbc.class);
        }
        return mv0;
    }
}
