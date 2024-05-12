package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.IVt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46733IVt {
    public static final /* synthetic */ int LIZ = 0;

    public static C46788IXw LIZ() {
        ArrayList arrayList = new ArrayList();
        if (C1DG.LIZ().getConfig().getCommonConfig().getVideoUrlHooks() != null) {
            List<IY4> videoUrlHooks = C1DG.LIZ().getConfig().getCommonConfig().getVideoUrlHooks();
            o.LJIIIIZZ(videoUrlHooks, "get().config.commonConfig.videoUrlHooks");
            arrayList.addAll(videoUrlHooks);
        }
        if (C1DG.LIZ().getConfig().getPreloaderExperiment().PreloadTypeExperiment() == EnumC47317Ihd.VideoCache) {
            arrayList.add(new IY8(C47242IgQ.LIZ()));
        } else {
            arrayList.add(new IY7(C47242IgQ.LIZ(), C1DG.LIZ().getConfig().getCommonConfig().getVideoUrlHookHook()));
        }
        C1DG.LIZ().getConfig().getCommonConfig().getDefaultCDNTimeoutTime();
        return new C46788IXw(arrayList);
    }
}
