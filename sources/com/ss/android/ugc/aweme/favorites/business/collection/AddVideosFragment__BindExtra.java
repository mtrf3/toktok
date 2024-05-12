package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C16880lQ;
import X.C770830u;
import X.FT5;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddVideosFragment__BindExtra {
    public static final int $stable = 0;

    public AddVideosFragment__BindExtra(AddVideosFragment fragment, Intent intent) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(intent, "intent");
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null) {
            Object LLJJIII = C16880lQ.LLJJIII(LLJJIJI, "collectionId");
            if (LLJJIII != null) {
                if (LLJJIII instanceof String) {
                    fragment.LJLJJI = (String) LLJJIII;
                } else {
                    StringBuilder LIZIZ = C770830u.LIZIZ("Expecting ", String.class, " but get ");
                    throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII, LIZIZ, LIZIZ));
                }
            }
            Object LLJJIII2 = C16880lQ.LLJJIII(LLJJIJI, "collectionName");
            if (LLJJIII2 != null) {
                if (LLJJIII2 instanceof String) {
                    fragment.LJLJJL = (String) LLJJIII2;
                } else {
                    StringBuilder LIZIZ2 = C770830u.LIZIZ("Expecting ", String.class, " but get ");
                    throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII2, LIZIZ2, LIZIZ2));
                }
            }
            Object LLJJIII3 = C16880lQ.LLJJIII(LLJJIJI, "enterMethod");
            if (LLJJIII3 != null) {
                if (LLJJIII3 instanceof String) {
                    fragment.LJLJJLL = (String) LLJJIII3;
                } else {
                    StringBuilder LIZIZ3 = C770830u.LIZIZ("Expecting ", String.class, " but get ");
                    throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII3, LIZIZ3, LIZIZ3));
                }
            }
        }
    }
}
