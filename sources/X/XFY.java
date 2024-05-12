package X;

import android.app.Application;
import com.google.gson.Gson;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XFY {
    public static volatile XFY LJFF;
    public static volatile boolean LJI;
    public Application LIZ;
    public volatile InterfaceC44175HVj LIZIZ;
    public final ReentrantLock LIZJ;
    public final Gson LIZLLL;
    public final C44839Hil LJ;

    public final void LIZIZ(C63946P7u c63946P7u) {
        H78.LJI("VESDKLoader initVESDK start");
        if (!LJI) {
            try {
                this.LIZJ.lock();
                if (!LJI) {
                    XFV LIZ = XFV.LJFF.LIZ(this.LIZ);
                    TENativeLibsLoader.setLibraryLoad((InterfaceC38927FPn) LIZ.LIZLLL.getValue());
                    com.bytedance.ies.nleeditor.NLE.INSTANCE.setLibraryLoader(new XFX((InterfaceC38927FPn) LIZ.LIZLLL.getValue()));
                    DownloadableModelSupport.setLibraryLoader((DownloadableModelSupportLibraryLoader) LIZ.LJ.getValue());
                    FFL.LJIIIZ().getClass();
                    if (FFL.LJ(31744, "enable_ve_hook", true, false)) {
                        C45275Hpn.LIZ.storeBoolean("key_ve_hook_switch", true);
                        C45275Hpn.LIZ();
                    }
                    LIZJ(DownloadableModelSupport.getInstance().getResourceFinder(), c63946P7u);
                    Application context = this.LIZ;
                    o.LJIIIZ(context, "context");
                    File LLIIJLIL = C16880lQ.LLIIJLIL(context);
                    o.LJIIIIZZ(LLIIJLIL, "context.filesDir");
                    File LLLILZJ = OR7.LLLILZJ(OR7.LLLILZJ(LLIIJLIL, "vesdk"), "models");
                    if (LLLILZJ.exists()) {
                        XKX.LIZLLL(C780334l.LJLIL, null, null, new C63792et(LLLILZJ, null), 3);
                    }
                    TEImageInterface.queryMediadata(false, false, "", Boolean.TRUE);
                    LJI = true;
                }
            } finally {
                this.LIZJ.unlock();
            }
        }
        H78.LJI("VESDKLoader initVESDK end");
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f7, code lost:
    
        if (X.FFL.LJIIJ(31744, 0, "mv_template_support_fast_import", true) == 2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01da A[Catch: all -> 0x0296, TryCatch #1 {, blocks: (B:4:0x0026, B:10:0x002d, B:12:0x0060, B:13:0x0067, B:15:0x0074, B:16:0x007b, B:18:0x00b6, B:20:0x00c0, B:23:0x00f9, B:24:0x00fc, B:26:0x010a, B:28:0x010e, B:29:0x0111, B:31:0x0132, B:33:0x0147, B:34:0x014c, B:35:0x0150, B:37:0x0156, B:39:0x015c, B:44:0x016d, B:49:0x0172, B:50:0x0175, B:52:0x018c, B:54:0x019e, B:56:0x01b1, B:58:0x01bb, B:59:0x01bf, B:61:0x01c9, B:62:0x01cd, B:64:0x01da, B:66:0x0248, B:67:0x0253, B:69:0x026e, B:70:0x0275, B:75:0x0276, B:76:0x027d, B:77:0x027e, B:78:0x0285, B:79:0x00ea, B:81:0x0286, B:82:0x028d, B:83:0x028e, B:84:0x0295), top: B:3:0x0026, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026e A[Catch: all -> 0x0296, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0026, B:10:0x002d, B:12:0x0060, B:13:0x0067, B:15:0x0074, B:16:0x007b, B:18:0x00b6, B:20:0x00c0, B:23:0x00f9, B:24:0x00fc, B:26:0x010a, B:28:0x010e, B:29:0x0111, B:31:0x0132, B:33:0x0147, B:34:0x014c, B:35:0x0150, B:37:0x0156, B:39:0x015c, B:44:0x016d, B:49:0x0172, B:50:0x0175, B:52:0x018c, B:54:0x019e, B:56:0x01b1, B:58:0x01bb, B:59:0x01bf, B:61:0x01c9, B:62:0x01cd, B:64:0x01da, B:66:0x0248, B:67:0x0253, B:69:0x026e, B:70:0x0275, B:75:0x0276, B:76:0x027d, B:77:0x027e, B:78:0x0285, B:79:0x00ea, B:81:0x0286, B:82:0x028d, B:83:0x028e, B:84:0x0295), top: B:3:0x0026, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder r15, X.C63946P7u r16) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XFY.LIZJ(com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder, X.P7u):void");
    }

    public XFY(Application application, Gson gson, C44839Hil c44839Hil) {
        C65315PkF c65315PkF = C65315PkF.LIZ;
        this.LIZJ = new ReentrantLock();
        this.LIZIZ = c65315PkF;
        this.LIZLLL = gson;
        this.LJ = c44839Hil;
        this.LIZ = application;
        C60903NvH.LJIIJJI().getApplicationService().getClass();
    }

    public static XFY LIZ(Application application, Gson gson, C44839Hil c44839Hil) {
        if (LJFF == null) {
            synchronized (XFY.class) {
                if (LJFF == null) {
                    LJFF = new XFY(application, gson, c44839Hil);
                }
            }
        }
        return LJFF;
    }
}
