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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.Stack;
import n.b;
import o7a.m;
import p8.a;

/* renamed from: X.1TJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1TJ implements InterfaceC17000lc, C15X {
    public final /* synthetic */ int LJLIL;

    public /* synthetic */ C1TJ(int i) {
        this.LJLIL = i;
    }

    @Override // X.InterfaceC17000lc
    public View LJ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        switch (this.LJLIL) {
            case 0:
                context.getResources();
                View frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.aqo);
                ViewGroup.LayoutParams LJ = b.LJ(-1, -2, viewGroup);
                b.LIZ(frameLayout);
                frameLayout.setLayoutParams(LJ);
                if (viewGroup != null && z) {
                    viewGroup.addView(frameLayout);
                }
                return frameLayout;
            default:
                Resources resources = context.getResources();
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                linearLayout.setId(R.id.gjh);
                ViewGroup.LayoutParams LJ2 = b.LJ(-1, -2, viewGroup);
                if (LinearLayout.LayoutParams.class.isInstance(LJ2)) {
                    ((LinearLayout.LayoutParams) LJ2).gravity = 16;
                }
                if (FrameLayout.LayoutParams.class.isInstance(LJ2)) {
                    ((FrameLayout.LayoutParams) LJ2).gravity = 16;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(LJ2)) {
                    ((DrawerLayout$LayoutParams) LJ2).gravity = 16;
                }
                ConstraintLayout LIZJ = C1P1.LIZJ(context, R.id.eng);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
                }
                TuxTextView LIZJ2 = C06420Na.LIZJ(context, R.id.ena);
                LIZJ2.setEllipsize(TextUtils.TruncateAt.END);
                LIZJ2.setMaxLines(1);
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.go});
                LIZJ2.setTextColor(obtainStyledAttributes.getColor(0, 0));
                obtainStyledAttributes.recycle();
                LIZJ2.setTextDirection(5);
                C018905p c018905p = new C018905p((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
                new m();
                m.LIZ("android:breakStrategy", new a.c("simple"), LIZJ2, c018905p);
                m.LIZ("app:tux_font", new a.c("H4_Semibold"), LIZJ2, c018905p);
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.bottomToBottom = 0;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.endToStart = R.id.enf;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.horizontalBias = 0.0f;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.horizontalChainStyle = 2;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    i = 0;
                    c018905p.startToStart = 0;
                } else {
                    i = 0;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.topToTop = i;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.matchConstraintDefaultWidth = 1;
                }
                b.LIZ(LIZJ2);
                if (LIZJ2.getParent() == null) {
                    LIZJ.addView(LIZJ2, c018905p);
                }
                TuxTextView LIZJ3 = C06420Na.LIZJ(context, R.id.enf);
                TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.gx});
                LIZJ3.setTextColor(obtainStyledAttributes2.getColor(0, 0));
                obtainStyledAttributes2.recycle();
                LIZJ3.setVisibility(8);
                C018905p c018905p2 = new C018905p(-2, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    c018905p2.setMarginStart((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    i2 = 0;
                    c018905p2.bottomToBottom = 0;
                } else {
                    i2 = 0;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.endToEnd = i2;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.startToEnd = R.id.ena;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.topToTop = 0;
                }
                if (C48690J9a.LJIIJ("H4_Semibold", "app:tux_font", LIZJ3, c018905p2, LIZJ3) == null) {
                    LIZJ.addView(LIZJ3, c018905p2);
                }
                b.LIZ(LIZJ);
                if (LIZJ.getParent() == null) {
                    linearLayout.addView(LIZJ, layoutParams);
                }
                TuxTextView tuxTextView = new TuxTextView(context);
                tuxTextView.setTextDirection(5);
                tuxTextView.setId(R.id.en3);
                tuxTextView.setMaxLines(2);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.go});
                tuxTextView.setTextColor(obtainStyledAttributes3.getColor(0, 0));
                obtainStyledAttributes3.recycle();
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                new m();
                m.LIZ("android:breakStrategy", new a.c("simple"), tuxTextView, layoutParams2);
                tuxTextView.setGravity(16);
                if (i0.LIZLLL("app:tux_font", new a.c("H4_Regular"), tuxTextView, layoutParams2, tuxTextView) == null) {
                    linearLayout.addView(tuxTextView, layoutParams2);
                }
                b.LIZ(linearLayout);
                linearLayout.setLayoutParams(LJ2);
                if (viewGroup != null && z) {
                    viewGroup.addView(linearLayout);
                }
                return linearLayout;
        }
    }

    @Override // X.C15X
    public void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        Stack stack = (Stack) ((LinkedHashMap) C30249Bu1.LIZIZ).get(Integer.valueOf(this.LJLIL));
        if (stack != null) {
            stack.push(view);
        }
    }
}
