package X;

import kotlin.jvm.internal.o;

/* renamed from: X.adT, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94219adT extends F9E {
    public final String LJLIL;
    public final EnumC93994aZq LJLILLLLZI;
    public final Double LJLJI;
    public final C94217adR LJLJJI;
    public final int LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, Integer.valueOf(this.LJLJJL)};
    }

    public C94219adT(String triggerName, EnumC93994aZq extraValueType, Double d, C94217adR c94217adR, int i) {
        o.LJIIIZ(triggerName, "triggerName");
        o.LJIIIZ(extraValueType, "extraValueType");
        this.LJLIL = triggerName;
        this.LJLILLLLZI = extraValueType;
        this.LJLJI = d;
        this.LJLJJI = c94217adR;
        this.LJLJJL = i;
    }
}
