package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bks, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29682Bks extends C29714BlO {
    public static final /* synthetic */ int LIZLLL = 0;

    @Override // X.C29714BlO
    public final C29714BlO LJFF(String str) {
        throw null;
    }

    @Override // X.C29714BlO
    public final C29714BlO LJII(String str) {
        throw null;
    }

    @Override // X.C29714BlO
    public final /* bridge */ /* synthetic */ C29714BlO LJIIIIZZ(String str, String str2) {
        throw null;
    }

    public final void LJIIL() {
        super.LJI(false);
    }

    @Override // X.C29714BlO
    public final C29714BlO LJI(boolean z) {
        super.LJI(z);
        return this;
    }

    public final void LJIIIZ(String str) {
        ((HashMap) this.LIZ).put("gravity", str);
    }

    public final void LJIILIIL(int i) {
        ((HashMap) this.LIZ).put("keyboard_adjust", String.valueOf(i));
    }

    public final void LJIILJJIL(String str) {
        ((HashMap) this.LIZ).put("landscape_gravity", str);
    }

    public final void LJIILLIIL(String str) {
        ((HashMap) this.LIZ).put("landscape_transition_animation", str);
    }

    public final void LJIJ(BY3 unit) {
        o.LJIIIZ(unit, "unit");
        int i = BY4.LIZ[unit.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ((HashMap) this.LIZ).put("min_margin_top", C72972SkS.LIZLLL(10, "rpx"));
                    return;
                }
                throw new C162476Zf();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(10);
            LIZ.append('%');
            ((HashMap) this.LIZ).put("min_margin_top", X1D.LIZIZ(LIZ));
            return;
        }
        ((HashMap) this.LIZ).put("min_margin_top", String.valueOf(10));
    }

    public final void LJIJJ(String str) {
        ((HashMap) this.LIZ).put("transition_animation", str);
    }

    public final void LJIJJLI(String url) {
        o.LJIIIZ(url, "url");
        super.LJII(url);
    }

    public final void LJJIFFI(java.util.Map extra) {
        o.LJIIIZ(extra, "extra");
        ((HashMap) this.LIZ).putAll(extra);
    }

    public static /* synthetic */ C29682Bks LJIIJJI(C29682Bks c29682Bks, int i) {
        c29682Bks.LJIIJ(i, BY3.DP);
        return c29682Bks;
    }

    public static void LJIIZILJ(C29682Bks c29682Bks, int i) {
        BY3 unit = BY3.DP;
        o.LJIIIZ(unit, "unit");
        int i2 = BY4.LIZ[unit.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    ((HashMap) c29682Bks.LIZ).put("landscape_width", C72972SkS.LIZLLL(i, "rpx"));
                    return;
                }
                throw new C162476Zf();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append('%');
            ((HashMap) c29682Bks.LIZ).put("landscape_width", X1D.LIZIZ(LIZ));
            return;
        }
        ((HashMap) c29682Bks.LIZ).put("landscape_width", String.valueOf(i));
    }

    public static void LJIJI(C29682Bks c29682Bks, int i) {
        BY3 unit = BY3.DP;
        c29682Bks.getClass();
        o.LJIIIZ(unit, "unit");
        int i2 = BY4.LIZ[unit.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    ((HashMap) c29682Bks.LIZ).put("radius", C72972SkS.LIZLLL(i, "rpx"));
                    return;
                }
                throw new C162476Zf();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append('%');
            ((HashMap) c29682Bks.LIZ).put("radius", X1D.LIZIZ(LIZ));
            return;
        }
        ((HashMap) c29682Bks.LIZ).put("radius", String.valueOf(i));
    }

    public static /* synthetic */ C29682Bks LJJ(C29682Bks c29682Bks, int i) {
        c29682Bks.LJIL(i, BY3.DP);
        return c29682Bks;
    }

    public final C29682Bks LJIIJ(int i, BY3 unit) {
        o.LJIIIZ(unit, "unit");
        int i2 = BY4.LIZ[unit.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    ((HashMap) this.LIZ).put("height", C72972SkS.LIZLLL(i, "rpx"));
                } else {
                    throw new C162476Zf();
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i);
                LIZ.append('%');
                ((HashMap) this.LIZ).put("height", X1D.LIZIZ(LIZ));
            }
        } else {
            ((HashMap) this.LIZ).put("height", String.valueOf(i));
        }
        return this;
    }

    public final C29682Bks LJIILL(int i, BY3 unit) {
        o.LJIIIZ(unit, "unit");
        int i2 = BY4.LIZ[unit.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    ((HashMap) this.LIZ).put("landscape_height", C72972SkS.LIZLLL(i, "rpx"));
                } else {
                    throw new C162476Zf();
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i);
                LIZ.append('%');
                ((HashMap) this.LIZ).put("landscape_height", X1D.LIZIZ(LIZ));
            }
        } else {
            ((HashMap) this.LIZ).put("landscape_height", String.valueOf(i));
        }
        return this;
    }

    public final C29682Bks LJIL(int i, BY3 unit) {
        o.LJIIIZ(unit, "unit");
        int i2 = BY4.LIZ[unit.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    ((HashMap) this.LIZ).put("width", C72972SkS.LIZLLL(i, "rpx"));
                } else {
                    throw new C162476Zf();
                }
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i);
                LIZ.append('%');
                ((HashMap) this.LIZ).put("width", X1D.LIZIZ(LIZ));
            }
        } else {
            ((HashMap) this.LIZ).put("width", String.valueOf(i));
        }
        return this;
    }

    public final void LJJI(String str, String value) {
        o.LJIIIZ(value, "value");
        super.LJIIIIZZ(str, value);
    }
}
