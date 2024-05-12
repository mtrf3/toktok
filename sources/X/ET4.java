package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ET4 {
    public final InterfaceC84497XEf LIZ;
    public final int LIZIZ;
    public final List<String> LIZJ;

    public final void LIZ() {
        if (((ArrayList) this.LIZJ).size() >= this.LIZIZ) {
            return;
        }
        InterfaceC84497XEf interfaceC84497XEf = this.LIZ;
        String LJJJJZI = EffectPlatform.LJJJJZI();
        o.LJIIIIZZ(LJJJJZI, "getAppId()");
        interfaceC84497XEf.LJJ(CastLongProtector.parseLong(LJJJJZI), new ET7(this));
    }

    public ET4(InterfaceC84497XEf effectPlatform) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LIZ = effectPlatform;
        this.LIZIZ = 1;
        this.LIZJ = new ArrayList();
    }
}
