package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import kotlin.jvm.internal.o;

/* renamed from: X.EWn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36561EWn extends F9E {
    public final DefaultType LJLIL;
    public final double LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;
    public final long LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Double.valueOf(this.LJLILLLLZI), this.LJLJI, Integer.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL), Long.valueOf(this.LJLJJLL)};
    }

    public C36561EWn(DefaultType type, double d, String stringValue, int i, boolean z, long j) {
        o.LJIIJ(type, "type");
        o.LJIIJ(stringValue, "stringValue");
        this.LJLIL = type;
        this.LJLILLLLZI = d;
        this.LJLJI = stringValue;
        this.LJLJJI = i;
        this.LJLJJL = z;
        this.LJLJJLL = j;
    }
}
