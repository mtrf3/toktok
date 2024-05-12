package X;

import com.lynx.jsbridge.LynxModule;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NpQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60540NpQ {
    public static Float LJIL;
    public final AbstractC40526FvO LIZ;
    public final C58667N0t LIZIZ;
    public final List<C39523FfD> LIZJ;
    public C60682Nri LIZLLL;
    public boolean LJ;
    public final Float LJFF;
    public InterfaceC61096NyO LJI;
    public String LJIILL;
    public int LJIIZILJ;
    public int LJIJ;
    public final java.util.Map<String, AbstractC61008Nwy> LJII = new HashMap();
    public boolean LJIIIIZZ = true;
    public final boolean LJIIIZ = LynxEnv.LJIIIZ().LJIIIZ;
    public boolean LJIIJ = false;
    public final boolean LJIIJJI = true;
    public boolean LJIIL = false;
    public boolean LJIILIIL = true;
    public boolean LJIILJJIL = false;
    public EnumC59959Ng3 LJIILLIIL = EnumC59959Ng3.ALL_ON_UI;
    public int LJIJI = -1;
    public int LJIJJ = -1;
    public float LJIJJLI = 1.0f;

    public C60540NpQ() {
        LynxEnv.LJIIIZ().LJIIL();
        this.LIZIZ = new C58667N0t(LynxEnv.LJIIIZ().LIZJ());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new LynxViewBuilder  ");
        LIZ.append(this);
        LIZ.append(", LynxEnv behaviors count:");
        LIZ.append(((ArrayList) LynxEnv.LJIIIZ().LIZJ()).size());
        LLog.LIZLLL(2, "LynxViewBuilder", X1D.LIZIZ(LIZ));
        this.LIZ = LynxEnv.LJIIIZ().LIZIZ;
        this.LIZJ = new ArrayList();
        this.LJFF = null;
        Float f = LJIL;
        if (f != null) {
            this.LJFF = f;
        }
    }

    public final void LIZ(List list) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LynxViewBuilder  ");
        LIZ.append(this);
        LIZ.append(", addBehaviors count:");
        LIZ.append(list.size());
        LLog.LIZLLL(2, "LynxViewBuilder", X1D.LIZIZ(LIZ));
        C58667N0t c58667N0t = this.LIZIZ;
        c58667N0t.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c58667N0t.LIZ((C40197Fq5) it.next());
        }
    }

    public final void LIZIZ(String str, Class<? extends LynxModule> cls, Object obj) {
        C39523FfD c39523FfD = new C39523FfD();
        c39523FfD.LIZIZ = cls;
        c39523FfD.LIZJ = obj;
        c39523FfD.LIZ = str;
        this.LIZJ.add(c39523FfD);
    }
}
