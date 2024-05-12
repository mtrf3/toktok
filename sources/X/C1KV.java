package X;

import com.google.android.play.core.assetpacks.p1;
import com.google.android.play.core.assetpacks.y;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.1KV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1KV implements InterfaceC153055zZ {
    public final Object LJLIL;

    @Override // X.InterfaceC153055zZ
    public final /* bridge */ /* synthetic */ Object a() {
        return new p1((y) ((InterfaceC153055zZ) this.LJLIL).a());
    }

    public C1KV(int i) {
        if (i != 1) {
            this.LJLIL = new ConcurrentHashMap();
            return;
        }
        C68878R1m c68878R1m = new C68878R1m();
        this.LJLIL = c68878R1m;
        c68878R1m.LJI = System.currentTimeMillis();
    }

    public final void LIZ(String key) {
        o.LJIIIZ(key, "key");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Interceptor: remove: ");
        LIZ.append(key);
        C0NB.LIZ(X1D.LIZIZ(LIZ));
        ((ConcurrentHashMap) this.LJLIL).remove(key);
    }

    public /* synthetic */ C1KV(InterfaceC153055zZ interfaceC153055zZ) {
        this.LJLIL = interfaceC153055zZ;
    }
}
