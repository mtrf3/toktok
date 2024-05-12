package X;

import android.view.SurfaceHolder;

/* renamed from: X.Wu4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83760Wu4 extends AbstractC38911fr {
    public final /* synthetic */ SurfaceHolder LJLILLLLZI;

    @Override // X.InterfaceC83927Wwl
    public final boolean LJJL() {
        return true;
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LLJIJIL() {
        return true;
    }

    @Override // X.InterfaceC83927Wwl
    public final InterfaceC83931Wwp LJJJJJL() {
        return new C83761Wu5();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean o() {
        return C19N.LJ("enable_arcore", false);
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean C() {
        return C52264KfE.LIZ;
    }

    @Override // X.InterfaceC83927Wwl
    public final SurfaceHolder getSurfaceHolder() {
        return this.LJLILLLLZI;
    }

    public C83760Wu4(SurfaceHolder surfaceHolder) {
        this.LJLILLLLZI = surfaceHolder;
    }
}
