package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.C201007ui;
import X.C214298b3;
import X.C2NO;
import X.C44938HkM;
import X.C57082Lw;
import X.C57434MgQ;
import X.C62828OlE;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import Y.AObserverS71S0100000_3;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPageDownloadAssem extends UISlotAssem implements C2NO {
    public final C214298b3 LJLJLLL;
    public C62828OlE LJLL;
    public final ARunnableS39S0100000_3 LJLLI;

    @Override // X.C2NO
    public final void LJLIIIL() {
        H3(false);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c1q;
    }

    public FullPageDownloadAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PostModeFullPageViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 425), C201007ui.INSTANCE, null);
        this.LJLLI = new ARunnableS39S0100000_3(this, 79);
    }

    public final void H3(boolean z) {
        int i;
        C62828OlE c62828OlE;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C62828OlE c62828OlE2 = this.LJLL;
        if ((c62828OlE2 != null && c62828OlE2.getVisibility() == i) || (c62828OlE = this.LJLL) == null) {
            return;
        }
        c62828OlE.setVisibility(i);
    }

    @Override // X.C2NO
    public final void LJLIIL(boolean z) {
        C57082Lw.LIZ.LIZJ("photo_click_try").postValue(C44938HkM.LJFF);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        LifecycleOwner LIZIZ;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (this.LJLL == null) {
            C62828OlE c62828OlE = (C62828OlE) view.findViewById(R.id.hza);
            this.LJLL = c62828OlE;
            if (c62828OlE != null) {
                c62828OlE.setVideoDownloadClickListener(this);
            }
        }
        Context context = getContext();
        if (context == null || (LIZIZ = C57434MgQ.LIZIZ(context)) == null || !((PostModeFullPageViewModel) this.LJLJLLL.getValue()).LLFF) {
            return;
        }
        C57082Lw.LIZ.LIZIZ("video_download_status").observe(LIZIZ, new AObserverS71S0100000_3(this, 64));
    }
}
