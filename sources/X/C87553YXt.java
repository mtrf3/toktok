package X;

/* renamed from: X.YXt, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87553YXt extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87553YXt LJLIL = new C87553YXt();

    public C87553YXt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if ((C87549YXp.LIZ() & 1) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
