package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.roomfunction.LowAgeAnchorLimitSetting;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes9.dex */
public final class IVZ {
    public static final java.util.Map<String, Integer> LIZ;

    public static boolean LIZLLL() {
        boolean z;
        IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIMandatoryLoginServicebyMonsterPlugin, "get().getService(IMandat…LoginService::class.java)");
        boolean enableForcedLogin = createIMandatoryLoginServicebyMonsterPlugin.enableForcedLogin(false);
        boolean LIZJ = GuestModeServiceImpl.LJIIJJI().LIZJ();
        boolean LIZ2 = EOO.LIZ();
        if (enableForcedLogin && (!LIZ2 || !LIZJ)) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LJI = JBR.LJI("isForceLogin: ", enableForcedLogin, "; neverLoggedIn: ");
        LJI.append(TextUtils.isEmpty(((RBX) HG3.LJIILL()).getLastUid()));
        LJI.append("; inNujExp: ");
        LJI.append(LIZ2);
        LJI.append("; ageGate: ");
        LJI.append(LIZJ);
        LJI.append("; consent: ");
        LJI.append(!a.LJIJJ().LJ(null));
        C47629Imf.LIZ("NonLoginPushUtil", X1D.LIZIZ(LJI));
        if (z) {
            if (!TextUtils.isEmpty(((RBX) HG3.LJIILL()).getLastUid())) {
                return false;
            }
        } else if (!a.LJIJJ().LJ(null)) {
            return false;
        }
        return true;
    }

    static {
        Integer valueOf = Integer.valueOf(R.string.pk6);
        LIZ = C113554cx.LJJL(new OSZ("1", Integer.valueOf(R.string.pk5)), new OSZ("2", Integer.valueOf(R.string.pkf)), new OSZ("3", Integer.valueOf(R.string.pkq)), new OSZ("4", Integer.valueOf(R.string.pl1)), new OSZ("5", Integer.valueOf(R.string.pl4)), new OSZ("6", Integer.valueOf(R.string.pl5)), new OSZ("7", Integer.valueOf(R.string.pl6)), new OSZ("8", Integer.valueOf(R.string.pl7)), new OSZ("9", Integer.valueOf(R.string.pl8)), new OSZ("10", valueOf), new OSZ("11", Integer.valueOf(R.string.pk7)), new OSZ("12", Integer.valueOf(R.string.pk8)), new OSZ("13", Integer.valueOf(R.string.pk9)), new OSZ("14", Integer.valueOf(R.string.pk_)), new OSZ("15", Integer.valueOf(R.string.pka)), new OSZ("16", Integer.valueOf(R.string.pkb)), new OSZ("17", Integer.valueOf(R.string.pkc)), new OSZ(LowAgeAnchorLimitSetting.DEFAULT, Integer.valueOf(R.string.pkd)), new OSZ("19", Integer.valueOf(R.string.pke)), new OSZ("20", valueOf), new OSZ("21", Integer.valueOf(R.string.pkh)), new OSZ("22", Integer.valueOf(R.string.pki)), new OSZ("23", Integer.valueOf(R.string.pkj)), new OSZ("24", Integer.valueOf(R.string.pkk)), new OSZ("25", Integer.valueOf(R.string.pkl)), new OSZ("26", Integer.valueOf(R.string.pkm)), new OSZ("27", Integer.valueOf(R.string.pkn)), new OSZ("28", Integer.valueOf(R.string.pko)), new OSZ("29", Integer.valueOf(R.string.pkp)), new OSZ("30", Integer.valueOf(R.string.pkr)), new OSZ("31", Integer.valueOf(R.string.pks)), new OSZ("32", Integer.valueOf(R.string.pkt)), new OSZ("33", Integer.valueOf(R.string.pku)), new OSZ("34", Integer.valueOf(R.string.pkv)), new OSZ("35", Integer.valueOf(R.string.pkw)), new OSZ("36", Integer.valueOf(R.string.pkx)), new OSZ("37", Integer.valueOf(R.string.pky)), new OSZ("38", Integer.valueOf(R.string.pkz)), new OSZ("39", Integer.valueOf(R.string.pl0)), new OSZ("40", Integer.valueOf(R.string.pl2)), new OSZ("41", Integer.valueOf(R.string.pl3)));
    }

    public static int LIZIZ() {
        int size = LIZ.size() - DJ9.LIZ().getInt("executed_non_login_push_count", 0);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getRemainingPushCount(");
        LIZ2.append(size);
        LIZ2.append(')');
        C47629Imf.LIZ("NonLoginPushUtil", X1D.LIZIZ(LIZ2));
        return size;
    }

    public static String[] LIZ() {
        String[] stringArray = DJ9.LIZ().getStringArray("non_login_push_list", new String[0]);
        o.LJIIIIZZ(stringArray, "record.getStringArray(KE…_PUSH_LIST, emptyArray())");
        if (stringArray.length == 0) {
            stringArray = (String[]) LIZ.keySet().toArray(new String[0]);
            o.LJIIIZ(stringArray, "<this>");
            V0R random = V0Q.Default;
            o.LJIIIZ(random, "random");
            int length = stringArray.length;
            while (true) {
                length--;
                if (length <= 0) {
                    break;
                }
                int nextInt = random.nextInt(length + 1);
                String str = stringArray[length];
                stringArray[length] = stringArray[nextInt];
                stringArray[nextInt] = str;
            }
            DJ9.LIZ().storeStringArray("non_login_push_list", stringArray);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("genLocalPushListIfNotHave(");
        LIZ2.append(stringArray);
        LIZ2.append(')');
        C47629Imf.LIZ("NonLoginPushUtil", X1D.LIZIZ(LIZ2));
        return stringArray;
    }

    public static boolean LIZJ() {
        if (C46714IVa.LIZ() && LIZLLL() && C38876FNo.LIZ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("NonLoginLocalNotify enabled - isSwitchOn: ");
            LIZ2.append(C46714IVa.LIZ());
            LIZ2.append("; userNotLoginOrConsent: ");
            LIZ2.append(LIZLLL());
            LIZ2.append("; ExperimentEnabled: ");
            LIZ2.append(C38876FNo.LIZ());
            C47629Imf.LIZ("NonLoginPushUtil", X1D.LIZIZ(LIZ2));
            return true;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("NonLoginLocalNotify disabled - isSwitchOn: ");
        LIZ3.append(C46714IVa.LIZ());
        LIZ3.append("; userNotLoginOrConsent: ");
        LIZ3.append(LIZLLL());
        LIZ3.append("; ExperimentEnabled: ");
        LIZ3.append(C38876FNo.LIZ());
        C47629Imf.LIZ("NonLoginPushUtil", X1D.LIZIZ(LIZ3));
        return false;
    }
}
