package X;

import android.app.Activity;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.ss.android.ugc.awemepushapi.mob.PushPermissionStatusEvent;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Y4b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86781Y4b extends AbstractC61103NyV {
    public final /* synthetic */ PushPermissionStatusEvent LIZIZ;
    public final /* synthetic */ Activity LIZJ;

    public C86781Y4b(PushPermissionStatusEvent pushPermissionStatusEvent, Activity activity) {
        this.LIZIZ = pushPermissionStatusEvent;
        this.LIZJ = activity;
    }

    @Override // X.AbstractC61103NyV
    public final void LIZIZ(C61101NyT c61101NyT, C164906da... permissionsStatus) {
        o.LJIIIZ(permissionsStatus, "permissionsStatus");
        this.LIZIZ.LJII(IME.DIGITAL_0);
        this.LIZIZ.LJIIJ(IMT.DIGITAL_0);
        int i = C76849UEb.LIZ[permissionsStatus[0].LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                C221018lt.LIZ("PushPermissionPopup", "NonLoginNotifyWork.tryNotify() - intercept - DENIED_PERMANENT");
                this.LIZIZ.LJIIIZ(EnumC86786Y4g.DENIED_PERMANENT);
                IPushPermissionApi LJII = PushPermissionPopupManager.LJII();
                Activity topActivity = this.LIZJ;
                o.LJIIIIZZ(topActivity, "topActivity");
                LJII.LIZIZ(topActivity);
                if (c61101NyT == null) {
                    return;
                }
                c61101NyT.LIZIZ();
                return;
            }
            C221018lt.LIZ("PushPermissionPopup", "NonLoginNotifyWork.tryNotify() - intercept - THIS_OPERATION_NOT_PERMITTED");
            this.LIZIZ.LJIIIZ(EnumC86786Y4g.THIS_OPERATION_NOT_PERMITTED);
            IPushPermissionApi LJII2 = PushPermissionPopupManager.LJII();
            Activity topActivity2 = this.LIZJ;
            o.LJIIIIZZ(topActivity2, "topActivity");
            LJII2.LIZIZ(topActivity2);
            if (c61101NyT == null) {
                return;
            }
            c61101NyT.LIZIZ();
            return;
        }
        C221018lt.LIZ("PushPermissionPopup", "NonLoginNotifyWork.tryNotify() - intercept - Already GRANTED");
        this.LIZIZ.LJIIIZ(EnumC86786Y4g.GRANTED);
        if (c61101NyT == null) {
            return;
        }
        c61101NyT.LIZ();
    }
}
