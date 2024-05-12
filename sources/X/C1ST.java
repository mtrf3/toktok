package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import n.b;
import o7a.i;
import p8.a;

/* renamed from: X.1ST, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ST implements InterfaceC17000lc, C0K7 {
    public final /* synthetic */ int LJLIL;

    public /* synthetic */ C1ST(int i) {
        this.LJLIL = i;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
        C75017TcL.LJIJ(this.LJLIL, "ok");
    }

    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v28 */
    @Override // X.InterfaceC17000lc
    public View LJ(Context context, ViewGroup viewGroup, boolean z) {
        ?? r1;
        int i;
        int i2;
        switch (this.LJLIL) {
            case 0:
                Resources resources = context.getResources();
                ConstraintLayout LIZJ = C1P1.LIZJ(context, R.id.d79);
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.ch});
                LIZJ.setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                obtainStyledAttributes.recycle();
                ViewGroup.MarginLayoutParams LJ = b.LJ(-1, -2, viewGroup);
                TuxIconView LIZIZ = C08880Wm.LIZIZ(context, R.id.d7_);
                C018905p c018905p = new C018905p((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p)) {
                    c018905p.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
                }
                i.LIZ("app:tux_tintColor", C4YR.LIZ("2131755371", "raw", "app:tux_icon", LIZIZ, c018905p, "2130968641", "attr"), LIZIZ, c018905p);
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.startToStart = 0;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.topToTop = 0;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.bottomToBottom = 0;
                }
                b.LIZ(LIZIZ);
                if (LIZIZ.getParent() == null) {
                    LIZJ.addView(LIZIZ, c018905p);
                }
                TuxTextView LIZJ2 = C06420Na.LIZJ(context, R.id.d7a);
                LIZJ2.setEllipsize(TextUtils.TruncateAt.END);
                LIZJ2.setMaxLines(1);
                TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                LIZJ2.setTextColor(obtainStyledAttributes2.getColor(0, 0));
                obtainStyledAttributes2.recycle();
                C018905p c018905p2 = new C018905p(-2, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    r1 = 1;
                    c018905p2.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
                } else {
                    r1 = 1;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    c018905p2.setMarginStart((int) TypedValue.applyDimension(r1, 4.0f, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    ((ViewGroup.MarginLayoutParams) c018905p2).topMargin = (int) TypedValue.applyDimension(r1, 10.0f, resources.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    ((ViewGroup.MarginLayoutParams) c018905p2).bottomMargin = (int) TypedValue.applyDimension(r1, 10.0f, resources.getDisplayMetrics());
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.constrainedWidth = r1;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.endToStart = R.id.d78;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.horizontalBias = 0.0f;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.startToEnd = R.id.d7_;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    i = 0;
                    c018905p2.topToTop = 0;
                } else {
                    i = 0;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.bottomToBottom = i;
                }
                if (C48690J9a.LJIIJ("P2_Semibold", "app:tux_font", LIZJ2, c018905p2, LIZJ2) == null) {
                    LIZJ.addView(LIZJ2, c018905p2);
                }
                TuxIconView LIZIZ2 = C08880Wm.LIZIZ(context, R.id.d78);
                C018905p c018905p3 = new C018905p((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p3)) {
                    c018905p3.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
                }
                new i();
                i.LIZ("app:tux_iconWidth", new a.d("16", "dp"), LIZIZ2, c018905p3);
                i.LIZ("app:tux_iconHeight", new a.d("16", "dp"), LIZIZ2, c018905p3);
                i.LIZ("app:tux_icon", new a.b("2131755496", "raw"), LIZIZ2, c018905p3);
                i.LIZ("app:tux_tintColor", new a.b("2130968641", "attr"), LIZIZ2, c018905p3);
                if (C018905p.class.isInstance(c018905p3)) {
                    i2 = 0;
                    c018905p3.endToEnd = 0;
                } else {
                    i2 = 0;
                }
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.topToTop = i2;
                }
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.bottomToBottom = i2;
                }
                b.LIZ(LIZIZ2);
                if (LIZIZ2.getParent() == null) {
                    LIZJ.addView(LIZIZ2, c018905p3);
                }
                b.LIZ(LIZJ);
                LIZJ.setLayoutParams(LJ);
                if (viewGroup != null && z) {
                    viewGroup.addView(LIZJ);
                }
                return LIZJ;
            case 1:
                context.getResources();
                View frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.rn);
                frameLayout.setVisibility(8);
                ViewGroup.LayoutParams LJ2 = b.LJ(-1, -1, viewGroup);
                b.LIZ(frameLayout);
                frameLayout.setLayoutParams(LJ2);
                if (viewGroup != null && z) {
                    viewGroup.addView(frameLayout);
                }
                return frameLayout;
            default:
                Resources resources2 = context.getResources();
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setFitsSystemWindows(true);
                ViewGroup.MarginLayoutParams LJ3 = b.LJ(-1, -1, viewGroup);
                C252709vu c252709vu = new C252709vu(context);
                c252709vu.setId(R.id.gwg);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 44.0f, resources2.getDisplayMetrics()));
                b.LIZ(c252709vu);
                if (c252709vu.getParent() == null) {
                    linearLayout.addView(c252709vu, layoutParams);
                }
                View view = new View(context);
                TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dv});
                view.setBackgroundColor(obtainStyledAttributes3.getColor(0, 0));
                obtainStyledAttributes3.recycle();
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.5f, resources2.getDisplayMetrics()));
                b.LIZ(view);
                if (view.getParent() == null) {
                    linearLayout.addView(view, layoutParams2);
                }
                View LIZ = C16950lX.LIZ(context, R.layout.co0, linearLayout, false, R.layout.co2);
                if (LIZ.getParent() == null) {
                    linearLayout.addView(LIZ);
                }
                b.LIZ(linearLayout);
                linearLayout.setLayoutParams(LJ3);
                if (viewGroup != null && z) {
                    viewGroup.addView(linearLayout);
                }
                return linearLayout;
        }
    }
}
