package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.homeobserver.SocialActivityAssem;

/* loaded from: classes10.dex */
public final class LVW implements InterfaceC85967XoZ {
    public final /* synthetic */ SocialActivityAssem LIZ;
    public final /* synthetic */ Activity LIZIZ;

    public LVW(SocialActivityAssem socialActivityAssem, Activity activity) {
        this.LIZ = socialActivityAssem;
        this.LIZIZ = activity;
    }

    @Override // X.InterfaceC85967XoZ
    public final void onCancel() {
        C221018lt.LIZ("PushPermissionPopup", "SocialActivityAssem.checkNotification back");
        this.LIZ.x3(this.LIZIZ);
    }
}
