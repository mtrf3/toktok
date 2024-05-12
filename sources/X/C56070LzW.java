package X;

import java.lang.ref.WeakReference;

/* renamed from: X.LzW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56070LzW extends C0A4 {
    public final /* synthetic */ C56095Lzv LIZ;

    public C56070LzW(C56095Lzv c56095Lzv) {
        this.LIZ = c56095Lzv;
    }

    @Override // X.C0A4
    public final boolean LIZ(int i, int i2) {
        InterfaceC56094Lzu interfaceC56094Lzu;
        boolean z;
        WeakReference<InterfaceC56094Lzu> weakReference = this.LIZ.LIZJ;
        if (weakReference != null && (interfaceC56094Lzu = weakReference.get()) != null) {
            if (i2 >= 0) {
                z = true;
            } else {
                z = false;
            }
            interfaceC56094Lzu.LIZ(z);
        }
        return false;
    }
}
