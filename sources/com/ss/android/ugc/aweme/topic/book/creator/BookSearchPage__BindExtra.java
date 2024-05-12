package com.ss.android.ugc.aweme.topic.book.creator;

import X.C16880lQ;
import X.C36867EdT;
import X.C770830u;
import X.FT5;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BookSearchPage__BindExtra {
    public BookSearchPage__BindExtra(BookSearchPage fragment, Intent intent) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(intent, "intent");
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null) {
            Object LLJJIII = C16880lQ.LLJJIII(LLJJIJI, "selected_book_ids");
            if (LLJJIII != null) {
                if (LLJJIII instanceof String) {
                    fragment.LJLILLLLZI = (String) LLJJIII;
                } else {
                    StringBuilder LIZIZ = C770830u.LIZIZ("Expecting ", String.class, " but get ");
                    throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII, LIZIZ, LIZIZ));
                }
            }
            Object LLJJIII2 = C16880lQ.LLJJIII(LLJJIJI, "selected_book_max_count");
            if (LLJJIII2 != null) {
                if (!(LLJJIII2 instanceof Integer)) {
                    if (LLJJIII2 instanceof String) {
                        LLJJIII2 = C36867EdT.LIZ(Integer.class, (String) LLJJIII2);
                    } else {
                        StringBuilder LIZIZ2 = C770830u.LIZIZ("Expecting ", Integer.class, " but get ");
                        throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII2, LIZIZ2, LIZIZ2));
                    }
                }
                fragment.LJLJI = ((Number) LLJJIII2).intValue();
            }
        }
    }
}
