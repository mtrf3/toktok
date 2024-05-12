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
public final class O3H extends AbsDownloadListener {
    public final WeakReference<O3J> LJLIL;
    public final WeakReference<O3J> LJLILLLLZI;
    public final /* synthetic */ O3G LJLJI;
    public final /* synthetic */ Application LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ File LJLJJLL;
    public final /* synthetic */ C68322mC LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ O1L LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ int LJLLILLLL;
    public final /* synthetic */ O3J LJLLJ;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo entity) {
        O3J o3j;
        o.LJIIJ(entity, "entity");
        Downloader.getInstance(this.LJLJJI).removeMainThreadListener(entity.getId(), this);
        if (!this.LJLJJL && (o3j = this.LJLIL.get()) != null) {
            String absolutePath = this.LJLJJLL.getAbsolutePath();
            o.LJFF(absolutePath, "destination.absolutePath");
            o3j.LIZ(new O24(absolutePath, entity.isSuccessByCache()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo entity, BaseException e) {
        O3J o3j;
        o.LJIIJ(entity, "entity");
        o.LJIIJ(e, "e");
        Downloader.getInstance(this.LJLJJI).removeMainThreadListener(entity.getId(), this);
        if (((String) this.LJLJL.element).length() > 0) {
            this.LJLJI.LIZIZ(this.LJLJJI, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLJJL, this.LJLJJLL, this.LJLLILLLL + 1, this.LJLLJ);
            return;
        }
        if (this.LJLJJL || (o3j = this.LJLILLLLZI.get()) == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Download Failed:reason ");
        LIZ.append(e.getErrorCode());
        o3j.onFailed(X1D.LIZIZ(LIZ));
    }

    public O3H(O3G o3g, Application application, boolean z, File file, C68322mC c68322mC, String str, O1L o1l, String str2, String str3, int i, O3J o3j) {
        this.LJLJI = o3g;
        this.LJLJJI = application;
        this.LJLJJL = z;
        this.LJLJJLL = file;
        this.LJLJL = c68322mC;
        this.LJLJLJ = str;
        this.LJLJLLL = o1l;
        this.LJLL = str2;
        this.LJLLI = str3;
        this.LJLLILLLL = i;
        this.LJLLJ = o3j;
        this.LJLIL = new WeakReference<>(o3j);
        this.LJLILLLLZI = new WeakReference<>(o3j);
    }
}
