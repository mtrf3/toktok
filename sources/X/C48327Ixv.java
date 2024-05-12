package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import defpackage.e1;
import java.io.File;
import java.io.IOException;

/* renamed from: X.Ixv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48327Ixv {
    public static C48325Ixt LIZ() {
        if (!C48325Ixt.LIZIZ) {
            C48325Ixt.LIZIZ = true;
            if (e1.LIZ(31744, "creative_tools_open_music_cache", true, false)) {
                try {
                    String LIZ = XPS.LIZLLL().LIZ();
                    if (!C30581Hy.LJII(LIZ)) {
                        C30581Hy.LJIIJ(LIZ);
                    }
                    File file = new File(LIZ);
                    FFL.LJIIIZ().getClass();
                    C48325Ixt.LIZJ = new C48317Ixl(file, FFL.LJIILIIL(31744, 100L, "creative_tool_music_cache_threshold") * 1048576, AVExternalServiceImpl.LIZ().configService().cacheConfig().draftMusicList());
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        return new C48325Ixt();
    }
}
