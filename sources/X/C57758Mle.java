package X;

import com.ss.android.ugc.aweme.relation.experiment.RecMoreExperiment;

/* renamed from: X.Mle, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57758Mle extends AbstractC65781Prl implements InterfaceC65784Pro<RecMoreExperiment.Value> {
    public static final C57758Mle LJLIL = new C57758Mle();

    public C57758Mle() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final RecMoreExperiment.Value invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        RecMoreExperiment.Value value = RecMoreExperiment.LIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "rec_more_client", 31744, RecMoreExperiment.Value.class, value);
        if (LJIJ != 0) {
            value = LJIJ;
        }
        C221018lt.LJFF("RecMore", "experiment value: " + value);
        return value;
    }
}
