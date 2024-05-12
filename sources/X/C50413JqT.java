package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.JqT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50413JqT implements InterfaceC50422Jqc {
    @Override // X.InterfaceC50422Jqc
    public final InterfaceC51679KPz LIZ(M89 param, AbstractC51036K1g<?, ?> abstractC51036K1g, JediViewModel<?> jediViewModel) {
        o.LJIIIZ(param, "param");
        if (abstractC51036K1g instanceof AbstractC49845JhJ) {
            SearchAdMainService.LJIIJJI().LJIIIIZZ().LJIJJLI();
            return new C49857JhV((AbstractC49845JhJ) abstractC51036K1g);
        }
        return new C49874Jhm(abstractC51036K1g);
    }
}
