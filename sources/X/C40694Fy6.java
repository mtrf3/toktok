package X;

import com.bytedance.lynx.hybrid.service.IResourceService;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import ujb.o;
import ujb.s;

/* renamed from: X.Fy6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40694Fy6 {
    public static C60880Nuu LIZ;

    public static String LIZ(IResourceService iResourceService, C40695Fy7 c40695Fy7, String str, String str2, String str3, O1M o1m) {
        String str4;
        List<String> list = c40695Fy7.LIZ;
        if (list == null) {
            return null;
        }
        Iterator<String> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                str4 = it.next();
                if (o.LJJJLIIL(str, str4, false)) {
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
        kotlin.jvm.internal.o.LJFF(substring, "(this as java.lang.String).substring(startIndex)");
        String LJLLLL = s.LJLLLL(substring, '?');
        if (LJLLLL == null) {
            return null;
        }
        if (str3 != null && str3.length() != 0) {
            LJLLLL = s.LJLIIL(LJLLLL, str3);
        }
        if (iResourceService == null) {
            return null;
        }
        String uri = C78949Uyf.LJJIJ(str2).toString();
        kotlin.jvm.internal.o.LJFF(uri, "makeRelativeUri(resGroup).toString()");
        O26 loadSync = iResourceService.loadSync(uri, o1m);
        if (loadSync == null) {
            return null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(loadSync.LJII);
        File file = new File(JBR.LJFF(LIZ2, File.separator, LJLLLL, LIZ2));
        if (!file.exists()) {
            return null;
        }
        return file.getAbsolutePath();
    }
}
