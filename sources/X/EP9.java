package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class EP9 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final EP9 LJLIL = new EP9();

    public EP9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(TimeUnit.SECONDS.toMillis(2L));
    }
}
