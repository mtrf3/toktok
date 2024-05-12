package com.ss.android.ugc.aweme.user;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69127RBb;
import X.C69128RBc;
import X.C69129RBd;
import X.C73969T1h;
import X.EF7;
import X.F9J;
import X.InterfaceC65349Pkn;
import X.RB3;
import X.T16;
import Y.ACallableS114S0100000_11;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public final class UserStore {
    public static final UserStore LIZ = new UserStore();
    public static final Object LIZIZ = new Object();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C69129RBd.LJLIL);
    public static final SharedPreferences LIZLLL;
    public static final SharedPreferences.Editor LJ;
    public static final C62822Ol8 LJFF;
    public static final MutableLiveData<List<String>> LJI;
    public static final LiveData<List<String>> LJII;
    public static final List<RB3> LJIIIIZZ;
    public static String LJIIIZ;
    public static String LJIIJ;

    static {
        SharedPreferences LIZIZ2 = F9J.LIZIZ(EF7.LIZIZ(), 0, "aweme_user");
        LIZLLL = LIZIZ2;
        LJ = LIZIZ2.edit();
        LJFF = C221108m2.LIZIZ(C69128RBc.LJLIL);
        MutableLiveData<List<String>> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.postValue(LIZIZ());
        LJI = mutableLiveData;
        LiveData<List<String>> map = Transformations.map(mutableLiveData, C69127RBb.LJLIL);
        o.LJIIIIZZ(map, "map(listOfLoggedInUidsMu…return@map uids\n        }");
        LJII = map;
        LJIIIIZZ = new ArrayList();
        LJIIIZ = "";
        LJIIJ = "";
    }

    public static List LIZIZ() {
        boolean z;
        List LJLJJL;
        synchronized (LIZIZ) {
            String string = LIZLLL.getString("logged_in_uid_list", "");
            if (string == null) {
                string = "";
            }
            if (string.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                LJLJJL = C61878OQg.INSTANCE;
            } else {
                LJLJJL = s.LJLJJL(string, new String[]{","}, 0, 6);
            }
        }
        return LJLJJL;
    }

    public static String LIZLLL() {
        String string = LIZLLL.getString("current_foreground_uid", "");
        if (string != null && string.length() > 0) {
            return string;
        }
        if (!LJIIIIZZ(LJFF())) {
            return LJFF();
        }
        User LJI2 = LJI();
        if (LJI2 != null && LJI2.getUid() != null) {
            String uid = LJI2.getUid();
            o.LJIIIIZZ(uid, "user.uid");
            return uid;
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static Gson LJ() {
        return (Gson) LIZJ.getValue();
    }

    public static User LJI() {
        String string = LIZLLL.getString("user_info", "");
        try {
            if (!TextUtils.isEmpty(string)) {
                return (User) LJ().LJI(string, User.class);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String LJFF() {
        String uid;
        long j = F9J.LIZIZ(EF7.LIZIZ(), 0, "com.ss.spipe_setting").getLong("user_id", 0L);
        if (j > 0) {
            return String.valueOf(j);
        }
        User LJI2 = LJI();
        if (LJI2 != null && (uid = LJI2.getUid()) != null) {
            return uid;
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        ((java.util.ArrayList) com.ss.android.ugc.aweme.user.UserStore.LJIIIIZZ).add(new X.RB3(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJII() {
        /*
            java.util.List r5 = LIZIZ()
            java.util.Iterator r4 = r5.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.List<X.RB3> r0 = com.ss.android.ugc.aweme.user.UserStore.LJIIIIZZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L1c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.RB3 r0 = (X.RB3) r0
            java.lang.String r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r3)
            if (r0 == 0) goto L1c
            if (r1 != 0) goto L8
        L33:
            java.util.List<X.RB3> r1 = com.ss.android.ugc.aweme.user.UserStore.LJIIIIZZ
            X.RB3 r0 = new X.RB3
            r0.<init>(r3)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
            goto L8
        L40:
            java.util.List<X.RB3> r3 = com.ss.android.ugc.aweme.user.UserStore.LJIIIIZZ
            kotlin.jvm.internal.AqS177S0100000_11 r2 = new kotlin.jvm.internal.AqS177S0100000_11
            r0 = 20
            r2.<init>(r5, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L5c
            X.RBa r0 = new X.RBa
            r0.<init>(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.removeIf(r0)
        L59:
            java.util.List<X.RB3> r0 = com.ss.android.ugc.aweme.user.UserStore.LJIIIIZZ
            return r0
        L5c:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r1 = r3.iterator()
        L62:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L62
            r1.remove()
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.user.UserStore.LJII():java.util.List");
    }

    public static AccountUser LIZ(String str) {
        AccountUser accountUser;
        Object obj;
        synchronized (LIZIZ) {
            Iterator it = ((ArrayList) LJII()).iterator();
            while (true) {
                accountUser = null;
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
                C65776Prg LIZ2 = C65352Pkq.LIZ(AccountUser.class);
                if (o.LJ(LIZ2, C65352Pkq.LIZ(User.class))) {
                    if (rb3.LIZIZ().LJ) {
                        accountUser = (AccountUser) rb3.LIZIZ().LIZJ();
                    } else {
                        accountUser = (AccountUser) rb3.LIZIZ().LIZJ();
                    }
                } else if (o.LJ(LIZ2, C65352Pkq.LIZ(AccountUser.class))) {
                    accountUser = rb3.LIZ().LIZJ();
                } else if (o.LJ(LIZ2, C65352Pkq.LIZ(SignificantUserInfo.class))) {
                    accountUser = (AccountUser) rb3.LIZJ().LIZJ();
                }
            }
        }
        return accountUser;
    }

    public static User LIZJ(boolean z) {
        User user;
        Object obj;
        String LIZLLL2 = LIZLLL();
        synchronized (LIZIZ) {
            Iterator it = ((ArrayList) LJII()).iterator();
            while (true) {
                user = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((RB3) obj).LIZ, LIZLLL2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            RB3 rb3 = (RB3) obj;
            if (rb3 != null) {
                C65776Prg LIZ2 = C65352Pkq.LIZ(User.class);
                if (o.LJ(LIZ2, C65352Pkq.LIZ(User.class))) {
                    if (rb3.LIZIZ().LJ) {
                        user = rb3.LIZIZ().LIZJ();
                    } else if (z) {
                        SignificantUserInfo LIZJ2 = rb3.LIZJ().LIZJ();
                        if (LIZJ2 != null) {
                            user = new User();
                            user.setUid(LIZJ2.uid);
                            user.setShortId(LIZJ2.shortId);
                            user.setUniqueId(LIZJ2.uniqueId);
                            user.setNickname(LIZJ2.nickname);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                        }
                    } else {
                        user = rb3.LIZIZ().LIZJ();
                    }
                } else if (o.LJ(LIZ2, C65352Pkq.LIZ(AccountUser.class))) {
                    user = (User) rb3.LIZ().LIZJ();
                } else if (o.LJ(LIZ2, C65352Pkq.LIZ(SignificantUserInfo.class))) {
                    user = (User) rb3.LIZJ().LIZJ();
                }
                if (user != null) {
                    return user;
                }
            }
        }
        return (User) LJFF.getValue();
    }

    public static boolean LJIIIIZZ(String str) {
        if (str == null || str.length() == 0 || o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
            return true;
        }
        return false;
    }

    public static User LJIIIZ(String uid) {
        User user;
        Object obj;
        o.LJIIIZ(uid, "uid");
        synchronized (LIZIZ) {
            Iterator it = ((ArrayList) LJII()).iterator();
            while (true) {
                user = null;
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
                C65776Prg LIZ2 = C65352Pkq.LIZ(User.class);
                if (o.LJ(LIZ2, C65352Pkq.LIZ(User.class))) {
                    if (rb3.LIZIZ().LJ) {
                        user = rb3.LIZIZ().LIZJ();
                    } else {
                        user = rb3.LIZIZ().LIZJ();
                    }
                } else if (o.LJ(LIZ2, C65352Pkq.LIZ(AccountUser.class))) {
                    user = (User) rb3.LIZ().LIZJ();
                } else if (o.LJ(LIZ2, C65352Pkq.LIZ(SignificantUserInfo.class))) {
                    user = (User) rb3.LIZJ().LIZJ();
                }
            }
        }
        return user;
    }

    public static final synchronized void LJIIJ(String str) {
        synchronized (UserStore.class) {
            if (o.LJ(LJIIJ, str)) {
                return;
            }
            LJIIJ = str;
            Keva.getRepo("keva_aweme_account_user").storeString("last_recorded_sec_uid", str);
        }
    }

    public static void LJIIJJI(User u) {
        o.LJIIIZ(u, "u");
        AbstractC73672Svk.LJJIIJZLJL(new ACallableS114S0100000_11(u, 1)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZ();
    }

    /* loaded from: classes12.dex */
    public static final class AccountUser {
        public static final /* synthetic */ int LIZ = 0;

        @InterfaceC65349Pkn("country_code")
        public String countryCode;

        @InterfaceC65349Pkn("is_kids_mode")
        public final boolean isKidsMode;

        @InterfaceC65349Pkn("name")
        public final String name;

        @InterfaceC65349Pkn("privacy_highlights")
        public final int privacyHighlights;

        @InterfaceC65349Pkn("private_account_prompt")
        public final int privateAccountPrompt;

        @InterfaceC65349Pkn("sec_uid")
        public String secUid;

        @InterfaceC65349Pkn("session_key")
        public final String session;

        @InterfaceC65349Pkn("uid")
        public final String uid;

        @InterfaceC65349Pkn("user_verified")
        public final boolean userVerified;

        public AccountUser(String uid, String session, String name, boolean z, String countryCode, String secUid, boolean z2, int i, int i2) {
            o.LJIIIZ(uid, "uid");
            o.LJIIIZ(session, "session");
            o.LJIIIZ(name, "name");
            o.LJIIIZ(countryCode, "countryCode");
            o.LJIIIZ(secUid, "secUid");
            this.uid = uid;
            this.session = session;
            this.name = name;
            this.userVerified = z;
            this.countryCode = countryCode;
            this.secUid = secUid;
            this.isKidsMode = z2;
            this.privateAccountPrompt = i;
            this.privacyHighlights = i2;
        }

        public /* synthetic */ AccountUser(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? "" : str4, (i3 & 32) == 0 ? str5 : "", (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? 0 : i, (i3 & 256) == 0 ? i2 : 0);
        }
    }
}
