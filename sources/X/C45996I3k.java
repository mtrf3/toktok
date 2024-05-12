package X;

import com.bytedance.scene.navigation.NavigationScene;

/* renamed from: X.I3k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45996I3k implements WO6 {
    public final /* synthetic */ C46068I6e LIZ;

    @Override // X.WO6
    public final void LIZ() {
        C46068I6e c46068I6e = this.LIZ;
        if (c46068I6e.LJLIL.mActivity == null) {
            return;
        }
        c46068I6e.LJLJJLL.s3(false);
        this.LIZ.getRecordControlApi().mc(true);
        InterfaceC161186Ug LJJLI = this.LIZ.LJJLI();
        if (LJJLI != null) {
            LJJLI.cO(false);
        }
        this.LIZ.getStickerApiComponent().Jh0();
        System.currentTimeMillis();
    }

    @Override // X.WO6
    public final void LIZIZ() {
        NavigationScene LJIL;
        C46068I6e c46068I6e = this.LIZ;
        if (c46068I6e.LJLIL.mActivity == null) {
            return;
        }
        c46068I6e.getRecordControlApi().mc(false);
        C78928UyK.LIZIZ(true, false, false, this.LIZ.LJLJI);
        InterfaceC161186Ug LJJLI = this.LIZ.LJJLI();
        if (LJJLI != null) {
            LJJLI.cO(true);
        }
        if (C52529KjV.LIZ()) {
            this.LIZ.LJJLIIIJILLIZJL().LLJJIII();
            return;
        }
        C46068I6e c46068I6e2 = this.LIZ;
        WM7 wm7 = c46068I6e2.LJLLJ;
        if (wm7 == null || (LJIL = C78897Uxp.LJIL(c46068I6e2.LJLIL)) == null) {
            return;
        }
        LJIL.remove(wm7);
    }

    @Override // X.WO6
    public final void close() {
        this.LIZ.f2(false);
    }

    public C45996I3k(C46068I6e c46068I6e) {
        this.LIZ = c46068I6e;
    }

    @Override // X.WO6
    public final void LIZJ(long j) {
        C46068I6e c46068I6e = this.LIZ;
        if (c46068I6e.LJLIL.mActivity == null) {
            return;
        }
        c46068I6e.getRecordControlApi().r10(new C44237HXt(3, this.LIZ.LJLLILLLL, 28));
        this.LIZ.getRecordControlApi().Sk0(this.LIZ.LJLLILLLL);
        InterfaceC45995I3j interfaceC45995I3j = (InterfaceC45995I3j) this.LIZ.getDiContainer().LJIIIIZZ(null, InterfaceC45995I3j.class);
        if (interfaceC45995I3j != null) {
            interfaceC45995I3j.s3(true);
            interfaceC45995I3j.h(1);
            interfaceC45995I3j.LLLLLLLLLL(true);
            interfaceC45995I3j.LLILIL();
        }
        this.LIZ.getRecordControlApi().mc(false);
        this.LIZ.getRecordControlApi().VE(j);
    }

    @Override // X.WO6
    public final void LIZLLL(boolean z) {
        this.LIZ.LJLJI.PY(new V8S(!z, false, false));
    }

    @Override // X.WO6
    public final void LJ(int i) {
        this.LIZ.S8(i, true);
    }
}
