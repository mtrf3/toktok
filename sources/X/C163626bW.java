package X;

import android.content.Context;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;

/* renamed from: X.6bW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163626bW {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(GAT.LJLIL);

    public static INetworkStateService LIZ() {
        return (INetworkStateService) LIZ.getValue();
    }

    public static boolean LIZJ() {
        return LIZIZ(C16880lQ.LLLLJI(C60903NvH.LJ));
    }

    public static final boolean LIZIZ(Context context) {
        if (context == null || !C48203Ivv.LJ(context) || LIZ().isFakeNetwork() || LIZ().isWeakNetwork()) {
            return false;
        }
        return true;
    }
}
