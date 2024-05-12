package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.christmas.ActivityStruct;
import com.ss.android.ugc.aweme.christmas.FestivalEntity;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import defpackage.b1;
import defpackage.i0;
import java.io.File;

/* renamed from: X.Hrn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45399Hrn extends AbsDownloadListener {
    public static volatile C45399Hrn LJLJI;
    public static final String LJLJJI;
    public String LJLIL = "";
    public boolean LJLILLLLZI;

    public static final String LJ() {
        ActivityStruct.WatermarkStruct watermarkStruct;
        UrlModel urlModel;
        FestivalEntity festivalEntity = C45400Hro.LIZ.LIZ;
        if (festivalEntity == null || (watermarkStruct = festivalEntity.waterMark) == null || (urlModel = watermarkStruct.waterResource) == null || C32151Nz.LJJIIJZLJL(urlModel.getUrlList())) {
            return null;
        }
        return (String) ListProtector.get(urlModel.getUrlList(), 0);
    }

    public static C45399Hrn LJFF() {
        if (LJLJI == null) {
            synchronized (C45399Hrn.class) {
                if (LJLJI == null) {
                    LJLJI = new C45399Hrn();
                }
            }
        }
        return LJLJI;
    }

    static {
        StringBuilder LIZJ = b1.LIZJ(AVExternalServiceImpl.LIZ().configService().cacheConfig().shareDir(), "water");
        LIZJ.append(File.separator);
        LJLJJI = X1D.LIZIZ(LIZJ);
    }

    public final void LJII() {
        if (!C78688UuS.LJJIJIIJIL()) {
            C37246Eja c37246Eja = C37247Ejb.LIZIZ;
            String str = LJLJJI;
            c37246Eja.getClass();
            C37246Eja.LIZLLL(str);
            return;
        }
        String LJ = LJ();
        if (!TextUtils.isEmpty(LJ)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJLJJI);
            LIZ.append(LJI(LJ, false));
            File file = new File(X1D.LIZIZ(LIZ));
            if (file.exists() && file.isDirectory() && file.listFiles().length > 0) {
                this.LJLIL = file.getPath();
                return;
            }
        }
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = true;
        this.LJLIL = "";
        C37246Eja c37246Eja2 = C37247Ejb.LIZIZ;
        String str2 = LJLJJI;
        c37246Eja2.getClass();
        C37246Eja.LIZLLL(str2);
        C37246Eja.LIZIZ(str2);
        String LJ2 = LJ();
        if (TextUtils.isEmpty(LJ2)) {
            return;
        }
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        X5R with = downloadServiceManager.getDownloadService().with(LJ2);
        with.LIZJ = LJI(LJ2, true);
        with.LJ = str2;
        with.LJII = downloadServiceManager.getRetryExpCount();
        with.LJIIL = this;
        with.LIZJ();
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        String url = downloadInfo.getUrl();
        StringBuilder LIZ = X1D.LIZ();
        String str = LJLJJI;
        LIZ.append(str);
        LIZ.append(LJI(url, true));
        File file = new File(X1D.LIZIZ(LIZ));
        FestivalEntity festivalEntity = C45400Hro.LIZ.LIZ;
        ActivityStruct.WatermarkStruct watermarkStruct = null;
        if (festivalEntity != null && festivalEntity.waterMark != null) {
            if (festivalEntity != null) {
                watermarkStruct = festivalEntity.waterMark;
            }
            String str2 = watermarkStruct.md5;
            if (file.exists() && TextUtils.equals(C38352F3k.LIZIZ(file), str2)) {
                String url2 = downloadInfo.getUrl();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append(LJI(url2, false));
                String LIZIZ = X1D.LIZIZ(LIZ2);
                C37247Ejb.LIZIZ.getClass();
                C37246Eja.LIZIZ(LIZIZ);
                File file2 = new File(LIZIZ);
                if (file2.exists() && file2.isDirectory() && file2.listFiles().length > 0) {
                    this.LJLIL = file2.getPath();
                    return;
                }
                try {
                    C38978FRm.LIZLLL(file, file2);
                    if (file.exists()) {
                        C16880lQ.LLLZZIL(file);
                    }
                    this.LJLIL = file2.getPath();
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
        }
        C37247Ejb.LIZIZ.getClass();
        C37246Eja.LIZLLL(str);
    }

    public static String LJI(String str, boolean z) {
        String LIZJ = C38352F3k.LIZJ(str);
        if (z) {
            return i0.LJFF(LIZJ, ".zip");
        }
        return LIZJ;
    }
}
