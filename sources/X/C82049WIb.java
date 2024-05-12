package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.WIb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82049WIb extends WI1 {
    public final int LJIIIZ = -1;
    public int LJIIJ = WI2.LIZJ(EnumC82528WaC.NORMAL);
    public final C6MP LJIIJJI = C6MP.SPEED;
    public WI0 LJIIL = new WI0(VLL.SLIDE, WJV.LIZ().getSpeed(), false);

    @Override // X.WI1
    public final int LJII() {
        if (C60903NvH.LJIIJJI().LJJIL().getSpeedPanelOpen(false)) {
            return R.string.ria;
        }
        return R.string.ri_;
    }

    @Override // X.WI1
    public final WI0 LIZJ() {
        return this.LJIIL;
    }

    @Override // X.WI1
    public final int LJ() {
        return this.LJIIJ;
    }

    @Override // X.WI1
    public final int LJI() {
        return this.LJIIIZ;
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIIJJI;
    }

    @Override // X.WI1
    public final void LIZ(WI0 wi0) {
        this.LJIIL = wi0;
    }
}
