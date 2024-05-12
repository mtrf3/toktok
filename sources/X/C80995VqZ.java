package X;

import kotlin.jvm.internal.o;

/* renamed from: X.VqZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80995VqZ implements InterfaceC80621VkX {
    public final /* synthetic */ C80994VqY LIZ;

    public C80995VqZ(C80994VqY c80994VqY) {
        this.LIZ = c80994VqY;
    }

    @Override // X.InterfaceC80621VkX
    public final void LIZ(int i, Object prevValue, Object curValue) {
        long j;
        o.LJIIIZ(prevValue, "prevValue");
        o.LJIIIZ(curValue, "curValue");
        C80994VqY c80994VqY = this.LIZ;
        Long l = c80994VqY.LJLJJLL;
        if (l != null) {
            j = l.longValue();
        } else {
            j = c80994VqY.LJLJJI;
        }
        AbstractC80990VqU abstractC80990VqU = c80994VqY.LJLJLJ;
        if (abstractC80990VqU != null) {
            long LJIIL = abstractC80990VqU.LJIIL(j, i, curValue);
            AbstractC80990VqU abstractC80990VqU2 = c80994VqY.LJLJLJ;
            if (abstractC80990VqU2 != null) {
                abstractC80990VqU2.LJII(LJIIL);
                c80994VqY.LIZ(i, LJIIL);
                return;
            } else {
                o.LJIJI("pickerTemplate");
                throw null;
            }
        }
        o.LJIJI("pickerTemplate");
        throw null;
    }
}
