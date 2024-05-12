package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EVw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36544EVw extends AbstractC65781Prl implements InterfaceC88472Yns<Class<?>, Boolean> {
    public static final C36544EVw LJLIL = new C36544EVw();

    public C36544EVw() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Class<?> cls) {
        Class<?> clazz = cls;
        o.LJIIIZ(clazz, "clazz");
        Class<? extends Object>[] clsArr = C36543EVv.LIZ;
        boolean z = false;
        int i = 0;
        while (true) {
            if (clsArr[i].isAssignableFrom(clazz)) {
                z = true;
                break;
            }
            i++;
            if (i >= 11) {
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
