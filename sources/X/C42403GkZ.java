package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.depend.IDDListenerS58S0100000_7;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GkZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42403GkZ {
    public static IDownloadService LIZ;
    public static Integer LIZIZ = -1;

    public static final void LIZ(List<String> urls, String str, String str2, AbstractC42411Gkh abstractC42411Gkh) {
        List<String> list;
        o.LJIIIZ(urls, "urls");
        Integer num = null;
        if (urls.isEmpty()) {
            if (abstractC42411Gkh != null) {
                abstractC42411Gkh.LIZIZ(null, null, null);
                return;
            }
            return;
        }
        if (urls.size() > 1) {
            list = urls.subList(1, urls.size());
        } else {
            list = C61878OQg.INSTANCE;
        }
        IDDListenerS58S0100000_7 iDDListenerS58S0100000_7 = new IDDListenerS58S0100000_7(abstractC42411Gkh, 6);
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        IDownloadService downloadService = downloadServiceManager.getDownloadService();
        LIZ = downloadService;
        if (downloadService != null) {
            X5R with = downloadService.with((String) ListProtector.get(urls, 0));
            with.LJIIIIZZ = list;
            with.LIZJ = str2;
            with.LJ = str;
            with.LJII = 3;
            with.LJIJJLI = 3;
            with.LJIIJ = "duet_react_video";
            with.LJJI = downloadServiceManager.isAutoRemoveListener();
            with.LJIIL = iDDListenerS58S0100000_7;
            num = Integer.valueOf(with.LIZJ());
        }
        LIZIZ = num;
    }
}
