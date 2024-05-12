package X;

import Y.ACListenerS20S0201000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Ic, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C158026Ic extends FrameLayout {
    public static final int[] LJLJLJ = {-1, -16777216, -1425344, -27843, -864954, -8863138, -8861530, -13265168, -14400333, -11053355, -469015, -5994149, -13479364, -13670003, -7170146, -13421773};
    public final Context LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;
    public C6IY LJLJJI;
    public final List<C158036Id> LJLJJL;
    public LinearLayout LJLJJLL;
    public C158046Ie LJLJL;

    public final void LIZ() {
        Iterator it = ((ArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            C158036Id c158036Id = (C158036Id) it.next();
            if (c158036Id.LJLJJL) {
                LIZIZ(c158036Id, true);
                c158036Id.LJLJJL = false;
            }
        }
    }

    public void setColorChangeListener(C6IY c6iy) {
        this.LJLJJI = c6iy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        LIZIZ(r4, false);
        r4.LJLJJL = true;
        r3 = r5.LJLJL;
        r3.getClass();
        r3.postDelayed(new Y.ARunnableS11S0201000_8(2, r3, r4, 13), 100);
        r3 = r4.getColor();
        r0 = r5.LJLJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        r2 = (X.C6IQ) ((X.C1YZ) r0).LIZ;
        r2.LJLJI.LJI(r2.LJLJJL, r3);
        r2.LJLJLJ = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setDefault(int r6) {
        /*
            r5 = this;
            r5.LIZ()
            java.util.List<X.6Id> r0 = r5.LJLJJL
            r3 = 0
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.6Id r4 = (X.C158036Id) r4
            java.util.List<X.6Id> r0 = r5.LJLJJL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L14:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r1 = r2.next()
            X.6Id r1 = (X.C158036Id) r1
            if (r1 == 0) goto L14
            int r0 = r1.getColor()
            if (r0 != r6) goto L14
            r4 = r1
        L29:
            LIZIZ(r4, r3)
            r0 = 1
            r4.LJLJJL = r0
            X.6Ie r3 = r5.LJLJL
            r3.getClass()
            Y.ARunnableS11S0201000_8 r2 = new Y.ARunnableS11S0201000_8
            r1 = 2
            r0 = 13
            r2.<init>(r1, r3, r4, r0)
            r0 = 100
            r3.postDelayed(r2, r0)
            int r3 = r4.getColor()
            X.6IY r0 = r5.LJLJJI
            if (r0 == 0) goto L58
            X.1YZ r0 = (X.C1YZ) r0
            java.lang.Object r2 = r0.LIZ
            X.6IQ r2 = (X.C6IQ) r2
            X.6Dl r1 = r2.LJLJI
            int r0 = r2.LJLJJL
            r1.LJI(r0, r3)
            r2.LJLJLJ = r3
        L58:
            return
        L59:
            if (r4 != 0) goto L29
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158026Ic.setDefault(int):void");
    }

    public void setSelectColorView(int i) {
        LIZ();
        Iterator it = ((ArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            C158036Id c158036Id = (C158036Id) it.next();
            if (c158036Id != null && c158036Id.getColor() == i) {
                LIZIZ(c158036Id, false);
                c158036Id.LJLJJL = true;
                this.LJLJL.LIZ(c158036Id);
                return;
            }
        }
    }

    public C158026Ic(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJI = 80;
        ArrayList arrayList = new ArrayList();
        this.LJLJJL = arrayList;
        this.LJLIL = context;
        this.LJLILLLLZI = (int) C74275TDb.LIZIZ(context, 6.0f);
        this.LJLJI = (int) C74275TDb.LIZIZ(context, 30.0f);
        this.LJLJJLL = new LinearLayout(getContext());
        this.LJLJL = new C158046Ie(getContext());
        this.LJLJL.addView(this.LJLJJLL, new FrameLayout.LayoutParams(-1, -1));
        this.LJLJL.setHorizontalScrollBarEnabled(false);
        addView(this.LJLJL, new FrameLayout.LayoutParams(-1, -1));
        arrayList.clear();
        for (int i = 0; i < 16; i++) {
            int i2 = this.LJLJI;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            C158036Id c158036Id = new C158036Id(this.LJLIL);
            int[] iArr = LJLJLJ;
            int i3 = iArr[i];
            c158036Id.LJLJJI = i3;
            c158036Id.LJLIL.setColor(i3);
            c158036Id.invalidate();
            c158036Id.setTag(Integer.valueOf(iArr[i]));
            if (i == 15) {
                layoutParams.rightMargin = (int) C74275TDb.LIZIZ(this.LJLIL, 12.0f);
            } else {
                layoutParams.rightMargin = this.LJLILLLLZI;
                if (i == 0) {
                    layoutParams.leftMargin = (int) C74275TDb.LIZIZ(this.LJLIL, 16.0f);
                    layoutParams.gravity = 16;
                    this.LJLJJLL.addView(c158036Id, layoutParams);
                    ((ArrayList) this.LJLJJL).add(c158036Id);
                    c158036Id.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS20S0201000_2(1, this, c158036Id, 0)));
                }
            }
            layoutParams.leftMargin = (int) C74275TDb.LIZIZ(this.LJLIL, 2.0f);
            layoutParams.gravity = 16;
            this.LJLJJLL.addView(c158036Id, layoutParams);
            ((ArrayList) this.LJLJJL).add(c158036Id);
            c158036Id.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS20S0201000_2(1, this, c158036Id, 0)));
        }
    }

    public static void LIZIZ(View view, boolean z) {
        float f;
        float f2;
        float f3;
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        float f4 = 1.0f;
        if (z) {
            f = 1.2f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 1.2f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr);
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 1.2f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (!z) {
            f4 = 1.2f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", fArr2);
        animatorSet.setDuration(200L);
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLJI = getMeasuredHeight();
    }
}
