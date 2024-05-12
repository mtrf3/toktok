package com.ss.android.ugc.aweme.main;

import X.C38839FMd;
import X.InterfaceC55373LoH;
import android.app.Activity;
import com.ss.android.ugc.aweme.performanceopt.api.ActivityResourceOptApi;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ActivityResourceOptApiImpl implements ActivityResourceOptApi {
    @Override // com.ss.android.ugc.aweme.performanceopt.api.ActivityResourceOptApi
    public final InterfaceC55373LoH LIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return new C38839FMd(activity);
    }
}
