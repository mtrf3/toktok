package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Of6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62448Of6 extends ASB {
    public static final /* synthetic */ int LJLJJLL = 0;
    public final boolean LJLJJI;
    public final C62435Oet LJLJJL;

    @Override // X.ASG
    public final void LIZ(View v) {
        int i;
        ActivityC45651qj mo49getActivity;
        o.LJIIIZ(v, "v");
        boolean z = !this.LJLJJI;
        Fragment fragment = this.LJLJJL.LJLJJLL;
        if (fragment != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
            i = System.identityHashCode(mo49getActivity);
        } else {
            i = 0;
        }
        C62623Ohv c62623Ohv = C62623Ohv.LIZIZ;
        C62435Oet c62435Oet = this.LJLJJL;
        c62623Ohv.LIZLLL(c62435Oet.LJLIL, z, i, c62435Oet.LJLILLLLZI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62448Of6(boolean z, C62435Oet actionsManager, AS3 as3) {
        super(actionsManager, as3);
        o.LJIIIZ(actionsManager, "actionsManager");
        this.LJLJJI = z;
        this.LJLJJL = actionsManager;
        C62623Ohv.LIZIZ.LJIILIIL(actionsManager.LJLIL, actionsManager.LJLILLLLZI, z);
    }
}
