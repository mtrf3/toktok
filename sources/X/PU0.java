package X;

import Y.ARunnableS11S0301000_11;
import Y.ARunnableS14S0201000_11;
import Y.ARunnableS30S0200000_11;
import android.os.Handler;
import android.util.Pair;
import defpackage.i0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class PU0 implements InterfaceC64509PTl<String> {
    public static PU0 LJIIIIZZ;
    public final C32287Cln LIZIZ;
    public final List<InterfaceC64518PTu> LIZJ = new CopyOnWriteArrayList();
    public final Deque<C32420Cnw> LIZLLL = new ArrayDeque();
    public final java.util.Map<String, Pair<Boolean, Long>> LJ = new ConcurrentHashMap();
    public int LJI = 0;
    public int LJII = 0;
    public final java.util.Map<String, C7WD> LIZ = new HashMap();
    public final Handler LJFF = new Handler(C16880lQ.LLJJJJ());

    public static PU0 LJI() {
        PU0 pu0 = LJIIIIZZ;
        if (pu0 != null) {
            return pu0;
        }
        throw new IllegalStateException("GiftResourceManager is not initialized");
    }

    public final void LJIIIIZZ() {
        C32420Cnw c32420Cnw;
        if (this.LJI >= this.LIZIZ.LJ || ((ArrayDeque) this.LIZLLL).isEmpty() || (c32420Cnw = (C32420Cnw) ((ArrayDeque) this.LIZLLL).poll()) == null) {
            return;
        }
        if (c32420Cnw.LJIIIZ && LJII(c32420Cnw)) {
            String str = c32420Cnw.LIZ;
            String LJ = LJ(c32420Cnw);
            C7WD c7wd = (C7WD) ((HashMap) this.LIZ).get(str);
            if (c7wd != null) {
                Iterator it = ((CopyOnWriteArrayList) c7wd.LIZIZ).iterator();
                while (it.hasNext()) {
                    ((PU2) it.next()).LIZLLL(c32420Cnw.LIZIZ, LJ);
                }
            }
            ((HashMap) this.LIZ).remove(str);
            return;
        }
        C32287Cln c32287Cln = this.LIZIZ;
        int i = c32287Cln.LJFF;
        if (i > 0 && this.LJII >= i) {
            ((ArrayDeque) this.LIZLLL).iterator();
            while (((ArrayDeque) this.LIZLLL).peek() != null) {
                C32420Cnw c32420Cnw2 = (C32420Cnw) ((ArrayDeque) this.LIZLLL).poll();
                C7WD c7wd2 = (C7WD) ((HashMap) this.LIZ).get(c32420Cnw2.LIZ);
                if (c7wd2 != null) {
                    Iterator it2 = ((CopyOnWriteArrayList) c7wd2.LIZIZ).iterator();
                    while (it2.hasNext()) {
                        ((PU2) it2.next()).LIZ(c32420Cnw2.LIZIZ);
                    }
                    ((HashMap) this.LIZ).remove(c32420Cnw2.LIZ);
                }
            }
            this.LJII = 0;
            return;
        }
        this.LJI++;
        c32287Cln.LIZIZ.LIZIZ(c32420Cnw, c32287Cln).LIZLLL(c32420Cnw, this);
    }

    public PU0(C32287Cln c32287Cln) {
        this.LIZIZ = c32287Cln;
    }

    public final void LIZLLL(C32420Cnw c32420Cnw) {
        ((ConcurrentHashMap) this.LJ).put(c32420Cnw.LIZ, new Pair(Boolean.FALSE, Long.valueOf(System.currentTimeMillis())));
        String LIZIZ = this.LIZIZ.LIZ.LIZIZ(c32420Cnw);
        if (LIZIZ != null) {
            File file = new File(LIZIZ);
            if (file.exists()) {
                C78934UyQ.LJJI(file);
            }
        }
    }

    public final String LJ(C32420Cnw c32420Cnw) {
        String LJ = C78934UyQ.LJ(this.LIZIZ.LIZ.LIZIZ(c32420Cnw));
        if (!c32420Cnw.LJFF) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LJ);
                LIZ.append(C38355F3n.LIZ(c32420Cnw.LIZJ[0]));
                LJ = X1D.LIZIZ(LIZ);
                return LJ;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return LJ;
            }
        }
        return LJ;
    }

    public final boolean LJII(C32420Cnw c32420Cnw) {
        String str;
        if (c32420Cnw == null || (str = c32420Cnw.LIZ) == null) {
            return false;
        }
        Pair pair = (Pair) ((ConcurrentHashMap) this.LJ).get(str);
        if (pair != null && this.LIZIZ.LJI > 0 && System.currentTimeMillis() - ((Long) pair.second).longValue() < this.LIZIZ.LJI) {
            return ((Boolean) pair.first).booleanValue();
        }
        boolean exists = new File(i0.LJFF(C78934UyQ.LJ(this.LIZIZ.LIZ.LIZIZ(c32420Cnw)), ".fetched")).exists();
        ((ConcurrentHashMap) this.LJ).put(c32420Cnw.LIZ, new Pair(Boolean.valueOf(exists), Long.valueOf(System.currentTimeMillis())));
        return exists;
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZ(C32420Cnw c32420Cnw, int i) {
        this.LJFF.post(new ARunnableS14S0201000_11(i, this, c32420Cnw, 10));
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZIZ(C32420Cnw c32420Cnw, C32425Co1 c32425Co1) {
        this.LJFF.post(new ARunnableS11S0301000_11(1, this, c32420Cnw, c32425Co1, 2));
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZJ(C32420Cnw c32420Cnw, String str) {
        try {
            new File(i0.LJFF(C78934UyQ.LJ(this.LIZIZ.LIZ.LIZIZ(c32420Cnw)), ".fetched")).createNewFile();
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        }
        ((ConcurrentHashMap) this.LJ).put(c32420Cnw.LIZ, new Pair(Boolean.TRUE, Long.valueOf(System.currentTimeMillis())));
        this.LJFF.post(new ARunnableS30S0200000_11(c32420Cnw, this, 54));
    }

    public final String LJFF(C32420Cnw c32420Cnw, Boolean bool) {
        if (c32420Cnw == null) {
            return null;
        }
        if (LJII(c32420Cnw)) {
            return LJ(c32420Cnw);
        }
        if (bool.booleanValue()) {
            String str = c32420Cnw.LIZ;
            if (!((HashMap) this.LIZ).containsKey(str)) {
                ((HashMap) this.LIZ).put(str, new C7WD(c32420Cnw));
                c32420Cnw.LIZIZ();
                C32287Cln c32287Cln = this.LIZIZ;
                c32287Cln.LIZIZ.LIZIZ(c32420Cnw, c32287Cln).LIZLLL(c32420Cnw, this);
            }
        }
        return null;
    }
}
