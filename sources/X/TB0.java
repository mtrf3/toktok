package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import n.b;

/* loaded from: classes13.dex */
public final class TB0 implements InterfaceC17000lc {
    public int LJLIL;

    public /* synthetic */ TB0() {
    }

    public /* synthetic */ TB0(int i) {
        this.LJLIL = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC17000lc
    public View LJ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        switch (this.LJLIL) {
            case 0:
                Resources resources = context.getResources();
                ConstraintLayout constraintLayout = new ConstraintLayout(context);
                constraintLayout.setId(R.id.n6u);
                constraintLayout.setBackgroundResource(R.drawable.ahd);
                constraintLayout.setClickable(true);
                ViewGroup.MarginLayoutParams LJ = b.LJ(-1, -1, viewGroup);
                AppCompatImageView appCompatImageView = new AppCompatImageView(context);
                appCompatImageView.setId(R.id.e_q);
                appCompatImageView.setImageResource(R.drawable.a9h);
                C018905p c018905p = new C018905p((int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 72.0f, resources.getDisplayMetrics()));
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.bottomToTop = R.id.title;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.endToEnd = 0;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.startToStart = 0;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.topToTop = 0;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.verticalChainStyle = 2;
                }
                b.LIZ(appCompatImageView);
                if (appCompatImageView.getParent() == null) {
                    constraintLayout.addView(appCompatImageView, c018905p);
                }
                TuxTextView tuxTextView = new TuxTextView(context);
                tuxTextView.setId(R.id.title);
                tuxTextView.setText("Thanks for reporting");
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
                obtainStyledAttributes.recycle();
                C018905p c018905p2 = new C018905p((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    c018905p2.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    ((ViewGroup.MarginLayoutParams) c018905p2).topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    c018905p2.setMarginEnd((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
                }
                tuxTextView.setGravity(17);
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.bottomToTop = R.id.bst;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.endToEnd = 0;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.startToStart = 0;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.topToBottom = R.id.e_q;
                }
                if (C48690J9a.LJIIJ("H3_Semibold", "app:tux_font", tuxTextView, c018905p2, tuxTextView) == null) {
                    constraintLayout.addView(tuxTextView, c018905p2);
                }
                TuxTextView LIZJ = C06420Na.LIZJ(context, R.id.bst);
                TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dk});
                LIZJ.setTextColor(obtainStyledAttributes2.getColor(0, 0));
                obtainStyledAttributes2.recycle();
                C018905p c018905p3 = new C018905p((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p3)) {
                    c018905p3.setMarginStart((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p3)) {
                    ((ViewGroup.MarginLayoutParams) c018905p3).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p3)) {
                    c018905p3.setMarginEnd((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
                }
                LIZJ.setGravity(17);
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.bottomToTop = R.id.b1h;
                }
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.endToEnd = 0;
                }
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.startToStart = 0;
                }
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.topToBottom = R.id.title;
                }
                if (C48690J9a.LJIIJ("P1_Regular", "app:tux_font", LIZJ, c018905p3, LIZJ) == null) {
                    constraintLayout.addView(LIZJ, c018905p3);
                }
                TuxTextView tuxTextView2 = new TuxTextView(context);
                tuxTextView2.setId(R.id.b1h);
                tuxTextView2.setBackgroundResource(R.drawable.ahe);
                TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                tuxTextView2.setTextColor(obtainStyledAttributes3.getColor(0, 0));
                obtainStyledAttributes3.recycle();
                C018905p c018905p4 = new C018905p((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p4)) {
                    c018905p4.setMarginStart((int) TypedValue.applyDimension(1, 32.5f, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p4)) {
                    c018905p4.setMarginEnd((int) TypedValue.applyDimension(1, 32.5f, resources.getDisplayMetrics()));
                }
                tuxTextView2.setGravity(17);
                if (C018905p.class.isInstance(c018905p4)) {
                    c018905p4.bottomToBottom = 0;
                }
                if (C018905p.class.isInstance(c018905p4)) {
                    c018905p4.endToEnd = 0;
                }
                if (C018905p.class.isInstance(c018905p4)) {
                    c018905p4.startToStart = 0;
                }
                if (C018905p.class.isInstance(c018905p4)) {
                    c018905p4.topToTop = 0;
                }
                if (C018905p.class.isInstance(c018905p4)) {
                    c018905p4.verticalBias = 0.8f;
                }
                if (C48690J9a.LJIIJ("H4_Semibold", "app:tux_font", tuxTextView2, c018905p4, tuxTextView2) == null) {
                    constraintLayout.addView(tuxTextView2, c018905p4);
                }
                b.LIZ(constraintLayout);
                constraintLayout.setLayoutParams(LJ);
                if (viewGroup != null && z) {
                    viewGroup.addView(constraintLayout);
                }
                return constraintLayout;
            default:
                Resources resources2 = context.getResources();
                ConstraintLayout LIZJ2 = C1P1.LIZJ(context, R.id.en4);
                if (TextView.class.isInstance(LIZJ2)) {
                    b.LJII((int) TypedValue.applyDimension(1, 56.0f, resources2.getDisplayMetrics()), LIZJ2);
                } else {
                    LIZJ2.setMinimumHeight((int) TypedValue.applyDimension(1, 56.0f, resources2.getDisplayMetrics()));
                }
                ViewGroup.LayoutParams LJ2 = b.LJ(-1, -2, viewGroup);
                View LIZJ3 = C62850Ola.LIZJ(context, R.id.enh, 8);
                C018905p c018905p5 = new C018905p(-2, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p5)) {
                    ((ViewGroup.MarginLayoutParams) c018905p5).topMargin = (int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p5)) {
                    ((ViewGroup.MarginLayoutParams) c018905p5).bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources2.getDisplayMetrics());
                }
                if (C018905p.class.isInstance(c018905p5)) {
                    c018905p5.bottomToTop = R.id.en9;
                }
                if (C018905p.class.isInstance(c018905p5)) {
                    c018905p5.endToEnd = 0;
                }
                if (C018905p.class.isInstance(c018905p5)) {
                    c018905p5.startToStart = 0;
                }
                if (C018905p.class.isInstance(c018905p5)) {
                    c018905p5.topToTop = 0;
                }
                b.LIZ(LIZJ3);
                if (LIZJ3.getParent() == null) {
                    LIZJ2.addView(LIZJ3, c018905p5);
                }
                LinearLayout LIZ = C0NY.LIZ(context, R.id.en9, 0);
                C018905p c018905p6 = new C018905p(-1, -2);
                if (C018905p.class.isInstance(c018905p6)) {
                    c018905p6.bottomToTop = R.id.en0;
                }
                if (C018905p.class.isInstance(c018905p6)) {
                    c018905p6.endToEnd = 0;
                }
                if (C018905p.class.isInstance(c018905p6)) {
                    c018905p6.startToStart = 0;
                }
                if (C018905p.class.isInstance(c018905p6)) {
                    c018905p6.topToBottom = R.id.enh;
                }
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.en7);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setPadding(frameLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics()), frameLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics()));
                frameLayout.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics()), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()), frameLayout.getPaddingBottom());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
                    layoutParams.gravity = 8388627;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 8388627;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
                    ((DrawerLayout$LayoutParams) layoutParams).gravity = 8388627;
                }
                b.LIZ(frameLayout);
                if (frameLayout.getParent() == null) {
                    LIZ.addView(frameLayout, layoutParams);
                }
                View LIZIZ = TB3.LIZIZ(context, R.id.en8);
                LIZIZ.setPadding(LIZIZ.getPaddingLeft(), (int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics()), LIZIZ.getPaddingRight(), (int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics()));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources2.getDisplayMetrics()), -1);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    layoutParams2.gravity = 16;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    ((FrameLayout.LayoutParams) layoutParams2).gravity = 16;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
                    ((DrawerLayout$LayoutParams) layoutParams2).gravity = 16;
                }
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    layoutParams2.weight = 1;
                }
                b.LIZ(LIZIZ);
                if (LIZIZ.getParent() == null) {
                    LIZ.addView(LIZIZ, layoutParams2);
                }
                View LIZIZ2 = TB3.LIZIZ(context, R.id.enc);
                LIZIZ2.setPadding((int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics()));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    layoutParams3.gravity = 8388629;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    ((FrameLayout.LayoutParams) layoutParams3).gravity = 8388629;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
                    ((DrawerLayout$LayoutParams) layoutParams3).gravity = 8388629;
                }
                b.LIZ(LIZIZ2);
                if (LIZIZ2.getParent() == null) {
                    LIZ.addView(LIZIZ2, layoutParams3);
                }
                b.LIZ(LIZ);
                if (LIZ.getParent() == null) {
                    LIZJ2.addView(LIZ, c018905p6);
                }
                View LIZJ4 = C62850Ola.LIZJ(context, R.id.en0, 8);
                C018905p c018905p7 = new C018905p(-1, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p7)) {
                    ((ViewGroup.MarginLayoutParams) c018905p7).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources2.getDisplayMetrics());
                }
                if (C018905p.class.isInstance(c018905p7)) {
                    i = 0;
                    c018905p7.bottomToBottom = 0;
                } else {
                    i = 0;
                }
                if (C018905p.class.isInstance(c018905p7)) {
                    c018905p7.endToEnd = i;
                }
                if (C018905p.class.isInstance(c018905p7)) {
                    c018905p7.startToStart = i;
                }
                if (C018905p.class.isInstance(c018905p7)) {
                    c018905p7.topToBottom = R.id.en9;
                }
                b.LIZ(LIZJ4);
                if (LIZJ4.getParent() == null) {
                    LIZJ2.addView(LIZJ4, c018905p7);
                }
                b.LIZ(LIZJ2);
                LIZJ2.setLayoutParams(LJ2);
                if (viewGroup != null && z) {
                    viewGroup.addView(LIZJ2);
                }
                return LIZJ2;
        }
    }
}
