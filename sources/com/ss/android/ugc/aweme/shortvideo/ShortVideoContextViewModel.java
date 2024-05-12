package com.ss.android.ugc.aweme.shortvideo;

import X.C1HQ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes8.dex */
public class ShortVideoContextViewModel extends ViewModel {
    public ShortVideoContext LJLIL;
    public final C1HQ<String, Object> LJLILLLLZI = new C1HQ<>();
    public MutableLiveData<Boolean> LJLJI;

    public final boolean gv0() {
        Boolean bool = (Boolean) this.LJLILLLLZI.getOrDefault("photo_mode", null);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void iv0() {
        if (this.LJLJI == null) {
            this.LJLJI = new MutableLiveData<>();
        }
        this.LJLJI.setValue(Boolean.TRUE);
    }

    public final void hv0(boolean z) {
        this.LJLILLLLZI.put("has_go_next", Boolean.valueOf(z));
    }
}
