package X;

import Y.ACListenerS37S0200000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o3.h0;

/* renamed from: X.68u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1556068u extends FrameLayout {
    public static final int[] LJLLILLLL = {-1, -16777216, -1425344, -27843, -864954, -8863138, -8861530, -13265168, -14400333, -11053355, -469015, -5994149, -13479364, -13670003, -7170146, -13421773};
    public final Context LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;
    public InterfaceC1556368x LJLJJI;
    public final List<C1556168v> LJLJJL;
    public LinearLayout LJLJJLL;
    public C1555268m LJLJL;
    public final HashMap<Integer, String> LJLJLJ;
    public C1556168v LJLJLLL;
    public TuxIconView LJLL;
    public FrameLayout LJLLI;

    public final void LIZIZ() {
        Iterator it = ((ArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            C1556168v c1556168v = (C1556168v) it.next();
            if (c1556168v.LJLJJL) {
                LJ(1.1666666f, c1556168v, true);
                c1556168v.LJLJJL = false;
            }
        }
        C1556168v c1556168v2 = this.LJLJLLL;
        if (c1556168v2 != null && c1556168v2.LJLJJL) {
            LJ(1.0714285f, c1556168v2, true);
            this.LJLJLLL.LJLJJL = false;
        }
    }

    public final void LIZLLL() {
        if (C138525c8.LIZ()) {
            this.LJLJLLL = (C1556168v) findViewById(R.id.bid);
            this.LJLL = (TuxIconView) findViewById(R.id.bib);
            this.LJLLI = (FrameLayout) findViewById(R.id.bia);
            this.LJLJLLL.setVisibility(0);
            this.LJLL.setVisibility(0);
            C1556168v c1556168v = this.LJLJLLL;
            c1556168v.LJLJJI = -1;
            c1556168v.LJLIL.setColor(-1);
            final C131885Fo c131885Fo = (C131885Fo) findViewById(R.id.cn6);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c131885Fo.getLayoutParams();
            marginLayoutParams.setMarginStart((int) C74275TDb.LIZIZ(this.LJLIL, 44.0f));
            c131885Fo.setLayoutParams(marginLayoutParams);
            if (C90193gN.LIZ()) {
                c131885Fo.LJLILLLLZI = c131885Fo.LJLJJLL;
                c131885Fo.invalidate();
            } else {
                c131885Fo.LJLILLLLZI = c131885Fo.LJLJL;
                c131885Fo.invalidate();
            }
            c131885Fo.setDrawSize(0.0f);
            if (Build.VERSION.SDK_INT >= 23) {
                this.LJLJL.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.68w
                    public float LIZ;
                    public int LIZIZ;

                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                        if (C90193gN.LIZ()) {
                            if (this.LIZIZ == 0) {
                                this.LIZIZ = C1556068u.this.LJLJJLL.getWidth() - C1556068u.this.LJLJL.getWidth();
                            }
                            i = this.LIZIZ - i;
                        }
                        if (i < 3) {
                            if (this.LIZ != 0.0f) {
                                c131885Fo.setDrawSize(0.0f);
                                this.LIZ = 0.0f;
                                return;
                            }
                            return;
                        }
                        if (this.LIZ != 0.0f) {
                            return;
                        }
                        float LIZIZ = C74275TDb.LIZIZ(C1556068u.this.LJLIL, 24.0f);
                        this.LIZ = LIZIZ;
                        c131885Fo.setDrawSize(LIZIZ);
                    }
                });
            } else {
                c131885Fo.setDrawSize(C74275TDb.LIZIZ(this.LJLIL, 24.0f));
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LJLJJLL.getChildAt(0).getLayoutParams();
        marginLayoutParams2.setMarginStart((int) C74275TDb.LIZIZ(this.LJLIL, 8.0f));
        marginLayoutParams2.setMarginEnd(this.LJLILLLLZI);
        this.LJLJJLL.getChildAt(0).setLayoutParams(marginLayoutParams2);
    }

    public final void LIZ(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        int[] iArr = LJLLILLLL;
        int i2 = 0;
        do {
            arrayList.add(Integer.valueOf(iArr[i2]));
            i2++;
        } while (i2 < 16);
        LIZJ(arrayList);
        invalidate();
    }

    public final void LIZJ(List<Integer> list) {
        ((ArrayList) this.LJLJJL).clear();
        this.LJLJJLL.removeAllViews();
        if (C138525c8.LIZ()) {
            this.LJLJI = (int) C74275TDb.LIZIZ(getContext(), 24.0f);
        }
        for (int i = 0; i < list.size(); i++) {
            int i2 = this.LJLJI;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            C1556168v c1556168v = new C1556168v(this.LJLIL, null);
            int intValue = ((Integer) ListProtector.get(list, i)).intValue();
            c1556168v.LJLJJI = intValue;
            c1556168v.LJLIL.setColor(intValue);
            c1556168v.invalidate();
            c1556168v.setTag(Integer.valueOf(intValue));
            if (i == 15) {
                layoutParams.setMarginEnd((int) C74275TDb.LIZIZ(this.LJLIL, 12.0f));
            } else {
                layoutParams.setMarginEnd(this.LJLILLLLZI);
                if (i == 0) {
                    layoutParams.setMarginStart((int) C74275TDb.LIZIZ(this.LJLIL, 16.0f));
                    layoutParams.gravity = 16;
                    this.LJLJJLL.addView(c1556168v, layoutParams);
                    ((ArrayList) this.LJLJJL).add(c1556168v);
                    c1556168v.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS37S0200000_2(this, c1556168v, 11)));
                    h0.LJIJI(c1556168v, new C16120kC() { // from class: X.68y
                        @Override // X.C16120kC
                        public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
                            super.onInitializeAccessibilityNodeInfo(view, c17760mq);
                            c17760mq.LIZ.setSelected(((C1556168v) view).LJLJJL);
                        }
                    });
                    c1556168v.setContentDescription(this.LJLJLJ.get(Integer.valueOf(intValue)));
                }
            }
            layoutParams.setMarginStart((int) C74275TDb.LIZIZ(this.LJLIL, 2.0f));
            layoutParams.gravity = 16;
            this.LJLJJLL.addView(c1556168v, layoutParams);
            ((ArrayList) this.LJLJJL).add(c1556168v);
            c1556168v.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS37S0200000_2(this, c1556168v, 11)));
            h0.LJIJI(c1556168v, new C16120kC() { // from class: X.68y
                @Override // X.C16120kC
                public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
                    super.onInitializeAccessibilityNodeInfo(view, c17760mq);
                    c17760mq.LIZ.setSelected(((C1556168v) view).LJLJJL);
                }
            });
            c1556168v.setContentDescription(this.LJLJLJ.get(Integer.valueOf(intValue)));
        }
    }

    public void setColorChangeListener(InterfaceC1556368x interfaceC1556368x) {
        this.LJLJJI = interfaceC1556368x;
    }

    public void setColorPickerClickListener(View.OnClickListener onClickListener) {
        C16880lQ.LJIILJJIL(this.LJLLI, onClickListener);
    }

    public void setColorPickerColor(Integer num) {
        C1556168v c1556168v = this.LJLJLLL;
        if (c1556168v == null) {
            return;
        }
        int i = -1;
        if (num != null) {
            int intValue = num.intValue();
            c1556168v.LJLJJI = intValue;
            c1556168v.LJLIL.setColor(intValue);
            LIZIZ();
            LJ(1.0714285f, this.LJLJLLL, false);
            C1556168v c1556168v2 = this.LJLJLLL;
            c1556168v2.LJLJJL = true;
            c1556168v2.setSelected(true);
        } else {
            num = -1;
            C1556168v c1556168v3 = this.LJLJLLL;
            c1556168v3.LJLJJI = -1;
            c1556168v3.LJLIL.setColor(-1);
            LJ(1.0714285f, this.LJLJLLL, true);
            this.LJLJLLL.LJLJJL = false;
        }
        int intValue2 = num.intValue();
        C07290Qj.LIZ(Color.red(intValue2), Color.green(intValue2), Color.blue(intValue2), new float[3]);
        if (r3[2] > 0.5d) {
            i = -16777216;
        }
        this.LJLL.setTintColor(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        LJ(1.1666666f, r4, false);
        r4.LJLJJL = true;
        r3 = r5.LJLJL;
        r3.getClass();
        r3.postDelayed(new Y.ARunnableS21S0200000_2(r4, r3, 54), 100);
        r1 = r4.getColor();
        r0 = r5.LJLJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        r0.LIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
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
            r5.LIZIZ()
            java.util.List<X.68v> r0 = r5.LJLJJL
            r3 = 0
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.68v r4 = (X.C1556168v) r4
            java.util.List<X.68v> r0 = r5.LJLJJL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L14:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r1 = r2.next()
            X.68v r1 = (X.C1556168v) r1
            if (r1 == 0) goto L14
            int r0 = r1.getColor()
            if (r0 != r6) goto L14
            r4 = r1
        L29:
            r0 = 1066751317(0x3f955555, float:1.1666666)
            LJ(r0, r4, r3)
            r0 = 1
            r4.LJLJJL = r0
            X.68m r3 = r5.LJLJL
            r3.getClass()
            Y.ARunnableS21S0200000_2 r2 = new Y.ARunnableS21S0200000_2
            r0 = 54
            r2.<init>(r4, r3, r0)
            r0 = 100
            r3.postDelayed(r2, r0)
            int r1 = r4.getColor()
            X.68x r0 = r5.LJLJJI
            if (r0 == 0) goto L4e
            r0.LIZ(r1)
        L4e:
            return
        L4f:
            if (r4 != 0) goto L29
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1556068u.setDefault(int):void");
    }

    public void setSelectColorView(int i) {
        LIZIZ();
        Iterator it = ((ArrayList) this.LJLJJL).iterator();
        while (it.hasNext()) {
            C1556168v c1556168v = (C1556168v) it.next();
            if (c1556168v != null && c1556168v.getColor() == i) {
                LJ(1.1666666f, c1556168v, false);
                c1556168v.LJLJJL = true;
                this.LJLJL.LIZ(c1556168v);
                return;
            }
        }
    }

    public C1556068u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJI = 80;
        this.LJLJJL = new ArrayList();
        HashMap<Integer, String> hashMap = new HashMap<>();
        this.LJLJLJ = hashMap;
        this.LJLJLLL = null;
        this.LJLL = null;
        this.LJLLI = null;
        this.LJLIL = context;
        this.LJLILLLLZI = (int) C74275TDb.LIZIZ(context, 6.0f);
        this.LJLJI = (int) C74275TDb.LIZIZ(context, 24.0f);
        hashMap.put(-1, context.getResources().getString(R.string.ajz));
        hashMap.put(-16777216, context.getResources().getString(R.string.ajl));
        hashMap.put(-1425344, context.getString(R.string.ajx));
        hashMap.put(-27843, context.getString(R.string.ajw));
        hashMap.put(-864954, context.getString(R.string.ak0));
        hashMap.put(-8863138, context.getString(R.string.ajs));
        hashMap.put(-8861530, context.getString(R.string.ajy));
        hashMap.put(-13265168, context.getString(R.string.ajm));
        hashMap.put(-14400333, context.getString(R.string.ajo));
        hashMap.put(-11053355, context.getString(R.string.ajt));
        hashMap.put(-469015, context.getString(R.string.ajv));
        hashMap.put(-5994149, context.getString(R.string.aju));
        hashMap.put(-13479364, context.getString(R.string.ajq));
        hashMap.put(-13670003, context.getString(R.string.ajn));
        hashMap.put(-7170146, context.getString(R.string.ajr));
        hashMap.put(-13421773, context.getString(R.string.ajp));
        context.getString(R.string.b30);
        C16880lQ.LLLZIIL(R.layout.au3, C16880lQ.LLZIL(getContext()), this);
        C1555268m c1555268m = (C1555268m) findViewById(R.id.jcz);
        this.LJLJL = c1555268m;
        int i = 0;
        c1555268m.setHorizontalScrollBarEnabled(false);
        this.LJLJJLL = (LinearLayout) findViewById(R.id.bi7);
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(Integer.valueOf(LJLLILLLL[i]));
            i++;
        } while (i < 16);
        LIZJ(arrayList);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public static void LJ(float f, View view, boolean z) {
        float f2;
        float f3;
        float f4;
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        if (z) {
            f2 = f;
        } else {
            f2 = 1.0f;
        }
        fArr[0] = f2;
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr);
        float[] fArr2 = new float[2];
        if (z) {
            f4 = f;
        } else {
            f4 = 1.0f;
        }
        fArr2[0] = f4;
        if (z) {
            f = 1.0f;
        }
        fArr2[1] = f;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", fArr2);
        animatorSet.setDuration(200L);
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }
}
