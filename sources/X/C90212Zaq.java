package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import org.json.JSONObject;

/* renamed from: X.Zaq, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90212Zaq {
    public final MediaQueueItem LIZ;

    public final MediaQueueItem LIZ() {
        MediaQueueItem mediaQueueItem = this.LIZ;
        if (mediaQueueItem.zzb != null) {
            if (Double.isNaN(mediaQueueItem.zze) || mediaQueueItem.zze >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                if (!Double.isNaN(mediaQueueItem.zzf)) {
                    if (!Double.isNaN(mediaQueueItem.zzg) && mediaQueueItem.zzg >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        return this.LIZ;
                    }
                    throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
                }
                throw new IllegalArgumentException("playbackDuration cannot be NaN.");
            }
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public C90212Zaq(MediaInfo mediaInfo) {
        MediaQueueItem mediaQueueItem = new MediaQueueItem(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null);
        if (mediaInfo != null) {
            this.LIZ = mediaQueueItem;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public C90212Zaq(JSONObject jSONObject) {
        this.LIZ = new MediaQueueItem(jSONObject);
    }
}
