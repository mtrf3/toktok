package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.P1c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63772P1c implements C33Q {
    public final AbstractC72932td<List<InterfaceC57784Mm4>> LJLIL;
    public final AbstractC72932td<List<InterfaceC57784Mm4>> LJLILLLLZI;
    public final AbstractC72932td<C9U5> LJLJI;
    public final OSZ<List<String>, List<Integer>> LJLJJI;

    public C63772P1c() {
        this(0);
    }

    public static C63772P1c LIZ(AbstractC72932td registerListData, AbstractC72932td unregisterListData, AbstractC72932td contactModel, OSZ osz) {
        o.LJIIIZ(registerListData, "registerListData");
        o.LJIIIZ(unregisterListData, "unregisterListData");
        o.LJIIIZ(contactModel, "contactModel");
        return new C63772P1c(registerListData, unregisterListData, contactModel, osz);
    }

    public static /* synthetic */ C63772P1c LIZIZ(C63772P1c c63772P1c, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, AbstractC72932td abstractC72932td3, int i) {
        if ((i & 1) != 0) {
            abstractC72932td = c63772P1c.LJLIL;
        }
        if ((i & 2) != 0) {
            abstractC72932td2 = c63772P1c.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            abstractC72932td3 = c63772P1c.LJLJI;
        }
        OSZ<List<String>, List<Integer>> osz = (i & 8) != 0 ? c63772P1c.LJLJJI : null;
        c63772P1c.getClass();
        return LIZ(abstractC72932td, abstractC72932td2, abstractC72932td3, osz);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63772P1c)) {
            return false;
        }
        C63772P1c c63772P1c = (C63772P1c) obj;
        return o.LJ(this.LJLIL, c63772P1c.LJLIL) && o.LJ(this.LJLILLLLZI, c63772P1c.LJLILLLLZI) && o.LJ(this.LJLJI, c63772P1c.LJLJI) && o.LJ(this.LJLJJI, c63772P1c.LJLJJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContactMaFWidgetVMState(registerListData=");
        LIZ.append(this.LJLIL);
        LIZ.append(", unregisterListData=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", contactModel=");
        LIZ.append(this.LJLJI);
        LIZ.append(", indexViewData=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZ = C03090Af.LIZ(this.LJLJI, C03090Af.LIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31);
        OSZ<List<String>, List<Integer>> osz = this.LJLJJI;
        if (osz == null) {
            hashCode = 0;
        } else {
            hashCode = osz.hashCode();
        }
        return LIZ + hashCode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C63772P1c(int r3) {
        /*
            r2 = this;
            X.33X r1 = X.C33X.LIZ
            r0 = 0
            r2.<init>(r1, r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63772P1c.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C63772P1c(AbstractC72932td<? extends List<? extends InterfaceC57784Mm4>> registerListData, AbstractC72932td<? extends List<? extends InterfaceC57784Mm4>> unregisterListData, AbstractC72932td<C9U5> contactModel, OSZ<? extends List<String>, ? extends List<Integer>> osz) {
        o.LJIIIZ(registerListData, "registerListData");
        o.LJIIIZ(unregisterListData, "unregisterListData");
        o.LJIIIZ(contactModel, "contactModel");
        this.LJLIL = registerListData;
        this.LJLILLLLZI = unregisterListData;
        this.LJLJI = contactModel;
        this.LJLJJI = osz;
    }
}
