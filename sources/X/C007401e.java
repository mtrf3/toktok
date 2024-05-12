package X;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* renamed from: X.01e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C007401e {
    public static Bundle LIZ(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    public static void LIZIZ(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}
