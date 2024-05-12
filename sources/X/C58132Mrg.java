package X;

import android.content.Context;
import com.ss.android.ugc.aweme.crossplatform.HybridRegistryProvider;
import com.ss.android.ugc.aweme.web.jsbridge.IHybridRegistryProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.Mrg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58132Mrg {
    public static AbstractC38279F0p LIZ(Context context) {
        IHybridRegistryProvider hybridRegistryProvider;
        Object LIZ = C58096Mr6.LIZ(IHybridRegistryProvider.class, false);
        if (LIZ != null) {
            hybridRegistryProvider = (IHybridRegistryProvider) LIZ;
        } else {
            hybridRegistryProvider = new HybridRegistryProvider();
        }
        o.LJI(context);
        C38287F0x LIZ2 = hybridRegistryProvider.LIZ(context);
        o.LJIIIIZZ(LIZ2, "get().getService(IHybrid…MessageHandler(context!!)");
        return LIZ2;
    }
}
