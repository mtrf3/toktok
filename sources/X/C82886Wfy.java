package X;

import android.graphics.Typeface;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wfy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82886Wfy implements InterfaceC82885Wfx {
    public InterfaceC173646rg LIZ;
    public InterfaceC65784Pro<? extends Typeface> LIZIZ;
    public InterfaceC88472Yns<? super C82851WfP, C76800UCe> LIZJ;
    public InterfaceC88472Yns<? super InterfaceC82885Wfx, C76800UCe> LIZLLL;

    public final void LJI() {
        if (this.LIZLLL != null) {
            synchronized (this) {
                InterfaceC88472Yns<? super InterfaceC82885Wfx, C76800UCe> interfaceC88472Yns = this.LIZLLL;
                if (interfaceC88472Yns != null) {
                    o.LJI(interfaceC88472Yns);
                    interfaceC88472Yns.invoke(this);
                }
                this.LIZLLL = null;
            }
        }
    }

    @Override // X.InterfaceC82885Wfx
    public final InterfaceC65784Pro<Typeface> LIZIZ() {
        LJI();
        return this.LIZIZ;
    }

    @Override // X.InterfaceC82885Wfx
    public final InterfaceC88472Yns<C82851WfP, C76800UCe> LIZJ() {
        LJI();
        return this.LIZJ;
    }

    @Override // X.InterfaceC82885Wfx
    public final InterfaceC173646rg LIZLLL() {
        LJI();
        return this.LIZ;
    }

    @Override // X.InterfaceC82885Wfx
    public final void LIZ(AqS164S0100000_14 aqS164S0100000_14) {
        this.LIZIZ = aqS164S0100000_14;
    }

    @Override // X.InterfaceC82885Wfx
    public final void LJ(OFX ofx) {
        this.LIZ = ofx;
    }

    @Override // X.InterfaceC82885Wfx
    public final void LJFF(C82850WfO configure) {
        o.LJIIIZ(configure, "configure");
        this.LIZJ = configure;
    }
}
