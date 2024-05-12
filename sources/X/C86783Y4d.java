package X;

import android.app.Activity;
import com.ss.android.ugc.awemepushapi.mob.PushPermissionStatusEvent;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;

/* renamed from: X.Y4d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86783Y4d extends AbstractC61103NyV {
    public final /* synthetic */ PushPermissionStatusEvent LIZIZ;
    public final /* synthetic */ Activity LIZJ;

    public C86783Y4d(PushPermissionStatusEvent pushPermissionStatusEvent, Activity activity) {
        this.LIZIZ = pushPermissionStatusEvent;
        this.LIZJ = activity;
    }

    @Override // X.AbstractC61103NyV
    public final void LIZIZ(C61101NyT c61101NyT, C164906da... c164906daArr) {
        this.LIZIZ.LJII(IME.DIGITAL_0);
        this.LIZIZ.LJIIJ(IMT.DIGITAL_0);
        int i = UF3.LIZ[c164906daArr[0].LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.LIZIZ.LJIIIZ(EnumC86786Y4g.DENIED_PERMANENT);
                PushPermissionPopupManager.LJII().LIZIZ(this.LIZJ);
                c61101NyT.LIZIZ();
                return;
            }
            this.LIZIZ.LJIIIZ(EnumC86786Y4g.THIS_OPERATION_NOT_PERMITTED);
            PushPermissionPopupManager.LJII().LIZIZ(this.LIZJ);
            c61101NyT.LIZIZ();
            return;
        }
        this.LIZIZ.LJIIIZ(EnumC86786Y4g.GRANTED);
        c61101NyT.LIZ();
    }
}
