package com.ss.android.ugc.aweme.music.api;

import X.C76L;
import X.E6L;
import X.E8L;
import X.InterfaceC36228EJs;
import X.InterfaceC44209HWr;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.Map;

/* loaded from: classes8.dex */
public final class MusicDetailApi {
    public static final DetailApi LIZ = (DetailApi) RetrofitFactory.LIZLLL().create(Api.LIZ).create(DetailApi.class);

    /* loaded from: classes8.dex */
    public interface DetailApi {
        @E8L("/aweme/v1/music/detail/")
        C76L<MusicDetail> queryMusic(@InterfaceC64986Pew("music_id") String str, @InterfaceC64986Pew("click_reason") int i);

        @E8L("/aweme/v1/music/detail/")
        C76L<MusicDetail> queryMusic(@InterfaceC64986Pew("music_id") String str, @InterfaceC64986Pew("click_reason") int i, @InterfaceC64986Pew("music_compliance_account") int i2, @InterfaceC36228EJs Map<String, String> map);

        @E6L(3)
        @E8L("/aweme/v1/music/detail/")
        @InterfaceC44209HWr(4)
        C76L<MusicDetail> queryMusicWithHighPriority(@InterfaceC64986Pew("music_id") String str, @InterfaceC64986Pew("click_reason") int i);

        @E6L(3)
        @E8L("/aweme/v1/music/detail/")
        @InterfaceC44209HWr(4)
        C76L<MusicDetail> queryMusicWithHighPriority(@InterfaceC64986Pew("music_id") String str, @InterfaceC64986Pew("click_reason") int i, @InterfaceC64986Pew("music_compliance_account") int i2, @InterfaceC36228EJs Map<String, String> map);

        @E8L("/aweme/v1/music/partner/detail/")
        C76L<MusicDetail> queryPartnerMusic(@InterfaceC64986Pew("partner_music_id") String str, @InterfaceC64986Pew("partner_name") String str2);
    }
}
