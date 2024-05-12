package X;

/* renamed from: X.Dsr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35273Dsr extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35273Dsr LJLIL = new C35273Dsr();

    public C35273Dsr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("olduser_message_statistics_switch", false));
    }
}
