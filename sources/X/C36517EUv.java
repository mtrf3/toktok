package X;

import android.view.View;
import java.lang.reflect.Field;

/* renamed from: X.EUv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36517EUv extends AbstractC65781Prl implements InterfaceC65784Pro<Field> {
    public static final C36517EUv INSTANCE = new C36517EUv();

    public C36517EUv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Field invoke() {
        Field field = null;
        try {
            field = C36512EUq.LIZLLL(View.class, "mViewFlags");
            if (field != null) {
                field.setAccessible(true);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return field;
    }
}
