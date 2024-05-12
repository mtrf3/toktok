package com.ss.android.ugc.aweme.music.v2.viewmodel;

import X.C187447Xg;
import X.C187457Xh;
import X.C46951Ibj;
import X.C57339Met;
import X.C62822Ol8;
import X.C7U8;
import X.FFL;
import X.K1U;
import X.K1V;
import X.XKX;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.ReuseMusicStruct;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class MusicDetailViewModel extends AssemViewModel<C187447Xg> {
    public Music LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public Integer LJLJJLL;
    public ReuseMusicStruct LJLJL;
    public long LJLJLJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C187447Xg defaultState() {
        return new C187447Xg(0);
    }

    public static void hv0(Music music) {
        RateSettingsResponse rateSettingsResponse;
        List<SimBitRate> multiBitRatePlayInfo = music.getMultiBitRatePlayInfo();
        if (multiBitRatePlayInfo == null || multiBitRatePlayInfo.isEmpty()) {
            return;
        }
        SimBitRate simBitRate = null;
        if (0 != 0) {
            return;
        }
        try {
            K1U.LIZ.getClass();
            FFL.LJIIIZ().getClass();
            if (FFL.LJIIJ(31744, 0, "music_bitrate_select", true) == 1) {
                VideoBitRateABManager videoBitRateABManager = VideoBitRateABManager.LJFF;
                videoBitRateABManager.LJI();
                rateSettingsResponse = videoBitRateABManager.LIZ;
            } else {
                rateSettingsResponse = null;
            }
            simBitRate = C46951Ibj.LIZ(multiBitRatePlayInfo, rateSettingsResponse);
        } catch (Throwable unused) {
        }
        if (simBitRate == null) {
            return;
        }
        UrlModel playUrl = music.getPlayUrl();
        if (playUrl == null) {
            playUrl = new UrlModel();
        }
        playUrl.setUrlKey(simBitRate.getUrlKey());
        List<String> urlList = simBitRate.urlList();
        List<String> backUpUrlList = playUrl.getUrlList();
        C62822Ol8 c62822Ol8 = K1V.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 1) {
            o.LJIIIIZZ(backUpUrlList, "backUpUrlList");
            urlList.addAll(backUpUrlList);
        } else if (((Number) c62822Ol8.getValue()).intValue() == 2) {
            if (urlList.size() >= 1) {
                o.LJIIIIZZ(backUpUrlList, "backUpUrlList");
                urlList.addAll(1, backUpUrlList);
            } else {
                o.LJIIIIZZ(backUpUrlList, "backUpUrlList");
                urlList.addAll(backUpUrlList);
            }
        }
        playUrl.setUrlList(urlList);
        playUrl.setSize(simBitRate.getSize());
        playUrl.setFileHash(simBitRate.getPlayAddr().getFileHash());
        music.setPlayUrl(playUrl);
    }

    public final void gv0(boolean z) {
        Music music;
        setState(C187457Xh.LJLIL);
        if ((C7U8.LIZ() || e1.LIZ(31744, "creative_tools_music_detail_header_start", true, false)) && (music = this.LJLIL) != null) {
            setState(new AqS169S0100000_3(music, 282));
            this.LJLIL = null;
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C57339Met(this, z, null), 3);
    }
}
