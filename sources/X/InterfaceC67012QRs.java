package X;

import android.content.Context;

/* renamed from: X.QRs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC67012QRs {
    boolean checkThirdPushConfig(String str, Context context);

    boolean isPushAvailable(Context context, int i);

    void registerPush(Context context, int i);

    void setAlias(Context context, String str, int i);

    void trackPush(Context context, int i, Object obj);

    void unregisterPush(Context context, int i);
}
