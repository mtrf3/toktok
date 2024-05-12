package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Zkk, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90826Zkk implements InterfaceC90481ZfB {
    public final /* synthetic */ InterfaceC90481ZfB LIZ;
    public final /* synthetic */ C90827Zkl LIZIZ;

    public C90826Zkk(C90827Zkl c90827Zkl, InterfaceC90481ZfB interfaceC90481ZfB) {
        this.LIZIZ = c90827Zkl;
        this.LIZ = interfaceC90481ZfB;
    }

    @Override // X.InterfaceC90481ZfB
    public final void LIZ(long j) {
        InterfaceC90481ZfB interfaceC90481ZfB = this.LIZ;
        if (interfaceC90481ZfB != null) {
            interfaceC90481ZfB.LIZ(j);
        }
    }

    @Override // X.InterfaceC90481ZfB
    public final void LIZIZ(long j, int i, Object obj) {
        if (this.LIZ != null) {
            if (i == 2001) {
                this.LIZIZ.LIZ.getClass();
                Iterator it = ((CopyOnWriteArrayList) this.LIZIZ.LJII.LIZ.LJII).iterator();
                while (it.hasNext()) {
                    ((AbstractC90122ZYo) it.next()).LJIILIIL();
                }
                i = 2001;
            }
            this.LIZ.LIZIZ(j, i, obj);
        }
    }
}
