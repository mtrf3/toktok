package X;

import Y.IDhS105S0100000_12;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TP4 extends AbstractC74512TMe<ProviderEffect, TPH, ProviderEffectModel> {
    public final InterfaceC65784Pro<InterfaceC84497XEf> LJ;
    public final String LJFF;
    public final String LJI;

    @Override // X.R30
    public final AbstractC73672Svk LJII(Object obj) {
        OSZ req = (OSZ) obj;
        o.LJIIIZ(req, "req");
        int intValue = ((Number) req.getFirst()).intValue();
        TPH tph = (TPH) req.getSecond();
        AbstractC73672Svk<R> LJJIIJZLJL = LJIIJ(intValue, tph).LJIJI(new IDhS105S0100000_12(tph, 25)).LJJIIJZLJL();
        o.LJIIIIZZ(LJJIIJZLJL, "fetchPage(count, request…\n        }.toObservable()");
        return LJJIIJZLJL;
    }

    @Override // X.AbstractC74512TMe
    public final boolean LJIIIIZZ(TPH tph, TPH tph2) {
        TPH a = tph;
        TPH b = tph2;
        o.LJIIIZ(a, "a");
        o.LJIIIZ(b, "b");
        if (a.LJLIL == b.LJLIL) {
            return true;
        }
        return false;
    }

    public C73579SuF LJIIJ(int i, TPH cursorData) {
        o.LJIIIZ(cursorData, "cursorData");
        return AbstractC73638SvC.LJI(new TP8(this, cursorData, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TP4(InterfaceC65784Pro<? extends InterfaceC84497XEf> effectPlatform, String providerName, String providerSource, TPH tph) {
        super(tph);
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(providerName, "providerName");
        o.LJIIIZ(providerSource, "providerSource");
        this.LJ = effectPlatform;
        this.LJFF = providerName;
        this.LJI = providerSource;
    }
}
