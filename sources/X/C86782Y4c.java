package X;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.awemepushapi.mob.PushPermissionStatusEvent;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;

/* renamed from: X.Y4c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86782Y4c implements InterfaceC61107NyZ {
    public final /* synthetic */ PushPermissionStatusEvent LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ C67230Qa2 LIZJ;
    public final /* synthetic */ Bitmap LIZLLL;
    public final /* synthetic */ Bitmap LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ Notification LJI;
    public final /* synthetic */ long LJII;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... c164906daArr) {
        int i = UF3.LIZ[c164906daArr[0].LIZIZ.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LIZ.LJI(EnumC46482IMc.DO_NOT_ALLOW);
                    this.LIZ.LJIIIIZZ(EnumC86785Y4f.DENIED_PERMANENT);
                }
            } else {
                this.LIZ.LJI(EnumC46482IMc.DO_NOT_ALLOW);
                this.LIZ.LJIIIIZZ(EnumC86785Y4f.THIS_OPERATION_NOT_PERMITTED);
            }
        } else {
            this.LIZ.LJI(EnumC46482IMc.ALLOW);
            this.LIZ.LJIIIIZZ(EnumC86785Y4f.GRANTED);
            Context context = this.LIZIZ;
            C67230Qa2 c67230Qa2 = this.LIZJ;
            if (this.LIZLLL == null && this.LJ == null) {
                z = false;
            }
            MessageShowHandler.LJII(context, c67230Qa2, z, this.LJFF, this.LJI);
        }
        PushPermissionStatusEvent pushPermissionStatusEvent = this.LIZ;
        pushPermissionStatusEvent.LIZLLL(Integer.valueOf((int) (System.currentTimeMillis() - this.LJII)), "timestamp_diff");
        pushPermissionStatusEvent.LIZLLL(Integer.valueOf(DJA.LIZ().getInt("system_push_permission_popup_show_count", 0)), "pop_up_count");
        pushPermissionStatusEvent.LJFF();
    }

    public C86782Y4c(PushPermissionStatusEvent pushPermissionStatusEvent, Context context, C67230Qa2 c67230Qa2, Bitmap bitmap, Bitmap bitmap2, int i, Notification notification, long j) {
        this.LIZ = pushPermissionStatusEvent;
        this.LIZIZ = context;
        this.LIZJ = c67230Qa2;
        this.LIZLLL = bitmap;
        this.LJ = bitmap2;
        this.LJFF = i;
        this.LJI = notification;
        this.LJII = j;
    }
}
