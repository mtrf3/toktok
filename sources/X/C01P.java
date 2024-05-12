package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import defpackage.a1;

/* renamed from: X.01P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C01P {
    public final Bundle LIZ;

    public final MediaMetadataCompat LIZ() {
        return new MediaMetadataCompat(this.LIZ);
    }

    public C01P() {
        this.LIZ = new Bundle();
    }

    public C01P(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.LJLIL);
        this.LIZ = bundle;
        MediaSessionCompat.LIZ(bundle);
    }

    public final void LIZJ(long j) {
        C1HQ<String, Integer> c1hq = MediaMetadataCompat.LJLILLLLZI;
        if (!c1hq.containsKey("android.media.metadata.DURATION") || c1hq.getOrDefault("android.media.metadata.DURATION", null).intValue() == 0) {
            this.LIZ.putLong("android.media.metadata.DURATION", j);
            return;
        }
        throw new IllegalArgumentException(a1.LJ("The ", "android.media.metadata.DURATION", " key cannot be used to put a long"));
    }

    public final void LIZIZ(Bitmap bitmap, String str) {
        C1HQ<String, Integer> c1hq = MediaMetadataCompat.LJLILLLLZI;
        if (!c1hq.containsKey(str) || c1hq.getOrDefault(str, null).intValue() == 2) {
            this.LIZ.putParcelable(str, bitmap);
            return;
        }
        throw new IllegalArgumentException(a1.LJ("The ", str, " key cannot be used to put a Bitmap"));
    }

    public final void LIZLLL(String str, String str2) {
        C1HQ<String, Integer> c1hq = MediaMetadataCompat.LJLILLLLZI;
        if (!c1hq.containsKey(str) || c1hq.getOrDefault(str, null).intValue() == 1) {
            this.LIZ.putCharSequence(str, str2);
            return;
        }
        throw new IllegalArgumentException(a1.LJ("The ", str, " key cannot be used to put a String"));
    }
}
