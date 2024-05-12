package X;

import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;

/* renamed from: X.VZz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79967VZz implements InterfaceC79968Va0 {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 361));
    public int LIZIZ;
    public final V1L LIZJ;

    @Override // X.InterfaceC79968Va0
    public final List<V1L> LIZIZ() {
        return (List) this.LIZ.getValue();
    }

    @Override // X.InterfaceC79968Va0
    public final String getId() {
        String id;
        V1L v1l = this.LIZJ;
        if (v1l != null && (id = v1l.getId()) != null) {
            return id;
        }
        return "";
    }

    @Override // X.InterfaceC79968Va0
    public final int getCurrentIndex() {
        return this.LIZIZ;
    }

    public C79967VZz(V1L v1l) {
        this.LIZJ = v1l;
    }

    @Override // X.InterfaceC79968Va0
    public final void LIZ(int i) {
        this.LIZIZ = i;
    }
}
