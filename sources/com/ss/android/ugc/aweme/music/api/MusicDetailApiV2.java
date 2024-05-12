package com.ss.android.ugc.aweme.music.api;

import X.C8SY;
import X.E6L;
import X.E8L;
import X.E8M;
import X.InterfaceC195747mE;
import X.InterfaceC195787mI;
import X.InterfaceC36228EJs;
import X.InterfaceC44209HWr;
import X.InterfaceC64986Pew;
import X.InterfaceC64987Pex;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.Map;

/* loaded from: classes10.dex */
public interface MusicDetailApiV2 {
    public static final C8SY LIZ = C8SY.LIZ;

    @E8L("/aweme/v1/music/collect/")
    Object collectMusic(@InterfaceC64986Pew("music_id") String str, @InterfaceC64986Pew("action") int i, InterfaceC67352kd<? super CollectMusicResponse> interfaceC67352kd);

    @InterfaceC195787mI
    @E8M("/tiktok/music/pinned_aweme/delete/v1/")
    Object deletePinnedAweme(@InterfaceC64987Pex("music_id") String str, @InterfaceC64987Pex("aweme_id") String str2, InterfaceC67352kd<? super BaseResponse> interfaceC67352kd);

    @E8L("/aweme/v1/music/detail/")
    Object queryMusic(@InterfaceC64986Pew("music_id") String str, @InterfaceC64986Pew("click_reason") int i, InterfaceC67352kd<? super MusicDetail> interfaceC67352kd);

    @E8L
    Object queryMusicAwemeList(@InterfaceC195747mE String str, @InterfaceC64986Pew("music_id") String str2, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("type") int i2, @InterfaceC64986Pew("video_cover_shrink") String str3, InterfaceC67352kd<? super MusicAwemeList> interfaceC67352kd);

    @E8L("/aweme/v1/music/detail/")
    Object queryMusicExtra(@InterfaceC64986Pew("music_id") String str, @InterfaceC64986Pew("click_reason") int i, @InterfaceC64986Pew("music_compliance_account") int i2, @InterfaceC36228EJs Map<String, String> map, InterfaceC67352kd<? super MusicDetail> interfaceC67352kd);

    @E6L(3)
    @E8L("/aweme/v1/music/detail/")
    @InterfaceC44209HWr(4)
    Object queryMusicExtraWithHighPriority(@InterfaceC64986Pew("music_id") String str, @InterfaceC64986Pew("click_reason") int i, @InterfaceC64986Pew("music_compliance_account") int i2, @InterfaceC36228EJs Map<String, String> map, InterfaceC67352kd<? super MusicDetail> interfaceC67352kd);

    @E8L("/aweme/v1/music/partner/detail/")
    Object queryPartnerMusic(@InterfaceC64986Pew("partner_music_id") String str, @InterfaceC64986Pew("partner_name") String str2, InterfaceC67352kd<? super MusicDetail> interfaceC67352kd);
}
