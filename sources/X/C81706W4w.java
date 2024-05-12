package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.W4w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81706W4w implements W4P<C81705W4v> {
    public final Context LIZ;
    public final W6J LIZIZ;
    public final C81707W4x LIZJ;
    public final java.util.Set<W4Z> LIZLLL;

    public C81706W4w() {
        throw null;
    }

    @Override // X.W4P
    public final C81705W4v get() {
        return new C81705W4v(this.LIZ, this.LIZJ, this.LIZIZ, this.LIZLLL);
    }

    public C81706W4w(Context context, C61093NyL c61093NyL) {
        W4T w4t;
        W4N animatedDrawableFactory;
        C61094NyM c61094NyM;
        java.util.Set<W4Z> set;
        W8E LJII = W8E.LJII();
        this.LIZ = context;
        W6J LJI = LJII.LJI();
        this.LIZIZ = LJI;
        C81707W4x c81707W4x = new C81707W4x();
        this.LIZJ = c81707W4x;
        Resources resources = context.getResources();
        synchronized (W4T.class) {
            if (W4T.LIZLLL == null) {
                W4T.LIZLLL = new W4T();
            }
            w4t = W4T.LIZLLL;
        }
        W86 LIZ = LJII.LIZ();
        if (LIZ == null) {
            animatedDrawableFactory = null;
        } else {
            animatedDrawableFactory = LIZ.getAnimatedDrawableFactory(context);
        }
        FT1 LIZ2 = FT1.LIZ();
        W6M<W6U, W5A> w6m = LJI.LIZLLL;
        if (c61093NyL != null) {
            c61094NyM = c61093NyL.LIZ;
            set = c61093NyL.LIZIZ;
        } else {
            c61094NyM = null;
            set = null;
        }
        c81707W4x.LIZ = resources;
        c81707W4x.LIZIZ = w4t;
        c81707W4x.LIZJ = animatedDrawableFactory;
        c81707W4x.LIZLLL = LIZ2;
        c81707W4x.LJ = w6m;
        c81707W4x.LJFF = null;
        c81707W4x.LJI = c61094NyM;
        c81707W4x.LJII = set;
        this.LIZLLL = null;
    }
}
