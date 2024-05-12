package X;

import com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.protection.common.model.FamilyPairingBean;
import com.ss.android.ugc.aweme.compliance.protection.common.model.GuardianRestrictionBean;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* renamed from: X.Xu5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86309Xu5 implements InterfaceC53832LAu {
    public final /* synthetic */ CountDownLatch LJLIL;
    public final /* synthetic */ C34K LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // X.InterfaceC53832LAu
    public final void onSuccess() {
        DoNotDisturbSettings LIZ;
        FamilyPairingBean familyPairingBean;
        GuardianRestrictionBean guardianRestrictionBean;
        DoNotDisturbSettings doNotDisturbSettings;
        Boolean bool;
        GuardianRestrictionBean guardianRestrictionBean2;
        DoNotDisturbSettings LIZLLL = C86308Xu4.LIZLLL();
        if (LIZLLL != null) {
            this.LJLILLLLZI.element = C86305Xu1.LJI(LIZLLL, this.LJLJI);
        }
        FamilyPiaringManager.LIZ.getClass();
        if (FamilyPiaringManager.LIZJ() == EnumC62934Omw.CHILD && (familyPairingBean = FamilyPiaringManager.LIZJ) != null && (guardianRestrictionBean = familyPairingBean.restriction) != null && (doNotDisturbSettings = guardianRestrictionBean.doNotDisturbSettings) != null && (bool = doNotDisturbSettings.pauseNotificationEnabled) != null && bool.booleanValue()) {
            FamilyPairingBean familyPairingBean2 = FamilyPiaringManager.LIZJ;
            if (familyPairingBean2 != null && (guardianRestrictionBean2 = familyPairingBean2.restriction) != null) {
                LIZ = guardianRestrictionBean2.doNotDisturbSettings;
            }
            this.LJLIL.countDown();
        }
        LIZ = C86308Xu4.LIZ();
        if (LIZ != null) {
            this.LJLILLLLZI.element = C86305Xu1.LJI(LIZ, this.LJLJI);
        }
        this.LJLIL.countDown();
    }

    @Override // X.InterfaceC53832LAu
    public final void onFailed(Exception exception) {
        o.LJIIIZ(exception, "exception");
        this.LJLIL.countDown();
    }

    public C86309Xu5(CountDownLatch countDownLatch, C34K c34k, long j) {
        this.LJLIL = countDownLatch;
        this.LJLILLLLZI = c34k;
        this.LJLJI = j;
    }
}
