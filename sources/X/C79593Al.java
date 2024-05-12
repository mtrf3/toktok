package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Al, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79593Al extends F9E {
    public final List<C116144h8> LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL)};
    }

    public C79593Al(boolean z, int i, int i2, int i3, List imUserPowerItemList) {
        o.LJIIIZ(imUserPowerItemList, "imUserPowerItemList");
        this.LJLIL = imUserPowerItemList;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = z;
    }
}
