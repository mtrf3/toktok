package X;

/* renamed from: X.Yck, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87782Yck extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87782Yck LJLIL = new C87782Yck();

    public C87782Yck() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C87781Ycj.LIZ() & 1) == 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
