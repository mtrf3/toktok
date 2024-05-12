package com.ss.android.ugc.aweme.commercialize.preview.ui;

import X.C16880lQ;
import X.C770830u;
import X.FT5;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AdsPreviewFragment__BindExtra {
    public AdsPreviewFragment__BindExtra(AdsPreviewFragment fragment, Intent intent) {
        Object LLJJIII;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(intent, "intent");
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null && (LLJJIII = C16880lQ.LLJJIII(LLJJIJI, "url")) != null) {
            if (LLJJIII instanceof String) {
                fragment.LJLJJL = (String) LLJJIII;
            } else {
                StringBuilder LIZIZ = C770830u.LIZIZ("Expecting ", String.class, " but get ");
                throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII, LIZIZ, LIZIZ));
            }
        }
    }
}
