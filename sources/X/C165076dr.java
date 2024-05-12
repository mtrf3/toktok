package X;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* renamed from: X.6dr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165076dr extends AbstractC65781Prl implements InterfaceC65784Pro<Field> {
    public static final C165076dr LJLIL = new C165076dr();

    public C165076dr() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.reflect.Field] */
    @Override // X.InterfaceC65784Pro
    public final Field invoke() {
        C3C4 c3c4;
        C3C4 c3c42;
        try {
            ?? declaredField = RecyclerView.ViewHolder.class.getDeclaredField("itemView");
            if (declaredField == 0) {
                c3c42 = null;
            } else {
                declaredField.setAccessible(true);
                c3c42 = declaredField;
            }
            C3C5.m7constructorimpl(c3c42);
            c3c4 = c3c42;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            c3c4 = LIZ;
        }
        if (C3C5.m12isFailureimpl(c3c4)) {
            return null;
        }
        return c3c4;
    }
}
