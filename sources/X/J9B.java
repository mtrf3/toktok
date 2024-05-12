package X;

import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class J9B implements InterfaceC133905Ni {
    public static final J9B LJLIL = new J9B();

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        if (i == 4417 && str != null && s.LJJLIIIJL(str, ":", 0, false, 6) > 0 && s.LJJLIIIJL(str, ":", 0, false, 6) + 1 < str.length()) {
            String substring = str.substring(s.LJJLIIIJL(str, ":", 0, false, 6) + 1);
            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            if (substring != null && o.LJ(J9C.LIZ, substring) && !J9C.LIZLLL) {
                J9C.LIZLLL = true;
                long currentTimeMillis = System.currentTimeMillis() - J9C.LJ;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("play_type", ILO.AUDIO.name());
                c188727au.LIZLLL(J9C.LIZJ, "is_audio_streaming");
                c188727au.LJ(currentTimeMillis, "duration");
                c188727au.LJIIIZ("enter_from", "video_edit_page");
                String str2 = J9C.LIZIZ;
                if (str2 == null) {
                    str2 = "";
                }
                c188727au.LJIIIZ("meta_song_id", str2);
                FMX.LJIIL("video_play_quality", c188727au.LIZ);
            }
        }
    }
}
