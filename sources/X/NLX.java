package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NLX implements F23 {
    public final NVO LJLIL;

    @Override // X.F23
    public final List<Class<? extends InterfaceC37666EqM>> LJ() {
        return null;
    }

    @Override // X.F23
    public final AbstractC60800Ntc LIZLLL() {
        return this.LJLIL;
    }

    public NLX(NVO nvo) {
        this.LJLIL = nvo;
    }

    @Override // X.F23
    public final List<InterfaceC38186Eyk> LIZ(F3T f3t) {
        InterfaceC1803976d LIZLLL = CommercializeAdServiceImpl.LJ().LIZLLL(17);
        o.LJII(LIZLLL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ad.feed.IFeedAdDepend");
        ((NLW) LIZLLL).LJJIFFI().getClass();
        return new C40474FuY().createBridges(f3t);
    }

    @Override // X.F23
    public final InterfaceC60819Ntv LIZIZ(AdSparkHybridContext adSparkHybridContext, Context context, String str, Bundle bundle) {
        if (this.LJLIL == null) {
            return null;
        }
        return new C59801NdV(adSparkHybridContext, str, bundle, this, context);
    }
}
