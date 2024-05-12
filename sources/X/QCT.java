package X;

import android.app.Activity;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.lobby.google.GoogleOneTapAuth;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.t1;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QCT {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C52444Ki8.LJLIL);

    public static boolean LIZ(String str, WeakReference weakReference) {
        Activity activity;
        String uid;
        List<BaseLoginMethod> LJI;
        if (t1.LJI()) {
            return false;
        }
        QCN qcn = new QCN();
        qcn.LIZ = 2;
        if (!new GoogleOneTapAuth(new QCI(qcn)).LJJZZIII() || (activity = (Activity) weakReference.get()) == null || activity.isFinishing()) {
            return false;
        }
        KevaBuilder.getInstance().setContext(activity);
        long j = Keva.getRepo("aweme_account_keva").getLong("last_logout_time", 0L);
        boolean z = Keva.getRepo("google_onetap").getBoolean("logged_out", false);
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (z) {
            Keva.getRepo("google_onetap").storeBoolean("logged_out", false);
        }
        if (currentTimeMillis < 10000 && z) {
            return false;
        }
        User user = AV1.LIZ;
        if (user == null) {
            uid = ((RBX) HG3.LJIILL()).getLastUid();
        } else {
            uid = user.getUid();
        }
        if (uid != null && (LJI = C68517Qun.LIZ.LJI(uid)) != null && (!LJI.isEmpty())) {
            for (BaseLoginMethod baseLoginMethod : LJI) {
                if (!(baseLoginMethod instanceof TPLoginMethod)) {
                    return false;
                }
                String platform = ((TPLoginMethod) baseLoginMethod).getPlatform();
                if (!o.LJ(platform, "google_onetap") && !o.LJ(platform, "google")) {
                    return false;
                }
            }
        }
        if (o.LJ(str, "switch_account")) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(String str, WeakReference weakReference) {
        if (!LIZ(str, weakReference) || o.LJ("US", AccountService.LJIJ().LJIILL())) {
            return false;
        }
        return true;
    }
}
