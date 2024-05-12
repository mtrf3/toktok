package X;

/* renamed from: X.Ede, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36878Ede extends AbstractC65781Prl implements InterfaceC65784Pro<C36875Edb> {
    public static final C36878Ede LJLIL = new C36878Ede();

    public C36878Ede() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C36875Edb invoke() {
        C36879Edf c36879Edf = C36875Edb.LJFF;
        C36875Edb c36875Edb = C36875Edb.LJI;
        if (c36875Edb == null) {
            synchronized (c36879Edf) {
                c36875Edb = C36875Edb.LJI;
                if (c36875Edb == null) {
                    c36875Edb = new C36875Edb();
                    C36875Edb.LJI = c36875Edb;
                }
            }
        }
        return c36875Edb;
    }
}
