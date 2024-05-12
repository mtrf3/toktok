package com.ss.android.ugc.aweme.lingo;

import X.C38943FQd;
import X.C61520OCm;
import X.O3U;
import com.ss.android.elearning.lingo.gecko.GeckoAPI;

/* loaded from: classes11.dex */
public final class GeckoService implements GeckoAPI {
    @Override // com.ss.android.elearning.lingo.gecko.GeckoAPI
    public final long LIZ() {
        Long LJIIJ = O3U.LJIIJ(C38943FQd.LIZ(), "tiktok_lingo_dictionary_panel");
        if (LJIIJ == null) {
            return -1L;
        }
        return LJIIJ.longValue();
    }

    @Override // com.ss.android.elearning.lingo.gecko.GeckoAPI
    public final C61520OCm LIZIZ() {
        return O3U.LJII(C38943FQd.LIZ());
    }
}
