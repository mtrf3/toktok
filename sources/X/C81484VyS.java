package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VyS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81484VyS extends PopupWindow {
    public final Context LIZ;
    public final ViewGroup LIZIZ;
    public final CountDownTimerC81485VyT LIZJ;
    public InterfaceC81487VyV LIZLLL;
    public final ARV LJ;
    public final SeekBar LJFF;
    public final View LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public boolean LJIIJ;

    public static OSZ LIZIZ() {
        int i;
        int size = C81446Vxq.LIZ().size();
        int i2 = size / 3;
        if (size % 3 == 0) {
            i = 0;
        } else {
            i = 1;
        }
        int i3 = i2 + i;
        return new OSZ(Float.valueOf(C81446Vxq.LJFF), Float.valueOf(((i3 - 1) * C81446Vxq.LJII) + C81446Vxq.LJI));
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        if (isShowing()) {
            this.LIZJ.cancel();
            ViewGroup view = this.LIZIZ;
            C74275TDb.LJFF(this.LIZ);
            AqS164S0100000_14 aqS164S0100000_14 = new AqS164S0100000_14(this, 444);
            o.LJIIIZ(view, "view");
            C39661h4 LJIIL = C55953Lxd.LJIIL(view, C17T.LJIILJJIL, 0.0f);
            LJIIL.LJI(1.0f);
            LJIIL.LIZIZ(new C81486VyU(aqS164S0100000_14));
            C39661h4 LJIIL2 = C55953Lxd.LJIIL(view, C17T.LJIILL, 0.0f);
            LJIIL2.LJI(1.0f);
            C39661h4 LJIIL3 = C55953Lxd.LJIIL(view, C17T.LJIJI, 0.0f);
            LJIIL3.LJI(1.0f);
            LJIIL.LJIIIZ();
            LJIIL2.LJIIIZ();
            LJIIL3.LJIIIZ();
        }
    }

    public C81484VyS(Context context) {
        super(context, (AttributeSet) null, 0);
        int i;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        this.LIZ = context;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ayx, C16880lQ.LLZIL(context), null);
        o.LJII(LLLZIIL, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) LLLZIIL;
        this.LIZIZ = viewGroup;
        this.LIZJ = new CountDownTimerC81485VyT(this);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C45047Hm7.LJLIL);
        View findViewById = viewGroup.findViewById(R.id.diw);
        ((ARV) findViewById).setChecked(true);
        o.LJIIIIZZ(findViewById, "contentView.findViewById…   isChecked = true\n    }");
        this.LJ = (ARV) findViewById;
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.dor);
        C119494mX c119494mX = new C119494mX(new AqS180S0100000_14(this, 356), C81446Vxq.LIZ());
        int i2 = ((Keva) W0A.LIZIZ.getValue()).getInt("selected_color", 0);
        c119494mX.LJLJI = i2 < C81446Vxq.LIZ().size() ? i2 : 0;
        recyclerView.setAdapter(c119494mX);
        recyclerView.setLayoutManager(new GridLayoutManager(3));
        View findViewById2 = viewGroup.findViewById(R.id.di2);
        AbsSeekBar absSeekBar = (AbsSeekBar) findViewById2;
        if (((Number) LIZIZ.getValue()).intValue() == 2) {
            i = 10;
        } else {
            i = 100;
        }
        absSeekBar.setMax(i);
        o.LJIIIIZZ(findViewById2, "contentView.findViewById…      100\n        }\n    }");
        this.LJFF = (SeekBar) findViewById2;
        boolean LJFF = C74275TDb.LJFF(context);
        View findViewById3 = viewGroup.findViewById(R.id.jkh);
        if (LJFF) {
            drawable = context.getDrawable(R.drawable.a6k);
        } else {
            drawable = context.getDrawable(R.drawable.a6j);
        }
        findViewById3.setBackground(drawable);
        this.LJI = findViewById3;
        View findViewById4 = viewGroup.findViewById(R.id.jki);
        if (LJFF) {
            drawable2 = context.getDrawable(R.drawable.a6m);
        } else {
            drawable2 = context.getDrawable(R.drawable.a6l);
        }
        findViewById4.setBackground(drawable2);
        this.LJII = findViewById4;
        View findViewById5 = viewGroup.findViewById(R.id.jkf);
        if (LJFF) {
            drawable3 = context.getDrawable(R.drawable.a6i);
        } else {
            drawable3 = context.getDrawable(R.drawable.a6h);
        }
        findViewById5.setBackground(drawable3);
        this.LJIIIIZZ = findViewById5;
        this.LJIIIZ = C221108m2.LIZIZ(new AqS163S0100000_13(context, 477));
        setTouchable(true);
        setOutsideTouchable(true);
        setWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(156)));
        setContentView(viewGroup);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.gy);
        c110614Vt.LIZJ = C61328O5c.LIZJ(14);
        viewGroup.setBackground(c110614Vt.LIZ(context));
    }

    public static final /* synthetic */ void LIZ(C81484VyS c81484VyS) {
        super.dismiss();
    }
}
