package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;

/* renamed from: X.Uv8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78730Uv8 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Video video) {
        UrlModel originCover;
        if (!DZ4.LIZ || (originCover = video.getOriginCover()) == null || originCover.getUrlList().isEmpty()) {
            return;
        }
        android.net.Uri parse = UriProtector.parse((String) ListProtector.get(originCover.getUrlList(), 0));
        if (C78765Uvh.LJIILIIL(parse)) {
            return;
        }
        W5P LIZLLL = W5P.LIZLLL(parse);
        if (C2299590t.LIZ) {
            LIZLLL.LJFF = QGT.SMALL;
        }
        W8E.LJII().LJI().LJIILIIL(LIZLLL.LIZ());
    }
}
