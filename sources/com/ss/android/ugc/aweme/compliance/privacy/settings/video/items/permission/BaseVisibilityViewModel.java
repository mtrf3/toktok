package com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission;

import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public abstract class BaseVisibilityViewModel extends BaseVideoPrivacySettingViewModel {
    public boolean LJLJL;
    public WeakReference<Activity> LJLJLJ;
    public final MutableLiveData<Integer> LJLJLLL;

    public BaseVisibilityViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(-1);
        this.LJLJLLL = mutableLiveData;
    }
}
