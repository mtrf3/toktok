package X;

import Y.ACListenerS25S0201000_8;
import Y.IDRunnableS6S0101000;
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

/* loaded from: classes9.dex */
public class KUV extends FrameLayout {
    public static final int[] LJLJLJ = {-1, -16777216, -1425344, -27843, -864954, -8863138, -8861530, -13265168, -14400333, -11053355, -469015, -5994149, -13479364, -13670003, -7170146, -13421773};
    public final Context LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;
    public InterfaceC159606Oe LJLJJI;
    public final List<KUW> LJLJJL;
    public LinearLayout LJLJJLL;
    public KUX LJLJL;

    public final void LIZ() {
        Iterator it = ((ArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            KUW kuw = (KUW) it.next();
            if (kuw.LJLJJL) {
                LIZIZ(kuw, true);
                kuw.LJLJJL = false;
                kuw.setSelected(false);
            }
        }
    }

    public void setColorChangeListener(InterfaceC159606Oe interfaceC159606Oe) {
        this.LJLJJI = interfaceC159606Oe;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        LIZIZ(r4, false);
        r4.LJLJJL = true;
        r4.setSelected(true);
        r3 = r5.LJLJL;
        r3.getClass();
        r3.postDelayed(new Y.ARunnableS11S0201000_8(2, r3, r4, 12), 100);
        r1 = r4.getColor();
        r0 = r5.LJLJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        r0.LIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
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
            java.util.List<X.KUW> r0 = r5.LJLJJL
            r3 = 0
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.KUW r4 = (X.KUW) r4
            java.util.List<X.KUW> r0 = r5.LJLJJL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L14:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r1 = r2.next()
            X.KUW r1 = (X.KUW) r1
            if (r1 == 0) goto L14
            int r0 = r1.getColor()
            if (r0 != r6) goto L14
            r4 = r1
        L29:
            LIZIZ(r4, r3)
            r0 = 1
            r4.LJLJJL = r0
            r4.setSelected(r0)
            X.KUX r3 = r5.LJLJL
            r3.getClass()
            Y.ARunnableS11S0201000_8 r2 = new Y.ARunnableS11S0201000_8
            r1 = 2
            r0 = 12
            r2.<init>(r1, r3, r4, r0)
            r0 = 100
            r3.postDelayed(r2, r0)
            int r1 = r4.getColor()
            X.6Oe r0 = r5.LJLJJI
            if (r0 == 0) goto L4f
            r0.LIZ(r1)
        L4f:
            return
        L50:
            if (r4 != 0) goto L29
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KUV.setDefault(int):void");
    }

    public void setSelectColorView(int i) {
        LIZ();
        Iterator it = ((ArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            KUW kuw = (KUW) it.next();
            if (kuw != null && kuw.getColor() == i) {
                LIZIZ(kuw, false);
                kuw.LJLJJL = true;
                kuw.setSelected(true);
                this.LJLJL.LIZ(kuw);
                postDelayed(new IDRunnableS6S0101000(6, kuw, 35), 100L);
                return;
            }
        }
    }

    public KUV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJI = 80;
        ArrayList arrayList = new ArrayList();
        this.LJLJJL = arrayList;
        this.LJLIL = context;
        this.LJLILLLLZI = (int) C74275TDb.LIZIZ(context, 6.0f);
        this.LJLJI = (int) C74275TDb.LIZIZ(context, 24.0f);
        this.LJLJJLL = new LinearLayout(getContext());
        this.LJLJL = new KUX(getContext());
        this.LJLJL.addView(this.LJLJJLL, new FrameLayout.LayoutParams(-1, -1));
        this.LJLJL.setHorizontalScrollBarEnabled(false);
        addView(this.LJLJL, new FrameLayout.LayoutParams(-1, -1));
        arrayList.clear();
        for (int i = 0; i < 16; i++) {
            int i2 = this.LJLJI;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            KUW kuw = new KUW(this.LJLIL);
            int[] iArr = LJLJLJ;
            int i3 = iArr[i];
            kuw.LJLJJI = i3;
            kuw.LJLIL.setColor(i3);
            kuw.invalidate();
            kuw.setTag(Integer.valueOf(iArr[i]));
            if (i == 15) {
                layoutParams.setMarginEnd((int) C74275TDb.LIZIZ(this.LJLIL, 12.0f));
            } else {
                layoutParams.setMarginEnd(this.LJLILLLLZI);
                if (i == 0) {
                    layoutParams.setMarginStart((int) C74275TDb.LIZIZ(this.LJLIL, 16.0f));
                    layoutParams.gravity = 16;
                    this.LJLJJLL.addView(kuw, layoutParams);
                    ((ArrayList) this.LJLJJL).add(kuw);
                    kuw.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0201000_8(2, this, kuw, 5)));
                    C78866UxK.LJJIIJZLJL(kuw);
                }
            }
            layoutParams.setMarginStart((int) C74275TDb.LIZIZ(this.LJLIL, 2.0f));
            layoutParams.gravity = 16;
            this.LJLJJLL.addView(kuw, layoutParams);
            ((ArrayList) this.LJLJJL).add(kuw);
            kuw.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS25S0201000_8(2, this, kuw, 5)));
            C78866UxK.LJJIIJZLJL(kuw);
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
            f = 1.1666666f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 1.1666666f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr);
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 1.1666666f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (!z) {
            f4 = 1.1666666f;
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
