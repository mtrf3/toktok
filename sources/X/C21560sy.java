package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.0sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21560sy {
    public final C08370Un LIZ;
    public final C08370Un LIZIZ;
    public final C08370Un LIZJ;
    public final C08370Un LIZLLL;
    public final C08370Un LJ;
    public final C08370Un LJFF;
    public final C08370Un LJI;
    public final C08370Un LJII;
    public final C08370Un LJIIIIZZ;
    public final C08370Un LJIIIZ;
    public final C08370Un LJIIJ;
    public final C08370Un LJIIJJI;
    public final C08370Un LJIIL;

    public final int hashCode() {
        return this.LJIIL.hashCode() + C67981Qm9.LIZ(this.LJIIJJI, C67981Qm9.LIZ(this.LJIIJ, C67981Qm9.LIZ(this.LJIIIZ, C67981Qm9.LIZ(this.LJIIIIZZ, C67981Qm9.LIZ(this.LJII, C67981Qm9.LIZ(this.LJI, C67981Qm9.LIZ(this.LJFF, C67981Qm9.LIZ(this.LJ, C67981Qm9.LIZ(this.LIZLLL, C67981Qm9.LIZ(this.LIZJ, C67981Qm9.LIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "Typography(h1=" + this.LIZ + ", h2=" + this.LIZIZ + ", h3=" + this.LIZJ + ", h4=" + this.LIZLLL + ", h5=" + this.LJ + ", h6=" + this.LJFF + ", subtitle1=" + this.LJI + ", subtitle2=" + this.LJII + ", body1=" + this.LJIIIIZZ + ", body2=" + this.LJIIIZ + ", button=" + this.LJIIJ + ", caption=" + this.LJIIJJI + ", overline=" + this.LJIIL + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21560sy)) {
            return false;
        }
        C21560sy c21560sy = (C21560sy) obj;
        if (o.LJ(this.LIZ, c21560sy.LIZ) && o.LJ(this.LIZIZ, c21560sy.LIZIZ) && o.LJ(this.LIZJ, c21560sy.LIZJ) && o.LJ(this.LIZLLL, c21560sy.LIZLLL) && o.LJ(this.LJ, c21560sy.LJ) && o.LJ(this.LJFF, c21560sy.LJFF) && o.LJ(this.LJI, c21560sy.LJI) && o.LJ(this.LJII, c21560sy.LJII) && o.LJ(this.LJIIIIZZ, c21560sy.LJIIIIZZ) && o.LJ(this.LJIIIZ, c21560sy.LJIIIZ) && o.LJ(this.LJIIJ, c21560sy.LJIIJ) && o.LJ(this.LJIIJJI, c21560sy.LJIIJJI) && o.LJ(this.LJIIL, c21560sy.LJIIL)) {
            return true;
        }
        return false;
    }

    public C21560sy(AbstractC13490fx abstractC13490fx, C08370Un c08370Un, C08370Un c08370Un2, int i) {
        C08370Un h1;
        C08370Un h2;
        C08370Un h3;
        C08370Un h4;
        C08370Un h5;
        C08370Un h6;
        C08370Un subtitle2;
        C08370Un body1;
        C08370Un body2;
        C08370Un button;
        C08370Un overline;
        C08370Un caption = c08370Un2;
        AbstractC13490fx defaultFontFamily = abstractC13490fx;
        C08370Un subtitle1 = c08370Un;
        defaultFontFamily = (i & 1) != 0 ? AbstractC13490fx.LJLIL : defaultFontFamily;
        if ((i & 2) != 0) {
            h1 = new C08370Un(0L, C79043V0l.LJIIIIZZ(96), C13640gC.LJLJJL, null, null, C79043V0l.LJII(-1.5d), null, null, 0L, 262009);
        } else {
            h1 = null;
        }
        if ((i & 4) != 0) {
            h2 = new C08370Un(0L, C79043V0l.LJIIIIZZ(60), C13640gC.LJLJJL, null, null, C79043V0l.LJII(-0.5d), null, null, 0L, 262009);
        } else {
            h2 = null;
        }
        if ((i & 8) != 0) {
            h3 = new C08370Un(0L, C79043V0l.LJIIIIZZ(48), C13640gC.LJLJJLL, null, null, C79043V0l.LJIIIIZZ(0), null, null, 0L, 262009);
        } else {
            h3 = null;
        }
        if ((i & 16) != 0) {
            h4 = new C08370Un(0L, C79043V0l.LJIIIIZZ(34), C13640gC.LJLJJLL, null, null, C79043V0l.LJII(0.25d), null, null, 0L, 262009);
        } else {
            h4 = null;
        }
        if ((i & 32) != 0) {
            h5 = new C08370Un(0L, C79043V0l.LJIIIIZZ(24), C13640gC.LJLJJLL, null, null, C79043V0l.LJIIIIZZ(0), null, null, 0L, 262009);
        } else {
            h5 = null;
        }
        if ((i & 64) != 0) {
            h6 = new C08370Un(0L, C79043V0l.LJIIIIZZ(20), C13640gC.LJLJL, null, null, C79043V0l.LJII(0.15d), null, null, 0L, 262009);
        } else {
            h6 = null;
        }
        subtitle1 = (i & 128) != 0 ? new C08370Un(0L, C79043V0l.LJIIIIZZ(16), C13640gC.LJLJJLL, null, null, C79043V0l.LJII(0.15d), null, null, 0L, 262009) : subtitle1;
        if ((i & 256) != 0) {
            subtitle2 = new C08370Un(0L, C79043V0l.LJIIIIZZ(14), C13640gC.LJLJL, null, null, C79043V0l.LJII(0.1d), null, null, 0L, 262009);
        } else {
            subtitle2 = null;
        }
        if ((i & 512) != 0) {
            body1 = new C08370Un(0L, C79043V0l.LJIIIIZZ(16), C13640gC.LJLJJLL, null, null, C79043V0l.LJII(0.5d), null, null, 0L, 262009);
        } else {
            body1 = null;
        }
        if ((i & 1024) != 0) {
            body2 = new C08370Un(0L, C79043V0l.LJIIIIZZ(14), C13640gC.LJLJJLL, null, null, C79043V0l.LJII(0.25d), null, null, 0L, 262009);
        } else {
            body2 = null;
        }
        if ((i & 2048) != 0) {
            button = new C08370Un(0L, C79043V0l.LJIIIIZZ(14), C13640gC.LJLJL, null, null, C79043V0l.LJII(1.25d), null, null, 0L, 262009);
        } else {
            button = null;
        }
        caption = (i & 4096) != 0 ? new C08370Un(0L, C79043V0l.LJIIIIZZ(12), C13640gC.LJLJJLL, null, null, C79043V0l.LJII(0.4d), null, null, 0L, 262009) : caption;
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            overline = new C08370Un(0L, C79043V0l.LJIIIIZZ(10), C13640gC.LJLJJLL, null, null, C79043V0l.LJII(1.5d), null, null, 0L, 262009);
        } else {
            overline = null;
        }
        o.LJIIIZ(defaultFontFamily, "defaultFontFamily");
        o.LJIIIZ(h1, "h1");
        o.LJIIIZ(h2, "h2");
        o.LJIIIZ(h3, "h3");
        o.LJIIIZ(h4, "h4");
        o.LJIIIZ(h5, "h5");
        o.LJIIIZ(h6, "h6");
        o.LJIIIZ(subtitle1, "subtitle1");
        o.LJIIIZ(subtitle2, "subtitle2");
        o.LJIIIZ(body1, "body1");
        o.LJIIIZ(body2, "body2");
        o.LJIIIZ(button, "button");
        o.LJIIIZ(caption, "caption");
        o.LJIIIZ(overline, "overline");
        C08370Un LIZ = C21580t0.LIZ(h1, defaultFontFamily);
        C08370Un LIZ2 = C21580t0.LIZ(h2, defaultFontFamily);
        C08370Un LIZ3 = C21580t0.LIZ(h3, defaultFontFamily);
        C08370Un LIZ4 = C21580t0.LIZ(h4, defaultFontFamily);
        C08370Un LIZ5 = C21580t0.LIZ(h5, defaultFontFamily);
        C08370Un LIZ6 = C21580t0.LIZ(h6, defaultFontFamily);
        C08370Un LIZ7 = C21580t0.LIZ(subtitle1, defaultFontFamily);
        C08370Un LIZ8 = C21580t0.LIZ(subtitle2, defaultFontFamily);
        C08370Un LIZ9 = C21580t0.LIZ(body1, defaultFontFamily);
        C08370Un LIZ10 = C21580t0.LIZ(body2, defaultFontFamily);
        C08370Un LIZ11 = C21580t0.LIZ(button, defaultFontFamily);
        C08370Un LIZ12 = C21580t0.LIZ(caption, defaultFontFamily);
        C08370Un LIZ13 = C21580t0.LIZ(overline, defaultFontFamily);
        this.LIZ = LIZ;
        this.LIZIZ = LIZ2;
        this.LIZJ = LIZ3;
        this.LIZLLL = LIZ4;
        this.LJ = LIZ5;
        this.LJFF = LIZ6;
        this.LJI = LIZ7;
        this.LJII = LIZ8;
        this.LJIIIIZZ = LIZ9;
        this.LJIIIZ = LIZ10;
        this.LJIIJ = LIZ11;
        this.LJIIJJI = LIZ12;
        this.LJIIL = LIZ13;
    }
}
