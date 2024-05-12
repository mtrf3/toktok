package X;

import com.bytedance.android.live.liveinteract.multimatch.event.MatchStatusRestEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TxI, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76316TxI {
    public static final C76290Tws LIZ = new C76290Tws("data_battle_state", C76364Ty4.LJLIL);
    public static final C76290Tws LIZIZ = new C76290Tws("data_battle_rematch_state", null);

    static {
        new C278417k();
    }

    public static void LIZ(String str) {
        DataChannel dataChannel = B5G.LIZIZ().LIZIZ;
        if (dataChannel != null) {
            dataChannel.qv0(MatchStatusRestEvent.class, 0);
        }
        LIZ.LIZLLL(str, false);
        LIZIZ.LIZLLL(str, true);
    }
}
