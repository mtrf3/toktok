package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

/* renamed from: X.Zvr, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91515Zvr extends AbsDownloadListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ InterfaceC73573Su9<C91316Zse> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Music LJLJJI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        C91316Zse LIZ;
        super.onSuccessed(downloadInfo);
        try {
            int i = this.LJLIL;
            String str = null;
            if (i != 2) {
                if (i != 3) {
                    if (i == 10) {
                        C91316Zse c91316Zse = new C91316Zse(0);
                        if (downloadInfo != null) {
                            str = downloadInfo.getTargetFilePath();
                        }
                        LIZ = c91316Zse.LIZJ(str);
                    } else {
                        this.LJLILLLLZI.onError(new NoSuchElementException());
                    }
                } else {
                    C91316Zse c91316Zse2 = new C91316Zse(0);
                    if (downloadInfo != null) {
                        str = downloadInfo.getTargetFilePath();
                    }
                    LIZ = c91316Zse2.LJ(str);
                }
            } else {
                C91316Zse c91316Zse3 = new C91316Zse(0);
                if (downloadInfo != null) {
                    str = downloadInfo.getTargetFilePath();
                }
                LIZ = c91316Zse3.LIZ(str);
            }
            if (LIZ != null) {
                C0M6<String, C91316Zse> c0m6 = C91318Zsg.LIZ;
                String str2 = this.LJLJI;
                C91318Zsg.LIZIZ(LIZ, this.LJLJJI);
                c0m6.LIZJ(str2, LIZ);
                this.LJLILLLLZI.onNext(LIZ);
                this.LJLILLLLZI.onComplete();
                return;
            }
            this.LJLILLLLZI.onError(new NoSuchElementException());
        } catch (FileNotFoundException e) {
            C16880lQ.LLLLIIL(e);
            this.LJLILLLLZI.onError(new FileNotFoundException());
        } catch (IOException e2) {
            C16880lQ.LLLLIIL(e2);
            this.LJLILLLLZI.onError(new IOException());
        } catch (Throwable th) {
            this.LJLILLLLZI.onError(th);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        super.onFailed(downloadInfo, baseException);
        this.LJLILLLLZI.onError(new NoSuchElementException());
    }

    public C91515Zvr(int i, C73433Srt c73433Srt, String str, Music music) {
        this.LJLIL = i;
        this.LJLILLLLZI = c73433Srt;
        this.LJLJI = str;
        this.LJLJJI = music;
    }
}
