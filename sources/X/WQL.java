package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQL<T, R> implements InterfaceC48038ItG {
    public static final WQL<T, R> LJLIL = new WQL<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        Object[] resultList = (Object[]) obj;
        o.LJIIIZ(resultList, "resultList");
        int length = resultList.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                Object obj2 = resultList[i];
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                if (!((Boolean) obj2).booleanValue()) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
