package X;

import com.ss.android.ugc.aweme.library.api.LibraryApi;
import com.ss.android.ugc.aweme.model.library.LibraryVideosResponse;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.MHq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC56558MHq implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI = 20;
    public final /* synthetic */ C56554MHm LJLJJI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.LJLJJI.LJLIL.LJ = false;
        String libraryId = this.LJLIL;
        int i = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        o.LJIIIZ(libraryId, "libraryId");
        C10K<LibraryVideosResponse> queryLibraryVideos = LibraryApi.LIZ.queryLibraryVideos(libraryId, i, i2);
        try {
            queryLibraryVideos.LJIJI();
        } catch (InterruptedException unused) {
        }
        if (queryLibraryVideos.LJIILJJIL()) {
            try {
                Exception LJIIJ = queryLibraryVideos.LJIIJ();
                o.LJIIIIZZ(LJIIJ, "task.error");
                throw LJIIJ;
            } catch (Exception unused2) {
            }
        }
        LibraryVideosResponse LJIIJJI = queryLibraryVideos.LJIIJJI();
        o.LJIIIIZZ(LJIIJJI, "task.result");
        return LJIIJJI;
    }

    public CallableC56558MHq(C56554MHm c56554MHm, String str, int i) {
        this.LJLJJI = c56554MHm;
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}
