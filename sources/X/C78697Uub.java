package X;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.christmas.FestivalEntity;
import com.ss.android.ugc.aweme.christmas.ResEntity;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Uub, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78697Uub extends V8F {
    public static final String LJLJJL;
    public static volatile C78697Uub LJLJJLL;
    public String LJLILLLLZI;
    public String LJLJI;
    public InterfaceC54215LPn LJLJJI;

    public C78697Uub() {
        super(1);
        if (!R3A.LJII()) {
            LJ(LJLJJL);
            return;
        }
        C37246Eja c37246Eja = C37247Ejb.LIZIZ;
        String str = LJLJJL;
        c37246Eja.getClass();
        C37246Eja.LIZIZ(str);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
    }

    public static C78697Uub LJI() {
        if (LJLJJLL == null) {
            synchronized (C78697Uub.class) {
                if (LJLJJLL == null) {
                    LJLJJLL = new C78697Uub();
                }
            }
        }
        return LJLJJLL;
    }

    static {
        File LLIIJI;
        StringBuilder LIZ = X1D.LIZ();
        Context context = C39579Fg7.LJLIL;
        if (Environment.isExternalStorageEmulated()) {
            LLIIJI = C16880lQ.LLIIJLIL(context);
        } else {
            LLIIJI = C16880lQ.LLIIJI(context, null);
            if (LLIIJI != null) {
                C39579Fg7.LJFF(LLIIJI);
            } else {
                LLIIJI = C16880lQ.LLIIJLIL(context);
            }
        }
        LIZ.append(LLIIJI.getPath());
        LJLJJL = JBR.LJFF(LIZ, File.separator, "festival", LIZ);
    }

    public static final String LJFF() {
        ResEntity resEntity;
        UrlModel urlModel;
        FestivalEntity LJI = R3A.LJI();
        if (LJI == null || (resEntity = LJI.resEntity) == null || (urlModel = resEntity.resourceUrl) == null || C79004UzY.LJJIFFI(urlModel.getUrlList())) {
            return null;
        }
        return (String) ListProtector.get(urlModel.getUrlList(), 0);
    }

    public static void LJ(String filePath) {
        try {
            C37247Ejb.LIZIZ.getClass();
            o.LJIIIZ(filePath, "filePath");
            C36871EdX.LJ(filePath);
        } catch (NoSuchMethodError e) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("NoSuchMethodError in FestivalResDownloader-deleteFiles, path is ", filePath, ", error is ");
            LIZIZ.append(e.getMessage());
            C36922EeM.LJ(X1D.LIZIZ(LIZIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        String targetFilePath = downloadInfo.getTargetFilePath();
        if (TextUtils.isEmpty(targetFilePath)) {
            return;
        }
        File file = new File(targetFilePath);
        if (R3A.LJI() == null || R3A.LJI().resEntity == null) {
            return;
        }
        String str = R3A.LJI().resEntity.md5;
        if (!file.exists() || !TextUtils.equals(C38352F3k.LIZIZ(file), str)) {
            LJ(file.getPath());
            return;
        }
        File file2 = new File(this.LJLJI);
        if (file2.exists() && file2.listFiles().length > 0) {
            LJ(file2.getPath());
        }
        C37246Eja c37246Eja = C37247Ejb.LIZIZ;
        String str2 = this.LJLJI;
        c37246Eja.getClass();
        File LIZIZ = C37246Eja.LIZIZ(str2);
        try {
            C38978FRm.LIZLLL(new File(targetFilePath), LIZIZ);
            this.LJLILLLLZI = LIZIZ.getPath();
            if (this.LJLJJI != null) {
                C10K.LIZIZ(new CallableC78699Uud(1, this), C10K.LJIIIIZZ, null);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
