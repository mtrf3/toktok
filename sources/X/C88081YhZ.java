package X;

/* renamed from: X.YhZ, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88081YhZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C88081YhZ LJLIL = new C88081YhZ();

    public C88081YhZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if ((C88074YhS.LIZ() & 1024) == 1024) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
