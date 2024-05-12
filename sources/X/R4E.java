package X;

import Y.ARunnableS18S0000000_11;
import Y.ARunnableS3S1200000_4;
import Y.IDgS350S0100000_11;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.account.login.prevlogin.PrevLoginPlatformService;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes12.dex */
public final class R4E extends QQE<QQJ> {
    public final /* synthetic */ Dialog LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ Activity LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ Bundle LJFF;
    public final /* synthetic */ R2X LJI;

    @Override // X.QQE
    public final void onResponse(QQJ qqj) {
        QQJ qqj2 = qqj;
        Dialog dialog = this.LIZ;
        if (dialog != null) {
            V1B.LJLILLLLZI(dialog);
        }
        String str = "";
        if (qqj2.LIZIZ) {
            if (this.LIZIZ && this.LJI.LIZ.allUidList().size() > 1) {
                ((RBX) HG3.LJIILL()).logoutAllBackgroundUser();
            }
            String str2 = R4D.LJ;
            SharedPreferences LIZ = C40535FvX.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ftc_age_gate_response_mode");
            LIZ2.append(str2);
            if (LIZ.getInt(X1D.LIZIZ(LIZ2), -1) != -1) {
                String str3 = R4D.LJ;
                SharedPreferences.Editor edit = C40535FvX.LIZ().edit();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("ftc_age_gate_response_mode");
                LIZ3.append(str3);
                edit.remove(X1D.LIZIZ(LIZ3)).apply();
            }
            if (C40533FvV.LIZ(R4D.LJ) != -1) {
                String uid = R4D.LJ;
                o.LJIIIZ(uid, "uid");
                C40533FvV.LIZ.remove(uid);
            }
            AppLog.setUserId(0L);
            AppLog.setSessionKey(this.LJI.LIZ.getSessionKey());
            C68736QyK c68736QyK = C68736QyK.LIZLLL;
            Application application = C58725N2z.LIZ;
            for (C68737QyL c68737QyL : c68736QyK.LIZIZ) {
                c68737QyL.LIZJ = false;
            }
            c68736QyK.LIZJ(application);
            if (this.LIZJ != null) {
                C10760bY.LIZ(C58725N2z.LIZ).LIZJ(new Intent(this.LIZJ, (Class<?>) FQP.class));
            }
            this.LJI.LIZ.clear("logout");
            C38591FCp.LIZ(0, 0, "", "");
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("status", "success");
            c35936E8m.LIZLLL("params_for_special", "uc_login");
            c35936E8m.LIZLLL("fail_info", "");
            c35936E8m.LIZ(0, "error_code");
            c35936E8m.LIZLLL("uid", this.LIZLLL);
            c35936E8m.LIZLLL("logout_from", this.LJ);
            FMX.LJIIL("uc_user_logout_result", c35936E8m.LIZ);
            if (this.LJI.LIZ.allUidList().size() > 0 && R41.LJ().isEnableMultiAccountLogin()) {
                List<String> allUidList = R4D.LIZ().allUidList();
                R4D.LIZIZ = allUidList;
                o.LJI(allUidList);
                R4D.LIZ = C47261Igj.LJJI(allUidList);
                List<String> list = R4D.LIZIZ;
                o.LJI(list);
                String switchToUid = (String) ORZ.LLFF(list);
                String curUserId = R4D.LIZ().getCurUserId();
                o.LJIIIIZZ(curUserId, "userService.curUserId");
                String valueOf = String.valueOf(R4D.LIZIZ);
                o.LJIIIZ(switchToUid, "switchToUid");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "start switch account");
                hashMap.put("from", "after logout");
                StringBuilder LIZLLL = C06540Nm.LIZLLL("from ", curUserId, " to ", switchToUid, " with ");
                LIZLLL.append(valueOf);
                hashMap.put("extra", X1D.LIZIZ(LIZLLL));
                R4J r4j = R4J.LIZ;
                String abstractMap = hashMap.toString();
                o.LJIIIIZZ(abstractMap, "map.toString()");
                r4j.LIZIZ(abstractMap);
                if (R4D.LIZ >= 0) {
                    R4D.LIZJ(switchToUid, C01R.LIZ("need_restart", true), true, false, new C78857UxB());
                }
                PrevLoginPlatformService.LJIIL().LIZJ(CastLongProtector.parseLong(this.LIZLLL));
            } else {
                PrevLoginPlatformService.LJIIL().LJIIIIZZ(new PrevLoginPlatformService().LJFF(CastLongProtector.parseLong(this.LIZLLL)));
                PrevLoginPlatformService.LJIIL().LIZJ(CastLongProtector.parseLong(this.LIZLLL));
                R41.LIZ().accountUserClear();
                R41.LJIIJ(true);
                if (this.LIZIZ) {
                    a.LJI().LJIILLIIL(new ARunnableS18S0000000_11(23), false);
                } else {
                    C40883G2t c40883G2t = new C40883G2t();
                    c40883G2t.LIZLLL("previous_uid", R4D.LJ);
                    C40453FuD.LIZIZ((Bundle) c40883G2t.LIZ, new C40392FtE(false));
                }
                R4D.LJ = "";
                Keva.getRepo("google_onetap").storeBoolean("logged_out", true);
                Keva.getRepo("aweme_account_keva").storeLong("last_logout_time", System.currentTimeMillis());
            }
            try {
                if (!TextUtils.isEmpty(this.LJ)) {
                    Keva repo = Keva.getRepo("user_logout_log");
                    if (System.currentTimeMillis() - repo.getLong("last_time", 0L) > 172800000) {
                        repo.clear();
                    }
                    repo.storeInt(this.LJ, repo.getInt(this.LJ, 0) + 1);
                    repo.storeLong("last_time", System.currentTimeMillis());
                    return;
                }
                return;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        C35936E8m c35936E8m2 = new C35936E8m();
        c35936E8m2.LIZLLL("status", "fail");
        if (!TextUtils.isEmpty(qqj2.LJFF)) {
            str = qqj2.LJFF;
        }
        c35936E8m2.LIZLLL("fail_info", str);
        c35936E8m2.LIZ(qqj2.LIZLLL, "error_code");
        c35936E8m2.LIZLLL("params_for_special", "uc_login");
        c35936E8m2.LIZLLL("uid", this.LIZLLL);
        c35936E8m2.LIZLLL("logout_from", this.LJ);
        FMX.LJIIL("uc_user_logout_result", c35936E8m2.LIZ);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(qqj2.LJFF)) {
            sb.append(qqj2.LJFF);
            sb.append("|");
        }
        if (!TextUtils.isEmpty(qqj2.LJI)) {
            sb.append(qqj2.LJI);
        }
        C38591FCp.LIZ(1, qqj2.LIZLLL, "passport logout", sb.toString());
        R41.LJIIJ(false);
        int i = qqj2.LIZLLL;
        if (i == 1346 || i == 1363) {
            C40437Ftx.LIZ(this.LIZJ, new R4F(this, qqj2), qqj2.LJFF, "log_out_bind");
        } else {
            if (i == 1350) {
                Activity activity = this.LIZJ;
                String desc = qqj2.LJFF;
                IDgS350S0100000_11 iDgS350S0100000_11 = new IDgS350S0100000_11(this, 0);
                o.LJIIIZ(desc, "desc");
                if (activity == null || activity.isFinishing()) {
                    iDgS350S0100000_11.LIZ();
                    return;
                } else {
                    activity.runOnUiThread(new ARunnableS3S1200000_4(activity, desc, iDgS350S0100000_11, 0));
                    return;
                }
            }
            C5S1 c5s1 = new C5S1(C58725N2z.LIZ);
            c5s1.LIZLLL(R4R.LIZIZ(qqj2));
            c5s1.LJ();
        }
    }

    public R4E(R2X r2x, DialogC61824OOe dialogC61824OOe, boolean z, Activity activity, String str, String str2, Bundle bundle) {
        this.LJI = r2x;
        this.LIZ = dialogC61824OOe;
        this.LIZIZ = z;
        this.LIZJ = activity;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = bundle;
    }
}
