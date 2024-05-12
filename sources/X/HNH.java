package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes8.dex */
public final class HNH {
    public static V1K LIZ(String str, Bundle bundle, String str2, String str3, boolean z, boolean z2, UrlModel urlModel, int i, String str4, MusicModel musicModel, boolean z3, int i2) {
        boolean z4;
        boolean z5 = z2;
        boolean z6 = z3;
        if ((i2 & 512) != 0) {
            z5 = false;
        }
        if ((i2 & 1024) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i2 & 32768) != 0) {
            z6 = false;
        }
        return new V1K(str, 2, true, false, bundle, str2, str3, z, false, false, z5, z4, str4, urlModel, i, null, null, musicModel, z6);
    }
}
