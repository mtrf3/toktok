package X;

import Y.ARunnableS29S0200000_10;
import android.webkit.WebView;
import com.bytedance.falconx.statistic.InterceptorModel;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes11.dex */
public final class OIE extends C61490OBi {
    public final /* synthetic */ InterceptorModel LJLILLLLZI;
    public final /* synthetic */ WebView LJLJI;
    public final /* synthetic */ OID LJLJJI;

    @Override // X.C61490OBi, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.LJLILLLLZI.loadFinish(true);
        this.LJLJJI.LIZJ.post(new ARunnableS29S0200000_10(this.LJLJI, this.LJLILLLLZI, 69));
    }

    @Override // X.C61490OBi
    public final void LIZ(IOException iOException) {
        this.LJLILLLLZI.setErrorCode("101");
        this.LJLILLLLZI.setErrorMsg(iOException.getMessage());
        this.LJLILLLLZI.loadFinish(false);
        this.LJLJJI.LIZJ.post(new ARunnableS29S0200000_10(this.LJLJI, this.LJLILLLLZI, 69));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OIE(OID oid, InputStream inputStream, InterceptorModel interceptorModel, WebView webView) {
        super(inputStream);
        this.LJLJJI = oid;
        this.LJLILLLLZI = interceptorModel;
        this.LJLJI = webView;
    }
}
