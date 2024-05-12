package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TDn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74287TDn {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(InterfaceC74528TMu downloader, Effect effect, boolean z) {
        String str;
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(downloader, "downloader");
        if (V3N.LJJII(effect)) {
            String effectId = effect.getEffectId();
            o.LJIIIZ(effectId, "effectId");
            TNW tnw = HXH.LIZ.get(effectId);
            List<String> music = effect.getMusic();
            if (music != null && !music.isEmpty()) {
                List<String> music2 = effect.getMusic();
                if (music2 != null) {
                    str = (String) ListProtector.get(music2, 0);
                } else {
                    str = null;
                }
                if (H9H.LIZIZ(str) == null) {
                    return z;
                }
            }
            if (tnw != null || !downloader.LIZ(effect, false)) {
                return false;
            }
            return z;
        }
        return z;
    }
}
