package X;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JFr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48863JFr extends AbstractC06100Lu implements InterfaceC48864JFs {
    public final List<InterfaceC48865JFt> LJLILLLLZI = new ArrayList();
    public boolean LJLJI;

    @Override // X.InterfaceC48864JFs
    public final void LIZ(C64449PRd c64449PRd) {
        ((ArrayList) this.LJLILLLLZI).add(c64449PRd);
        if (!this.LJLJI) {
            C36381bm.LJIL.LIZLLL(this);
            this.LJLJI = true;
        }
    }

    @Override // X.InterfaceC48864JFs
    public final void LIZIZ(C64449PRd c64449PRd) {
        ((ArrayList) this.LJLILLLLZI).remove(c64449PRd);
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIIZ(long j, long j2, long j3, long j4, boolean z) {
        Object LIZ;
        this.LJLIL = false;
        if (((ArrayList) this.LJLILLLLZI).isEmpty() || !z) {
            return;
        }
        try {
            Field declaredField = C36381bm.class.getDeclaredField("LJIJJ");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(C36381bm.LJIL);
            o.LJII(obj, "null cannot be cast to non-null type kotlin.Long");
            LIZ = Long.valueOf(((Long) obj).longValue());
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m13isSuccessimpl(LIZ)) {
            return;
        }
        long longValue = ((Number) LIZ).longValue();
        if (longValue == -1) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((InterfaceC48865JFt) it.next()).LIZ(longValue, j3);
        }
    }
}
