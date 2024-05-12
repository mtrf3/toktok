package X;

/* renamed from: X.3O8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3O8 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C3O8 LJLIL = new C3O8();

    public C3O8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (System.currentTimeMillis() % 100 < Q7K.LIZIZ("im_conv_load_event_sample", 100)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
