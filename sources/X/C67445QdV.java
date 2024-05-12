package X;

import android.content.Context;

/* renamed from: X.QdV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67445QdV implements InterfaceC67459Qdj<String> {
    public final C4G1<Context> LIZ;

    @Override // X.C4G1
    public final Object get() {
        String packageName = this.LIZ.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public C67445QdV(C4G1<Context> c4g1) {
        this.LIZ = c4g1;
    }
}
