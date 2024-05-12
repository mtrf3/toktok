package X;

import Y.ACallableS114S0100000_11;
import Y.ARunnableS30S0200000_11;
import Y.AfS53S0100000_1;
import android.content.SharedPreferences;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RBW implements WeakHandler.IHandler {
    public static final C69130RBe LJLJLJ = new C69130RBe();
    public static final String LJLJLLL;
    public static final String LJLL;
    public static final RBW LJLLI;
    public boolean LJLIL;
    public long LJLILLLLZI = -1;
    public final WeakHandler LJLJI = new WeakHandler(C16880lQ.LLJJJJ(), this);
    public String LJLJJI;
    public User LJLJJL;
    public UserStore.AccountUser LJLJJLL;
    public String LJLJL;

    public final synchronized User LIZIZ() {
        User user;
        user = this.LJLJJL;
        if (user == null) {
            user = UserStore.LIZJ(false);
        }
        this.LJLJJL = user;
        o.LJI(user);
        return user;
    }

    public final boolean LJI() {
        return !UserStore.LJIIIIZZ(LIZLLL());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.3kP] */
    public final void LJII() {
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = AbstractC73672Svk.LJJIIJZLJL(RBZ.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS53S0100000_1(c68322mC, 53));
        C68542QvC c68542QvC = C68542QvC.LIZ;
        User LIZIZ = LIZIZ();
        c68542QvC.getClass();
        C68542QvC.LIZIZ(5, null, LIZIZ);
        C68542QvC.LIZJ();
    }

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LJLJLLL = JBR.LJFF(LIZ, "api-va.tiktokv.com", "/aweme/v1/check/in/", LIZ);
        LJLL = a1.LJ("https://", "api-va.tiktokv.com", "/tiktok/v1/kids/check/in/");
        LJLLI = new RBW();
    }

    public final String LIZLLL() {
        String str = this.LJLJJI;
        if (str == null) {
            str = UserStore.LIZLLL();
        }
        this.LJLJJI = str;
        return str;
    }

    public static void LJ() {
        Object obj;
        String LIZLLL = UserStore.LIZLLL();
        synchronized (UserStore.LIZIZ) {
            Iterator it = ((ArrayList) UserStore.LJII()).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((RB3) obj).LIZ, LIZLLL)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            RB3 rb3 = (RB3) obj;
            if (rb3 != null) {
                C65776Prg LIZ = C65352Pkq.LIZ(User.class);
                if (o.LJ(LIZ, C65352Pkq.LIZ(User.class))) {
                    if (rb3.LIZIZ().LJ) {
                        rb3.LIZIZ().LIZJ();
                    } else {
                        rb3.LIZIZ().LIZJ();
                    }
                } else if (o.LJ(LIZ, C65352Pkq.LIZ(UserStore.AccountUser.class))) {
                } else if (o.LJ(LIZ, C65352Pkq.LIZ(SignificantUserInfo.class))) {
                }
            }
        }
        String LIZLLL2 = UserStore.LIZLLL();
        o.LJIIIZ(LIZLLL2, "<set-?>");
        C67737QiD.LIZ = LIZLLL2;
    }

    public final String LIZJ() {
        String LIZLLL = LIZLLL();
        o.LJI(LIZLLL);
        return LIZLLL;
    }

    public final boolean LJFF() {
        if (LIZIZ().getAgeGatePostAction() == 1) {
            return true;
        }
        UserStore.AccountUser accountUser = this.LJLJJLL;
        if (accountUser == null) {
            accountUser = UserStore.LIZ(LIZJ());
        }
        this.LJLJJLL = accountUser;
        if (accountUser != null && accountUser.isKidsMode) {
            return true;
        }
        return false;
    }

    public static SignificantUserInfo LJIIJ(String uid) {
        SignificantUserInfo significantUserInfo;
        Object obj;
        o.LJIIIZ(uid, "uid");
        synchronized (UserStore.LIZIZ) {
            Iterator it = ((ArrayList) UserStore.LJII()).iterator();
            while (true) {
                significantUserInfo = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((RB3) obj).LIZ, uid)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            RB3 rb3 = (RB3) obj;
            if (rb3 != null) {
                C65776Prg LIZ = C65352Pkq.LIZ(SignificantUserInfo.class);
                if (o.LJ(LIZ, C65352Pkq.LIZ(User.class))) {
                    if (rb3.LIZIZ().LJ) {
                        significantUserInfo = (SignificantUserInfo) rb3.LIZIZ().LIZJ();
                    } else {
                        significantUserInfo = (SignificantUserInfo) rb3.LIZIZ().LIZJ();
                    }
                } else if (o.LJ(LIZ, C65352Pkq.LIZ(UserStore.AccountUser.class))) {
                    significantUserInfo = (SignificantUserInfo) rb3.LIZ().LIZJ();
                } else if (o.LJ(LIZ, C65352Pkq.LIZ(SignificantUserInfo.class))) {
                    significantUserInfo = rb3.LIZJ().LIZJ();
                }
            }
        }
        return significantUserInfo;
    }

    public final void LIZ(String str) {
        Object obj;
        if (str == null || UserStore.LJIIIIZZ(str)) {
            return;
        }
        if (o.LJ(str, LIZLLL())) {
            this.LJLJJI = null;
            this.LJLJJL = null;
            this.LJLJJLL = null;
        }
        if (o.LJ(str, UserStore.LIZLLL())) {
            C67737QiD.LIZ = CardStruct.IStatusCode.DEFAULT;
            UserStore.LJ.putString("current_foreground_uid", CardStruct.IStatusCode.DEFAULT).apply();
        }
        synchronized (UserStore.LIZIZ) {
            Iterator it = ((ArrayList) UserStore.LJII()).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((RB3) obj).LIZ, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            RB3 rb3 = (RB3) obj;
            if (rb3 != null) {
                rb3.LIZIZ().LIZLLL(null);
                rb3.LIZ().LIZLLL(null);
                rb3.LIZJ().LIZLLL(null);
                rb3.LIZLLL();
            }
            C65777Prh.LIZ(UserStore.LJII()).remove(rb3);
            SharedPreferences.Editor editor = UserStore.LJ;
            List LIZIZ = UserStore.LIZIZ();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : LIZIZ) {
                if (!o.LJ((String) obj2, str)) {
                    arrayList.add(obj2);
                }
            }
            editor.putString("logged_in_uid_list", ORZ.LLD(arrayList, ",", null, null, null, 62)).apply();
        }
        UserStore.LJI.postValue(UserStore.LIZIZ());
    }

    public final void LJIIIIZZ(String uid) {
        o.LJIIIZ(uid, "uid");
        if (o.LJ(uid, LIZLLL())) {
            return;
        }
        this.LJLJJL = null;
        this.LJLJJI = uid;
        this.LJLJJLL = null;
        C67737QiD.LIZ = uid;
        UserStore.LJ.putString("current_foreground_uid", uid).apply();
    }

    public final void LJIIIZ(String str) {
        if (str == null) {
            return;
        }
        this.LJLJL = str;
        synchronized (UserStore.LIZ) {
            if (!o.LJ(UserStore.LJIIIZ, str)) {
                UserStore.LJIIIZ = str;
                UserStore.LJ.putString("latest_logged_in_uid_list", str).apply();
            }
        }
    }

    public final void LJIIJJI(UserStore.AccountUser accountUser) {
        if (o.LJ(accountUser.uid, LIZJ())) {
            this.LJLJJLL = null;
        }
        AbstractC73672Svk.LJJIIJZLJL(new ACallableS114S0100000_11(accountUser, 0)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZ();
    }

    public final void LJIIL(User user) {
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            User LIZIZ = LIZIZ();
            this.LJLILLLLZI = -1L;
            this.LJLIL = true;
            o.LJI(user);
            LJIIIZ(user.getUid());
            String secUid = user.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            UserStore.LJIIJ(secUid);
            C68542QvC.LIZ.getClass();
            C68542QvC.LIZIZ(4, LIZIZ, user);
            this.LJLJJL = user;
            UserStore.LJIIJJI(user);
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "srcUser.uid");
            C16880lQ.LJLIIL(this, uid);
            LJII();
            UserStore.LIZLLL();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message msg) {
        o.LJIIIZ(msg, "msg");
        Object obj = msg.obj;
        if (obj instanceof Exception) {
            return;
        }
        int i = msg.what;
        if (i != 112) {
            if (i != 113) {
                return;
            }
            C68542QvC.LIZ.getClass();
            C68542QvC.LIZIZ(11, null, null);
            return;
        }
        if (obj == null || !(obj instanceof User)) {
            return;
        }
        if (!C51922KZi.LIZ) {
            LJIIL((User) obj);
        } else {
            C38995FSd.LIZIZ().execute(new ARunnableS30S0200000_11((User) obj, this, 42));
        }
    }
}
