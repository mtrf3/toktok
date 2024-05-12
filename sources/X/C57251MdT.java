package X;

import java.util.Iterator;

/* renamed from: X.MdT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57251MdT extends AbstractChoreographerFrameCallbackC57253MdV {
    public C57251MdT() {
        super(false);
    }

    @Override // X.AbstractChoreographerFrameCallbackC57253MdV
    public final void LIZLLL() {
        Iterator<InterfaceC57255MdX> it = this.LJLILLLLZI.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ((r1.LIZ() - 1) * 16);
        }
    }
}
