package X;

import com.bytedance.android.livesdkapi.host.IHostUser;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Byw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30554Byw<V> {
    public final C48459J0d<HashMap<String, V>> LIZ;

    public final <V> V LIZ() {
        HashMap<String, V> LIZJ = this.LIZ.LIZJ();
        String valueOf = String.valueOf(((IHostUser) CN1.LIZ(IHostUser.class)).getCurUserId());
        if (LIZJ.containsKey(valueOf)) {
            return LIZJ.get(valueOf);
        }
        return null;
    }

    public C30554Byw(String str) {
        this.LIZ = new C48459J0d<>(str, new HashMap());
    }

    public final <V> V LIZIZ(String suffix) {
        o.LJIIIZ(suffix, "suffix");
        HashMap<String, V> LIZJ = this.LIZ.LIZJ();
        String valueOf = String.valueOf(((IHostUser) CN1.LIZ(IHostUser.class)).getCurUserId());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(valueOf);
        LIZ.append(suffix);
        if (LIZJ.containsKey(X1D.LIZIZ(LIZ))) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(valueOf);
            LIZ2.append(suffix);
            return LIZJ.get(X1D.LIZIZ(LIZ2));
        }
        return null;
    }

    public final void LIZJ(V v) {
        String valueOf = String.valueOf(((IHostUser) CN1.LIZ(IHostUser.class)).getCurUserId());
        HashMap<String, V> map = this.LIZ.LIZJ();
        o.LJIIIIZZ(map, "map");
        map.put(valueOf, v);
        this.LIZ.LIZ(map);
    }

    public final void LIZLLL(Object obj, String suffix) {
        o.LJIIIZ(suffix, "suffix");
        String valueOf = String.valueOf(((IHostUser) CN1.LIZ(IHostUser.class)).getCurUserId());
        HashMap<String, V> LIZJ = this.LIZ.LIZJ();
        HashMap<String, V> LIZJ2 = this.LIZ.LIZJ();
        o.LJIIIIZZ(LIZJ2, "pluginProperty.value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(valueOf);
        LIZ.append(suffix);
        LIZJ2.put(X1D.LIZIZ(LIZ), obj);
        this.LIZ.LIZ(LIZJ);
    }
}
