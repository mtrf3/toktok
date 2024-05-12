package com.ss.android.ugc.aweme.nows.publish.ui;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes16.dex */
public final class NowsPublishIntroFragment extends NowsPublishPopWindowFragment {
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.nows.publish.ui.NowsPublishPopWindowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.nows.publish.ui.NowsPublishPopWindowFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NowsPublishIntroFragment() {
        /*
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4.LJLJLJ = r0
            X.V4w r3 = new X.V4w
            r0 = 2131834065(0x7f1134d1, float:1.930123E38)
            java.lang.String r2 = com.ss.android.ugc.aweme.nows.publish.ui.NowsPublishPopWindowFragment.vl(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r0 = 2131834064(0x7f1134d0, float:1.9301228E38)
            java.lang.String r0 = com.ss.android.ugc.aweme.nows.publish.ui.NowsPublishPopWindowFragment.vl(r0)
            r1.append(r0)
            r0 = 2131833868(0x7f11340c, float:1.930083E38)
            java.lang.String r0 = com.ss.android.ugc.aweme.nows.publish.ui.NowsPublishPopWindowFragment.vl(r0)
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            r0 = 2131834063(0x7f1134cf, float:1.9301226E38)
            java.lang.String r0 = com.ss.android.ugc.aweme.nows.publish.ui.NowsPublishPopWindowFragment.vl(r0)
            r3.<init>(r2, r1, r0)
            X.Y54 r2 = new X.Y54
            java.lang.String r1 = "now_reflow_introduction"
            java.lang.String r0 = "click_got"
            r2.<init>(r1, r0)
            r0 = 0
            r4.<init>(r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.publish.ui.NowsPublishIntroFragment.<init>():void");
    }
}
