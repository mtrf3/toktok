package X;

import com.bytedance.android.live.livepullstream.api.IPullStreamService;

/* renamed from: X.Uqz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78473Uqz {
    public static final /* synthetic */ int LIZ = 0;

    public static final Boolean LIZ() {
        InterfaceC28737BPp h0 = C78480Ur6.LIZ.h0();
        if (h0 != null) {
            return Boolean.valueOf(h0.isPlaying());
        }
        return null;
    }

    public static final void LIZIZ(boolean z) {
        InterfaceC28738BPq h0 = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).h0();
        if (h0 != null) {
            h0.LJJJJ(h0.getPlayerTag(), "", z);
        }
    }
}
