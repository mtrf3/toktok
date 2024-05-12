package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.MKa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC56620MKa extends ViewGroup implements View.OnClickListener {
    public View LJLIL;
    public final TuxTextView LJLILLLLZI;
    public final TuxTextView LJLJI;
    public final SY4 LJLJJI;
    public ViewGroup LJLJJL;
    public final int[] LJLJJLL;
    public final RectF LJLJL;
    public final RectF LJLJLJ;
    public final Paint LJLJLLL;
    public final Paint LJLL;
    public InterfaceC56624MKe LJLLI;
    public final ValueAnimator LJLLILLLL;
    public final ValueAnimator LJLLJ;
    public final ValueAnimator LJLLL;
    public final ValueAnimator LJLLLL;

    public final void LIZIZ() {
        if (this.LJLJJL != null && getVisibility() == 0) {
            setVisibility(8);
            ViewGroup viewGroup = this.LJLJJL;
            if (viewGroup != null) {
                C16880lQ.LJLLL(this, viewGroup);
            }
            InterfaceC56624MKe interfaceC56624MKe = this.LJLLI;
            if (interfaceC56624MKe != null) {
                interfaceC56624MKe.onDismiss();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC56620MKa(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLJJLL = new int[2];
        this.LJLJL = new RectF();
        this.LJLJLJ = new RectF();
        Paint paint = new Paint();
        this.LJLJLLL = paint;
        Paint paint2 = new Paint();
        this.LJLL = paint2;
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(C56204M4a.LIZ(R.attr.ed));
        paint2.setFlags(1);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setVisibility(8);
        setAlpha(0.0f);
        setBackgroundColor(0);
        setLayerType(2, null);
        this.LJLLILLLL = LIZ(this);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(32);
        tuxTextView.setTextColorRes(R.attr.dk);
        tuxTextView.setPaddingRelative(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)), 0);
        tuxTextView.setGravity(17);
        tuxTextView.setText(context.getString(R.string.eak));
        tuxTextView.setAlpha(0.0f);
        this.LJLLJ = LIZ(tuxTextView);
        this.LJLILLLLZI = tuxTextView;
        SY4 sy4 = new SY4(context, null, 6, 0);
        sy4.setTuxFont(42);
        sy4.setButtonSize(3);
        sy4.setButtonVariant(2);
        sy4.setText(context.getString(R.string.eaj));
        sy4.setAlpha(0.0f);
        this.LJLLL = LIZ(sy4);
        this.LJLJJI = sy4;
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        tuxTextView2.setTuxFont(61);
        tuxTextView2.setTextColorRes(R.attr.dm);
        tuxTextView2.setPaddingRelative(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), 0);
        tuxTextView2.setGravity(17);
        tuxTextView2.setText(context.getString(R.string.eal));
        tuxTextView2.setAlpha(0.0f);
        this.LJLLLL = LIZ(tuxTextView2);
        this.LJLJI = tuxTextView2;
        setOnClickListener(new ViewOnClickListenerC13880ga(this));
        C16880lQ.LJJIZ(sy4, this);
    }

    public static ValueAnimator LIZ(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        if (view == null) {
            return;
        }
        LIZIZ();
        if (o.LJ(view, this.LJLJJI)) {
            str = "click_cross";
        } else {
            str = "click_blank";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "notification_page");
        hashMap.put("enter_method", str);
        FMX.LJIIL("creator_inbox_mask_disappear", hashMap);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawRect(this.LJLJL, this.LJLJLLL);
            canvas.drawRect(this.LJLJLJ, this.LJLL);
        }
    }

    public final void setParams(C56623MKd c56623MKd) {
        ViewGroup viewGroup;
        Window window;
        View decorView;
        View findViewById;
        ViewParent parent;
        View view = c56623MKd.LIZ;
        if (view != null) {
            this.LJLIL = view;
            this.LJLLI = c56623MKd.LIZIZ;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            ViewParent viewParent = null;
            if (LJIJJ != null && (window = LJIJJ.getWindow()) != null && (decorView = window.getDecorView()) != null && (findViewById = decorView.findViewById(android.R.id.content)) != null && (parent = findViewById.getParent()) != null) {
                viewParent = parent.getParent();
            }
            if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
                this.LJLJJL = viewGroup;
                return;
            } else {
                "This context cannot use this view !!! ".toString();
                throw new IllegalArgumentException("This context cannot use this view !!! ");
            }
        }
        "TargetView can't be null !!".toString();
        throw new IllegalArgumentException("TargetView can't be null !!");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChildren(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.LJLIL;
        if (view != null) {
            view.getLocationInWindow(this.LJLJJLL);
            int[] iArr = this.LJLJJLL;
            int i5 = iArr[0];
            int i6 = iArr[1];
            View view2 = this.LJLIL;
            if (view2 != null) {
                int measuredWidth = view2.getMeasuredWidth() + i5;
                int i7 = this.LJLJJLL[1];
                View view3 = this.LJLIL;
                if (view3 != null) {
                    int measuredHeight = view3.getMeasuredHeight() + i7;
                    RectF rectF = this.LJLJL;
                    rectF.left = 0.0f;
                    rectF.top = 0.0f;
                    rectF.right = getMeasuredWidth();
                    rectF.bottom = getMeasuredHeight();
                    RectF rectF2 = this.LJLJLJ;
                    rectF2.left = i5;
                    rectF2.top = i6;
                    rectF2.right = measuredWidth;
                    rectF2.bottom = measuredHeight;
                    View view4 = this.LJLIL;
                    if (view4 != null) {
                        int measuredWidth2 = view4.getMeasuredWidth();
                        View view5 = this.LJLIL;
                        if (view5 != null) {
                            view5.getMeasuredHeight();
                            int measuredWidth3 = this.LJLILLLLZI.getMeasuredWidth();
                            int measuredHeight2 = this.LJLILLLLZI.getMeasuredHeight();
                            int measuredWidth4 = this.LJLJJI.getMeasuredWidth();
                            int measuredHeight3 = this.LJLJJI.getMeasuredHeight();
                            int measuredWidth5 = this.LJLJI.getMeasuredWidth();
                            int measuredHeight4 = this.LJLJI.getMeasuredHeight();
                            int measuredHeight5 = getMeasuredHeight() - measuredHeight;
                            int LIZJ = C47959Irz.LIZJ(72, O6R.LJJIIZ(C32151Nz.LJIIZILJ(72)) + O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)) + C47959Irz.LIZJ(40, measuredHeight2) + measuredHeight3 + measuredHeight4);
                            int LIZJ2 = C47959Irz.LIZJ(40, O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)) + measuredHeight2 + measuredHeight3);
                            StringBuilder LIZJ3 = C06460Ne.LIZJ("topSpaceHeight= ", i6, ",bottomSpaceHeight= ", measuredHeight5, ",contentHeightWithAll =");
                            LIZJ3.append(LIZJ);
                            LIZJ3.append(",contentHeightWithoutBottom =");
                            LIZJ3.append(LIZJ2);
                            C56204M4a.LIZLLL(X1D.LIZIZ(LIZJ3));
                            this.LJLJI.layout((measuredWidth2 - measuredWidth5) / 2, C47135Ieh.LIZ(72, getMeasuredHeight() - measuredHeight4), (measuredWidth5 + measuredWidth2) / 2, getMeasuredHeight() - O6R.LJJIIZ(C32151Nz.LJIIZILJ(72)));
                            if (measuredHeight5 >= LIZJ) {
                                C56204M4a.LIZLLL("layout to bottom of targetView");
                                this.LJLILLLLZI.layout((measuredWidth2 - measuredWidth3) / 2, C47959Irz.LIZJ(40, measuredHeight), (measuredWidth3 + measuredWidth2) / 2, O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)) + measuredHeight + measuredHeight2);
                                this.LJLJJI.layout((measuredWidth2 - measuredWidth4) / 2, C47959Irz.LIZJ(24, this.LJLILLLLZI.getBottom()), (measuredWidth2 + measuredWidth4) / 2, O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)) + this.LJLILLLLZI.getBottom() + measuredHeight3);
                                return;
                            }
                            if (i6 >= LIZJ2) {
                                C56204M4a.LIZLLL("layout to top of targetView");
                                this.LJLJJI.layout((measuredWidth2 - measuredWidth4) / 2, (i6 - O6R.LJJIIZ(C32151Nz.LJIIZILJ(40))) - measuredHeight3, (measuredWidth4 + measuredWidth2) / 2, i6 - O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
                                this.LJLILLLLZI.layout((measuredWidth2 - measuredWidth3) / 2, (this.LJLJJI.getTop() - O6R.LJJIIZ(C32151Nz.LJIIZILJ(24))) - measuredHeight2, (measuredWidth2 + measuredWidth3) / 2, this.LJLJJI.getTop() - O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
                                return;
                            } else {
                                C56204M4a.LIZLLL("layout to top of targetView,only layout tipsTop");
                                this.LJLILLLLZI.layout((measuredWidth2 - measuredWidth3) / 2, (i6 - O6R.LJJIIZ(C32151Nz.LJIIZILJ(40))) - measuredHeight2, (measuredWidth2 + measuredWidth3) / 2, i6 - O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
                                return;
                            }
                        }
                        o.LJIJI("targetView");
                        throw null;
                    }
                    o.LJIJI("targetView");
                    throw null;
                }
                o.LJIJI("targetView");
                throw null;
            }
            o.LJIJI("targetView");
            throw null;
        }
        o.LJIJI("targetView");
        throw null;
    }
}
