package X;

import android.content.Context;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.share.screenshot.strategy.ScreenshotShareStrategy;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Od8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62326Od8 {
    public final Object LIZ;

    public /* synthetic */ C62326Od8(InterfaceC62225ObV channel) {
        o.LJIIIZ(channel, "channel");
        this.LIZ = channel;
    }

    public final EnumC62261Oc5 LIZ(Context context, SharePackage sharePackage, InterfaceC62264Oc8 interfaceC62264Oc8) {
        ArrayList arrayList;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        List LJIJ = C62814Ol0.LJIJ(GScope.LJLIL, ScreenshotShareStrategy.class);
        if (LJIJ != null) {
            arrayList = new ArrayList();
            Iterator it = ((ArrayList) LJIJ).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (o.LJ(((ScreenshotShareStrategy) next).LJFF(), C65352Pkq.LIZ(sharePackage.getClass()))) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = new ArrayList();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ScreenshotShareStrategy screenshotShareStrategy = (ScreenshotShareStrategy) it2.next();
            if (screenshotShareStrategy.LIZ((InterfaceC62225ObV) this.LIZ, sharePackage) && screenshotShareStrategy.LJ((InterfaceC62225ObV) this.LIZ, context, sharePackage, interfaceC62264Oc8)) {
                return screenshotShareStrategy.LJI();
            }
        }
        return EnumC62261Oc5.ILLEGAL;
    }
}
