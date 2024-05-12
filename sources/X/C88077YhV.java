package X;

/* renamed from: X.YhV, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88077YhV extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88077YhV LJLIL = new C88077YhV();

    public C88077YhV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88074YhS.LIZ() & 256) == 256) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
