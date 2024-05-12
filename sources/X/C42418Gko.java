package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import defpackage.i0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gko, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42418Gko {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(List<String> urls, String str, String str2, AbstractC42414Gkk abstractC42414Gkk) {
        List<String> list;
        o.LJIIIZ(urls, "urls");
        if (urls.isEmpty()) {
            return;
        }
        if (urls.size() > 1) {
            list = urls.subList(1, urls.size());
        } else {
            list = C61878OQg.INSTANCE;
        }
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = -1;
        C42419Gkp c42419Gkp = new C42419Gkp(abstractC42414Gkk, c76732zl);
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        X5R with = downloadServiceManager.getDownloadService().with((String) ListProtector.get(urls, 0));
        with.LJIIIIZZ = list;
        with.LIZJ = str2;
        with.LJ = str;
        with.LJII = 3;
        with.LJIJJLI = 3;
        with.LJIIJ = "duet_react_video";
        with.LJJI = downloadServiceManager.isAutoRemoveListener();
        with.LJIIL = c42419Gkp;
        c76732zl.element = with.LIZJ();
    }

    public static final void LIZ(Aweme aweme, List urls, String str, String str2, C42416Gkm c42416Gkm) {
        String LJFF;
        String str3;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(urls, "urls");
        if (str != null && ujb.o.LJJJJ(str, "/", false)) {
            LJFF = i0.LJFF(str, str2);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LJFF = JBR.LJFF(LIZ2, File.separator, str2, LIZ2);
        }
        if (!LocalVideoPlayerManager.LIZLLL().LJIIIIZZ(aweme.getAid(), LJFF, new C42420Gkq(c42416Gkm, LJFF, urls, str, str2))) {
            if (C42431Gl1.LIZ() && (C107244Iu.LIZ(c42416Gkm.LIZ, "duet") || C107244Iu.LIZ(c42416Gkm.LIZ, "duet_page"))) {
                H7B.LIZ("DuetVideoDownloader - try use video cache");
                if (urls.isEmpty()) {
                    str3 = "";
                } else {
                    str3 = (String) ListProtector.get(urls, 0);
                }
                C34K c34k = new C34K();
                C22690un.LIZ("duet");
                C46728IVo.LJI(C46728IVo.LIZLLL(aweme), LJFF, true, new C42417Gkn(c34k, LJFF, c42416Gkm, str3, urls, str, str2));
                return;
            }
            H7B.LIZ("DuetVideoDownloader - video cache not used");
            C22690un.LIZ("duet");
            LIZIZ(urls, str, str2, c42416Gkm);
        }
    }
}
