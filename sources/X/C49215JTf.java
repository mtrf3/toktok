package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JTf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49215JTf extends C0A6 implements JQY<Float> {
    public final MutableLiveData<Float> LJLIL;
    public final MutableLiveData<Float> LJLILLLLZI;
    public boolean LJLJI;
    public View LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public RecyclerView LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    @Override // X.JQY
    public final Float LJIIIZ() {
        Object[] objArr = new Object[1];
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EndTriggerArea = ");
        float f = this.LJLJJL;
        Float value = this.LJLILLLLZI.getValue();
        if (value != null) {
            LIZ.append(value.floatValue() + f);
            objArr[0] = X1D.LIZIZ(LIZ);
            C49133JQb.LIZ("fzc-TriggerLine", objArr);
            float f2 = this.LJLJJL;
            Float value2 = this.LJLILLLLZI.getValue();
            if (value2 != null) {
                return Float.valueOf(value2.floatValue() + f2);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.JQY
    public final Float LJIIJJI() {
        Object[] objArr = new Object[1];
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StartTrigger = ");
        float f = this.LJLJJL;
        Float value = this.LJLIL.getValue();
        if (value != null) {
            LIZ.append(value.floatValue() + f);
            objArr[0] = X1D.LIZIZ(LIZ);
            C49133JQb.LIZ("fzc-TriggerLine", objArr);
            float f2 = this.LJLJJL;
            Float value2 = this.LJLIL.getValue();
            if (value2 != null) {
                return Float.valueOf(value2.floatValue() + f2);
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.JQY
    public final void LIZ() {
        RecyclerView recyclerView = this.LJLJL;
        if (recyclerView != null) {
            recyclerView.LJJLL(this);
            RecyclerView recyclerView2 = this.LJLJL;
            if (recyclerView2 != null) {
                recyclerView2.LJIIJJI(this);
                return;
            } else {
                o.LJIJI("list");
                throw null;
            }
        }
        o.LJIJI("list");
        throw null;
    }

    public final void LJIILLIIL() {
        this.LJLIL.setValue(Float.valueOf(((Number) this.LJLJLLL.getValue()).floatValue()));
        this.LJLILLLLZI.setValue(Float.valueOf(((Number) this.LJLJLJ.getValue()).floatValue()));
    }

    public C49215JTf() {
        Float valueOf = Float.valueOf(0.0f);
        this.LJLIL = new MutableLiveData<>(valueOf);
        this.LJLILLLLZI = new MutableLiveData<>(valueOf);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 522));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 519));
    }

    @Override // X.JQY
    public final boolean LJII() {
        return this.LJLJI;
    }

    @Override // X.JQY
    public final void LJ(View mHostContainer) {
        o.LJIIIZ(mHostContainer, "mHostContainer");
        Object parent = mHostContainer.getParent().getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        this.LJLJJI = view;
        View findViewById = view.findViewById(R.id.fuc);
        o.LJIIIIZZ(findViewById, "rvContainer.findViewById(R.id.list_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.LJLJL = recyclerView;
        recyclerView.LJJLL(this);
        RecyclerView recyclerView2 = this.LJLJL;
        if (recyclerView2 != null) {
            recyclerView2.LJIIJJI(this);
            AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8(this, 521);
            View view2 = this.LJLJJI;
            if (view2 != null) {
                if (view2.getHeight() <= 0) {
                    View view3 = this.LJLJJI;
                    if (view3 != null) {
                        JVD.LIZIZ(view3, new AqS158S0100000_8(aqS158S0100000_8, 520));
                        return;
                    } else {
                        o.LJIJI("rvContainer");
                        throw null;
                    }
                }
                aqS158S0100000_8.invoke();
                return;
            }
            o.LJIJI("rvContainer");
            throw null;
        }
        o.LJIJI("list");
        throw null;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0 && C78855Ux9.LJII(recyclerView)) {
            LJIILLIIL();
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        int i3;
        o.LJIIIZ(recyclerView, "recyclerView");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("scroll Y:");
        LIZ.append(i2);
        X1D.LIZIZ(LIZ);
        if (i2 == 0) {
            return;
        }
        if (i2 > 0) {
            LJIILLIIL();
            i3 = 1;
        } else {
            this.LJLIL.setValue(Float.valueOf(((Number) this.LJLJLJ.getValue()).floatValue()));
            this.LJLILLLLZI.setValue(Float.valueOf(((Number) this.LJLJLJ.getValue()).floatValue() * 2));
            i3 = -1;
        }
        if (i3 != this.LJLJJLL) {
            int[] iArr = new int[2];
            View view = this.LJLJJI;
            if (view != null) {
                view.getLocationOnScreen(iArr);
                this.LJLJJL = iArr[1];
            } else {
                o.LJIJI("rvContainer");
                throw null;
            }
        }
        this.LJLJJLL = i3;
    }
}
