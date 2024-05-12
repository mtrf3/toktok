package com.ss.android.ugc.aweme.qrcode;

import X.C16880lQ;
import X.C36867EdT;
import X.C62162OaU;
import X.C770830u;
import X.FT5;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class QRCodeFragment__BindExtra {
    public QRCodeFragment__BindExtra(QRCodeFragment fragment, Intent intent) {
        Object LLJJIII;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(intent, "intent");
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null && (LLJJIII = C16880lQ.LLJJIII(LLJJIJI, "extra_params")) != null) {
            if (!(LLJJIII instanceof C62162OaU)) {
                if (LLJJIII instanceof String) {
                    LLJJIII = C36867EdT.LIZ(C62162OaU.class, (String) LLJJIII);
                } else {
                    StringBuilder LIZIZ = C770830u.LIZIZ("Expecting ", C62162OaU.class, " but get ");
                    throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII, LIZIZ, LIZIZ));
                }
            }
            fragment.LJLJJI = (C62162OaU) LLJJIII;
        }
    }
}
