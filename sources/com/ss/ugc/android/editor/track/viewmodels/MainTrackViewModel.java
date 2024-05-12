package com.ss.ugc.android.editor.track.viewmodels;

import X.C1285052o;
import X.C76800UCe;
import X.OSZ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;

/* loaded from: classes3.dex */
public final class MainTrackViewModel extends ViewModel {
    public final MutableLiveData<C1285052o> LJLIL;
    public final MutableLiveData<C76800UCe> LJLILLLLZI;
    public final MutableLiveData<OSZ<Integer, NLEVideoAnimation>> LJLJI;
    public NLETrack LJLJJI;
    public NLETrack LJLJJL;
    public final String LJLJJLL;
    public final MutableLiveData LJLJL;
    public final MutableLiveData LJLJLJ;
    public final MutableLiveData LJLJLLL;

    public MainTrackViewModel() {
        MutableLiveData<C1285052o> mutableLiveData = new MutableLiveData<>();
        this.LJLIL = mutableLiveData;
        MutableLiveData<C76800UCe> mutableLiveData2 = new MutableLiveData<>();
        this.LJLILLLLZI = mutableLiveData2;
        MutableLiveData<OSZ<Integer, NLEVideoAnimation>> mutableLiveData3 = new MutableLiveData<>();
        this.LJLJI = mutableLiveData3;
        this.LJLJJLL = "MainTrackViewModel";
        this.LJLJL = mutableLiveData;
        this.LJLJLJ = mutableLiveData2;
        this.LJLJLLL = mutableLiveData3;
    }
}
