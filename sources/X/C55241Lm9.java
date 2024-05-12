package X;

import androidx.fragment.app.Fragment;
import com.bytedance.provider.impl.GScope;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Lm9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55241Lm9 extends C55238Lm6 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final C55242LmA LJLJJI;
    public final C62822Ol8 LJLJJL;

    static {
        TBV tbv = new TBV(C55241Lm9.class, "fragmentWeak", "getFragmentWeak()Landroidx/fragment/app/Fragment;", 0);
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

    public final void LIZ(C55241Lm9 c55241Lm9) {
        InterfaceC55235Lm3 LIZLLL;
        if (!o.LJ(c55241Lm9.getTree().LIZJ, GScope.LJLIL) || this == null) {
            return;
        }
        C55242LmA c55242LmA = c55241Lm9.LJLJJI;
        InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = LJLJJLL;
        Fragment fragment = (Fragment) c55242LmA.LIZ(interfaceC74236TBoArr[0]);
        if (fragment != null) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment != null) {
                LIZLLL = C55230Lly.LIZJ(parentFragment, null);
            } else {
                Fragment fragment2 = (Fragment) c55241Lm9.LJLJJI.LIZ(interfaceC74236TBoArr[0]);
                if (fragment2 != null) {
                    ActivityC45651qj mo49getActivity = fragment2.mo49getActivity();
                    if (mo49getActivity != null) {
                        LIZLLL = C55230Lly.LIZLLL(mo49getActivity, null);
                    } else {
                        throw new RuntimeException("fragment is not attached to host");
                    }
                } else {
                    throw new RuntimeException("fragment is already destroyed!");
                }
            }
            c55241Lm9.getTree().LIZ(LIZLLL, new C55232Lm0(null, 3));
            return;
        }
        throw new RuntimeException("fragment is already destroyed!");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55241Lm9(Fragment fg, String key) {
        super(key);
        o.LJIIIZ(fg, "fg");
        o.LJIIIZ(key, "key");
        C55242LmA c55242LmA = new C55242LmA(new AqS159S0100000_9(fg, 36));
        this.LJLJJI = c55242LmA;
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 37));
        Fragment fragment = (Fragment) c55242LmA.LIZ(LJLJJLL[0]);
        if (fragment != null) {
            if (fragment.getHost() != null) {
                L9U.LIZIZ(new AqS156S0200000_9(fg, this, 5));
                LIZ(this);
                return;
            } else {
                "this fragment is not attached to host!".toString();
                throw new IllegalStateException("this fragment is not attached to host!");
            }
        }
        throw new RuntimeException("fragment is already destroyed!");
    }
}
