package X;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Fdr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39439Fdr extends C60406NnG {
    public final F3T LIZ;

    @Override // X.C60406NnG, X.InterfaceC60244Nke
    public final InterfaceC60252Nkm LIZLLL() {
        return new C38286F0w();
    }

    public C39439Fdr(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        this.LIZ = providerFactory;
    }

    @Override // X.InterfaceC60282NlG
    public final AbstractC59475NVv LJ(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return new C59304NPg();
    }

    @Override // X.C60406NnG, X.InterfaceC60244Nke
    public final java.util.Map<String, Object> LIZIZ(NUX instance, F3T providerFactory) {
        int i;
        o.LJIIIZ(instance, "instance");
        o.LJIIIZ(providerFactory, "providerFactory");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Context context = (Context) providerFactory.LIZJ(Context.class);
        if (context != null) {
            i = C63081OpJ.LJJJJLI(context);
        } else {
            i = 0;
        }
        linkedHashMap.put("statusBarHeight", Integer.valueOf(C17N.LJJJJI(i)));
        return linkedHashMap;
    }

    @Override // X.C60406NnG, X.InterfaceC60244Nke
    public final void LIZJ(WebSettings webSettings, C59614NaU c59614NaU) {
        String str;
        int i;
        super.LIZJ(webSettings, c59614NaU);
        Context context = (Context) this.LIZ.LIZJ(Context.class);
        if (context != null) {
            C60407NnH c60407NnH = new C60407NnH(context);
            c60407NnH.LIZIZ = true;
            c60407NnH.LIZ(c59614NaU);
        }
        android.net.Uri uri = (android.net.Uri) this.LIZ.LIZJ(android.net.Uri.class);
        List<String> list = null;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        String decode = android.net.Uri.decode(str);
        try {
            list = C2YJ.LIZIZ.LIZ.getWebviewCacheUrls();
        } catch (Throwable unused) {
        }
        if (list != null && decode != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (s.LJJJLZIJ(decode, it.next(), false)) {
                    i = 2;
                    break;
                }
            }
        }
        i = -1;
        webSettings.setCacheMode(i);
        c59614NaU.setFocusableInTouchMode(true);
        c59614NaU.setScrollBarStyle(0);
        CookieManager.getInstance().setAcceptCookie(true);
    }
}
