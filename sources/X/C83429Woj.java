package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Woj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83429Woj<T> {
    public final T LIZ;
    public final C35729E0n LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final EnumC45236HpA LJFF;
    public final List<C83430Wok> LJI;
    public final C45265Hpd LJII;

    public C83429Woj() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C83429Woj(Object obj, C35729E0n c35729E0n, String str, boolean z, String str2, EnumC45236HpA result, List list, C45265Hpd c45265Hpd, int i) {
        c35729E0n = (i & 2) != 0 ? null : c35729E0n;
        str = (i & 4) != 0 ? null : str;
        z = (i & 8) != 0 ? false : z;
        str2 = (i & 16) != 0 ? null : str2;
        list = (i & 64) != 0 ? new ArrayList() : list;
        c45265Hpd = (i & 128) != 0 ? null : c45265Hpd;
        o.LJIIIZ(result, "result");
        this.LIZ = obj;
        this.LIZIZ = c35729E0n;
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = str2;
        this.LJFF = result;
        this.LJI = list;
        this.LJII = c45265Hpd;
    }
}
