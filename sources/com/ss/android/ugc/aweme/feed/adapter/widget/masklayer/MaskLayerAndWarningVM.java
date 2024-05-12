package com.ss.android.ugc.aweme.feed.adapter.widget.masklayer;

import X.C221108m2;
import X.C47261Igj;
import X.C51029K0z;
import X.C62822Ol8;
import X.C76800UCe;
import X.C86343Xud;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MaskLayer;
import kotlin.jvm.internal.AqS165S0100000_15;

/* loaded from: classes16.dex */
public final class MaskLayerAndWarningVM extends LiveWidgetViewModel {
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 343));
    public int LJLJJI = 100;
    public final MutableLiveData<Boolean> LJLJJL = new MutableLiveData<>();
    public final MutableLiveData<C76800UCe> LJLJJLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LJLJL = new MutableLiveData<>();

    public final boolean gv0() {
        return C47261Igj.LJJIJIIJI(100, 200).contains(Integer.valueOf(this.LJLJJI));
    }

    public final void hv0() {
        LiveRoomStruct liveRoomStruct;
        MaskLayer maskLayer;
        C86343Xud c86343Xud = (C86343Xud) this.LJLIL.getValue();
        if (c86343Xud == null || (liveRoomStruct = c86343Xud.LIZIZ) == null || !c86343Xud.LJ || this.LJLILLLLZI) {
            return;
        }
        if (liveRoomStruct.warningTag != null) {
            this.LJLJL.setValue(Boolean.TRUE);
        }
        this.LJLJJL.setValue(Boolean.FALSE);
        LiveRoomStruct liveRoomStruct2 = c86343Xud.LIZIZ;
        if (liveRoomStruct2 != null) {
            maskLayer = liveRoomStruct2.maskLayer;
        } else {
            maskLayer = null;
        }
        if (!C51029K0z.LJJIJL(maskLayer, this.LJLJI)) {
            return;
        }
        this.LJLJJL.setValue(Boolean.TRUE);
    }
}
