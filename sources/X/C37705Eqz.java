package X;

import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMapKeySetIterator;
import java.util.Iterator;

/* renamed from: X.Eqz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37705Eqz implements ReadableMapKeySetIterator {
    public final Iterator<String> LIZ;

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMapKeySetIterator
    public final boolean hasNextKey() {
        return this.LIZ.hasNext();
    }

    @Override // com.bytedance.vmsdk.jsbridge.utils.ReadableMapKeySetIterator
    public final String nextKey() {
        return this.LIZ.next();
    }

    public C37705Eqz(JavaOnlyMap javaOnlyMap) {
        this.LIZ = javaOnlyMap.keySet().iterator();
    }
}
