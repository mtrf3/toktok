package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.AwesomeSplashNewMask;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.m0;
import java.util.HashMap;
import n.b;
import o7a.m;
import p8.a;

/* renamed from: X.1TB, reason: invalid class name */
/* loaded from: classes.dex */
public class C1TB implements InterfaceC17000lc, InterfaceC48019Isx {
    public int LJLIL;

    @Override // X.InterfaceC48019Isx
    public void onPrepared() {
    }

    public /* synthetic */ C1TB() {
    }

    public /* synthetic */ C1TB(int i) {
        this.LJLIL = i;
    }

    public static void LJII(int i, O7E o7e) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("duration", Long.toString(i));
        hashMap.put("percent", Integer.toString(100));
        hashMap.put("is_ad_event", "1");
        hashMap.put("ad_fetch_time", Long.valueOf(o7e.LJLILLLLZI));
        if (!C78983UzD.LJJJI(o7e.LJLZ)) {
            hashMap.put("log_extra", o7e.LJLZ);
        }
        O79.LIZIZ().LJI(o7e, 0L, "play_over", hashMap, null);
        C61359O6h.LJ().LIZJ();
    }

    @Override // X.InterfaceC48019Isx
    public void LJFF(int i, int i2) {
        float f = i / i2;
        if (f < 0.0f) {
            return;
        }
        if (f >= 0.75f) {
            int i3 = this.LJLIL;
            if ((i3 & 8) == 0) {
                this.LJLIL = i3 | 8;
                C61359O6h.LJ().LIZIZ();
                ((O7H) this).LJIIIIZZ(i, i2, "third_quartile");
            }
        }
        if (f >= 0.5f) {
            int i4 = this.LJLIL;
            if ((i4 & 4) == 0) {
                this.LJLIL = i4 | 4;
                C61359O6h.LJ().LIZ();
                ((O7H) this).LJIIIIZZ(i, i2, "midpoint");
            }
        }
        if (f >= 0.25f) {
            int i5 = this.LJLIL;
            if ((i5 & 2) == 0) {
                this.LJLIL = i5 | 2;
                C61359O6h.LJ().LJI();
                ((O7H) this).LJIIIIZZ(i, i2, "first_quartile");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC17000lc
    public View LJ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        switch (this.LJLIL) {
            case 0:
                Resources resources = context.getResources();
                AwesomeSplashNewMask awesomeSplashNewMask = new AwesomeSplashNewMask(context, null, 6);
                awesomeSplashNewMask.setId(R.id.adx);
                ViewGroup.LayoutParams LJ = b.LJ(-1, -1, viewGroup);
                AppCompatImageView appCompatImageView = new AppCompatImageView(context);
                appCompatImageView.setId(R.id.fbn);
                appCompatImageView.setBackgroundResource(R.drawable.bzn);
                appCompatImageView.setRotation(180.0f);
                appCompatImageView.setVisibility(8);
                ViewGroup.LayoutParams LJ2 = b.LJ(-1, (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()), awesomeSplashNewMask);
                b.LIZ(appCompatImageView);
                if (appCompatImageView.getParent() == null) {
                    awesomeSplashNewMask.addView(appCompatImageView, LJ2);
                }
                View space = new Space(context);
                space.setId(R.id.ady);
                ViewGroup.LayoutParams LJ3 = b.LJ(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()), awesomeSplashNewMask);
                b.LIZ(space);
                if (space.getParent() == null) {
                    awesomeSplashNewMask.addView(space, LJ3);
                }
                C116474hf c116474hf = new C116474hf(context, null);
                c116474hf.setId(R.id.adw);
                c116474hf.setLayoutDirection(0);
                c116474hf.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                c116474hf.setImageResource(R.drawable.c6m);
                ViewGroup.MarginLayoutParams LJ4 = b.LJ(-2, -2, awesomeSplashNewMask);
                if (RelativeLayout.LayoutParams.class.isInstance(LJ4)) {
                    ((RelativeLayout.LayoutParams) LJ4).addRule(3, R.id.ady);
                }
                if (RelativeLayout.LayoutParams.class.isInstance(LJ4)) {
                    ((RelativeLayout.LayoutParams) LJ4).addRule(9, -1);
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(LJ4)) {
                    i = 1;
                    LJ4.leftMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
                } else {
                    i = 1;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(LJ4)) {
                    LJ4.topMargin = (int) TypedValue.applyDimension(i, 14.0f, resources.getDisplayMetrics());
                }
                b.LIZ(c116474hf);
                if (c116474hf.getParent() == null) {
                    awesomeSplashNewMask.addView(c116474hf, LJ4);
                }
                View LIZ = C16950lX.LIZ(context, R.layout.dth, awesomeSplashNewMask, false, R.layout.u7);
                LIZ.setId(R.id.k2i);
                ViewGroup.LayoutParams LJ5 = b.LJ(-2, -2, awesomeSplashNewMask);
                if (RelativeLayout.LayoutParams.class.isInstance(LJ5)) {
                    ((RelativeLayout.LayoutParams) LJ5).addRule(3, R.id.ady);
                }
                if (RelativeLayout.LayoutParams.class.isInstance(LJ5)) {
                    ((RelativeLayout.LayoutParams) LJ5).addRule(11, -1);
                }
                if (LIZ.getParent() == null) {
                    awesomeSplashNewMask.addView(LIZ, LJ5);
                }
                TuxTextView LIZJ = C06420Na.LIZJ(context, R.id.ml0);
                LIZJ.setShadowLayer(LIZJ.getShadowRadius(), LIZJ.getShadowDx(), LIZJ.getShadowDy(), b.LIZIZ(R.attr.ei, context));
                LIZJ.setShadowLayer(LIZJ.getShadowRadius(), LIZJ.getShadowDx(), 1.0f, LIZJ.getShadowColor());
                LIZJ.setVisibility(8);
                ViewGroup.MarginLayoutParams LJ6 = b.LJ(-2, -2, awesomeSplashNewMask);
                if (RelativeLayout.LayoutParams.class.isInstance(LJ6)) {
                    ((RelativeLayout.LayoutParams) LJ6).addRule(3, R.id.ady);
                }
                if (RelativeLayout.LayoutParams.class.isInstance(LJ6)) {
                    ((RelativeLayout.LayoutParams) LJ6).addRule(21, -1);
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(LJ6)) {
                    i2 = 1;
                    LJ6.topMargin = (int) TypedValue.applyDimension(i, 16.0f, resources.getDisplayMetrics());
                } else {
                    i2 = 1;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(LJ6)) {
                    LJ6.setMarginEnd((int) TypedValue.applyDimension(i, 13.0f, resources.getDisplayMetrics()));
                }
                m.LIZ("app:tux_font", m0.LIZJ(LIZJ, 17, "P3_Regular"), LIZJ, LJ6);
                b.LIZ(LIZJ);
                if (LIZJ.getParent() == null) {
                    awesomeSplashNewMask.addView(LIZJ, LJ6);
                }
                RelativeLayout relativeLayout = new RelativeLayout(context);
                relativeLayout.setId(R.id.j5a);
                relativeLayout.setBackgroundResource(R.drawable.bzn);
                relativeLayout.setVisibility(8);
                ViewGroup.LayoutParams LJ7 = b.LJ(-1, (int) TypedValue.applyDimension(i, 114.0f, resources.getDisplayMetrics()), awesomeSplashNewMask);
                if (RelativeLayout.LayoutParams.class.isInstance(LJ7)) {
                    ((RelativeLayout.LayoutParams) LJ7).addRule(12, -1);
                }
                AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
                appCompatImageView2.setId(R.id.f97);
                appCompatImageView2.setPadding((int) TypedValue.applyDimension(i, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i2, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i2, 8.0f, resources.getDisplayMetrics()));
                appCompatImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                appCompatImageView2.setImageResource(R.drawable.de8);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(i2, 30.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i2, 24.0f, resources.getDisplayMetrics()));
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
                    layoutParams.addRule(14, -1);
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
                    layoutParams.addRule(2, R.id.mfi);
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) TypedValue.applyDimension(1, -12.0f, resources.getDisplayMetrics());
                }
                b.LIZ(appCompatImageView2);
                if (appCompatImageView2.getParent() == null) {
                    relativeLayout.addView(appCompatImageView2, layoutParams);
                }
                TuxTextView LIZJ2 = C06420Na.LIZJ(context, R.id.mfi);
                LIZJ2.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
                LIZJ2.setShadowLayer(LIZJ2.getShadowRadius(), LIZJ2.getShadowDx(), LIZJ2.getShadowDy(), b.LIZIZ(R.attr.ei, context));
                LIZJ2.setShadowLayer(LIZJ2.getShadowRadius(), LIZJ2.getShadowDx(), 1.0f, LIZJ2.getShadowColor());
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dj});
                LIZJ2.setTextColor(obtainStyledAttributes.getColor(0, 0));
                obtainStyledAttributes.recycle();
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    i3 = -1;
                    layoutParams2.addRule(12, -1);
                } else {
                    i3 = -1;
                }
                if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    layoutParams2.addRule(14, i3);
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) TypedValue.applyDimension(1, 46.0f, resources.getDisplayMetrics());
                }
                m.LIZ("app:tux_font", m0.LIZJ(LIZJ2, 48, "H4_Regular"), LIZJ2, layoutParams2);
                b.LIZ(LIZJ2);
                if (LIZJ2.getParent() == null) {
                    relativeLayout.addView(LIZJ2, layoutParams2);
                }
                b.LIZ(relativeLayout);
                if (relativeLayout.getParent() == null) {
                    awesomeSplashNewMask.addView(relativeLayout, LJ7);
                }
                b.LIZ(awesomeSplashNewMask);
                awesomeSplashNewMask.setLayoutParams(LJ);
                if (viewGroup != null && z) {
                    viewGroup.addView(awesomeSplashNewMask);
                }
                return awesomeSplashNewMask;
            case 1:
                Resources resources2 = context.getResources();
                ConstraintLayout constraintLayout = new ConstraintLayout(context);
                ViewGroup.MarginLayoutParams LJ8 = b.LJ(-1, -1, viewGroup);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(R.id.cjj);
                frameLayout.setBackgroundResource(R.drawable.as4);
                C018905p c018905p = new C018905p(-1, -2);
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.bottomToTop = R.id.lj2;
                }
                b.LIZ(frameLayout);
                if (frameLayout.getParent() == null) {
                    constraintLayout.addView(frameLayout, c018905p);
                }
                FrameLayout LIZIZ = TB3.LIZIZ(context, R.id.lj2);
                C018905p c018905p2 = new C018905p(-1, (int) TypedValue.applyDimension(1, 182.0f, resources2.getDisplayMetrics()));
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.bottomToTop = R.id.cjk;
                }
                b.LIZ(LIZIZ);
                if (LIZIZ.getParent() == null) {
                    constraintLayout.addView(LIZIZ, c018905p2);
                }
                View LIZIZ2 = V10.LIZIZ(context, R.id.aq1);
                C018905p c018905p3 = new C018905p(-1, (int) TypedValue.applyDimension(1, 64.0f, resources2.getDisplayMetrics()));
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.bottomToBottom = 0;
                }
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.startToStart = 0;
                }
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.endToEnd = 0;
                }
                b.LIZ(LIZIZ2);
                if (LIZIZ2.getParent() == null) {
                    constraintLayout.addView(LIZIZ2, c018905p3);
                }
                C48295IxP c48295IxP = new C48295IxP(context);
                c48295IxP.setId(R.id.cjk);
                c48295IxP.setClipChildren(false);
                c48295IxP.setClipToPadding(false);
                C018905p c018905p4 = new C018905p(-1, (int) TypedValue.applyDimension(1, 64.0f, resources2.getDisplayMetrics()));
                if (C018905p.class.isInstance(c018905p4)) {
                    c018905p4.bottomToBottom = 0;
                }
                b.LIZ(c48295IxP);
                if (c48295IxP.getParent() == null) {
                    constraintLayout.addView(c48295IxP, c018905p4);
                }
                b.LIZ(constraintLayout);
                constraintLayout.setLayoutParams(LJ8);
                if (viewGroup != null && z) {
                    viewGroup.addView(constraintLayout);
                }
                return constraintLayout;
            default:
                Resources resources3 = context.getResources();
                LinearLayout LIZ2 = C0NY.LIZ(context, R.id.gj9, 1);
                ViewGroup.LayoutParams LJ9 = b.LJ(-1, -2, viewGroup);
                TuxTextView LIZJ3 = C06420Na.LIZJ(context, R.id.h19);
                LIZJ3.setEllipsize(TextUtils.TruncateAt.END);
                LIZJ3.setMaxLines(1);
                LIZJ3.setTextAlignment(4);
                TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.go});
                LIZJ3.setTextColor(obtainStyledAttributes2.getColor(0, 0));
                obtainStyledAttributes2.recycle();
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    i4 = 1;
                    layoutParams3.gravity = 1;
                } else {
                    i4 = 1;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    ((FrameLayout.LayoutParams) layoutParams3).gravity = i4;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
                    ((DrawerLayout$LayoutParams) layoutParams3).gravity = i4;
                }
                if (C06460Ne.LIZIZ("P2_Semibold", "app:tux_font", LIZJ3, layoutParams3, LIZJ3) == null) {
                    LIZ2.addView(LIZJ3, layoutParams3);
                }
                C58049MqL c58049MqL = new C58049MqL(context);
                c58049MqL.setId(R.id.iuj);
                c58049MqL.setMaxLines(2);
                TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.gx});
                c58049MqL.setTextColor(obtainStyledAttributes3.getColor(0, 0));
                obtainStyledAttributes3.recycle();
                c58049MqL.setVisibility(8);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
                    i5 = 1;
                    ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources3.getDisplayMetrics());
                } else {
                    i5 = 1;
                }
                c58049MqL.setGravity(i5);
                new m();
                m.LIZ("app:tux_font", new a.c("P3_Regular"), c58049MqL, layoutParams4);
                b.LIZ(c58049MqL);
                if (c58049MqL.getParent() == null) {
                    LIZ2.addView(c58049MqL, layoutParams4);
                }
                b.LIZ(LIZ2);
                LIZ2.setLayoutParams(LJ9);
                if (viewGroup != null && z) {
                    viewGroup.addView(LIZ2);
                }
                return LIZ2;
        }
    }
}
