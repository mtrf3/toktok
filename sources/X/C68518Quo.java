package X;

import Y.ARunnableS22S0300000_11;
import com.ss.android.ugc.aweme.account.login.loginmethods.EncryptedLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Quo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68518Quo {
    public final C68416QtA LIZ = new C68416QtA();
    public final C68519Qup LIZIZ = new C68519Qup();
    public final C68529Quz LIZJ = new C68529Quz();
    public C73543Stf LIZLLL;

    public static boolean LIZ() {
        if (C53262KvK.LIZ() == 2 && (!C35478DwA.LIZJ || C35478DwA.LIZ() != 3)) {
            return true;
        }
        return false;
    }

    public final List<BaseLoginMethod> LIZIZ(List<? extends BaseLoginMethod> loginMethods, List<EncryptedLoginMethod> encryptedMethods) {
        boolean z;
        String oneClickLoginToken;
        Object obj;
        long j;
        o.LJIIIZ(loginMethods, "loginMethods");
        o.LJIIIZ(encryptedMethods, "encryptedMethods");
        List<BaseLoginMethod> LLJILJILJ = ORZ.LLJILJILJ(loginMethods);
        boolean z2 = false;
        for (EncryptedLoginMethod encryptedLoginMethod : encryptedMethods) {
            ArrayList arrayList = (ArrayList) LLJILJILJ;
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((BaseLoginMethod) obj).getUid(), encryptedLoginMethod.uid)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) obj;
            if (baseLoginMethod == null) {
                String str = encryptedLoginMethod.uid;
                LoginMethodName loginMethodName = encryptedLoginMethod.loginMethodName;
                CommonUserInfo commonUserInfo = new CommonUserInfo(encryptedLoginMethod.userName, encryptedLoginMethod.avatarUrl, null, null, 12, null);
                Date date = new Date(System.currentTimeMillis() + 31536000000L);
                Long l = encryptedLoginMethod.lastActiveTime;
                Boolean bool = Boolean.FALSE;
                arrayList.add(new BaseLoginMethod(str, loginMethodName, commonUserInfo, date, null, l, bool, bool, bool, Boolean.TRUE, encryptedLoginMethod.oneClickLoginToken, encryptedLoginMethod.platform, null, 4096, null));
                z2 = true;
            } else {
                if (o.LJ(baseLoginMethod.isOneClickLogin(), Boolean.FALSE)) {
                    baseLoginMethod.setOneClickLogin(Boolean.TRUE);
                    z2 = true;
                }
                String oneClickLoginToken2 = baseLoginMethod.getOneClickLoginToken();
                if (oneClickLoginToken2 == null || oneClickLoginToken2.length() == 0 || !LIZ()) {
                    baseLoginMethod.setOneClickLoginToken(encryptedLoginMethod.oneClickLoginToken);
                    Long l2 = encryptedLoginMethod.lastActiveTime;
                    if (l2 != null) {
                        long longValue = l2.longValue();
                        Long lastActiveTime = baseLoginMethod.getLastActiveTime();
                        if (lastActiveTime != null) {
                            j = lastActiveTime.longValue();
                        } else {
                            j = -1;
                        }
                        if (longValue > j) {
                            baseLoginMethod.setLastActiveTime(encryptedLoginMethod.lastActiveTime);
                        }
                    }
                }
            }
        }
        if (z2 || ORS.LJJLIL(C68523Qut.LJLIL, LLJILJILJ)) {
            z = true;
        } else {
            z = false;
        }
        Iterator it2 = ((ArrayList) LLJILJILJ).iterator();
        while (it2.hasNext()) {
            BaseLoginMethod baseLoginMethod2 = (BaseLoginMethod) it2.next();
            if (baseLoginMethod2.m102isOneClickLogin() && ((oneClickLoginToken = baseLoginMethod2.getOneClickLoginToken()) == null || oneClickLoginToken.length() == 0)) {
                baseLoginMethod2.setOneClickLogin(Boolean.FALSE);
                z = true;
            }
        }
        if (z) {
            this.LIZIZ.LIZIZ(LLJILJILJ);
        }
        return LLJILJILJ;
    }

    public final void LIZJ(List<? extends BaseLoginMethod> loginMethods, InterfaceC68422QtG interfaceC68422QtG) {
        o.LJIIIZ(loginMethods, "loginMethods");
        C73543Stf c73543Stf = this.LIZLLL;
        if (c73543Stf != null) {
            c73543Stf.dispose();
        }
        this.LIZLLL = new C73659SvX(new ARunnableS22S0300000_11(interfaceC68422QtG, loginMethods, this, 8)).LJIILIIL(T16.LIZ()).LJIIJ(C68527Qux.LJLIL, C68531Qv1.LIZ);
    }
}
