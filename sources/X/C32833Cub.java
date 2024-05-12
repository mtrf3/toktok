package X;

import Y.IDxS75S0000000_5;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.gift.model.CalmDownInfo;
import com.bytedance.android.livesdk.limitation.dialog.GiftLimitDialog;
import defpackage.a1;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Cub, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32833Cub {
    public static long LIZ;
    public static long LIZIZ;
    public static WeakReference<InterfaceC92693kP> LIZJ;
    public static EnumC35442Dva LIZLLL = EnumC35442Dva.Idle;

    public static void LIZ() {
        InterfaceC92693kP interfaceC92693kP;
        LIZLLL = EnumC35442Dva.Idle;
        LIZ = 0L;
        WeakReference<InterfaceC92693kP> weakReference = LIZJ;
        if (weakReference != null && (interfaceC92693kP = weakReference.get()) != null) {
            interfaceC92693kP.dispose();
        }
    }

    public static String LIZIZ() {
        String LIZIZ2;
        String LIZIZ3;
        long j = LIZ;
        if (j > 0) {
            int i = (int) (j / 1000);
            int i2 = i / 60;
            int i3 = i % 60;
            if (i2 >= 10) {
                LIZIZ2 = String.valueOf(i2);
            } else {
                LIZIZ2 = C169696lJ.LIZIZ('0', i2);
            }
            if (i3 >= 10) {
                LIZIZ3 = String.valueOf(i3);
            } else {
                LIZIZ3 = C169696lJ.LIZIZ('0', i3);
            }
            return a1.LJ(LIZIZ2, " : ", LIZIZ3);
        }
        return "";
    }

    public static String LIZJ(CalmDownInfo calmDownInfo) {
        String LIZIZ2;
        String LIZIZ3;
        o.LJIIIZ(calmDownInfo, "calmDownInfo");
        int i = calmDownInfo.mRemainTime;
        int i2 = i / 60;
        int i3 = i % 60;
        if (i2 >= 10) {
            LIZIZ2 = String.valueOf(i2);
        } else {
            LIZIZ2 = C169696lJ.LIZIZ('0', i2);
        }
        if (i3 >= 10) {
            LIZIZ3 = String.valueOf(i3);
        } else {
            LIZIZ3 = C169696lJ.LIZIZ('0', i3);
        }
        return C00F.LIZIZ(LIZIZ2, ':', LIZIZ3);
    }

    public static void LIZLLL(CalmDownInfo calmDownInfo, FragmentManager fragmentManager) {
        o.LJIIIZ(calmDownInfo, "calmDownInfo");
        long j = calmDownInfo.mRemainTime;
        long j2 = calmDownInfo.mThresholdValue;
        int i = calmDownInfo.mTotalTime / 60;
        GiftLimitDialog giftLimitDialog = new GiftLimitDialog();
        giftLimitDialog.LJLJJI = j2;
        giftLimitDialog.LJLJJL = i;
        giftLimitDialog.LJLJJLL = j;
        giftLimitDialog.show(fragmentManager, "GiftLimitDialog");
    }

    public static void LJ(EnumC35442Dva countdownType, long j) {
        o.LJIIIZ(countdownType, "countdownType");
        LIZ();
        LIZLLL = countdownType;
        LIZIZ = j;
        if (j <= 0) {
            return;
        }
        AbstractC73672Svk.LJJIIZI(0L, 1L, TimeUnit.SECONDS).LJJLIIIJ((LIZIZ / 1000) + 1).LJJIJL(C35485DwH.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS75S0000000_5(0));
    }
}
