package X;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: X.0gR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13790gR {
    public static Notification.MediaStyle LIZ() {
        return new Notification.MediaStyle();
    }

    public static void LIZJ(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    public static void LIZLLL(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    public static void LJ(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }

    public static Notification.MediaStyle LIZIZ(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
        if (iArr != null) {
            LJ(mediaStyle, iArr);
        }
        if (token != null) {
            LIZJ(mediaStyle, (MediaSession.Token) token.mInner);
        }
        return mediaStyle;
    }
}
