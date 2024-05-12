package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4W6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4W6 implements C4W9 {
    public final List<C4W9> LJLIL = new ArrayList();

    @Override // X.C4W9
    public final void Gy() {
        Iterator<C4W9> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().Gy();
        }
    }

    @Override // X.C4W9
    public final void vq0() {
        Iterator<C4W9> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().vq0();
        }
    }

    @Override // X.C4W9
    public final void ZS(C63623Oy3 c63623Oy3) {
        Iterator it = ((ArrayList) this.LJLIL).iterator();
        while (it.hasNext()) {
            ((C4W9) it.next()).ZS(c63623Oy3);
        }
    }

    @Override // X.C4W9
    public final void f3(C63120Opw conversation) {
        o.LJIIIZ(conversation, "conversation");
        Iterator<C4W9> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().f3(conversation);
        }
    }

    @Override // X.C4W9
    public final void nS(List<? extends C63120Opw> list) {
        o.LJIIIZ(list, "list");
        Iterator<C4W9> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().nS(list);
        }
    }

    @Override // X.C4W9
    public final void ri(C63623Oy3 error) {
        o.LJIIIZ(error, "error");
        Iterator<C4W9> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().ri(error);
        }
    }

    @Override // X.C4W9
    public final void FA(List<? extends C63120Opw> list, boolean z) {
        o.LJIIIZ(list, "list");
        Iterator<C4W9> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().FA(list, z);
        }
    }

    @Override // X.C4W9
    public final void kc(List<? extends C63120Opw> list, boolean z) {
        o.LJIIIZ(list, "list");
        Iterator<C4W9> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().kc(list, z);
        }
    }

    @Override // X.C4W9
    public final void y9(int i, C63120Opw conversation) {
        o.LJIIIZ(conversation, "conversation");
        Iterator<C4W9> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().y9(i, conversation);
        }
    }
}
