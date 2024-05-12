package X;

import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Iao, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46894Iao implements InterfaceC46895Iap {
    public final String LIZ;
    public final List<InterfaceC46895Iap> LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final C47052IdM LJI;

    @Override // X.InterfaceC46895Iap
    public final void LJIILLIIL() {
        this.LJ = false;
        this.LJFF = false;
        this.LIZLLL = null;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startVideo:");
        LIZ.append(this.LIZ);
        LIZ.append("----------------------------V");
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        IRadarTransmitter LJII = C46982IcE.LJII();
        if (LJII != null) {
            LJII.startVideo(this.LIZ);
        }
        Iterator<InterfaceC46895Iap> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIILLIIL();
        }
    }

    @Override // X.InterfaceC46895Iap
    public final void LJIJI() {
        this.LJ = false;
        this.LJFF = false;
        String msg = o.LJIILLIIL(this.LIZ, "enginePlay:");
        o.LJIIIZ(msg, "msg");
        Iterator<InterfaceC46895Iap> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIJI();
        }
    }

    @Override // X.InterfaceC46895Iap
    public final void LIZ() {
        String msg = o.LJIILLIIL(this.LIZ, "onRenderFirstFrame:");
        o.LJIIIZ(msg, "msg");
        Iterator<InterfaceC46895Iap> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    @Override // X.InterfaceC46895Iap
    public final void LJIIZILJ() {
        if (!this.LJ) {
            String msg = o.LJIILLIIL(this.LIZ, "enginePause:");
            o.LJIIIZ(msg, "msg");
            Iterator<InterfaceC46895Iap> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().LJIIZILJ();
            }
        }
        this.LJ = true;
    }

    @Override // X.InterfaceC46895Iap
    public final void LJIJ() {
        Iterator<InterfaceC46895Iap> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIJ();
        }
    }

    @Override // X.InterfaceC46895Iap
    public final void LJIJJ() {
        Iterator<InterfaceC46895Iap> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIJJ();
        }
    }

    @Override // X.InterfaceC46895Iap
    public final void LJIJJLI() {
        Iterator<InterfaceC46895Iap> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIJJLI();
        }
    }

    @Override // X.InterfaceC46895Iap
    public final void LJIL() {
        String msg = o.LJIILLIIL(this.LIZ, "playFinish:");
        o.LJIIIZ(msg, "msg");
        Iterator<InterfaceC46895Iap> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJIL();
        }
    }

    @Override // X.InterfaceC46895Iap
    public final void LJJ() {
        Iterator<InterfaceC46895Iap> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJJ();
        }
    }

    @Override // X.InterfaceC46895Iap
    public final void LJJI() {
        String str = this.LIZLLL;
        if (str != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("reportPlayEnd:");
            LIZ.append(this.LIZ);
            LIZ.append(',');
            LIZ.append(str);
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
        }
        Iterator it = ((ArrayList) this.LIZIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC46895Iap) it.next()).LJJI();
        }
    }

    @Override // X.InterfaceC46895Iap
    public final void LJJIFFI() {
        String msg = o.LJIILLIIL(this.LIZ, "engineRelease:");
        o.LJIIIZ(msg, "msg");
        Iterator<InterfaceC46895Iap> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LJJIFFI();
        }
    }

    @Override // X.InterfaceC46895Iap
    public final void LJJII() {
        if (!this.LJFF) {
            String msg = o.LJIILLIIL(this.LIZ, "engineStop:");
            o.LJIIIZ(msg, "msg");
            Iterator<InterfaceC46895Iap> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().LJJII();
            }
        }
        this.LJFF = true;
    }

    public C46894Iao(String sourceID) {
        o.LJIIIZ(sourceID, "sourceID");
        this.LIZ = sourceID;
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        this.LIZJ = -1;
        this.LJI = new C47052IdM();
        arrayList.add(new C47051IdL(this));
        arrayList.add(new C47050IdK(this));
        arrayList.add(new C47049IdJ(this));
    }
}
