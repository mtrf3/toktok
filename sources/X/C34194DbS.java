package X;

/* renamed from: X.DbS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34194DbS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34194DbS LJLIL = new C34194DbS();

    public C34194DbS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C34195DbT.LIZJ() & 64) == 64) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
