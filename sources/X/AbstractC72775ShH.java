package X;

import Y.IDObjectS0S0101000;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.ShH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC72775ShH extends FrameLayout {
    public static final MLM LJLJLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public static final ValueAnimator LJLLI;
    public final C62822Ol8 LJLIL;
    public final java.util.Map<String, Object> LJLILLLLZI;
    public final java.util.Map<String, Object> LJLJI;
    public final C72776ShI LJLJJI;
    public final C72776ShI LJLJJL;
    public final C72776ShI LJLJJLL;
    public final C72776ShI LJLJL;
    public final C72776ShI LJLJLJ;

    static {
        TBV tbv = new TBV(AbstractC72775ShH.class, "radius", "getRadius()F", 0);
        C65352Pkq.LIZ.getClass();
        LJLL = new InterfaceC74236TBo[]{tbv, new TBV(AbstractC72775ShH.class, "placeholderColor", "getPlaceholderColor()I", 0), new TBV(AbstractC72775ShH.class, "pulsingColor", "getPulsingColor()I", 0), new TBV(AbstractC72775ShH.class, "isLoading", "isLoading()Z", 0), new TBV(AbstractC72775ShH.class, "animator", "getAnimator()Landroid/animation/ValueAnimator;", 0)};
        LJLJLLL = new MLM();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(1000L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setRepeatMode(2);
        LJLLI = valueAnimator;
    }

    public final boolean LIZJ() {
        return ((Boolean) this.LJLJL.LIZ(this, LJLL[3])).booleanValue();
    }

    public final ValueAnimator getAnimator() {
        return (ValueAnimator) this.LJLJLJ.LIZ(this, LJLL[4]);
    }

    public final int getPlaceholderColor() {
        return ((Number) this.LJLJJL.LIZ(this, LJLL[1])).intValue();
    }

    public final int getPulsingColor() {
        return ((Number) this.LJLJJLL.LIZ(this, LJLL[2])).intValue();
    }

    public final float getRadius() {
        return ((Number) this.LJLJJI.LIZ(this, LJLL[0])).floatValue();
    }

    public final C72780ShM getThemeConfig() {
        return (C72780ShM) this.LJLIL.getValue();
    }

    public final long getAnimationDuration() {
        return getAnimator().getDuration();
    }

    public final void setAnimationDuration(long j) {
        getAnimator().setDuration(j);
    }

    public final void setAnimator(ValueAnimator valueAnimator) {
        o.LJIIIZ(valueAnimator, "<set-?>");
        this.LJLJLJ.LIZIZ(this, LJLL[4], valueAnimator);
    }

    public final void setLoading(boolean z) {
        this.LJLJL.LIZIZ(this, LJLL[3], Boolean.valueOf(z));
    }

    public final void setPlaceholderColor(int i) {
        this.LJLJJL.LIZIZ(this, LJLL[1], Integer.valueOf(i));
    }

    public final void setPulsingColor(int i) {
        this.LJLJJLL.LIZIZ(this, LJLL[2], Integer.valueOf(i));
    }

    public final void setRadius(float f) {
        this.LJLJJI.LIZIZ(this, LJLL[0], Float.valueOf(f));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC72775ShH(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public final <T> T LIZIZ(String prop, InterfaceC65784Pro<? extends T> defaultValue) {
        T t;
        o.LJIIIZ(prop, "prop");
        o.LJIIIZ(defaultValue, "defaultValue");
        View view = this;
        while (view != null) {
            if ((view instanceof AbstractC72775ShH) && (t = (T) ((LinkedHashMap) ((AbstractC72775ShH) view).LJLILLLLZI).get(prop)) != null) {
                return t;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return defaultValue.invoke();
    }

    public final void LIZLLL(TBU tbu, InterfaceC88471Ynr interfaceC88471Ynr) {
        this.LJLJI.put(tbu.getName(), interfaceC88471Ynr);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIIZ(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (i == 0) {
            try {
                if (getVisibility() == 0) {
                    getAnimator().start();
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                }
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                return;
            }
        }
        getAnimator().cancel();
        C3C5.m7constructorimpl(C76800UCe.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC72775ShH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(context, 86));
        this.LJLILLLLZI = new LinkedHashMap();
        this.LJLJI = new LinkedHashMap();
        this.LJLJJI = new C72776ShI(new AqS162S0100000_12(this, 85));
        this.LJLJJL = new C72776ShI(new AqS162S0100000_12(this, 83));
        this.LJLJJLL = new C72776ShI(new AqS162S0100000_12(this, 84));
        this.LJLJL = new C72776ShI(new AqS162S0100000_12(this, 82));
        this.LJLJLJ = new C72776ShI(new AqS162S0100000_12(this, 81));
        TypedArray _init_$lambda$4 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bth, R.attr.btj, R.attr.btl, R.attr.btm}, i, 0);
        o.LJIIIIZZ(_init_$lambda$4, "_init_$lambda$4");
        if (_init_$lambda$4.hasValue(3)) {
            C1E4.LJI(_init_$lambda$4, 3);
            setRadius(_init_$lambda$4.getDimensionPixelSize(3, 0));
        }
        if (_init_$lambda$4.hasValue(1)) {
            C1E4.LJI(_init_$lambda$4, 1);
            setPlaceholderColor(_init_$lambda$4.getColor(1, 0));
        }
        if (_init_$lambda$4.hasValue(2)) {
            C1E4.LJI(_init_$lambda$4, 2);
            setPulsingColor(_init_$lambda$4.getColor(2, 0));
        }
        if (_init_$lambda$4.hasValue(0)) {
            C1E4.LJI(_init_$lambda$4, 0);
            setLoading(_init_$lambda$4.getBoolean(0, false));
        }
        _init_$lambda$4.recycle();
        LIZLLL(new TBU(this) { // from class: X.ShG
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Float.valueOf(((AbstractC72775ShH) this.receiver).getRadius());
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((AbstractC72775ShH) this.receiver).setRadius(((Number) obj).floatValue());
            }
        }, new AqS194S0100000_12(this, 25));
        LIZLLL(new TBU(this) { // from class: X.ShJ
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Integer.valueOf(((AbstractC72775ShH) this.receiver).getPlaceholderColor());
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((AbstractC72775ShH) this.receiver).setPlaceholderColor(((Number) obj).intValue());
            }
        }, new AqS194S0100000_12(this, 26));
        LIZLLL(new TBU(this) { // from class: X.ShK
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Integer.valueOf(((AbstractC72775ShH) this.receiver).getPulsingColor());
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((AbstractC72775ShH) this.receiver).setPulsingColor(((Number) obj).intValue());
            }
        }, new AqS194S0100000_12(this, 27));
        LIZLLL(new TBU(this) { // from class: X.ShL
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Boolean.valueOf(((AbstractC72775ShH) this.receiver).LIZJ());
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj) {
                ((AbstractC72775ShH) this.receiver).setLoading(((Boolean) obj).booleanValue());
            }
        }, new AqS194S0100000_12(this, 28));
    }

    public static void LIZ(View view, String str, Object obj, Object obj2) {
        InterfaceC88471Ynr interfaceC88471Ynr;
        if (view == null) {
            return;
        }
        boolean z = true;
        if (view instanceof AbstractC72775ShH) {
            AbstractC72775ShH abstractC72775ShH = (AbstractC72775ShH) view;
            if (((LinkedHashMap) abstractC72775ShH.LJLILLLLZI).get(str) == null) {
                Object obj3 = ((LinkedHashMap) abstractC72775ShH.LJLJI).get(str);
                if (C65777Prh.LJFF(2, obj3) && (interfaceC88471Ynr = (InterfaceC88471Ynr) obj3) != null) {
                    interfaceC88471Ynr.invoke(obj, obj2);
                }
            } else {
                z = false;
            }
        }
        if ((view instanceof ViewGroup) && z) {
            Iterator<View> it = C78924UyG.LIZLLL((ViewGroup) view).iterator();
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                if (iDObjectS0S0101000.hasNext()) {
                    LIZ((View) iDObjectS0S0101000.next(), str, obj, obj2);
                } else {
                    return;
                }
            }
        }
    }
}
