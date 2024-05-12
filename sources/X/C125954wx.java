package X;

import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4wx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125954wx {
    public static final java.util.Map<String, SoundEffect> LIZ = new LinkedHashMap();

    public static void LIZ(SoundEffect soundEffect) {
        o.LJIIIZ(soundEffect, "soundEffect");
        if (LIZIZ(V1B.LJJLIIIJLLLLLLLZ(soundEffect)) == null) {
            LIZ.put(V1B.LJJLIIIJLLLLLLLZ(soundEffect), SoundEffect.LIZ(soundEffect));
        }
    }

    public static SoundEffect LIZIZ(String str) {
        SoundEffect soundEffect;
        java.util.Map<String, SoundEffect> map = LIZ;
        if (map.isEmpty() || str == null || str.length() == 0 || !map.containsKey(str) || (soundEffect = (SoundEffect) ((LinkedHashMap) map).get(str)) == null) {
            return null;
        }
        return SoundEffect.LIZ(soundEffect);
    }
}
