package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Iwd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48247Iwd {
    public static boolean LIZIZ;
    public static Aweme LIZLLL;
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("click_push_recommend", "click_push_newvideo", "click_push_commentvideo", "click_push_commentvideo_reply", "click_push_videoat", "click_push_comment", "click_push_duet");
    public static final CopyOnWriteArrayList<String> LIZJ = new CopyOnWriteArrayList<>();
    public static final Object LJ = new Object();

    public static String LIZIZ() {
        String absolutePath = C16880lQ.LLIIIL(EF7.LIZIZ()).getAbsolutePath();
        if (absolutePath == null) {
            return null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(absolutePath);
        return JBR.LJFF(LIZ2, File.separator, "pushCache", LIZ2);
    }

    public static File LIZ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZIZ());
        File file = new File(JBR.LJFF(LIZ2, File.separator, str, LIZ2));
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static Aweme LIZJ(String str) {
        C65385PlN c65385PlN;
        ?? r6;
        Aweme aweme;
        File LIZ2 = LIZ(str);
        C65385PlN c65385PlN2 = null;
        r6 = null;
        C65385PlN c65385PlN3 = null;
        C65385PlN c65385PlN4 = null;
        if (LIZ2 == null) {
            return null;
        }
        try {
            if (System.currentTimeMillis() - LIZ2.lastModified() <= 172800000) {
                c65385PlN = new C65385PlN(new FileReader(LIZ2));
                try {
                    aweme = (Aweme) GsonHolder.LIZLLL().LIZ().LJIIIIZZ(c65385PlN, Aweme.class);
                    c65385PlN4 = c65385PlN;
                    c65385PlN3 = c65385PlN4;
                } catch (Exception unused) {
                    C37247Ejb.LIZ.getClass();
                    C36871EdX.LIZ(c65385PlN);
                    r6 = c65385PlN4;
                    LIZJ.remove(str);
                    C16880lQ.LLLZZIL(LIZ2);
                    return r6;
                } catch (Throwable th) {
                    th = th;
                    c65385PlN2 = c65385PlN;
                    C37247Ejb.LIZ.getClass();
                    C36871EdX.LIZ(c65385PlN2);
                    throw th;
                }
            } else {
                aweme = null;
            }
            C37247Ejb.LIZ.getClass();
            C36871EdX.LIZ(c65385PlN3);
            r6 = aweme;
        } catch (Exception unused2) {
            c65385PlN = null;
        } catch (Throwable th2) {
            th = th2;
        }
        LIZJ.remove(str);
        try {
            C16880lQ.LLLZZIL(LIZ2);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return r6;
    }

    public static final boolean LIZLLL(String openUrl) {
        o.LJIIIZ(openUrl, "openUrl");
        try {
            android.net.Uri parse = UriProtector.parse(openUrl);
            if (o.LJ(parse.getHost(), "aweme")) {
                if (!ORZ.LJLJJI(UriProtector.getQueryParameter(parse, "gd_label"), LIZ)) {
                    if (!s.LJJJLZIJ(openUrl, "aweme/push_detail", false)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return false;
    }
}
