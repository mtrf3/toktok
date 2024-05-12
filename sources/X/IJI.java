package X;

/* loaded from: classes9.dex */
public final class IJI extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final IJI LJLIL = new IJI();

    public IJI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        C5H3 c5h3 = IJH.LIZ;
        boolean z = true;
        if (((Number) c5h3.getValue()).floatValue() == 0.0f || IJN.LIZ().LIZLLL("song_shoot_rate") >= ((Number) c5h3.getValue()).floatValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
