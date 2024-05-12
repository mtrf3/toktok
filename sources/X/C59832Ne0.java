package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.common.utility.Logger;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import java.util.HashSet;

/* renamed from: X.Ne0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59832Ne0 {
    public static final boolean LIZ = FCD.LJII();
    public static final int LIZIZ = -1;
    public static final int LIZJ = -1;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("HUAWEI C8812");
        hashSet.add("HUAWEI C8812E");
        hashSet.add("HUAWEI C8825D");
        hashSet.add("HUAWEI U8825D");
        hashSet.add("HUAWEI C8950D");
        hashSet.add("HUAWEI U8950D");
        HashSet hashSet2 = new HashSet();
        hashSet2.add("ZTE V955");
        hashSet2.add("ZTE N881E");
        hashSet2.add("ZTE N881F");
        hashSet2.add("ZTE N880G");
        hashSet2.add("ZTE N880F");
        hashSet2.add("ZTE V889F");
    }

    public static void LIZ(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.setWebChromeClient(null);
        C16880lQ.LLZLI(webView, null);
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            C16880lQ.LJLLL(webView, (ViewGroup) parent);
            try {
                webView.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    public static void LIZIZ(Context context, WebView webView) {
        if (context == null || webView == null) {
            return;
        }
        if (CrossPlatformLegacyServiceImpl.LJIJ().LJI() == 0) {
            int i = LIZIZ;
            if (i < 0) {
                if (!LIZ) {
                    return;
                }
            } else if (i <= 0) {
                return;
            }
        }
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ == null || !LJIJJ.isFinishing()) {
            return;
        }
        try {
            OBI.LIZ(webView, "about:blank");
            if (LIZJ > 0) {
                View rootView = webView.getRootView();
                if (rootView instanceof ViewGroup) {
                    View childAt = ((ViewGroup) rootView).getChildAt(0);
                    childAt.setDrawingCacheEnabled(true);
                    Bitmap createBitmap = Bitmap.createBitmap(childAt.getDrawingCache());
                    childAt.setDrawingCacheEnabled(false);
                    ImageView imageView = new ImageView(LJIJJ);
                    imageView.setImageBitmap(createBitmap);
                    imageView.setVisibility(0);
                    ((ViewGroup) rootView).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                }
            }
        } catch (Exception unused) {
        }
        Logger.debug();
    }
}
