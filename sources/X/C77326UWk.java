package X;

import java.util.Iterator;

/* renamed from: X.UWk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77326UWk<T> implements InterfaceC1039145z<C2058786d<? extends T>> {
    public final InterfaceC1039145z<T> LIZ;

    @Override // X.InterfaceC1039145z
    public final Iterator<C2058786d<T>> iterator() {
        return new C77325UWj(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C77326UWk(InterfaceC1039145z<? extends T> interfaceC1039145z) {
        this.LIZ = interfaceC1039145z;
    }
}
