package X;

import java.util.Iterator;

/* renamed from: X.UWm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77328UWm implements UFL {
    public final Iterator<String> LIZ;

    @Override // X.UFL
    public final boolean hasNextKey() {
        return this.LIZ.hasNext();
    }

    @Override // X.UFL
    public final String nextKey() {
        return this.LIZ.next();
    }

    public C77328UWm(Iterator<String> it) {
        this.LIZ = it;
    }
}