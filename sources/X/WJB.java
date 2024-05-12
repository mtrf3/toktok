package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public abstract class WJB implements InterfaceC135635Tz {
    public final C73849Syb<C76800UCe> LJLIL = new C73849Syb<>();
    public View LJLILLLLZI;

    public void LIZ() {
    }

    public abstract WI1 LIZJ();

    public void LIZLLL() {
    }

    public abstract void LJFF();

    public void LJI(C1537261o registerEvent) {
        o.LJIIIZ(registerEvent, "registerEvent");
    }

    public void LJII(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
    }

    public boolean LJIIIIZZ() {
        return !(this instanceof C147525qe);
    }

    public final void LJ() {
        this.LJLIL.onNext(C76800UCe.LIZ);
    }

    public void LIZIZ(C82028WHg event) {
        o.LJIIIZ(event, "event");
        if (event.LJLIL == EnumC79548VJw.BIND_VIEW) {
            this.LJLILLLLZI = event.LJLJI;
        }
    }
}
