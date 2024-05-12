package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterEducationSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Crn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32659Crn {
    public static boolean LIZ() {
        return o.LJ(Boolean.TRUE, InterfaceC30442Bx8.P1.LIZ());
    }

    public static boolean LIZJ() {
        LiveGiftNewGifterEducationSetting.NewGifterConfig value;
        LiveGiftNewGifterEducationSetting liveGiftNewGifterEducationSetting = LiveGiftNewGifterEducationSetting.INSTANCE;
        LiveGiftNewGifterEducationSetting.NewGifterConfig value2 = liveGiftNewGifterEducationSetting.getValue();
        if ((value2 == null || value2.speedGiftPopupStyle != EnumC32660Cro.GROUP_1.getValue()) && ((value = liveGiftNewGifterEducationSetting.getValue()) == null || value.speedGiftPopupStyle != EnumC32660Cro.GROUP_2.getValue())) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(long j) {
        boolean z;
        boolean LIZIZ = C76906UGg.LIZIZ(j);
        LiveGiftNewGifterEducationSetting.NewGifterConfig value = LiveGiftNewGifterEducationSetting.INSTANCE.getValue();
        if (value != null && value.speedGiftPopupLogicOptEnable) {
            z = true;
        } else {
            z = false;
        }
        boolean LIZJ = LIZJ();
        StringBuilder LIZLLL = C00F.LIZLLL("Values: isLocalFirstGift = ", LIZIZ, " isNewFlowEnable = ", z, " isFirstGiftHistory = ");
        LIZLLL.append(LIZ());
        LIZLLL.append(" isNewStyleUI = ");
        LIZLLL.append(LIZJ);
        C0NB.LJIIIZ("NewGifter", X1D.LIZIZ(LIZLLL));
        if (LIZIZ && z && LIZ() && LIZJ) {
            return true;
        }
        return false;
    }
}
