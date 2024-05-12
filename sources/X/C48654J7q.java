package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.J7q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48654J7q implements InterfaceC79968Va0 {
    public final String LIZ;
    public final List<V1L> LIZIZ;
    public int LIZJ;

    @Override // X.InterfaceC79968Va0
    public final List<V1L> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC79968Va0
    public final int getCurrentIndex() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC79968Va0
    public final String getId() {
        return this.LIZ;
    }

    @Override // X.InterfaceC79968Va0
    public final void LIZ(int i) {
        this.LIZJ = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C48654J7q(String str, List<? extends V1L> dataSet, int i) {
        o.LJIIJ(dataSet, "dataSet");
        this.LIZ = str;
        this.LIZIZ = dataSet;
        this.LIZJ = i;
    }
}
