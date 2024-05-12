package X;

import java.util.Comparator;

/* renamed from: X.Q1p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66333Q1p<T> implements Comparator<InterfaceC66332Q1o> {
    public static final C66333Q1p LJLIL = new C66333Q1p();

    @Override // java.util.Comparator
    public final int compare(InterfaceC66332Q1o interfaceC66332Q1o, InterfaceC66332Q1o interfaceC66332Q1o2) {
        int i;
        InterfaceC66332Q1o interfaceC66332Q1o3 = interfaceC66332Q1o;
        InterfaceC66332Q1o interfaceC66332Q1o4 = interfaceC66332Q1o2;
        int i2 = 0;
        if (interfaceC66332Q1o3 != null) {
            i = interfaceC66332Q1o3.priority();
        } else {
            i = 0;
        }
        if (interfaceC66332Q1o4 != null) {
            i2 = interfaceC66332Q1o4.priority();
        }
        return i - i2;
    }
}
