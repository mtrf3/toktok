package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.GhI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42200GhI {
    public static final boolean LIZ;
    public static boolean LIZIZ;

    static {
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getABService().getClass();
        LIZ = C19N.LJ("lemon8_photopost_music_edit_enable", true);
        Object value = C42201GhJ.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-INSTANCE>(...)");
        LIZIZ = ((Keva) value).getBoolean("key_replace_music_close", false);
    }

    public static final boolean LIZ(Aweme aweme) {
        if (!C78996UzQ.LJJIIZI(aweme) || !aweme.isPhotoMode() || !LIZ || C41066G9u.LIZ(aweme.getEditPostPermission()) != EnumC41101GBd.SHOW.getValue()) {
            return false;
        }
        if ((aweme.getMusic() != null && aweme.getMusic().getMid() != null) || LIZIZ) {
            return false;
        }
        return true;
    }
}
