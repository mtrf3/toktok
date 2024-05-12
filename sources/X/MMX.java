package X;

import X.AbstractC56676MMe;
import Y.AObserverS77S0100000_9;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import java.util.Iterator;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class MMX<T extends AbstractC56676MMe> extends RecyclerView.ViewHolder implements InterfaceC56635MKp, C3X3 {
    public final C62822Ol8 LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public T LJLJI;
    public MultiViewModel LJLJJI;
    public Fragment LJLJJL;
    public C96533qb LJLJJLL;
    public final Integer[] LJLJL;
    public final AObserverS77S0100000_9 LJLJLJ;

    public void T(C96533qb c96533qb) {
    }

    public void reportShowEvent() {
    }

    @Override // X.InterfaceC56635MKp
    public final boolean LJJIIZI() {
        if (this.LJLJI != null && N().isSkeleton) {
            return true;
        }
        return false;
    }

    public final ActivityC45651qj M() {
        Context context = this.itemView.getContext();
        if (context instanceof ActivityC45651qj) {
            return (ActivityC45651qj) context;
        }
        return null;
    }

    public final T N() {
        T t = this.LJLJI;
        if (t != null) {
            return t;
        }
        o.LJIJI("data");
        throw null;
    }

    public final MultiViewModel P() {
        MultiViewModel multiViewModel = this.LJLJJI;
        if (multiViewModel != null) {
            return multiViewModel;
        }
        o.LJIJI("multiViewModel");
        throw null;
    }

    public final void a0() {
        if (this.LJLJI != null) {
            if (!LJJIIZI() || N().type == 20) {
                MultiViewModel P = P();
                T N = N();
                AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(this, 895);
                Iterator it = ((java.util.Set) P.LLIILZL.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((AbstractC56676MMe) next).isSameItem(N)) {
                        if (next != null) {
                            return;
                        }
                    }
                }
                ((java.util.Set) P.LLIILZL.getValue()).add(N);
                aqS159S0100000_9.invoke();
            }
        }
    }

    public final Fragment getFragment() {
        Fragment fragment = this.LJLJJL;
        if (fragment != null) {
            return fragment;
        }
        o.LJIJI("fragment");
        throw null;
    }

    public Integer[] Q() {
        return this.LJLJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMX(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 894));
        this.LJLJL = new Integer[0];
        this.LJLJLJ = new AObserverS77S0100000_9(this, 85);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(Object obj) {
        AbstractC56676MMe abstractC56676MMe;
        if ((obj instanceof AbstractC56676MMe) && (abstractC56676MMe = (AbstractC56676MMe) obj) != null) {
            T t = (T) obj;
            this.LJLJI = t;
            if (t.isSkeleton) {
                X(abstractC56676MMe);
            } else {
                V(abstractC56676MMe);
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.itemView.setVisibility(8);
        C221018lt.LIZIZ("MultiBaseVH", "MultiBaseVH innerOnBind data type is not match!");
    }

    @Override // X.C3X3
    public final void LLL(C96533qb c96533qb) {
        if (o.LJ(this.LJLJJLL, c96533qb)) {
            return;
        }
        this.LJLJJLL = c96533qb;
        T(c96533qb);
    }

    public void U(boolean z) {
        P().LJLJJLL.observe(getFragment(), this.LJLJLJ);
        a0();
    }

    public void V(T data) {
        MMY mmy;
        o.LJIIIZ(data, "data");
        for (Integer num : Q()) {
            View findViewById = this.itemView.findViewById(num.intValue());
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
        View view = this.itemView;
        if ((view instanceof MMY) && (mmy = (MMY) view) != null) {
            mmy.LIZ();
        }
    }

    public void X(T t) {
        MMY mmy;
        for (Integer num : Q()) {
            View findViewById = this.itemView.findViewById(num.intValue());
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
        View view = this.itemView;
        if ((view instanceof MMY) && (mmy = (MMY) view) != null) {
            mmy.LIZIZ();
        }
    }

    public void Y(boolean z) {
        P().LJLJJLL.removeObserver(this.LJLJLJ);
    }
}
