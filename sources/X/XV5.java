package X;

import Y.AObserverS83S0100000_15;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.CutMusicRepeartPlayer;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XV5 {
    public final Fragment LIZ;
    public final ActivityC45651qj LIZIZ;
    public XY4 LIZJ;
    public CutMusicRepeartPlayer LIZLLL;
    public ChooseMusicCutViewModel LJ;
    public final CutMusicPanel LJFF;
    public HWH LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public MusicModel LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public String LJIILJJIL;
    public XVD LJIILL;
    public final String LJIILLIIL;

    public final void LIZ() {
        MutableLiveData<XVG> gv0;
        LiveData liveData;
        MutableLiveData<MusicModel> hv0;
        ChooseMusicCutViewModel chooseMusicCutViewModel = this.LJ;
        if (chooseMusicCutViewModel != null && (hv0 = chooseMusicCutViewModel.hv0()) != null) {
            hv0.setValue(null);
        }
        ChooseMusicCutViewModel chooseMusicCutViewModel2 = this.LJ;
        if (chooseMusicCutViewModel2 != null && (liveData = (LiveData) chooseMusicCutViewModel2.LJLILLLLZI.getValue()) != null) {
            liveData.setValue(null);
        }
        ChooseMusicCutViewModel chooseMusicCutViewModel3 = this.LJ;
        if (chooseMusicCutViewModel3 == null || (gv0 = chooseMusicCutViewModel3.gv0()) == null) {
            return;
        }
        gv0.setValue(null);
    }

    public final void LIZIZ() {
        MutableLiveData<XVG> gv0;
        LiveData liveData;
        MutableLiveData<MusicModel> hv0;
        this.LJ = (ChooseMusicCutViewModel) C165706es.LJ(this.LIZ).get(ChooseMusicCutViewModel.class);
        LIZ();
        ChooseMusicCutViewModel chooseMusicCutViewModel = this.LJ;
        if (chooseMusicCutViewModel != null && (hv0 = chooseMusicCutViewModel.hv0()) != null) {
            hv0.observe(this.LIZ, new AObserverS83S0100000_15(this, 88));
        }
        ChooseMusicCutViewModel chooseMusicCutViewModel2 = this.LJ;
        if (chooseMusicCutViewModel2 != null && (liveData = (LiveData) chooseMusicCutViewModel2.LJLILLLLZI.getValue()) != null) {
            liveData.observe(this.LIZ, new AObserverS83S0100000_15(this, 89));
        }
        ChooseMusicCutViewModel chooseMusicCutViewModel3 = this.LJ;
        if (chooseMusicCutViewModel3 != null && (gv0 = chooseMusicCutViewModel3.gv0()) != null) {
            gv0.observe(this.LIZ, new AObserverS83S0100000_15(this, 90));
        }
    }

    public final void LJ() {
        XY4 xy4;
        MutableLiveData<XVG> gv0;
        LiveData liveData;
        MutableLiveData<MusicModel> hv0;
        ChooseMusicCutViewModel chooseMusicCutViewModel = this.LJ;
        if (chooseMusicCutViewModel != null && (hv0 = chooseMusicCutViewModel.hv0()) != null) {
            hv0.removeObservers(this.LIZ);
        }
        ChooseMusicCutViewModel chooseMusicCutViewModel2 = this.LJ;
        if (chooseMusicCutViewModel2 != null && (liveData = (LiveData) chooseMusicCutViewModel2.LJLILLLLZI.getValue()) != null) {
            liveData.removeObservers(this.LIZ);
        }
        ChooseMusicCutViewModel chooseMusicCutViewModel3 = this.LJ;
        if (chooseMusicCutViewModel3 != null && (gv0 = chooseMusicCutViewModel3.gv0()) != null) {
            gv0.removeObservers(this.LIZ);
        }
        MusicModel musicModel = this.LJIIJ;
        if (musicModel != null && (xy4 = this.LIZJ) != null) {
            xy4.k2(musicModel);
        }
    }

    public final void LIZJ(MusicModel musicModel, String str) {
        int duration = musicModel.getDuration();
        WGE.LIZ(str, (this.LJFF.W1() * duration) / this.LJIILIIL, new XV4(this, musicModel, str));
    }

    public final void LJFF(ActivityC45651qj context, boolean z) {
        o.LJIIIZ(context, "context");
        if (z) {
            this.LJI = HWG.LIZIZ(context, HWK.VISIBLE, new U1F());
            return;
        }
        HWH hwh = this.LJI;
        if (hwh == null) {
            return;
        }
        hwh.dismiss();
    }

    public XV5(Fragment fragment, LayoutInflater inflater, ViewGroup container) {
        L7Q l7q;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        this.LIZ = fragment;
        ActivityC45651qj requireActivity = fragment.requireActivity();
        o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
        this.LIZIZ = requireActivity;
        this.LJIILJJIL = "";
        this.LJIILL = new XVD("video_edit_page", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 131070);
        this.LJIILLIIL = "CutMusic:";
        CutMusicPanel cutMusicPanel = new CutMusicPanel();
        this.LJFF = cutMusicPanel;
        if (C63057Oov.LIZ()) {
            l7q = L7Q.CONST;
        } else {
            l7q = L7Q.WHITE;
        }
        cutMusicPanel.LLIILII = Boolean.TRUE;
        cutMusicPanel.Qj(requireActivity, inflater, container, l7q);
        cutMusicPanel.LLILL = new XV6(this);
        cutMusicPanel.LLILLIZIL = new C28791BRr();
    }

    public final void LIZLLL(MusicWaveBean musicWaveBean, MusicModel musicModel, String str) {
        int i;
        ChooseMusicCutViewModel chooseMusicCutViewModel;
        LiveData liveData;
        LJFF(this.LIZIZ, false);
        int musicDuration = AVExternalServiceImpl.LIZ().abilityService().infoService().getMusicDuration(str);
        if (AVExternalServiceImpl.LIZ().abilityService().infoService().supportTrimmedMuisc(musicModel)) {
            i = musicModel.getTrimmedMusicDuration();
        } else {
            i = 0;
        }
        if (musicWaveBean != null && (chooseMusicCutViewModel = this.LJ) != null && (liveData = (LiveData) chooseMusicCutViewModel.LJLILLLLZI.getValue()) != null) {
            liveData.postValue(new XV7(musicWaveBean, musicModel, musicModel.getMusicStartFromCut(), this.LJIILIIL, str, musicDuration, i));
        }
    }
}
