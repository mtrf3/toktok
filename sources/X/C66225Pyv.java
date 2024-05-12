package X;

import com.bytedance.pumbaa.common.interfaces.IStore;
import kotlin.jvm.internal.o;

/* renamed from: X.Pyv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66225Pyv {
    public final IStore LIZ;

    public C66225Pyv(IStore iStore) {
        this.LIZ = iStore;
    }

    public final synchronized C66224Pyu LIZ(String source) {
        o.LJIIIZ(source, "source");
        return new C66224Pyu(this.LIZ.getRepo(source, 1));
    }
}
