package X;

import android.app.Activity;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import com.ss.android.ugc.awemepushapi.mob.PushPermissionStatusEvent;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;
import com.ss.android.ugc.localnotify.work.NonLoginNotifyWork;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y4Y implements InterfaceC61107NyZ {
    public final /* synthetic */ PushPermissionStatusEvent LIZ;
    public final /* synthetic */ NonLoginNotifyWork LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ Activity LIZLLL;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        int i = C76850UEc.LIZ[results[0].LIZIZ.ordinal()];
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
            this.LIZIZ.getClass();
            NonLoginNotifyWork.LJIIIIZZ();
        }
        PushPermissionStatusEvent pushPermissionStatusEvent = this.LIZ;
        pushPermissionStatusEvent.LIZLLL(Integer.valueOf((int) (System.currentTimeMillis() - this.LIZJ)), "timestamp_diff");
        IPushPermissionApi LJII = PushPermissionPopupManager.LJII();
        Activity topActivity = this.LIZLLL;
        o.LJIIIIZZ(topActivity, "topActivity");
        pushPermissionStatusEvent.LIZLLL(Integer.valueOf(LJII.LJI(topActivity)), "pop_up_count");
        pushPermissionStatusEvent.LJFF();
    }

    public Y4Y(PushPermissionStatusEvent pushPermissionStatusEvent, NonLoginNotifyWork nonLoginNotifyWork, long j, long j2, Activity activity) {
        this.LIZ = pushPermissionStatusEvent;
        this.LIZIZ = nonLoginNotifyWork;
        this.LIZJ = j2;
        this.LIZLLL = activity;
    }
}
