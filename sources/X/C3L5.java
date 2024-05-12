package X;

import java.util.List;

/* renamed from: X.3L5, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3L5 extends C3L4 {
    public EnumC96553qd LLII = EnumC96553qd.SUCCESS;
    public EnumC96103pu LLIIII;

    @Override // X.C3L4
    public final void LJIIIZ() {
    }

    @Override // X.C3L4
    public final long LJII() {
        long j = this.LJLJL;
        try {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C63120Opw LIZ = C4WC.LIZIZ.LIZ(LJFF());
            if (LIZ != null) {
                AnonymousClass325.LIZ.getClass();
                return Math.max(AnonymousClass325.LIZLLL(AnonymousClass325.LJ(LIZ)), j);
            }
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
        return j;
    }

    public final C109544Rq LJIILJJIL() {
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ = C4WC.LIZIZ.LIZ(this.LJLILLLLZI);
        if (LIZ != null) {
            return LIZ.getLastShowMessage();
        }
        return null;
    }

    public final boolean LJIILL() {
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ = C4WC.LIZIZ.LIZ(this.LJLILLLLZI);
        if (LIZ != null && C79004UzY.LJJIIZ(LIZ)) {
            return true;
        }
        return false;
    }

    public final boolean LJIILLIIL() {
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C63120Opw LIZ = C4WC.LIZIZ.LIZ(this.LJLILLLLZI);
        if (LIZ != null && LIZ.getLastShowMessage() != null) {
            C109544Rq lastShowMessage = LIZ.getLastShowMessage();
            if (lastShowMessage.isRecalled() || lastShowMessage.getMsgType() == 1 || lastShowMessage.getMsgType() == 1031) {
                return false;
            }
            return lastShowMessage.isSelf();
        }
        return false;
    }

    @Override // X.C3L4
    public int hashCode() {
        if (this.LLIIII != null) {
            return (this.LLIIII.hashCode() * 31) + (this.LLII.hashCode() * 31) + (super.hashCode() * 31);
        }
        return (this.LLII.hashCode() * 31) + (super.hashCode() * 31);
    }

    @Override // X.C3L4
    public String LJFF() {
        return this.LJLILLLLZI;
    }

    public static EnumC96553qd LJIIL(int i) {
        if (i != 0 && i != 1) {
            if (i != 3) {
                return EnumC96553qd.SUCCESS;
            }
            return EnumC96553qd.FAILED;
        }
        return EnumC96553qd.SENDING;
    }

    @Override // X.C3L4
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3L5 c3l5 = (C3L5) obj;
        if (c3l5.LLII != this.LLII || c3l5.LLIIII != this.LLIIII) {
            return false;
        }
        return super.equals(obj);
    }

    public static EnumC96553qd LJIILIIL(C3L5 c3l5, C109544Rq c109544Rq, C3OG c3og) {
        List<Long> list;
        if (c109544Rq == null) {
            return EnumC96553qd.FAILED;
        }
        if (c3og == null || !c109544Rq.isSelf() || c3og.LIZLLL != c109544Rq.getMsgId()) {
            return LJIIL(c109544Rq.getMsgStatus());
        }
        if (c109544Rq.getMsgStatus() == 3) {
            return EnumC96553qd.FAILED;
        }
        if (c109544Rq.getMsgStatus() == 1 || c109544Rq.getMsgStatus() == 0) {
            return EnumC96553qd.SENDING;
        }
        if ((c109544Rq.getMsgStatus() == 2 || c109544Rq.getMsgStatus() == 5) && (list = c3og.LIZ) != null && list.size() > 0) {
            return EnumC96553qd.SEEN;
        }
        return EnumC96553qd.SUCCESS;
    }
}
