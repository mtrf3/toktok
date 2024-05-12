package X;

import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N6T extends N6Q<ViewGroup> {
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, android.view.ViewGroup] */
    @Override // X.N6Q
    public final ViewGroup LIZ() {
        ViewGroup viewGroup = this.LJLIL.LIZ;
        if (viewGroup != null) {
            return viewGroup.findViewById(R.id.u0);
        }
        return null;
    }

    @Override // X.N6Q, X.JK9
    public final void LLLLZI() {
        if (N6U.LIZ[this.LJLIL.LIZJ.ordinal()] == 1) {
            C58809N6f c58809N6f = this.LJLIL;
            InterfaceC58801N5x interfaceC58801N5x = c58809N6f.LJI;
            ViewGroup viewGroup = null;
            if (!(interfaceC58801N5x instanceof N6L)) {
                interfaceC58801N5x = null;
            }
            N6L n6l = (N6L) interfaceC58801N5x;
            if (n6l != null) {
                ViewGroup viewGroup2 = c58809N6f.LIZ;
                if (viewGroup2 != null) {
                    viewGroup = (ViewGroup) viewGroup2.findViewById(R.id.u0);
                }
                n6l.LJIIIZ(viewGroup);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N6T(C58809N6f param) {
        super(param);
        o.LJIIIZ(param, "param");
    }

    @Override // X.N6Q
    public final boolean LIZJ(C58809N6f param) {
        o.LJIIIZ(param, "param");
        if (param.LIZJ == N6V.NORMAL_VIDEO_AD) {
            return true;
        }
        return false;
    }
}
