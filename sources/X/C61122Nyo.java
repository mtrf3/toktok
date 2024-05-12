package X;

/* renamed from: X.Nyo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61122Nyo extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C61122Nyo LJLIL = new C61122Nyo();

    public C61122Nyo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (0 == C25170yn.LIZ(new C09170Xp("feed"), "disney100").getLong("last_show", 0L)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
