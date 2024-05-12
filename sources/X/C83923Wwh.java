package X;

import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Wwh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83923Wwh implements InterfaceC83927Wwl {
    public int LJLIL;
    public final CameraComponentModel LJLILLLLZI;
    public final InterfaceC83927Wwl LJLJI;

    @Override // X.InterfaceC83927Wwl
    public final boolean C() {
        return this.LJLJI.C();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean F() {
        return this.LJLJI.F();
    }

    @Override // X.InterfaceC83927Wwl
    public final int LJIJ() {
        return this.LJLJI.LJIJ();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LJJIIJ() {
        return this.LJLJI.LJJIIJ();
    }

    @Override // X.InterfaceC83927Wwl
    public final InterfaceC79152V4q LJJJJIZL() {
        return this.LJLJI.LJJJJIZL();
    }

    @Override // X.InterfaceC83927Wwl
    public final InterfaceC83931Wwp LJJJJJL() {
        return this.LJLJI.LJJJJJL();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LJJJJZ() {
        return this.LJLJI.LJJJJZ();
    }

    @Override // X.InterfaceC83927Wwl
    public final int LJJJLIIL() {
        return this.LJLJI.LJJJLIIL();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LJJL() {
        return this.LJLJI.LJJL();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LJJZ() {
        return this.LJLJI.LJJZ();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LJLIIL() {
        return this.LJLJI.LJLIIL();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LJLJJL() {
        return this.LJLJI.LJLJJL();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LJLJL() {
        return this.LJLJI.LJLJL();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LLII() {
        return this.LJLJI.LLII();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LLIILII() {
        return this.LJLJI.LLIILII();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LLJIJIL() {
        return this.LJLJI.LLJIJIL();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LLJJIJIL() {
        return this.LJLJI.LLJJIJIL();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LLJJJJJIL() {
        return this.LJLJI.LLJJJJJIL();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LLJJL() {
        return this.LJLJI.LLJJL();
    }

    @Override // X.InterfaceC83927Wwl
    public final InterfaceC65784Pro<Boolean> LLJL() {
        return this.LJLJI.LLJL();
    }

    @Override // X.InterfaceC83927Wwl
    public final int LLJLILLLLZIIL() {
        return this.LJLJI.LLJLILLLLZIIL();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LLL() {
        return this.LJLJI.LLL();
    }

    @Override // X.InterfaceC83927Wwl
    public final long LLLI() {
        return this.LJLJI.LLLI();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LLLIIL() {
        return this.LJLJI.LLLIIL();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LLLIZZ() {
        return this.LJLJI.LLLIZZ();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LLLLLZL() {
        return this.LJLJI.LLLLLZL();
    }

    @Override // X.InterfaceC83927Wwl
    public final InterfaceC83883Ww3 LLLLZI() {
        return this.LJLJI.LLLLZI();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LLLZL() {
        return this.LJLJI.LLLZL();
    }

    @Override // X.InterfaceC83927Wwl
    public final InterfaceC65784Pro<Boolean> LLZILL() {
        return this.LJLJI.LLZILL();
    }

    @Override // X.InterfaceC83927Wwl
    public final InterfaceC83958WxG LLZLLLL() {
        return this.LJLJI.LLZLLLL();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean LLZZZIL() {
        return this.LJLJI.LLZZZIL();
    }

    @Override // X.InterfaceC83927Wwl
    public final SurfaceHolder getSurfaceHolder() {
        return this.LJLJI.getSurfaceHolder();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean o() {
        return this.LJLJI.o();
    }

    @Override // X.InterfaceC83927Wwl
    public final boolean t() {
        return this.LJLJI.t();
    }

    @Override // X.InterfaceC83927Wwl
    public final OSZ<Integer, Integer> h() {
        int[] LIZ = C44655Hfn.LIZ(this.LJLIL, this.LJLILLLLZI);
        return new OSZ<>(Integer.valueOf(LIZ[0]), Integer.valueOf(LIZ[1]));
    }

    public C83923Wwh(int i, CameraComponentModel cameraComponentModel, InterfaceC83927Wwl recordContext) {
        o.LJIIIZ(cameraComponentModel, "cameraComponentModel");
        o.LJIIIZ(recordContext, "recordContext");
        this.LJLIL = i;
        this.LJLILLLLZI = cameraComponentModel;
        this.LJLJI = recordContext;
    }
}
