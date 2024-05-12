package X;

import android.os.RemoteException;
import com.ss.android.ugc.cut_downloader.AbsDownloadService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FL6 {
    public final String LIZ;
    public String LIZIZ;
    public final java.util.Set<Integer> LIZJ;
    public final /* synthetic */ AbsDownloadService LIZLLL;

    public FL6(AbsDownloadService absDownloadService, String downloadUrl) {
        o.LJIIIZ(downloadUrl, "downloadUrl");
        this.LIZLLL = absDownloadService;
        this.LIZ = downloadUrl;
        this.LIZJ = new LinkedHashSet();
    }

    public final void LIZ(String url, String str) {
        o.LJIIIZ(url, "url");
        if (!o.LJ(url, this.LIZ)) {
            return;
        }
        java.util.Set<Integer> set = this.LIZJ;
        AbsDownloadService absDownloadService = this.LIZLLL;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            List list = (List) ((LinkedHashMap) absDownloadService.LJLILLLLZI).get(Integer.valueOf(intValue));
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        ((FL7) it2.next()).LJFF(url, str);
                    } catch (RemoteException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
        this.LIZJ.clear();
        this.LIZIZ = str;
    }
}
