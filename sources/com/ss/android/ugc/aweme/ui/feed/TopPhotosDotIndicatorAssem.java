package com.ss.android.ugc.aweme.ui.feed;

import X.C78963Uyt;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopPhotosDotIndicatorAssem extends AbsPhotosDotIndicatorAssem {
    public TopPhotosDotIndicatorAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.AbsPhotosDotIndicatorAssem, com.ss.android.ugc.aweme.ui.feed.PhotoSlideIndicatorAssem, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        q4((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.AbsPhotosDotIndicatorAssem, com.ss.android.ugc.aweme.ui.feed.PhotoSlideIndicatorAssem
    public final void q4(VideoItemParams item) {
        String str;
        o.LJIIIZ(item, "item");
        super.q4(item);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TopPhotosDotIndicatorAssem visible: ");
        LIZ.append(!C78963Uyt.LJJIII(item));
        LIZ.append(", ");
        Aweme aweme = item.getAweme();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (C78963Uyt.LJJIII(item)) {
            Y3().setVisibility(8);
        } else {
            Y3().setVisibility(0);
        }
    }
}
