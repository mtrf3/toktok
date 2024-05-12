package com.ss.android.ugc.aweme.choosemusic.viewmodel;

import X.C221108m2;
import X.C62822Ol8;
import X.XVQ;
import X.XVR;
import X.XVS;
import X.XVT;
import X.XVU;
import X.XVV;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes16.dex */
public final class SelectedMusicViewModel extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(XVT.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(XVU.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(XVV.LJLIL);
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public final MutableLiveData<Integer> gv0() {
        return (MutableLiveData) this.LJLJJLL.getValue();
    }

    public final MutableLiveData<MusicModel> hv0() {
        return (MutableLiveData) this.LJLILLLLZI.getValue();
    }

    public final MutableLiveData<Integer> iv0() {
        return (MutableLiveData) this.LJLJI.getValue();
    }

    public final MutableLiveData<Boolean> jv0() {
        return (MutableLiveData) this.LJLIL.getValue();
    }

    public SelectedMusicViewModel() {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(XVR.LJLIL);
        this.LJLJJI = LIZIZ;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(XVQ.LJLIL);
        this.LJLJJL = LIZIZ2;
        this.LJLJJLL = C221108m2.LIZIZ(XVS.LJLIL);
        jv0().setValue(Boolean.FALSE);
        hv0().setValue(null);
        iv0().setValue(1);
        LiveData liveData = (LiveData) LIZIZ.getValue();
        Boolean bool = Boolean.TRUE;
        liveData.setValue(bool);
        ((LiveData) LIZIZ2.getValue()).setValue(bool);
        gv0().setValue(1);
    }
}
