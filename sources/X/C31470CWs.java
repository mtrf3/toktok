package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CWs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31470CWs extends C1KA {
    public List<? extends AbstractC31462CWk<? extends AbstractC31467CWp>> LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public final Paint LJLJLJ;
    public InterfaceC29521BiH LJLJLLL;
    public final java.util.Map<AbstractC31462CWk<? extends AbstractC31467CWp>, Float> LJLL;
    public int LJLLI;
    public C31472CWu LJLLILLLL;
    public float LJLLJ;
    public boolean LJLLL;

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (this.LJLJJLL) {
            this.LJLLILLLL.LIZJ();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public final C31472CWu getBadgeManager() {
        return this.LJLLILLLL;
    }

    public final boolean getClickAble() {
        return this.LJLLL;
    }

    public final float getDownX() {
        return this.LJLLJ;
    }

    public final int getTypographyName() {
        return this.LJLJL;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        List<? extends AbstractC31462CWk<? extends AbstractC31467CWp>> list;
        List LLJI;
        super.onDraw(canvas);
        if (canvas != null && (list = this.LJLJI) != null && (LLJI = ORZ.LLJI(list)) != null) {
            boolean z = true;
            if (!(!LLJI.isEmpty()) || this.LJLLI == 0) {
                return;
            }
            if (C16310kV.LIZLLL(this) != 1) {
                z = false;
            }
            int i = this.LJLLI;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                AbstractC31462CWk<? extends AbstractC31467CWp> abstractC31462CWk = (AbstractC31462CWk) ListProtector.get(LLJI, i3);
                int LIZIZ = abstractC31462CWk.LIZIZ().LIZIZ(this.LJLJLJ);
                if (i3 > 0) {
                    i2 += this.LJLJJI;
                }
                canvas.save();
                float width = z ? (getWidth() - i2) - LIZIZ : i2;
                canvas.translate(width, 0.0f);
                if (((LinkedHashMap) this.LJLL).get(abstractC31462CWk) == null) {
                    this.LJLL.put(abstractC31462CWk, Float.valueOf(width));
                }
                abstractC31462CWk.LIZIZ().LIZ(canvas, this.LJLJLJ);
                canvas.restore();
                i2 += LIZIZ;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        InterfaceC29521BiH interfaceC29521BiH;
        int i;
        AbstractC31462CWk<? extends AbstractC31467CWp> abstractC31462CWk = null;
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                this.LJLLJ = motionEvent.getX();
                this.LJLLL = true;
            } else if (valueOf != null) {
                if (valueOf.intValue() == 2 || valueOf.intValue() == 3) {
                    this.LJLLL = false;
                } else if (valueOf.intValue() == 1) {
                    this.LJLLL = true;
                    float x = motionEvent.getX();
                    java.util.Map<AbstractC31462CWk<? extends AbstractC31467CWp>, Float> map = this.LJLL;
                    if (map != null && !map.isEmpty()) {
                        for (Map.Entry entry : ((LinkedHashMap) this.LJLL).entrySet()) {
                            AbstractC31462CWk<? extends AbstractC31467CWp> abstractC31462CWk2 = (AbstractC31462CWk) entry.getKey();
                            float floatValue = ((Number) entry.getValue()).floatValue();
                            if (C15380j0.LJIIZILJ()) {
                                if (abstractC31462CWk2 != null) {
                                    i = abstractC31462CWk2.LIZIZ().LIZIZ(this.LJLJLJ);
                                } else {
                                    i = 0;
                                }
                                if (x < floatValue + i) {
                                    abstractC31462CWk = abstractC31462CWk2;
                                }
                            } else if (x > floatValue) {
                                abstractC31462CWk = abstractC31462CWk2;
                            }
                        }
                        if (abstractC31462CWk != null && this.LJLLL && (interfaceC29521BiH = this.LJLJLLL) != null) {
                            interfaceC29521BiH.LIZ(abstractC31462CWk);
                        }
                    }
                }
            }
        }
        return this.LJLLL;
    }

    public final void setBadgeManager(C31472CWu c31472CWu) {
        o.LJIIIZ(c31472CWu, "<set-?>");
        this.LJLLILLLL = c31472CWu;
    }

    public final void setBadges(List<AbstractC31462CWk<? extends AbstractC31467CWp>> badges) {
        boolean z;
        o.LJIIIZ(badges, "badges");
        List<? extends AbstractC31462CWk<? extends AbstractC31467CWp>> list = this.LJLJI;
        if ((list != null && !list.isEmpty()) || !badges.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJI = badges;
        if (true ^ badges.isEmpty()) {
            Iterator<AbstractC31462CWk<? extends AbstractC31467CWp>> it = badges.iterator();
            while (it.hasNext()) {
                AbstractC31467CWp LIZIZ = it.next().LIZIZ();
                int i = this.LJLJL;
                if (i != -1) {
                    LIZIZ.LIZLLL = i;
                }
                int i2 = this.LJLJJL;
                if (i2 != 0) {
                    LIZIZ.LIZJ = i2;
                }
            }
        }
        this.LJLLI = 0;
        if (z) {
            requestLayout();
        }
    }

    public final void setClickAble(boolean z) {
        this.LJLLL = z;
    }

    public final void setDownX(float f) {
        this.LJLLJ = f;
    }

    public final void setOnBadgeClickListener(InterfaceC29521BiH listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJLLL = listener;
    }

    public final void setTypographyName(int i) {
        this.LJLJL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31470CWs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.afl);
        this.LJLJJI = dimensionPixelSize;
        this.LJLJJL = context.getResources().getDimensionPixelSize(R.dimen.afk);
        this.LJLJJLL = true;
        this.LJLJL = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.xo, R.attr.xp, R.attr.bvb});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.TTLiveBadgeView)");
        if (obtainStyledAttributes.hasValue(2)) {
            this.LJLJL = obtainStyledAttributes.getInt(2, 8);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.LJLJJL = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        }
        this.LJLJJI = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        obtainStyledAttributes.recycle();
        this.LJLJLJ = new Paint(1);
        this.LJLL = new LinkedHashMap();
        this.LJLLILLLL = new C31472CWu(C15380j0.LJIIZILJ(), 7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        r3 = r13.LJLLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        if (r3 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        if (r4 >= r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        r1 = ((X.AbstractC31462CWk) com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r4)).LIZIZ().LIZIZ(r13.LJLJLJ) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        if (r4 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        r1 = r1 + r13.LJLJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        r2 = r1;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
    
        r4 = r2;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            super.onMeasure(r14, r15)
            int r7 = android.view.View.MeasureSpec.getSize(r14)
            int r3 = android.view.View.MeasureSpec.getMode(r14)
            int r5 = android.view.View.MeasureSpec.getSize(r15)
            int r8 = android.view.View.MeasureSpec.getMode(r15)
            java.util.List<? extends X.CWk<? extends X.CWp>> r6 = r13.LJLJI
            r4 = 0
            if (r6 == 0) goto L89
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            r12 = 0
            if (r0 == 0) goto L89
            java.util.Iterator r11 = r6.iterator()
            r10 = 0
            r9 = 0
        L27:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r11.next()
            int r2 = r10 + 1
            if (r10 < 0) goto L4a
            X.CWk r0 = (X.AbstractC31462CWk) r0
            X.CWp r1 = r0.LIZIZ()
            android.graphics.Paint r0 = r13.LJLJLJ
            int r1 = r1.LIZIZ(r0)
            int r1 = r1 + r9
            if (r10 <= 0) goto L47
            int r0 = r13.LJLJJI
            int r1 = r1 + r0
        L47:
            r9 = r1
            r10 = r2
            goto L27
        L4a:
            X.C47261Igj.LJJJJJ()
            throw r12
        L4e:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 != r1) goto Lb2
        L52:
            if (r8 != r1) goto Laf
        L54:
            int r0 = r6.size()
            r13.LJLLI = r0
            java.util.Iterator r9 = r6.iterator()
            r8 = 0
            r3 = 0
        L60:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r9.next()
            int r2 = r8 + 1
            if (r8 < 0) goto Lbd
            X.CWk r0 = (X.AbstractC31462CWk) r0
            X.CWp r1 = r0.LIZIZ()
            android.graphics.Paint r0 = r13.LJLJLJ
            int r1 = r1.LIZIZ(r0)
            int r1 = r1 + r3
            if (r8 <= 0) goto L80
            int r0 = r13.LJLJJI
            int r1 = r1 + r0
        L80:
            r3 = r1
            if (r1 <= r7) goto Lad
            r13.LJLLI = r8
        L85:
            int r3 = r13.LJLLI
            if (r3 != 0) goto L8e
        L89:
            r5 = 0
        L8a:
            r13.setMeasuredDimension(r4, r5)
            return
        L8e:
            r2 = 0
        L8f:
            if (r4 >= r3) goto Lab
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r4)
            X.CWk r0 = (X.AbstractC31462CWk) r0
            X.CWp r1 = r0.LIZIZ()
            android.graphics.Paint r0 = r13.LJLJLJ
            int r1 = r1.LIZIZ(r0)
            int r1 = r1 + r2
            if (r4 <= 0) goto La7
            int r0 = r13.LJLJJI
            int r1 = r1 + r0
        La7:
            r2 = r1
            int r4 = r4 + 1
            goto L8f
        Lab:
            r4 = r2
            goto L8a
        Lad:
            r8 = r2
            goto L60
        Laf:
            int r5 = r13.LJLJJL
            goto L54
        Lb2:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r0) goto Lbb
            int r7 = java.lang.Math.min(r9, r7)
            goto L52
        Lbb:
            r7 = r9
            goto L52
        Lbd:
            X.C47261Igj.LJJJJJ()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31470CWs.onMeasure(int, int):void");
    }

    public static /* synthetic */ void LIZIZ(C31470CWs c31470CWs, boolean z, List list, User user, int i, AqS171S0100000_5 aqS171S0100000_5, int i2) {
        AqS171S0100000_5 aqS171S0100000_52 = aqS171S0100000_5;
        if ((i2 & 32) != 0) {
            aqS171S0100000_52 = null;
        }
        c31470CWs.LIZ(z, list, user, i, null, aqS171S0100000_52, false);
    }

    public final void LIZ(boolean z, List<BadgeStruct> list, User user, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super BadgeStruct, C76800UCe> interfaceC88472Yns, boolean z2) {
        if (list == null) {
            return;
        }
        this.LJLLILLLL.LJIIJ(z, getContext(), list, new AqS155S0100000_5(this, 46), interfaceC88472Yns, i, user, interfaceC65784Pro, z2);
    }
}
