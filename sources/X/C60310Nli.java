package X;

import X.InterfaceC60363NmZ;
import android.util.LruCache;

/* renamed from: X.Nli, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60310Nli<K, V extends InterfaceC60363NmZ> extends LruCache<K, V> {
    public C60310Nli(int i) {
        super(i);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        InterfaceC60363NmZ interfaceC60363NmZ = (InterfaceC60363NmZ) obj2;
        if (interfaceC60363NmZ != null) {
            return interfaceC60363NmZ.getSize();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        InterfaceC37788EsK interfaceC37788EsK = (InterfaceC37788EsK) obj2;
        super.entryRemoved(z, obj, interfaceC37788EsK, obj3);
        if (interfaceC37788EsK != null) {
            interfaceC37788EsK.release();
        }
    }
}
