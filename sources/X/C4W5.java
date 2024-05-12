package X;

import Y.IDbS398S0100000_1;
import Y.IDcS406S0100000_1;
import java.util.List;

/* renamed from: X.4W5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4W5 extends AbstractC75682y4<List<C63120Opw>> {
    public final /* synthetic */ C4W7 LIZ;

    public C4W5(C4W7 c4w7) {
        this.LIZ = c4w7;
    }

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        C63322OtC.LIZLLL("StrangerListModel refresh onFailure");
        this.LIZ.LIZLLL = true;
        this.LIZ.LIZJ = false;
        if (c63623Oy3 != null) {
            C4W7 c4w7 = this.LIZ;
            c4w7.getClass();
            C63322OtC.LJFF("StrangerListModel onRefreshFailed");
            C4W9 c4w9 = c4w7.LIZIZ;
            if (c4w9 != null) {
                c4w9.ri(c63623Oy3);
            }
        }
    }

    @Override // X.AbstractC75682y4
    public final void LIZJ(long j, Object obj, boolean z) {
        Integer valueOf;
        List list = (List) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StrangerListModel refresh onSuccess, size:");
        if (list == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(list.size());
        }
        LIZ.append(valueOf);
        LIZ.append(" nextCursor:");
        LIZ.append(j);
        LIZ.append(", hasMore:");
        LIZ.append(z);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        this.LIZ.LJFF = j;
        this.LIZ.LJ = z;
        this.LIZ.LIZJ = false;
        RunnableC63345OtZ.LJ(new IDcS406S0100000_1(this, 6), new IDbS398S0100000_1(this, 7), false);
    }
}
