package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ET5 {
    public static final Object LIZ(InterfaceC84497XEf interfaceC84497XEf, InterfaceC67352kd<? super String> interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        String LJJJJZI = EffectPlatform.LJJJJZI();
        o.LJIIIIZZ(LJJJJZI, "getAppId()");
        interfaceC84497XEf.LJJ(CastLongProtector.parseLong(LJJJJZI), new ET6(c84654XKg));
        return c84654XKg.LIZ();
    }
}
