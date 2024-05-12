package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import X.C140335f3;
import X.C5MM;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes3.dex */
public class FTCInfoStickerViewModel extends ViewModel {
    public MutableLiveData<C5MM> LJLIL;
    public MutableLiveData<C140335f3> LJLILLLLZI;
    public MutableLiveData<Boolean> LJLJI;
    public MutableLiveData<Boolean> LJLJJI;

    public final MutableLiveData<C5MM> DM() {
        if (this.LJLIL == null) {
            this.LJLIL = new MutableLiveData<>();
        }
        return this.LJLIL;
    }

    public final MutableLiveData<C140335f3> gv0() {
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new MutableLiveData<>();
        }
        return this.LJLILLLLZI;
    }
}
