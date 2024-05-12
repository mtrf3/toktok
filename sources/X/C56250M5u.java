package X;

import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.M5u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56250M5u extends AbstractC56238M5i {
    @Override // X.AbstractC56238M5i
    public final void LIZ(android.net.Uri uri) {
        C56251M5v.LJ = "op.embed";
        if (C78685UuP.LJJJZ(UriProtector.getQueryParameter(uri, "referer_video_id"))) {
            C56251M5v.LJFF = "video";
        }
    }
}
