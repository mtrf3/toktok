package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeStatusBean;
import kotlin.jvm.internal.o;

/* renamed from: X.2oa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69802oa {
    public final AwemeStatusBean LIZ;
    public final Aweme LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69802oa)) {
            return false;
        }
        C69802oa c69802oa = (C69802oa) obj;
        return o.LJ(this.LIZ, c69802oa.LIZ) && o.LJ(this.LIZIZ, c69802oa.LIZIZ) && this.LIZJ == c69802oa.LIZJ;
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Aweme aweme = this.LIZIZ;
        return C16880lQ.LLJIJIL(this.LIZJ) + ((hashCode + (aweme == null ? 0 : aweme.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeCacheItem(bean=");
        LIZ.append(this.LIZ);
        LIZ.append(", aweme=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", cacheTimestamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public static boolean LIZ(C69802oa c69802oa) {
        long j = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
        try {
            SettingsManager.LIZLLL().getClass();
            j = SettingsManager.LJFF("im_feed_video_status_valid_duration", LivePreviewNetworkSpeedThresholdSetting.DEFAULT);
        } catch (Exception unused) {
        }
        c69802oa.getClass();
        if (System.currentTimeMillis() - c69802oa.LIZJ > j) {
            return true;
        }
        return false;
    }

    public C69802oa(AwemeStatusBean bean, Aweme aweme) {
        long currentTimeMillis = System.currentTimeMillis();
        o.LJIIIZ(bean, "bean");
        this.LIZ = bean;
        this.LIZIZ = aweme;
        this.LIZJ = currentTimeMillis;
    }
}
