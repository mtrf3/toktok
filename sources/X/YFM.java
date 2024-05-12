package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YFM implements YFN {
    public static final YFM LIZIZ = new YFM();
    public final /* synthetic */ YFN LIZ = C87030YDq.LIZIZ.bridgeService();

    @Override // X.YFN
    public final void checkToTransformMusDraft() {
        this.LIZ.checkToTransformMusDraft();
    }

    @Override // X.YFN
    public final YFI createAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return this.LIZ.createAwemeListFragment(i, i2, str, str2, true, true, false, z4);
    }

    @Override // X.YFN
    public final AmeBaseFragment createMyProfileFragment() {
        return this.LIZ.createMyProfileFragment();
    }

    @Override // X.YFN
    public final InterfaceC59605NaL getBulletABHelper() {
        return this.LIZ.getBulletABHelper();
    }

    @Override // X.YFN
    public final boolean needShowSafeInfoNotice() {
        return this.LIZ.needShowSafeInfoNotice();
    }

    @Override // X.YFN
    public final void onFeedStop() {
        this.LIZ.onFeedStop();
    }

    @Override // X.YFN
    public final void postSafeInfoNoticeEvent(boolean z) {
        this.LIZ.postSafeInfoNoticeEvent(z);
    }

    @Override // X.YFN
    public final void startThirdSocialActivity(Context context, OP0 idProvider, int i) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(idProvider, "idProvider");
        this.LIZ.startThirdSocialActivity(context, idProvider, i);
    }

    @Override // X.YFN
    public final void switchToBioUrl(Activity activity, String str) {
        this.LIZ.switchToBioUrl(activity, str);
    }
}
