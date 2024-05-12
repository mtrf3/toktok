package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PgZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65087PgZ implements InterfaceC790538j {
    public final String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final List<InterfaceC37216Ej6> LIZLLL;
    public List<AbstractC65022PfW> LJ;
    public final List<AbstractC65069PgH> LJFF;
    public InterfaceC55669Lt3 LJI;
    public Object LJII;
    public final C65103Pgp LJIIIIZZ;
    public int LJIIIZ;

    public final C65082PgU LJFF() {
        if (this.LJ == null) {
            this.LJ = RetrofitFactory.LIZIZ();
        }
        if (this.LJI != null) {
            List<AbstractC65022PfW> list = this.LJ;
            o.LJI(list);
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC65022PfW abstractC65022PfW = (AbstractC65022PfW) it.next();
                if (abstractC65022PfW instanceof C65179Pi3) {
                    ((C65179Pi3) abstractC65022PfW).LIZIZ = this.LJI;
                    break;
                }
            }
        }
        return new C65082PgU(this);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + (this.LIZIZ ? 1 : 0)) * 31) + (this.LIZJ ? 1 : 0);
    }

    public C65087PgZ(String baseUrl) {
        o.LJIIIZ(baseUrl, "baseUrl");
        this.LIZ = baseUrl;
        this.LIZLLL = new ArrayList();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C65100Pgm());
        arrayList.add(new C65214Pic());
        arrayList.add(new C65213Pib());
        arrayList.add(new C65148PhY(false));
        arrayList.add(new C65224Pim(0));
        this.LJFF = arrayList;
        this.LJIIIIZZ = new C65103Pgp();
    }

    public final C65087PgZ LIZ(AbstractC65022PfW abstractC65022PfW) {
        if (this.LJ == null) {
            this.LJ = RetrofitFactory.LIZIZ();
        }
        List<AbstractC65022PfW> list = this.LJ;
        if (list != null) {
            ListProtector.add(list, 0, abstractC65022PfW);
        }
        return this;
    }

    public final C65087PgZ LIZIZ(InterfaceC37216Ej6 interfaceC37216Ej6) {
        List<InterfaceC37216Ej6> list = this.LIZLLL;
        if (list != null) {
            ((ArrayList) list).add(interfaceC37216Ej6);
        }
        return this;
    }

    public final C65087PgZ LIZJ(List list) {
        List<InterfaceC37216Ej6> list2;
        if (list != null && (list2 = this.LIZLLL) != null) {
            ((ArrayList) list2).addAll(list);
        }
        return this;
    }

    public final C65087PgZ LIZLLL(InterfaceC65105Pgr interfaceC65105Pgr) {
        this.LJIIIIZZ.LIZ(interfaceC65105Pgr);
        return this;
    }

    public final C65087PgZ LJ(AbstractC65069PgH abstractC65069PgH) {
        ListProtector.add(this.LJFF, 0, abstractC65069PgH);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(C65087PgZ.class, obj.getClass())) {
            return false;
        }
        C65087PgZ c65087PgZ = (C65087PgZ) obj;
        if (this.LIZIZ == c65087PgZ.LIZIZ && this.LIZJ == c65087PgZ.LIZJ && o.LJ(this.LIZ, c65087PgZ.LIZ)) {
            return true;
        }
        return false;
    }
}
