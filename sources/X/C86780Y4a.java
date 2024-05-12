package X;

import Y.ARunnableS14S0210000_15;
import android.app.Activity;
import com.ss.android.ugc.awemepushapi.mob.PushPermissionStatusEvent;
import com.ss.android.ugc.awemepushlib.experiments.PushPermissionPopupGuideExp;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;
import defpackage.s1;
import kotlin.jvm.internal.o;

/* renamed from: X.Y4a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86780Y4a extends AbstractC61103NyV {
    public final /* synthetic */ PushPermissionStatusEvent LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ Activity LIZLLL;
    public final /* synthetic */ PushPermissionPopupManager LJ;

    @Override // X.AbstractC61103NyV
    public final void LIZIZ(C61101NyT c61101NyT, C164906da... permissionsStatus) {
        IME ime;
        IMT imt;
        Activity LJIIIIZZ;
        String str;
        o.LJIIIZ(permissionsStatus, "permissionsStatus");
        PushPermissionStatusEvent pushPermissionStatusEvent = this.LIZIZ;
        PushPermissionPopupGuideExp pushPermissionPopupGuideExp = PushPermissionPopupGuideExp.INSTANCE;
        if (pushPermissionPopupGuideExp.withGuideAndMask()) {
            ime = IME.DIGITAL_1;
        } else {
            ime = IME.DIGITAL_0;
        }
        pushPermissionStatusEvent.LJII(ime);
        PushPermissionStatusEvent pushPermissionStatusEvent2 = this.LIZIZ;
        if (s1.LIZLLL("isFirstInstallAndFirstLaunch()")) {
            imt = IMT.DIGITAL_1;
        } else {
            imt = IMT.DIGITAL_2;
        }
        pushPermissionStatusEvent2.LJIIJ(imt);
        int i = UF1.LIZ[permissionsStatus[0].LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.LIZIZ.LJIIIZ(EnumC86786Y4g.DENIED_PERMANENT);
                C221018lt.LIZ("PushPermissionPopup", "PowerPermissions() - intercept - DENIED_PERMANENT");
                PushPermissionPopupManager pushPermissionPopupManager = this.LJ;
                ARunnableS14S0210000_15 aRunnableS14S0210000_15 = new ARunnableS14S0210000_15(pushPermissionPopupManager, this.LIZLLL, this.LIZJ, 4);
                pushPermissionPopupManager.LIZIZ = aRunnableS14S0210000_15;
                C37179EiV.LIZ().postDelayed(aRunnableS14S0210000_15, 700L);
                if (c61101NyT == null) {
                    return;
                }
                c61101NyT.LIZIZ();
                return;
            }
            this.LIZIZ.LJIIIZ(EnumC86786Y4g.THIS_OPERATION_NOT_PERMITTED);
            C221018lt.LIZ("PushPermissionPopup", "PowerPermissions() - intercept - THIS_OPERATION_NOT_PERMITTED");
            if (this.LIZJ) {
                LJIIIIZZ = this.LIZLLL;
            } else {
                LJIIIIZZ = C84763XOl.LJIIIIZZ();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("showExplanationBeforePermission(useCtx: ");
            LIZ.append(this.LIZJ);
            LIZ.append(", ctx: ");
            Activity activity = this.LIZLLL;
            String str2 = null;
            if (activity != null) {
                str = activity.getLocalClassName();
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append(", current: ");
            Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ2 != null) {
                str2 = LJIIIIZZ2.getLocalClassName();
            }
            LIZ.append(str2);
            LIZ.append(')');
            C221018lt.LIZ("PushPermissionPopup", X1D.LIZIZ(LIZ));
            if (LJIIIIZZ != null) {
                this.LJ.LJIIIZ(LJIIIIZZ, true ^ pushPermissionPopupGuideExp.withGuideAndMask());
            }
            if (c61101NyT == null) {
                return;
            }
            c61101NyT.LIZIZ();
            return;
        }
        this.LIZIZ.LJIIIZ(EnumC86786Y4g.GRANTED);
        C221018lt.LIZ("PushPermissionPopup", "PowerPermissions() - intercept - Already GRANTED");
        if (c61101NyT == null) {
            return;
        }
        c61101NyT.LIZ();
    }

    public C86780Y4a(PushPermissionStatusEvent pushPermissionStatusEvent, boolean z, Activity activity, PushPermissionPopupManager pushPermissionPopupManager) {
        this.LIZIZ = pushPermissionStatusEvent;
        this.LIZJ = z;
        this.LIZLLL = activity;
        this.LJ = pushPermissionPopupManager;
    }
}
