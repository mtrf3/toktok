package com.ss.android.ugc.aweme.mix.bottom;

import X.C16970lZ;
import X.C228598y7;
import X.C229238z9;
import X.C229658zp;
import X.C229708zu;
import X.C229718zv;
import X.C2S6;
import X.C35979EAd;
import X.C72912tb;
import X.C78613UtF;
import X.IWF;
import X.IWH;
import X.InterfaceC46645ISj;
import X.JHI;
import X.M89;
import X.OSZ;
import X.XKX;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MixBottomBarVM extends AbsMixBottomBarVM {
    public final C35979EAd<C229708zu, OSZ<MixStruct, MixVideosResponse>> LJLIL = new C35979EAd<>(3);
    public volatile String LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.mix.bottom.AbsMixBottomBarVM
    public final void iv0(Aweme aweme) {
        String mixId;
        String aid;
        PlayListInfo playListInfo = aweme.playlist_info;
        if (playListInfo == null || (mixId = playListInfo.getMixId()) == null || (aid = aweme.getAid()) == null) {
            return;
        }
        C229708zu c229708zu = new C229708zu(mixId, aid);
        int LIZ = C228598y7.LIZ();
        if (this.LJLIL.LIZIZ(c229708zu) != null) {
            setState(new AqS169S0100000_3(new C72912tb(c229708zu), (C72912tb<C229708zu>) 255));
        } else {
            if (o.LJ(this.LJLILLLLZI, aweme.getAid())) {
                return;
            }
            this.LJLILLLLZI = aweme.getAid();
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C229658zp(mixId, aweme, LIZ, this, aid, c229708zu, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.bottom.AbsMixBottomBarVM
    public final void jv0(Context context) {
        if (C229718zv.LIZ) {
            if (!C16970lZ.LIZ(R.layout.bt8, null)) {
                C16970lZ.LJ(R.layout.bt8, null);
            }
            if (!C16970lZ.LIZ(R.layout.bta, null)) {
                C16970lZ.LJ(R.layout.bta, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.bottom.AbsMixBottomBarVM
    public final boolean gv0(String str, String str2) {
        if (this.LJLIL.LIZIZ(new C229708zu(str, str2)) != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.mix.bottom.AbsMixBottomBarVM
    public final void hv0(Context context, Aweme aweme, String enterFrom, boolean z) {
        String str;
        float f;
        String str2;
        String str3;
        InterfaceC46645ISj LIZJ;
        InterfaceC46645ISj LIZJ2;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        M89 LIZ = C2S6.LIZ(context);
        String playlistSearchId = LIZ.getPlaylistSearchId();
        Integer valueOf = Integer.valueOf(LIZ.isFromVideo());
        String searchType = LIZ.getSearchType();
        Map<String, String> searchExtraParams = aweme.getSearchExtraParams();
        String str4 = null;
        if (searchExtraParams != null) {
            str = searchExtraParams.get("search_result_id");
        } else {
            str = null;
        }
        C229238z9 c229238z9 = new C229238z9(playlistSearchId, valueOf, searchType, 0, str, null, 40, null);
        IWH LJJIJIL = IWF.LJJLIIIIJ().LJJIJIL();
        float f2 = 0.0f;
        if (LJJIJIL != null && (LIZJ2 = LJJIJIL.LIZJ()) != null) {
            f = (float) LIZJ2.getDuration();
        } else {
            f = 0.0f;
        }
        IWH LJJIJIL2 = IWF.LJJLIIIIJ().LJJIJIL();
        if (LJJIJIL2 != null && (LIZJ = LJJIJIL2.LIZJ()) != null) {
            f2 = (float) LIZJ.getCurrentPosition();
        }
        float f3 = (f2 / f) * 100;
        JHI.LIZ().LIZ = IWF.LJJLIIIIJ();
        JHI.LIZ().LIZJ = IWF.LJJLIIIIJ().LJJIJIL().LIZJ().getCurrentPosition();
        JHI.LIZ().LIZIZ = aweme.getAid();
        JHI.LIZ().LIZJ = -1L;
        C229708zu LIZ2 = getState().LJLIL.LIZ();
        if (LIZ2 != null) {
            str2 = LIZ2.LIZ;
        } else {
            str2 = null;
        }
        PlayListInfo playListInfo = aweme.playlist_info;
        if (playListInfo != null) {
            str4 = playListInfo.getMixId();
        }
        boolean z2 = !o.LJ(str2, str4);
        IMixFeedService LJJIJIIJIL = MixFeedService.LJJIJIIJIL();
        String aid = aweme.getAid();
        PlayListInfo playListInfo2 = aweme.playlist_info;
        if (playListInfo2 == null || (str3 = playListInfo2.getMixId()) == null) {
            str3 = "";
        }
        o.LJIIIIZZ(LJJIJIIJIL, "getService(IMixFeedService::class.java)");
        LJJIJIIJIL.LJJIIJZLJL(context, aweme, c229238z9, Float.valueOf(f3), str3, aid, enterFrom, z, z2);
    }
}
