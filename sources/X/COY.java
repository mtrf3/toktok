package X;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes6.dex */
public final class COY {
    public static volatile COY LIZJ;
    public final List<InterfaceC31244COa> LIZ;
    public final List<InterfaceC31244COa> LIZIZ;

    public static COY LIZIZ() {
        if (LIZJ == null) {
            synchronized (COY.class) {
                if (LIZJ == null) {
                    LIZJ = new COY();
                }
            }
        }
        return LIZJ;
    }

    public COY() {
        LinkedList linkedList = new LinkedList();
        this.LIZ = linkedList;
        LinkedList linkedList2 = new LinkedList();
        this.LIZIZ = linkedList2;
        linkedList.add(new COS());
        linkedList.add(new COZ());
        linkedList.add(new C31245COb());
        linkedList2.add(new COZ());
        linkedList2.add(new C31245COb());
    }

    public static String LIZ(String str) {
        Uri.Builder buildUpon = UriProtector.parse("liveresource://file").buildUpon();
        buildUpon.scheme("liveresource").appendQueryParameter("path", str);
        return buildUpon.build().toString();
    }

    public final WebResourceResponse LIZJ(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        android.net.Uri parse = UriProtector.parse(str);
        Iterator<InterfaceC31244COa> it = this.LIZ.iterator();
        while (it.hasNext()) {
            WebResourceResponse LIZ = it.next().LIZ(parse, webView);
            if (LIZ != null) {
                return LIZ;
            }
        }
        return null;
    }
}
