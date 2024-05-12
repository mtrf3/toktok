package X;

/* renamed from: X.Bl8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29698Bl8 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C29698Bl8 LJLIL = new C29698Bl8();

    public C29698Bl8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j = 0;
        if (C29697Bl7.LJIIIIZZ != 0) {
            j = (System.currentTimeMillis() - C29697Bl7.LJIIIIZZ) / 1000;
        }
        return Long.valueOf(j);
    }
}
