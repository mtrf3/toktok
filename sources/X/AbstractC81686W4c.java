package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import o53.b;

/* renamed from: X.W4c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81686W4c<BUILDER extends b<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> {
    public static final C76798UCc LJIILIIL = new C76798UCc();
    public static final NullPointerException LJIILJJIL = new NullPointerException("No image request was specified!");
    public static final AtomicLong LJIILL = new AtomicLong();
    public final Context LIZ;
    public final java.util.Set<W4Z> LIZIZ;
    public Object LIZJ;
    public REQUEST LIZLLL;
    public REQUEST LJ;
    public REQUEST[] LJFF;
    public boolean LJI;
    public W4Z<? super INFO> LJII;
    public java.util.Set<W4Z> LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public InterfaceC81252Vui LJIIL;

    /* renamed from: X.W4c$c */
    /* loaded from: classes15.dex */
    public abstract class c<D> implements W4P<W4W<IMAGE>> {
        public abstract REQUEST LIZ();
    }

    public abstract AbstractC48384Iyq LIZIZ(InterfaceC81252Vui interfaceC81252Vui, Object obj, Object obj2, EnumC81709W4z enumC81709W4z);

    public final void LIZJ() {
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = true;
        this.LJII = null;
        this.LJIIIZ = false;
        this.LJIIJ = false;
        this.LJIIL = null;
    }

    public abstract W4O LIZLLL();

    public final W4R LIZ() {
        REQUEST request;
        REQUEST[] requestArr = this.LJFF;
        if (requestArr == null || this.LIZLLL == null) {
            if (this.LIZLLL == null && requestArr == null && (request = this.LJ) != null) {
                this.LIZLLL = request;
                this.LJ = null;
            }
            C81939WDv.LIZIZ();
            W4O LIZLLL = LIZLLL();
            LIZLLL.LJIILIIL = this.LJIIJJI;
            LIZLLL.LJIILJJIL = null;
            boolean z = this.LJIIIZ;
            if (z) {
                if (LIZLLL.LIZLLL == null) {
                    LIZLLL.LIZLLL = new C81693W4j();
                }
                LIZLLL.LIZLLL.LIZ = z;
                if (LIZLLL.LJ == null) {
                    C81685W4b c81685W4b = new C81685W4b(this.LIZ);
                    LIZLLL.LJ = c81685W4b;
                    c81685W4b.LIZ = LIZLLL;
                }
            }
            java.util.Set<W4Z> set = this.LIZIZ;
            if (set != null) {
                Iterator<W4Z> it = set.iterator();
                while (it.hasNext()) {
                    LIZLLL.LIZLLL(it.next());
                }
            }
            W4Z<? super INFO> w4z = this.LJII;
            if (w4z != null) {
                LIZLLL.LIZLLL(w4z);
            }
            java.util.Set<W4Z> set2 = this.LJIIIIZZ;
            if (set2 != null && set2.size() != 0) {
                Iterator<W4Z> it2 = this.LJIIIIZZ.iterator();
                while (it2.hasNext()) {
                    LIZLLL.LIZLLL(it2.next());
                }
            }
            W4Z<InterfaceC81599W0t> LJI = LIZLLL.LJI();
            if (LJI != null && (LJI instanceof W4V)) {
                ((W4V) LJI).LJII((W5O) this.LIZLLL, System.currentTimeMillis());
            }
            if (this.LJIIJ) {
                LIZLLL.LIZLLL(LJIILIIL);
            }
            C81939WDv.LIZIZ();
            return LIZLLL;
        }
        throw new IllegalStateException("Cannot specify both ImageRequest and FirstAvailableImageRequests!");
    }

    public AbstractC81686W4c(Context context, java.util.Set<W4Z> set) {
        this.LIZ = context;
        this.LIZIZ = set;
        LIZJ();
    }

    public final W4P LJ(W4O w4o, String str) {
        W4P c81687W4d;
        REQUEST request = this.LIZLLL;
        if (request != null) {
            c81687W4d = new C81689W4f(this, request, w4o, str, this.LIZJ, EnumC81709W4z.FULL_FETCH);
        } else {
            REQUEST[] requestArr = this.LJFF;
            if (requestArr != null) {
                boolean z = this.LJI;
                ArrayList arrayList = new ArrayList(requestArr.length * 2);
                if (z) {
                    for (REQUEST request2 : requestArr) {
                        arrayList.add(new C81689W4f(this, request2, w4o, str, this.LIZJ, EnumC81709W4z.BITMAP_MEMORY_CACHE));
                    }
                }
                for (REQUEST request3 : requestArr) {
                    arrayList.add(new C81689W4f(this, request3, w4o, str, this.LIZJ, EnumC81709W4z.FULL_FETCH));
                }
                c81687W4d = new C81687W4d(arrayList);
            } else {
                return new C81701W4r(LJIILJJIL);
            }
        }
        if (this.LJ != null) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(c81687W4d);
            arrayList2.add(new C81689W4f(this, this.LJ, w4o, str, this.LIZJ, EnumC81709W4z.FULL_FETCH));
            return new C81688W4e(arrayList2);
        }
        return c81687W4d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(boolean z, Object[] objArr) {
        boolean z2;
        if (objArr == 0 || objArr.length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32151Nz.LJFF("No requests specified!", z2);
        this.LJFF = objArr;
        this.LJI = z;
    }
}
