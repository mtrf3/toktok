package X;

import Y.IDCListenerS280S0100000_4;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.ALd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26073ALd {
    public static PackageManager LIZ;
    public static C73893SzJ<C26076ALg> LIZIZ;

    public static boolean LIZ() {
        NotificationChannel notificationChannel;
        String realChannelId = C78685UuP.LJJIII().getRealChannelId("live_push");
        Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "notification");
        o.LJII(LLILL, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) LLILL;
        if (Build.VERSION.SDK_INT < 26 || realChannelId == null || realChannelId.length() == 0 || (notificationChannel = notificationManager.getNotificationChannel(realChannelId)) == null || notificationChannel.getImportance() != 0) {
            return true;
        }
        return false;
    }

    public static long LIZJ() {
        String curUserId;
        RBY LJFF = AccountService.LJIJ().LJFF();
        if (AccountService.LJIJ().LJFF() == null) {
            curUserId = "-1";
        } else {
            curUserId = LJFF.getCurUserId();
        }
        curUserId.toString();
        return CastLongProtector.parseLong(curUserId);
    }

    public static boolean LIZLLL() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("push_live_");
        LIZ2.append(LIZJ());
        Keva repo = KevaImpl.getRepo(X1D.LIZIZ(LIZ2), 0);
        o.LJIIIIZZ(repo, "getRepo(PUSH_LIVE_ + get…ants.MODE_SINGLE_PROCESS)");
        return repo.getBoolean("key_mt_live_push_switch", true);
    }

    public static void LJI(Activity activity) {
        if (activity != null) {
            C26227ARb c26227ARb = new C26227ARb(activity);
            c26227ARb.LJ(R.string.gk1);
            c26227ARb.LIZ(R.string.pb_);
            UC0.LIZJ(c26227ARb, C26072ALc.LJLIL);
            c26227ARb.LJI().LIZLLL();
        }
    }

    public static TuxSheet LIZIZ(NotificationLiveBottomDialog notificationLiveBottomDialog, DialogInterface.OnDismissListener onDismissListener) {
        o.LJIIIZ(onDismissListener, "onDismissListener");
        ASL asl = new ASL();
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = notificationLiveBottomDialog;
        tuxSheet.LJLILLLLZI = onDismissListener;
        IDCListenerS280S0100000_4 onCancelListener = notificationLiveBottomDialog.LJZ;
        o.LJIIIZ(onCancelListener, "onCancelListener");
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLIL = onCancelListener;
        return tuxSheet2;
    }

    public static void LJFF(Context context, User user) {
        String str;
        ALQ.LIZJ("push_setting");
        if (context != null) {
            C26227ARb c26227ARb = new C26227ARb(context);
            c26227ARb.LJ(R.string.t69);
            String string = context.getString(R.string.t6_);
            o.LJIIIIZZ(string, "it.getString(R.string.turn_on_notification_guide)");
            Object[] objArr = new Object[1];
            if (user != null) {
                str = user.getUniqueId();
            } else {
                str = null;
            }
            objArr[0] = str;
            String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(objArr, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            c26227ARb.LIZIZ(LLLZ);
            UC0.LIZJ(c26227ARb, C26078ALi.LJLIL);
            c26227ARb.LJI().LIZLLL();
        }
    }

    public static void LJ(Activity activity, User user, InterfaceC26071ALb interfaceC26071ALb, String str, String str2, String str3, String str4, AwemeRawAd awemeRawAd) {
        HH1.LIZ(str, "enterFrom", str2, "previousPage", str3, "previousPagePosition");
        if (user != null && (activity instanceof ActivityC45651qj)) {
            NotificationLiveBottomDialog notificationLiveBottomDialog = new NotificationLiveBottomDialog(user, interfaceC26071ALb, true, str, str2, str3, str4, awemeRawAd, 512);
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) activity;
            if (!activityC45651qj.getSupportFragmentManager().LJJJLZIJ()) {
                C1DG.LJII(activityC45651qj, "activity.supportFragmentManager", LIZIZ(notificationLiveBottomDialog, notificationLiveBottomDialog.LJLZ), "NotificationLiveDialog");
            }
        }
    }
}
