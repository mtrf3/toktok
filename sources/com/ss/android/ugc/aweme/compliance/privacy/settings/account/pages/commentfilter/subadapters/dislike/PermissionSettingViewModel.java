package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike;

import X.C63025OoP;
import X.C71945SLl;
import X.X1D;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.keva.Keva;

/* loaded from: classes13.dex */
public final class PermissionSettingViewModel extends ViewModel {
    public final PermissionSettingItemViewModel LJLIL;
    public final PermissionSettingItemViewModel LJLILLLLZI;
    public final PermissionSettingItemViewModel LJLJI;

    public PermissionSettingViewModel() {
        PermissionSettingItemViewModel permissionSettingItemViewModel = new PermissionSettingItemViewModel("comment_dislike_filter_offensive");
        MutableLiveData<Integer> mutableLiveData = permissionSettingItemViewModel.LJLJI;
        Keva keva = C63025OoP.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("comment_dislike_filter_offensive_");
        LIZ.append(C71945SLl.LIZIZ());
        mutableLiveData.setValue(Integer.valueOf(keva.getInt(X1D.LIZIZ(LIZ), 0)));
        this.LJLIL = permissionSettingItemViewModel;
        PermissionSettingItemViewModel permissionSettingItemViewModel2 = new PermissionSettingItemViewModel("comment_dislike_filter_spam");
        MutableLiveData<Integer> mutableLiveData2 = permissionSettingItemViewModel2.LJLJI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("comment_dislike_filter_spam_");
        LIZ2.append(C71945SLl.LIZIZ());
        mutableLiveData2.setValue(Integer.valueOf(keva.getInt(X1D.LIZIZ(LIZ2), 0)));
        this.LJLILLLLZI = permissionSettingItemViewModel2;
        PermissionSettingItemViewModel permissionSettingItemViewModel3 = new PermissionSettingItemViewModel("comment_dislike_filter_profanity");
        MutableLiveData<Integer> mutableLiveData3 = permissionSettingItemViewModel3.LJLJI;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("comment_dislike_filter_profanity_");
        LIZ3.append(C71945SLl.LIZIZ());
        mutableLiveData3.setValue(Integer.valueOf(keva.getInt(X1D.LIZIZ(LIZ3), 0)));
        this.LJLJI = permissionSettingItemViewModel3;
    }
}
