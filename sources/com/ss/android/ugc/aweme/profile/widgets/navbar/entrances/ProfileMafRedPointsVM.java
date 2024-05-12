package com.ss.android.ugc.aweme.profile.widgets.navbar.entrances;

import X.C235439Lv;
import X.C235479Lz;
import X.C9M0;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes5.dex */
public final class ProfileMafRedPointsVM extends AssemViewModel<C235439Lv> {
    public final C235479Lz LJLIL = C9M0.LIZ();
    public boolean LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C235439Lv defaultState() {
        return new C235439Lv(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if (((java.lang.System.currentTimeMillis() / r3) - r10.LJLIL.LIZ.getLong("last_not_click_time", 0)) <= (java.util.concurrent.TimeUnit.DAYS.toMillis(14) / r3)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gv0(int r11) {
        /*
            r10 = this;
            r6 = 0
            if (r11 == 0) goto L10
            X.9Lz r0 = r10.LJLIL
            com.bytedance.keva.Keva r0 = r0.LIZ
            java.lang.String r2 = "maf_red_point_quit_times"
            int r1 = r0.getInt(r2, r6)
            r0 = 3
            if (r1 < r0) goto L21
        L10:
            X.9Lz r0 = r10.LJLIL
            com.bytedance.keva.Keva r1 = r0.LIZ
            java.lang.String r0 = "random_maf_count"
            r1.storeInt(r0, r6)
            X.9Lx r0 = X.C235459Lx.LJLIL
            r10.setState(r0)
        L1e:
            r10.LJLILLLLZI = r6
            return
        L21:
            X.9Lz r0 = r10.LJLIL
            com.bytedance.keva.Keva r0 = r0.LIZ
            int r0 = r0.getInt(r2, r6)
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= 0) goto L5a
            X.9Lz r0 = r10.LJLIL
            com.bytedance.keva.Keva r1 = r0.LIZ
            java.lang.String r0 = "show_maf_point_not_click_times"
            int r0 = r1.getInt(r0, r6)
            if (r0 != 0) goto L5a
            long r8 = java.lang.System.currentTimeMillis()
            long r3 = (long) r5
            long r8 = r8 / r3
            X.9Lz r0 = r10.LJLIL
            com.bytedance.keva.Keva r7 = r0.LIZ
            java.lang.String r2 = "last_not_click_time"
            r0 = 0
            long r0 = r7.getLong(r2, r0)
            long r8 = r8 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 14
            long r1 = r2.toMillis(r0)
            long r1 = r1 / r3
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L5a
            goto L10
        L5a:
            X.9Lz r0 = r10.LJLIL
            com.bytedance.keva.Keva r4 = r0.LIZ
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = (long) r5
            long r2 = r2 / r0
            java.lang.String r0 = "last_get_red_point_time"
            r4.storeLong(r0, r2)
            X.7au r2 = new X.7au
            r2.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "personal_homepage"
            r2.LJIIIZ(r1, r0)
            java.lang.String r1 = "button_type"
            java.lang.String r0 = "add_friends"
            r2.LJIIIZ(r1, r0)
            java.lang.String r0 = "notice_cnt"
            r2.LIZLLL(r11, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "show_add_friends_notice"
            X.FMX.LJIIL(r0, r1)
            X.9Lw r0 = X.C235449Lw.LJLIL
            r10.setState(r0)
            r6 = 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.ProfileMafRedPointsVM.gv0(int):void");
    }
}
