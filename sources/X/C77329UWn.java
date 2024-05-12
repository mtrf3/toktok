package X;

import java.util.Iterator;

/* renamed from: X.UWn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77329UWn implements UFL {
    public final Iterator<String> LIZ;

    @Override // X.UFL
    public final boolean hasNextKey() {
        return this.LIZ.hasNext();
    }

    @Override // X.UFL
    public final String nextKey() {
        return this.LIZ.next();
    }

    public C77329UWn(Iterator<String> it) {
        this.LIZ = it;
    }
}
