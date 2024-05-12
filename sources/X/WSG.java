package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WSG implements InterfaceC81423VxT {
    public final /* synthetic */ WSE LIZ;

    public WSG(WSE wse) {
        this.LIZ = wse;
    }

    @Override // X.InterfaceC81423VxT
    public final void LIZ(String str) {
        if (!o.LJ(str, "")) {
            C29901Fi<String> c29901Fi = this.LIZ.LJFF;
            if (c29901Fi != null) {
                c29901Fi.LJII(str);
                this.LIZ.getClass();
            } else {
                o.LJIJI("sharedARTabIndexChangeEvent");
                throw null;
            }
        }
    }
}
