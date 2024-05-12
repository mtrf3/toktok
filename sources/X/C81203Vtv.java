package X;

import androidx.fragment.app.Fragment;
import java.util.Arrays;

/* renamed from: X.Vtv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81203Vtv implements C2J3 {
    public final InterfaceC81204Vtw LIZ;
    public final InterfaceC81206Vty LIZIZ;
    public int LIZJ;

    @Override // X.C2J3
    public final void block() {
        this.LIZIZ.block();
    }

    @Override // X.C2J3
    public final Fragment getFragment() {
        return this.LIZ.R4();
    }

    @Override // X.C2J3
    public final void reset() {
        this.LIZIZ.reset();
    }

    @Override // X.C2J3
    public final void resume() {
        if (this.LIZIZ.LIZ()) {
            this.LIZIZ.resume();
        }
    }

    @Override // X.C2J3
    public final void LIZ(Object... objArr) {
        if (this.LIZIZ.LIZ()) {
            this.LIZ.b2(Arrays.copyOf(objArr, objArr.length));
        } else {
            this.LIZ.Aj(Arrays.copyOf(objArr, objArr.length));
        }
    }

    public C81203Vtv(InterfaceC81204Vtw interfaceC81204Vtw, C81208Vu0 c81208Vu0) {
        this.LIZ = interfaceC81204Vtw;
        this.LIZIZ = c81208Vu0;
    }
}
