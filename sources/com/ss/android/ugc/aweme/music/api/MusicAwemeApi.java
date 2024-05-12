package com.ss.android.ugc.aweme.music.api;

import X.C46104I7o;
import X.C76L;
import X.E8L;
import X.E8M;
import X.EF7;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import X.J7H;
import X.X1D;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import defpackage.i0;
import java.util.Map;

/* loaded from: classes5.dex */
public final class MusicAwemeApi {
    public static final MusicService LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;

    /* loaded from: classes5.dex */
    public interface MusicService {
        @E8M("/aweme/v1/music/create/")
        @InterfaceC195757mF
        InterfaceC37276Ek4<String> createMusic(@InterfaceC36229EJt Map<String, String> map);

        @E8L("/aweme/v1/original/music/list/")
        C76L<OriginalMusicList> fetchOriginalMusicList(@InterfaceC64986Pew("user_id") String str, @InterfaceC64986Pew("sec_user_id") String str2, @InterfaceC64986Pew("cursor") int i, @InterfaceC64986Pew("count") int i2);

        @E8L("/tiktok/user/pinned_pgc_music/list/v1/")
        C76L<PinnedMusicList> getPinnedMusicList(@InterfaceC64986Pew("sec_user_id") String str);

        @E8L
        C76L<MusicAwemeList> queryMusicAwemeList(@InterfaceC195747mE String str, @InterfaceC64986Pew("music_id") String str2, @InterfaceC64986Pew("cursor") long j, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("type") int i2, @InterfaceC64986Pew("video_cover_shrink") String str3, @InterfaceC64986Pew("from_group_id") String str4);

        @E8L("/tiktok/user/pgc_music/query/v1/")
        C76L<OriginalMusicList> searchMusicList(@InterfaceC64986Pew("sec_user_id") String str, @InterfaceC64986Pew("keyword") String str2, @InterfaceC64986Pew("cursor") int i, @InterfaceC64986Pew("count") int i2);
    }

    static {
        String str = Api.LIZ;
        LIZ = (MusicService) C46104I7o.LJIIZILJ(str, MusicService.class);
        LIZIZ = i0.LJFF(str, "/aweme/v1/music/aweme/");
        LIZJ = i0.LJFF(str, "/aweme/v1/music/fresh/aweme/");
    }

    public static String LIZ() {
        int i;
        if (EF7.LIZIZ().getResources().getDisplayMetrics().density > 320.0f) {
            i = 201;
        } else {
            i = 200;
        }
        int[] LIZ2 = J7H.LIZ(i);
        if (LIZ2 != null && LIZ2.length >= 2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZ2[0]);
            LIZ3.append("_");
            LIZ3.append(LIZ2[1]);
            return X1D.LIZIZ(LIZ3);
        }
        return null;
    }
}
