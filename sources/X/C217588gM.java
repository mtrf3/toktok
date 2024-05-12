package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

/* renamed from: X.8gM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217588gM {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        if (aweme != null && !aweme.isPaidContent) {
            if (!aweme.isAd() && !aweme.isPhotoMode() && !aweme.isLive()) {
                if (C72083SQt.LJLIIIL(aweme)) {
                    C217598gN.LIZ.getClass();
                    if (!C217598gN.LIZIZ) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme) {
        int i;
        int i2;
        Video video;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            i = video.getDuration();
        } else {
            i = 0;
        }
        int i3 = C217618gP.LIZ;
        if (i3 > 0) {
            if (i <= i3) {
                return false;
            }
            return true;
        }
        C217608gO.LIZ.getClass();
        if (C217608gO.LIZIZ) {
            return true;
        }
        if (C209418Jt.LIZ(aweme).LIZLLL()) {
            i2 = 60000;
        } else {
            i2 = 30000;
        }
        if (i <= i2) {
            return false;
        }
        return true;
    }
}
