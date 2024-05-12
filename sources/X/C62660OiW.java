package X;

import java.lang.reflect.Field;

/* renamed from: X.OiW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62660OiW extends AbstractC65781Prl implements InterfaceC65784Pro<Field> {
    public static final C62660OiW LJLIL = new C62660OiW();

    public C62660OiW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Field invoke() {
        Class cls = (Class) C62657OiT.LIZ.getValue();
        if (cls != null) {
            Field declaredField = cls.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return declaredField;
        }
        return null;
    }
}
