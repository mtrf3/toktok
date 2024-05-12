package X;

import Y.AObjectS84S0300000_14;
import android.webkit.WebView;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EvF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37969EvF {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public Integer LJIILJJIL;
    public int LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final int LJIJI;
    public final String LJIJJ;
    public final WebView LJIJJLI;

    public final HashMap<String, Object> LIZ() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("jsb_module_name", this.LJIILLIIL);
        hashMap.put("jsb_method_name", this.LJIIZILJ);
        hashMap.put("jsb_name", this.LJIJ);
        hashMap.put("jsb_protocol_version", Integer.valueOf(this.LJIJI));
        hashMap.put("jsb_bridgesdk", this.LJIJJ);
        Integer num = this.LJIILJJIL;
        if (num != null) {
            hashMap.put("jsb_status_code", Integer.valueOf(num.intValue()));
        }
        hashMap.put("jsb_call_from", Integer.valueOf(this.LJIILL));
        return hashMap;
    }

    public final void LIZIZ() {
        WebView webView = this.LJIJJLI;
        if (webView != null) {
            HashMap<String, Object> LIZ = LIZ();
            VMI vmi = VMI.LJ;
            vmi.getClass();
            C38045EwT.LIZ(new AObjectS84S0300000_14(vmi, webView, LIZ, 3));
        }
    }

    public C37969EvF(String jsbModuleName, String jsbMethodName, String jsbName, int i, String str, WebView webView) {
        o.LJIIJ(jsbModuleName, "jsbModuleName");
        o.LJIIJ(jsbMethodName, "jsbMethodName");
        o.LJIIJ(jsbName, "jsbName");
        this.LJIILLIIL = jsbModuleName;
        this.LJIIZILJ = jsbMethodName;
        this.LJIJ = jsbName;
        this.LJIJI = i;
        this.LJIJJ = str;
        this.LJIJJLI = webView;
        this.LJIILJJIL = 0;
    }
}
