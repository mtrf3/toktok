package X;

import android.app.Application;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XFV {
    public static final XFW LJFF = new XFW();
    public static volatile XFV LJI;
    public final Application LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;

    public final void LIZ() {
        if (!this.LIZIZ) {
            TENativeLibsLoader.setLibraryLoad((InterfaceC38927FPn) this.LIZLLL.getValue());
            com.bytedance.ies.nleeditor.NLE.INSTANCE.setLibraryLoader(new XFX((InterfaceC38927FPn) this.LIZLLL.getValue()));
            DownloadableModelSupport.setLibraryLoader((DownloadableModelSupportLibraryLoader) this.LJ.getValue());
            this.LIZIZ = true;
        }
    }

    public XFV(Application application) {
        o.LJIIIZ(application, "application");
        this.LIZ = application;
        this.LIZJ = true;
        this.LIZLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 759));
        this.LJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 758));
    }
}
