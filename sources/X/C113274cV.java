package X;

import com.ss.android.common.util.NetworkUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.4cV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113274cV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String shareChannel) {
        o.LJIIIZ(shareChannel, "shareChannel");
        long serverTimeMills = NetworkUtils.getServerTimeMills();
        new F15();
        C72818Shy.LIZ(new C76052yf(serverTimeMills, F15.LIZLLL(C113554cx.LJJLIIIIJ(new OSZ("shareChannel", shareChannel))), "SendShareChannelEvent"));
    }
}
