package X;

import Y.ALAdapterS0S0101001_2;
import Y.AUListenerS91S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.58E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C58E extends LinearLayout {
    public final C1299958h LJLIL;
    public final C59W LJLILLLLZI;
    public List<C1280750x> LJLJI;
    public final C58T LJLJJI;
    public final C58K LJLJJL;

    public final void LIZ() {
        this.LJLILLLLZI.setVisibility(8);
        this.LJLIL.setVisibility(8);
        Iterator<C1300058i> it = this.LJLIL.getDropList().iterator();
        while (it.hasNext()) {
            C5BZ LIZ = it.next().LIZ();
            LIZ.setScaleX(0.0f);
            LIZ.setScaleY(0.0f);
        }
        this.LJLILLLLZI.setAlpha(0.0f);
    }

    public final C59W getTrackLine() {
        return this.LJLILLLLZI;
    }

    public final void setDropGroupVisibility(int i) {
        float f;
        long j;
        this.LJLJJL.cancel();
        if (this.LJLIL.getVisibility() == i) {
            return;
        }
        float f2 = 1.0f;
        if (i != 4 && i != 8) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (i == 4 || i == 8) {
            f2 = 0.0f;
        }
        if (i != 4 && i != 8) {
            j = 150;
        } else {
            j = 0;
        }
        this.LJLJJL.setStartDelay(j);
        this.LJLJJL.removeAllUpdateListeners();
        C16880lQ.LJLJL(this.LJLJJL);
        Iterator<C1300058i> it = this.LJLIL.getDropList().iterator();
        while (it.hasNext()) {
            C5BZ LIZ = it.next().LIZ();
            LIZ.setPivotX(C5BZ.LJLJI / 2.0f);
            LIZ.setPivotY(C5BZ.LJLJJI);
        }
        this.LJLJJL.setFloatValues(f, f2);
        this.LJLJJL.addUpdateListener(new AUListenerS91S0100000_2(this, 28));
        this.LJLJJL.addListener(new ALAdapterS0S0101001_2(i, this, f2, 0));
        this.LJLJJL.start();
    }

    public final void setOnDropClick(InterfaceC88472Yns<? super String, C76800UCe> onClick) {
        o.LJIIIZ(onClick, "onClick");
        this.LJLIL.setOnItemClickCallback(onClick);
    }

    public final void setPipDropViewClickable(boolean z) {
        Iterator<C1300058i> it = this.LJLIL.getDropList().iterator();
        while (it.hasNext()) {
            it.next().LIZ().setClickable(z);
        }
    }

    public final void setPipTrackVisibility(int i) {
        float f;
        this.LJLILLLLZI.animate().cancel();
        if (this.LJLILLLLZI.getVisibility() == i) {
            return;
        }
        if (i != 4 && i != 8) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        C59W view = this.LJLILLLLZI;
        o.LJIIIZ(view, "view");
        C58J c58j = new C58J(view);
        c58j.LIZIZ.cancel();
        c58j.LJI = 150L;
        c58j.LJFF = f;
        c58j.LJII = 150L;
        C58T interpolator = this.LJLJJI;
        o.LJIIIZ(interpolator, "interpolator");
        c58j.LJIIIIZZ = interpolator;
        c58j.LJIIIZ = new ALAdapterS0S0101001_2(i, this, f, 1);
        c58j.LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = C61878OQg.INSTANCE;
        this.LJLJJI = new C58T();
        C58K c58k = new C58K();
        c58k.setInterpolator(new C58T());
        c58k.setDuration(545L);
        this.LJLJJL = c58k;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bze, this, true);
        View findViewById = findViewById(R.id.chn);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.drop_group)");
        this.LJLIL = (C1299958h) findViewById;
        View findViewById2 = findViewById(R.id.lj3);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.track_Line)");
        this.LJLILLLLZI = (C59W) findViewById2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int LIZIZ;
        float f;
        int i3;
        FrameLayout.LayoutParams layoutParams;
        Number valueOf;
        int i4;
        FrameLayout.LayoutParams layoutParams2;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            LIZIZ = View.MeasureSpec.getSize(i);
        } else {
            long j = 0;
            for (C1280750x c1280750x : this.LJLJI) {
                if (c1280750x.LIZJ == EnumC123864ta.VIDEO) {
                    Iterator<NLETrackSlot> it = c1280750x.LIZLLL.iterator();
                    while (it.hasNext()) {
                        j = Math.max(j, it.next().getEndTime() / 1000);
                    }
                }
            }
            LIZIZ = (int) ((C1300758p.LIZIZ() * ((float) j)) + C1300058i.LJIIJ);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            valueOf = Integer.valueOf(View.MeasureSpec.getSize(i2));
        } else {
            if (this.LJLIL.getVisibility() == 8) {
                float f2 = C59W.LJLJJLL;
                ViewGroup.LayoutParams layoutParams3 = this.LJLILLLLZI.getLayoutParams();
                if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                    i4 = layoutParams2.bottomMargin;
                } else {
                    i4 = 0;
                }
                f = f2 + i4;
            } else {
                f = C1300058i.LJIIJJI;
                float f3 = C59W.LJLJJLL;
                ViewGroup.LayoutParams layoutParams4 = this.LJLILLLLZI.getLayoutParams();
                if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams4) != null) {
                    i3 = layoutParams.bottomMargin;
                } else {
                    i3 = 0;
                }
                float f4 = i3 + f3;
                if (f < f4) {
                    f = f4;
                }
            }
            valueOf = Float.valueOf(f);
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, View.MeasureSpec.makeMeasureSpec(LIZIZ, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
        }
        setMeasuredDimension(LIZIZ, valueOf.intValue());
    }
}
