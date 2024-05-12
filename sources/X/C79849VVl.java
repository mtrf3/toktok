package X;

import com.lynx.react.bridge.ReadableMapKeySetIterator;
import kotlin.jvm.internal.o;

/* renamed from: X.VVl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79849VVl implements UFL {
    public final ReadableMapKeySetIterator LIZ;

    @Override // X.UFL
    public final boolean hasNextKey() {
        return this.LIZ.hasNextKey();
    }

    @Override // X.UFL
    public final String nextKey() {
        String nextKey = this.LIZ.nextKey();
        o.LJFF(nextKey, "origin.nextKey()");
        return nextKey;
    }

    public C79849VVl(ReadableMapKeySetIterator readableMapKeySetIterator) {
        this.LIZ = readableMapKeySetIterator;
    }
}
