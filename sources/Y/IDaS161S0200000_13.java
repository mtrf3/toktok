package Y;

import X.C76689U7x;
import X.C76690U7y;
import X.InterfaceC29937Boz;
import X.U4R;
import X.U7T;
import X.X1D;
import defpackage.b1;

/* loaded from: classes14.dex */
public class IDaS161S0200000_13 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC29937Boz
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS161S0200000_13 iDaS161S0200000_13) {
        StringBuilder LIZJ = b1.LIZJ("invite group", " got dispose targetUserId=");
        LIZJ.append(((C76690U7y) iDaS161S0200000_13.l0).LIZIZ);
        LIZJ.append(" targetRoomId=");
        LIZJ.append(((C76690U7y) iDaS161S0200000_13.l0).LIZ);
        LIZJ.append(" targetChannelId=");
        LIZJ.append(((C76690U7y) iDaS161S0200000_13.l0).LIZJ);
        LIZJ.append('.');
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
        ((U7T) iDaS161S0200000_13.l1).LJIIJJI.LJIIL(((C76690U7y) iDaS161S0200000_13.l0).LIZIZ);
        if (((U7T) iDaS161S0200000_13.l1).LJIIJJI.LJJIJIIJI() == null && ((U7T) iDaS161S0200000_13.l1).LJIIJJI.LJIIL.isEmpty() && ((U7T) iDaS161S0200000_13.l1).LJIIJJI.LJIILIIL.isEmpty()) {
            ((U7T) iDaS161S0200000_13.l1).LJIILJJIL.LIZIZ(0);
        }
    }

    public static final void run$1(IDaS161S0200000_13 iDaS161S0200000_13) {
        StringBuilder LIZJ = b1.LIZJ("apply group", " got dispose targetUserId=");
        LIZJ.append(((C76689U7x) iDaS161S0200000_13.l0).LIZIZ);
        LIZJ.append(" targetRoomId=");
        LIZJ.append(((C76689U7x) iDaS161S0200000_13.l0).LIZ);
        LIZJ.append(" targetChannelId=");
        LIZJ.append(((C76689U7x) iDaS161S0200000_13.l0).LIZJ);
        LIZJ.append('.');
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
        ((U7T) iDaS161S0200000_13.l1).LJIIJJI.LJIIJJI(((C76689U7x) iDaS161S0200000_13.l0).LIZIZ);
        if (((U7T) iDaS161S0200000_13.l1).LJIIJJI.LJJIJIIJI() == null && ((U7T) iDaS161S0200000_13.l1).LJIIJJI.LJIIL.isEmpty() && ((U7T) iDaS161S0200000_13.l1).LJIIJJI.LJIILIIL.isEmpty()) {
            ((U7T) iDaS161S0200000_13.l1).LJIILJJIL.LIZIZ(0);
        }
    }

    public IDaS161S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
