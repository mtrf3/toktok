package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JhN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49849JhN extends QZV {
    public C49847JhL LIZ;
    public final C49851JhP LIZIZ;
    public boolean LIZJ;
    public C49849JhN LIZLLL;
    public C49849JhN LJ;
    public boolean LJFF;
    public boolean LJI;
    public int LJII;
    public String LJIIIIZZ;
    public C49854JhS LJIIIZ;
    public final List<C49848JhM> LJIIJ;

    public final void LJIL() {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        this.LIZIZ.LIZ(this, this.LIZ);
    }

    public final C49849JhN LJJ() {
        C49849JhN c49849JhN = this.LIZLLL;
        if (c49849JhN != null) {
            return c49849JhN.LJJ();
        }
        return this;
    }

    public final C49849JhN LJIJJLI() {
        ArrayList arrayList;
        ArrayList arrayList2;
        LJIL();
        LJIL();
        C49849JhN c49849JhN = new C49849JhN(this.LIZ, this.LJIIIZ, this.LIZIZ, this.LIZJ);
        LJIL();
        String str = this.LJIIIIZZ;
        o.LJIIIZ(str, "<set-?>");
        c49849JhN.LJIIIIZZ = str;
        c49849JhN.LJFF = this.LJFF;
        c49849JhN.LJI = this.LJI;
        c49849JhN.LJIL();
        List<C49848JhM> list = c49849JhN.LJIIJ;
        C49848JhM c49848JhM = null;
        if ((list instanceof ArrayList) && (arrayList2 = (ArrayList) list) != null) {
            arrayList2.clear();
        }
        LJIL();
        Iterator it = ((ArrayList) this.LJIIJ).iterator();
        while (it.hasNext()) {
            C49848JhM c49848JhM2 = new C49848JhM(((C49848JhM) it.next()).LIZ, this.LIZ, c49849JhN);
            if (c49848JhM != null) {
                c49848JhM.LIZLLL = c49848JhM2;
                c49848JhM2.LJ = c49848JhM;
            }
            c49849JhN.LJIL();
            List<C49848JhM> list2 = c49849JhN.LJIIJ;
            if ((list2 instanceof ArrayList) && (arrayList = (ArrayList) list2) != null) {
                arrayList.add(c49848JhM2);
            }
            c49848JhM = c49848JhM2;
        }
        return c49849JhN;
    }

    @Override // X.QZV
    public final /* bridge */ /* synthetic */ QZV LJIILLIIL() {
        return this.LIZLLL;
    }

    public final void LJIJI(C49849JhN insert) {
        o.LJIIIZ(insert, "insert");
        insert.LIZLLL = null;
        insert.LJ = this;
        this.LIZLLL = insert;
    }

    public final C49849JhN LJIJJ(C49849JhN insert) {
        o.LJIIIZ(insert, "insert");
        C49849JhN LJIJJLI = insert.LJIJJLI();
        LJIJJLI.LJ = this.LJ;
        LJIJJLI.LIZLLL = this.LIZLLL;
        C49849JhN c49849JhN = this.LJ;
        if (c49849JhN != null) {
            c49849JhN.LIZLLL = LJIJJLI;
        }
        C49849JhN c49849JhN2 = this.LIZLLL;
        if (c49849JhN2 != null) {
            c49849JhN2.LJ = LJIJJLI;
        }
        return LJIJJLI;
    }

    public C49849JhN(C49847JhL streamRoot, C49854JhS defaultConfig, C49851JhP composer, boolean z) {
        o.LJIIIZ(streamRoot, "streamRoot");
        o.LJIIIZ(defaultConfig, "defaultConfig");
        o.LJIIIZ(composer, "composer");
        this.LIZ = streamRoot;
        this.LIZIZ = composer;
        this.LIZJ = z;
        this.LJII = -1;
        this.LJIIIIZZ = "";
        this.LJIIIZ = defaultConfig;
        this.LJIIJ = new ArrayList();
    }
}
