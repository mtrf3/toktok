package com.ss.android.ugc.aweme.compliance.privacy.sdk.ui;

import X.C16880lQ;
import X.C36867EdT;
import X.C770830u;
import X.FT5;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BasePrivacySettingFragmentSug__BindExtra {
    public BasePrivacySettingFragmentSug__BindExtra(BasePrivacySettingFragmentSug fragment, Intent intent) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(intent, "intent");
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null) {
            Object LLJJIII = C16880lQ.LLJJIII(LLJJIJI, "enter_from");
            if (LLJJIII != null) {
                if (LLJJIII instanceof String) {
                    String str = (String) LLJJIII;
                    o.LJIIIZ(str, "<set-?>");
                    fragment.LJLJLJ = str;
                } else {
                    StringBuilder LIZIZ = C770830u.LIZIZ("Expecting ", String.class, " but get ");
                    throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII, LIZIZ, LIZIZ));
                }
            }
            Object LLJJIII2 = C16880lQ.LLJJIII(LLJJIJI, "previous_page");
            if (LLJJIII2 != null) {
                if (LLJJIII2 instanceof String) {
                    String str2 = (String) LLJJIII2;
                    o.LJIIIZ(str2, "<set-?>");
                    fragment.LJLJLLL = str2;
                } else {
                    StringBuilder LIZIZ2 = C770830u.LIZIZ("Expecting ", String.class, " but get ");
                    throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII2, LIZIZ2, LIZIZ2));
                }
            }
            Object LLJJIII3 = C16880lQ.LLJJIII(LLJJIJI, "is_rec");
            if (LLJJIII3 != null) {
                if (!(LLJJIII3 instanceof Integer)) {
                    if (LLJJIII3 instanceof String) {
                        LLJJIII3 = C36867EdT.LIZ(Integer.class, (String) LLJJIII3);
                    } else {
                        StringBuilder LIZIZ3 = C770830u.LIZIZ("Expecting ", Integer.class, " but get ");
                        throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII3, LIZIZ3, LIZIZ3));
                    }
                }
                fragment.LJLL = ((Number) LLJJIII3).intValue();
            }
        }
    }
}
