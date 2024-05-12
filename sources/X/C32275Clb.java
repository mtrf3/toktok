package X;

import Y.ARunnableS41S0100000_5;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelCacheOptSettings;
import defpackage.b1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Clb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32275Clb {
    public static final C5H3<AbstractC73946T0k> LIZJ = C78996UzQ.LJJIJIIJI(C32300Cm0.LJLIL);
    public boolean LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 302));

    public final void LIZ(boolean z) {
        if (this.LIZ) {
            if (z) {
                UW7 uw7 = GiftManager.inst().giftRepository;
                o.LJIIIIZZ(uw7, "inst().giftRepository");
                uw7.LIZ(9, 0L, null, "", false);
                this.LIZ = false;
                LIZJ.getValue().LIZJ(new ARunnableS41S0100000_5(this, 221), LiveGiftPanelCacheOptSettings.INSTANCE.nextFetchDelay(), TimeUnit.SECONDS);
            }
            if (!C32296Clw.LIZ) {
                C32296Clw.LIZIZ = z;
                C32296Clw.LIZ = true;
                return;
            }
            if (!C32296Clw.LIZJ) {
                if (C32296Clw.LIZIZ) {
                    C32296Clw.LJ++;
                } else {
                    C32296Clw.LJI++;
                }
            } else if (C32296Clw.LIZIZ) {
                C32296Clw.LIZLLL++;
            } else {
                C32296Clw.LJFF++;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("giftPanelPredictionFPCnt == ");
            LIZ.append(C32296Clw.LJ);
            LIZ.append(", giftPanelPredictionTNCnt == ");
            LIZ.append(C32296Clw.LJI);
            LIZ.append(", giftPanelPredictionTPCnt == ");
            LIZ.append(C32296Clw.LIZLLL);
            LIZ.append(", giftPanelPredictionFNCnt == ");
            b1.LJ(LIZ, C32296Clw.LJFF, LIZ, "LiveGiftClientAIMonitor");
            C32296Clw.LIZIZ = z;
            C32296Clw.LIZJ = false;
        }
    }
}
