package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.WHf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82027WHf extends WI1 {
    public final InterfaceC82086WJm LJIIIZ;
    public final C6MP LJIIJ;
    public WI0 LJIIJJI;
    public final int LJIIL;

    @Override // X.WI1
    public final int LJII() {
        return R.string.tx9;
    }

    @Override // X.WI1
    public final WI0 LIZJ() {
        return this.LJIIJJI;
    }

    @Override // X.WI1
    public final int LJ() {
        return this.LJIIL;
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIIJ;
    }

    public C82027WHf(InterfaceC82086WJm cameraApiComponent) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LJIIIZ = cameraApiComponent;
        this.LJIIJ = C6MP.WIDE_CAMERA;
        VLL vll = VLL.SLIDE;
        WJV.LIZ().LJII();
        this.LJIIJJI = new WI0(vll, 80, false);
        this.LJIIL = R.raw.icon_camera_wide;
    }

    @Override // X.WI1
    public final void LIZ(WI0 wi0) {
        this.LJIIJJI = wi0;
    }
}
