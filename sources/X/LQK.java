package X;

import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;

/* loaded from: classes10.dex */
public final class LQK implements Runnable {
    public static final LQK LJLIL = new LQK();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LiveBubbleData liveBubbleData = LQM.LJFF;
            if (liveBubbleData != null) {
                liveBubbleData.setRoomData(null);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
