package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;

/* loaded from: classes16.dex */
public interface YFN {
    void checkToTransformMusDraft();

    YFI createAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4);

    AmeBaseFragment createMyProfileFragment();

    InterfaceC59605NaL getBulletABHelper();

    boolean needShowSafeInfoNotice();

    void onFeedStop();

    void postSafeInfoNoticeEvent(boolean z);

    void startThirdSocialActivity(Context context, OP0 op0, int i);

    void switchToBioUrl(Activity activity, String str);
}
