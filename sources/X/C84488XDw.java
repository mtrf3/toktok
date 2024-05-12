package X;

import android.content.Context;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.knadapt.DataPreProcess;
import kotlin.jvm.internal.o;

/* renamed from: X.XDw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84488XDw {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C52464KiS.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C84489XDx.LJLIL);

    public static final InterfaceC84498XEg LIZ(Context context, InterfaceC88472Yns<? super EffectPlatformBuilder, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        if (C43941HMj.LIZIZ() && interfaceC88472Yns == null) {
            return (InterfaceC84498XEg) LIZIZ.getValue();
        }
        IEffectPlatformFactory LIZ2 = EffectPlatformFactory.LIZ();
        EffectPlatformBuilder effectPlatformBuilder = new EffectPlatformBuilder();
        effectPlatformBuilder.setContext(context);
        DataPreProcess.enable = ((Boolean) LIZ.getValue()).booleanValue();
        DataPreProcess.enableOptimize = C52510KjC.LIZ();
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(effectPlatformBuilder);
        }
        return LIZ2.create(effectPlatformBuilder);
    }
}
