package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Jii, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49932Jii {
    public final List<C49935Jil> LIZ;

    public final synchronized List<C49935Jil> LIZ() {
        return Collections.unmodifiableList(this.LIZ);
    }

    public C49932Jii() {
        this.LIZ = new ArrayList();
    }

    public C49932Jii(List<C49935Jil> list) {
        this.LIZ = list;
    }
}
