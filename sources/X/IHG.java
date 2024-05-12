package X;

/* loaded from: classes9.dex */
public final class IHG extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final IHG LJLIL = new IHG();

    public IHG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(!z);
    }
}
