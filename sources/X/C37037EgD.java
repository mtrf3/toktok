package X;

import Y.ACallableS4S2000000_6;
import android.webkit.WebView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.EgD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37037EgD extends AbstractC37041EgH {
    public static final C37037EgD LIZ = new C37037EgD();
    public static final C37036EgC LIZIZ = new C37036EgC();

    @Override // X.InterfaceC37044EgK
    public final InterfaceC37044EgK LIZJ() {
        return LIZIZ;
    }

    @Override // X.InterfaceC37043EgJ
    public final OSZ LIZ(VNS vns, String str) {
        Object obj;
        String str2;
        String str3;
        if (vns != null) {
            obj = vns.getTag(R.id.b11);
        } else {
            obj = null;
        }
        boolean LJ = o.LJ("bullet", obj);
        if (str == null) {
            str2 = "AndroidNotSet";
        } else {
            str2 = str;
        }
        C10K.LIZJ(new F35(LJ, str2));
        OSZ LIZ2 = LIZIZ.LIZ(vns, str);
        if (!((Boolean) LIZ2.getSecond()).booleanValue()) {
            C35996EAu LIZIZ2 = C35995EAt.LIZIZ((String) LIZ2.getFirst());
            if (LIZIZ2 == null || (str3 = LIZIZ2.LIZ()) == null) {
                str3 = "";
            }
            C37023Efz.LIZ(new C37024Eg0(10003, str3, ""));
        }
        return LIZ2;
    }

    @Override // X.AbstractC37041EgH, X.InterfaceC37042EgI
    public final String LIZLLL(WebView webView, String str) {
        o.LJIIIZ(webView, "webView");
        if (str != null) {
            C10K.LIZJ(new ACallableS4S2000000_6(str, webView.getClass().getName(), 3));
        }
        return super.LIZLLL(webView, str);
    }
}
