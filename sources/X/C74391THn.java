package X;

import Y.AfS51S0300000_12;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.THn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74391THn {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final C73318Sq2 LIZLLL;
    public final boolean LJ;
    public final InterfaceC74528TMu LJFF;
    public final TID LJI;

    public final boolean LIZ(Effect effect, InterfaceC74398THu interfaceC74398THu) {
        if (this.LIZ && this.LIZIZ) {
            interfaceC74398THu.onSuccess(effect);
            return true;
        }
        return false;
    }

    public final void LIZIZ(Effect effect, InterfaceC74398THu interfaceC74398THu) {
        if (C74287TDn.LIZ(this.LJFF, effect, this.LJ)) {
            this.LIZ = true;
        }
        if (LIZ(effect, interfaceC74398THu)) {
            return;
        }
        if (!this.LIZ) {
            InterfaceC74528TMu download = this.LJFF;
            TID tid = this.LJI;
            o.LJIIIZ(download, "$this$download");
            C78999UzT.LJFF(download.LIZIZ(new C74397THt(effect, false, tid), true).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS51S0300000_12(this, effect, interfaceC74398THu, 3), new AfS51S0300000_12(this, effect, interfaceC74398THu, 4)), this.LIZLLL);
        }
        if (!this.LIZIZ) {
            C78764Uvg.LJIILJJIL(C78963Uyt.LJIL(effect.getHintIcon()), new C74395THr(this, effect, interfaceC74398THu));
        }
    }

    public C74391THn(boolean z, InterfaceC74528TMu actualDownloader, TID tid) {
        o.LJIIIZ(actualDownloader, "actualDownloader");
        this.LJ = z;
        this.LJFF = actualDownloader;
        this.LJI = tid;
        this.LIZLLL = new C73318Sq2();
    }
}
