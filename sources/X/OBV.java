package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class OBV extends AbstractC65781Prl implements InterfaceC65784Pro<OBT> {
    public static final OBV LJLIL = new OBV();

    public OBV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final OBT invoke() {
        return new OBT(TimeUnit.SECONDS.toMillis(10L));
    }
}
