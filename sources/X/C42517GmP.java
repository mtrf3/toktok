package X;

import Y.IDCListenerS283S0100000_7;
import android.content.Context;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS4S2300000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GmP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42517GmP implements InterfaceC42518GmQ {
    public final Context LIZ;
    public C26231ARf LIZIZ;

    public C42517GmP(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }

    @Override // X.InterfaceC42518GmQ
    public final void LIZ(String str, String str2, AqS165S0100000_15 aqS165S0100000_15, String str3, Y6N y6n, AqS165S0100000_15 aqS165S0100000_152, AqS165S0100000_15 aqS165S0100000_153, AqS165S0100000_15 aqS165S0100000_154) {
        C26227ARb c26227ARb = new C26227ARb(this.LIZ);
        c26227ARb.LJFF(str);
        C77123UOp.LJIILL(c26227ARb, new AqS4S2300000_7(str2, str3, aqS165S0100000_15, this, y6n, 2));
        c26227ARb.LJ = new IDCListenerS283S0100000_7(new AqS173S0100000_7(aqS165S0100000_152, 404), 6);
        c26227ARb.LIZJ(new AqS173S0100000_7(aqS165S0100000_153, 405));
        c26227ARb.LIZLLL(new AqS173S0100000_7(aqS165S0100000_154, 406));
        C26231ARf LJI = c26227ARb.LJI();
        this.LIZIZ = LJI;
        LJI.LIZLLL();
    }
}
