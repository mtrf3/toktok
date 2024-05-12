package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.TIf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74409TIf {
    public final C82604WbQ LIZ;
    public final C73893SzJ LIZIZ;
    public EnumC74379THb LIZJ;
    public EnumC74410TIg LIZLLL;
    public boolean LJ;
    public final ViewGroup LJFF;
    public final View LJI;
    public final View LJII;
    public final boolean LJIIIIZZ;

    public final void LIZ() {
        EnumC74410TIg enumC74410TIg = this.LIZLLL;
        if (enumC74410TIg == EnumC74410TIg.SHOW) {
            LJ();
        } else if (enumC74410TIg == EnumC74410TIg.HIDE) {
            LIZIZ();
        }
        this.LIZLLL = EnumC74410TIg.NONE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.TKG, X.WbQ] */
    public final void LIZIZ() {
        if (this.LIZ != null) {
            int ordinal = this.LIZJ.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2 && ordinal != 3) {
                    this.LIZJ = EnumC74379THb.HIDING;
                    this.LIZ.LIZJ(new C30461Hm());
                    if (this.LJIIIIZZ) {
                        this.LIZIZ.onNext(THZ.HIDDEN);
                        return;
                    }
                    return;
                }
                this.LIZLLL = EnumC74410TIg.NONE;
                return;
            }
            this.LIZLLL = EnumC74410TIg.HIDE;
            return;
        }
        LIZJ();
    }

    public final void LIZJ() {
        this.LIZJ = EnumC74379THb.HIDE;
        this.LJI.setVisibility(8);
        this.LIZIZ.onNext(THZ.PRE_HIDE);
        this.LIZIZ.onNext(THZ.HIDDEN);
    }

    public final C73426Srm LIZLLL() {
        C73893SzJ c73893SzJ = this.LIZIZ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.TKG, X.WbQ] */
    public final void LJ() {
        if (C82894Wg6.LIZIZ.LJIIL() && this.LJ) {
            this.LJ = false;
            LJFF();
            return;
        }
        if (this.LIZ != null) {
            int ordinal = this.LIZJ.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2) {
                    this.LIZJ = EnumC74379THb.SHOWING;
                    this.LIZ.LIZIZ(new C30461Hm());
                    return;
                } else {
                    this.LIZLLL = EnumC74410TIg.SHOW;
                    return;
                }
            }
            this.LIZLLL = EnumC74410TIg.NONE;
            return;
        }
        LJFF();
    }

    public final void LJFF() {
        this.LIZJ = EnumC74379THb.SHOWN;
        this.LJI.setVisibility(0);
        C82894Wg6 c82894Wg6 = C82894Wg6.LIZIZ;
        if ((c82894Wg6.LJIIL() || c82894Wg6.LJIILIIL()) && this.LJII != null) {
            this.LJFF.removeAllViews();
            this.LJFF.addView(this.LJI);
            this.LJII.setVisibility(0);
        }
        this.LIZIZ.onNext(THZ.PRE_SHOW);
        this.LIZIZ.onNext(THZ.SHOWN);
    }

    public C74409TIf(ViewGroup root, View view, View view2, long j, Interpolator interpolator, boolean z) {
        C83050Wic c83050Wic;
        o.LJIIIZ(root, "root");
        o.LJIIIZ(interpolator, "interpolator");
        this.LJFF = root;
        this.LJI = view;
        this.LJII = view2;
        this.LJIIIIZZ = z;
        if (view2 != null) {
            c83050Wic = new C83050Wic(root, view, view2, j, 250L, interpolator, new OSZ("prop_panel_show", "prop_panel_hide"));
        } else {
            c83050Wic = null;
        }
        this.LIZ = c83050Wic;
        this.LIZIZ = new C73893SzJ();
        this.LIZJ = EnumC74379THb.HIDE;
        this.LIZLLL = EnumC74410TIg.NONE;
        if (z) {
            view.setOnTouchListener(ViewOnTouchListenerC74411TIh.LJLIL);
        }
        if (c83050Wic != null) {
            c83050Wic.LJI(new C74408TIe(this));
        }
        this.LJ = true;
    }
}
