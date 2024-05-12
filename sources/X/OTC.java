package X;

/* loaded from: classes11.dex */
public final class OTC extends AbstractC65781Prl implements InterfaceC88472Yns<Byte, CharSequence> {
    public static final OTC INSTANCE = new OTC();

    public OTC() {
        super(1);
    }

    public final CharSequence invoke(byte b) {
        return Q8U.LIZIZ(new Object[]{Byte.valueOf(b)}, 1, "%02x", "java.lang.String.format(this, *args)");
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
        return invoke(b.byteValue());
    }
}
