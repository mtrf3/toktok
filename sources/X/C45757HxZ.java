package X;

import android.app.Application;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.aweme.services.IPreloadVESo;
import com.ss.android.ugc.aweme.services.PreloadVESoStatus;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import defpackage.e1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.HxZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45757HxZ implements IPreloadVESo {
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C45761Hxd.LJLIL);
    public volatile PreloadVESoStatus LIZ = PreloadVESoStatus.UNLOAD;
    public volatile long LIZIZ = -1;
    public final C44428Hc8 LIZJ = new C44428Hc8();
    public boolean LIZLLL;

    @Override // com.ss.android.ugc.aweme.services.IPreloadVESo
    public final void preLoadVESo() {
        synchronized (this) {
            if (this.LIZLLL) {
                return;
            }
            this.LIZLLL = true;
            this.LIZJ.LIZLLL();
            this.LIZ = PreloadVESoStatus.LOADING;
            if (e1.LIZ(31744, "open_camera_frame_optimize_pre_load_so", true, false)) {
                try {
                    TENativeLibsLoader.enableLoadOptLibrary(true);
                    XFW xfw = XFV.LJFF;
                    Application application = C44172HVg.LIZ;
                    o.LJIIIIZZ(application, "application");
                    xfw.LIZ(application).LIZ();
                    TENativeLibsLoader.loadBase();
                    FFL.LJIIIZ().getClass();
                    if (FFL.LJ(31744, "creative_tools_pre_load_model_so", true, false)) {
                        DownloadableModelSupport.loadSo();
                    }
                    C60903NvH.LJIIJJI().LJJII();
                } catch (Throwable unused) {
                }
            }
            this.LIZ = PreloadVESoStatus.LOADED;
            this.LIZJ.LJ();
            this.LIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
            this.LIZJ.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IPreloadVESo
    public final long getPreLoadVESoCostTime() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.IPreloadVESo
    public final PreloadVESoStatus getPreLoadVESoStatus() {
        return this.LIZ;
    }
}
