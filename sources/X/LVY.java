package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.homeobserver.SocialActivityAssem;

/* loaded from: classes10.dex */
public final class LVY implements InterfaceC86787Y4h {
    public final /* synthetic */ SocialActivityAssem LIZ;
    public final /* synthetic */ Activity LIZIZ;

    @Override // X.InterfaceC86787Y4h
    public final void LIZ() {
        C221018lt.LIZ("PushPermissionPopup", "SocialActivityAssem - TryShowPermissionPopupListener.notShownBack()");
        this.LIZ.v3(this.LIZIZ);
    }

    @Override // X.InterfaceC86787Y4h
    public final void LIZIZ() {
        C221018lt.LIZ("PushPermissionPopup", "SocialActivityAssem - TryShowPermissionPopupListener.onShownBack()");
        C2U8.LIZ(new C2KZ());
        this.LIZ.x3(this.LIZIZ);
    }

    public LVY(SocialActivityAssem socialActivityAssem, Activity activity) {
        this.LIZ = socialActivityAssem;
        this.LIZIZ = activity;
    }
}
