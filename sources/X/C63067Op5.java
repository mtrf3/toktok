package X;

import android.app.Activity;
import android.text.TextUtils;

/* renamed from: X.Op5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63067Op5 {
    public static final C5H3<C63067Op5> LIZ = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C63068Op6.LJLIL);

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ(Activity activity) {
        InterfaceC118544l0 interfaceC118544l0;
        if (activity == 0 || (!TextUtils.equals(activity.getLocalClassName(), "com.ss.android.ugc.aweme.live.LiveBroadcastActivity") && ((!(activity instanceof InterfaceC118544l0) || (interfaceC118544l0 = (InterfaceC118544l0) activity) == null || !interfaceC118544l0.LJJIJL()) && !TextUtils.equals(activity.getLocalClassName(), "com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity")))) {
            return false;
        }
        return true;
    }
}
