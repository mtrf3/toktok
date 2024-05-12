package com.ss.android.ugc.aweme.nows.publish.ui;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes16.dex */
public final class NowsTurnOnNotifyPermissionFragment extends NowsPublishPopWindowFragment {
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
    public NowsTurnOnNotifyPermissionFragment(boolean r5) {
        /*
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4.LJLJLJ = r0
            X.V4w r3 = new X.V4w
            r0 = 2131834003(0x7f113493, float:1.9301104E38)
            java.lang.String r2 = com.ss.android.ugc.aweme.nows.publish.ui.NowsPublishPopWindowFragment.vl(r0)
            r0 = 2131834002(0x7f113492, float:1.9301102E38)
            if (r5 == 0) goto L47
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = com.ss.android.ugc.aweme.nows.publish.ui.NowsPublishPopWindowFragment.vl(r0)
            r1.append(r0)
            r0 = 2131833868(0x7f11340c, float:1.930083E38)
            java.lang.String r0 = com.ss.android.ugc.aweme.nows.publish.ui.NowsPublishPopWindowFragment.vl(r0)
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
        L2e:
            r0 = 2131834001(0x7f113491, float:1.93011E38)
            java.lang.String r0 = com.ss.android.ugc.aweme.nows.publish.ui.NowsPublishPopWindowFragment.vl(r0)
            r3.<init>(r2, r1, r0)
            X.Y54 r2 = new X.Y54
            java.lang.String r1 = "now_turn_on_notification"
            java.lang.String r0 = "click_turn_on_notification"
            r2.<init>(r1, r0)
            X.8gI r0 = X.C217548gI.INSTANCE
            r4.<init>(r3, r2, r0)
            return
        L47:
            java.lang.String r1 = com.ss.android.ugc.aweme.nows.publish.ui.NowsPublishPopWindowFragment.vl(r0)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.publish.ui.NowsTurnOnNotifyPermissionFragment.<init>(boolean):void");
    }
}
