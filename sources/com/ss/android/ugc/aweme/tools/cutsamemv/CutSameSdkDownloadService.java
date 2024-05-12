package com.ss.android.ugc.aweme.tools.cutsamemv;

import X.C06830Op;
import X.C173376rF;
import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import X.FL6;
import X.FUH;
import X.H7B;
import X.JBR;
import X.X1D;
import X.X5R;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.cut_downloader.AbsDownloadService;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class CutSameSdkDownloadService extends AbsDownloadService {
    public final Map<String, Integer> LJLJJI = new LinkedHashMap();

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // com.ss.android.ugc.cut_downloader.AbsDownloadService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // com.ss.android.ugc.cut_downloader.AbsDownloadService
    public final void LIZ(String str, String str2, FL6 fl6) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getCacheDir().getAbsolutePath());
        LIZ.append("/cutsamezip");
        String LIZIZ = X1D.LIZIZ(LIZ);
        new File(LIZIZ).mkdirs();
        StringBuilder LIZ2 = X1D.LIZ();
        String LJI = C173376rF.LJI(str);
        if (LJI == null) {
            LJI = String.valueOf(System.currentTimeMillis());
        }
        String LJFF = JBR.LJFF(LIZ2, LJI, ".zip", LIZ2);
        X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        with.LJ = LIZIZ;
        with.LIZJ = LJFF;
        with.LJIIIZ = str2;
        with.LJII = 3;
        with.LJIIJ = "cutsame_template";
        with.LJIIL = new FUH(this, fl6);
        with.LJJI = true;
        with.LJIL = true;
        int LIZJ = with.LIZJ();
        StringBuilder LIZ3 = C06830Op.LIZ("CutSameSdkDownload, start : downloadId=", LIZJ, ", url=", str, ", path=");
        LIZ3.append(LIZIZ);
        LIZ3.append('/');
        LIZ3.append(LJFF);
        H7B.LJ(X1D.LIZIZ(LIZ3));
        this.LJLJJI.put(str, Integer.valueOf(LIZJ));
    }
}
