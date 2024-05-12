package X;

import com.google.android.gms.cast.MediaInfo;

/* renamed from: X.Zak, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90206Zak {
    public final MediaInfo LIZ;

    public C90206Zak(String str) {
        MediaInfo mediaInfo = new MediaInfo(str, -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        if (str != null) {
            this.LIZ = mediaInfo;
            return;
        }
        throw new IllegalArgumentException("contentID cannot be null");
    }
}
