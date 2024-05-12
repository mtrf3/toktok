package com.ss.android.ugc.aweme.nows.service;

import X.AbstractC196727no;
import X.AbstractC73672Svk;
import X.C00F;
import X.C188727au;
import X.C195817mL;
import X.C196697nl;
import X.C54218LPq;
import X.C73950T0o;
import X.EnumC53701L5t;
import X.FMX;
import X.MH9;
import Y.ACallableS0S1000000_1;
import android.view.View;
import com.ss.android.ugc.aweme.service.INowDistributionService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowDistributionService implements INowDistributionService {
    @Override // com.ss.android.ugc.aweme.service.INowDistributionService
    public final int LIZJ() {
        return R.layout.by5;
    }

    @Override // com.ss.android.ugc.aweme.service.INowDistributionService
    public final boolean LIZLLL() {
        if (C00F.LIZ(31744, 0, "tt_now_enable_avatar_distribute_expansion", true) <= 0 || !C54218LPq.LJLIL.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.INowDistributionService
    public final boolean LJ() {
        if (C00F.LIZ(31744, 1, "tt_now_enable_post_cover_distribute", true) > 0 && C54218LPq.LJLIL.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.INowDistributionService
    public final boolean LJI() {
        if (C00F.LIZ(31744, 0, "tt_now_enable_avatar_distribute", true) <= 0 || !C54218LPq.LJLIL.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.INowDistributionService
    public final AbstractC73672Svk<Integer> LJFF(String str) {
        return AbstractC73672Svk.LJJIIJZLJL(new ACallableS0S1000000_1(str, 3)).LJJL(new C73950T0o(C195817mL.LIZ()));
    }

    @Override // com.ss.android.ugc.aweme.service.INowDistributionService
    public final AbstractC196727no LIZIZ(View itemView, String eventLabel, MH9 listener) {
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(eventLabel, "eventLabel");
        o.LJIIIZ(listener, "listener");
        return new C196697nl(itemView, eventLabel, listener);
    }

    @Override // com.ss.android.ugc.aweme.service.INowDistributionService
    public final void LIZ(String str, String str2, String str3, Integer num) {
        if (EnumC53701L5t.GRAY_RING == null || EnumC53701L5t.BRAND_RING == null || o.LJ("video_cover", "video_cover")) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str2);
            c188727au.LJIIIZ("enter_position", "video_cover");
            c188727au.LJIIIZ("author_id", str3);
            c188727au.LJFF(num, "follow_status");
            FMX.LJIIL(str, c188727au.LIZ);
        }
    }
}
