package com.ss.android.ugc.aweme.prop.fragment;

import X.C6ZT;
import X.ExecutorC142245i8;
import X.FV9;
import X.MGX;
import X.MHU;
import Y.IDRunnableS6S0101000;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class StickerDetailAwemeListFramgent extends DetailAwemeListFragment {
    public static final /* synthetic */ int LLILZ = 0;
    public boolean LLILLL = true;

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLILLL && FV9.LIZJ) {
            this.LLILLL = false;
            ExecutorC142245i8.LJLILLLLZI.execute(new IDRunnableS6S0101000(5, this, 9));
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final List<Aweme> Ml(List<Aweme> list) {
        AVExternalServiceImpl.LIZ().provideAVPerformance().end("tool_performance_effect_shoot_same", "setData");
        return list;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute wl(MGX mgx, Aweme aweme) {
        SmartRoute wl = super.wl(mgx, aweme);
        if (this.LLIIII != null) {
            wl.withParam("feed_data_sticker_model", new ArrayList(this.LLIIII));
        }
        String str = this.LLIIIILZ;
        if (str != null) {
            wl.withParam("feed_data_sticker_group_id", str);
        }
        String str2 = this.LLIIIJ;
        if (str2 != null) {
            wl.withParam("extra_edit_effect_uid", str2);
        }
        return wl;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.MH9
    public final void LLLILZ(View view, Aweme aweme, String str) {
        String str2;
        String str3;
        if (aweme instanceof MHU) {
            if (C6ZT.LIZ(view)) {
                return;
            }
            Bundle arguments = getArguments();
            String str4 = "";
            if (arguments == null) {
                str2 = "";
            } else {
                str2 = arguments.getString("qa_origin_detail_key", "");
            }
            if (arguments == null) {
                str3 = "";
            } else {
                str3 = arguments.getString("shoot_enter_from", "");
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(mo49getActivity(), "aweme://aweme/detail/");
            buildRoute.withParam("id", aweme.getAid());
            buildRoute.withParam("refer", str);
            buildRoute.withParam("previous_page", this.LJLJJLL);
            buildRoute.withParam("shoot_enter_from", str3);
            buildRoute.withParam("extra_previous_page_position", this.LJLJLJ);
            buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "");
            buildRoute.withParam("video_from", "");
            buildRoute.withParam("video_challenge_profile_from", "");
            buildRoute.withParam("video_type", this.LJLILLLLZI);
            buildRoute.withParam("profile_enterprise_type", aweme.getEnterpriseType());
            String str5 = this.LJLLI;
            if (str5 != null) {
                str4 = str5;
            }
            buildRoute.withParam("process_id", str4);
            buildRoute.withParam("duo_type", "duo_detail");
            buildRoute.withParam("from_group_id", this.LJLJL);
            buildRoute.withParam("creation_id", this.LLILIL);
            buildRoute.withParam("qa_origin_detail_key", str2);
            buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", this.LJLLLLLL);
            buildRoute.open();
            return;
        }
        super.LLLILZ(view, aweme, str);
    }
}
