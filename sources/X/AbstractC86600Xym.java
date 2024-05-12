package X;

import Y.ARunnableS0S4201000_6;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import com.google.android.play.core.appupdate.u;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.Xym, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC86600Xym extends AbstractC37780EsC {
    public final EnumC38005Evp LIZIZ = EnumC38005Evp.PROTECT;

    public abstract void LJIIIIZZ(C86609Xyv c86609Xyv, C86611Xyx c86611Xyx, EnumC37847EtH enumC37847EtH);

    @Override // X.InterfaceC37774Es6
    public final String getName() {
        return "x.request";
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C86609Xyv> LIZ() {
        return C86609Xyv.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final Class<C86616Xz2> LIZLLL() {
        return C86616Xz2.class;
    }

    @Override // X.AbstractC37780EsC, X.InterfaceC37774Es6
    public final EnumC38005Evp getAccess() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC37774Es6
    public final void LIZJ(InterfaceC78280Uns params, InterfaceC31943CgF interfaceC31943CgF, EnumC37847EtH type) {
        boolean z;
        C86628XzE c86628XzE;
        o.LJIIJ(params, "params");
        o.LJIIJ(type, "type");
        String LJJIJIL = u.LJJIJIL(params, "url", "");
        if (LJJIJIL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String LJJIJIL2 = u.LJJIJIL(params, "method", "GET");
            InterfaceC78505UrV interfaceC78505UrV = params.get("body");
            InterfaceC78280Uns LJJIJIIJIL = u.LJJIJIIJIL(params, "params");
            InterfaceC78280Uns LJJIJIIJIL2 = u.LJJIJIIJIL(params, "header");
            String LJJIJIL3 = u.LJJIJIL(params, "bodyType", "");
            boolean LJJIIZI = u.LJJIIZI(params, "disableRedirect", false);
            boolean LJJIIZI2 = u.LJJIIZI(params, "addCommonParams", true);
            if (!params.hasKey("needCommonParams") || params.getType("needCommonParams") == EnumC78522Urm.Null || params.getType("needCommonParams") == EnumC78522Urm.Boolean) {
                boolean LJJIIZI3 = u.LJJIIZI(params, "needCommonParams", true);
                int LJJIJIIJI = u.LJJIJIIJI(params, "jsonFormatOption", 0);
                C86609Xyv c86609Xyv = new C86609Xyv();
                c86609Xyv.LIZ = LJJIJIL;
                o.LJIIJ(LJJIJIL2, "<set-?>");
                c86609Xyv.LIZIZ = LJJIJIL2;
                c86609Xyv.LIZJ = interfaceC78505UrV;
                c86609Xyv.LJ = LJJIJIIJIL;
                c86609Xyv.LJFF = LJJIJIIJIL2;
                c86609Xyv.LIZLLL = LJJIJIL3;
                c86609Xyv.LJI = LJJIIZI;
                c86609Xyv.LJII = LJJIIZI2;
                c86609Xyv.LJIIIIZZ = LJJIIZI3;
                c86609Xyv.LJIIIZ = LJJIJIIJI;
                c86609Xyv.LJIIJJI = ujb.o.LJJJJIZL(u.LJJIJIL(params, "preferredContentType", "Json"), "Protobuf", true);
                InterfaceC78280Uns LJJIJIIJIL3 = u.LJJIJIIJIL(params, "extraPBConfig");
                if (LJJIJIIJIL3 != null) {
                    String LJJIJIL4 = u.LJJIJIL(LJJIJIIJIL3, "channel", "");
                    String LJJIJIL5 = u.LJJIJIL(LJJIJIIJIL3, "dataMessageName", "");
                    if (LJJIJIL4.length() != 0 && LJJIJIL5.length() != 0) {
                        c86628XzE = new C86628XzE(LJJIJIL4, LJJIJIL5);
                        c86609Xyv.LJIIJ = c86628XzE;
                        LJIIIIZZ(c86609Xyv, new C86611Xyx(this, c86609Xyv, type, interfaceC31943CgF), type);
                        return;
                    }
                }
                c86628XzE = null;
                c86609Xyv.LJIIJ = c86628XzE;
                LJIIIIZZ(c86609Xyv, new C86611Xyx(this, c86609Xyv, type, interfaceC31943CgF), type);
                return;
            }
        }
        LJIIIZ(-3, u.LJJIJIL(params, "method", ""), u.LJJIJIL(params, "url", ""), "Invalid params", -1, type.name());
        AbstractC37780EsC.LJFF(this, interfaceC31943CgF, -3, null, 12);
    }

    public final void LJIIIZ(int i, String str, String str2, String str3, Integer num, String str4) {
        C86291Xtn c86291Xtn;
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService executorService;
        C86291Xtn c86291Xtn2 = (C86291Xtn) LJII(C86291Xtn.class);
        if (((c86291Xtn2 == null || (iHostThreadPoolExecutorDepend = c86291Xtn2.LJIIJ) == null) && ((c86291Xtn = C86291Xtn.LJIIL) == null || (iHostThreadPoolExecutorDepend = c86291Xtn.LJIIJ) == null)) || (executorService = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) == null) {
            executorService = C38016Ew0.LIZ;
            o.LJFF(executorService, "TTExecutors.getNormalExecutor()");
        }
        executorService.execute(new ARunnableS0S4201000_6(this, str, str2, num, i, str3, str4, 0));
    }
}
