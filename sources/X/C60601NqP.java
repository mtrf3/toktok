package X;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.NqP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C60601NqP {
    public String[] LIZ;
    public String[] LIZIZ;
    public InterfaceC79582VLe LIZJ;
    public String LJI;
    public VN1 LJII;
    public String LIZLLL = "";
    public boolean LJ = true;
    public String LJFF = "";
    public JSONObject LJIIIIZZ = new JSONObject();
    public JSONObject LJIIIZ = new JSONObject();
    public String LJIIJ = "";
    public String LJIIJJI = "";

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Config{mWebViewClasses=");
        LIZ.append(Arrays.toString(this.LIZ));
        LIZ.append(", mWebViewObjKeys=");
        LIZ.append(Arrays.toString(this.LIZIZ));
        LIZ.append(", mBid='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", virtualAid='");
        return C77800Ug8.LIZJ(LIZ, this.LJI, '\'', '}', LIZ);
    }

    public final void LIZ(WebView... webViewArr) {
        if (webViewArr.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (WebView webView : webViewArr) {
                if (webView != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(webView.hashCode());
                    LIZ.append("");
                    arrayList.add(X1D.LIZIZ(LIZ));
                }
            }
            this.LIZIZ = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
    }
}
