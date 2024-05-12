package X;

import Y.IDhS105S0100000_12;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TP5 extends AbstractC74512TMe<Effect, TPF, CategoryEffectModel> {
    public final InterfaceC65784Pro<InterfaceC84497XEf> LJ;
    public final String LJFF;
    public final boolean LJI;

    @Override // X.R30
    public final AbstractC73672Svk LJII(Object obj) {
        C73579SuF LJI;
        OSZ req = (OSZ) obj;
        o.LJIIIZ(req, "req");
        int intValue = ((Number) req.getFirst()).intValue();
        TPF tpf = (TPF) req.getSecond();
        if (tpf.LJLJJL.length() == 0 && tpf.LJLIL == 0) {
            LJI = AbstractC73638SvC.LJI(new TPB(this, intValue));
        } else {
            LJI = AbstractC73638SvC.LJI(new TP6(this, tpf, intValue));
        }
        AbstractC73672Svk<R> LJJIIJZLJL = LJI.LJIJI(new IDhS105S0100000_12(tpf, 24)).LJJIIJZLJL();
        o.LJIIIIZZ(LJJIIJZLJL, "fetchPage(count, request…\n        }.toObservable()");
        return LJJIIJZLJL;
    }

    @Override // X.AbstractC74512TMe
    public final boolean LJIIIIZZ(TPF tpf, TPF tpf2) {
        TPF a = tpf;
        TPF b = tpf2;
        o.LJIIIZ(a, "a");
        o.LJIIIZ(b, "b");
        if (a.LJLIL == b.LJLIL) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TP5(InterfaceC65784Pro<? extends InterfaceC84497XEf> effectPlatform, String panel, TPF tpf, boolean z) {
        super(tpf);
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(panel, "panel");
        this.LJ = effectPlatform;
        this.LJFF = panel;
        this.LJI = z;
    }
}
