package X;

import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import Y.ARunnableS7S0101000_3;
import android.os.Handler;
import defpackage.i0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PU1 implements InterfaceC64509PTl<String> {
    public static int LJFF;
    public static int LJI;
    public static C32287Cln LJII;
    public static final PU1 LIZ = new PU1();
    public static final List<InterfaceC64518PTu> LIZJ = new ArrayList();
    public static final Deque<C32420Cnw> LIZLLL = new ArrayDeque();
    public static final java.util.Map<String, C7WD> LIZIZ = new HashMap();
    public static final Handler LJ = new Handler(C16880lQ.LLJJJJ());

    public static void LIZLLL() {
        C32287Cln c32287Cln = LJII;
        if (c32287Cln != null) {
            if (c32287Cln.LIZ != null) {
                if (c32287Cln.LIZIZ != null) {
                    return;
                } else {
                    throw new IllegalStateException("Producer Factory has to be initialized");
                }
            }
            throw new IllegalStateException("File Cache Factory has to be initialized");
        }
        throw new IllegalStateException("Gift Resource config has to be initialized");
    }

    public final void LJFF() {
        int i;
        InterfaceC64510PTm interfaceC64510PTm;
        InterfaceC64517PTt interfaceC64517PTt;
        int i2;
        int i3 = LJFF;
        C32287Cln c32287Cln = LJII;
        if (c32287Cln != null) {
            i = c32287Cln.LJ;
        } else {
            i = 0;
        }
        if (i3 < i) {
            ArrayDeque arrayDeque = (ArrayDeque) LIZLLL;
            if (arrayDeque.isEmpty()) {
                return;
            }
            int i4 = LJI;
            C32287Cln c32287Cln2 = LJII;
            if (c32287Cln2 != null && 1 <= (i2 = c32287Cln2.LJFF) && i2 <= i4) {
                arrayDeque.iterator();
                while (true) {
                    ArrayDeque arrayDeque2 = (ArrayDeque) LIZLLL;
                    if (arrayDeque2.peek() != null) {
                        C32420Cnw c32420Cnw = (C32420Cnw) arrayDeque2.poll();
                        java.util.Map<String, C7WD> map = LIZIZ;
                        o.LJI(c32420Cnw);
                        C7WD c7wd = (C7WD) ((HashMap) map).get(c32420Cnw.LIZ);
                        if (c7wd != null) {
                            Iterator it = ((CopyOnWriteArrayList) c7wd.LIZIZ).iterator();
                            while (it.hasNext()) {
                                ((PU2) it.next()).LIZ(c32420Cnw.LIZIZ);
                            }
                            ((HashMap) LIZIZ).remove(c32420Cnw.LIZ);
                        }
                    } else {
                        LJI = 0;
                        return;
                    }
                }
            } else {
                LJFF++;
                C32420Cnw c32420Cnw2 = (C32420Cnw) arrayDeque.poll();
                C32287Cln c32287Cln3 = LJII;
                if (c32287Cln3 != null && (interfaceC64517PTt = c32287Cln3.LIZIZ) != null) {
                    interfaceC64510PTm = interfaceC64517PTt.LIZIZ(c32420Cnw2, c32287Cln3);
                } else {
                    interfaceC64510PTm = null;
                }
                o.LJII(interfaceC64510PTm, "null cannot be cast to non-null type com.ss.ugc.live.gift.resource.producer.Producer<kotlin.String>");
                interfaceC64510PTm.LIZLLL(c32420Cnw2, this);
            }
        }
    }

    public static final String LJ(C32420Cnw c32420Cnw) {
        String str;
        InterfaceC32418Cnu interfaceC32418Cnu;
        C32287Cln c32287Cln = LJII;
        if (c32287Cln != null && (interfaceC32418Cnu = c32287Cln.LIZ) != null) {
            str = interfaceC32418Cnu.LIZIZ(c32420Cnw);
        } else {
            str = null;
        }
        String LJ2 = C78934UyQ.LJ(str);
        if (!c32420Cnw.LJFF) {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LJ2);
                LIZ2.append(C38355F3n.LIZ(c32420Cnw.LIZJ[0]));
                LJ2 = X1D.LIZIZ(LIZ2);
                return LJ2;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return LJ2;
            }
        }
        return LJ2;
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZ(C32420Cnw request, int i) {
        o.LJIIIZ(request, "request");
        LJ.post(new ARunnableS7S0101000_3(i, request, 18));
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZIZ(C32420Cnw request, C32425Co1 c32425Co1) {
        o.LJIIIZ(request, "request");
        LJ.post(new ARunnableS30S0200000_11(c32425Co1, request, 76));
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZJ(C32420Cnw request, String str) {
        String str2;
        InterfaceC32418Cnu interfaceC32418Cnu;
        o.LJIIIZ(request, "request");
        LIZLLL();
        C32287Cln c32287Cln = LJII;
        if (c32287Cln != null && (interfaceC32418Cnu = c32287Cln.LIZ) != null) {
            str2 = interfaceC32418Cnu.LIZIZ(request);
        } else {
            str2 = null;
        }
        try {
            new File(i0.LJFF(C78934UyQ.LJ(str2), ".fetched")).createNewFile();
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        }
        LJ.post(new ARunnableS47S0100000_11(request, 158));
    }
}
