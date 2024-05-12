package X;

import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.7qE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198227qE {
    public static final /* synthetic */ int LIZ = 0;

    public static File LIZ(String key) {
        o.LJIIIZ(key, "key");
        return new File(LIZIZ(key));
    }

    public static String LIZIZ(String key) {
        o.LJIIIZ(key, "key");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAnywhereChannelPath("tiktok_social_friends_interaction_res"));
        return JBR.LJFF(LIZ2, File.separator, key, LIZ2);
    }
}
