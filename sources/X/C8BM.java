package X;

import com.ss.android.ugc.aweme.mvtemplate.api.MovieDetailAPi;
import com.ss.android.ugc.aweme.mvtemplate.model.MvDetailListModel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.8BM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8BM<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C8BL LJLJI;
    public final /* synthetic */ int LJLJJI;

    public C8BM(String str, long j, C8BL c8bl, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = c8bl;
        this.LJLJJI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        Object obj;
        String mvId = this.LJLIL;
        long j = this.LJLILLLLZI;
        if (this.LJLJI.LJLIL == 20) {
            i = 1;
        } else {
            i = 2;
        }
        int i2 = this.LJLJJI;
        o.LJIIIZ(mvId, "mvId");
        String str = MovieDetailAPi.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "URL_MOVIE_DETAIL", str);
        if (LJI != null) {
            obj = LJI.create(MovieDetailAPi.MvDetail.class);
        } else {
            obj = null;
        }
        o.LJI(obj);
        MvDetailListModel response = ((MovieDetailAPi.MvDetail) obj).getMvDetailList(mvId, j, i, i2).get();
        o.LJIIIIZZ(response, "response");
        return response;
    }
}
