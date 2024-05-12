package com.ss.android.ugc.aweme.ui.util;

import X.C185927Rk;
import com.ss.android.ugc.aweme.detail.prefab.videos.CollisionAwareReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PhotoModeIconAssem extends CollisionAwareReusedUISlotAssem<PhotoModeIconAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c1o;
    }

    public PhotoModeIconAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C185927Rk c185927Rk) {
        C185927Rk item = c185927Rk;
        o.LJIIIZ(item, "item");
        if (item.getAweme().isPhotoMode()) {
            Y3().setVisibility(0);
        } else {
            Y3().setVisibility(8);
        }
    }
}
