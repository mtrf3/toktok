package X;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.services.ArticleModeService;
import kotlin.jvm.internal.o;

/* renamed from: X.Nhv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60075Nhv extends C60413NnN {
    public final /* synthetic */ C60079Nhz LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C188727au LJLJJI;
    public final /* synthetic */ Integer LJLJJL;

    @Override // X.AbstractC60423NnX
    public final void LJFF(WebView webView, String str, Bitmap bitmap) {
        if (str == null || str.length() == 0) {
            return;
        }
        C60079Nhz c60079Nhz = this.LJLILLLLZI;
        if (c60079Nhz.LJLJLJ == 0) {
            c60079Nhz.LJLJLJ = System.nanoTime();
            return;
        }
        android.net.Uri parse = UriProtector.parse(str);
        android.net.Uri parse2 = UriProtector.parse(this.LJLJI);
        if (this.LJLILLLLZI.LJLJLLL == 0 && o.LJ(parse.getHost(), parse2.getHost())) {
            this.LJLILLLLZI.LJLJLLL = System.nanoTime();
            ArticleModeService.INSTANCE.getArticleLoggingService().logEnterArticleDetail(this.LJLJJI, this.LJLJJL);
        }
    }

    public C60075Nhv(C60079Nhz c60079Nhz, String str, C188727au c188727au, Integer num) {
        this.LJLILLLLZI = c60079Nhz;
        this.LJLJI = str;
        this.LJLJJI = c188727au;
        this.LJLJJL = num;
    }
}
