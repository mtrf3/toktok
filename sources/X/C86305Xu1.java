package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.protection.common.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xu1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86305Xu1 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53831LAt.LJLIL);
    public static boolean LIZIZ;

    public static void LIZIZ(DialogC254019y1 dialogC254019y1) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/ies/dmt/ui/dialog/DmtStatusViewDialog", "show", dialogC254019y1, new Object[0], "void", new C65300Pk0(false, "()V", "7109077275359217465")).LIZ) {
            return;
        }
        dialogC254019y1.show();
    }

    public static int LIZJ() {
        FamilyPiaringManager.LIZ.getClass();
        EnumC62934Omw LIZJ = FamilyPiaringManager.LIZJ();
        if ((LIZJ == EnumC62934Omw.CHILD || LIZJ == EnumC62934Omw.UNLINK_LOCKED) && ((RBX) HG3.LJIILL()).isLogin() && FamilyPiaringManager.LIZ() > 0) {
            return FamilyPiaringManager.LIZ();
        }
        return C86306Xu2.LIZIZ();
    }

    public static boolean LJ() {
        FamilyPiaringManager.LIZ.getClass();
        EnumC62934Omw LIZJ = FamilyPiaringManager.LIZJ();
        boolean LJ = FamilyPiaringManager.LJ();
        if (LIZJ == EnumC62934Omw.CHILD) {
            return LJ;
        }
        if (LIZJ == EnumC62934Omw.UNLINK_LOCKED && LJ) {
            return true;
        }
        return C86306Xu2.LIZJ();
    }

    public static boolean LJFF() {
        FamilyPiaringManager.LIZ.getClass();
        EnumC62934Omw LIZJ = FamilyPiaringManager.LIZJ();
        boolean isLogin = ((RBX) HG3.LJIILL()).isLogin();
        if (LIZJ == EnumC62934Omw.CHILD && isLogin) {
            return FamilyPiaringManager.LJFF();
        }
        if (LIZJ == EnumC62934Omw.UNLINK_LOCKED && isLogin && FamilyPiaringManager.LJFF()) {
            return true;
        }
        return C86306Xu2.LIZLLL();
    }

    public static void LJIIIIZZ() {
        Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            LJIIIIZZ = EF7.LIZIZ();
        }
        if (LJIIIIZZ instanceof InterfaceC55058LjC) {
            Activity LJIJJ = C45804HyK.LJIJJ(LJIIIIZZ);
            o.LJI(LJIJJ);
            LJIJJ.finish();
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(LJIIIIZZ, "//main");
        buildRoute.addFlags(268468224);
        buildRoute.open();
    }

    public static void LJII(List list) {
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setLazyUpdate(true);
        String accessKey = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAccessKey();
        C61520OCm LIZ2 = O3E.LIZ(accessKey);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!O3U.LIZ(accessKey, str)) {
                CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
                targetChannel.channelName = str;
                arrayList.add(targetChannel);
            }
        }
        if (!arrayList.isEmpty()) {
            hashMap.put(accessKey, arrayList);
            if (LIZ2 != null) {
                LIZ2.LIZ(null, hashMap, optionCheckUpdateParams);
            }
        }
    }

    public static void LJIIIZ(InterfaceC53832LAu interfaceC53832LAu) {
        if (LIZIZ) {
            return;
        }
        LIZ.getValue().getClass();
        C53830LAs.LIZ(interfaceC53832LAu);
    }

    public static long LIZLLL(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 0);
        calendar.set(12, i2);
        calendar.set(11, i);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static boolean LJI(DoNotDisturbSettings doNotDisturbSettings, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        if (o.LJ(doNotDisturbSettings.pauseNotificationEnabled, Boolean.TRUE)) {
            Integer num = doNotDisturbSettings.pauseNotificationStartHour;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            Integer num2 = doNotDisturbSettings.pauseNotificationStartMinute;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 0;
            }
            long LIZLLL = LIZLLL(i, i2);
            Integer num3 = doNotDisturbSettings.pauseNotificationEndHour;
            if (num3 != null) {
                i3 = num3.intValue();
            } else {
                i3 = 0;
            }
            Integer num4 = doNotDisturbSettings.pauseNotificationEndMinute;
            if (num4 != null) {
                i4 = num4.intValue();
            } else {
                i4 = 0;
            }
            long LIZLLL2 = LIZLLL(i3, i4);
            if (LIZLLL > LIZLLL2) {
                LIZLLL2 += 86400000;
            }
            if (LIZLLL <= j && j <= LIZLLL2) {
                return true;
            }
        }
        return false;
    }

    public static void LIZ(Context context, Runnable runnable, String str) {
        int i;
        FamilyPiaringManager.LIZ.getClass();
        if (FamilyPiaringManager.LJFF() || FamilyPiaringManager.LJ()) {
            if (TextUtils.equals("logout", str)) {
                if (FamilyPiaringManager.LJFF() && FamilyPiaringManager.LJ()) {
                    i = R.string.g98;
                } else if (FamilyPiaringManager.LJFF()) {
                    i = R.string.g97;
                } else {
                    i = R.string.g96;
                }
            } else if (FamilyPiaringManager.LJFF() && FamilyPiaringManager.LJ()) {
                i = R.string.g9a;
            } else if (FamilyPiaringManager.LJFF()) {
                i = R.string.g9_;
            } else {
                i = R.string.g99;
            }
            C05L.LIZLLL(context, i);
            return;
        }
        if (C86306Xu2.LIZJ()) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", str);
            FMX.LJIIL("time_lock_block_show", c188727au.LIZ);
            C1FO.LJIIJ(new C78490UrG(runnable), str);
            return;
        }
        if (runnable == null) {
            return;
        }
        runnable.run();
    }
}
