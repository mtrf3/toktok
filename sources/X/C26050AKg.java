package X;

import Y.AUListenerS93S0100000_4;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextLayoutView;
import com.zhiliaoapp.musically.R;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.AKg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26050AKg extends AKV<C26044AKa> {
    public final View LJ;
    public final C26044AKa LJFF;
    public View LJI;

    @Override // X.AKV
    public final View LIZJ() {
        View view = this.LJI;
        if (view != null) {
            return view;
        }
        o.LJIJI("root");
        throw null;
    }

    @Override // X.AKV
    public final void LIZIZ(boolean z) {
        ValueAnimator ofFloat;
        float f;
        View view = this.LJI;
        if (view != null) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.af_);
            if (z) {
                ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            } else {
                ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            }
            ofFloat.setDuration(150L);
            ofFloat.addUpdateListener(new AUListenerS93S0100000_4(linearLayout, 5));
            ofFloat.start();
            float f2 = 1.0f;
            if (z) {
                f = 0.8f;
            } else {
                f = 1.0f;
                f2 = 0.8f;
            }
            C39661h4 LJIIL = C55953Lxd.LJIIL(linearLayout, C17T.LJIILJJIL, f2);
            LJIIL.LJI(f);
            LJIIL.LJIIIZ();
            C39661h4 LJIIL2 = C55953Lxd.LJIIL(linearLayout, C17T.LJIILL, f2);
            LJIIL2.LJI(f);
            LJIIL2.LJIIIZ();
            return;
        }
        o.LJIJI("root");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26050AKg(Context context, View view, C26044AKa bundle) {
        super(view, bundle);
        int i;
        o.LJIIIZ(bundle, "bundle");
        this.LJ = view;
        this.LJFF = bundle;
        int i2 = 0;
        setTouchable(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.n6, R.attr.n7, R.attr.n8, R.attr.n9}, R.attr.jr, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…r.TuxCenterToastStyle, 0)");
        int color = obtainStyledAttributes.getColor(0, 0);
        float dimension = obtainStyledAttributes.getDimension(1, 0.0f);
        int color2 = obtainStyledAttributes.getColor(3, 0);
        int i3 = obtainStyledAttributes.getInt(2, 0);
        obtainStyledAttributes.recycle();
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bv, C16880lQ.LLZIL(context), null);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…enter_toast_layout, null)");
        this.LJI = LLLZIIL;
        setContentView(LLLZIIL);
        View view2 = this.LJI;
        if (view2 != null) {
            View findViewById = view2.findViewById(R.id.af_);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZ = Integer.valueOf(color);
            c110614Vt.LIZJ = Float.valueOf(dimension);
            findViewById.setBackground(c110614Vt.LIZ(context));
            View view3 = this.LJI;
            if (view3 != null) {
                View findViewById2 = view3.findViewById(R.id.af_);
                if (C63081OpJ.LJZI(context)) {
                    i = UserLevelGeckoUpdateSetting.DEFAULT;
                } else {
                    i = 100;
                }
                findViewById2.setMinimumWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i))));
                int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(220));
                C74247TBz c74247TBz = new C74247TBz();
                c74247TBz.LIZIZ.LJ = LJJIIZ;
                c74247TBz.LIZJ(i3);
                c74247TBz.LJ(color2);
                c74247TBz.LIZLLL(bundle.LJLIL.LIZIZ);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                o.LJIIIZ(alignment, "alignment");
                TC0 tc0 = c74247TBz.LIZIZ;
                tc0.getClass();
                tc0.LJI = alignment;
                Layout LIZ = c74247TBz.LIZ();
                C118234kV it = C78842Uww.LJJ(0, LIZ.getLineCount()).iterator();
                if (it.LJLJI) {
                    float lineWidth = LIZ.getLineWidth(it.nextInt());
                    while (it.LJLJI) {
                        lineWidth = Math.max(lineWidth, LIZ.getLineWidth(it.nextInt()));
                    }
                    if (lineWidth < LJJIIZ) {
                        c74247TBz.LIZIZ.LJ = (int) Math.ceil(lineWidth);
                    }
                    View view4 = this.LJI;
                    if (view4 != null) {
                        ((TuxTextLayoutView) view4.findViewById(R.id.message_tv)).setTextLayout(c74247TBz.LIZ());
                        View view5 = this.LJI;
                        if (view5 != null) {
                            TuxIconView tuxIconView = (TuxIconView) view5.findViewById(R.id.ebu);
                            Integer num = this.LJFF.LJLIL.LIZJ;
                            if (num == null) {
                                int LIZIZ = C7MY.LIZIZ(12);
                                int LIZIZ2 = C7MY.LIZIZ(16);
                                View view6 = this.LJI;
                                if (view6 != null) {
                                    View findViewById3 = view6.findViewById(R.id.af_);
                                    o.LJIIIIZZ(findViewById3, "root.background_ll");
                                    C26338AVi.LJIIIZ(findViewById3, Integer.valueOf(LIZIZ), Integer.valueOf(LIZIZ2), Integer.valueOf(LIZIZ), Integer.valueOf(LIZIZ2), 16);
                                    i2 = 8;
                                } else {
                                    o.LJIJI("root");
                                    throw null;
                                }
                            } else {
                                int LIZIZ3 = C7MY.LIZIZ(16);
                                View view7 = this.LJI;
                                if (view7 != null) {
                                    View findViewById4 = view7.findViewById(R.id.af_);
                                    o.LJIIIIZZ(findViewById4, "root.background_ll");
                                    C26338AVi.LJIIIZ(findViewById4, Integer.valueOf(LIZIZ3), Integer.valueOf(LIZIZ3), Integer.valueOf(LIZIZ3), Integer.valueOf(LIZIZ3), 16);
                                    tuxIconView.setIconRes(num.intValue());
                                } else {
                                    o.LJIJI("root");
                                    throw null;
                                }
                            }
                            tuxIconView.setVisibility(i2);
                            Integer num2 = this.LJFF.LJLIL.LIZLLL;
                            if (num2 != null) {
                                tuxIconView.setTintColor(num2.intValue());
                                return;
                            }
                            return;
                        }
                        o.LJIJI("root");
                        throw null;
                    }
                    o.LJIJI("root");
                    throw null;
                }
                throw new NoSuchElementException();
            }
            o.LJIJI("root");
            throw null;
        }
        o.LJIJI("root");
        throw null;
    }
}
