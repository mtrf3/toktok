package X;

import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import defpackage.i0;

/* renamed from: X.Hrb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45387Hrb extends AbstractC45383HrX {
    public C45387Hrb(AbstractC44957Hkf abstractC44957Hkf) {
        super(abstractC44957Hkf);
    }

    @Override // X.AbstractC45383HrX
    public final boolean LIZ(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return false;
        }
        LIZJ(str, str2, str3);
        return true;
    }

    public final void LIZJ(String str, String str2, String str3) {
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        X5R with = downloadServiceManager.getDownloadService().with(str);
        with.LIZJ = str2;
        with.LJI = C47261Igj.LJJIJ(new HttpHeader("downloader_scene", "video"));
        with.LJ = str3;
        with.LJII = downloadServiceManager.getRetryExpCount();
        with.LJIIJJI = this.LIZIZ;
        with.LJIIJ = "feed_video";
        this.LIZ = with.LJ(C45390Hre.LJLIL);
    }

    @Override // X.AbstractC45383HrX
    public final boolean LIZIZ(String str, String str2, String str3, String str4) {
        if (str == null || str2 == null || str3 == null || str4 == null) {
            return false;
        }
        boolean LJIIIIZZ = LocalVideoPlayerManager.LIZLLL().LJIIIIZZ(str, i0.LJFF(str4, str3), new C45392Hrg(this, str2, str3, str4));
        this.LIZJ = LJIIIIZZ;
        return LJIIIIZZ;
    }
}
