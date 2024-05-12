package aj2;

import X.AbstractC66805QJt;
import X.C77800Ug8;
import X.C77876UhM;
import X.C79146V4k;
import X.C81719W5j;
import X.InterfaceC86827Y5v;
import X.X1D;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.bpea.basics.Cert;
import rj2.a$a;

/* loaded from: classes15.dex */
public class d {
    public final Application LIZ;
    public String LIZIZ;
    public aj2.a LIZJ;
    public String LIZLLL;
    public AbstractC66805QJt LJ;
    public Cert LJFF;
    public Cert LJI;
    public Cert LJII;
    public c LJIIIIZZ;
    public b LJIIIZ;
    public InterfaceC86827Y5v LJIIJ;
    public a$a LJIIJJI;

    /* loaded from: classes15.dex */
    public static class a {
        public final Application LIZ;
        public String LIZIZ;
        public aj2.a LIZJ;
        public String LIZLLL;
        public AbstractC66805QJt LJ;
        public Cert LJFF;
        public Cert LJI;
        public Cert LJII;
        public c LJIIIIZZ;
        public b LJIIIZ;
        public InterfaceC86827Y5v LJIIJ;
        public a$a LJIIJJI;

        public final d LIZ() {
            if (TextUtils.isEmpty(this.LIZLLL)) {
                this.LIZLLL = "en";
            }
            if (this.LIZJ == null) {
                this.LIZJ = new C81719W5j();
            }
            if (this.LJIIIZ == null) {
                this.LJIIIZ = new C77876UhM();
            }
            if (this.LJ == null) {
                this.LJ = AbstractC66805QJt.LIZ;
            }
            return new d(this);
        }

        public a(Application application) {
            this.LIZ = application;
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{mContext=");
        LIZ.append(this.LIZ);
        LIZ.append(", mHost='");
        return C77800Ug8.LIZJ(LIZ, this.LIZIZ, '\'', '}', LIZ);
    }

    public d(a aVar) {
        this.LIZ = aVar.LIZ;
        String str = aVar.LIZIZ;
        this.LIZIZ = str;
        this.LIZJ = aVar.LIZJ;
        this.LIZLLL = aVar.LIZLLL;
        this.LJ = aVar.LJ;
        this.LJFF = aVar.LJFF;
        this.LJI = aVar.LJI;
        this.LJII = aVar.LJII;
        this.LJIIIIZZ = aVar.LJIIIIZZ;
        this.LJIIIZ = aVar.LJIIIZ;
        this.LJIIJ = aVar.LJIIJ;
        this.LJIIJJI = aVar.LJIIJJI;
        if (!TextUtils.isEmpty(str)) {
            C79146V4k.LJ = this.LIZIZ;
        }
    }

    public final void LIZ(d dVar) {
        if (TextUtils.isEmpty(this.LIZIZ) && !TextUtils.isEmpty(dVar.LIZIZ)) {
            this.LIZIZ = dVar.LIZIZ;
        }
        aj2.a aVar = dVar.LIZJ;
        if (aVar != null) {
            this.LIZJ = aVar;
        }
        if (!TextUtils.isEmpty(dVar.LIZLLL)) {
            this.LIZLLL = dVar.LIZLLL;
        }
        AbstractC66805QJt abstractC66805QJt = dVar.LJ;
        if (abstractC66805QJt != null) {
            this.LJ = abstractC66805QJt;
        }
        Cert cert = dVar.LJFF;
        if (cert != null) {
            this.LJFF = cert;
        }
        Cert cert2 = dVar.LJI;
        if (cert2 != null) {
            this.LJI = cert2;
        }
        Cert cert3 = dVar.LJII;
        if (cert3 != null) {
            this.LJII = cert3;
        }
        c cVar = dVar.LJIIIIZZ;
        if (cVar != null) {
            this.LJIIIIZZ = cVar;
        }
        b bVar = dVar.LJIIIZ;
        if (bVar != null) {
            this.LJIIIZ = bVar;
        }
        InterfaceC86827Y5v interfaceC86827Y5v = dVar.LJIIJ;
        if (interfaceC86827Y5v != null) {
            this.LJIIJ = interfaceC86827Y5v;
        }
        a$a a_a = dVar.LJIIJJI;
        if (a_a != null) {
            this.LJIIJJI = a_a;
        }
    }
}
