package com.bytedance.android.live.effect.sticker.data;

import X.C221108m2;
import X.C2HV;
import X.C2HY;
import X.C32001Nk;
import X.C39011g1;
import X.C47581tq;
import X.C47591tr;
import X.C62822Ol8;
import X.C78613UtF;
import X.XKX;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.broadcast.EffectParseOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class MultiGuestStickerViewModel extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C47591tr.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C47581tq.LJLIL);
    public final MutableLiveData<List<LiveEffect>> LJLJI = new MutableLiveData<>(new ArrayList());
    public final MutableLiveData<List<LiveEffect>> LJLJJI = new MutableLiveData<>(new ArrayList());
    public final MutableLiveData<List<C32001Nk>> LJLJJL = new MutableLiveData<>(new ArrayList());
    public LiveEffect LJLJJLL;

    public final C39011g1 hv0() {
        return (C39011g1) this.LJLILLLLZI.getValue();
    }

    public final C39011g1 iv0() {
        return (C39011g1) this.LJLIL.getValue();
    }

    public final void gv0(int i) {
        if (EffectParseOptSetting.enableOpt()) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C2HV(this, i, null), 2);
        } else {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C2HY(this, i, null), 3);
        }
    }
}
