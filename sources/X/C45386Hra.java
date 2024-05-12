package X;

import android.content.Context;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import defpackage.i0;
import java.util.Collections;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Hra, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45386Hra {
    public static final java.util.Map<String, Integer> LIZLLL = Collections.synchronizedMap(new HashMap());
    public static int LJ = -1;
    public int LIZ = -1;
    public boolean LIZIZ;
    public AbsDownloadListener LIZJ;

    public final void LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        if (!this.LIZIZ) {
            DownloadServiceManager.INSTANCE.getDownloadService().getPageLifeMonitor(this.LIZ).getClass();
        }
    }

    public final void LIZIZ(Context context, String url, String name, String savePath) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(savePath, "savePath");
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        X5R with = downloadServiceManager.getDownloadService().with(url);
        with.LIZJ = name;
        with.LJI = C47261Igj.LJJIJ(new HttpHeader("downloader_scene", "video"));
        with.LJ = savePath;
        with.LJII = downloadServiceManager.getRetryExpCount();
        with.LJIIJJI = this.LIZJ;
        with.LJIIJ = "feed_video";
        int LJ2 = with.LJ(C45388Hrc.LJLIL);
        this.LIZ = LJ2;
        LJ = LJ2;
    }

    public final boolean LIZ(String str, String str2, String name, String savePath, Context context) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(savePath, "savePath");
        boolean LJIIIIZZ = LocalVideoPlayerManager.LIZLLL().LJIIIIZZ(str, i0.LJFF(savePath, name), new C45393Hrh(this, context, str2, name, savePath));
        this.LIZIZ = LJIIIIZZ;
        if (!LJIIIIZZ) {
            LIZIZ(context, str2, name, savePath);
        }
        return this.LIZIZ;
    }
}
