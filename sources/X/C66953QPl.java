package X;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: X.QPl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66953QPl implements WeakHandler.IHandler {
    public static C66953QPl LJZL;
    public static volatile boolean LL;
    public static volatile boolean LLD;
    public volatile boolean LJLIL;
    public volatile boolean LJLILLLLZI;
    public volatile boolean LJLJI;
    public volatile String LJLJJI;
    public volatile String LJLJJL;
    public final FX7 LJLJJLL;
    public final Context LJLJL;
    public final WeakHandler LJLJLJ;
    public volatile int LJLJLLL;
    public volatile boolean LJLLI;
    public final R7H LJLLILLLL;
    public final InterfaceC66963QPv LJLLJ;
    public volatile boolean LJLLL;
    public volatile boolean LJLLLLLL;
    public volatile boolean LJLZ;
    public volatile JSONObject LJZ;
    public final C66857QLt LJZI;
    public volatile boolean LJLL = true;
    public volatile boolean LJLLLL = true;

    public final void LIZ() {
        LJFF("");
        this.LJLILLLLZI = false;
        C66857QLt c66857QLt = this.LJZI;
        if (c66857QLt != null) {
            C66856QLs c66856QLs = new C66856QLs(c66857QLt.LIZ);
            c66856QLs.LIZIZ.put("X-Tt-Token", "");
            c66856QLs.LIZ();
        }
    }

    public static String LIZIZ(Object obj) {
        String obj2 = obj.toString();
        if (TextUtils.isEmpty(obj2)) {
            return "";
        }
        if (obj2.length() > 10) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(obj2.substring(0, 9));
            LIZ.append("***");
            LIZ.append(obj2.substring(obj2.length() - 5));
            return X1D.LIZIZ(LIZ);
        }
        return obj2;
    }

    public final boolean LIZLLL(String str) {
        if (!this.LJLL) {
            return false;
        }
        java.util.Set<String> set = this.LJLJJLL.LIZIZ;
        if (TextUtils.isEmpty(str) || set == null) {
            return false;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) set;
        if (copyOnWriteArraySet.isEmpty()) {
            return false;
        }
        try {
            String lowerCase = new java.net.URI(str).getHost().toLowerCase();
            if (TextUtils.isEmpty(lowerCase)) {
                return false;
            }
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!TextUtils.isEmpty(str2) && lowerCase.endsWith(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            C38901fq.LJI(e);
            return false;
        }
    }

    public final void LJFF(String str) {
        this.LJLJJI = str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setToken token ");
        LIZ.append(LIZIZ(str));
        LIZ.append("    ");
        LIZ.append(android.util.Log.getStackTraceString(new Exception()));
        FXA.LIZ("TokenFactory", X1D.LIZIZ(LIZ));
    }

    public final void LJI(boolean z) {
        boolean z2;
        if (LLD && !this.LJLIL) {
            this.LJLIL = true;
            this.LJLLL = true;
            try {
                z2 = C2NU.LIZ.LIZIZ();
            } catch (Exception unused) {
                z2 = false;
            }
            if (!z2) {
                this.LJLJLLL++;
                this.LJLJLJ.sendEmptyMessageDelayed(1000, Math.min(this.LJLJLLL * 10000, this.LJLJJLL.LIZJ));
                this.LJLIL = false;
                return;
            }
            InterfaceC66963QPv interfaceC66963QPv = this.LJLLJ;
            if (interfaceC66963QPv == null || !((QTW) interfaceC66963QPv).LLIIIJ) {
                this.LJLJLJ.sendEmptyMessageDelayed(1000, this.LJLJJLL.LIZJ);
                this.LJLIL = false;
                return;
            }
            this.LJLJLLL = 0;
            String LIZJ = LIZJ(null, z, false);
            if (TextUtils.isEmpty(LIZJ)) {
                return;
            }
            QQM.LJIIJJI(this.LJLJL, LIZJ, new C66954QPm(this, LIZJ)).LJIIIZ();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        int i = message.what;
        if (i == 1000) {
            this.LJLJLJ.removeMessages(1000);
            LJI(false);
            return;
        }
        if (i != 2000 || !LLD) {
            return;
        }
        C66960QPs.LIZ().getClass();
        InterfaceC66963QPv interfaceC66963QPv = this.LJLLJ;
        if (interfaceC66963QPv != null && ((QTW) interfaceC66963QPv).LLIIIJ) {
            if (!this.LJLLL) {
                C38901fq.LJFF("token_beat_not_poll", this.LJLJL.getString(R.string.hjd), null);
            } else if (this.LJLLLL) {
                QSV.LIZ().getClass();
            }
        }
        if (!this.LJLLLL) {
            C38901fq.LJFF("token_beat_not_config", this.LJLJL.getString(R.string.dsf), this.LJZ);
            QSV.LIZ().getClass();
        }
        if (!this.LJLLLLLL || !this.LJLZ) {
            C38901fq.LJFF("sdk-version-not-add", this.LJLJL.getString(R.string.qba), null);
            QSV.LIZ().getClass();
        } else {
            QSV.LIZ().getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66953QPl(android.content.Context r13, X.FX7 r14) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66953QPl.<init>(android.content.Context, X.FX7):void");
    }

    public final String LIZJ(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        EZR ezr = new EZR(i0.LJFF(this.LJLJJLL.LIZ, "/passport/token/beat/v2/"));
        if (z) {
            str2 = "boot";
        } else {
            str2 = "polling";
        }
        if (z2) {
            str2 = "wap_login";
        }
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        ezr.LIZ.put(WM7.SCENE_SERVICE, str);
        if (this.LJLLI) {
            str3 = "true";
        } else {
            str3 = "false";
        }
        ezr.LIZ.put("first_beat", str3);
        return ezr.toString();
    }

    public final void LJ(String str, List list, boolean z) {
        InterfaceC66963QPv interfaceC66963QPv;
        C38901fq.LJII(str, list, z);
        if (LLD && (interfaceC66963QPv = this.LJLLJ) != null && ((QTW) interfaceC66963QPv).LLIIIJ) {
            LIZ();
            ((QTW) this.LJLLJ).LIZJ(true);
            R7H r7h = this.LJLLILLLL;
            if (r7h != null) {
                r7h.LJJIIJ("sdk_expired_logout", null, null);
            }
        }
    }
}
