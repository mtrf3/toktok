package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class F24 implements F23 {
    public final /* synthetic */ F23 LJLIL;

    @Override // X.F23
    public final AbstractC60800Ntc LIZLLL() {
        return this.LJLIL.LIZLLL();
    }

    @Override // X.F23
    public final List<Class<? extends InterfaceC37666EqM>> LJ() {
        List<Class<? extends InterfaceC37666EqM>> LJ = this.LJLIL.LJ();
        if (LJ == null) {
            LJ = C61878OQg.INSTANCE;
        }
        List<Class<? extends InterfaceC37666EqM>> LLJILJILJ = ORZ.LLJILJILJ(LJ);
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        arrayList.add(KJW.class);
        arrayList.add(C58926NAs.class);
        arrayList.add(N9E.class);
        arrayList.add(N9F.class);
        arrayList.add(N9C.class);
        arrayList.add(C58927NAt.class);
        return LLJILJILJ;
    }

    public F24(F23 f23) {
        this.LJLIL = f23;
    }

    @Override // X.F23
    public final List<InterfaceC38186Eyk> LIZ(F3T f3t) {
        return this.LJLIL.LIZ(f3t);
    }

    @Override // X.F23
    public final InterfaceC60819Ntv LIZIZ(AdSparkHybridContext adSparkHybridContext, Context context, String str, Bundle bundle) {
        return this.LJLIL.LIZIZ(adSparkHybridContext, context, str, bundle);
    }
}
