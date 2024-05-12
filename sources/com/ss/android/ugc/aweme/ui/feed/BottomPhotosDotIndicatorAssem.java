package com.ss.android.ugc.aweme.ui.feed;

import X.C218518hr;
import X.C78963Uyt;
import X.X1D;
import android.view.View;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BottomPhotosDotIndicatorAssem extends AbsPhotosDotIndicatorAssem {
    public BottomPhotosDotIndicatorAssem() {
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
        LIZ.append("BottomPhotosDotIndicatorAssem visible: ");
        LIZ.append(C78963Uyt.LJJIII(item));
        LIZ.append(", ");
        Aweme aweme = item.getAweme();
        C218518hr c218518hr = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        View Y3 = Y3();
        if (C78963Uyt.LJJIII(item)) {
            ViewParent parent = Y3.getParent();
            if (parent instanceof C218518hr) {
                c218518hr = (C218518hr) parent;
            }
            if (c218518hr != null) {
                c218518hr.setVisibility(0);
            }
            Y3.setVisibility(0);
            return;
        }
        ViewParent parent2 = Y3.getParent();
        if (parent2 instanceof C218518hr) {
            c218518hr = (C218518hr) parent2;
        }
        if (c218518hr != null) {
            c218518hr.setVisibility(8);
        }
        Y3.setVisibility(8);
    }
}
