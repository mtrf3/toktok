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
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import defpackage.m0;
import kotlin.jvm.internal.o;
import n.b;
import o7a.f;
import o7a.i;
import o7a.m;
import p8.a;

/* renamed from: X.1Ss, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33381Ss implements InterfaceC17000lc {
    public int LJLIL;

    public /* synthetic */ C33381Ss() {
    }

    public /* synthetic */ C33381Ss(int i) {
        this.LJLIL = i;
    }

    public V8E LIZ(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        return new V8E(ctx, this.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC17000lc
    public View LJ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        switch (this.LJLIL) {
            case 0:
                Resources resources = context.getResources();
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setId(R.id.j7n);
                linearLayout.setBaselineAligned(true);
                linearLayout.setOrientation(0);
                ViewGroup.LayoutParams LJ = b.LJ(-2, -2, viewGroup);
                C97203rg c97203rg = new C97203rg(context, null, 6);
                c97203rg.setId(R.id.title);
                c97203rg.setEllipsize(TextUtils.TruncateAt.END);
                c97203rg.setIncludeFontPadding(false);
                c97203rg.setMaxLines(1);
                c97203rg.setShadowLayer(c97203rg.getShadowRadius(), c97203rg.getShadowDx(), c97203rg.getShadowDy(), resources.getColor(R.color.ku));
                c97203rg.setShadowLayer(c97203rg.getShadowRadius(), c97203rg.getShadowDx(), 1.0f, c97203rg.getShadowColor());
                c97203rg.setShadowLayer(1.0f, c97203rg.getShadowDx(), c97203rg.getShadowDy(), c97203rg.getShadowColor());
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                c97203rg.setTextColor(obtainStyledAttributes.getColor(0, 0));
                obtainStyledAttributes.recycle();
                c97203rg.setSingleLine(true);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
                    layoutParams.weight = 1;
                }
                c97203rg.setGravity(16);
                new m();
                m.LIZ("app:tux_font", new a.c("H4_Semibold"), c97203rg, layoutParams);
                b.LIZ(c97203rg);
                if (c97203rg.getParent() == null) {
                    linearLayout.addView(c97203rg, layoutParams);
                }
                LinearLayout LIZ = C0EM.LIZ(context, R.id.k6i);
                LIZ.setPadding(C1I1.LIZJ(LIZ, (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), LIZ.getPaddingTop(), LIZ.getPaddingRight()), LIZ.getPaddingTop(), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), LIZ.getPaddingBottom());
                LIZ.setVisibility(8);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
                    layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
                }
                LIZ.setGravity(16);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    layoutParams2.gravity = 16;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    ((FrameLayout.LayoutParams) layoutParams2).gravity = 16;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
                    ((DrawerLayout$LayoutParams) layoutParams2).gravity = 16;
                }
                TuxIconView tuxIconView = new TuxIconView(context);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
                new i();
                i.LIZ("android:layout_marginVertical", new a.d("6", "dp"), tuxIconView, layoutParams3);
                i.LIZ("app:tux_icon", new a.b("2131756164", "raw"), tuxIconView, layoutParams3);
                i.LIZ("app:tux_tintColor", new a.b("2130968641", "attr"), tuxIconView, layoutParams3);
                b.LIZ(tuxIconView);
                if (tuxIconView.getParent() == null) {
                    LIZ.addView(tuxIconView, layoutParams3);
                }
                TuxTextView LIZJ = C06420Na.LIZJ(context, R.id.k6h);
                TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                LIZJ.setTextColor(obtainStyledAttributes2.getColor(0, 0));
                obtainStyledAttributes2.recycle();
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
                    layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
                }
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
                    layoutParams4.weight = 1;
                }
                new m();
                m.LIZ("android:breakStrategy", new a.c("simple"), LIZJ, layoutParams4);
                m.LIZ("app:tux_font", new a.c("P3_Semibold"), LIZJ, layoutParams4);
                b.LIZ(LIZJ);
                if (LIZJ.getParent() == null) {
                    LIZ.addView(LIZJ, layoutParams4);
                }
                C188627ak c188627ak = new C188627ak(context, null, 6);
                c188627ak.setId(R.id.k6g);
                c188627ak.setVisibility(8);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
                    layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
                }
                b.LIZ(c188627ak);
                if (c188627ak.getParent() == null) {
                    LIZ.addView(c188627ak, layoutParams5);
                }
                b.LIZ(LIZ);
                if (LIZ.getParent() == null) {
                    linearLayout.addView(LIZ, layoutParams2);
                }
                View c218518hr = new C218518hr(context);
                c218518hr.setId(R.id.kzw);
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
                    i = 16;
                    layoutParams6.gravity = 16;
                } else {
                    i = 16;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
                    ((FrameLayout.LayoutParams) layoutParams6).gravity = i;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams6)) {
                    ((DrawerLayout$LayoutParams) layoutParams6).gravity = i;
                }
                b.LIZ(c218518hr);
                if (c218518hr.getParent() == null) {
                    linearLayout.addView(c218518hr, layoutParams6);
                }
                TuxTextView LIZJ2 = C06420Na.LIZJ(context, R.id.mem);
                LIZJ2.setShadowLayer(LIZJ2.getShadowRadius(), LIZJ2.getShadowDx(), LIZJ2.getShadowDy(), resources.getColor(R.color.ku));
                LIZJ2.setShadowLayer(LIZJ2.getShadowRadius(), LIZJ2.getShadowDx(), 2.0f, LIZJ2.getShadowColor());
                LIZJ2.setShadowLayer(2.0f, LIZJ2.getShadowDx(), LIZJ2.getShadowDy(), LIZJ2.getShadowColor());
                LIZJ2.setTextAlignment(5);
                TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dm});
                LIZJ2.setTextColor(obtainStyledAttributes3.getColor(0, 0));
                obtainStyledAttributes3.recycle();
                LIZJ2.setTextDirection(5);
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
                    layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
                }
                if (i0.LIZLLL("app:tux_font", m0.LIZJ(LIZJ2, 8388611, "H4_Semibold"), LIZJ2, layoutParams7, LIZJ2) == null) {
                    linearLayout.addView(LIZJ2, layoutParams7);
                }
                b.LIZ(linearLayout);
                linearLayout.setLayoutParams(LJ);
                if (viewGroup != null && z) {
                    viewGroup.addView(linearLayout);
                }
                return linearLayout;
            case 1:
                Resources resources2 = context.getResources();
                FrameLayout LIZJ3 = C62850Ola.LIZJ(context, R.id.flf, 8);
                ViewGroup.MarginLayoutParams LJ2 = b.LJ(-2, (int) TypedValue.applyDimension(1, 32.0f, resources2.getDisplayMetrics()), viewGroup);
                if (ViewGroup.MarginLayoutParams.class.isInstance(LJ2)) {
                    LJ2.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
                }
                C71897SJp c71897SJp = new C71897SJp(context);
                c71897SJp.setId(R.id.b7o);
                FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
                    ((LinearLayout.LayoutParams) layoutParams8).gravity = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
                    layoutParams8.gravity = 17;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
                    ((DrawerLayout$LayoutParams) layoutParams8).gravity = 17;
                }
                new f();
                f.LIZ("app:tux_checkBoxShape", new a.c("circle"), c71897SJp, layoutParams8);
                f.LIZ("app:tux_checkBoxSize", new a.c("small"), c71897SJp, layoutParams8);
                b.LIZ(c71897SJp);
                if (c71897SJp.getParent() == null) {
                    LIZJ3.addView(c71897SJp, layoutParams8);
                }
                b.LIZ(LIZJ3);
                LIZJ3.setLayoutParams(LJ2);
                if (viewGroup != null && z) {
                    viewGroup.addView(LIZJ3);
                }
                return LIZJ3;
            default:
                Resources resources3 = context.getResources();
                FrameLayout frameLayout = new FrameLayout(context);
                ViewGroup.LayoutParams LJ3 = b.LJ(-1, (int) TypedValue.applyDimension(1, 0.5f, resources3.getDisplayMetrics()), viewGroup);
                View LIZIZ = V10.LIZIZ(context, R.id.frz);
                TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dg});
                LIZIZ.setBackgroundColor(obtainStyledAttributes4.getColor(0, 0));
                obtainStyledAttributes4.recycle();
                ViewGroup.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.5f, resources3.getDisplayMetrics()));
                b.LIZ(LIZIZ);
                if (LIZIZ.getParent() == null) {
                    frameLayout.addView(LIZIZ, layoutParams9);
                }
                View LIZIZ2 = V10.LIZIZ(context, R.id.fsb);
                TypedArray obtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dk});
                LIZIZ2.setBackgroundColor(obtainStyledAttributes5.getColor(0, 0));
                obtainStyledAttributes5.recycle();
                FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.5f, resources3.getDisplayMetrics()));
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
                    ((LinearLayout.LayoutParams) layoutParams10).gravity = 1;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
                    layoutParams10.gravity = 1;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams10)) {
                    ((DrawerLayout$LayoutParams) layoutParams10).gravity = 1;
                }
                b.LIZ(LIZIZ2);
                if (LIZIZ2.getParent() == null) {
                    frameLayout.addView(LIZIZ2, layoutParams10);
                }
                b.LIZ(frameLayout);
                frameLayout.setLayoutParams(LJ3);
                if (viewGroup != null && z) {
                    viewGroup.addView(frameLayout);
                }
                return frameLayout;
        }
    }
}
