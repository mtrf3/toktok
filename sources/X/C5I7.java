package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.5I7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5I7 {
    public static final java.util.Set<AVMusic> LIZ = new LinkedHashSet();

    public static void LIZ(AVMusic avMusic) {
        o.LJIIIZ(avMusic, "avMusic");
        if (LIZIZ(avMusic.getMusicId()) == null) {
            AVMusic m156clone = avMusic.m156clone();
            m156clone.setMusicStartFromCut(0);
            LIZ.add(m156clone);
        }
    }

    public static AVMusic LIZIZ(String str) {
        java.util.Set<AVMusic> set = LIZ;
        AVMusic aVMusic = null;
        if (set.isEmpty() || str == null || str.length() == 0) {
            return null;
        }
        Iterator<AVMusic> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AVMusic next = it.next();
            if (o.LJ(next.getMusicId(), str)) {
                aVMusic = next;
                break;
            }
        }
        return aVMusic;
    }
}
