package com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.privateaccount;

import X.AbstractC73672Svk;
import X.C72015SOd;
import X.E8L;
import X.SKL;
import android.content.Context;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class QuitBaAccountProcessor {
    public final Context LIZ;
    public final SKL LIZIZ;

    /* loaded from: classes13.dex */
    public interface CanQuitBusinessAccountApi {
        public static final C72015SOd LIZ = C72015SOd.LIZ;

        @E8L("/aweme/v1/ad/ba/quitcheck/")
        AbstractC73672Svk<BaseResponse> check();
    }

    public QuitBaAccountProcessor(Context context, SKL toastHolder) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LIZ = context;
        this.LIZIZ = toastHolder;
    }
}
