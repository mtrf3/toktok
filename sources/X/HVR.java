package X;

import Y.IDeS403S0100000_7;
import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AqS124S0300000_7;
import kotlin.jvm.internal.AqS14S1400000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS77S0400000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HVR {
    public static final HVR LIZ = new HVR();
    public static boolean LIZIZ;

    public static java.util.Map LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        return C113554cx.LJJL(new OSZ("android.permission.CAMERA", context.getString(R.string.rtl)), new OSZ("android.permission.RECORD_AUDIO", context.getString(R.string.rtp)), new OSZ("android.permission.WRITE_EXTERNAL_STORAGE", context.getString(R.string.rtn)));
    }

    public static void LJIIJJI(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        C26227ARb c26227ARb = new C26227ARb(activity);
        c26227ARb.LJFF(activity.getString(R.string.rte));
        c26227ARb.LIZIZ(LIZ(activity, E2C.LIZJ("android.permission.RECORD_AUDIO", activity.getString(R.string.rtp)), new String[]{"android.permission.RECORD_AUDIO"}));
        UC0.LIZJ(c26227ARb, new AqS173S0100000_7(activity, 157));
        new AutoDismissPermissionDialog(activity, c26227ARb).LIZ();
    }

    public final void LJIIIZ(ActivityC45651qj activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(activity, "activity");
        String[] LJIL = C45804HyK.LJIL();
        if (!C78605Ut7.LIZJ(LJIL)) {
            String[] LJIILL = C78605Ut7.LJIILL(LJIL);
            java.util.Map LIZIZ2 = LIZIZ(activity);
            String string = activity.getString(R.string.rtq);
            o.LJIIIIZZ(string, "activity.getString(R.str…zation_permissions_title)");
            LJIIL(this, activity, LJIILL, string, LIZ(activity, LIZIZ2, LJIILL), null, null, interfaceC65784Pro, 176);
        }
    }

    public static String LIZ(Context context, java.util.Map map, String[] strArr) {
        int length = strArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    return "";
                }
                String string = context.getString(R.string.rtt, map.get(strArr[0]), map.get(strArr[1]), map.get(strArr[2]));
                o.LJIIIIZZ(string, "context.getString(\n     …ons[2]]\n                )");
                return string;
            }
            String string2 = context.getString(R.string.rts, map.get(strArr[0]), map.get(strArr[1]));
            o.LJIIIIZZ(string2, "context.getString(R.stri…ons[1]]\n                )");
            return string2;
        }
        String string3 = context.getString(R.string.rtr, map.get(strArr[0]));
        o.LJIIIIZZ(string3, "context.getString(R.stri…ons[0]]\n                )");
        return string3;
    }

    public final void LJIIJ(C29S activity, InterfaceC65784Pro interfaceC65784Pro, String[] strArr) {
        o.LJIIIZ(activity, "activity");
        if (strArr.length == 0) {
            strArr = C45804HyK.LJIL();
        }
        if (!C78605Ut7.LIZJ(strArr)) {
            String[] LJIILL = C78605Ut7.LJIILL(strArr);
            java.util.Map LIZIZ2 = LIZIZ(activity);
            String string = activity.getString(R.string.rtq);
            o.LJIIIIZZ(string, "activity.getString(R.str…zation_permissions_title)");
            LJIIL(this, activity, LJIILL, string, LIZ(activity, LIZIZ2, LJIILL), null, null, interfaceC65784Pro, 176);
        }
    }

    public final void LJIIIIZZ(ActivityC45651qj activityC45651qj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3) {
        String string = activityC45651qj.getString(R.string.rtg);
        o.LJIIIIZZ(string, "activity.getString(R.str…ions_dialog_title_photos)");
        String string2 = activityC45651qj.getString(R.string.rtf);
        o.LJIIIIZZ(string2, "activity.getString(R.str…ialog_description_photos)");
        LJIIL(this, activityC45651qj, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, string, string2, interfaceC65784Pro, interfaceC65784Pro2, interfaceC65784Pro3, 128);
    }

    public static void LIZLLL(ActivityC45651qj activityC45651qj, HPI hpi, InterfaceC65784Pro interfaceC65784Pro, TokenCert cert, int i) {
        HVV onSettingCancelled;
        InterfaceC65784Pro onSettingShown = interfaceC65784Pro;
        HVR hvr = LIZ;
        if ((i & 4) != 0) {
            onSettingShown = HVT.LJLIL;
        }
        HVX onSettingDismissed = null;
        if ((i & 8) != 0) {
            onSettingCancelled = HVV.LJLIL;
        } else {
            onSettingCancelled = null;
        }
        if ((i & 16) != 0) {
            onSettingDismissed = HVX.LJLIL;
        }
        o.LJIIIZ(onSettingShown, "onSettingShown");
        o.LJIIIZ(onSettingCancelled, "onSettingCancelled");
        o.LJIIIZ(onSettingDismissed, "onSettingDismissed");
        o.LJIIIZ(cert, "cert");
        LJI(hvr, activityC45651qj, new String[]{"android.permission.CAMERA"}, new AqS77S0400000_7(activityC45651qj, (ActivityC45651qj) onSettingShown, (InterfaceC65784Pro<C76800UCe>) onSettingCancelled, (InterfaceC65784Pro<C76800UCe>) onSettingDismissed, (InterfaceC65784Pro<C76800UCe>) 1), hpi, cert);
    }

    public static void LJII(ActivityC45651qj activity, HPI hpi, AqS157S0100000_7 aqS157S0100000_7, TokenCert cert, int i) {
        C44170HVe onSettingCancelled;
        InterfaceC65784Pro onGoToSettings = aqS157S0100000_7;
        HVR hvr = LIZ;
        if ((i & 4) != 0) {
            onGoToSettings = C44169HVd.LJLIL;
        }
        HVS onSettingDismissed = null;
        if ((i & 8) != 0) {
            onSettingCancelled = C44170HVe.LJLIL;
        } else {
            onSettingCancelled = null;
        }
        if ((i & 16) != 0) {
            onSettingDismissed = HVS.LJLIL;
        }
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(onGoToSettings, "onGoToSettings");
        o.LJIIIZ(onSettingCancelled, "onSettingCancelled");
        o.LJIIIZ(onSettingDismissed, "onSettingDismissed");
        o.LJIIIZ(cert, "cert");
        LJI(hvr, activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new AqS77S0400000_7(activity, (ActivityC45651qj) onGoToSettings, (InterfaceC65784Pro<C76800UCe>) onSettingCancelled, (InterfaceC65784Pro<C76800UCe>) onSettingDismissed, (InterfaceC65784Pro<C76800UCe>) 0), hpi, cert);
    }

    public final void LIZJ(ActivityC45651qj activityC45651qj, HPI hpi, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, TokenCert cert) {
        o.LJIIIZ(cert, "cert");
        LJI(this, activityC45651qj, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new AqS124S0300000_7(activityC45651qj, (ActivityC45651qj) interfaceC65784Pro, interfaceC65784Pro2, (InterfaceC65784Pro<C76800UCe>) 2), hpi, cert);
    }

    public static /* synthetic */ void LJI(HVR hvr, ActivityC45651qj activityC45651qj, String[] strArr, InterfaceC88471Ynr interfaceC88471Ynr, HPI hpi, TokenCert tokenCert) {
        C44168HVc c44168HVc = C44168HVc.LJLIL;
        hvr.getClass();
        LJFF(activityC45651qj, strArr, interfaceC88471Ynr, hpi, c44168HVc, tokenCert, "");
    }

    public static void LJ(ActivityC45651qj activity, HPI hpi, AqS162S0100000_12 aqS162S0100000_12, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, TokenCert cert, int i) {
        InterfaceC65784Pro onSettingDismissed = interfaceC65784Pro2;
        InterfaceC65784Pro onGoToSettings = aqS162S0100000_12;
        InterfaceC65784Pro onSettingCancelled = interfaceC65784Pro;
        HVR hvr = LIZ;
        if ((i & 4) != 0) {
            onGoToSettings = HVZ.LJLIL;
        }
        if ((i & 8) != 0) {
            onSettingCancelled = C44166HVa.LJLIL;
        }
        if ((i & 16) != 0) {
            onSettingDismissed = C44167HVb.LJLIL;
        }
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(onGoToSettings, "onGoToSettings");
        o.LJIIIZ(onSettingCancelled, "onSettingCancelled");
        o.LJIIIZ(onSettingDismissed, "onSettingDismissed");
        o.LJIIIZ(cert, "cert");
        LJI(hvr, activity, (String[]) C78605Ut7.LJIIJ(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}), new AqS77S0400000_7(activity, (ActivityC45651qj) onGoToSettings, (InterfaceC65784Pro<C76800UCe>) onSettingCancelled, (InterfaceC65784Pro<C76800UCe>) onSettingDismissed, (InterfaceC65784Pro<C76800UCe>) 2), hpi, cert);
    }

    public static void LJFF(ActivityC45651qj activityC45651qj, String[] strArr, InterfaceC88471Ynr interfaceC88471Ynr, HPI hpi, InterfaceC65784Pro interfaceC65784Pro, TokenCert tokenCert, String str) {
        if (LIZIZ) {
            return;
        }
        if (C78605Ut7.LIZJ(strArr)) {
            ArrayList arrayList = new ArrayList(strArr.length);
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                arrayList.add(0);
            }
            hpi.LIZ(ORZ.LLJ(arrayList), strArr);
            return;
        }
        if (C44172HVg.LJJI.LJ().LJFF()) {
            HVO.LIZJ(strArr, activityC45651qj, str);
            C61099NyR.LIZIZ.LIZIZ(activityC45651qj, tokenCert).LIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new IDeS403S0100000_7(new HR7(activityC45651qj, str, hpi, interfaceC65784Pro, interfaceC88471Ynr), 4));
            return;
        }
        interfaceC88471Ynr.invoke(strArr, null);
    }

    public static void LJIIL(HVR hvr, ActivityC45651qj activityC45651qj, String[] strArr, String str, String str2, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro interfaceC65784Pro3, int i) {
        String str3;
        InterfaceC65784Pro interfaceC65784Pro4 = interfaceC65784Pro3;
        InterfaceC65784Pro interfaceC65784Pro5 = interfaceC65784Pro;
        InterfaceC65784Pro interfaceC65784Pro6 = interfaceC65784Pro2;
        if ((i & 16) != 0) {
            interfaceC65784Pro5 = HVU.LJLIL;
        }
        if ((i & 32) != 0) {
            interfaceC65784Pro6 = HVW.LJLIL;
        }
        if ((i & 64) != 0) {
            interfaceC65784Pro4 = HVY.LJLIL;
        }
        if ((i & 128) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        hvr.getClass();
        HVO.LIZLLL(strArr, activityC45651qj, str3);
        C26227ARb c26227ARb = new C26227ARb(activityC45651qj);
        c26227ARb.LJFF(str);
        c26227ARb.LIZIZ(str2);
        c26227ARb.LJII = true;
        UC0.LIZJ(c26227ARb, new AqS14S1400000_7(strArr, (String[]) activityC45651qj, (ActivityC45651qj) str3, (String) interfaceC65784Pro5, (InterfaceC65784Pro<C76800UCe>) interfaceC65784Pro6, (InterfaceC65784Pro<C76800UCe>) 0));
        AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(activityC45651qj, c26227ARb);
        autoDismissPermissionDialog.LJLJJI = new AqS173S0100000_7(interfaceC65784Pro4, (InterfaceC65784Pro<C76800UCe>) 159);
        if (autoDismissPermissionDialog.LIZ()) {
            LIZIZ = true;
        }
    }
}
