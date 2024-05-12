package X;

import java.util.Iterator;

/* renamed from: X.XIr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84613XIr extends AbstractC06100Lu {
    @Override // X.AbstractC06100Lu
    public final void LJIIIIZZ(String str) {
        this.LJLIL = true;
        Iterator<InterfaceC84615XIt> it = AbstractC84612XIq.LIZJ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL();
        }
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIIZ(long j, long j2, long j3, long j4, boolean z) {
        this.LJLIL = false;
        Iterator<InterfaceC84615XIt> it = AbstractC84612XIq.LIZJ.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }
}
