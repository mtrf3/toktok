package X;

import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.61d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1536161d {
    public static final int LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;
    public static final int LJI;
    public static final int LJII;
    public static final int LJIIIIZZ;
    public static final HashMap<String, Integer> LJIIIZ = new HashMap<>();
    public static final SharedPreferences LJIIJ = F9J.LIZIZ(C60903NvH.LJ, 0, "av_settings.xml");
    public static boolean LJIIJJI = true;

    static {
        String[] strArr = {"cut_optimized", "canvas_gesture", "countdown_sticker", "custom_sticker", "music", "text", "sticker", "effect", "voice"};
        LIZ = ORY.LJJJJIZL("custom_sticker", strArr);
        LIZIZ = ORY.LJJJJIZL("countdown_sticker", strArr);
        LIZJ = ORY.LJJJJIZL("music", strArr);
        LIZLLL = ORY.LJJJJIZL("text", strArr);
        LJ = ORY.LJJJJIZL("sticker", strArr);
        LJFF = ORY.LJJJJIZL("effect", strArr);
        LJI = ORY.LJJJJIZL("voice", strArr);
        LJII = ORY.LJJJJIZL("canvas_gesture", strArr);
        LJIIIIZZ = ORY.LJJJJIZL("cut_optimized", strArr);
    }

    public static java.util.Set LIZIZ() {
        String string = LJIIJ.getString("prompt_shown", "");
        HashSet hashSet = new HashSet();
        if (string != null && string.length() > 0) {
            Object fromJson = GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), string, (Class<Object>) java.util.Set.class);
            o.LJII(fromJson, "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
            return C65777Prh.LIZLLL(fromJson);
        }
        return hashSet;
    }

    public static final void LIZ(String str) {
        java.util.Set LIZIZ2 = LIZIZ();
        if (LIZIZ2.add(str)) {
            LJ(LIZIZ2);
        }
    }

    public static final boolean LIZJ(String str) {
        return LIZIZ().contains(str);
    }

    public static final void LJ(java.util.Set<String> tagSet) {
        o.LJIIIZ(tagSet, "tagSet");
        if (tagSet.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(LIZIZ());
        linkedHashSet.addAll(tagSet);
        LJIIJ.edit().putString("prompt_shown", GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), linkedHashSet)).commit();
    }

    public static final void LIZLLL(int i, String str) {
        LJIIIZ.put(str, Integer.valueOf(i));
    }
}
