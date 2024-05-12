package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.viewmodel;

import X.EnumC92073jP;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes2.dex */
public final class ShareVideoPanelViewModel extends ViewModel {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final MutableLiveData<Boolean> LJLIL = new MutableLiveData<>(Boolean.FALSE);

    public static String gv0(int i) {
        if (i == EnumC92073jP.YOURS.getType()) {
            return "quick_share_your";
        }
        if (i == EnumC92073jP.LIKED.getType()) {
            return "quick_share_like";
        }
        if (i == EnumC92073jP.FAVORITE.getType()) {
            return "quick_share_favorite";
        }
        return "";
    }
}
