package X;

import java.util.Arrays;
import kotlin.jvm.internal.AqS32S0100100_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MIg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56574MIg extends AbstractC58625Mzd {
    public final C58601MzF<?>[] LJII;

    @Override // X.C58620MzY
    public final C58601MzF<?>[] LJIILL() {
        return this.LJII;
    }

    public C56574MIg(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LJII = new C58601MzF[0];
    }

    public static final void LJJII(EnumC56571MId type, long j) {
        o.LJIIIZ(type, "type");
        C56574MIg c56574MIg = new C56574MIg(new Object[0]);
        MIZ.LIZ.getClass();
        c56574MIg.LJIILJJIL(MIZ.LIZLLL, new AqS32S0100100_9(type, j, 2));
    }

    @Override // X.AbstractC58624Mzc
    public final void LJJI(String eventName, java.util.Map<String, ? extends Object> map) {
        o.LJIIIZ(eventName, "eventName");
        super.LJJI(eventName, map);
    }
}
