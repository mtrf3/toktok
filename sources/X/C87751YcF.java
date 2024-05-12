package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.YcF, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87751YcF extends AbsDownloadListener {
    public final /* synthetic */ C87752YcG LJLIL;
    public final /* synthetic */ AbstractC45395Hrj LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onCanceled(entity);
        InterfaceC87755YcJ interfaceC87755YcJ = this.LJLIL.LJIIIIZZ().LJLJI;
        if (interfaceC87755YcJ != null) {
            interfaceC87755YcJ.LIZ();
        }
        C87752YcG c87752YcG = this.LJLIL;
        c87752YcG.LJIILIIL.LJI();
        c87752YcG.LJ().LJLJJI = false;
        C87752YcG c87752YcG2 = this.LJLIL;
        String targetFilePath = entity.getTargetFilePath();
        o.LJIIIIZZ(targetFilePath, "entity.targetFilePath");
        c87752YcG2.LIZ(targetFilePath);
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onProgress(entity);
        int curBytes = (int) ((((float) entity.getCurBytes()) / ((float) entity.getTotalBytes())) * 100);
        YXQ yxq = this.LJLIL.LIZLLL;
        if (yxq != null) {
            int LIZ = yxq.LIZ(YXO.DOWNLOAD_TYPE, curBytes);
            InterfaceC87755YcJ interfaceC87755YcJ = this.LJLIL.LJIIIIZZ().LJLJI;
            if (interfaceC87755YcJ != null) {
                interfaceC87755YcJ.LIZIZ();
            }
            InterfaceC87766YcU interfaceC87766YcU = this.LJLILLLLZI.LJ;
            if (interfaceC87766YcU != null) {
                interfaceC87766YcU.LIZIZ();
            }
            this.LJLIL.LJI().updateProgress(LIZ);
            this.LJLIL.getClass();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("progress: ");
            LIZ2.append(LIZ);
            C62737Ojl.LIZJ("DownloadAbility", X1D.LIZIZ(LIZ2));
            return;
        }
        o.LJIJI("loadingProgressWrapper");
        throw null;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onStart(entity);
        C87752YcG c87752YcG = this.LJLIL;
        DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol = c87752YcG.LJFF;
        if (downloadMobProtocol != null) {
            downloadMobProtocol.LJIIJ(c87752YcG.LJIIJ);
        }
        InterfaceC87755YcJ interfaceC87755YcJ = this.LJLIL.LJIIIIZZ().LJLJI;
        if (interfaceC87755YcJ != null) {
            interfaceC87755YcJ.LJ();
        }
        this.LJLIL.LJ().LJLJJI = true;
        this.LJLIL.LJIIIIZZ = System.currentTimeMillis();
        this.LJLIL.getClass();
        C62737Ojl.LIZJ("DownloadAbility", "start");
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onSuccessed(entity);
        InterfaceC87755YcJ interfaceC87755YcJ = this.LJLIL.LJIIIIZZ().LJLJI;
        if (interfaceC87755YcJ != null) {
            interfaceC87755YcJ.LJII();
        }
        C87752YcG c87752YcG = this.LJLIL;
        c87752YcG.LJIILIIL.LJI();
        c87752YcG.LJ().LJLJJI = false;
        String filePath = entity.getTargetFilePath();
        if (!TextUtils.isEmpty(filePath)) {
            File file = new File(filePath);
            C87752YcG c87752YcG2 = this.LJLIL;
            if (c87752YcG2.LJIIIIZZ != 0) {
                YXU LJ = c87752YcG2.LJ();
                long currentTimeMillis = System.currentTimeMillis();
                C87752YcG c87752YcG3 = this.LJLIL;
                LJ.LJLL = currentTimeMillis - c87752YcG3.LJIIIIZZ;
                c87752YcG3.LJ().LJLLI = file.length() / this.LJLIL.LJ().LJLL;
            }
            if (file.length() < LiveNetAdaptiveHurryTimeSetting.DEFAULT) {
                P8N.LIZIZ(filePath);
                if (ujb.o.LJJJLIIL(this.LJLIL.LJIIJ, "http://", false)) {
                    this.LJLIL.LJIILIIL.LJII(this);
                    C87752YcG c87752YcG4 = this.LJLIL;
                    String LJJJJZ = ujb.o.LJJJJZ(c87752YcG4.LJIIJ, "http://", "https://", false);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(this.LJLILLLLZI.LIZ);
                    LIZ.append("_download");
                    LIZ.append(this.LJLILLLLZI.LIZJ);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    String LIZIZ2 = this.LJLILLLLZI.LIZIZ();
                    c87752YcG4.LJIIJ = LJJJJZ;
                    c87752YcG4.LJIILIIL.LIZJ(LJJJJZ, LIZIZ, LIZIZ2);
                    return;
                }
                onFailed(null, new BaseException(-1, "Download hijacked"));
                return;
            }
            YXQ yxq = this.LJLIL.LIZLLL;
            if (yxq != null) {
                int LIZ2 = yxq.LIZ(YXO.DOWNLOAD_TYPE, 100);
                InterfaceC87755YcJ interfaceC87755YcJ2 = this.LJLIL.LJIIIIZZ().LJLJI;
                if (interfaceC87755YcJ2 != null) {
                    interfaceC87755YcJ2.LIZIZ();
                }
                InterfaceC87766YcU interfaceC87766YcU = this.LJLILLLLZI.LJ;
                if (interfaceC87766YcU != null) {
                    interfaceC87766YcU.LIZIZ();
                }
                this.LJLIL.LJI().updateProgress(LIZ2);
                C87752YcG c87752YcG5 = this.LJLIL;
                o.LJIIIIZZ(filePath, "filePath");
                c87752YcG5.LIZJ(filePath, this.LJLIL.LJIIJ);
                return;
            }
            o.LJIJI("loadingProgressWrapper");
            throw null;
        }
        onFailed(null, new BaseException(-1, "file path is null"));
    }

    public C87751YcF(C87752YcG c87752YcG, AbstractC44957Hkf abstractC44957Hkf) {
        this.LJLIL = c87752YcG;
        this.LJLILLLLZI = abstractC44957Hkf;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        int i;
        String str;
        String errorMessage;
        String LIZIZ;
        File parentFile;
        super.onFailed(downloadInfo, baseException);
        InterfaceC87755YcJ interfaceC87755YcJ = this.LJLIL.LJIIIIZZ().LJLJI;
        if (interfaceC87755YcJ != null) {
            interfaceC87755YcJ.onFailed();
        }
        C87752YcG c87752YcG = this.LJLIL;
        c87752YcG.LJIILIIL.LJI();
        c87752YcG.LJ().LJLJJI = false;
        int i2 = -1;
        String str2 = "exception is null";
        String str3 = "";
        if (this.LJLIL.LJIIIZ < r0.LJIIIIZZ().LJLIL.size() - 1) {
            C87752YcG c87752YcG2 = this.LJLIL;
            int i3 = c87752YcG2.LJIIIZ;
            if (baseException != null) {
                i2 = baseException.getErrorCode();
                String errorMessage2 = baseException.getErrorMessage();
                if (errorMessage2 != null) {
                    str2 = errorMessage2;
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("retry!!! [count: ");
            LIZ.append(i3);
            LIZ.append(']');
            C62737Ojl.LIZIZ("DownloadAbility", X1D.LIZIZ(LIZ));
            DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol = c87752YcG2.LJFF;
            if (downloadMobProtocol != null) {
                downloadMobProtocol.LJIIIIZZ(i2, str2);
            }
            C87752YcG c87752YcG3 = this.LJLIL;
            c87752YcG3.LJIIIZ++;
            c87752YcG3.LJIILIIL.LJII(this);
            C87752YcG c87752YcG4 = this.LJLIL;
            String str4 = (String) ListProtector.get(c87752YcG4.LJIIIIZZ().LJLIL, this.LJLIL.LJIIIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJLILLLLZI.LIZ);
            LIZ2.append("_download");
            LIZ2.append(this.LJLILLLLZI.LIZJ);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            if (baseException != null && baseException.getErrorCode() == 1036) {
                Context context = this.LJLILLLLZI.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                if (context != null) {
                    File LLIIIL = C16880lQ.LLIIIL(context);
                    String str5 = null;
                    if (LLIIIL != null && (parentFile = LLIIIL.getParentFile()) != null) {
                        str5 = parentFile.getPath();
                    } else if (C16880lQ.LLIIJI(context, null) == null) {
                        File LLLLLLLLLL = C16880lQ.LLLLLLLLLL();
                        o.LJIIIIZZ(LLLLLLLLLL, "Environment.getExternalStorageDirectory()");
                        str5 = LLLLLLLLLL.getPath();
                    } else {
                        File LLIIJI = C16880lQ.LLIIJI(context, null);
                        if (LLIIJI != null) {
                            str5 = LLIIJI.getPath();
                        }
                    }
                    str3 = o.LJIILLIIL("/share/", str5);
                }
                LIZIZ = C025908h.LIZIZ(LIZ3, str3, "tmp", "/", LIZ3);
            } else {
                LIZIZ = this.LJLILLLLZI.LIZIZ();
            }
            c87752YcG4.LJIIJ = str4;
            c87752YcG4.LJIILIIL.LIZJ(str4, LIZIZ2, LIZIZ);
            return;
        }
        YXU LJ = this.LJLIL.LJ();
        if (baseException != null && (errorMessage = baseException.getErrorMessage()) != null) {
            str3 = errorMessage;
        }
        LJ.getClass();
        LJ.LJLJJLL = str3;
        YXU LJ2 = this.LJLIL.LJ();
        if (baseException != null) {
            i = baseException.getErrorCode();
        } else {
            i = -1;
        }
        LJ2.LJLJL = i;
        C87752YcG c87752YcG5 = this.LJLIL;
        if (downloadInfo == null || (str = downloadInfo.getTargetFilePath()) == null) {
            str = this.LJLIL.LJII;
        }
        if (baseException != null) {
            i2 = baseException.getErrorCode();
            String errorMessage3 = baseException.getErrorMessage();
            if (errorMessage3 != null) {
                str2 = errorMessage3;
            }
        }
        c87752YcG5.LIZIZ(i2, str, str2, this.LJLIL.LJIIJ);
    }
}
