package X;

/* renamed from: X.IEl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46283IEl extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C46283IEl LJLIL = new C46283IEl();

    public C46283IEl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((Boolean) C46284IEm.LIZIZ.getValue()).booleanValue() || ((Boolean) C46284IEm.LIZJ.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
