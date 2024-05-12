package X;

import android.app.Application;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import kotlin.jvm.internal.o;

/* renamed from: X.Wg1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82889Wg1 implements InterfaceC82904WgG {
    public Application LIZ;
    public Boolean LIZIZ;
    public InterfaceC82888Wg0 LIZJ;
    public Gson LIZLLL;
    public C6YE LJ;
    public I9H LJFF;
    public InterfaceC88472Yns<? super InterfaceC82904WgG, C76800UCe> LJI;

    @Override // X.InterfaceC82904WgG
    public final void LIZIZ() {
        this.LIZIZ = Boolean.FALSE;
    }

    @Override // X.InterfaceC82904WgG
    public final void LIZJ() {
        this.LJFF = I9M.LIZ;
    }

    public final void LJIIJ() {
        if (this.LJI != null) {
            synchronized (this) {
                InterfaceC88472Yns<? super InterfaceC82904WgG, C76800UCe> interfaceC88472Yns = this.LJI;
                if (interfaceC88472Yns != null) {
                    o.LJI(interfaceC88472Yns);
                    interfaceC88472Yns.invoke(this);
                }
                this.LJI = null;
            }
        }
    }

    @Override // X.InterfaceC82904WgG
    public final Gson LIZ() {
        LJIIJ();
        return this.LIZLLL;
    }

    @Override // X.InterfaceC82904WgG
    public final InterfaceC82888Wg0 LIZLLL() {
        LJIIJ();
        return this.LIZJ;
    }

    @Override // X.InterfaceC82904WgG
    public final Boolean LJI() {
        LJIIJ();
        return this.LIZIZ;
    }

    @Override // X.InterfaceC82904WgG
    public final C6YE LJIIIZ() {
        LJIIJ();
        return this.LJ;
    }

    @Override // X.InterfaceC82904WgG
    public final Application getAppContext() {
        LJIIJ();
        return this.LIZ;
    }

    @Override // X.InterfaceC82904WgG
    public final I9H getMonitor() {
        LJIIJ();
        return this.LJFF;
    }

    @Override // X.InterfaceC82904WgG
    public final void LJ(AwemeHostApplication awemeHostApplication) {
        this.LIZ = awemeHostApplication;
    }

    @Override // X.InterfaceC82904WgG
    public final void LJFF(WZL wzl) {
        this.LIZJ = wzl;
    }

    @Override // X.InterfaceC82904WgG
    public final void LJII(Gson gson) {
        o.LJIIIZ(gson, "gson");
        this.LIZLLL = gson;
    }

    @Override // X.InterfaceC82904WgG
    public final void LJIIIIZZ(C61859OPn c61859OPn) {
        this.LJ = c61859OPn;
    }
}
