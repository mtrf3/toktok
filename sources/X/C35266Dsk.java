package X;

/* renamed from: X.Dsk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35266Dsk extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35266Dsk LJLIL = new C35266Dsk();

    public C35266Dsk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(C35274Dss.LIZ.getBoolean("optimize_speedactivity", false));
    }
}
