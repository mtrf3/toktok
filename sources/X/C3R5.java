package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import kotlin.jvm.internal.o;

/* renamed from: X.3R5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3R5 extends AbstractC84083Rs {
    public final C83753Ql LJLLLL;
    public final C83943Re<IMContact> LJLLLLLL;
    public C3RZ<IMContact> LJLZ;

    @Override // X.AbstractC82553Lv
    public final C3RZ LJ() {
        C3RZ<IMContact> c3rz = this.LJLZ;
        if (c3rz != null) {
            return c3rz;
        }
        C3RF c3rf = new C3RF();
        C83943Re provider = this.LJLLLLLL;
        o.LJIIIZ(provider, "provider");
        c3rf.LIZ.LIZIZ = provider;
        c3rf.LIZ.LIZLLL = new C3R6(this);
        c3rf.LIZ(this);
        C3RZ c3rz2 = c3rf.LIZ;
        this.LJLZ = c3rz2;
        o.LJI(c3rz2);
        return c3rz2;
    }

    public C3R5(C3R9 c3r9) {
        super(c3r9);
        String LIZLLL;
        if (c3r9.LIZIZ) {
            LIZLLL = C80853Fh.LIZIZ();
        } else {
            LIZLLL = C80853Fh.LIZLLL();
        }
        C82653Mf c82653Mf = new C82653Mf();
        C83753Ql c83753Ql = c82653Mf.LIZ;
        c83753Ql.LJIIIIZZ = LIZLLL;
        c83753Ql.LJIIIZ = false;
        c82653Mf.LIZJ(100);
        c82653Mf.LIZIZ().LIZJ = new C3R7(null);
        C83753Ql c83753Ql2 = c82653Mf.LIZ;
        this.LJLLLL = c83753Ql2;
        C83943Re<IMContact> c83943Re = new C83943Re<>();
        c83943Re.LIZ(this.LJLJL);
        c83943Re.LIZ(c83753Ql2);
        this.LJLLLLLL = c83943Re;
    }
}
