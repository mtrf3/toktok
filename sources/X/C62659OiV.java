package X;

import java.lang.reflect.Field;

/* renamed from: X.OiV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62659OiV extends AbstractC65781Prl implements InterfaceC65784Pro<Field> {
    public static final C62659OiV LJLIL = new C62659OiV();

    public C62659OiV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Field invoke() {
        Class cls = (Class) C62657OiT.LIZ.getValue();
        if (cls != null) {
            Field declaredField = cls.getDeclaredField("mParams");
            declaredField.setAccessible(true);
            return declaredField;
        }
        return null;
    }
}
