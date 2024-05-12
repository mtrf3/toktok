package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L69 extends FrameLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public AUU LJLJI;
    public String LJLJJI;

    private final L6A getAvatarDelegate() {
        return (L6A) this.LJLIL.getValue();
    }

    public final C71799SFv getAvatar() {
        return (C71799SFv) this.LJLILLLLZI.getValue();
    }

    public final int getAvatarSizePx() {
        return O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(Math.max(getAvatarDelegate().LJIILJJIL(), 0))));
    }

    public final int getContainerHeightPx() {
        return Math.max(getAvatarDelegate().LIZLLL(), 0);
    }

    public final int getContainerWidthPx() {
        return Math.max(getAvatarDelegate().LIZLLL(), 0);
    }

    public final java.util.Map<EnumC53663L4h, L4O> getCurrentActiveBusiness() {
        return getAvatarDelegate().LJFF();
    }

    public final AUU getConfig() {
        return this.LJLJI;
    }

    public final String getUid() {
        return this.LJLJJI;
    }

    public final void LIZIZ(View.OnClickListener onClickListener) {
        getAvatarDelegate().LJIIJJI(onClickListener);
    }

    public final void LIZJ(AUU auu) {
        getAvatarDelegate().LIZ(auu);
        this.LJLJI = auu;
    }

    public final void LJFF(C62562cu c62562cu) {
        getAvatarDelegate().LJIILIIL(c62562cu);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        getAvatarDelegate().LJIIJ(canvas, new AqS156S0200000_9(this, canvas, 7));
    }

    public final void onEvent(AU0 event) {
        o.LJIIIZ(event, "event");
        getAvatarDelegate().onEvent(event);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(getAvatarDelegate().LJII(onClickListener));
        setClickable(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L69(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.jm);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(L58.LJLIL);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS156S0200000_9(context, attributeSet, 87));
        try {
            getAvatarDelegate().LJIJI(this, context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.m6, R.attr.m7, R.attr.m8, R.attr.m9, R.attr.bpx}, R.attr.jm, 0);
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…tarView, defStyleAttr, 0)");
            getAvatarDelegate().LJIIIZ(obtainStyledAttributes.getInt(4, 64));
            int color = obtainStyledAttributes.getColor(3, R.attr.cj);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(color);
            gradientDrawable.setShape(1);
            getAvatar().setBackground(gradientDrawable);
            obtainStyledAttributes.recycle();
        } catch (Exception unused) {
        }
    }

    public static final /* synthetic */ void LIZ(L69 l69, Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final void LIZLLL(EnumC53663L4h businessTag, L59 command) {
        o.LJIIIZ(businessTag, "businessTag");
        o.LJIIIZ(command, "command");
        getAvatarDelegate().LJIILL(businessTag, command);
    }

    public final void LJI(EnumC53663L4h tag, InterfaceC88472Yns<? super L4O, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(tag, "tag");
        getAvatarDelegate().LJI(tag, interfaceC88472Yns);
    }

    public final void LJII(Object obj, EnumC53663L4h enumC53663L4h) {
        getAvatarDelegate().LJIIIIZZ(obj, false, enumC53663L4h);
    }

    public final void LJIIIIZZ(int i, Integer num) {
        getAvatarDelegate().LJIIL(i, num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r0 != 1073741824) goto L20;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            super.onMeasure(r6, r7)
            X.L6A r0 = r5.getAvatarDelegate()
            int r4 = r0.LIZLLL()
            X.L6A r0 = r5.getAvatarDelegate()
            boolean r0 = r0.LJIJJ()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L3a
        L17:
            r2 = r4
        L18:
            X.L6A r0 = r5.getAvatarDelegate()
            boolean r0 = r0.LJIJJ()
            if (r0 == 0) goto L2d
        L22:
            r5.setMeasuredDimension(r2, r4)
            X.L6A r0 = r5.getAvatarDelegate()
            r0.LJIILLIIL(r2, r4)
            return
        L2d:
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            if (r1 == r3) goto L38
            goto L22
        L38:
            r4 = r0
            goto L22
        L3a:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r2 = android.view.View.MeasureSpec.getSize(r6)
            if (r0 == r3) goto L18
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L69.onMeasure(int, int):void");
    }

    public final void LJ(String str, Object obj, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLJJI = str;
        getAvatarDelegate().LIZJ(str, obj, lifecycleOwner);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        getAvatarDelegate().LJ(i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getAvatarDelegate().LIZIZ();
    }
}
