package X;

import Y.IDhS105S0100000_12;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout;
import com.zhiliaoapp.musically.R;
import defpackage.b0;
import defpackage.q;
import kotlin.jvm.internal.o;
import n.b;
import o7a.m;
import p8.a;

/* renamed from: X.TAw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74218TAw implements InterfaceC48038ItG, InterfaceC17000lc {
    public int LJLIL;

    public /* synthetic */ C74218TAw() {
    }

    public /* synthetic */ C74218TAw(int i) {
        this.LJLIL = i;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        AbstractC73672Svk attempts = (AbstractC73672Svk) obj;
        o.LJIIIZ(attempts, "attempts");
        AbstractC73672Svk LJJIII = attempts.LJJIII(new IDhS105S0100000_12(this, 5), false);
        o.LJIIIIZZ(LJJIII, "override fun apply(attem…    }\n            }\n    }");
        return LJJIII;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC17000lc
    public View LJ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        switch (this.LJLIL) {
            case 0:
                Resources resources = context.getResources();
                SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = new SwipeUpGuideStrengthenLayout(context);
                swipeUpGuideStrengthenLayout.setId(R.id.kwt);
                swipeUpGuideStrengthenLayout.setAlpha(0.5f);
                swipeUpGuideStrengthenLayout.setBackgroundColor(resources.getColor(R.color.c_));
                ViewGroup.LayoutParams LJ = b.LJ(-1, -1, viewGroup);
                LinearLayout LIZ = q.LIZ(context, 1);
                ViewGroup.LayoutParams LJ2 = b.LJ(-1, -1, swipeUpGuideStrengthenLayout);
                RelativeLayout relativeLayout = new RelativeLayout(context);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                LinearLayout LIZ2 = q.LIZ(context, 1);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    layoutParams2.addRule(13, -1);
                }
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    ((FrameLayout.LayoutParams) layoutParams2).gravity = 17;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
                    ((DrawerLayout$LayoutParams) layoutParams2).gravity = 17;
                }
                View c77869UhF = new C77869UhF(context);
                c77869UhF.setId(R.id.f41);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 210.0f, resources.getDisplayMetrics()));
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    i = 17;
                    layoutParams3.gravity = 17;
                } else {
                    i = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    ((FrameLayout.LayoutParams) layoutParams3).gravity = i;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
                    ((DrawerLayout$LayoutParams) layoutParams3).gravity = i;
                }
                b.LIZ(c77869UhF);
                if (c77869UhF.getParent() == null) {
                    LIZ2.addView(c77869UhF, layoutParams3);
                }
                View lsy = new LSY(context);
                lsy.setId(R.id.f46);
                lsy.setVisibility(8);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 260.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 210.0f, resources.getDisplayMetrics()));
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
                    layoutParams4.gravity = 1;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
                    ((FrameLayout.LayoutParams) layoutParams4).gravity = 1;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
                    ((DrawerLayout$LayoutParams) layoutParams4).gravity = 1;
                }
                b.LIZ(lsy);
                if (lsy.getParent() == null) {
                    LIZ2.addView(lsy, layoutParams4);
                }
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setPadding(frameLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
                }
                TuxTextView LIZ3 = b0.LIZ(context, R.id.mli, R.string.ryt);
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                LIZ3.setTextColor(obtainStyledAttributes.getColor(0, 0));
                obtainStyledAttributes.recycle();
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
                LIZ3.setGravity(17);
                new m();
                m.LIZ("app:tux_font", new a.c("H1_Bold"), LIZ3, layoutParams6);
                b.LIZ(LIZ3);
                if (LIZ3.getParent() == null) {
                    frameLayout.addView(LIZ3, layoutParams6);
                }
                b.LIZ(frameLayout);
                if (frameLayout.getParent() == null) {
                    LIZ2.addView(frameLayout, layoutParams5);
                }
                FrameLayout frameLayout2 = new FrameLayout(context);
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
                    f = 32.0f;
                    i2 = 1;
                    ((ViewGroup.MarginLayoutParams) layoutParams7).leftMargin = (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics());
                } else {
                    f = 32.0f;
                    i2 = 1;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams7).rightMargin = (int) TypedValue.applyDimension(i2, f, resources.getDisplayMetrics());
                }
                TuxTextView LIZ4 = b0.LIZ(context, R.id.mlj, R.string.ryt);
                int[] iArr = new int[i2];
                iArr[0] = R.attr.dj;
                TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(iArr);
                LIZ4.setTextColor(obtainStyledAttributes2.getColor(0, 0));
                obtainStyledAttributes2.recycle();
                LIZ4.setVisibility(8);
                FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -2);
                LIZ4.setGravity(17);
                new m();
                m.LIZ("app:tux_font", new a.c("H2_Bold"), LIZ4, layoutParams8);
                b.LIZ(LIZ4);
                if (LIZ4.getParent() == null) {
                    frameLayout2.addView(LIZ4, layoutParams8);
                }
                b.LIZ(frameLayout2);
                if (frameLayout2.getParent() == null) {
                    LIZ2.addView(frameLayout2, layoutParams7);
                }
                b.LIZ(LIZ2);
                if (LIZ2.getParent() == null) {
                    relativeLayout.addView(LIZ2, layoutParams2);
                }
                b.LIZ(relativeLayout);
                if (relativeLayout.getParent() == null) {
                    LIZ.addView(relativeLayout, layoutParams);
                }
                b.LIZ(LIZ);
                if (LIZ.getParent() == null) {
                    swipeUpGuideStrengthenLayout.addView(LIZ, LJ2);
                }
                b.LIZ(swipeUpGuideStrengthenLayout);
                swipeUpGuideStrengthenLayout.setLayoutParams(LJ);
                if (viewGroup != null && z) {
                    viewGroup.addView(swipeUpGuideStrengthenLayout);
                }
                return swipeUpGuideStrengthenLayout;
            default:
                Resources resources2 = context.getResources();
                FrameLayout LIZIZ = TB3.LIZIZ(context, R.id.iaa);
                ViewGroup.LayoutParams LJ3 = b.LJ(-2, -2, viewGroup);
                if (LinearLayout.LayoutParams.class.isInstance(LJ3)) {
                    i3 = 17;
                    ((LinearLayout.LayoutParams) LJ3).gravity = 17;
                } else {
                    i3 = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(LJ3)) {
                    ((FrameLayout.LayoutParams) LJ3).gravity = i3;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(LJ3)) {
                    ((DrawerLayout$LayoutParams) LJ3).gravity = i3;
                }
                View t4v = new T4V(context, null);
                t4v.setId(R.id.cfh);
                FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 36.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 36.0f, resources2.getDisplayMetrics()));
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
                    i4 = 17;
                    ((LinearLayout.LayoutParams) layoutParams9).gravity = 17;
                } else {
                    i4 = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
                    layoutParams9.gravity = i4;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams9)) {
                    ((DrawerLayout$LayoutParams) layoutParams9).gravity = i4;
                }
                b.LIZ(t4v);
                if (t4v.getParent() == null) {
                    LIZIZ.addView(t4v, layoutParams9);
                }
                b.LIZ(LIZIZ);
                LIZIZ.setLayoutParams(LJ3);
                if (viewGroup != null && z) {
                    viewGroup.addView(LIZIZ);
                }
                return LIZIZ;
        }
    }
}
