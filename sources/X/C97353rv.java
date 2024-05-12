package X;

import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.3rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97353rv {
    public boolean LIZ;

    public static String LIZIZ() {
        return SearchServiceImpl.LLLZI().LLLLIL().getBotId();
    }

    public static String LIZJ() {
        String botName = SearchServiceImpl.LLLZI().LLLLIL().getBotName();
        if (botName == null) {
            return "";
        }
        return botName;
    }

    public final boolean LIZ() {
        if (!this.LIZ) {
            this.LIZ = true;
            String LIZJ = O3U.LIZJ(C38943FQd.LIZ(), "tiktok_bot_avatar_resource");
            if (C1GE.LJIIL(LIZJ)) {
                ISearchService LLLZI = SearchServiceImpl.LLLZI();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LIZJ);
                LIZ.append(File.separator);
                LLLZI.LLLIL(X1D.LIZIZ(LIZ));
            }
        }
        C96963rI.LJII().getClass();
        String LJJJ = SearchServiceImpl.LLLZI().LJJJ(false);
        if (LJJJ == null) {
            LJJJ = "";
        }
        if (LJJJ.length() > 0) {
            return true;
        }
        return false;
    }

    public static String LIZLLL() {
        String LJIIIIZZ = C96413qP.LIZ.LJIIIIZZ(2, LIZIZ());
        if (LJIIIIZZ == null) {
            return "";
        }
        return LJIIIIZZ;
    }

    public static boolean LJ(String str) {
        if (C1GE.LJIIL(LIZIZ()) && o.LJ(str, LIZIZ())) {
            return true;
        }
        return false;
    }
}
