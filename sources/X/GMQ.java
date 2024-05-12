package X;

import com.bytedance.keva.Keva;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;

/* loaded from: classes8.dex */
public final class GMQ {
    public static X5R LIZ;
    public static InterfaceC88472Yns<? super Boolean, C76800UCe> LIZIZ;
    public static InterfaceC65784Pro<C76800UCe> LIZJ;
    public static InterfaceC88472Yns<? super DownloadInfo, C76800UCe> LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static InterfaceC88472Yns<? super String, C76800UCe> LJII;
    public static final Keva LJI = Keva.getRepo("repo_edit_post_local_video");
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(GMV.LJLIL);
    public static final GMT LJIIIZ = new GMT();
    public static final GMS LJIIJ = new GMS();

    public static void LIZ(String str, String str2, String str3) {
        X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        with.LIZJ = str3;
        with.LJFF = true;
        with.LJI = C47261Igj.LJJIJ(new HttpHeader("edit_post", "video"));
        with.LJ = str2;
        with.LJII = 3;
        with.LJIIJJI = LJIIJ;
        with.LJJI = true;
        with.LJIIJ = "edit_post";
        LIZ = with;
        if (!LJFF) {
            LJFF = true;
            with.LIZJ();
        }
    }
}
