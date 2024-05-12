package X;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EkN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37295EkN implements InterfaceC37286EkE {
    @Override // X.InterfaceC37286EkE
    public final File LIZLLL() {
        return null;
    }

    public abstract List<File> LJI();

    public abstract EnumC37294EkM LJII();

    public abstract C61878OQg LJIIIIZZ();

    public abstract List<File> LJIIIZ();

    public abstract List<File> LJIIJ();

    @Override // X.InterfaceC37286EkE
    public final boolean LIZ() {
        if (LJFF(LJI()) >= 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37286EkE
    public final long LIZIZ() {
        List<File> LJIIIZ = LJIIIZ();
        Iterator it = LJIIIIZZ().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += C69172nZ.LIZ((File) it.next(), LJIIIZ, false);
        }
        return j;
    }

    @Override // X.InterfaceC37286EkE
    public final boolean LIZJ() {
        if (LJFF(LJI()) + LJFF(LJIIIIZZ()) >= 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37286EkE
    public final String LJ() {
        return LJII().getModule();
    }

    public final long LJFF(List<? extends File> list) {
        List<File> LJIIIZ = LJIIIZ();
        Iterator<? extends File> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += C69172nZ.LIZ(it.next(), LJIIIZ, true);
        }
        return j;
    }
}
