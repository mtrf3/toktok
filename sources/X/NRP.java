package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NRP extends AbstractC65781Prl implements InterfaceC88472Yns<NRR, Aweme> {
    public static final NRP LJLIL = new NRP();

    public NRP() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Aweme invoke(NRR nrr) {
        NRR inject = nrr;
        o.LJIIIZ(inject, "$this$inject");
        return inject.getAweme();
    }
}
