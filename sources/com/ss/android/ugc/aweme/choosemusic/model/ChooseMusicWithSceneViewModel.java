package com.ss.android.ugc.aweme.choosemusic.model;

import X.C221108m2;
import X.C62822Ol8;
import X.C79409VEn;
import X.C84911XUd;
import X.C84912XUe;
import X.XVN;
import X.XVO;
import X.XVP;
import X.XWC;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;

/* loaded from: classes16.dex */
public final class ChooseMusicWithSceneViewModel extends ViewModel {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public ViewPagerBottomSheetBehavior<View> LJLJI;
    public Mission LJLJJI;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C84912XUe.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(XVN.LJLIL);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(XVO.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(XVP.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C84911XUd.LJLIL);

    public final MutableLiveData<C79409VEn> gv0() {
        return (MutableLiveData) this.LJLJJLL.getValue();
    }

    public final MutableLiveData<XWC> hv0() {
        return (MutableLiveData) this.LJLJL.getValue();
    }

    public final MutableLiveData<XWC> iv0() {
        return (MutableLiveData) this.LJLJLJ.getValue();
    }
}
