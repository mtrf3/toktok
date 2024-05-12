package X;

import Y.AfS57S0100000_5;
import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.giftlimitnotification.api.GiftLimitNotificationApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BEA {
    public static boolean LJFF;
    public static boolean LJI;
    public static long LJII;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static String LJIIJJI;
    public static String LJIIL;
    public static List<Integer> LJIILJJIL;
    public static boolean LJIILL;
    public static boolean LJJIIJ;
    public static final MutableLiveData<Integer> LJJIIJZLJL;
    public static final MutableLiveData<Boolean> LJJIIZ;
    public static String LJJIIZI;
    public static String LJJIJ;
    public static DataChannel LJJIJIIJI;
    public static final Handler LJJIJIIJIL;
    public static final BEB LJJIJIL;
    public static final BEA LIZ = new BEA();
    public static final String LIZIZ = BEA.class.getName();
    public static boolean LIZJ = true;
    public static boolean LIZLLL = true;
    public static boolean LJ = true;
    public static int LJIIJ = 7;
    public static String LJIILIIL = "";
    public static float LJIILLIIL = 1.0f;
    public static String LJIIZILJ = "";
    public static String LJIJ = "";
    public static int LJIJI = -1;
    public static int LJIJJ = -1;
    public static String LJIJJLI = "";
    public static int LJIL = -1;
    public static final MutableLiveData<Integer> LJJ = new MutableLiveData<>(-1);
    public static String LJJI = "";
    public static String LJJIFFI = "";
    public static boolean LJJII = true;
    public static String LJJIII = "";

    static {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.postValue(0);
        LJJIIJZLJL = mutableLiveData;
        LJJIIZ = new MutableLiveData<>(null);
        LJJIIZI = "";
        LJJIJ = "";
        LJJIJIIJIL = new Handler(C16880lQ.LLJJJJ());
        LJJIJIL = BEB.LJLIL;
    }

    public static Integer LIZ() {
        if (o.LJ(LJIJJLI, "COIN")) {
            Integer value = LJJ.getValue();
            if (value == null) {
                value = 0;
            }
            return Integer.valueOf((int) (value.intValue() * LJIILLIIL));
        }
        return LJJ.getValue();
    }

    public static int LIZIZ() {
        int i = LJIJI;
        int i2 = LJIJJ;
        if (i > i2) {
            return i;
        }
        return i2;
    }

    public static boolean LJ() {
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null && room.getOwnerUserId() == ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            return true;
        }
        return false;
    }

    public static boolean LJII() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Integer value = LJJIIJZLJL.getValue();
        if (value == null || value.intValue() != 1) {
            z = false;
        } else {
            z = true;
        }
        Integer value2 = LJJ.getValue();
        if (value2 == null || value2.intValue() != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (LJJIII.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (LJIJJ == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z && !z2 && !z3 && !z4) {
            return false;
        }
        return true;
    }

    public final void LIZLLL() {
        LJJIIZ.setValue(null);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            String str = LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("room===>");
            LIZ2.append(room);
            LIZ2.append(" roomId====>");
            LIZ2.append(room.getId());
            C0NB.LIZIZ(str, X1D.LIZIZ(LIZ2));
            C1EW.LIZ(((GiftLimitNotificationApi) Q7L.LIZIZ(GiftLimitNotificationApi.class)).giftLimitNotificationInitial(room.getId())).LJJJLIIL(new AfS57S0100000_5(this, 258), new AfS57S0100000_5(this, 259));
        }
    }

    public static boolean LIZJ() {
        boolean z;
        if (SystemClock.uptimeMillis() - LJII <= 2000) {
            z = true;
        } else {
            z = false;
        }
        LJI = z;
        String str = LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("isTrayExited===>");
        LIZ2.append(LIZJ);
        LIZ2.append("\nisGiftPanelDismissed===>");
        LIZ2.append(LIZLLL);
        LIZ2.append("\nisTreasureBoxPanelDismissed===>");
        LIZ2.append(LJ);
        LIZ2.append("\nisCombo===>");
        LIZ2.append(LJI);
        LIZ2.append("\n ReachedLimit===>");
        C19U.LIZJ(LIZ2, LJFF, LIZ2, str);
        if (!LIZJ || !LIZLLL || !LJ || LJI || !LJFF) {
            return false;
        }
        return true;
    }

    public static void LJI(int i) {
        switch (i) {
            case -4:
                LJFF = false;
                return;
            case -3:
                LJ = false;
                return;
            case -2:
                LIZLLL = false;
                return;
            case -1:
                LIZJ = false;
                return;
            case 0:
            default:
                return;
            case 1:
                LIZJ = true;
                return;
            case 2:
                LIZLLL = true;
                return;
            case 3:
                LJ = true;
                return;
            case 4:
                LJFF = true;
                return;
        }
    }

    public final void LJFF(int i, Integer num, int i2, String str, boolean z, BE7 callBack) {
        Integer num2;
        o.LJIIIZ(callBack, "callBack");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (num == null) {
            num2 = LJJ.getValue();
            if (num2 == null) {
                return;
            }
        } else {
            num2 = num;
        }
        if (room != null) {
            C1EW.LIZ(((GiftLimitNotificationApi) Q7L.LIZIZ(GiftLimitNotificationApi.class)).giftLimitNotificationSetLimit(room.getId(), i, num2.intValue(), LJIJ)).LJJJLIIL(new BE8(i, this, num, i2, str, z, callBack), new AfS57S0100000_5(callBack, 260));
        }
    }
}
