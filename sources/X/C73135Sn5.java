package X;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sn5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73135Sn5 extends AbstractC73133Sn3 {
    public final /* synthetic */ AqS162S0100000_12 LJLJJI;

    @Override // X.AbstractC73133Sn3
    public final void LIZ() {
        ((ListMiddleware) this.LJLJJI.l0).loadMore();
    }

    public C73135Sn5(AqS162S0100000_12 aqS162S0100000_12) {
        this.LJLJJI = aqS162S0100000_12;
    }

    @Override // X.AbstractC73133Sn3
    public final void LIZIZ(AqS99S0101000_12 aqS99S0101000_12) {
        ListMiddleware listMiddleware = (ListMiddleware) this.LJLJJI.l0;
        AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12(aqS99S0101000_12, 97);
        JediViewModel<S> jediViewModel = listMiddleware.LJLILLLLZI;
        if (jediViewModel != 0) {
            jediViewModel.Gv0(new AqS143S0200000_12(listMiddleware, aqS178S0100000_12, 21));
        } else {
            o.LJIJI("viewModel");
            throw null;
        }
    }
}
