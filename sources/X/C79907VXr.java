package X;

import Y.IDAListenerS77S0100000_9;
import Y.IDRunnableS6S0101000;
import android.animation.ObjectAnimator;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.VXr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79907VXr extends TuxTextView {
    public static final /* synthetic */ int LLIL = 0;
    public List<Character> LJLLLL;
    public boolean LJLLLLLL;
    public final C79909VXt LJLZ;
    public int LJZ;
    public Integer LJZI;
    public final int LJZL;
    public final int LL;
    public final int LLD;
    public final int LLF;
    public InterfaceC79913VXx LLFF;
    public float LLFFF;
    public float LLFII;
    public boolean LLFZ;
    public float LLI;
    public float LLIFFJFJJ;
    public final int[] LLII;
    public C79910VXu LLIIII;
    public C79910VXu LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public final List<OSZ<Integer, Integer>> LLIIIZ;
    public final List<OSZ<Integer, Integer>> LLIIJI;
    public final float LLIIJLIL;
    public final C1295156l LLIIL;
    public final C1295156l LLIILII;
    public final IDRunnableS6S0101000 LLIILZL;
    public final java.util.Map<Integer, View> LLIIZ;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LLIIZ;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public final void LJJJIL() {
        C79910VXu c79910VXu;
        C79910VXu c79910VXu2;
        C79909VXt c79909VXt = this.LJLZ;
        if (c79909VXt == null || (c79910VXu = c79909VXt.LJ) == null || (c79910VXu2 = c79909VXt.LJFF) == null) {
            return;
        }
        this.LLIIL.LIZ(getLeft() + c79910VXu.LJIIIZ + ((int) getTranslationX()), getTop() + c79910VXu.LJIIJ + ((int) getTranslationY()));
        this.LLIILII.LIZ(getLeft() + c79910VXu2.LJIIIZ + ((int) getTranslationX()), getTop() + c79910VXu2.LJIIJ + ((int) getTranslationY()));
    }

    public final boolean LJJJJLL() {
        Boolean bool;
        C79909VXt c79909VXt = this.LJLZ;
        if (c79909VXt != null) {
            bool = Boolean.valueOf(c79909VXt.LJFF());
        } else {
            bool = null;
        }
        Boolean bool2 = Boolean.FALSE;
        if (bool == null) {
            bool = bool2;
        }
        return bool.booleanValue();
    }

    public final void LJJJJZ() {
        Integer num;
        C79909VXt c79909VXt = this.LJLZ;
        Integer num2 = null;
        if (c79909VXt != null) {
            num = Integer.valueOf(c79909VXt.LIZJ.LIZIZ(c79909VXt.LIZIZ));
        } else {
            num = null;
        }
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue();
        C79909VXt c79909VXt2 = this.LJLZ;
        if (c79909VXt2 != null) {
            num2 = Integer.valueOf(c79909VXt2.LIZJ.LIZ(c79909VXt2.LIZIZ));
        }
        if (num2 == null) {
            num2 = 0;
        }
        setBackgroundPosition(C47261Igj.LJJIJ(new OSZ(Integer.valueOf(intValue), Integer.valueOf(num2.intValue()))));
    }

    public final OSZ<Rect, Rect> getCursorsPosition() {
        Rect LIZJ;
        C79909VXt c79909VXt = this.LJLZ;
        if (c79909VXt != null) {
            Rect LIZJ2 = c79909VXt.LIZJ(c79909VXt.LJI);
            if (o.LJ(c79909VXt.LJI, c79909VXt.LJ)) {
                LIZJ = c79909VXt.LIZJ(c79909VXt.LJFF);
            } else {
                LIZJ = c79909VXt.LIZJ(c79909VXt.LJ);
            }
            return new OSZ<>(LIZJ, LIZJ2);
        }
        return null;
    }

    public final OSZ<Float, Float> getDrawAreaHorizontal() {
        return new OSZ<>(Float.valueOf(this.LLFFF), Float.valueOf(this.LLFII));
    }

    public final String getSelectText() {
        String str;
        C79909VXt c79909VXt = this.LJLZ;
        if (c79909VXt == null || (str = c79909VXt.LIZJ.LIZJ) == null) {
            return "";
        }
        return str;
    }

    public final int getSelectTextEnd() {
        Integer num;
        C79909VXt c79909VXt = this.LJLZ;
        if (c79909VXt != null) {
            num = Integer.valueOf(c79909VXt.LIZJ.LIZ(c79909VXt.LIZIZ));
        } else {
            num = null;
        }
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    public final int getSelectTextStart() {
        Integer num;
        C79909VXt c79909VXt = this.LJLZ;
        if (c79909VXt != null) {
            num = Integer.valueOf(c79909VXt.LIZJ.LIZIZ(c79909VXt.LIZIZ));
        } else {
            num = null;
        }
        if (num == null) {
            num = 0;
        }
        return num.intValue();
    }

    public final void LJJJJL() {
        ViewGroup viewGroup;
        ViewParent parent = getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.requestDisallowInterceptTouchEvent(false);
        }
        post(new IDRunnableS6S0101000(4, this, 5));
    }

    public final List<Character> getValidLetters() {
        return this.LJLLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00fd, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ff, code lost:
    
        r5.add(new java.lang.ref.WeakReference<>(r6));
        X.L22.LIZJ.put(java.lang.Integer.valueOf(r2.hashCode()), r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C79907VXr(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79907VXr.<init>(android.content.Context):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00aa, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0190, code lost:
    
        if (r5 > (r1 - ((r1 - r6) / 2))) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJJJ(android.view.MotionEvent r16) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79907VXr.LJJJJ(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        CharSequence text;
        int lineForOffset;
        int lineForOffset2;
        float intValue;
        int intValue2;
        Layout layout;
        CharSequence text2;
        int lineForOffset3;
        int lineForOffset4;
        float primaryHorizontal;
        float primaryHorizontal2;
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        this.LLFFF = 2.1474836E9f;
        this.LLFII = -2.1474836E9f;
        if (this.LJZ == -1) {
            return;
        }
        Layout layout2 = getLayout();
        boolean z = false;
        boolean z2 = true;
        if (layout2 != null && (text = getText()) != null && !ujb.o.LJJJJJL(text)) {
            TextPaint paint = layout2.getPaint();
            Paint paint2 = new Paint();
            paint2.setColor(this.LJZ);
            Iterator it = ((ArrayList) this.LLIIIZ).iterator();
            while (it.hasNext()) {
                OSZ osz = (OSZ) it.next();
                int intValue3 = ((Number) osz.getFirst()).intValue();
                int intValue4 = ((Number) osz.getSecond()).intValue();
                if (intValue3 >= 0 && intValue4 <= getText().length() && (lineForOffset = layout2.getLineForOffset(intValue3)) <= (lineForOffset2 = layout2.getLineForOffset(intValue4))) {
                    int i = lineForOffset;
                    while (true) {
                        float lineBaseline = layout2.getLineBaseline(i) + paint.getFontMetrics().ascent;
                        float lineBaseline2 = layout2.getLineBaseline(i) + paint.getFontMetrics().descent;
                        if (i > lineForOffset) {
                            intValue = 0.0f;
                        } else {
                            intValue = ((Number) C79911VXv.LIZJ(intValue3, this, z2).getFirst()).intValue();
                        }
                        if (i < lineForOffset2) {
                            intValue2 = (getWidth() - getPaddingEnd()) - getPaddingStart();
                        } else {
                            intValue2 = ((Number) C79911VXv.LIZJ(intValue4, this, z).getFirst()).intValue();
                        }
                        float f = intValue2;
                        this.LLFFF = Math.min((getPaddingStart() + intValue) - this.LLD, this.LLFFF);
                        this.LLFII = Math.max(getPaddingStart() + f + this.LLD, this.LLFII);
                        canvas.save();
                        Rect rect = new Rect(0, 0, (this.LLD * 2) + ((int) (f - intValue)), (int) ((lineBaseline2 - lineBaseline) + (this.LLF * 2)));
                        canvas.translate((getPaddingStart() - this.LLD) + intValue, (lineBaseline + getPaddingTop()) - this.LLF);
                        canvas.drawRect(rect, paint2);
                        canvas.restore();
                        if (i != lineForOffset2) {
                            i++;
                            z = false;
                            z2 = true;
                        }
                    }
                }
                z = false;
                z2 = true;
            }
        }
        Integer num = this.LJZI;
        if (num != null) {
            int intValue5 = num.intValue();
            Integer num2 = this.LJZI;
            if ((num2 != null && num2.intValue() == -1) || (layout = getLayout()) == null || (text2 = getText()) == null || ujb.o.LJJJJJL(text2)) {
                return;
            }
            TextPaint paint3 = layout.getPaint();
            Iterator it2 = ((ArrayList) this.LLIIJI).iterator();
            while (it2.hasNext()) {
                OSZ osz2 = (OSZ) it2.next();
                int intValue6 = ((Number) osz2.getFirst()).intValue();
                int intValue7 = ((Number) osz2.getSecond()).intValue();
                if (intValue6 >= 0 && intValue7 <= getText().length() && (lineForOffset3 = layout.getLineForOffset(intValue6)) <= (lineForOffset4 = layout.getLineForOffset(intValue7))) {
                    int i2 = lineForOffset3;
                    while (true) {
                        float lineBaseline3 = layout.getLineBaseline(i2) + paint3.getFontMetrics().descent;
                        if (i2 > lineForOffset3) {
                            primaryHorizontal = layout.getLineLeft(i2);
                        } else {
                            primaryHorizontal = layout.getPrimaryHorizontal(intValue6);
                        }
                        if (i2 < lineForOffset4) {
                            primaryHorizontal2 = layout.getLineRight(i2);
                        } else {
                            primaryHorizontal2 = layout.getPrimaryHorizontal(intValue7);
                        }
                        this.LLFFF = Math.min((getPaddingStart() + primaryHorizontal) - this.LJZL, this.LLFFF);
                        this.LLFII = Math.max(getPaddingStart() + primaryHorizontal2 + this.LJZL, this.LLFII);
                        canvas.save();
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), intValue5));
                        int intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
                        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
                        bitmapDrawable.setBounds(new Rect(0, 0, (this.LJZL * 2) + ((int) (primaryHorizontal2 - primaryHorizontal)), intrinsicHeight));
                        canvas.translate((getPaddingStart() - this.LJZL) + primaryHorizontal, lineBaseline3 + getPaddingTop() + this.LL);
                        bitmapDrawable.draw(canvas);
                        canvas.restore();
                        if (i2 != lineForOffset4) {
                            i2++;
                        }
                    }
                }
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (LJJJJ(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void setBackgroundPosition(List<OSZ<Integer, Integer>> positionList) {
        o.LJIIIZ(positionList, "positionList");
        ((ArrayList) this.LLIIIZ).clear();
        ((ArrayList) this.LLIIIZ).addAll(C79911VXv.LIZIZ(positionList));
        invalidate();
    }

    public final void setEnableAutoComplete(boolean z) {
        C79909VXt c79909VXt = this.LJLZ;
        if (c79909VXt != null) {
            c79909VXt.LIZ = z;
        }
    }

    public final void setEnableTextSelect(boolean z) {
        this.LJLLLLLL = z;
    }

    public final void setSelectableOnChangeListener(InterfaceC79913VXx interfaceC79913VXx) {
        this.LLFF = interfaceC79913VXx;
    }

    public final void setUnderlineDrawableRes(Integer num) {
        this.LJZI = num;
    }

    public final void setUnderlinePosition(List<OSZ<Integer, Integer>> positionList) {
        o.LJIIIZ(positionList, "positionList");
        ((ArrayList) this.LLIIJI).clear();
        ((ArrayList) this.LLIIJI).addAll(C79911VXv.LIZIZ(positionList));
        invalidate();
    }

    public final void setValidLetters(List<Character> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LJLLLL = list;
    }

    public static void LJJJJJ(C1295156l c1295156l, float f, float f2, InterfaceC65784Pro interfaceC65784Pro) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c1295156l, "alpha", f, f2);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(new IDAListenerS77S0100000_9(interfaceC65784Pro, 28));
        ofFloat.start();
    }
}
