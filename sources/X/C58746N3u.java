package X;

import java.util.Random;

/* renamed from: X.N3u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58746N3u extends N3C {
    @Override // X.N3C
    public final boolean LIZJ(N3H n3h) {
        int LIZ = LIZ();
        if (LIZ < 0) {
            return true;
        }
        if (LIZ <= 0 && new Random().nextInt(10000) >= this.LIZ) {
            return true;
        }
        return false;
    }

    public C58746N3u(int i, java.util.Map map, java.util.Map map2, java.util.Set set) {
        super(i, map, map2, set);
    }
}
