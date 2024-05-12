package com.ss.android.ugc.aweme.setting.ui.vm;

import X.C221108m2;
import X.C42949GtN;
import X.C42950GtO;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78999UzT;
import X.T16;
import Y.AfS53S0200000_4;
import Y.AfS59S0100000_7;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.commercialize.advideo.InvitationInfo;
import com.ss.android.ugc.aweme.commercialize.advideo.VideoAuthorizationApi;
import com.ss.android.ugc.aweme.setting.ui.VideoAuthorizationActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoAuthorizationViewModel extends ViewModel {
    public final MutableLiveData<Boolean> LJLIL = new MutableLiveData<>();
    public final MutableLiveData<InvitationInfo> LJLILLLLZI;
    public final MutableLiveData LJLJI;
    public final MutableLiveData<Boolean> LJLJJI;
    public final MutableLiveData LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public VideoAuthorizationViewModel() {
        MutableLiveData<InvitationInfo> mutableLiveData = new MutableLiveData<>();
        this.LJLILLLLZI = mutableLiveData;
        this.LJLJI = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(Boolean.FALSE);
        this.LJLJJI = mutableLiveData2;
        this.LJLJJL = mutableLiveData2;
        this.LJLJJLL = C221108m2.LIZIZ(C42950GtO.LJLIL);
    }

    public final void gv0(VideoAuthorizationActivity activity, String str, String str2, int i, int i2, long j) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL.setValue(Boolean.TRUE);
        VideoAuthorizationApi.LIZ.getClass();
        C78999UzT.LJFF(((VideoAuthorizationApi) C42949GtN.LIZIZ.getValue()).updateInvitation(str, str2, i, i2, j).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS59S0100000_7(this, 65), new AfS53S0200000_4(activity, this, 29)), (C73318Sq2) this.LJLJJLL.getValue());
    }
}
