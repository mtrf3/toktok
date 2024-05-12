package X;

import com.ss.android.ugc.aweme.ab.WebSocketInitExperiment;

/* renamed from: X.DqP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35121DqP extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C35121DqP LJLIL = new C35121DqP();

    public C35121DqP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        if (WebSocketInitExperiment.LIZ() == 0) {
            j = ((WebSocketInitExperiment.MetaData) WebSocketInitExperiment.LIZIZ.getValue()).initDelaySeconds;
        } else {
            j = 0;
        }
        return Long.valueOf(j);
    }
}
