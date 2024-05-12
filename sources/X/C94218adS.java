package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.adS, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94218adS extends F9E {
    public final List<C94217adR> LJLIL;
    public final String LJLILLLLZI;
    public final EnumC93988aZk LJLJI;
    public final Double LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, Boolean.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ)};
    }

    public C94218adS(List<C94217adR> list, String actionName, EnumC93988aZk extraValueType, Double d, boolean z, boolean z2, int i, int i2) {
        o.LJIIIZ(actionName, "actionName");
        o.LJIIIZ(extraValueType, "extraValueType");
        this.LJLIL = list;
        this.LJLILLLLZI = actionName;
        this.LJLJI = extraValueType;
        this.LJLJJI = d;
        this.LJLJJL = z;
        this.LJLJJLL = z2;
        this.LJLJL = i;
        this.LJLJLJ = i2;
    }
}
