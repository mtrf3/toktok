package X;

/* renamed from: X.KgX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52345KgX extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C52345KgX LJLIL = new C52345KgX();

    public C52345KgX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "enable_record_now_link_relation", true) > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
