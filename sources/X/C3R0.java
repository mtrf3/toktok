package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.3R0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3R0 extends AbstractC82553Lv {
    public final int LJLLI;
    public final List<String> LJLLILLLL;
    public final java.util.Set<String> LJLLJ;
    public final List<IMContact> LJLLL;
    public final boolean LJLLLL;
    public final boolean LJLLLLLL;
    public final AtomicBoolean LJLZ;
    public final C62822Ol8 LJZ;
    public final C83943Re<IMContact> LJZI;
    public C3RZ<IMContact> LJZL;

    @Override // X.AbstractC82553Lv
    public final C3LJ LIZ() {
        C3R9 parameters = this.LJLIL;
        o.LJIIIZ(parameters, "parameters");
        return new C3LJ(parameters);
    }

    @Override // X.AbstractC82553Lv
    public final C3RZ LJ() {
        C3RZ<IMContact> c3rz = this.LJZL;
        if (c3rz != null) {
            return c3rz;
        }
        C3RF c3rf = new C3RF();
        C83943Re provider = this.LJZI;
        o.LJIIIZ(provider, "provider");
        c3rf.LIZ.LIZIZ = provider;
        c3rf.LIZ.LIZJ = new C3P2(this);
        c3rf.LIZ.LIZLLL = new C3R1(this);
        c3rf.LIZ.LJ = new C83673Qd(this);
        c3rf.LIZ(this);
        C3RZ c3rz2 = c3rf.LIZ;
        this.LJZL = c3rz2;
        o.LJI(c3rz2);
        return c3rz2;
    }

    public final boolean LJIIIZ() {
        if ((this.LJLLLL || this.LJLLLLLL) && ((C3UE.LIZ() || C83693Qf.LIZ) && (o.LJ(this.LJLIL.LIZLLL, "aweme") || o.LJ(this.LJLIL.LIZLLL, "aweme_photo")))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC67352kd<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C3RD
            if (r0 == 0) goto L3b
            r4 = r6
            X.3RD r4 = (X.C3RD) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L44
            X.C141335gf.LIZJ(r3)
        L20:
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            if (r0 <= 0) goto L41
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L2b:
            X.C141335gf.LIZJ(r3)
            X.3Fk r0 = X.C80853Fh.LJ()
            r4.LJLJI = r1
            java.lang.Object r3 = r0.LJIILIIL(r4)
            if (r3 != r2) goto L20
            return r2
        L3b:
            X.3RD r4 = new X.3RD
            r4.<init>(r5, r6)
            goto L12
        L41:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3R0.LJIIIIZZ(X.2kd):java.lang.Object");
    }

    @Override // X.AbstractC82553Lv, X.InterfaceC82613Mb
    public final void Y8(Throwable th) {
        C34B.LIZLLL("SharePanelRelationModel", "onLoadError", th);
        super.Y8(th);
    }

    public C3R0(C3R9 c3r9, int i) {
        super(c3r9);
        boolean z;
        boolean z2;
        this.LJLLI = i;
        this.LJLLILLLL = new ArrayList();
        this.LJLLJ = new LinkedHashSet();
        this.LJLLL = new ArrayList();
        int i2 = c3r9.LIZ;
        boolean z3 = true;
        if (i2 == 1 && c3r9.LJIIJJI == EnumC84123Rw.NORMAL) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLLL = z;
        if (i2 == 1 && c3r9.LJIIJJI == EnumC84123Rw.LONG_PRESS) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLLLLLL = z2;
        this.LJLZ = new AtomicBoolean(false);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C82753Mp.LJLIL);
        this.LJZ = LIZIZ;
        C83943Re<IMContact> c83943Re = new C83943Re<>();
        if (C3UE.LIZ()) {
            c83943Re.LIZ(this.LJLJL);
            c83943Re.LIZ(this.LJLJLJ);
            if (LJIIIZ()) {
                c83943Re.LIZ((AbstractC113374cf) LIZIZ.getValue());
            }
        } else {
            int LIZ = C83693Qf.LIZ();
            if (LIZ != 2 && LIZ != 3) {
                z3 = false;
            }
            if (z3) {
                c83943Re.LIZ(this.LJLJL);
                c83943Re.LIZ(this.LJLJLJ);
                if (LJIIIZ()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("enter share panel maf experiment ");
                    LIZ2.append(C83693Qf.LIZ());
                    C34B.LJI("SharePanelRelationModel", X1D.LIZIZ(LIZ2));
                    c83943Re.LIZ((AbstractC113374cf) LIZIZ.getValue());
                }
            } else {
                c83943Re.LIZ(this.LJLJL);
                c83943Re.LIZ(this.LJLJLJ);
                c83943Re.LIZ(this.LJLJLLL);
                if (LJIIIZ()) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("enter share panel maf experiment ");
                    LIZ3.append(C83693Qf.LIZ());
                    C34B.LJI("SharePanelRelationModel", X1D.LIZIZ(LIZ3));
                    c83943Re.LIZ((AbstractC113374cf) LIZIZ.getValue());
                }
            }
        }
        this.LJZI = c83943Re;
    }

    @Override // X.AbstractC82553Lv, X.InterfaceC82613Mb
    public final void zr0(List<IMContact> list, boolean z) {
        o.LJIIIZ(list, "list");
        if (C3UE.LIZ() && this.LJLIL.LJIILLIIL) {
            ArrayList arrayList = new ArrayList();
            for (IMContact iMContact : list) {
                if (iMContact instanceof MAFIMUser) {
                    arrayList.add(iMContact);
                }
            }
            ((ArrayList) this.LJLLL).clear();
            if (!arrayList.isEmpty() && list.size() >= C80893Fl.LIZ()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ArrayList) this.LJLLL).add(it.next());
                    if (((ArrayList) this.LJLLL).size() >= 2) {
                        break;
                    }
                }
            }
            C34B.LJI("SharePanelRelationModel", "onLoadSuccess mafList count: " + ((ArrayList) this.LJLLL).size());
        }
        ArrayList arrayList2 = new ArrayList();
        for (IMContact iMContact2 : list) {
            IMContact iMContact3 = iMContact2;
            if (!(iMContact3 instanceof IMUser) || !C83873Qx.LIZ(((IMUser) iMContact3).getInternalShareHoldoutVersion(), this.LJLIL.LJIIZILJ)) {
                arrayList2.add(iMContact2);
            }
        }
        List<IMContact> LLJILJILJ = ORZ.LLJILJILJ(arrayList2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadSuccess filtered List size before limit: ");
        ArrayList arrayList3 = (ArrayList) LLJILJILJ;
        LIZ.append(arrayList3.size());
        LIZ.append(" hasMore: ");
        LIZ.append(z);
        C34B.LJI("SharePanelRelationModel", X1D.LIZIZ(LIZ));
        int size = arrayList3.size();
        int i = this.LJLLI;
        if (size > i) {
            LLJILJILJ = arrayList3.subList(0, i);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onLoadSuccess limit list size: ");
        LIZ2.append(LLJILJILJ.size());
        LIZ2.append(" hasMore: ");
        LIZ2.append(z);
        C34B.LJI("SharePanelRelationModel", X1D.LIZIZ(LIZ2));
        super.zr0(LLJILJILJ, false);
    }
}
