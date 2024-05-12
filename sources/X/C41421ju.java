package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout$LayoutParams;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.FunRootLinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import n.b;
import n54.c;
import o7a.m;
import og7.e;
import p8.a;

/* renamed from: X.1ju, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41421ju implements C1J0, InterfaceC17000lc {
    public final int LJLIL;

    @Override // X.C0QF
    public boolean LIZ() {
        return false;
    }

    @Override // X.C0QF
    public C0Q9 LIZIZ(long j, C0Q9 initialValue, C0Q9 targetValue, C0Q9 initialVelocity) {
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(targetValue, "targetValue");
        o.LJIIIZ(initialVelocity, "initialVelocity");
        return initialVelocity;
    }

    @Override // X.C1J0
    public int LJI() {
        return 0;
    }

    @Override // X.C1J0
    public int LJFF() {
        return this.LJLIL;
    }

    public /* synthetic */ C41421ju(int i) {
        this.LJLIL = i;
    }

    @Override // X.C0QF
    public C0Q9 LIZJ(C0Q9 c0q9, C0Q9 c0q92, C0Q9 c0q93) {
        return C07030Pj.LIZIZ(this, c0q9, c0q92, c0q93);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC17000lc
    public View LJ(Context context, ViewGroup viewGroup, boolean z) {
        int i;
        float f;
        int i2;
        switch (this.LJLIL) {
            case 0:
                Resources resources = context.getResources();
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setId(R.id.c_x);
                linearLayout.setClipChildren(false);
                linearLayout.setFocusable(true);
                linearLayout.setFocusableInTouchMode(true);
                linearLayout.setOrientation(1);
                linearLayout.setImportantForAccessibility(1);
                ViewGroup.LayoutParams LJ = b.LJ(-2, -2, viewGroup);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.ah7);
                frameLayout.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
                frameLayout.setId(R.id.c_t);
                frameLayout.setClipChildren(false);
                frameLayout.setFocusable(false);
                frameLayout.setFocusableInTouchMode(false);
                frameLayout.setImportantForAccessibility(4);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
                    layoutParams.gravity = 8388613;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 8388613;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams)) {
                    ((DrawerLayout$LayoutParams) layoutParams).gravity = 8388613;
                }
                C202467x4 c202467x4 = new C202467x4(context);
                c202467x4.setId(R.id.c_r);
                c202467x4.setContentDescription(context.getResources().getString(R.string.a63));
                c202467x4.setFocusable(false);
                c202467x4.setFocusableInTouchMode(false);
                c202467x4.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.0f, resources.getDisplayMetrics()));
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
                    layoutParams2.gravity = 17;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams2)) {
                    ((DrawerLayout$LayoutParams) layoutParams2).gravity = 17;
                }
                b.LIZ(c202467x4);
                if (c202467x4.getParent() == null) {
                    frameLayout.addView(c202467x4, layoutParams2);
                }
                b.LIZ(frameLayout);
                if (frameLayout.getParent() == null) {
                    linearLayout.addView(frameLayout, layoutParams);
                }
                TuxTextView tuxTextView = new TuxTextView(context);
                tuxTextView.setShadowLayer(2.0f, tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), tuxTextView.getShadowColor());
                tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), 2.0f, tuxTextView.getShadowColor());
                tuxTextView.setShadowLayer(tuxTextView.getShadowRadius(), tuxTextView.getShadowDx(), tuxTextView.getShadowDy(), resources.getColor(R.color.ku));
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dk});
                tuxTextView.setTextColor(obtainStyledAttributes.getColor(0, 0));
                obtainStyledAttributes.recycle();
                tuxTextView.setId(R.id.c_u);
                tuxTextView.setFocusable(false);
                tuxTextView.setFocusableInTouchMode(false);
                tuxTextView.setImportantForAccessibility(2);
                tuxTextView.setPadding(tuxTextView.getPaddingLeft(), tuxTextView.getPaddingTop(), tuxTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    layoutParams3.gravity = 1;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
                    ((FrameLayout.LayoutParams) layoutParams3).gravity = 1;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams3)) {
                    ((DrawerLayout$LayoutParams) layoutParams3).gravity = 1;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = (int) TypedValue.applyDimension(1, -6.4f, resources.getDisplayMetrics());
                }
                if (C06460Ne.LIZIZ("P2_Semibold", "app:tux_font", tuxTextView, layoutParams3, tuxTextView) == null) {
                    linearLayout.addView(tuxTextView, layoutParams3);
                }
                TuxTextView tuxTextView2 = new TuxTextView(context);
                tuxTextView2.setShadowLayer(2.0f, tuxTextView2.getShadowDx(), tuxTextView2.getShadowDy(), tuxTextView2.getShadowColor());
                tuxTextView2.setShadowLayer(tuxTextView2.getShadowRadius(), tuxTextView2.getShadowDx(), 2.0f, tuxTextView2.getShadowColor());
                tuxTextView2.setShadowLayer(tuxTextView2.getShadowRadius(), tuxTextView2.getShadowDx(), tuxTextView2.getShadowDy(), resources.getColor(R.color.ku));
                TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.dk});
                tuxTextView2.setTextColor(obtainStyledAttributes2.getColor(0, 0));
                obtainStyledAttributes2.recycle();
                tuxTextView2.setId(R.id.c_w);
                tuxTextView2.setFocusable(false);
                tuxTextView2.setFocusableInTouchMode(false);
                tuxTextView2.setImportantForAccessibility(2);
                tuxTextView2.setPadding(tuxTextView2.getPaddingLeft(), tuxTextView2.getPaddingTop(), tuxTextView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
                tuxTextView2.setVisibility(8);
                tuxTextView2.setText("Like");
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
                    layoutParams4.gravity = 1;
                }
                if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
                    ((FrameLayout.LayoutParams) layoutParams4).gravity = 1;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(layoutParams4)) {
                    ((DrawerLayout$LayoutParams) layoutParams4).gravity = 1;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) TypedValue.applyDimension(1, -6.4f, resources.getDisplayMetrics());
                }
                if (C06460Ne.LIZIZ("P2_Semibold", "app:tux_font", tuxTextView2, layoutParams4, tuxTextView2) == null) {
                    linearLayout.addView(tuxTextView2, layoutParams4);
                }
                b.LIZ(linearLayout);
                linearLayout.setLayoutParams(LJ);
                if (viewGroup != null && z) {
                    viewGroup.addView(linearLayout);
                }
                return linearLayout;
            case 1:
                Resources resources2 = context.getResources();
                FunRootLinearLayout funRootLinearLayout = new FunRootLinearLayout(context);
                funRootLinearLayout.setId(R.id.ep2);
                funRootLinearLayout.setOrientation(1);
                funRootLinearLayout.setBackgroundResource(R.drawable.bh5);
                ViewGroup.LayoutParams LJ2 = b.LJ(-1, -2, viewGroup);
                if (LinearLayout.LayoutParams.class.isInstance(LJ2)) {
                    ((LinearLayout.LayoutParams) LJ2).gravity = 80;
                }
                if (FrameLayout.LayoutParams.class.isInstance(LJ2)) {
                    ((FrameLayout.LayoutParams) LJ2).gravity = 80;
                }
                if (DrawerLayout$LayoutParams.class.isInstance(LJ2)) {
                    ((DrawerLayout$LayoutParams) LJ2).gravity = 80;
                }
                ConstraintLayout constraintLayout = new ConstraintLayout(context);
                constraintLayout.setClickable(true);
                constraintLayout.setFocusable(true);
                constraintLayout.setId(R.id.n7g);
                constraintLayout.setVisibility(8);
                ViewGroup.LayoutParams LJ3 = b.LJ(-1, -2, funRootLinearLayout);
                SmartImageView smartImageView = new SmartImageView(context);
                smartImageView.setId(R.id.n93);
                C018905p c018905p = new C018905p((int) TypedValue.applyDimension(1, 32.0f, resources2.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 32.0f, resources2.getDisplayMetrics()));
                c cVar = new c();
                cVar.LIZ.LIZLLL("app:roundedCornerRadius", new a.d("2", "dp"), smartImageView, c018905p);
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.startToStart = 0;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.topToTop = 0;
                }
                if (C018905p.class.isInstance(c018905p)) {
                    c018905p.bottomToBottom = 0;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p)) {
                    i = 1;
                    ((ViewGroup.MarginLayoutParams) c018905p).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics());
                } else {
                    i = 1;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p)) {
                    ((ViewGroup.MarginLayoutParams) c018905p).leftMargin = (int) TypedValue.applyDimension(i, 12.0f, resources2.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p)) {
                    ((ViewGroup.MarginLayoutParams) c018905p).rightMargin = (int) TypedValue.applyDimension(i, 12.0f, resources2.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p)) {
                    ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = (int) TypedValue.applyDimension(i, 4.0f, resources2.getDisplayMetrics());
                }
                cVar.LIZ.LIZJ(smartImageView, c018905p);
                b.LIZ(smartImageView);
                if (smartImageView.getParent() == null) {
                    constraintLayout.addView(smartImageView, c018905p);
                }
                TuxTextView tuxTextView3 = new TuxTextView(context);
                tuxTextView3.setId(R.id.n7i);
                tuxTextView3.setMaxLines(i);
                tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
                int[] iArr = new int[i];
                iArr[0] = R.attr.gu;
                TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(iArr);
                tuxTextView3.setTextColor(obtainStyledAttributes3.getColor(0, 0));
                obtainStyledAttributes3.recycle();
                C018905p c018905p2 = new C018905p((int) TypedValue.applyDimension(1, 0.0f, resources2.getDisplayMetrics()), -2);
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.startToEnd = R.id.n93;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.endToEnd = 0;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.topToTop = 0;
                }
                if (C018905p.class.isInstance(c018905p2)) {
                    c018905p2.bottomToBottom = 0;
                }
                new m();
                m.LIZ("app:tux_font", new a.c("H3_Regular"), tuxTextView3, c018905p2);
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    f = 12.0f;
                    i2 = 1;
                    ((ViewGroup.MarginLayoutParams) c018905p2).topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources2.getDisplayMetrics());
                } else {
                    f = 12.0f;
                    i2 = 1;
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    ((ViewGroup.MarginLayoutParams) c018905p2).leftMargin = (int) TypedValue.applyDimension(i2, f, resources2.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    ((ViewGroup.MarginLayoutParams) c018905p2).rightMargin = (int) TypedValue.applyDimension(i2, f, resources2.getDisplayMetrics());
                }
                if (ViewGroup.MarginLayoutParams.class.isInstance(c018905p2)) {
                    ((ViewGroup.MarginLayoutParams) c018905p2).bottomMargin = (int) TypedValue.applyDimension(i2, 4.0f, resources2.getDisplayMetrics());
                }
                b.LIZ(tuxTextView3);
                if (tuxTextView3.getParent() == null) {
                    constraintLayout.addView(tuxTextView3, c018905p2);
                }
                b.LIZ(constraintLayout);
                if (constraintLayout.getParent() == null) {
                    funRootLinearLayout.addView(constraintLayout, LJ3);
                }
                ViewStub viewStub = new ViewStub(context);
                viewStub.setId(R.id.jvu);
                viewStub.setInflatedId(R.id.iwh);
                viewStub.setLayoutResource(R.layout.b88);
                ViewGroup.LayoutParams LJ4 = b.LJ(-1, -2, funRootLinearLayout);
                b.LIZ(viewStub);
                if (viewStub.getParent() == null) {
                    funRootLinearLayout.addView(viewStub, LJ4);
                }
                View LIZIZ = TB3.LIZIZ(context, R.id.msl);
                ViewGroup.LayoutParams LJ5 = b.LJ(-1, -2, funRootLinearLayout);
                b.LIZ(LIZIZ);
                if (LIZIZ.getParent() == null) {
                    funRootLinearLayout.addView(LIZIZ, LJ5);
                }
                ViewStub viewStub2 = new ViewStub(context);
                viewStub2.setId(R.id.kmj);
                viewStub2.setLayoutResource(R.layout.b7j);
                viewStub2.setInflatedId(R.id.cow);
                ViewGroup.LayoutParams LJ6 = b.LJ(-1, -2, funRootLinearLayout);
                b.LIZ(viewStub2);
                if (viewStub2.getParent() == null) {
                    funRootLinearLayout.addView(viewStub2, LJ6);
                }
                View c4bt = new C4BT(context, null);
                c4bt.setId(R.id.hho);
                c4bt.setVisibility(8);
                ViewGroup.LayoutParams LJ7 = b.LJ(-1, -2, funRootLinearLayout);
                b.LIZ(c4bt);
                if (c4bt.getParent() == null) {
                    funRootLinearLayout.addView(c4bt, LJ7);
                }
                b.LIZ(funRootLinearLayout);
                funRootLinearLayout.setLayoutParams(LJ2);
                if (viewGroup != null && z) {
                    viewGroup.addView(funRootLinearLayout);
                }
                return funRootLinearLayout;
            default:
                Resources resources3 = context.getResources();
                LiveIconView liveIconView = new LiveIconView(context, null);
                liveIconView.setContentDescription(context.getResources().getString(R.string.k3w));
                ViewGroup.MarginLayoutParams LJ8 = b.LJ((int) TypedValue.applyDimension(1, 24.0f, resources3.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources3.getDisplayMetrics()), viewGroup);
                new e();
                e.LIZ("app:icon", new a.b("2130970692", "attr"), liveIconView, LJ8);
                e.LIZ("app:iconTint", new a.b("2131100918", "color"), liveIconView, LJ8);
                b.LIZ(liveIconView);
                liveIconView.setLayoutParams(LJ8);
                if (viewGroup != null && z) {
                    viewGroup.addView(liveIconView);
                }
                return liveIconView;
        }
    }

    @Override // X.C0QF
    public long LJII(C0Q9 c0q9, C0Q9 c0q92, C0Q9 c0q93) {
        return C07030Pj.LIZ(this, c0q9, c0q92, c0q93);
    }

    @Override // X.C0QF
    public C0Q9 LIZLLL(long j, C0Q9 initialValue, C0Q9 targetValue, C0Q9 initialVelocity) {
        o.LJIIIZ(initialValue, "initialValue");
        o.LJIIIZ(targetValue, "targetValue");
        o.LJIIIZ(initialVelocity, "initialVelocity");
        if (j < this.LJLIL * 1000000) {
            return initialValue;
        }
        return targetValue;
    }
}
