package X;

import com.ss.android.ugc.aweme.services.ArticleModeService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Nhw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60076Nhw extends AbstractC60811Ntn {
    public final /* synthetic */ C60079Nhz LJLILLLLZI;
    public final /* synthetic */ C188727au LJLJI;
    public final /* synthetic */ Integer LJLJJI;

    @Override // X.AbstractC60673NrZ
    public final void onDestroy() {
        long j;
        long j2;
        long nanoTime = System.nanoTime();
        C60079Nhz c60079Nhz = this.LJLILLLLZI;
        long j3 = c60079Nhz.LJLJLLL;
        long j4 = c60079Nhz.LJLL;
        if ((nanoTime - j3) - (nanoTime - j4) > 0) {
            j = (nanoTime - j3) - (nanoTime - j4);
        } else if (j4 > 0) {
            j = (nanoTime - j3) - j4;
        } else {
            j = nanoTime - j3;
        }
        C188727au c188727au = this.LJLJI;
        Integer num = this.LJLJJI;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        c60079Nhz.LJJJJJL(c188727au, num, timeUnit.toMillis(j));
        C60079Nhz c60079Nhz2 = this.LJLILLLLZI;
        long j5 = c60079Nhz2.LJLJLJ;
        long j6 = c60079Nhz2.LJLL;
        if ((nanoTime - j5) - (nanoTime - j6) > 0) {
            j2 = (nanoTime - j5) - (nanoTime - j6);
        } else if (j6 > 0) {
            j2 = (nanoTime - j5) - j6;
        } else {
            j2 = nanoTime - j5;
        }
        if (j5 != 0) {
            ArticleModeService.INSTANCE.getArticleLoggingService().logMultiAnchorStayTime(this.LJLJI, timeUnit.toMillis(j2));
        }
        C60079Nhz c60079Nhz3 = this.LJLILLLLZI;
        c60079Nhz3.LJLJLJ = 0L;
        c60079Nhz3.LJLL = 0L;
    }

    public C60076Nhw(C60079Nhz c60079Nhz, C188727au c188727au, Integer num) {
        this.LJLILLLLZI = c60079Nhz;
        this.LJLJI = c188727au;
        this.LJLJJI = num;
    }
}
