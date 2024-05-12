package X;

import android.content.Context;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xyt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC86607Xyt implements Runnable {
    public final /* synthetic */ C86618Xz4 LJLIL;
    public final /* synthetic */ C86620Xz6 LJLILLLLZI;
    public final /* synthetic */ EnumC37847EtH LJLJI;
    public final /* synthetic */ InterfaceC86630XzG LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Context LJLJJLL;

    public RunnableC86607Xyt(C86618Xz4 c86618Xz4, C86620Xz6 c86620Xz6, EnumC37847EtH enumC37847EtH, C86613Xyz c86613Xyz, String str, Context context) {
        this.LJLIL = c86618Xz4;
        this.LJLILLLLZI = c86620Xz6;
        this.LJLJI = enumC37847EtH;
        this.LJLJJI = c86613Xyz;
        this.LJLJJL = str;
        this.LJLJJLL = context;
    }

    public final void LIZ() {
        C86291Xtn c86291Xtn;
        IHostNetworkDepend c65084PgW;
        C86597Xyj c86597Xyj = C86597Xyj.LIZ;
        C86620Xz6 c86620Xz6 = this.LJLILLLLZI;
        String str = c86620Xz6.LIZ;
        if (str != null) {
            InterfaceC78280Uns interfaceC78280Uns = c86620Xz6.LIZJ;
            EnumC37847EtH enumC37847EtH = this.LJLJI;
            c86597Xyj.getClass();
            String targetUrl = C86597Xyj.LIZ(str, interfaceC78280Uns, enumC37847EtH);
            LinkedHashMap<String, String> LIZIZ = C86597Xyj.LIZIZ(this.LJLILLLLZI.LIZLLL);
            C86606Xys c86606Xys = new C86606Xys(this);
            boolean z = this.LJLILLLLZI.LJFF;
            C86618Xz4 c86618Xz4 = this.LJLIL;
            c86618Xz4.getClass();
            C86291Xtn c86291Xtn2 = (C86291Xtn) c86618Xz4.LJII(C86291Xtn.class);
            if ((c86291Xtn2 == null || (c65084PgW = c86291Xtn2.LJIIIIZZ) == null) && ((c86291Xtn = C86291Xtn.LJIIL) == null || (c65084PgW = c86291Xtn.LJIIIIZZ) == null)) {
                c65084PgW = new C65084PgW();
            }
            o.LJIIJ(targetUrl, "targetUrl");
            EZA eza = new EZA(targetUrl);
            eza.LIZ = LIZIZ;
            eza.LIZIZ = z;
            EZ9 ez9 = EZ9.LIZ;
            EZC ezc = EZC.DOWNLOAD;
            ez9.getClass();
            c86606Xys.LIZ(EZ9.LIZLLL(ezc, eza, c65084PgW));
            return;
        }
        o.LJIJI("url");
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
