package X;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.IRk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46620IRk extends W8S {
    public boolean LJLJI;
    public long LJLJJI;
    public IRZ LJLJJL;
    public final java.util.Map<Long, C46615IRf> LJLJJLL;
    public final java.util.Map<Long, IRZ> LJLJL;
    public final C46614IRe LJLJLJ;
    public C46613IRd LJLJLLL;
    public final C46621IRl LJLL;
    public C46622IRm LJLLI;
    public final java.util.Map<Long, Object> LJLLILLLL;
    public final java.util.Map<Long, Object> LJLLJ;
    public C46612IRc LJLLL;

    public final void LJI() {
        InterfaceC46610IRa LIZJ;
        long j;
        if (this.LJLJI) {
            long currentTimeMillis = System.currentTimeMillis();
            if (((C46625IRp) ((InterfaceC46627IRr) this.LJLILLLLZI)).LJ.LIZ) {
                C46613IRd c46613IRd = (C46613IRd) this.LJLJLJ.LIZJ();
                C46621IRl c46621IRl = this.LJLL;
                if (c46621IRl.LIZJ == null) {
                    LIZJ = null;
                } else {
                    if (c46621IRl.LIZLLL == null) {
                        c46621IRl.LIZLLL = new File((String) c46621IRl.LIZJ);
                    }
                    LIZJ = c46621IRl.LIZJ((File) c46621IRl.LIZLLL);
                    c46621IRl.LIZIZ = LIZJ;
                }
                C46622IRm c46622IRm = (C46622IRm) LIZJ;
                if (c46613IRd != null && c46622IRm != null) {
                    C46613IRd c46613IRd2 = this.LJLJLLL;
                    if (c46613IRd2 != null) {
                        long LIZ = c46613IRd.LIZ() - c46613IRd2.LIZ();
                        c46613IRd.LIZLLL = LIZ;
                        if (c46613IRd.LJ == 0) {
                            c46613IRd.LJ = LIZ;
                        }
                    }
                    ((C46625IRp) ((InterfaceC46627IRr) this.LJLILLLLZI)).LJ.getClass();
                    ((C46625IRp) ((InterfaceC46627IRr) this.LJLILLLLZI)).LJ.getClass();
                    long j2 = c46613IRd.LIZLLL;
                    long j3 = currentTimeMillis - this.LJLJJI;
                    C46622IRm c46622IRm2 = this.LJLLI;
                    long j4 = c46622IRm.LIZJ;
                    if (c46622IRm2 == null) {
                        j = 0;
                    } else {
                        j = c46622IRm2.LIZJ;
                    }
                    long j5 = j4 - j;
                    c46622IRm.LIZLLL = j5;
                    if (c46622IRm.LJ == 0) {
                        c46622IRm.LJ = j5;
                    }
                    if (j5 >= 0 && j2 > 0) {
                        c46622IRm.LJFF = j5 / j2;
                    }
                    if (j5 >= 0 && j3 > 0) {
                        c46622IRm.LJI = j5 / j3;
                    }
                    ((C46625IRp) ((InterfaceC46627IRr) this.LJLILLLLZI)).LJ.getClass();
                    this.LJLJLLL = c46613IRd;
                    this.LJLLI = c46622IRm;
                }
            }
            ((C46625IRp) ((InterfaceC46627IRr) this.LJLILLLLZI)).LJ.getClass();
            this.LJLJJI = currentTimeMillis;
        }
    }

    public C46620IRk(Context context, InterfaceC46627IRr interfaceC46627IRr) {
        super(context, interfaceC46627IRr);
        new C46615IRf();
        this.LJLJJL = new IRZ();
        this.LJLJJLL = new HashMap();
        this.LJLJL = new HashMap();
        this.LJLJLJ = new C46614IRe();
        this.LJLJLLL = new C46613IRd();
        this.LJLL = new C46621IRl();
        this.LJLLI = new C46622IRm();
        this.LJLLILLLL = new HashMap();
        this.LJLLJ = new HashMap();
        new ARW();
        this.LJLLL = new C46612IRc();
    }
}
