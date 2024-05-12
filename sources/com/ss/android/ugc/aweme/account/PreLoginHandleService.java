package com.ss.android.ugc.aweme.account;

import X.C55871LwJ;
import X.C58096Mr6;
import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.IPreLoginHandleService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PreLoginHandleService implements IPreLoginHandleService {
    public static IPreLoginHandleService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IPreLoginHandleService.class, false);
        if (LIZ != null) {
            return (IPreLoginHandleService) LIZ;
        }
        if (C58096Mr6.LJJLL == null) {
            synchronized (IPreLoginHandleService.class) {
                if (C58096Mr6.LJJLL == null) {
                    C58096Mr6.LJJLL = new PreLoginHandleService();
                }
            }
        }
        return C58096Mr6.LJJLL;
    }

    @Override // com.ss.android.ugc.aweme.IPreLoginHandleService
    public final Intent LIZ(Activity activity, Intent intent, String str) {
        o.LJIIIZ(activity, "activity");
        return C55871LwJ.LIZ(activity, intent, str);
    }
}
