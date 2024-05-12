package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.SystemClock;
import android.webkit.WebView;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.No6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60458No6 extends C60379Nmp implements InterfaceC60336Nm8 {
    @Override // X.InterfaceC60336Nm8
    public final WebView LJIILIIL(Context context, String str) {
        WebView webView;
        if (str == null) {
            str = "webx_bullet";
        }
        C60459No7 c60459No7 = C60464NoC.LIZ;
        if (c60459No7 != null) {
            SystemClock.uptimeMillis();
            C60461No9 c60461No9 = (C60461No9) ((HashMap) c60459No7.LIZLLL).get(str);
            if (c60461No9 != null) {
                if (!((ArrayList) c60461No9.LIZ).isEmpty()) {
                    synchronized (c60459No7.LIZ) {
                        webView = (WebView) ((SoftReference) ((ArrayList) c60461No9.LIZ).remove(0)).get();
                        if (webView != null) {
                            Context context2 = webView.getContext();
                            if (context2 instanceof MutableContextWrapper) {
                                ((MutableContextWrapper) context2).setBaseContext(context);
                            }
                        }
                        if (((ArrayList) c60461No9.LIZ).size() < c60461No9.LIZJ) {
                            c60459No7.LIZIZ(c60461No9);
                        }
                    }
                    return webView;
                }
                C59614NaU create = c60461No9.LIZIZ.create(new MutableContextWrapper(context));
                if (create != null) {
                    create.setTag(R.id.ni6, Boolean.FALSE);
                }
                c60459No7.LIZ(c60461No9.LIZJ, str);
                return create;
            }
        }
        return null;
    }

    @Override // X.InterfaceC60336Nm8
    public final void LJJIIZI(Context context, C60357NmT c60357NmT) {
        if (c60357NmT.LIZ == null) {
            return;
        }
        if (C60464NoC.LIZ == null) {
            C60464NoC.LIZ = new C60459No7(context);
        }
        C60462NoA c60462NoA = new C60462NoA();
        c60462NoA.LIZ = new C60350NmM(c60357NmT);
        c60462NoA.LIZIZ = 1;
        c60462NoA.LIZJ = false;
        C60461No9 c60461No9 = new C60461No9(c60462NoA);
        C60459No7 c60459No7 = C60464NoC.LIZ;
        if (c60459No7 != null && !((HashMap) c60459No7.LIZLLL).containsKey("webx_bullet")) {
            ((HashMap) c60459No7.LIZLLL).put("webx_bullet", c60461No9);
            if (c60461No9.LIZLLL) {
                c60459No7.LIZ(c60461No9.LIZJ, "webx_bullet");
            }
        }
    }
}
