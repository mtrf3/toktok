package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.UOn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77121UOn {
    public static volatile C77121UOn LIZIZ;
    public final java.util.Map<String, Pair<Bitmap, Integer>> LIZ = new ConcurrentHashMap();

    public static C77121UOn LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C77121UOn.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C77121UOn();
                }
            }
        }
        return LIZIZ;
    }

    public final void LJ() {
        long j = 0;
        while (((ConcurrentHashMap) this.LIZ).entrySet().iterator().hasNext()) {
            j += ((Integer) ((Pair) ((Map.Entry) r2.next()).getValue()).second).intValue();
        }
        if (j > 12582912) {
            ((ConcurrentHashMap) this.LIZ).clear();
        }
    }

    public static String LIZ(Video video) {
        UrlModel originCover;
        if (video == null || (originCover = video.getOriginCover()) == null || originCover.getUrlList() == null || originCover.getUrlList().isEmpty()) {
            return null;
        }
        return (String) ListProtector.get(originCover.getUrlList(), 0);
    }

    public final Bitmap LIZJ(Video video) {
        try {
            String LIZ = LIZ(video);
            if (!TextUtils.isEmpty(LIZ) && ((ConcurrentHashMap) this.LIZ).containsKey(LIZ)) {
                return (Bitmap) ((Pair) ((ConcurrentHashMap) this.LIZ).remove(LIZ)).first;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void LIZLLL(Video video) {
        W5O LIZ;
        W50 w50;
        File LIZLLL;
        try {
            String LIZ2 = LIZ(video);
            if (TextUtils.isEmpty(LIZ2)) {
                return;
            }
            android.net.Uri parse = UriProtector.parse(LIZ2);
            InterfaceC70869Rrd LIZJ = W5U.LIZJ();
            if (LIZJ != null && (LIZLLL = LIZJ.LIZLLL(parse)) != null && LIZLLL.exists()) {
                W5P LIZLLL2 = W5P.LIZLLL(android.net.Uri.fromFile(LIZLLL));
                LIZLLL2.LJIIIZ = W92.MEDIUM;
                LIZ = LIZLLL2.LIZ();
                w50 = W50.DISK_CACHE;
            } else {
                W5P LIZLLL3 = W5P.LIZLLL(parse);
                LIZLLL3.LJIIIZ = W92.MEDIUM;
                LIZ = LIZLLL3.LIZ();
                w50 = W50.FULL_FETCH;
            }
            ArrayList arrayList = new ArrayList(1);
            W6J LIZ3 = W5I.LIZ();
            LIZ3.getClass();
            arrayList.add(new C81257Vun(LIZ3, LIZ, w50));
            C81697W4n c81697W4n = new C81697W4n(new C81687W4d(arrayList));
            c81697W4n.LJ(new C77122UOo(this, c81697W4n, LIZ2), C38995FSd.LIZLLL());
        } catch (Throwable unused) {
        }
    }
}
