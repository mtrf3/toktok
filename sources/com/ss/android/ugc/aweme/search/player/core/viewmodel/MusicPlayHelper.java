package com.ss.android.ugc.aweme.search.player.core.viewmodel;

import X.ActivityC45651qj;
import X.C5S1;
import X.CountDownTimerC49686Jek;
import X.K3Z;
import X.OSZ;
import X.XU2;
import android.text.TextUtils;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public final class MusicPlayHelper extends ViewModel {
    public Music LJLJI;
    public CountDownTimerC49686Jek LJLJJI;
    public final NextLiveData<OSZ<Integer, Long>> LJLIL = new NextLiveData<>();
    public final XU2 LJLILLLLZI = new XU2("MusicPlayHelper");
    public final NextLiveData<K3Z> LJLJJL = new NextLiveData<>();

    public final void hv0() {
        CountDownTimerC49686Jek countDownTimerC49686Jek = this.LJLJJI;
        if (countDownTimerC49686Jek != null) {
            countDownTimerC49686Jek.cancel();
        }
        this.LJLILLLLZI.pause();
        this.LJLJI = null;
        this.LJLIL.setValue(new OSZ<>(0, -1L));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        CountDownTimerC49686Jek countDownTimerC49686Jek = this.LJLJJI;
        if (countDownTimerC49686Jek != null) {
            countDownTimerC49686Jek.cancel();
        }
        hv0();
        this.LJLILLLLZI.release();
    }

    public static void gv0(ActivityC45651qj activityC45651qj, Music music) {
        String offlineDesc = music.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = activityC45651qj.getString(R.string.iia);
        }
        C5S1 c5s1 = new C5S1(activityC45651qj);
        c5s1.LIZLLL(offlineDesc);
        c5s1.LJ();
    }
}
