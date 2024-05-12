package X;

/* renamed from: X.Ycs, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87790Ycs extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87790Ycs LJLIL = new C87790Ycs();

    public C87790Ycs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C87787Ycp.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
