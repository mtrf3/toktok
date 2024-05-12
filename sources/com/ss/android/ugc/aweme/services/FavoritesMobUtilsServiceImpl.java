package com.ss.android.ugc.aweme.services;

import X.C178456zR;
import X.C188727au;
import X.C227768wm;
import X.FMX;
import X.MF9;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FavoritesMobUtilsServiceImpl implements MF9 {
    public static final int $stable = 0;

    @Override // X.MF9
    public boolean isDataSetChangedOnStart() {
        return C178456zR.LIZIZ;
    }

    @Override // X.MF9
    public void onVideoItemActionShow(Aweme data) {
        o.LJIIIZ(data, "data");
        String LIZIZ = C178456zR.LIZIZ(1);
        C188727au LIZ = C178456zR.LIZ("video", "collection_video");
        LIZ.LJIIIZ("author_id", C227768wm.LIZJ(data));
        LIZ.LJIIIZ("group_id", C227768wm.LIZIZ(data));
        LIZ.LJIIIZ("music_id", C227768wm.LJIIJJI(data));
        FMX.LJIIL(LIZIZ, LIZ.LIZ);
    }

    @Override // X.MF9
    public void setDataSetChangedOnStart(boolean z) {
        C178456zR.LIZIZ = z;
    }
}
