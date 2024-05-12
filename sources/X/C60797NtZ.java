package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.NtZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60797NtZ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String biz) {
        o.LJIIJ(biz, "biz");
        if (biz.length() == 0) {
            return "default_biz";
        }
        return biz;
    }

    public static void LIZIZ(InterfaceC60831Nu7 iPreloadView, Context context) {
        o.LJIIJ(iPreloadView, "iPreloadView");
        o.LJIIJ(context, "context");
        Context hybridViewContext = iPreloadView.getHybridViewContext();
        if (hybridViewContext instanceof C40347FsV) {
            hybridViewContext = ((ContextWrapper) hybridViewContext).getBaseContext();
            o.LJFF(hybridViewContext, "preloadContext.baseContext");
        }
        if (hybridViewContext instanceof MutableContextWrapper) {
            ((MutableContextWrapper) hybridViewContext).setBaseContext(context);
        }
    }
}
