package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabState;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MJK extends AbstractC65781Prl implements InterfaceC88471Ynr<TrendsTabState, Bundle, TrendsTabState> {
    public static final MJK INSTANCE = new MJK();

    public MJK() {
        super(2);
    }

    public final TrendsTabState invoke(TrendsTabState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ TrendsTabState invoke(TrendsTabState trendsTabState, Bundle bundle) {
        TrendsTabState trendsTabState2 = trendsTabState;
        invoke(trendsTabState2, bundle);
        return trendsTabState2;
    }
}
