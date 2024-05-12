package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import az6.a;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.translation.model.RealtimeCaptionsTranslationResult;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import kotlin.jvm.internal.o;
import n.b;
import p8.a;

/* loaded from: classes13.dex */
public final class TB1 implements InterfaceC48038ItG, InterfaceC17000lc {
    public final /* synthetic */ int LJLIL;

    public /* synthetic */ TB1(int i) {
        this.LJLIL = i;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        boolean z;
        RealtimeCaptionsTranslationResult it = (RealtimeCaptionsTranslationResult) obj;
        o.LJIIIZ(it, "it");
        TB5 tb5 = TB6.LIZIZ.get(Integer.valueOf(this.LJLIL));
        if (it.status_code == 0 && tb5 != null) {
            tb5.LJFF = it;
            String LIZIZ = C78700Uue.LIZIZ(tb5.LIZ, tb5.LIZIZ);
            z = C78700Uue.LIZ(it, LIZIZ);
            if (z) {
                tb5.LJI = LIZIZ;
            }
        } else {
            z = false;
        }
        return new OSZ(it, Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC17000lc
    public View LJ(Context context, ViewGroup viewGroup, boolean z) {
        float f;
        switch (this.LJLIL) {
            case 0:
                Resources resources = context.getResources();
                LinearLayout LIZ = q.LIZ(context, 0);
                ViewGroup.MarginLayoutParams LJ = b.LJ(-1, (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()), viewGroup);
                if (LinearLayout.LayoutParams.class.isInstance(LJ)) {
                    ((LinearLayout.LayoutParams) LJ).gravity = 1;
                }
                if (FrameLayout.LayoutParams.class.isInstance(LJ)) {
                    ((FrameLayout.LayoutParams) LJ).gravity = 1;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(LJ)) {
                    ((DrawerLayout$LayoutParams) LJ).gravity = 1;
                }
                FrameLayout LIZIZ = TB3.LIZIZ(context, R.id.k59);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
                    f = 4.0f;
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
                } else {
                    f = 4.0f;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
                }
                b.LIZ(LIZIZ);
                if (LIZIZ.getParent() == null) {
                    LIZ.addView(LIZIZ, layoutParams);
                }
                FrameLayout LIZIZ2 = TB3.LIZIZ(context, R.id.k55);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
                }
                b.LIZ(LIZIZ2);
                if (LIZIZ2.getParent() == null) {
                    LIZ.addView(LIZIZ2, layoutParams2);
                }
                b.LIZ(LIZ);
                LIZ.setLayoutParams(LJ);
                if (viewGroup != null && z) {
                    viewGroup.addView(LIZ);
                }
                return LIZ;
            case 1:
                Resources resources2 = context.getResources();
                ConstraintLayout constraintLayout = new ConstraintLayout(context);
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), (int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()));
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
                ViewGroup.LayoutParams LJ2 = b.LJ(-1, -2, viewGroup);
                View c019005q = new C019005q(context);
                c019005q.setId(R.id.ac7);
                C018905p c018905p = new C018905p(-2, -2);
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.orientation = 1;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.guideEnd = (int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics());
                }
                b.LIZ(c019005q);
                if (c019005q.getParent() == null) {
                    constraintLayout.addView(c019005q, c018905p);
                }
                View LIZ2 = C16950lX.LIZ(context, R.layout.b7t, constraintLayout, false, R.layout.b4z);
                LIZ2.setId(R.id.fjr);
                if (LIZ2.getParent() == null) {
                    constraintLayout.addView(LIZ2);
                }
                View LIZ3 = C16950lX.LIZ(context, R.layout.b8p, constraintLayout, false, R.layout.b4z);
                LIZ3.setId(R.id.kwr);
                C018905p c018905p2 = new C018905p((int) TypedValue.applyDimension(1, 24.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources2.getDisplayMetrics()));
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    c018905p2.setMarginEnd((int) resources2.getDimension(R.dimen.vk));
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.bottomToBottom = R.id.bst;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.endToEnd = R.id.bst;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.topToTop = R.id.bst;
                }
                if (LIZ3.getParent() == null) {
                    constraintLayout.addView(LIZ3, c018905p2);
                }
                View LIZ4 = C16950lX.LIZ(context, R.layout.b4h, constraintLayout, false, R.layout.b4z);
                LIZ4.setId(R.id.bst);
                C018905p c018905p3 = new C018905p((int) TypedValue.applyDimension(1, 180.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 320.0f, resources2.getDisplayMetrics()));
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.endToStart = R.id.ac7;
                }
                if (C018905p.class.isInstance(c018905p3)) {
                    c018905p3.topToBottom = R.id.fjr;
                }
                if (LIZ4.getParent() == null) {
                    constraintLayout.addView(LIZ4, c018905p3);
                }
                FrameLayout LIZIZ3 = TB3.LIZIZ(context, R.id.j7l);
                C018905p c018905p4 = new C018905p(-2, (int) TypedValue.applyDimension(1, 0.0f, resources2.getDisplayMetrics()));
                if (C018905p.class.isInstance(c018905p4)) {
                    c018905p4.topToTop = R.id.bst;
                }
                if (C018905p.class.isInstance(c018905p4)) {
                    c018905p4.bottomToBottom = R.id.bst;
                }
                if (C018905p.class.isInstance(c018905p4)) {
                    c018905p4.endToStart = R.id.bst;
                }
                TuxIconView tuxIconView = new TuxIconView(context);
                tuxIconView.setScaleType(ImageView.ScaleType.FIT_XY);
                tuxIconView.setVisibility(8);
                tuxIconView.setId(R.id.kf1);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources2.getDisplayMetrics()));
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    ((LinearLayout.LayoutParams) layoutParams3).gravity = 16;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    layoutParams3.gravity = 16;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
                    ((DrawerLayout$LayoutParams) layoutParams3).gravity = 16;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
                    layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 8.0f, resources2.getDisplayMetrics()));
                }
                b.LIZ(tuxIconView);
                if (tuxIconView.getParent() == null) {
                    LIZIZ3.addView(tuxIconView, layoutParams3);
                }
                C16950lX.LIZ(context, R.layout.b0w, LIZIZ3, true, 0);
                b.LIZ(LIZIZ3);
                if (LIZIZ3.getParent() == null) {
                    constraintLayout.addView(LIZIZ3, c018905p4);
                }
                View LIZ5 = C16950lX.LIZ(context, R.layout.b70, constraintLayout, false, R.layout.b4z);
                C018905p c018905p5 = new C018905p(-2, -2);
                if (C018905p.class.isInstance(c018905p5)) {
                    c018905p5.startToStart = R.id.bst;
                }
                if (C018905p.class.isInstance(c018905p5)) {
                    c018905p5.topToBottom = R.id.bst;
                }
                if (LIZ5.getParent() == null) {
                    constraintLayout.addView(LIZ5, c018905p5);
                }
                View LIZ6 = C16950lX.LIZ(context, R.layout.b71, constraintLayout, false, R.layout.b4z);
                C018905p c018905p6 = new C018905p(-2, (int) resources2.getDimension(R.dimen.v5));
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p6)) {
                    c018905p6.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics()));
                }
                if (C018905p.class.isInstance(c018905p6)) {
                    c018905p6.endToEnd = R.id.bst;
                }
                if (C018905p.class.isInstance(c018905p6)) {
                    c018905p6.topToBottom = R.id.g2v;
                }
                if (LIZ6.getParent() == null) {
                    constraintLayout.addView(LIZ6, c018905p6);
                }
                View c4yj = new C4YJ(context);
                c4yj.setId(R.id.gi1);
                c4yj.setVisibility(8);
                C018905p c018905p7 = new C018905p(-2, -2);
                if (C018905p.class.isInstance(c018905p7)) {
                    c018905p7.endToEnd = R.id.bst;
                }
                if (C018905p.class.isInstance(c018905p7)) {
                    c018905p7.topToBottom = R.id.g2w;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p7)) {
                    ((ViewGroup.MarginLayoutParams) c018905p7).topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources2.getDisplayMetrics());
                }
                b.LIZ(c4yj);
                if (c4yj.getParent() == null) {
                    constraintLayout.addView(c4yj, c018905p7);
                }
                View LIZ7 = C16950lX.LIZ(context, R.layout.b8d, constraintLayout, false, R.layout.b4z);
                C018905p c018905p8 = new C018905p(-2, (int) TypedValue.applyDimension(1, 32.0f, resources2.getDisplayMetrics()));
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p8)) {
                    c018905p8.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources2.getDisplayMetrics()));
                }
                if (C018905p.class.isInstance(c018905p8)) {
                    c018905p8.startToStart = 0;
                }
                if (C018905p.class.isInstance(c018905p8)) {
                    c018905p8.topToTop = R.id.mzt;
                }
                if (LIZ7.getParent() == null) {
                    constraintLayout.addView(LIZ7, c018905p8);
                }
                C1AF c1af = new C1AF(context);
                c1af.setId(R.id.aox);
                C018905p c018905p9 = new C018905p(-2, -2);
                new a();
                a.LIZ("app:barrierDirection", new a.c("bottom"), c1af, c018905p9);
                c1af.setReferencedIds(new int[]{R.id.gi1, R.id.g2v, R.id.g2w, R.id.bst});
                b.LIZ(c1af);
                if (c1af.getParent() == null) {
                    constraintLayout.addView(c1af, c018905p9);
                }
                View LIZ8 = C16950lX.LIZ(context, R.layout.b7s, constraintLayout, false, R.layout.b4z);
                C018905p c018905p10 = new C018905p(-2, -2);
                if (C018905p.class.isInstance(c018905p10)) {
                    c018905p10.endToEnd = 0;
                }
                if (C018905p.class.isInstance(c018905p10)) {
                    c018905p10.startToStart = 0;
                }
                if (C018905p.class.isInstance(c018905p10)) {
                    c018905p10.topToBottom = R.id.aox;
                }
                if (LIZ8.getParent() == null) {
                    constraintLayout.addView(LIZ8, c018905p10);
                }
                b.LIZ(constraintLayout);
                constraintLayout.setLayoutParams(LJ2);
                if (viewGroup != null && z) {
                    viewGroup.addView(constraintLayout);
                }
                return constraintLayout;
            default:
                Resources resources3 = context.getResources();
                FrameLayout LIZIZ4 = TB3.LIZIZ(context, R.id.bs8);
                ViewGroup.LayoutParams LJ3 = b.LJ(-1, -1, viewGroup);
                View LIZIZ5 = TB3.LIZIZ(context, R.id.a2g);
                ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
                b.LIZ(LIZIZ5);
                if (LIZIZ5.getParent() == null) {
                    LIZIZ4.addView(LIZIZ5, layoutParams4);
                }
                C30876C9w c30876C9w = new C30876C9w(context);
                c30876C9w.setId(R.id.drn);
                ViewGroup.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout LIZIZ6 = TB3.LIZIZ(context, R.id.eq3);
                ViewGroup.MarginLayoutParams LJ4 = b.LJ(-1, -1, c30876C9w);
                b.LIZ(LIZIZ6);
                if (LIZIZ6.getParent() == null) {
                    c30876C9w.addView(LIZIZ6, LJ4);
                }
                C51 c51 = new C51(context, null, 6);
                c51.setId(R.id.fvi);
                c51.setBackgroundColor(resources3.getColor(R.color.b6));
                c51.setVisibility(4);
                ViewGroup.MarginLayoutParams LJ5 = b.LJ(-1, -1, c30876C9w);
                b.LIZ(c51);
                if (c51.getParent() == null) {
                    c30876C9w.addView(c51, LJ5);
                }
                b.LIZ(c30876C9w);
                if (c30876C9w.getParent() == null) {
                    LIZIZ4.addView(c30876C9w, layoutParams5);
                }
                View LIZJ = C62850Ola.LIZJ(context, R.id.dsz, 8);
                ViewGroup.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
                b.LIZ(LIZJ);
                if (LIZJ.getParent() == null) {
                    LIZIZ4.addView(LIZJ, layoutParams6);
                }
                FrameLayout LIZJ2 = C62850Ola.LIZJ(context, R.id.epj, 8);
                ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
                View c47061t0 = new C47061t0(context);
                c47061t0.setId(R.id.aly);
                FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 156.0f, resources3.getDisplayMetrics()), -1);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
                    ((LinearLayout.LayoutParams) layoutParams8).gravity = 8388613;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
                    layoutParams8.gravity = 8388613;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams8)) {
                    ((DrawerLayout$LayoutParams) layoutParams8).gravity = 8388613;
                }
                b.LIZ(c47061t0);
                if (c47061t0.getParent() == null) {
                    LIZJ2.addView(c47061t0, layoutParams8);
                }
                View c47061t02 = new C47061t0(context);
                c47061t02.setId(R.id.kco);
                FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 156.0f, resources3.getDisplayMetrics()), -1);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
                    ((LinearLayout.LayoutParams) layoutParams9).gravity = 8388611;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
                    layoutParams9.gravity = 8388611;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams9)) {
                    ((DrawerLayout$LayoutParams) layoutParams9).gravity = 8388611;
                }
                b.LIZ(c47061t02);
                if (c47061t02.getParent() == null) {
                    LIZJ2.addView(c47061t02, layoutParams9);
                }
                C47061t0 c47061t03 = new C47061t0(context);
                c47061t03.setId(R.id.e0u);
                c47061t03.setScaleType(ImageView.ScaleType.CENTER_CROP);
                FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 260.0f, resources3.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 260.0f, resources3.getDisplayMetrics()));
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
                    ((LinearLayout.LayoutParams) layoutParams10).gravity = 1;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
                    layoutParams10.gravity = 1;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams10)) {
                    ((DrawerLayout$LayoutParams) layoutParams10).gravity = 1;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams10).topMargin = (int) TypedValue.applyDimension(1, 170.0f, resources3.getDisplayMetrics());
                }
                b.LIZ(c47061t03);
                if (c47061t03.getParent() == null) {
                    LIZJ2.addView(c47061t03, layoutParams10);
                }
                C47121t6 c47121t6 = new C47121t6(context, null);
                c47121t6.setId(R.id.e1a);
                c47121t6.setTextColor(resources3.getColorStateList(R.color.acm));
                c47121t6.setTextSize(2, 28.0f);
                FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-2, -2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
                    layoutParams11.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources3.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
                    layoutParams11.setMarginEnd((int) TypedValue.applyDimension(1, 15.0f, resources3.getDisplayMetrics()));
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams11).topMargin = (int) TypedValue.applyDimension(1, 380.0f, resources3.getDisplayMetrics());
                }
                c47121t6.setGravity(17);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
                    ((LinearLayout.LayoutParams) layoutParams11).gravity = 1;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
                    layoutParams11.gravity = 1;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams11)) {
                    ((DrawerLayout$LayoutParams) layoutParams11).gravity = 1;
                }
                b.LIZ(c47121t6);
                if (c47121t6.getParent() == null) {
                    LIZJ2.addView(c47121t6, layoutParams11);
                }
                b.LIZ(LIZJ2);
                if (LIZJ2.getParent() == null) {
                    LIZIZ4.addView(LIZJ2, layoutParams7);
                }
                View cvt = new CVT(context, null);
                cvt.setId(R.id.fvb);
                cvt.setVisibility(8);
                FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-2, -2);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
                    ((LinearLayout.LayoutParams) layoutParams12).gravity = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
                    layoutParams12.gravity = 17;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams12)) {
                    ((DrawerLayout$LayoutParams) layoutParams12).gravity = 17;
                }
                b.LIZ(cvt);
                if (cvt.getParent() == null) {
                    LIZIZ4.addView(cvt, layoutParams12);
                }
                b.LIZ(LIZIZ4);
                LIZIZ4.setLayoutParams(LJ3);
                if (viewGroup != null && z) {
                    viewGroup.addView(LIZIZ4);
                }
                return LIZIZ4;
        }
    }
}
