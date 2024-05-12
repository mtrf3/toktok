package X;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.app.services.DownloadService;
import com.ss.android.ugc.aweme.app.services.IDownloadService;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import defpackage.a1;
import defpackage.b1;
import java.net.URLEncoder;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.O6g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61358O6g {
    public static volatile boolean LIZ = false;
    public static volatile C61360O6i LIZIZ = null;
    public static volatile boolean LIZJ = true;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static final Object LJFF = new Object();

    public static boolean LJFF() {
        if (!LIZLLL) {
            synchronized (LJFF) {
                if (!LIZLLL) {
                    LIZJ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("splash_ad_enable", true);
                    if (((Boolean) VJB.LIZJ.getValue()).booleanValue()) {
                        float f = C54968Lhk.LIZJ;
                        if (f > 0.0f && f <= 4.5f) {
                            LIZJ = false;
                        }
                    }
                    LIZLLL = true;
                }
            }
        }
        return LIZJ;
    }

    public static void LIZIZ(Context context) {
        if (LIZ) {
            return;
        }
        synchronized (C61358O6g.class) {
            if (LIZ) {
                return;
            }
            LIZLLL(context);
            C61363O6l.LIZIZ(context, null);
            LIZIZ = O6X.LIZ;
            LJ(C16880lQ.LLLLL(context), LIZIZ);
            C84763XOl.LJI().LJJJLIIL(C61361O6j.LJLIL, new InterfaceC64592gB() { // from class: X.9Dr
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
            C84763XOl.LJII().LJJJLIIL(O6Y.LJLIL, new InterfaceC64592gB() { // from class: X.9Ds
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
            C84763XOl.LIZLLL().LJJJLIIL(C39097FWb.LJLIL, new InterfaceC64592gB() { // from class: X.9Dq
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
            C84763XOl.LJII().LJJJLIIL(C59756Ncm.LJLIL, new InterfaceC64592gB() { // from class: X.9Do
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
            C84763XOl.LJI().LJJJLIIL(C59298NPa.LJLIL, new InterfaceC64592gB() { // from class: X.9Dn
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
            LIZ = true;
        }
    }

    public static String LIZJ(String str) {
        String LIZ2;
        String curUserId = NW6.LIZ().getCurUserId();
        if (!TextUtils.isEmpty(curUserId)) {
            str = a1.LJ(str, "&user_id=", curUserId);
        }
        StringBuilder LIZJ2 = b1.LIZJ(str, "&gaid=");
        LIZJ2.append(URLEncoder.encode(NW6.LIZ().LJJIJ()));
        String LIZIZ2 = X1D.LIZIZ(LIZJ2);
        LIZ2 = FLE.LIZ("other");
        if (!TextUtils.isEmpty(LIZ2)) {
            StringBuilder LIZJ3 = b1.LIZJ(LIZIZ2, "&ad_user_agent=");
            LIZJ3.append(URLEncoder.encode(LIZ2));
            LIZIZ2 = X1D.LIZIZ(LIZJ3);
        }
        StringBuilder LIZJ4 = b1.LIZJ(LIZIZ2, "&cmpl_enc=");
        LIZJ4.append(NW6.LIZ().LJIILL());
        StringBuilder LIZJ5 = b1.LIZJ(X1D.LIZIZ(LIZJ4), "&os_boot_time=");
        LIZJ5.append(NW6.LIZ().LJIIIIZZ());
        StringBuilder LIZJ6 = b1.LIZJ(X1D.LIZIZ(LIZJ5), "&sp=");
        LIZJ6.append(C47497IkX.LIZJ());
        String LIZIZ3 = X1D.LIZIZ(LIZJ6);
        StringBuilder LIZ3 = X1D.LIZ();
        return JBR.LJFF(LIZ3, C42952GtQ.LIZ, LIZIZ3, LIZ3);
    }

    public static void LIZLLL(Context context) {
        HashMap<String, String> hashMap;
        Object LIZ2;
        JSONObject jSONObject = null;
        if (LJFF() && !((Boolean) C34683DjL.LIZ.getValue()).booleanValue()) {
            hashMap = NW6.LIZ().LJJIIZI();
        } else {
            hashMap = null;
        }
        boolean LJFF2 = LJFF();
        C59754Nck c59754Nck = new C59754Nck(context);
        C61365O6n c61365O6n = new C61365O6n();
        c61365O6n.LJII = new O70((TelephonyManager) C16880lQ.LLILL(context, "phone"));
        c61365O6n.LJ = hashMap;
        c61365O6n.LJFF = c59754Nck;
        c61365O6n.LJI = LJFF2;
        if (((Boolean) DP5.LIZ.getValue()).booleanValue()) {
            c61365O6n.LIZ = C38995FSd.LIZLLL();
            c61365O6n.LIZIZ = C38995FSd.LJFF();
            c61365O6n.LIZJ = C38995FSd.LJFF();
            c61365O6n.LIZLLL = C38995FSd.LJ();
        }
        try {
            SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
            LIZ2 = C61369O6r.LIZ;
            m mVar = (m) LIZLLL2.LJIIIIZZ("splash_setting_json", m.class, LIZ2);
            if (mVar != null) {
                LIZ2 = mVar;
            }
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        j jVar = (j) LIZ2;
        if (jVar == null) {
            jVar = C61369O6r.LIZ;
        }
        String jVar2 = jVar.toString();
        o.LJIIIIZZ(jVar2, "kotlin.runCatching {\n   …() ?: DEFAULT).toString()");
        if (!C78983UzD.LJJJI(jVar2)) {
            try {
                jSONObject = new JSONObject(jVar2);
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        if (!(jSONObject instanceof JSONObject)) {
            jSONObject = new JSONObject();
        }
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("enable_splash_show_count_for_empty", true)) {
                jSONObject.put("enable_add_show_count_for_empty_array", 1);
            }
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LJ("splash_disappear_time", 0) != 0) {
                jSONObject.put("enable_post_stop_video", true);
            }
            jSONObject.put("enable_cold_launch_interval", 1);
        } catch (JSONException e2) {
            C78983UzD.LJIIZILJ(e2);
        }
        c61365O6n.LJIIIIZZ = jSONObject;
        C61363O6l.LIZIZ(context, new C61362O6k(c61365O6n));
    }

    public static boolean LIZ(String str, String str2) {
        IDownloadService iDownloadService;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        int lastIndexOf = str2.lastIndexOf("/") + 1;
        String substring = str2.substring(lastIndexOf);
        String substring2 = str2.substring(0, lastIndexOf);
        Object LIZ2 = C58096Mr6.LIZ(IDownloadService.class, false);
        if (LIZ2 != null) {
            iDownloadService = (IDownloadService) LIZ2;
        } else {
            if (C58096Mr6.LLILII == null) {
                synchronized (IDownloadService.class) {
                    if (C58096Mr6.LLILII == null) {
                        C58096Mr6.LLILII = new DownloadService();
                    }
                }
            }
            iDownloadService = C58096Mr6.LLILII;
        }
        return iDownloadService.LIZ(EF7.LIZIZ(), str, substring2, substring);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:1|(1:3)|4|(1:6)|7|(1:9)(1:61)|10|(2:11|12)|13|(1:15)|16|(1:18)(1:57)|19|(14:53|54|22|(3:24|(5:27|28|30|31|25)|33)|34|(1:52)|(1:37)|38|39|40|41|42|43|44)|21|22|(0)|34|(0)|(0)|38|39|40|41|42|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d4, code lost:
    
        X.C78983UzD.LJIIZILJ(r0);
        X.C36922EeM.LJFF(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x017f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0180, code lost:
    
        X.C78983UzD.LJIIZILJ(r0);
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(android.content.Context r18, X.InterfaceC39140FXs r19) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61358O6g.LJ(android.content.Context, X.FXs):void");
    }
}
