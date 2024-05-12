package com.ss.android.ugc.aweme.service;

import X.C00F;
import X.C188727au;
import X.C42247Gi3;
import X.C42254GiA;
import X.C9QW;
import X.FMX;
import X.SRI;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.api.IMentionVideoApi;
import com.ss.android.ugc.aweme.compose.MentionFavoriteComposeFragment;
import com.ss.android.ugc.aweme.fragments.MentionVideoListFragment;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.viewmodel.BaseVideoListVM;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MentionVideoService implements IMentionVideoApi {
    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJI() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "video_credits_page");
        c188727au.LJIIIZ("creation_id", C42247Gi3.LIZ);
        FMX.LJIIL("confirm_credit", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final Fragment LIZJ() {
        boolean z = false;
        if (C00F.LIZ(31744, 0, "mention_video_compose_experiment", true) != 0) {
            z = true;
        }
        if (z) {
            MentionFavoriteComposeFragment mentionFavoriteComposeFragment = new MentionFavoriteComposeFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("page_type", 10);
            mentionFavoriteComposeFragment.setArguments(bundle);
            return mentionFavoriteComposeFragment;
        }
        return LIZLLL(10);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LIZ(int i) {
        if (i != 10 && i != 9 && i != 8 && i != 12 && i != 13 && i != 6) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LIZIZ(int i) {
        if (i == 10 || i == 9 || i == 8 || i == 12 || i == 13 || i == 6) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final Fragment LIZLLL(int i) {
        return C42254GiA.LIZ(i, null, null);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LJ(TextExtraStruct struct) {
        o.LJIIIZ(struct, "struct");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final boolean LJFF(TextExtraStruct textExtraStruct) {
        if (textExtraStruct.getType() != 5) {
            return false;
        }
        int subtype = textExtraStruct.getSubtype();
        if ((subtype != 10 && subtype != 9 && subtype != 8 && subtype != 12 && subtype != 13 && subtype != 6) || TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final String LJIIIZ(int i) {
        switch (i) {
            case 6:
                return "posted";
            case 7:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            default:
                return "getItemCategoryError";
            case 8:
                return "sound";
            case 9:
                return "liked";
            case 10:
                return "favorites";
            case 12:
                return "paste_short";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "paste_long";
        }
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJIIJ(Fragment fragment) {
        MentionVideoListFragment mentionVideoListFragment;
        BaseVideoListVM<SRI, C9QW, Long> baseVideoListVM;
        if ((fragment instanceof MentionVideoListFragment) && (mentionVideoListFragment = (MentionVideoListFragment) fragment) != null && (baseVideoListVM = mentionVideoListFragment.LJLJLJ) != null && mentionVideoListFragment.LJLJL && baseVideoListVM.LJLJJLL) {
            mentionVideoListFragment.LJLJL = false;
            baseVideoListVM.manualListRefresh();
        }
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJIIJJI(String str) {
        C42247Gi3.LIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJIIL(String groupId) {
        o.LJIIIZ(groupId, "groupId");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "video_post_page");
        c188727au.LJIIIZ("creation_id", C42247Gi3.LIZ);
        c188727au.LJIIIZ("group_id", groupId);
        c188727au.LJIIIZ("credit_item_category", C42247Gi3.LIZIZ);
        FMX.LJIIL("show_credits_item_preview", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final Fragment LJII(String musicId, String musicTitle) {
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(musicTitle, "musicTitle");
        return C42254GiA.LIZ(8, musicId, musicTitle);
    }

    @Override // com.ss.android.ugc.aweme.api.IMentionVideoApi
    public final void LJIIIIZZ(Activity activity, String str) {
        C42247Gi3.LIZ(activity, str, "click_preview");
    }
}
