package X;

import Y.IDUListenerS263S0100000;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGiftTrayPublicScreenTranslateSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import kotlin.jvm.internal.o;

/* renamed from: X.20q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C515620q extends AbstractC42751m3 {
    public boolean LJLJJI;

    public final void LIZLLL() {
        if (this.LJLJJI) {
            this.LJLJJI = false;
            LIZ().cancel();
            LIZ().removeAllUpdateListeners();
            C16880lQ.LJLJL(LIZ());
            LIZ().setFloatValues(0.0f, 1.0f);
            LIZ().addUpdateListener(new IDUListenerS263S0100000(this, 25));
            LIZ().start();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void onDispose() {
        super.onDispose();
        LIZ().cancel();
        ConstraintProperty LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.alpha(1.0f);
        }
    }

    public C515620q(C1O4 c1o4) {
        super(C12960f6.LJ, c1o4);
    }

    public boolean LIZJ(C006900z dialogStatus) {
        o.LJIIIZ(dialogStatus, "dialogStatus");
        return LiveGiftTrayPublicScreenTranslateSetting.INSTANCE.canCommonWidgetsAlphaXfer(dialogStatus.LIZ.LIZLLL);
    }

    @Override // androidx.lifecycle.Observer
    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public void onChanged(C006900z dialogStatus) {
        o.LJIIIZ(dialogStatus, "dialogStatus");
        if (LIZJ(dialogStatus)) {
            if (dialogStatus.LIZ.LIZ) {
                if (!this.LJLJJI) {
                    this.LJLJJI = true;
                    LIZ().cancel();
                    LIZ().removeAllUpdateListeners();
                    C16880lQ.LJLJL(LIZ());
                    LIZ().setFloatValues(1.0f, 0.0f);
                    LIZ().addUpdateListener(new IDUListenerS263S0100000(this, 26));
                    LIZ().start();
                    return;
                }
                return;
            }
            if (!this.LJLJJI) {
                return;
            }
            C29602Bja c29602Bja = dialogStatus.LIZIZ;
            if (c29602Bja == null) {
                LIZLLL();
            } else {
                if (LiveGiftTrayPublicScreenTranslateSetting.INSTANCE.canCommonWidgetsAlphaXfer(c29602Bja.LIZLLL)) {
                    return;
                }
                LIZLLL();
            }
        }
    }

    public C515620q(int i, C1O4 c1o4) {
        super(i, c1o4);
    }
}
