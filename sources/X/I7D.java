package X;

import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.AqS31S0001000_7;

/* loaded from: classes8.dex */
public final class I7D implements LHW {
    public final /* synthetic */ I7C LJLIL;

    @Override // X.InterfaceC54357LUz
    public final void LIZ(C78856UxA c78856UxA) {
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZJ(C78856UxA c78856UxA) {
    }

    public I7D(I7C i7c) {
        this.LJLIL = i7c;
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZIZ(C78856UxA c78856UxA) {
        if (c78856UxA == null) {
            return;
        }
        I7C i7c = this.LJLIL;
        C82632Wbs c82632Wbs = i7c.LJLJJLL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = I7C.LJLJLJ;
        boolean z = true;
        JediViewModel jediViewModel = (JediViewModel) c82632Wbs.LIZ(i7c, interfaceC74236TBoArr[1]);
        int i = c78856UxA.LJ;
        jediViewModel.getClass();
        jediViewModel.setStateImmediate(new AqS31S0001000_7(i, 4));
        I7C i7c2 = this.LJLIL;
        I6G i6g = (I6G) i7c2.LJLJJL.LIZ(i7c2, interfaceC74236TBoArr[0]);
        if (c78856UxA.LJ != 0) {
            z = false;
        }
        i6g.switchMode(z);
    }
}
