package com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.viewmodel;

import X.C207668Da;
import X.C5IO;
import X.KJ3;
import X.XUP;
import X.XVG;
import X.XY4;
import X.Z9N;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.SelectMusicFromSelectSearchPageMonitor;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.AqS174S0100000_8;

/* loaded from: classes9.dex */
public final class SearchMusicPlayViewModel extends AssemViewModel<KJ3> implements Observer<C207668Da>, XY4 {
    public DataCenter LJLIL;
    public boolean LJLILLLLZI;
    public final boolean LJLJI = true;
    public ChooseMusicDownloadPlayHelper LJLJJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final KJ3 defaultState() {
        return new KJ3(0);
    }

    @Override // X.XY4
    public final void k2(MusicModel musicModel) {
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LJLJJI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.pause();
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        C207668Da c207668Da2 = c207668Da;
        if (c207668Da2 == null) {
            return;
        }
        String str = c207668Da2.LIZ;
        if (str.hashCode() != 502104354 || !str.equals("music_loading")) {
            return;
        }
        withState(new AqS174S0100000_8(this, 247));
    }

    @Override // X.XY4
    public final void y8(MusicModel musicModel) {
        String str;
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LJLJJI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.LJLLILLLL = "search_result";
        }
        if (musicModel != null) {
            str = musicModel.getMusicId();
        } else {
            str = null;
        }
        SelectMusicFromSelectSearchPageMonitor selectMusicFromSelectSearchPageMonitor = SelectMusicFromSelectSearchPageMonitor.INSTANCE;
        C5IO.LIZ(selectMusicFromSelectSearchPageMonitor, str);
        AVExternalServiceImpl.LIZ().provideAVPerformance().start(selectMusicFromSelectSearchPageMonitor, "click use music from search");
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper2 = this.LJLJJI;
        if (chooseMusicDownloadPlayHelper2 != null) {
            chooseMusicDownloadPlayHelper2.LIZIZ(2, musicModel, true, this.LJLILLLLZI);
        }
    }

    @Override // X.XY4
    public final void za0(XUP xup) {
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LJLJJI;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.LJLJJLL = xup;
        }
    }

    @Override // X.XY4
    public final void oj0(MusicModel musicModel, XVG xvg) {
        Z9N.LIZIZ.LJLJI();
        DataCenter dataCenter = this.LJLIL;
        if (dataCenter != null) {
            dataCenter.jv0(Boolean.TRUE, "music_loading");
        }
        if (this.LJLJI) {
            ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.LJLJJI;
            if (chooseMusicDownloadPlayHelper != null) {
                chooseMusicDownloadPlayHelper.LLFFF = xvg;
                chooseMusicDownloadPlayHelper.LJIIJ(musicModel, false, 2);
                return;
            }
            return;
        }
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper2 = this.LJLJJI;
        if (chooseMusicDownloadPlayHelper2 == null) {
            return;
        }
        chooseMusicDownloadPlayHelper2.LIZIZ(2, musicModel, true, this.LJLILLLLZI);
    }
}
