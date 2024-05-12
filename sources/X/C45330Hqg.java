package X;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hqg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45330Hqg implements InterfaceC43316GzI {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(HLM.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 588));
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 589));
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 587));
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C140285ey.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 590));
    public InterfaceC84498XEg LJI;

    @Override // X.InterfaceC43316GzI
    public final InterfaceC84498XEg LIZIZ() {
        InterfaceC84498XEg interfaceC84498XEg;
        synchronized (this) {
            interfaceC84498XEg = this.LJI;
            if (interfaceC84498XEg == null) {
                Application application = C60903NvH.LJ;
                o.LJIIIIZZ(application, "getApplication()");
                interfaceC84498XEg = C84488XDw.LIZ(application, null);
            }
            this.LJI = interfaceC84498XEg;
        }
        return interfaceC84498XEg;
    }

    @Override // X.InterfaceC43316GzI
    public final void LIZLLL() {
        InterfaceC84498XEg interfaceC84498XEg;
        synchronized (this) {
            interfaceC84498XEg = this.LJI;
            this.LJI = null;
        }
        if (interfaceC84498XEg != null) {
            interfaceC84498XEg.LJIL(LIZ().get());
        }
    }

    @Override // X.InterfaceC43316GzI
    public InterfaceC139745e6<String> LIZ() {
        return (InterfaceC139745e6) this.LJ.getValue();
    }

    @Override // X.InterfaceC43316GzI
    public final InterfaceC43318GzK LIZJ() {
        return (InterfaceC43318GzK) this.LIZ.getValue();
    }

    @Override // X.InterfaceC43316GzI
    public final InterfaceC41983Gdn LJ() {
        return (InterfaceC41983Gdn) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC43316GzI
    public final void LJFF() {
        if (TextUtils.equals(Build.BRAND, "Xiaomi") && !C1FP.LJIJ("android.content.res.MiuiResourcesImpl")) {
            C1FP.LJIJ("android.content.res.MiuiResources");
        }
    }

    @Override // X.InterfaceC43316GzI
    public final InterfaceC82236WPg LJI() {
        return (InterfaceC82236WPg) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC43316GzI
    public final InterfaceC78567UsV LJII() {
        return (InterfaceC78567UsV) this.LIZLLL.getValue();
    }
}
