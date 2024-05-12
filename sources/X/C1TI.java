package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.filter.repository.internal.main.FilterCategoryExtra;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import defpackage.i0;
import defpackage.m0;
import n.b;
import o7a.i;
import o7a.m;
import p8.a;

/* renamed from: X.1TI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1TI implements InterfaceC17000lc, InterfaceC82281WQz {
    public final int LJLIL;

    public /* synthetic */ C1TI(int i) {
        this.LJLIL = i;
    }

    @Override // X.InterfaceC82281WQz
    public boolean LIZ(FilterCategoryExtra filterCategoryExtra) {
        String abGroup = filterCategoryExtra.getAbGroup();
        if (abGroup != null) {
            if (C1DH.LJJJIL(abGroup) != this.LJLIL) {
                return false;
            }
            return true;
        }
        if (this.LJLIL != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC17000lc
    public View LJ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        float f3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        switch (this.LJLIL) {
            case 0:
                Resources resources = context.getResources();
                RelativeLayout relativeLayout = new RelativeLayout(context);
                relativeLayout.setId(R.id.j7c);
                relativeLayout.setVisibility(8);
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.d5});
                relativeLayout.setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                obtainStyledAttributes.recycle();
                ViewGroup.MarginLayoutParams LJ = b.LJ(-1, -2, viewGroup);
                TuxIconView LIZ = C48339Iy7.LIZ(context, R.id.cg8, 8);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
                    layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
                    layoutParams.addRule(15, -1);
                }
                new i();
                i.LIZ("app:tux_icon", new a.b("2131756411", "raw"), LIZ, layoutParams);
                i.LIZ("app:tux_tintColor", new a.b("2130968641", "attr"), LIZ, layoutParams);
                b.LIZ(LIZ);
                if (LIZ.getParent() == null) {
                    relativeLayout.addView(LIZ, layoutParams);
                }
                TuxTextView LIZ2 = b0.LIZ(context, R.id.cg9, R.string.ge3);
                TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                LIZ2.setTextColor(obtainStyledAttributes2.getColor(0, 0));
                obtainStyledAttributes2.recycle();
                LIZ2.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    layoutParams2.addRule(13, -1);
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
                    layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
                    layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    i = R.id.cg8;
                    layoutParams2.addRule(17, R.id.cg8);
                } else {
                    i = R.id.cg8;
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    layoutParams2.addRule(1, i);
                }
                if (C1FJ.LIZ("P2_Semibold", "app:tux_font", LIZ2, layoutParams2, LIZ2) == null) {
                    relativeLayout.addView(LIZ2, layoutParams2);
                }
                TuxTextView tuxTextView = new TuxTextView(context);
                tuxTextView.setId(R.id.cfz);
                tuxTextView.setText("0%");
                TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                tuxTextView.setTextColor(obtainStyledAttributes3.getColor(0, 0));
                obtainStyledAttributes3.recycle();
                tuxTextView.setVisibility(8);
                tuxTextView.setMaxLines(1);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()), -2);
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    i2 = -1;
                    layoutParams3.addRule(9, -1);
                } else {
                    i2 = -1;
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    layoutParams3.addRule(20, i2);
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    layoutParams3.addRule(13, i2);
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
                    f = 16.0f;
                    ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
                } else {
                    f = 16.0f;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
                    layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                }
                new m();
                m.LIZ("app:tux_font", new a.c("P2_Regular"), tuxTextView, layoutParams3);
                m.LIZ("app:tux_minTextSize", new a.d("11", "dp"), tuxTextView, layoutParams3);
                b.LIZ(tuxTextView);
                if (tuxTextView.getParent() == null) {
                    relativeLayout.addView(tuxTextView, layoutParams3);
                }
                TuxTextView LIZ3 = b0.LIZ(context, R.id.cgc, R.string.q_k);
                TypedArray obtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                LIZ3.setTextColor(obtainStyledAttributes4.getColor(0, 0));
                obtainStyledAttributes4.recycle();
                LIZ3.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
                    f2 = 16.0f;
                    layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
                } else {
                    f2 = 16.0f;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
                    layoutParams4.addRule(17, R.id.cfz);
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
                    layoutParams4.addRule(1, R.id.cfz);
                }
                if (C1FJ.LIZ("P2_Regular", "app:tux_font", LIZ3, layoutParams4, LIZ3) == null) {
                    relativeLayout.addView(LIZ3, layoutParams4);
                }
                TuxTextView tuxTextView2 = new TuxTextView(context);
                tuxTextView2.setId(R.id.cfq);
                tuxTextView2.setClickable(true);
                tuxTextView2.setFocusable(true);
                tuxTextView2.setText(R.string.gdu);
                TypedArray obtainStyledAttributes5 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                tuxTextView2.setTextColor(obtainStyledAttributes5.getColor(0, 0));
                obtainStyledAttributes5.recycle();
                tuxTextView2.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
                    i3 = -1;
                    layoutParams5.addRule(21, -1);
                } else {
                    i3 = -1;
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
                    layoutParams5.addRule(11, i3);
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
                    layoutParams5.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                }
                if (C1FJ.LIZ("P2_Semibold", "app:tux_font", tuxTextView2, layoutParams5, tuxTextView2) == null) {
                    relativeLayout.addView(tuxTextView2, layoutParams5);
                }
                TuxTextView tuxTextView3 = new TuxTextView(context);
                tuxTextView3.setId(R.id.cg1);
                tuxTextView3.setClickable(true);
                tuxTextView3.setFocusable(true);
                tuxTextView3.setText(R.string.gdu);
                TypedArray obtainStyledAttributes6 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                tuxTextView3.setTextColor(obtainStyledAttributes6.getColor(0, 0));
                obtainStyledAttributes6.recycle();
                tuxTextView3.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
                    layoutParams6.addRule(21, -1);
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
                    layoutParams6.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                }
                if (C1FJ.LIZ("P2_Regular", "app:tux_font", tuxTextView3, layoutParams6, tuxTextView3) == null) {
                    relativeLayout.addView(tuxTextView3, layoutParams6);
                }
                TuxTextView tuxTextView4 = new TuxTextView(context);
                tuxTextView4.setId(R.id.cfr);
                tuxTextView4.setClickable(true);
                tuxTextView4.setFocusable(true);
                tuxTextView4.setText(R.string.gdw);
                TypedArray obtainStyledAttributes7 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                tuxTextView4.setTextColor(obtainStyledAttributes7.getColor(0, 0));
                obtainStyledAttributes7.recycle();
                tuxTextView4.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams7).bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
                    f3 = 16.0f;
                    layoutParams7.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
                } else {
                    f3 = 16.0f;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
                    layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, f3, resources.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
                    layoutParams7.addRule(0, R.id.cfq);
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
                    layoutParams7.addRule(16, R.id.cfq);
                }
                if (C1FJ.LIZ("P2_Regular", "app:tux_font", tuxTextView4, layoutParams7, tuxTextView4) == null) {
                    relativeLayout.addView(tuxTextView4, layoutParams7);
                }
                b.LIZ(relativeLayout);
                relativeLayout.setLayoutParams(LJ);
                if (viewGroup != null && z) {
                    viewGroup.addView(relativeLayout);
                }
                return relativeLayout;
            case 1:
                Resources resources2 = context.getResources();
                LinearLayout LIZ4 = C0NY.LIZ(context, R.id.jb0, 1);
                ViewGroup.LayoutParams LJ2 = b.LJ(-1, -2, viewGroup);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setId(R.id.jaz);
                linearLayout.setVisibility(8);
                linearLayout.setOrientation(1);
                TypedArray obtainStyledAttributes8 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.cl});
                linearLayout.setBackgroundColor(obtainStyledAttributes8.getColor(0, 0));
                obtainStyledAttributes8.recycle();
                linearLayout.setPadding(C1I1.LIZJ(linearLayout, linearLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()), linearLayout.getPaddingRight()), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 13.0f, resources2.getDisplayMetrics()));
                LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = (int) TypedValue.applyDimension(1, 12.5f, resources2.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin = (int) TypedValue.applyDimension(1, 12.5f, resources2.getDisplayMetrics());
                }
                C16950lX.LIZ(context, R.layout.b7d, linearLayout, true, 0);
                RelativeLayout relativeLayout2 = new RelativeLayout(context);
                LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams9).topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics());
                }
                TuxTextView LIZ5 = b0.LIZ(context, R.id.jay, R.string.gzq);
                TypedArray obtainStyledAttributes9 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.gv});
                LIZ5.setTextColor(obtainStyledAttributes9.getColor(0, 0));
                obtainStyledAttributes9.recycle();
                RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
                    layoutParams10.addRule(13, -1);
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
                    i4 = 1;
                    layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 56.0f, resources2.getDisplayMetrics()));
                } else {
                    i4 = 1;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
                    layoutParams10.setMarginEnd((int) TypedValue.applyDimension(i4, 16.0f, resources2.getDisplayMetrics()));
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
                    layoutParams10.addRule(16, R.id.bfv);
                }
                m.LIZ("app:tux_font", m0.LIZJ(LIZ5, 17, "P1_Regular"), LIZ5, layoutParams10);
                b.LIZ(LIZ5);
                if (LIZ5.getParent() == null) {
                    relativeLayout2.addView(LIZ5, layoutParams10);
                }
                TuxIconView LIZIZ = C08880Wm.LIZIZ(context, R.id.bfv);
                RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources2.getDisplayMetrics()));
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
                    layoutParams11.addRule(21, -1);
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
                    layoutParams11.setMarginEnd((int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
                }
                new i();
                i.LIZ("app:tux_icon", new a.b("2131756485", "raw"), LIZIZ, layoutParams11);
                i.LIZ("app:tux_tintColor", new a.b("2130968764", "attr"), LIZIZ, layoutParams11);
                b.LIZ(LIZIZ);
                if (LIZIZ.getParent() == null) {
                    relativeLayout2.addView(LIZIZ, layoutParams11);
                }
                b.LIZ(relativeLayout2);
                if (relativeLayout2.getParent() == null) {
                    linearLayout.addView(relativeLayout2, layoutParams9);
                }
                FrameLayout LIZJ = C62850Ola.LIZJ(context, R.id.fjx, 8);
                ViewGroup.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setId(R.id.euv);
                linearLayout2.setOrientation(0);
                linearLayout2.setVisibility(0);
                FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-1, -2);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams13)) {
                    i5 = 17;
                    ((LinearLayout.LayoutParams) layoutParams13).gravity = 17;
                } else {
                    i5 = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams13)) {
                    layoutParams13.gravity = i5;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams13)) {
                    ((DrawerLayout$LayoutParams) layoutParams13).gravity = i5;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
                    i6 = 1;
                    ((ViewGroup.MarginLayoutParams) layoutParams13).leftMargin = (int) TypedValue.applyDimension(1, 24.0f, resources2.getDisplayMetrics());
                } else {
                    i6 = 1;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams13).topMargin = (int) TypedValue.applyDimension(i6, 20.0f, resources2.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams13).rightMargin = (int) TypedValue.applyDimension(i6, 24.0f, resources2.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams13).bottomMargin = (int) TypedValue.applyDimension(i6, 20.0f, resources2.getDisplayMetrics());
                }
                C62846OlW c62846OlW = new C62846OlW(context);
                c62846OlW.setId(R.id.bsx);
                LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 120.0f, resources2.getDisplayMetrics()));
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
                    layoutParams14.weight = 1;
                }
                n8.a aVar = new n8.a();
                aVar.LIZLLL("app:actualImageScaleType", new a.c("fitCenter"), c62846OlW, layoutParams14);
                aVar.LIZJ(c62846OlW, layoutParams14);
                b.LIZ(c62846OlW);
                if (c62846OlW.getParent() == null) {
                    linearLayout2.addView(c62846OlW, layoutParams14);
                }
                b.LIZ(linearLayout2);
                if (linearLayout2.getParent() == null) {
                    LIZJ.addView(linearLayout2, layoutParams13);
                }
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.euw);
                frameLayout.setBackgroundResource(R.drawable.bhb);
                frameLayout.setVisibility(8);
                FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 88.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources2.getDisplayMetrics()));
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams15)) {
                    i7 = 17;
                    ((LinearLayout.LayoutParams) layoutParams15).gravity = 17;
                } else {
                    i7 = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams15)) {
                    layoutParams15.gravity = i7;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams15)) {
                    ((DrawerLayout$LayoutParams) layoutParams15).gravity = i7;
                }
                TuxTextView tuxTextView5 = new TuxTextView(context);
                tuxTextView5.setText(R.string.h8i);
                TypedArray obtainStyledAttributes10 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.gu});
                tuxTextView5.setTextColor(obtainStyledAttributes10.getColor(0, 0));
                obtainStyledAttributes10.recycle();
                FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-2, -2);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams16)) {
                    i8 = 17;
                    ((LinearLayout.LayoutParams) layoutParams16).gravity = 17;
                } else {
                    i8 = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams16)) {
                    layoutParams16.gravity = i8;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams16)) {
                    ((DrawerLayout$LayoutParams) layoutParams16).gravity = i8;
                }
                new m();
                m.LIZ("app:tux_font", new a.c("P1_Semibold"), tuxTextView5, layoutParams16);
                b.LIZ(tuxTextView5);
                if (tuxTextView5.getParent() == null) {
                    frameLayout.addView(tuxTextView5, layoutParams16);
                }
                b.LIZ(frameLayout);
                if (frameLayout.getParent() == null) {
                    LIZJ.addView(frameLayout, layoutParams15);
                }
                TuxIconView LIZ6 = C48339Iy7.LIZ(context, R.id.g7v, 0);
                FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams17)) {
                    i9 = 17;
                    ((LinearLayout.LayoutParams) layoutParams17).gravity = 17;
                } else {
                    i9 = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams17)) {
                    layoutParams17.gravity = i9;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams17)) {
                    ((DrawerLayout$LayoutParams) layoutParams17).gravity = i9;
                }
                new i();
                i.LIZ("app:tux_icon", new a.b("2131756320", "raw"), LIZ6, layoutParams17);
                if (V1I.LIZ("app:tux_tintColor", new a.b("2130968764", "attr"), LIZ6, layoutParams17, LIZ6) == null) {
                    LIZJ.addView(LIZ6, layoutParams17);
                }
                b.LIZ(LIZJ);
                if (LIZJ.getParent() == null) {
                    linearLayout.addView(LIZJ, layoutParams12);
                }
                TuxTextView tuxTextView6 = new TuxTextView(context);
                tuxTextView6.setId(R.id.cuu);
                tuxTextView6.setVisibility(8);
                LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 108.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 131.0f, resources2.getDisplayMetrics()));
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams18)) {
                    i10 = 17;
                    layoutParams18.gravity = 17;
                } else {
                    i10 = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams18)) {
                    ((FrameLayout.LayoutParams) layoutParams18).gravity = i10;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams18)) {
                    ((DrawerLayout$LayoutParams) layoutParams18).gravity = i10;
                }
                new m();
                m.LIZ("app:tux_font", new a.c("H1_Bold"), tuxTextView6, layoutParams18);
                tuxTextView6.setGravity(i10);
                b.LIZ(tuxTextView6);
                if (tuxTextView6.getParent() == null) {
                    linearLayout.addView(tuxTextView6, layoutParams18);
                }
                View recyclerView = new RecyclerView(context, null);
                recyclerView.setId(R.id.j9y);
                recyclerView.setVisibility(8);
                LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-2, -2);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams19)) {
                    i11 = 17;
                    layoutParams19.gravity = 17;
                } else {
                    i11 = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams19)) {
                    ((FrameLayout.LayoutParams) layoutParams19).gravity = i11;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams19)) {
                    ((DrawerLayout$LayoutParams) layoutParams19).gravity = i11;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams19).leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams19).topMargin = (int) TypedValue.applyDimension(1, 18.0f, resources2.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams19).rightMargin = (int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams19).bottomMargin = (int) TypedValue.applyDimension(1, 18.0f, resources2.getDisplayMetrics());
                }
                b.LIZ(recyclerView);
                if (recyclerView.getParent() == null) {
                    linearLayout.addView(recyclerView, layoutParams19);
                }
                b.LIZ(linearLayout);
                if (linearLayout.getParent() == null) {
                    LIZ4.addView(linearLayout, layoutParams8);
                }
                b.LIZ(LIZ4);
                LIZ4.setLayoutParams(LJ2);
                if (viewGroup != null && z) {
                    viewGroup.addView(LIZ4);
                }
                return LIZ4;
            default:
                Resources resources3 = context.getResources();
                LinearLayout LIZ7 = C0EM.LIZ(context, R.id.l4t);
                LIZ7.setPadding(C1I1.LIZJ(LIZ7, (int) resources3.getDimension(R.dimen.o1), LIZ7.getPaddingTop(), LIZ7.getPaddingRight()), LIZ7.getPaddingTop(), (int) resources3.getDimension(R.dimen.o1), LIZ7.getPaddingBottom());
                LIZ7.setBackgroundResource(R.drawable.a3o);
                ViewGroup.MarginLayoutParams LJ3 = b.LJ(-2, -2, viewGroup);
                if (ViewGroup.MarginLayoutParams.class.isInstance(LJ3)) {
                    LJ3.setMarginEnd((int) resources3.getDimension(R.dimen.o2));
                }
                LIZ7.setGravity(17);
                TuxIconView tuxIconView = new TuxIconView(context);
                tuxIconView.setId(R.id.f5w);
                tuxIconView.setScaleType(ImageView.ScaleType.FIT_XY);
                LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources3.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources3.getDisplayMetrics()));
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20)) {
                    layoutParams20.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources3.getDisplayMetrics()));
                }
                if (C74221TAz.LIZIZ("app:tux_tintColor", C07670Rv.LIZJ("2131755897", "raw", "app:tux_icon", tuxIconView, layoutParams20, "2130968641", "attr"), tuxIconView, layoutParams20, tuxIconView) == null) {
                    LIZ7.addView(tuxIconView, layoutParams20);
                }
                TuxTextView tuxTextView7 = new TuxTextView(context);
                tuxTextView7.setId(R.id.m_d);
                tuxTextView7.setMaxLines(1);
                tuxTextView7.setText(R.string.s71);
                TypedArray obtainStyledAttributes11 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                tuxTextView7.setTextColor(obtainStyledAttributes11.getColor(0, 0));
                obtainStyledAttributes11.recycle();
                LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 22.0f, resources3.getDisplayMetrics()));
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams21)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams21).topMargin = (int) TypedValue.applyDimension(1, 0.5f, resources3.getDisplayMetrics());
                }
                if (i0.LIZLLL("app:tux_font", m0.LIZJ(tuxTextView7, 17, "P2_Semibold"), tuxTextView7, layoutParams21, tuxTextView7) == null) {
                    LIZ7.addView(tuxTextView7, layoutParams21);
                }
                b.LIZ(LIZ7);
                LIZ7.setLayoutParams(LJ3);
                if (viewGroup != null && z) {
                    viewGroup.addView(LIZ7);
                }
                return LIZ7;
        }
    }
}
