package X;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.common.applog.AppLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QTW implements WeakHandler.IHandler, InterfaceC66963QPv {
    public static volatile QTW LLIZ;
    public final R7H LJLIL;
    public int LJLJJLL;
    public int LJLJLLL;
    public int LJLLI;
    public int LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public long LJLLLL;
    public int LJZL;
    public int LL;
    public int LLD;
    public String LLF;
    public long LLFII;
    public boolean LLI;
    public int LLIIII;
    public boolean LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public long LLIIIZ;
    public int LLIIL;
    public int LLIILII;
    public int LLIILZL;
    public int LLIIZ;
    public boolean LLIL;
    public QTZ LLILII;
    public java.util.Set<String> LLILIL;
    public boolean LLILL;
    public final C67046QTa[] LLILLIZIL;
    public boolean LLILLJJLI;
    public Context LLILLL;
    public static final C67046QTa[] LLILZLL = {new C67046QTa("mobile"), new C67046QTa("email"), new C67046QTa("google"), new C67046QTa("facebook"), new C67046QTa("twitter"), new C67046QTa("instagram"), new C67046QTa("line"), new C67046QTa("kakaotalk"), new C67046QTa("vk"), new C67046QTa("tiktok")};
    public static final List<QQL> LLIZLLLIL = new ArrayList();
    public String LJLILLLLZI = "";
    public String LJLJI = "";
    public String LJLJJI = "";
    public String LJLJJL = "";
    public String LJLJL = "";
    public String LJLJLJ = "";
    public String LJLL = "";
    public String LJLLLLLL = "";
    public String LJLZ = "";
    public String LJZ = "";
    public String LJZI = "";
    public String LLFF = "";
    public String LLFFF = "";
    public String LLFZ = "";
    public String LLIFFJFJJ = "";
    public String LLII = "";
    public String LLIIJI = "";
    public String LLIIJLIL = "";
    public final WeakHandler LLILZ = new WeakHandler(C16880lQ.LLJJJJ(), this);
    public final OJM<InterfaceC65888PtU> LLILZIL = new OJM<>();

    public final void LIZLLL() {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        boolean z = false;
        SharedPreferences LIZIZ = F9J.LIZIZ(this.LLILLL, 0, "com.bytedance.sdk.account_setting");
        this.LLIIIJ = LIZIZ.getBoolean("is_login", false);
        this.LLFII = LIZIZ.getLong("user_id", 0L);
        this.LLFZ = LIZIZ.getString("sec_user_id", "");
        this.LLIIIILZ = LIZIZ.getBoolean("is_new_user", false);
        this.LLII = LIZIZ.getString("session_key", "");
        this.LJLZ = LIZIZ.getString("user_name", "");
        this.LJLJLLL = LIZIZ.getInt("user_gender", 0);
        this.LJZ = LIZIZ.getString("screen_name", "");
        this.LLIFFJFJJ = LIZIZ.getString("verified_content", "");
        this.LLI = LIZIZ.getBoolean("user_verified", false);
        this.LJLJI = LIZIZ.getString("avatar_url", "");
        this.LJLJJL = LIZIZ.getString("user_birthday", "");
        this.LJLILLLLZI = LIZIZ.getString("area", "");
        this.LJLL = LIZIZ.getString("user_industry", "");
        this.LJLJLJ = LIZIZ.getString("user_email", "");
        this.LJLLLLLL = LIZIZ.getString("user_mobile", "");
        this.LLFFF = LIZIZ.getString("user_decoration", "");
        this.LJLJL = LIZIZ.getString("user_description", "");
        this.LJLLJ = LIZIZ.getBoolean("is_recommend_allowed", false);
        this.LJZI = LIZIZ.getString("recommend_hint_message", "");
        this.LJLLI = LIZIZ.getInt("is_blocked", 0);
        this.LJLLILLLL = LIZIZ.getInt("is_blocking", 0);
        this.LJLLL = LIZIZ.getBoolean("is_toutiao", false);
        this.LLIIIL = LIZIZ.getBoolean("user_has_pwd", false);
        this.LLIIII = LIZIZ.getInt("country_code", 0);
        this.LLIIIZ = LIZIZ.getLong("pgc_mediaid", 0L);
        this.LLIIJI = LIZIZ.getString("pgc_avatar_url", "");
        this.LLIIJLIL = LIZIZ.getString("pgc_name", "");
        this.LJLJJLL = LIZIZ.getInt("can_be_found_by_phone", 1);
        this.LJZL = LIZIZ.getInt("can_sync_share", 0);
        this.LL = LIZIZ.getInt("user_privacy_extend", 0);
        this.LLD = LIZIZ.getInt("user_privacy_extend_value", 2147483646);
        this.LJLJJI = LIZIZ.getString("bg_img_url", "");
        this.LLF = LIZIZ.getString("multi_sids", "");
        this.LLIILII = LIZIZ.getInt("following_count", 0);
        this.LLIILZL = LIZIZ.getInt("followers_count", 0);
        this.LLIIZ = LIZIZ.getInt("visitors_count", 0);
        this.LJLLLL = LIZIZ.getLong("media_id", 0L);
        this.LJLJJI = LIZIZ.getString("bg_img_url", "");
        this.LLIIL = LIZIZ.getInt("display_ocr_entrance", 0);
        this.LLFF = LIZIZ.getString("user_auth_info", "");
        this.LLIL = LIZIZ.getBoolean("is_visitor_account", false);
        this.LLILIL = LIZIZ.getStringSet("has_update_sec_uids", new HashSet());
        this.LLILL = LIZIZ.getBoolean("is_kids_mode", false);
        if (this.LLIIIJ) {
            if (this.LLFII <= 0) {
                this.LLIIIJ = false;
                this.LLFII = 0L;
                this.LLFZ = "";
            }
        } else if (this.LLFII > 0) {
            this.LLFII = 0L;
            this.LLFZ = "";
        }
        int i = 0;
        while (true) {
            C67046QTa[] c67046QTaArr = this.LLILLIZIL;
            if (i >= c67046QTaArr.length) {
                break;
            }
            C67046QTa c67046QTa = c67046QTaArr[i];
            c67046QTa.LIZIZ = z;
            try {
                if (!TextUtils.isEmpty(c67046QTa.LIZ)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("_platform_");
                    LIZ.append(c67046QTa.LIZ);
                    String string = LIZIZ.getString(X1D.LIZIZ(LIZ), null);
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject = new JSONObject(string);
                        try {
                            if (C38354F3m.LIZJ(jSONObject.optString("mName", ""), c67046QTa.LIZ)) {
                                if (jSONObject.has("mNickname")) {
                                    c67046QTa.LIZJ = jSONObject.optString("mNickname", "");
                                }
                                if (jSONObject.has("mAvatar")) {
                                    c67046QTa.LIZLLL = jSONObject.optString("mAvatar", "");
                                }
                                if (jSONObject.has("mPlatformUid")) {
                                    c67046QTa.LJ = jSONObject.optString("mPlatformUid", "");
                                }
                                if (jSONObject.has("mExpire")) {
                                    try {
                                        c67046QTa.LJII = jSONObject.optLong("mExpire", c67046QTa.LJII);
                                    } catch (Exception e) {
                                        e = e;
                                        C16880lQ.LLLLIIL(e);
                                        i++;
                                        z = false;
                                    }
                                }
                                if (jSONObject.has("mExpireIn")) {
                                    c67046QTa.LJIIIIZZ = jSONObject.optLong("mExpireIn", c67046QTa.LJIIIIZZ);
                                }
                                if (jSONObject.has("isLogin")) {
                                    c67046QTa.LIZIZ = jSONObject.optBoolean("isLogin", false);
                                }
                                if (jSONObject.has("mUserId")) {
                                    try {
                                        c67046QTa.LJIIIZ = jSONObject.optLong("mUserId", 0L);
                                    } catch (Exception e2) {
                                        e = e2;
                                        C16880lQ.LLLLIIL(e);
                                        i++;
                                        z = false;
                                    }
                                }
                                if (jSONObject.has("mModifyTime")) {
                                    c67046QTa.LJI = jSONObject.optLong("mModifyTime");
                                }
                                if (jSONObject.has("mSecPlatformUid")) {
                                    c67046QTa.LJFF = jSONObject.optString("mSecPlatformUid");
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                    }
                }
            } catch (Exception e4) {
                e = e4;
            }
            i++;
            z = false;
        }
        if (this.LLFII > 0) {
            LJII(this.LLII);
        }
        QTX qtx = new QTX();
        qtx.LIZ = this.LLFII;
        qtx.LJ = this.LLIIIILZ;
        qtx.LJFF = this.LLII;
        qtx.LJIILL = this.LJLZ;
        qtx.LJJIJIIJIL = this.LJLJLLL;
        qtx.LJIJ = this.LJZ;
        qtx.LJIJI = this.LLIFFJFJJ;
        qtx.LJIIZILJ = this.LJLJI;
        qtx.LJJIJL = this.LJLJJL;
        qtx.LJJIJIL = this.LLI;
        qtx.LJJIJLIJ = this.LJLILLLLZI;
        qtx.LJJIL = this.LJLL;
        qtx.LJJIFFI = this.LLFFF;
        qtx.LJIILLIIL = this.LJLJL;
        qtx.LJJ = this.LJLLJ;
        qtx.LJJI = this.LJZI;
        qtx.LJJIII = this.LJLJJLL;
        qtx.LJJIIJ = this.LJZL;
        qtx.LJJIJ = this.LJLJJI;
        long j = this.LJLLLL;
        qtx.LJJIIZI = j;
        qtx.LJII = this.LJLJLJ;
        qtx.LJJII = this.LLFF;
        qtx.LJJIJIIJI = this.LLIIL;
        qtx.LJJIIZ = this.LLD;
        qtx.LJJIIJZLJL = this.LL;
        qtx.LJJJ = this.LJLLI;
        qtx.LJJIZ = this.LJLLILLLL;
        qtx.LJJJI = this.LJLLL;
        qtx.LJJJIL = this.LLIIIL;
        qtx.LJIJJLI = this.LLIIJI;
        qtx.LJIJJ = j;
        qtx.LJIL = this.LLIIJLIL;
        qtx.LIZLLL = this.LLIIII;
        qtx.LJIIIIZZ = this.LLFZ;
        qtx.LJIIJ = this.LLIL;
        qtx.LJIIJJI = this.LLILL;
        for (C67046QTa c67046QTa2 : this.LLILLIZIL) {
            if (!TextUtils.isEmpty(c67046QTa2.LIZ) && c67046QTa2.LIZIZ) {
                ((HashMap) qtx.LIZIZ).put(c67046QTa2.LIZ, c67046QTa2);
            }
        }
        this.LLILII = qtx;
    }

    public final void LJI() {
        SharedPreferences.Editor edit = F9J.LIZIZ(this.LLILLL, 0, "com.bytedance.sdk.account_setting").edit();
        for (C67046QTa c67046QTa : this.LLILLIZIL) {
            if (!this.LLIIIJ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("_platform_");
                LIZ.append(c67046QTa.LIZ);
                edit.putString(X1D.LIZIZ(LIZ), "");
            } else if (c67046QTa.LIZIZ) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("mName", c67046QTa.LIZ);
                    jSONObject.put("mNickname", c67046QTa.LIZJ);
                    jSONObject.put("mAvatar", c67046QTa.LIZLLL);
                    jSONObject.put("mPlatformUid", c67046QTa.LJ);
                    jSONObject.put("mExpire", c67046QTa.LJII);
                    jSONObject.put("mExpireIn", c67046QTa.LJIIIIZZ);
                    jSONObject.put("isLogin", c67046QTa.LIZIZ);
                    jSONObject.put("mUserId", c67046QTa.LJIIIZ);
                    jSONObject.put("mModifyTime", c67046QTa.LJI);
                    jSONObject.put("mSecPlatformUid", c67046QTa.LJFF);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("_platform_");
                    LIZ2.append(c67046QTa.LIZ);
                    edit.putString(X1D.LIZIZ(LIZ2), jSONObject.toString());
                } catch (Exception unused) {
                }
            }
        }
        edit.apply();
        edit.remove("session");
        edit.putBoolean("is_login", this.LLIIIJ);
        edit.putLong("user_id", this.LLFII);
        edit.putString("sec_user_id", this.LLFZ);
        edit.putString("session_key", this.LLII);
        edit.putString("user_name", this.LJLZ);
        edit.putString("verified_content", this.LLIFFJFJJ);
        edit.putInt("user_gender", this.LJLJLLL);
        edit.putString("screen_name", this.LJZ);
        edit.putBoolean("user_verified", this.LLI);
        edit.putString("avatar_url", this.LJLJI);
        edit.putBoolean("is_new_user", this.LLIIIILZ);
        edit.putString("user_email", this.LJLJLJ);
        edit.putString("user_mobile", this.LJLLLLLL);
        edit.putInt("is_blocked", this.LJLLI);
        edit.putInt("is_blocking", this.LJLLILLLL);
        edit.putBoolean("is_toutiao", this.LJLLL);
        edit.putBoolean("user_has_pwd", this.LLIIIL);
        edit.putInt("country_code", this.LLIIII);
        edit.putString("area", this.LJLILLLLZI);
        edit.putString("user_industry", this.LJLL);
        edit.putString("user_decoration", this.LLFFF);
        edit.putString("user_birthday", this.LJLJJL);
        edit.putLong("pgc_mediaid", this.LLIIIZ);
        edit.putString("pgc_avatar_url", this.LLIIJI);
        edit.putString("pgc_name", this.LLIIJLIL);
        edit.putString("user_description", this.LJLJL);
        edit.putBoolean("is_recommend_allowed", this.LJLLJ);
        edit.putString("recommend_hint_message", this.LJZI);
        edit.putInt("can_be_found_by_phone", this.LJLJJLL);
        edit.putInt("can_sync_share", this.LJZL);
        edit.putInt("following_count", this.LLIILII);
        edit.putInt("followers_count", this.LLIILZL);
        edit.putInt("visitors_count", this.LLIIZ);
        edit.putLong("media_id", this.LJLLLL);
        edit.putString("bg_img_url", this.LJLJJI);
        edit.putInt("display_ocr_entrance", this.LLIIL);
        edit.putString("user_auth_info", this.LLFF);
        edit.putInt("user_privacy_extend", this.LL);
        edit.putInt("user_privacy_extend_value", this.LLD);
        edit.putBoolean("is_visitor_account", this.LLIL);
        edit.putBoolean("is_kids_mode", this.LLILL);
        WX6.LIZ(edit);
    }

    public QTW(Context context) {
        ArrayList arrayList = (ArrayList) LLIZLLLIL;
        arrayList.add(new QTY());
        arrayList.add(new QQH());
        this.LLILLL = context;
        this.LLILLJJLI = false;
        this.LLILLIZIL = LLILZLL;
        try {
            LIZLLL();
        } catch (Exception e) {
            FXA.LIZ("BDAccountManager", e.getMessage());
        }
        this.LJLIL = new R7H(this.LLILLL);
    }

    public static InterfaceC66963QPv LIZIZ(Context context) {
        if (LLIZ == null) {
            synchronized (QTW.class) {
                if (LLIZ == null) {
                    LLIZ = new QTW(context);
                }
            }
        }
        QTW qtw = LLIZ;
        if (!(qtw.LLILLL instanceof Application) && context != null && C16880lQ.LLLLL(context) != null) {
            qtw.LLILLL = C16880lQ.LLLLL(context);
        }
        return LLIZ;
    }

    public static void LJII(String str) {
        try {
            ((QWR) C66960QPs.LIZ()).getClass();
            AppLog.setSessionKey(str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LIZ(InterfaceC65888PtU interfaceC65888PtU) {
        synchronized (this.LLILZIL) {
            this.LLILZIL.LJIIZILJ(interfaceC65888PtU);
        }
    }

    public final void LIZJ(boolean z) {
        if (this.LLIIIJ) {
            this.LLIIIILZ = false;
            this.LLIIIJ = false;
            this.LLFII = 0L;
            this.LLII = "";
            this.LLFZ = "";
            LJII("");
            this.LJLZ = "";
            this.LJLJLLL = 0;
            this.LJZ = "";
            this.LLIFFJFJJ = "";
            this.LJLJL = "";
            this.LJLILLLLZI = "";
            this.LJLL = "";
            this.LJLLI = 0;
            this.LJLLILLLL = 0;
            this.LLFFF = "";
            this.LJLJJL = "";
            this.LLI = false;
            this.LJLLJ = false;
            this.LJLLL = false;
            this.LLIIII = 0;
            this.LLIILII = 0;
            this.LLIILZL = 0;
            this.LLIIZ = 0;
            this.LLIIIL = false;
            this.LJLLLL = 0L;
            this.LJLJJI = "";
            this.LJLJLJ = "";
            this.LJLLLLLL = "";
            this.LLIIL = 0;
            this.LLIIJI = "";
            this.LLIIIZ = 0L;
            this.LLIIJLIL = "";
            this.LLFF = "";
            this.LLIL = false;
            for (C67046QTa c67046QTa : this.LLILLIZIL) {
                c67046QTa.LIZ();
            }
            LJI();
        }
        if (z) {
            C65886PtS c65886PtS = new C65886PtS(2);
            if (C66957QPp.LIZLLL != null) {
                C66957QPp c66957QPp = C66957QPp.LIZLLL;
                if (c66957QPp.LIZJ != null) {
                    Pair pair = new Pair(Integer.valueOf(c66957QPp.LIZJ.LIZIZ), c66957QPp.LIZJ.LIZ);
                    ((Integer) pair.first).intValue();
                    c65886PtS.LIZIZ = (String) pair.second;
                } else {
                    c66957QPp.LIZJ = null;
                }
            }
            synchronized (this.LLILZIL) {
                Iterator<InterfaceC65888PtU> it = this.LLILZIL.iterator();
                while (it.hasNext()) {
                    it.next().LIZLLL(c65886PtS);
                }
            }
        }
    }

    public final void LJ(String str) {
        if (C66957QPp.LIZLLL == null) {
            synchronized (C66957QPp.class) {
                if (C66957QPp.LIZLLL == null) {
                    C66957QPp.LIZLLL = new C66957QPp(this);
                }
            }
        }
        C66957QPp.LIZLLL.LIZIZ(str);
    }

    public final void LJIIIIZZ(QXG qxg) {
        if (!this.LLIIIJ) {
            WeakHandler weakHandler = this.LLILZ;
            if (weakHandler != null) {
                weakHandler.sendEmptyMessageDelayed(1000, 600000L);
                return;
            }
            return;
        }
        R7H r7h = this.LJLIL;
        if (r7h != null) {
            r7h.LJJIII("polling", new C67048QTc(this, qxg));
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        QQ3 qq3;
        QQI qqi;
        if (message.what == 100) {
            Object obj = message.obj;
            if ((obj instanceof QQ3) && (qqi = (qq3 = (QQ3) obj).LIZIZ) != null) {
                Iterator it = ((ArrayList) LLIZLLLIL).iterator();
                while (it.hasNext()) {
                    ((QQL) it.next()).LIZ(qqi);
                }
                QQE qqe = qq3.LIZ;
                if (qqe != null) {
                    qqe.dispatchOnResponse(qq3.LIZIZ);
                    QQ8 qq8 = qqe.mJobController;
                    if (qq8 != null) {
                        ((AbstractC66965QPx) qq8).LJ = null;
                    }
                }
            }
        }
        if (message.what == 1000) {
            this.LLILZ.removeMessages(1000);
            LJIIIIZZ(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x02fd, code lost:
    
        if (r14 != false) goto L163;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.QTZ r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QTW.LJFF(X.QTZ, boolean):void");
    }
}
