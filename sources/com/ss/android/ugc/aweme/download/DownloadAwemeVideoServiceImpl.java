package com.ss.android.ugc.aweme.download;

import X.AbstractC42411Gkh;
import X.C22690un;
import X.C38352F3k;
import X.C41823GbD;
import X.C42405Gkb;
import X.C42406Gkc;
import X.C42412Gki;
import X.C42427Gkx;
import X.C61878OQg;
import X.X5R;
import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.tools.IDownloadAwemeVideoService;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class DownloadAwemeVideoServiceImpl implements IDownloadAwemeVideoService {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.tools.IDownloadAwemeVideoService
    public final void LIZ(Context context, Aweme aweme, String filePathDir, C42427Gkx c42427Gkx) {
        List<String> urlList;
        String str;
        List<String> urlList2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(filePathDir, "filePathDir");
        VideoUrlModel playAddrH264 = aweme.getVideo().getPlayAddrH264();
        if (playAddrH264 == null || (urlList = playAddrH264.getUrlList()) == null || urlList.isEmpty()) {
            c42427Gkx.LIZ(-100, "video url list is null or empty", null);
            return;
        }
        String LJFF = i0.LJFF(C38352F3k.LIZJ(aweme.getVideo().getPlayAddrH264().getBitRatedRatioUri()), ".mp4");
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (!ujb.o.LJJJJ(filePathDir, separator, false)) {
            str = i0.LJFF(filePathDir, separator);
        } else {
            str = filePathDir;
        }
        String LJFF2 = i0.LJFF(str, LJFF);
        String substring = LJFF2.substring(s.LJJLIIJ(LJFF2, separator, 6) + 1);
        o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
        VideoUrlModel playAddrH2642 = aweme.getVideo().getPlayAddrH264();
        if (playAddrH2642 != null && (urlList2 = playAddrH2642.getUrlList()) != null && !urlList2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = playAddrH2642.getUrlList().iterator();
            while (it.hasNext()) {
                String LIZ2 = C41823GbD.LIZ(aweme, it.next());
                if (LIZ2 != null) {
                    arrayList.add(LIZ2);
                }
            }
            if (!arrayList.isEmpty()) {
                C42412Gki c42412Gki = new C42412Gki(c42427Gkx, arrayList);
                if (!LocalVideoPlayerManager.LIZLLL().LJIIIIZZ(aweme.getAid(), LJFF2, new C42406Gkc(c42412Gki, this, arrayList, LJFF2, substring))) {
                    C22690un.LIZ("duet");
                    LIZIZ(c42412Gki, s.LJJZZIII("/", filePathDir), substring, "video_2_sticker", arrayList);
                    return;
                }
                return;
            }
        }
        c42427Gkx.LIZ(-1, "aweme url is empty", new IllegalArgumentException("aweme urls is empty"));
    }

    public final void LIZIZ(AbstractC42411Gkh abstractC42411Gkh, String str, String str2, String str3, List list) {
        List<String> list2;
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            list2 = list.subList(1, list.size());
        } else {
            list2 = C61878OQg.INSTANCE;
        }
        C42405Gkb c42405Gkb = new C42405Gkb(abstractC42411Gkh, this);
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        X5R with = downloadServiceManager.getDownloadService().with((String) ListProtector.get(list, 0));
        with.LJIIIIZZ = list2;
        with.LIZJ = str2;
        with.LJ = str;
        with.LJII = 3;
        with.LJIJJLI = 3;
        with.LJIIJ = str3;
        with.LJJI = downloadServiceManager.isAutoRemoveListener();
        with.LJIIL = c42405Gkb;
        with.LIZJ();
    }
}
