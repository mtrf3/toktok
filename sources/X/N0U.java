package X;

import com.ss.android.ugc.aweme.commerce.IBEInfo;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N0U extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final N0U LJLIL = new N0U();

    public N0U() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        int intValue;
        M95 m952 = m95;
        o.LJIIIZ(m952, "$this$int");
        HashMap<String, Integer> hashMap = C58628Mzg.LJIIIIZZ;
        Object LIZ = m952.LIZ(IBEInfo.class);
        if (LIZ != null) {
            Integer num = hashMap.get(((IBEInfo) LIZ).getLynxSchema());
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            return Integer.valueOf(intValue);
        }
        throw new C58623Mzb(IBEInfo.class);
    }
}
