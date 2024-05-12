package X;

import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class GMR<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public GMR(String str, String str2, String str3) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(this.LJLIL);
        with.LJ = this.LJLILLLLZI;
        with.LIZJ = this.LJLJI;
        with.LJII = 1;
        with.LJJI = true;
        with.LJIIJJI = GMQ.LJIIIZ;
        return Integer.valueOf(with.LIZJ());
    }
}
