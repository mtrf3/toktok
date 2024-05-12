package X;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Mzg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58628Mzg extends AbstractC58625Mzd {
    public static final HashMap<String, Integer> LJIIIIZZ = new HashMap<>();
    public final C58601MzF<?>[] LJII;

    @Override // X.C58620MzY
    public final C58601MzF<?>[] LJIILL() {
        return this.LJII;
    }

    public C58628Mzg(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LJII = new C58601MzF[0];
    }

    @Override // X.AbstractC58624Mzc
    public final void LJJI(String eventName, java.util.Map<String, ? extends Object> map) {
        o.LJIIIZ(eventName, "eventName");
        super.LJJI(eventName, map);
    }
}
