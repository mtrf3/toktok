package X;

import Y.ARunnableS14S0210000_15;
import Y.ARunnableS51S0100000_15;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.awemepushapi.mob.PushPermissionStatusEvent;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y4Z implements InterfaceC61107NyZ {
    public final /* synthetic */ PushPermissionPopupManager LIZ;
    public final /* synthetic */ PushPermissionStatusEvent LIZIZ;
    public final /* synthetic */ long LIZJ;
    public final /* synthetic */ Activity LIZLLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        WeakReference<C26231ARf> weakReference;
        C26231ARf c26231ARf;
        o.LJIIIZ(results, "results");
        ARunnableS14S0210000_15 aRunnableS14S0210000_15 = this.LIZ.LIZIZ;
        if (aRunnableS14S0210000_15 != null) {
            C37179EiV.LIZ().removeCallbacks(aRunnableS14S0210000_15);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PowerPermissions() - onResult(");
        LIZ.append(results[0].LIZIZ);
        LIZ.append(')');
        C221018lt.LIZ("PushPermissionPopup", X1D.LIZIZ(LIZ));
        Context LLLLL = C16880lQ.LLLLL(EF7.LIZIZ());
        int i = C76870UEw.LIZ[results[0].LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LIZIZ.LJI(EnumC46482IMc.DO_NOT_ALLOW);
                    this.LIZIZ.LJIIIIZZ(EnumC86785Y4f.DENIED_PERMANENT);
                }
            } else {
                this.LIZIZ.LJI(EnumC46482IMc.DO_NOT_ALLOW);
                this.LIZIZ.LJIIIIZZ(EnumC86785Y4f.THIS_OPERATION_NOT_PERMITTED);
            }
        } else {
            this.LIZIZ.LJI(EnumC46482IMc.ALLOW);
            this.LIZIZ.LJIIIIZZ(EnumC86785Y4f.GRANTED);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("NotificationsHelper.tryDismissOptInDialog() - hasPermission");
            LIZ2.append(C40322Fs6.LIZJ(LLLLL));
            C221018lt.LIZ("PushPermissionPopup", X1D.LIZIZ(LIZ2));
            if (C40322Fs6.LIZJ(LLLLL) && (weakReference = C85962XoU.LIZ) != null && (c26231ARf = weakReference.get()) != null) {
                C221018lt.LIZ("PushPermissionPopup", "NotificationsHelper.tryDismissOptInDialog() - not null. Dismiss())");
                c26231ARf.LIZIZ(null);
            }
        }
        PushPermissionStatusEvent pushPermissionStatusEvent = this.LIZIZ;
        pushPermissionStatusEvent.LIZLLL(Integer.valueOf((int) (System.currentTimeMillis() - this.LIZJ)), "timestamp_diff");
        pushPermissionStatusEvent.LIZLLL(Integer.valueOf(DJA.LIZ().getInt("system_push_permission_popup_show_count", 0)), "pop_up_count");
        pushPermissionStatusEvent.LJFF();
        PushPermissionPopupManager pushPermissionPopupManager = this.LIZ;
        Activity activity = this.LIZLLL;
        pushPermissionPopupManager.getClass();
        activity.runOnUiThread(new ARunnableS51S0100000_15(pushPermissionPopupManager, 2));
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public Y4Z(PushPermissionPopupManager pushPermissionPopupManager, PushPermissionStatusEvent pushPermissionStatusEvent, long j, Activity activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = pushPermissionPopupManager;
        this.LIZIZ = pushPermissionStatusEvent;
        this.LIZJ = j;
        this.LIZLLL = activity;
        this.LJ = interfaceC65784Pro;
    }
}
