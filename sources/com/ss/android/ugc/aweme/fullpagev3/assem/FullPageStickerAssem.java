package com.ss.android.ugc.aweme.fullpagev3.assem;

import Y.AObserverS71S0100000_3;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class FullPageStickerAssem extends BaseFullPageAssem {
    public FullPageStickerAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        MutableLiveData<Boolean> mutableLiveData;
        super.onCreateView();
        PostModeContainerViewModel v3 = v3();
        if (v3 != null && (mutableLiveData = v3.LLIIJI) != null) {
            mutableLiveData.observe(this, new AObserverS71S0100000_3(this, 25));
        }
    }
}
