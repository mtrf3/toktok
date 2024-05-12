package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* renamed from: X.Qi0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67724Qi0 extends AbstractC67715Qhr<C67822Qja, C67725Qi1> {
    @Override // X.AbstractC67715Qhr
    public final C67822Qja LIZIZ(Context context, Looper looper, C67736QiC c67736QiC, C67725Qi1 c67725Qi1, InterfaceC67706Qhi interfaceC67706Qhi, InterfaceC67707Qhj interfaceC67707Qhj) {
        Integer num = c67736QiC.LJIIIIZZ;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c67736QiC.LIZ);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new C67822Qja(context, looper, c67736QiC, bundle, interfaceC67706Qhi, interfaceC67707Qhj);
    }
}
