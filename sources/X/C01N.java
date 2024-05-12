package X;

import android.media.MediaDescription;

/* renamed from: X.01N, reason: invalid class name */
/* loaded from: classes.dex */
public class C01N {
    public static android.net.Uri LIZ(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void LIZIZ(MediaDescription.Builder builder, android.net.Uri uri) {
        builder.setMediaUri(uri);
    }
}
