package X;

import com.bytedance.android.live.base.model.user.User;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CR5 {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public final List<CR8> LIZLLL = new ArrayList();
    public final List<CRP> LJ = new ArrayList();
    public final List<InterfaceC31335CRn> LJFF = new ArrayList();
    public boolean LJI;

    public final void LJIIJJI() {
        this.LJI = true;
        Iterator it = ((ArrayList) this.LJFF).iterator();
        while (it.hasNext()) {
            ((InterfaceC31335CRn) it.next()).onPause();
        }
    }

    public final void LJIIL() {
        this.LJI = false;
        Iterator it = ((ArrayList) this.LJFF).iterator();
        while (it.hasNext()) {
            ((InterfaceC31335CRn) it.next()).onResume();
        }
    }

    public final void LIZ(CR8 cr8) {
        ((ArrayList) this.LIZLLL).add(cr8);
        ((ArrayList) this.LJFF).add(cr8);
    }

    public final void LIZIZ(CRD model) {
        o.LJIIIZ(model, "model");
        if (this.LJI) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LIZLLL(model);
        }
    }

    public final void LIZJ(CRD model) {
        o.LJIIIZ(model, "model");
        if (this.LJI) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJIJI(model);
        }
    }

    public final void LIZLLL(CRD model) {
        o.LJIIIZ(model, "model");
        if (this.LJI) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJI(model);
        }
    }

    public final void LJ(CRD model) {
        o.LJIIIZ(model, "model");
        if (this.LJI) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJJIIZ(model);
        }
    }

    public final void LJFF(CRD crd) {
        if (this.LJI) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJJIII(crd);
        }
        this.LIZJ++;
    }

    public final void LJI(CRD model) {
        o.LJIIIZ(model, "model");
        if (this.LJI) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJIIZILJ(this.LIZ, model);
        }
        this.LIZ++;
    }

    public final void LJIIIZ(CRD crd) {
        if (this.LJI) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJJIIJZLJL(crd);
        }
    }

    public final void LJIILIIL(CRD model) {
        o.LJIIIZ(model, "model");
        if (this.LJI) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJJIIJ(model);
        }
    }

    public final void LJIIIIZZ(CRD model, boolean z) {
        o.LJIIIZ(model, "model");
        if (this.LJI) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJJIJ(model, z);
        }
    }

    public final void LJIIJ(InterfaceC31330CRi<? extends IMessage> interfaceC31330CRi, CR6 message) {
        o.LJIIIZ(message, "message");
        if (this.LJI) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJIIJ(interfaceC31330CRi, message);
        }
    }

    public final void LJII(CR6 message, AbstractC31313CQr<CR6> abstractC31313CQr, boolean z, User user, boolean z2) {
        o.LJIIIZ(message, "message");
        if (this.LJI) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((CR8) it.next()).LJJ(message, abstractC31313CQr, z, user, z2);
        }
    }
}
