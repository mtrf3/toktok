package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.provider.impl.GScope;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lm8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55240Lm8 extends C55238Lm6 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final C55242LmA LJLJJI;
    public final C62822Ol8 LJLJJL;

    static {
        TBV tbv = new TBV(C55240Lm8.class, "viewWeak", "getViewWeak()Landroid/view/View;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbv};
    }

    @Override // X.C55238Lm6, X.InterfaceC55235Lm3
    public final Object getHost() {
        return this.LJLJJI.LIZ(LJLJJLL[0]);
    }

    @Override // X.C55238Lm6, X.InterfaceC55235Lm3
    public final C55252LmK getTree() {
        return (C55252LmK) this.LJLJJL.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55240Lm8(View v, LifecycleOwner lifecycleOwner, String key, C55232Lm0 option) {
        super(key);
        InterfaceC55235Lm3 LIZLLL;
        o.LJIIIZ(v, "v");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(option, "option");
        C55242LmA c55242LmA = new C55242LmA(new AqS159S0100000_9(v, 39));
        this.LJLJJI = c55242LmA;
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 38));
        L9U.LIZIZ(new AqS156S0200000_9(lifecycleOwner, this, 6));
        if (o.LJ(getTree().LIZJ, GScope.LJLIL)) {
            if (C55243LmB.LIZ[option.LIZ.ordinal()] == 1) {
                InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = LJLJJLL;
                View view = (View) c55242LmA.LIZ(interfaceC74236TBoArr[0]);
                if (view != null) {
                    Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
                    if (LJIIIZ != null) {
                        LIZLLL = C55230Lly.LIZJ(LJIIIZ, null);
                    } else {
                        View view2 = (View) c55242LmA.LIZ(interfaceC74236TBoArr[0]);
                        if (view2 != null) {
                            ActivityC45651qj LIZ = L9U.LIZ(view2);
                            if (LIZ != null) {
                                LIZLLL = C55230Lly.LIZLLL(LIZ, null);
                            } else {
                                throw new RuntimeException("view is not attached to host");
                            }
                        } else {
                            throw new RuntimeException("view is already destroyed!");
                        }
                    }
                    if (LIZLLL != null) {
                        getTree().LIZ(LIZLLL, new C55232Lm0(null, 3));
                        return;
                    }
                    return;
                }
                throw new RuntimeException("view is already destroyed!");
            }
        }
    }
}
