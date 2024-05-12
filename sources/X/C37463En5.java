package X;

import Y.ARunnableS8S0201000_5;
import Y.ARunnableS9S0201000_6;
import android.content.Context;
import com.bytedance.pia.core.setting.Config;
import com.bytedance.pia.core.tracing.EventName;
import com.bytedance.pia.core.tracing.Tracing;
import com.bytedance.pia.core.utils.DefaultResourceLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.En5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37463En5 extends C37496Enc {
    public static Context LJIILLIIL;
    public final Config LIZJ;
    public final String LIZLLL;
    public final android.net.Uri LJ;
    public final String LJFF;
    public final C37392Elw LJI = new C37392Elw();
    public final C37477EnJ LJII;
    public final InterfaceC37599EpH LJIIIIZZ;
    public final InterfaceC37169EiL LJIIIZ;
    public final String LJIIJ;
    public final Object LJIIJJI;
    public final java.util.Map<String, ?> LJIIL;
    public final C37490EnW LJIILIIL;
    public final InterfaceC37524Eo4 LJIILJJIL;
    public final Tracing LJIILL;

    public final void LIZLLL(C37473EnF c37473EnF) {
        if (c37473EnF != null) {
            try {
                java.util.Set<? extends C37403Em7<?, ?>> create = c37473EnF.create();
                if (create != null) {
                    for (C37403Em7<?, ?> c37403Em7 : create) {
                        C37392Elw c37392Elw = this.LJI;
                        c37392Elw.getClass();
                        C37613EpV.LIZJ(new ARunnableS8S0201000_5(1, c37392Elw, c37403Em7, 16));
                    }
                }
            } catch (Throwable th) {
                C37238EjS.LIZLLL(4, "[Runtime] create bridge method error:", th);
            }
        }
    }

    public final void LJ(List<InterfaceC37408EmC<InterfaceC37474EnG>> list) {
        if (list == null) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            try {
                InterfaceC37474EnG interfaceC37474EnG = (InterfaceC37474EnG) ((InterfaceC37408EmC) it.next()).LIZ(this.LJIIJJI);
                if (interfaceC37474EnG != null) {
                    C37477EnJ c37477EnJ = this.LJII;
                    c37477EnJ.getClass();
                    C37613EpV.LIZJ(new F65(1, c37477EnJ, interfaceC37474EnG));
                }
            } catch (Throwable th) {
                C37238EjS.LIZLLL(4, "[Runtime] create MetricsObserver error:", th);
            }
        }
    }

    public C37463En5(android.net.Uri uri, String str, String str2, Object obj, DefaultResourceLoader defaultResourceLoader, InterfaceC37169EiL interfaceC37169EiL, String str3, Config config, java.util.Map map, InterfaceC37524Eo4 interfaceC37524Eo4) {
        Tracing tracing = new Tracing();
        this.LJIILL = tracing;
        Tracing.Event LIZ = tracing.LIZ(EventName.NavigateStart);
        LIZ.args.put("url", uri.toString());
        LIZ.LIZ();
        this.LIZJ = config;
        this.LIZLLL = str2;
        this.LJ = uri;
        this.LJFF = C85693Xx.LIZJ(uri, null);
        this.LJIIJJI = obj;
        this.LJIIIIZZ = defaultResourceLoader;
        this.LJIIIZ = interfaceC37169EiL;
        C37477EnJ c37477EnJ = new C37477EnJ(uri.toString());
        this.LJII = c37477EnJ;
        LIZJ(c37477EnJ);
        this.LJIIL = map;
        this.LJIILIIL = new C37490EnW(str);
        this.LJIILJJIL = interfaceC37524Eo4;
        StringBuilder LIZ2 = X1D.LIZ();
        this.LJIIJ = C025908h.LIZIZ(LIZ2, C37498Ene.LIZ, " ", str3, LIZ2);
        C37613EpV.LIZJ(new ARunnableS9S0201000_6(0, this, str2, 7));
    }
}
