package X;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.8oS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222608oS {
    public static final /* synthetic */ int LIZ = 0;

    public static InterfaceC222698ob LIZ(ViewGroup playerView, InterfaceC47667InH listener, C222588oQ params) {
        o.LJIIIZ(playerView, "playerView");
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(params, "params");
        if (params.LJIILJJIL == 20) {
            Context context = playerView.getContext();
            o.LJIIIIZZ(context, "playerView.context");
            return new C222658oX(context);
        }
        return new C47245IgT(playerView, listener, params);
    }
}
