package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import org.json.JSONObject;

/* renamed from: X.PMa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64316PMa extends C79359VCp {
    public static volatile C64316PMa LIZLLL;
    public JSONObject LIZJ;

    public C64316PMa() {
        super(3);
        this.LIZ = "TypePushFeature";
        Object obj = this.LIZIZ;
        if (obj != null) {
            ((VD4) obj).LIZ = "TypePushFeature";
        }
    }

    public static C64316PMa LIZLLL() {
        if (LIZLLL == null) {
            synchronized (C64316PMa.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C64316PMa();
                }
            }
        }
        return LIZLLL;
    }

    public final Object LIZJ(Object obj, String str) {
        if (this.LIZJ == null || LiveGiftNewGifterBadgeSetting.DEFAULT.getClass() != String.class || !this.LIZJ.has("stream_session_vv_id")) {
            return LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        return this.LIZJ.optString("stream_session_vv_id");
    }
}
