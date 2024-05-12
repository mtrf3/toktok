package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: X.1KB, reason: invalid class name */
/* loaded from: classes.dex */
public class C1KB<T extends ViewGroup.MarginLayoutParams> extends C0RS<T> {
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;

    @Override // X.C0RS
    public Class<? extends ViewGroup.LayoutParams> LIZJ() {
        return ViewGroup.MarginLayoutParams.class;
    }

    public C1KB(T t) {
        super(t);
    }

    @Override // X.C0RS
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public void LIZIZ(T t) {
        super.LIZIZ(t);
        this.LIZLLL = ((ViewGroup.MarginLayoutParams) t).leftMargin;
        this.LJ = ((ViewGroup.MarginLayoutParams) t).rightMargin;
        this.LJFF = ((ViewGroup.MarginLayoutParams) t).topMargin;
        this.LJI = ((ViewGroup.MarginLayoutParams) t).bottomMargin;
        this.LJII = C16530kr.LIZJ(t);
        this.LJIIIIZZ = C16530kr.LIZIZ(t);
        int LIZ = C16530kr.LIZ(t);
        if (LIZ != 0 && LIZ != 1) {
            LIZ = 0;
        }
        this.LJIIIZ = LIZ;
        this.LJIIJ = C16530kr.LIZLLL(t);
    }

    @Override // X.C0RS
    public boolean LIZ(View view, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return false;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (!super.LIZ(view, marginLayoutParams) || this.LIZLLL != marginLayoutParams.leftMargin || this.LJ != marginLayoutParams.rightMargin || this.LJFF != marginLayoutParams.topMargin || this.LJI != marginLayoutParams.bottomMargin || this.LJII != C16530kr.LIZJ(marginLayoutParams) || this.LJIIIIZZ != C16530kr.LIZIZ(marginLayoutParams)) {
            return false;
        }
        int i = this.LJIIIZ;
        int LIZ = C16530kr.LIZ(marginLayoutParams);
        if (LIZ != 0 && LIZ != 1) {
            LIZ = 0;
        }
        if (i != LIZ || this.LJIIJ != C16530kr.LIZLLL(marginLayoutParams)) {
            return false;
        }
        return true;
    }
}
