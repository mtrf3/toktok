package X;

/* renamed from: X.Yam, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87660Yam extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87660Yam LJLIL = new C87660Yam();

    public C87660Yam() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C87656Yai.LIZ() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
