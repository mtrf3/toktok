package X;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.homepage.api.data.InboxFollowGuideViewModel;

/* renamed from: X.MLw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC56668MLw implements Runnable {
    public final /* synthetic */ C56671MLz LJLIL;
    public final /* synthetic */ HomeTabAbility LJLILLLLZI;
    public final /* synthetic */ C56669MLx LJLJI;

    public RunnableC56668MLw(C56671MLz c56671MLz, HomeTabAbility homeTabAbility, C56669MLx c56669MLx) {
        this.LJLIL = c56671MLz;
        this.LJLILLLLZI = homeTabAbility;
        this.LJLJI = c56669MLx;
    }

    public final void LIZ() {
        MutableLiveData<Boolean> mutableLiveData;
        C56671MLz c56671MLz = this.LJLIL;
        if (!c56671MLz.LJZI) {
            InboxFollowGuideViewModel inboxFollowGuideViewModel = c56671MLz.LJZ;
            if (inboxFollowGuideViewModel != null && (mutableLiveData = inboxFollowGuideViewModel.LJLJI) != null) {
                mutableLiveData.setValue(Boolean.TRUE);
            }
            this.LJLILLLLZI.Q6(this.LJLJI);
            HomeTabAbility homeTabAbility = this.LJLILLLLZI;
            Bundle bundle = new Bundle();
            bundle.putBoolean("isSmoothScroll", true);
            homeTabAbility.lZ(bundle, "Following");
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
