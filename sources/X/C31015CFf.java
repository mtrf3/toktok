package X;

/* renamed from: X.CFf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31015CFf extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final C31015CFf LJLIL = new C31015CFf();

    public C31015CFf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        float f = 0.0f;
        if (C31014CFe.LIZLLL.containsKey("effect_effect_id")) {
            float currentTimeMillis = (((float) (System.currentTimeMillis() - C31014CFe.LIZJ)) * 1.0f) / 1000;
            if (currentTimeMillis > 0.0f) {
                f = currentTimeMillis;
            }
        }
        return Float.valueOf(f);
    }
}
