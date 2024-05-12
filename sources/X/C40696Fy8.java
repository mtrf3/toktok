package X;

import android.net.Uri;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Fy8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40696Fy8 {
    public static C60880Nuu LIZ;

    public static String LIZ(String str) {
        Uri.Builder path = new Uri.Builder().scheme("local_file").authority("relative").path(str);
        o.LJFF(path, "Uri.Builder()\n        .s…ty(\"relative\").path(path)");
        String uri = path.build().toString();
        o.LJFF(uri, "Uri.Builder()\n        .s…ild()\n        .toString()");
        return uri;
    }

    public static String LIZIZ(IResourceLoaderService iResourceLoaderService, C40697Fy9 c40697Fy9, String str, String str2, String str3, O1L o1l) {
        String str4;
        List<String> list = c40697Fy9.LIZ;
        if (list == null) {
            return null;
        }
        Iterator<String> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                str4 = it.next();
                if (ujb.o.LJJJLIIL(str, str4, false)) {
                    break;
                }
            } else {
                str4 = null;
                break;
            }
        }
        String str5 = str4;
        if (str5 == null) {
            return null;
        }
        String substring = str.substring(str5.length());
        o.LJFF(substring, "(this as java.lang.String).substring(startIndex)");
        String LJLLLL = s.LJLLLL(substring, '?');
        if (LJLLLL == null) {
            return null;
        }
        if (str3 != null && str3.length() != 0) {
            LJLLLL = s.LJLIIL(LJLLLL, str3);
        }
        if (iResourceLoaderService == null) {
            return null;
        }
        String LIZ2 = LIZ(str2);
        o1l.LJIIJJI = "sub_source";
        O1I loadSync = iResourceLoaderService.loadSync(LIZ2, o1l);
        if (loadSync == null) {
            return null;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(loadSync.LJI);
        File file = new File(JBR.LJFF(LIZ3, File.separator, LJLLLL, LIZ3));
        if (!file.exists()) {
            return null;
        }
        return file.getAbsolutePath();
    }
}
