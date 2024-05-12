package X;

import Y.AObjectS123S0200000_7;
import Y.AObjectS45S0101000_13;
import Y.IDCListenerS160S0100000_7;
import Y.IDCListenerS165S0100000_14;
import Y.IDDListenerS102S0200000_7;
import android.app.Activity;
import com.ss.android.ugc.aweme.adaptation.saa.SAAService;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HJC {
    public static String LIZ = "change_mode";

    public static boolean LJ() {
        boolean LIZ2 = HJD.LIZ();
        if (AVServiceImpl.LIZ().avSettingsService().showMvThemeRecordMode() && !LIZ2) {
            return true;
        }
        return false;
    }

    public static String LIZ(CreativeInfo creativeInfo) {
        return C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJJ(creativeInfo);
    }

    public static String LIZIZ(CreativeInfo creativeInfo) {
        return C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJII(creativeInfo);
    }

    public static String LIZJ(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(simpleDateFormat.format(time));
        LIZ2.append(str);
        return X1D.LIZIZ(LIZ2);
    }

    public static boolean LIZLLL(MvThemeData mvThemeData) {
        Effect effect;
        if (mvThemeData == null || (effect = mvThemeData.effect) == null || C77413UZt.LJIILL(effect.getTags())) {
            return false;
        }
        return mvThemeData.effect.getTags().contains("NeedServerAlgorithm");
    }

    public static void LJFF(Activity activity, MvThemeData mvThemeData, IDCListenerS165S0100000_14 iDCListenerS165S0100000_14, IDCListenerS160S0100000_7 iDCListenerS160S0100000_7) {
        Effect effect;
        if (activity == null || activity.isFinishing() || mvThemeData == null || (effect = mvThemeData.effect) == null) {
            return;
        }
        String key = effect.getId();
        o.LJIIIZ(key, "key");
        if (F9J.LIZIZ(C44172HVg.LIZ, 0, "mv_template").getBoolean(key, false)) {
            if (iDCListenerS165S0100000_14 == null) {
                return;
            }
            iDCListenerS165S0100000_14.onClick(null, 0);
        } else {
            ARI ari = new ARI(activity);
            ari.LJII(activity.getResources().getString(R.string.a0u), new AObjectS123S0200000_7(iDCListenerS165S0100000_14, mvThemeData, 5));
            ari.LJIIIZ(activity.getResources().getString(R.string.a0t), new AObjectS45S0101000_13(2, iDCListenerS160S0100000_7, 10));
            SAAService.LIZ().invokeMethodsSafely(activity, new C26093ALx(1, activity, ari, new IDDListenerS102S0200000_7(mvThemeData, iDCListenerS160S0100000_7, 3)));
        }
    }
}
