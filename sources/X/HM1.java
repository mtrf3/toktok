package X;

import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HM1 {
    public static java.util.Set<String> LIZJ;
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(HM2.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(HM3.LJLIL);
    public static final java.util.Map<String, Video> LIZLLL = new LinkedHashMap();

    public static java.util.Set LIZ() {
        if (LIZJ == null) {
            LIZJ = LIZIZ().getStringSet("key_unique_id_list", new LinkedHashSet());
        }
        return LIZJ;
    }

    public static Keva LIZIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static Video LIZJ(String uniqueId) {
        Object LIZ2;
        o.LJIIIZ(uniqueId, "uniqueId");
        Object obj = ((LinkedHashMap) LIZLLL).get(uniqueId);
        if (obj == null) {
            try {
                LIZ2 = (Video) ((Gson) LIZ.getValue()).LJI(LIZIZ().getStringJustDisk(uniqueId, ""), Video.class);
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            if (C3C5.m12isFailureimpl(LIZ2)) {
                LIZ2 = null;
            }
            return (Video) LIZ2;
        }
        return (Video) obj;
    }

    public static void LIZLLL(Video video, String str) {
        LIZLLL.put(str, video);
        java.util.Set LIZ2 = LIZ();
        if (LIZ2 != null) {
            LIZ2.add(str);
        }
        try {
            LIZIZ().storeStringSet("key_unique_id_list", LIZ());
            LIZIZ().storeStringJustDisk(str, ((Gson) LIZ.getValue()).LJIILL(video));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
