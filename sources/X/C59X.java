package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.59X, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C59X extends View {
    public long LJLIL;
    public List<C1280750x> LJLILLLLZI;
    public final Paint LJLJI;
    public final Rect LJLJJI;
    public final Rect LJLJJL;
    public final Rect LJLJJLL;
    public AbstractC1304059w LJLJL;
    public int LJLJLJ;
    public final int LJLJLLL;
    public final Path LJLL;
    public final C62822Ol8 LJLLI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59X(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59X(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final boolean LIZ() {
        return ((Boolean) this.LJLLI.getValue()).booleanValue();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        C5A0 c5a0;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        o.LJII(parent, "null cannot be cast to non-null type com.ss.ugc.android.editor.track.widget.EditScroller");
        AbstractC1304059w abstractC1304059w = (AbstractC1304059w) parent;
        this.LJLJL = abstractC1304059w;
        abstractC1304059w.setScrollChangeListener(new AqS184S0100000_2(this, 54));
        ViewParent parent2 = getParent();
        if (!(parent2 instanceof C5A0) || (c5a0 = (C5A0) parent2) == null) {
            return;
        }
        c5a0.setOnScaleUpdate$editor_trackpanel_release(new AqS152S0100000_2(this, 634));
    }

    public final long getDurationTime() {
        return this.LJLIL;
    }

    public final Paint getPaint() {
        return this.LJLJI;
    }

    public final List<C1280750x> getTrackList() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        float LIZIZ;
        float LIZIZ2;
        int i3;
        super.onDraw(canvas);
        if (canvas == null || this.LJLILLLLZI.isEmpty()) {
            return;
        }
        int i4 = this.LJLJLLL / 2;
        if (LIZ()) {
            int measuredWidth = getMeasuredWidth();
            AbstractC1304059w abstractC1304059w = this.LJLJL;
            if (abstractC1304059w != null) {
                i3 = abstractC1304059w.getScrollX();
            } else {
                i3 = 0;
            }
            i = measuredWidth + i3;
        } else {
            AbstractC1304059w abstractC1304059w2 = this.LJLJL;
            if (abstractC1304059w2 != null) {
                i = abstractC1304059w2.getScrollX();
            } else {
                i = 0;
            }
        }
        if (LIZ()) {
            i2 = i - ((int) (this.LJLJLLL * 1.5d));
        } else {
            i2 = (int) ((this.LJLJLLL * 1.5d) + i);
        }
        if (LIZ()) {
            this.LJLJJI.set(i2, 0, i, 1);
        } else {
            this.LJLJJI.set(i, 0, i2, 1);
        }
        this.LJLL.reset();
        List<C1280750x> list = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<C1280750x> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZLLL);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            for (NLETimeSpaceNode nLETimeSpaceNode : (List) it2.next()) {
                if (LIZ()) {
                    LIZIZ = getMeasuredWidth() - ((C1300758p.LIZIZ() * ((float) (nLETimeSpaceNode.getStartTime() / 1000))) + i4);
                } else {
                    LIZIZ = i4 + (C1300758p.LIZIZ() * ((float) (nLETimeSpaceNode.getStartTime() / 1000)));
                }
                if (LIZ()) {
                    LIZIZ2 = getMeasuredWidth() - ((C1300758p.LIZIZ() * ((float) (nLETimeSpaceNode.getEndTime() / 1000))) + i4);
                } else {
                    LIZIZ2 = (C1300758p.LIZIZ() * ((float) (nLETimeSpaceNode.getEndTime() / 1000))) + i4;
                }
                if (LIZ()) {
                    this.LJLJJL.set((int) LIZIZ2, 0, (int) LIZIZ, 1);
                } else {
                    this.LJLJJL.set((int) LIZIZ, 0, (int) LIZIZ2, 1);
                }
                if (this.LJLJJLL.setIntersect(this.LJLJJL, this.LJLJJI)) {
                    this.LJLL.moveTo(this.LJLJJLL.left, getMeasuredHeight() / 2);
                    this.LJLL.lineTo(this.LJLJJLL.right, getMeasuredHeight() / 2);
                }
            }
        }
        canvas.drawPath(this.LJLL, this.LJLJI);
        this.LJLL.reset();
    }

    public final void setColor(int i) {
        this.LJLJLJ = i;
        this.LJLJI.setColor(i);
    }

    public final void setDurationTime(long j) {
        this.LJLIL = j;
    }

    public final void setTrackList(List<C1280750x> value) {
        o.LJIIIZ(value, "value");
        this.LJLILLLLZI = value;
        requestLayout();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(((this.LJLJLLL / 2) * 2) + ((int) (C1300758p.LIZIZ() * ((float) this.LJLIL))), View.MeasureSpec.getSize(i2));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C59X(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            r0 = r9 & 2
            if (r0 == 0) goto L5
            r8 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r7, r0)
            r4 = 0
            r6.<init>(r7, r8, r4)
            X.OQg r0 = X.C61878OQg.INSTANCE
            r6.LJLILLLLZI = r0
            android.graphics.Paint r2 = new android.graphics.Paint
            r5 = 1
            r2.<init>(r5)
            r6.LJLJI = r2
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.LJLJJI = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.LJLJJL = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.LJLJJLL = r0
            java.lang.String r3 = "#4B5DC2"
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r3)
            r6.LJLJLJ = r0
            int r0 = X.C134845Qy.LIZJ(r7)
            r6.LJLJLLL = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r6.LJLL = r0
            kotlin.jvm.internal.AqS152S0100000_2 r1 = new kotlin.jvm.internal.AqS152S0100000_2
            r0 = 633(0x279, float:8.87E-43)
            r1.<init>(r7, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r6.LJLLI = r0
            int[] r1 = new int[r5]
            r0 = 2130969631(0x7f04041f, float:1.754795E38)
            r1[r4] = r0
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r8, r1)
            int r0 = com.bytedance.mt.protector.impl.color.ColorProtector.parseColor(r3)
            int r0 = r1.getColor(r4, r0)
            r6.LJLJLJ = r0
            r1.recycle()
            int r0 = r6.LJLJLJ
            r2.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r2.setStyle(r0)
            X.58G r0 = X.C1291054w.LJ()
            boolean r0 = r0.LJJJLL
            if (r0 == 0) goto L86
            r0 = 1073741824(0x40000000, float:2.0)
        L7d:
            int r0 = X.C134845Qy.LIZ(r0)
            float r0 = (float) r0
            r2.setStrokeWidth(r0)
            return
        L86:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59X.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
