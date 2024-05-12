package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AqS49S0110000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FaE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39214FaE {
    public static boolean LIZJ(View view) {
        String str = null;
        if (view instanceof WebView) {
            String url = ((WebView) view).getUrl();
            if (url != null && url.length() != 0) {
                android.net.Uri uri = UriProtector.parse(url);
                o.LJFF(uri, "uri");
                String host = uri.getHost();
                if (host != null) {
                    Locale locale = Locale.ROOT;
                    o.LJFF(locale, "Locale.ROOT");
                    str = host.toLowerCase(locale);
                    o.LJFF(str, "(this as java.lang.String).toLowerCase(locale)");
                }
                for (String str2 : C37203Eit.LIZIZ) {
                    if (str == null || !ujb.o.LJJJJ(str, str2, false)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append('.');
                        LIZ.append(str);
                        if (!ujb.o.LJJJJ(X1D.LIZIZ(LIZ), str2, false)) {
                        }
                    }
                }
            }
            return false;
        }
        String LJLLILLLL = C16880lQ.LJLLILLLL(view.getClass());
        if (LJLLILLLL == null) {
            return false;
        }
        Iterator<String> it = C37203Eit.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (ujb.o.LJJJLIIL(LJLLILLLL, next, false)) {
                if (next != null) {
                    return false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                o.LJFF(childAt, "view.getChildAt(i)");
                if (!LIZJ(childAt)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void LIZ(View checkDrawForCaptureView, Canvas canvas) {
        boolean z;
        o.LJIIJ(checkDrawForCaptureView, "$this$checkDrawForCaptureView");
        o.LJIIJ(canvas, "canvas");
        if (!C39215FaF.LIZ) {
            checkDrawForCaptureView.draw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            z = canvas instanceof RecordingCanvas;
        } else if (o.LJ(C16880lQ.LJLLILLLL(canvas.getClass()), "android.view.DisplayListCanvas") || o.LJ(C16880lQ.LJLLILLLL(canvas.getClass()), "android.view.GLES20RecordingCanvas")) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Object tag = checkDrawForCaptureView.getTag(R.id.htc);
            if (!(tag instanceof Boolean)) {
                tag = null;
            }
            if (!o.LJ(tag, Boolean.TRUE) && !LIZJ(checkDrawForCaptureView)) {
                return;
            }
        }
        checkDrawForCaptureView.setTag(R.id.htc, Boolean.TRUE);
        checkDrawForCaptureView.draw(canvas);
    }

    public static Bitmap LIZIZ(View getDrawingCache, C78862UxG c78862UxG) {
        o.LJIIJ(getDrawingCache, "$this$getDrawingCache");
        OHW ohw = new OHW(c78862UxG, "View_getDrawingCache", new String[]{"screenShot"}, Integer.valueOf(EnumC39200Fa0.BPEA_ENTRY.getType()), "Collect", 0);
        C78929UyL.LIZIZ(ohw, "android/view/View", "getDrawingCache(Z)Landroid/graphics/Bitmap;", C51029K0z.LJJIIZI(new OSZ("autoScale", Boolean.TRUE)));
        return (Bitmap) C39207Fa7.LIZ(ohw, new AqS49S0110000_6(getDrawingCache, 0));
    }
}
