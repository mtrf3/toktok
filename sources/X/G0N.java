package X;

import X.InterfaceC35879E6h;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class G0N<T, U extends InterfaceC35879E6h> implements InterfaceC40768FzI<T, U> {
    @Override // X.InterfaceC40768FzI
    public long LIZ(ComponentDependencies componentDependencies) {
        return 0L;
    }

    @Override // X.InterfaceC40768FzI
    public boolean LIZJ() {
        return !(this instanceof G0K);
    }

    @Override // X.InterfaceC40768FzI
    public InterfaceC88472Yns<U, C76800UCe> LJI() {
        return G1R.LJLIL;
    }

    @Override // X.InterfaceC40768FzI
    public final void LJFF(ComponentDependencies dependencies) {
        o.LJIIIZ(dependencies, "dependencies");
        String str = dependencies.gv0().abExposeVid;
        if (str != null) {
            FH5.LIZIZ().getClass();
            FH5.LIZ(str);
            G2H g2h = G2H.HYBRID_AB_EXPOSE;
            C188727au c188727au = new C188727au();
            c188727au.LJ(System.currentTimeMillis() - C56662Kg.LIZ().LJIIJ, "duration_since_launch");
            c188727au.LJIIIZ("vid", str);
            java.util.Map<String, String> map = c188727au.LIZ;
            o.LJIIIIZZ(map, "newBuilder()\n           …               .builder()");
            C36222EJm.LIZIZ(g2h, map);
        }
    }
}
