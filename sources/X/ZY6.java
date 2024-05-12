package X;

import android.media.MediaRoute2Info;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes29.dex */
public final class ZY6 {
    public static List<String> LIZ(List<MediaRoute2Info> list) {
        if (list == null) {
            return new ArrayList();
        }
        return (List) list.stream().filter(new C90522Zfq()).map(new Function() { // from class: X.Zfv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MediaRoute2Info) obj).getId();
            }
        }).collect(Collectors.toList());
    }

    public static C90089ZXh LIZIZ(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        C90088ZXg c90088ZXg = new C90088ZXg(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
        c90088ZXg.LIZ.putInt("connectionState", mediaRoute2Info.getConnectionState());
        c90088ZXg.LIZ.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
        c90088ZXg.LIZ.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
        c90088ZXg.LIZ.putInt("volume", mediaRoute2Info.getVolume());
        c90088ZXg.LIZ.putBundle("extras", mediaRoute2Info.getExtras());
        c90088ZXg.LIZ.putBoolean("enabled", true);
        c90088ZXg.LIZ.putBoolean("canDisconnect", false);
        CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            c90088ZXg.LIZ.putString("status", description.toString());
        }
        android.net.Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            c90088ZXg.LIZ.putString("iconUri", iconUri.toString());
        }
        Bundle extras = mediaRoute2Info.getExtras();
        if (extras == null || !extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        c90088ZXg.LIZ.putBundle("extras", extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
        c90088ZXg.LIZ.putInt("deviceType", extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        c90088ZXg.LIZ.putInt("playbackType", extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            c90088ZXg.LIZ(parcelableArrayList);
        }
        return c90088ZXg.LIZIZ();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.String r1) {
        /*
            r1.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2065577523: goto L1d;
                case 956939050: goto L14;
                case 975975375: goto Lb;
                default: goto La;
            }
        La:
            return r1
        Lb:
            java.lang.String r0 = "android.media.intent.category.LIVE_VIDEO"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L26
            goto La
        L14:
            java.lang.String r0 = "android.media.intent.category.LIVE_AUDIO"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L29
            goto La
        L1d:
            java.lang.String r0 = "android.media.intent.category.REMOTE_PLAYBACK"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2c
            goto La
        L26:
            java.lang.String r0 = "android.media.route.feature.LIVE_VIDEO"
            return r0
        L29:
            java.lang.String r0 = "android.media.route.feature.LIVE_AUDIO"
            return r0
        L2c:
            java.lang.String r0 = "android.media.route.feature.REMOTE_PLAYBACK"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ZY6.LIZJ(java.lang.String):java.lang.String");
    }
}
