package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gfd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42097Gfd<T> {
    public final EnumC42099Gff LIZ;
    public final T LIZIZ;
    public final List<InterfaceC42095Gfb> LIZJ;

    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DataNode ");
        LIZ.append(this.LIZ);
        LIZ.append(": data: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", extra: ");
        List<InterfaceC42095Gfb> list = this.LIZJ;
        if (list != null) {
            str = ORZ.LLD(list, null, null, null, C42098Gfe.LJLIL, 31);
        } else {
            str = null;
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C42097Gfd(EnumC42099Gff name, T t, List<? extends InterfaceC42095Gfb> list) {
        o.LJIIIZ(name, "name");
        this.LIZ = name;
        this.LIZIZ = t;
        this.LIZJ = list;
    }
}
