package X;

import android.app.Application;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O3I extends AbsDownloadListener {
    public final WeakReference<O3K> LJLIL;
    public final WeakReference<O3K> LJLILLLLZI;
    public final /* synthetic */ O3F LJLJI;
    public final /* synthetic */ Application LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ File LJLJJLL;
    public final /* synthetic */ C68322mC LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ O1M LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ int LJLLILLLL;
    public final /* synthetic */ O3K LJLLJ;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo entity) {
        O3K o3k;
        o.LJIIJ(entity, "entity");
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download success，");
        LIZ.append(entity.getUrl());
        c39048FUe.LIZ(X1D.LIZIZ(LIZ), EnumC39866Fkk.D, "res-DownloaderDepend");
        Downloader.getInstance(this.LJLJJI).removeMainThreadListener(entity.getId(), this);
        if (!this.LJLJJL && (o3k = this.LJLIL.get()) != null) {
            String absolutePath = this.LJLJJLL.getAbsolutePath();
            o.LJFF(absolutePath, "destination.absolutePath");
            o3k.LIZ(new O37(absolutePath, entity.isSuccessByCache()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo entity, BaseException e) {
        O3K o3k;
        o.LJIIJ(entity, "entity");
        o.LJIIJ(e, "e");
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download failed,errorCode:");
        LIZ.append(e.getErrorCode());
        LIZ.append(";errorMsg:");
        LIZ.append(e.getErrorMessage());
        c39048FUe.LIZ(X1D.LIZIZ(LIZ), EnumC39866Fkk.D, "res-DownloaderDepend");
        Downloader.getInstance(this.LJLJJI).removeMainThreadListener(entity.getId(), this);
        if (((String) this.LJLJL.element).length() > 0) {
            this.LJLJI.LIZIZ(this.LJLJJI, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLJJL, this.LJLJJLL, this.LJLLILLLL + 1, this.LJLLJ);
            return;
        }
        if (this.LJLJJL || (o3k = this.LJLILLLLZI.get()) == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Download Failed:reason ");
        LIZ2.append(e.getErrorCode());
        o3k.onFailed(X1D.LIZIZ(LIZ2));
    }

    public O3I(O3F o3f, Application application, boolean z, File file, C68322mC c68322mC, String str, O1M o1m, String str2, String str3, int i, O3K o3k) {
        this.LJLJI = o3f;
        this.LJLJJI = application;
        this.LJLJJL = z;
        this.LJLJJLL = file;
        this.LJLJL = c68322mC;
        this.LJLJLJ = str;
        this.LJLJLLL = o1m;
        this.LJLL = str2;
        this.LJLLI = str3;
        this.LJLLILLLL = i;
        this.LJLLJ = o3k;
        this.LJLIL = new WeakReference<>(o3k);
        this.LJLILLLLZI = new WeakReference<>(o3k);
    }
}
