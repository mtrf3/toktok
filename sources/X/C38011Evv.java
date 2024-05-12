package X;

import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import java.util.Iterator;

/* renamed from: X.Evv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38011Evv implements ReadableMapKeySetIterator {
    public final Iterator<String> LIZ;

    @Override // com.lynx.react.bridge.ReadableMapKeySetIterator
    public final boolean hasNextKey() {
        return this.LIZ.hasNext();
    }

    @Override // com.lynx.react.bridge.ReadableMapKeySetIterator
    public final String nextKey() {
        return this.LIZ.next();
    }

    public C38011Evv(JavaOnlyMap javaOnlyMap) {
        this.LIZ = javaOnlyMap.keySet().iterator();
    }
}
