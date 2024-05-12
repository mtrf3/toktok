package com.ss.android.ugc.aweme.music.highlight;

import X.C16880lQ;
import X.C770830u;
import X.FT5;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class HighlightSelectFragment__BindExtra {
    public HighlightSelectFragment__BindExtra(HighlightSelectFragment fragment, Intent intent) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(intent, "intent");
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI != null) {
            Object LLJJIII = C16880lQ.LLJJIII(LLJJIJI, "user_id");
            if (LLJJIII != null) {
                if (LLJJIII instanceof String) {
                    fragment.LJLILLLLZI = (String) LLJJIII;
                } else {
                    StringBuilder LIZIZ = C770830u.LIZIZ("Expecting ", String.class, " but get ");
                    throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII, LIZIZ, LIZIZ));
                }
            }
            Object LLJJIII2 = C16880lQ.LLJJIII(LLJJIJI, "sec_user_id");
            if (LLJJIII2 != null) {
                if (LLJJIII2 instanceof String) {
                    fragment.LJLJI = (String) LLJJIII2;
                } else {
                    StringBuilder LIZIZ2 = C770830u.LIZIZ("Expecting ", String.class, " but get ");
                    throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII2, LIZIZ2, LIZIZ2));
                }
            }
            Object LLJJIII3 = C16880lQ.LLJJIII(LLJJIJI, "highlighted_music_id");
            if (LLJJIII3 != null) {
                if (LLJJIII3 instanceof String) {
                    fragment.LJLJJI = (String) LLJJIII3;
                } else {
                    StringBuilder LIZIZ3 = C770830u.LIZIZ("Expecting ", String.class, " but get ");
                    throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII3, LIZIZ3, LIZIZ3));
                }
            }
            Object LLJJIII4 = C16880lQ.LLJJIII(LLJJIJI, "shoot_from");
            if (LLJJIII4 != null) {
                if (LLJJIII4 instanceof String) {
                    fragment.LJLJJL = (String) LLJJIII4;
                } else {
                    StringBuilder LIZIZ4 = C770830u.LIZIZ("Expecting ", String.class, " but get ");
                    throw new IllegalArgumentException(FT5.LIZIZ(LLJJIII4, LIZIZ4, LIZIZ4));
                }
            }
        }
    }
}
