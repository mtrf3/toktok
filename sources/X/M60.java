package X;

import com.ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M60 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String url, String str) {
        o.LJIIIZ(url, "url");
        String LJFF = SecLinkServiceImpl.LIZ().LJFF(url, str);
        if (LJFF == null) {
            return url;
        }
        return LJFF;
    }
}
