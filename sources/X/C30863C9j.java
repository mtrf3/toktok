package X;

import com.bytedance.android.livesdk.livesetting.hybrid.LiveReplayDownloadGlobalNetworkListenEnableSetting;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.C9j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30863C9j {
    public static final C5H3 LIZ = C78996UzQ.LJJIJIIJI(C30862C9i.INSTANCE);

    public static final void LIZIZ(String key) {
        o.LJIIIZ(key, "key");
        if (!LiveReplayDownloadGlobalNetworkListenEnableSetting.INSTANCE.getValue()) {
            return;
        }
        ((ConcurrentHashMap) ((C9O) LIZ.getValue()).LIZLLL).remove(key);
    }

    public static final void LIZ(String key, C9W c9w) {
        o.LJIIIZ(key, "key");
        if (!LiveReplayDownloadGlobalNetworkListenEnableSetting.INSTANCE.getValue()) {
            return;
        }
        ((ConcurrentHashMap) ((C9O) LIZ.getValue()).LIZLLL).put(key, c9w);
    }
}
