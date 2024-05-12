package X;

import Y.ACallableS5S2000000_7;
import Y.AgS110S0200000_7;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.play.core.assetpacks.r2;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.io.File;
import ujb.o;

/* renamed from: X.HsA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45422HsA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
        if (!C45771Hxn.LIZIZ) {
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onFailed(null);
            }
        } else {
            AVServiceImpl.LIZ().fetchResourcesNeededByRequirements(new String[]{"VideoMontage"}, new HJT(iFetchResourcesListener));
        }
    }

    public static void LIZLLL(AVMusic aVMusic, r2 r2Var) {
        String str;
        String LJ = C45771Hxn.LJ(aVMusic);
        if (aVMusic == null || aVMusic.getStickPointMusicAlg() == null) {
            str = "";
        } else {
            str = aVMusic.getStickPointMusicAlg().getDefaultLocalPath();
        }
        if (!C45771Hxn.LJI(aVMusic, LJ)) {
            r2Var.LIZ(aVMusic, false);
        } else if (TextUtils.isEmpty(str)) {
            r2Var.LIZ(aVMusic, false);
        } else {
            C10K.LIZJ(new ACallableS5S2000000_7(LJ, str, 0)).LJ(new AgS110S0200000_7(r2Var, aVMusic, 12), C10K.LJIIIIZZ, null);
        }
    }

    public static void LIZIZ(Context context, AVMusic aVMusic, InterfaceC45785Hy1 interfaceC45785Hy1) {
        AwemeHostApplication awemeHostApplication;
        C64626PXy LJIIJJI;
        C45777Hxt c45777Hxt = new C45777Hxt(interfaceC45785Hy1, context);
        if (context == null || aVMusic == null || TextUtils.isEmpty(aVMusic.getPath())) {
            c45777Hxt.LIZIZ(aVMusic, false);
            return;
        }
        String LJ = C45771Hxn.LJ(aVMusic);
        try {
            ((C45039Hlz) AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService()).getClass();
            awemeHostApplication = FKM.LIZ();
        } catch (Exception unused) {
            H78.LJI("ServiceManager fail, no context and local music load fail");
            awemeHostApplication = null;
        }
        if (C170626mo.LIZJ(awemeHostApplication, LJ)) {
            c45777Hxt.LIZIZ(aVMusic, true);
            return;
        }
        String path = aVMusic.getPath();
        if (path == null) {
            path = "";
        }
        if (aVMusic.isNeedSetCookie() && !o.LJJJLIIL(path, "http://", false) && (LJIIJJI = C64626PXy.LJIIJJI(path)) != null && LJIIJJI.LJIILL("ss_is_p_v_ss") == null) {
            C64627PXz LJIIJ = LJIIJJI.LJIIJ();
            LJIIJ.LJIIIIZZ("ss_is_p_v_ss", "1");
            path = LJIIJ.toString();
            kotlin.jvm.internal.o.LJIIIIZZ(path, "urlBuilder.toString()");
        }
        C60903NvH.LJIIJJI().LJJIJ().LJIJJLI();
        LIZ(awemeHostApplication, path, LJ, new C45423HsB(LJ, c45777Hxt, aVMusic));
    }

    public static void LIZ(Context context, String str, String str2, C45424HsC c45424HsC) {
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            c45424HsC.onFailed(new DownloadInfo((Cursor) null), new BaseException());
            return;
        }
        if (C39579Fg7.LIZIZ(str2)) {
            c45424HsC.onSuccessed(new DownloadInfo((Cursor) null));
            return;
        }
        File file = new File(str2);
        DownloadTask with = C84261X5d.with(context);
        with.url(str);
        with.ignoreDataVerify(true);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(file.getParent());
        LIZ2.append(File.separator);
        with.savePath(X1D.LIZIZ(LIZ2));
        with.name(file.getName());
        with.mainThreadListener(c45424HsC);
        with.download();
    }
}
