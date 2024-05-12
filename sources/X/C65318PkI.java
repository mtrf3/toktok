package X;

import android.os.SystemClock;
import android.util.ArrayMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.PkI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65318PkI extends UF5 {
    public final java.util.Map<String, List<String>> LIZ = new ArrayMap();
    public long LIZIZ = -1;

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJ(String str) {
        ((ArrayMap) this.LIZ).remove(str);
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LIZIZ(String str, String str2, java.util.Map<String, String> map) {
        List list = (List) ((ArrayMap) this.LIZ).get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJIIIIZZ(W5O w5o, String str, boolean z) {
        List list = (List) ((ArrayMap) this.LIZ).remove(str);
        if (list != null && list.contains("NetworkFetchProducer") && this.LIZIZ > 0) {
            SystemClock.elapsedRealtime();
            this.LIZIZ = -1L;
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJFF(W5O w5o, String str, Throwable th, boolean z) {
        ((ArrayMap) this.LIZ).remove(str);
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJIIJ(W5O w5o, Object obj, String str, boolean z) {
        ((ArrayMap) this.LIZ).put(str, new LinkedList());
        if (this.LIZIZ == -1) {
            this.LIZIZ = SystemClock.elapsedRealtime();
        }
    }
}
