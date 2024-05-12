package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119614mj extends C72433Sbl {
    public Drawable LJLLLLLL;

    @Override // X.C72433Sbl, X.C51588KMm, X.C62846OlW
    public final void LIZ() {
        LayerDrawable LJIIJ;
        super.LIZ();
        boolean z = C48709J9t.LIZ;
        Integer valueOf = Integer.valueOf(R.attr.gu);
        if (z) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_replay_fill;
            c2068389v.LIZIZ = C7MY.LIZIZ(32);
            c2068389v.LIZJ = C7MY.LIZIZ(32);
            setAlpha(0.75f);
            c2068389v.LJ = valueOf;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            SY9 LIZ = c2068389v.LIZ(context);
            C110614Vt c110614Vt = new C110614Vt();
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            c110614Vt.LIZ = C79045V0n.LJI(R.attr.ck, context2);
            c110614Vt.LIZJ = C61328O5c.LIZJ(32);
            c110614Vt.LJII = C7MY.LIZIZ(64);
            c110614Vt.LJI = C7MY.LIZIZ(64);
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            LJIIJ = C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context3));
        } else {
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_replay_fill;
            c2068389v2.LIZIZ = C7MY.LIZIZ(26);
            c2068389v2.LIZJ = C7MY.LIZIZ(26);
            setAlpha(0.75f);
            c2068389v2.LJ = valueOf;
            Context context4 = getContext();
            o.LJIIIIZZ(context4, "context");
            SY9 LIZ2 = c2068389v2.LIZ(context4);
            C110614Vt c110614Vt2 = new C110614Vt();
            Context context5 = getContext();
            o.LJIIIIZZ(context5, "context");
            c110614Vt2.LIZ = C79045V0n.LJI(R.attr.ck, context5);
            c110614Vt2.LIZJ = C61328O5c.LIZJ(28);
            c110614Vt2.LJII = C7MY.LIZIZ(56);
            c110614Vt2.LJI = C7MY.LIZIZ(56);
            Context context6 = getContext();
            o.LJIIIIZZ(context6, "context");
            LJIIJ = C26338AVi.LJIIJ(LIZ2, c110614Vt2.LIZ(context6));
        }
        if (this.LJLLLLLL == null) {
            this.LJLLLLLL = LJIIJ;
        }
        Drawable drawable = this.LJLLLLLL;
        if (drawable instanceof BitmapDrawable) {
            o.LJII(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap != null) {
                getHierarchy().LJIJJ(new BitmapDrawable(getResources(), bitmap), InterfaceC78716Uuu.LJJLIIIJILLIZJL);
                return;
            } else {
                getHierarchy().LJIJJ(LJIIJ, InterfaceC78716Uuu.LJJLIIIJILLIZJL);
                return;
            }
        }
        getHierarchy().LJIJJ(LJIIJ, InterfaceC78716Uuu.LJJLIIIJILLIZJL);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119614mj(Context context) {
        super(context);
        a1.LJFF(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119614mj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
    }
}
