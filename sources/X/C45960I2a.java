package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.I2a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45960I2a implements InterfaceC83500Wps {
    public final /* synthetic */ I2Z LIZ;

    @Override // X.InterfaceC83500Wps
    public final void LIZ() {
    }

    @Override // X.InterfaceC83500Wps
    public final void LIZJ(C83489Wph c83489Wph) {
    }

    @Override // X.InterfaceC83500Wps
    public final void LIZLLL() {
    }

    public C45960I2a(I2Z i2z) {
        this.LIZ = i2z;
    }

    @Override // X.InterfaceC83500Wps
    public final void LIZIZ(List<String> list) {
        Iterator<I2Y> it = this.LIZ.LIZJ.iterator();
        while (it.hasNext()) {
            it.next().LJJJJLI(list);
        }
    }
}
