package X;

/* renamed from: X.5BI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5BI extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final C5BI LJLIL = new C5BI();

    public C5BI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        float f;
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_NEW_ROUND_CORNER_UX_OPTIMIZATION, Boolean.FALSE)).booleanValue()) {
            f = 4.0f;
        } else {
            f = 1.0f;
        }
        return Float.valueOf(C134845Qy.LIZ(f));
    }
}
