package com.ss.android.ugc.aweme.favorites.business.collection;

import X.C16880lQ;
import X.C36867EdT;
import X.C770830u;
import X.FT5;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CollectionContentFragment__BindExtra {
    public static final int $stable = 0;

    public CollectionContentFragment__BindExtra(CollectionContentFragment fragment, Intent intent) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(intent, "intent");
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null) {
            Object LLJJIII = C16880lQ.LLJJIII(LLJJIJI, "collection_id");
            if (LLJJIII != null) {
                if (LLJJIII instanceof String) {
                    fragment.LJLJJI = (String) LLJJIII;
                } else {
                    StringBuilder LIZIZ = C770830u.LIZIZ("Expecting ", String.class, " but get ");
                    throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII, LIZIZ, LIZIZ));
                }
            }
            Object LLJJIII2 = C16880lQ.LLJJIII(LLJJIJI, "enter_from");
            if (LLJJIII2 != null) {
                if (LLJJIII2 instanceof String) {
                    fragment.LJLJJL = (String) LLJJIII2;
                } else {
                    StringBuilder LIZIZ2 = C770830u.LIZIZ("Expecting ", String.class, " but get ");
                    throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII2, LIZIZ2, LIZIZ2));
                }
            }
            Object LLJJIII3 = C16880lQ.LLJJIII(LLJJIJI, "showAddVideosCount");
            if (LLJJIII3 != null) {
                if (!(LLJJIII3 instanceof Integer)) {
                    if (LLJJIII3 instanceof String) {
                        LLJJIII3 = C36867EdT.LIZ(Integer.class, (String) LLJJIII3);
                    } else {
                        StringBuilder LIZIZ3 = C770830u.LIZIZ("Expecting ", Integer.class, " but get ");
                        throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII3, LIZIZ3, LIZIZ3));
                    }
                }
                fragment.LJLJJLL = (Integer) LLJJIII3;
            }
            Object LLJJIII4 = C16880lQ.LLJJIII(LLJJIJI, "collectionCount");
            if (LLJJIII4 != null) {
                if (!(LLJJIII4 instanceof Integer)) {
                    if (LLJJIII4 instanceof String) {
                        LLJJIII4 = C36867EdT.LIZ(Integer.class, (String) LLJJIII4);
                    } else {
                        StringBuilder LIZIZ4 = C770830u.LIZIZ("Expecting ", Integer.class, " but get ");
                        throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII4, LIZIZ4, LIZIZ4));
                    }
                }
                fragment.LJLJL = ((Number) LLJJIII4).intValue();
            }
        }
    }
}
