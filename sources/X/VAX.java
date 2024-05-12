package X;

import android.text.TextUtils;
import ccb.t;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class VAX implements InterfaceC48414IzK {
    public final WeakReference<t> LIZ;

    public VAX(t tVar) {
        this.LIZ = new WeakReference<>(tVar);
    }

    @Override // X.InterfaceC48414IzK
    public final void LIZ(InterfaceC47775Ip1 interfaceC47775Ip1) {
        C46496IMq.LIZ();
        t tVar = this.LIZ.get();
        if (tVar == null || tVar.LJLLL == null) {
            return;
        }
        C46496IMq.LIZJ();
        InterfaceC48269Iwz interfaceC48269Iwz = tVar.LJLJL;
        if (interfaceC48269Iwz != null) {
            ((VBU) interfaceC48269Iwz).LIZ(EnumC79337VBt.PLAY_COMPLETED, 0, "play complete");
        }
        tVar.LJLJJI.LJJIJIIJI(-100009);
        tVar.C1 = false;
        if (tVar.LLZLI) {
            return;
        }
        if (tVar.LLLJ && tVar.LJLLJ.LIZLLL == 2 && tVar.H1(-100009)) {
            return;
        }
        if (tVar.LJLLJ.LIZLLL == 1 && tVar.n(-100009)) {
            return;
        }
        if (tVar.LLIZ == 1) {
            tVar.LLL = true;
            if (tVar.LLILLIZIL && !TextUtils.isEmpty(tVar.LLJZ)) {
                tVar.r1(tVar.LLJZ);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setLooping: ");
                LIZ.append(true);
                X1D.LIZIZ(LIZ);
                C46496IMq.LIZ();
                tVar.LLILLIZIL = true;
                if (tVar.LJLLL != null && tVar.LLZLI && !TextUtils.isEmpty(tVar.LLZL)) {
                    tVar.LJLLL.setLooping(tVar.LLILLIZIL);
                }
                tVar.O0(tVar.LLJZ);
                return;
            }
            return;
        }
        tVar.LJLLI.LIZIZ(new C48315Ixj(-100009, "live stream dry up, push stream may occur error", new HashMap()), tVar.LLIL);
    }
}
