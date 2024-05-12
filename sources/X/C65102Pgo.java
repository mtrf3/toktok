package X;

import Y.ARunnableS15S0400000_11;
import Y.ARunnableS30S0200000_11;
import Y.ARunnableS5S1200000_6;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pgo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65102Pgo implements InterfaceC37216Ej6 {
    public static final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C65106Pgs.LJLIL);
    public final List<InterfaceC64917Pdp> LJLIL;
    public final List<InterfaceC65108Pgu> LJLILLLLZI;
    public final List<InterfaceC64900PdY> LJLJI;
    public final List<InterfaceC64924Pdw> LJLJJI;
    public final List<InterfaceC65104Pgq> LJLJJL;

    public C65102Pgo(C65103Pgp c65103Pgp) {
        this.LJLIL = new ArrayList(c65103Pgp.LIZ);
        this.LJLILLLLZI = new ArrayList(c65103Pgp.LIZIZ);
        this.LJLJI = new ArrayList(c65103Pgp.LIZJ);
        this.LJLJJI = new ArrayList(c65103Pgp.LIZLLL);
        this.LJLJJL = new ArrayList(c65103Pgp.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        C64797Pbt<?> LIZ;
        Handler LIZ2;
        ARunnableS5S1200000_6 aRunnableS5S1200000_6;
        Object LIZ3;
        long uptimeMillis = SystemClock.uptimeMillis();
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        o.LJIIIIZZ(request, "chain.request()");
        C64907Pdf c64907Pdf = new C64907Pdf(request);
        C68322mC c68322mC = new C68322mC();
        String str = "";
        c68322mC.element = "";
        C37826Esw c37826Esw = new C37826Esw(f7s);
        C36341EOb c36341EOb = c37826Esw.LIZJ;
        int i = 0;
        do {
            try {
                C64797Pbt<?> LIZIZ = LIZIZ(c64907Pdf, c37826Esw);
                if (LIZIZ != null) {
                    LJFF(request, LIZIZ, null);
                    return LIZIZ;
                }
                C65107Pgt.LIZ().post(new ARunnableS30S0200000_11(request, this, 68));
                request = LIZLLL(c64907Pdf, c37826Esw);
                LIZ = LIZ(c64907Pdf, c37826Esw);
                if (LIZ != null) {
                    LJFF(request, LIZ, null);
                    String path = request.getPath();
                    c36341EOb.LIZIZ = SystemClock.uptimeMillis() - uptimeMillis;
                    LIZ2 = C65107Pgt.LIZ();
                    aRunnableS5S1200000_6 = new ARunnableS5S1200000_6(c36341EOb, path, c68322mC, 12);
                    break;
                }
                C65107Pgt.LIZ().post(new ARunnableS30S0200000_11(request, this, 69));
                long uptimeMillis2 = SystemClock.uptimeMillis();
                try {
                    LIZ3 = ((F7S) fbz).LIZ(request);
                    C3C5.m7constructorimpl(LIZ3);
                } catch (Throwable th) {
                    LIZ3 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ3);
                }
                c36341EOb.LIZ = SystemClock.uptimeMillis() - uptimeMillis2;
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ3);
                if (m10exceptionOrNullimpl == null) {
                    break;
                }
                C65107Pgt.LIZ().post(new ARunnableS30S0200000_11(m10exceptionOrNullimpl, this, 67));
                c64907Pdf = new C64907Pdf(request);
                if (LIZJ(c64907Pdf, c37826Esw, m10exceptionOrNullimpl, i)) {
                    i++;
                } else {
                    LJFF(request, null, m10exceptionOrNullimpl);
                    throw m10exceptionOrNullimpl;
                }
            } finally {
                String path2 = request.getPath();
                c36341EOb.LIZIZ = SystemClock.uptimeMillis() - uptimeMillis;
                C65107Pgt.LIZ().post(new ARunnableS5S1200000_6(c36341EOb, path2, c68322mC, 12));
            }
        } while (i < 10);
        C141335gf.LIZJ(LIZ3);
        C64797Pbt c64797Pbt = (C64797Pbt) LIZ3;
        C65107Pgt.LIZ().post(new ARunnableS30S0200000_11(c64797Pbt, this, 70));
        C64901PdZ<?> c64901PdZ = new C64901PdZ<>(c64797Pbt);
        String LJI = c64901PdZ.LIZLLL.LJI("x-tt-logid");
        T t = str;
        if (LJI != null) {
            t = LJI;
        }
        c68322mC.element = t;
        LIZ = LJ(c64901PdZ, c37826Esw);
        LJFF(request, LIZ, null);
        String path3 = request.getPath();
        c36341EOb.LIZIZ = SystemClock.uptimeMillis() - uptimeMillis;
        LIZ2 = C65107Pgt.LIZ();
        aRunnableS5S1200000_6 = new ARunnableS5S1200000_6(c36341EOb, path3, c68322mC, 12);
        LIZ2.post(aRunnableS5S1200000_6);
        return LIZ;
    }

    public final C64797Pbt<?> LIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        C36341EOb c36341EOb = c37826Esw.LIZJ;
        try {
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            while (it.hasNext()) {
                InterfaceC64917Pdp interfaceC64917Pdp = (InterfaceC64917Pdp) it.next();
                long uptimeMillis = SystemClock.uptimeMillis();
                interfaceC64917Pdp.LIZLLL(c64907Pdf, c37826Esw);
                String name = interfaceC64917Pdp.LJ();
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                c36341EOb.getClass();
                o.LJIIIZ(name, "name");
                HashMap<String, Long> hashMap = c36341EOb.LJFF;
                hashMap.put(name, Long.valueOf(C36341EOb.LIZ(uptimeMillis2, hashMap.get(name))));
            }
            return null;
        } catch (Throwable th) {
            Object LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl == null) {
                return (C64797Pbt) LIZ;
            }
            C65107Pgt.LIZ().post(new ARunnableS30S0200000_11(m10exceptionOrNullimpl, this, 67));
            throw m10exceptionOrNullimpl;
        }
    }

    public final C64797Pbt<?> LIZIZ(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        C36341EOb c36341EOb = c37826Esw.LIZJ;
        try {
            Iterator it = ((ArrayList) this.LJLIL).iterator();
            while (it.hasNext()) {
                InterfaceC64917Pdp interfaceC64917Pdp = (InterfaceC64917Pdp) it.next();
                long uptimeMillis = SystemClock.uptimeMillis();
                C64797Pbt<?> LIZIZ = interfaceC64917Pdp.LIZIZ(c64907Pdf, c37826Esw);
                String name = interfaceC64917Pdp.LJ();
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                c36341EOb.getClass();
                o.LJIIIZ(name, "name");
                HashMap<String, Long> hashMap = c36341EOb.LJFF;
                hashMap.put(name, Long.valueOf(C36341EOb.LIZ(uptimeMillis2, hashMap.get(name))));
                if (LIZIZ != null) {
                    return LIZIZ;
                }
            }
            return null;
        } catch (Throwable th) {
            Object LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl == null) {
                return (C64797Pbt) LIZ;
            }
            C65107Pgt.LIZ().post(new ARunnableS30S0200000_11(m10exceptionOrNullimpl, this, 67));
            throw m10exceptionOrNullimpl;
        }
    }

    public final Request LIZLLL(C64907Pdf c64907Pdf, C37826Esw c37826Esw) {
        C36341EOb c36341EOb = c37826Esw.LIZJ;
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            InterfaceC65108Pgu interfaceC65108Pgu = (InterfaceC65108Pgu) it.next();
            long uptimeMillis = SystemClock.uptimeMillis();
            interfaceC65108Pgu.LJIIIZ(c64907Pdf, c37826Esw);
            String name = interfaceC65108Pgu.LJ();
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            c36341EOb.getClass();
            o.LJIIIZ(name, "name");
            HashMap<String, Long> hashMap = c36341EOb.LIZJ;
            hashMap.put(name, Long.valueOf(C36341EOb.LIZ(uptimeMillis2, hashMap.get(name))));
        }
        return c64907Pdf.LIZ();
    }

    public final C64797Pbt<?> LJ(C64901PdZ<?> c64901PdZ, C37826Esw c37826Esw) {
        C36341EOb c36341EOb = c37826Esw.LIZJ;
        Iterator it = ((ArrayList) this.LJLJI).iterator();
        while (it.hasNext()) {
            InterfaceC64900PdY interfaceC64900PdY = (InterfaceC64900PdY) it.next();
            long uptimeMillis = SystemClock.uptimeMillis();
            interfaceC64900PdY.LIZ(c64901PdZ, c37826Esw);
            String name = interfaceC64900PdY.LJ();
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            c36341EOb.getClass();
            o.LJIIIZ(name, "name");
            HashMap<String, Long> hashMap = c36341EOb.LIZLLL;
            hashMap.put(name, Long.valueOf(C36341EOb.LIZ(uptimeMillis2, hashMap.get(name))));
        }
        return c64901PdZ.LIZ();
    }

    public final void LJFF(Request request, C64797Pbt<?> c64797Pbt, Throwable th) {
        C65107Pgt.LIZ().post(new ARunnableS15S0400000_11(th, this, request, c64797Pbt, 6));
    }

    public final boolean LIZJ(C64907Pdf c64907Pdf, C37826Esw c37826Esw, Throwable th, int i) {
        C36341EOb c36341EOb = c37826Esw.LIZJ;
        Iterator it = ((ArrayList) this.LJLJJI).iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC64924Pdw interfaceC64924Pdw = (InterfaceC64924Pdw) it.next();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (z || interfaceC64924Pdw.LJI(c64907Pdf, c37826Esw, th, i, z)) {
                z = true;
            } else {
                z = false;
            }
            String name = interfaceC64924Pdw.LJ();
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            c36341EOb.getClass();
            o.LJIIIZ(name, "name");
            HashMap<String, Long> hashMap = c36341EOb.LJ;
            hashMap.put(name, Long.valueOf(C36341EOb.LIZ(uptimeMillis2, hashMap.get(name))));
        }
        return z;
    }
}
