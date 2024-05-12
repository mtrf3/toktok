package X;

import android.graphics.RectF;
import com.ss.android.ugc.aweme.feed.model.video.PillarBoxVideoInfo;

/* renamed from: X.RVt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69665RVt {
    public static boolean LIZ(PillarBoxVideoInfo pillarBoxVideoInfo) {
        if (pillarBoxVideoInfo.getLeft() > 0.0f || pillarBoxVideoInfo.getRight() > 0.0f || pillarBoxVideoInfo.getBottom() > 0.0f || pillarBoxVideoInfo.getTop() > 0.0f) {
            return true;
        }
        return false;
    }

    public static RectF LIZIZ(PillarBoxVideoInfo pillarBoxVideoInfo) {
        return new RectF(Math.max(0.0f, pillarBoxVideoInfo.getLeft() / 100.0f), Math.max(0.0f, pillarBoxVideoInfo.getTop() / 100.0f), 1.0f - Math.max(pillarBoxVideoInfo.getRight() / 100.0f, 0.0f), 1.0f - Math.max(pillarBoxVideoInfo.getBottom() / 100.0f, 0.0f));
    }
}
