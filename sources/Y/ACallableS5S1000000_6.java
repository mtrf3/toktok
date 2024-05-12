package Y;

import X.AbstractC65743Pr9;
import X.C03880Dg;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C221018lt;
import X.C37531EoB;
import X.C39519Ff9;
import X.C3C5;
import X.C60607NqV;
import X.C64734Pas;
import X.C65300Pk0;
import X.C76800UCe;
import X.C82544WaS;
import X.EF7;
import X.EXP;
import X.EnumC37510Enq;
import X.FCH;
import X.FX8;
import X.InterfaceC37604EpM;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.CookieManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity;
import com.ss.android.ugc.aweme.account.api.UserSettingsApi;
import com.ss.android.ugc.aweme.account.api.UserSettingsResponse;
import com.ss.android.ugc.aweme.profile.editprofile.namesync.ProfileNameSyncServiceImpl;
import com.ss.android.ugc.aweme.qrcode.api.RiskApi;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.net.URI;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import ujb.o;

/* loaded from: classes7.dex */
public class ACallableS5S1000000_6 implements Callable {
    public final int $t;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS5S1000000_6 aCallableS5S1000000_6) {
        boolean z;
        List<String> list;
        String cookie;
        String str;
        String str2 = aCallableS5S1000000_6.s0;
        if (str2 != null && o.LJJJLIIL(str2, "http://", false)) {
            z = true;
        } else {
            z = false;
        }
        if (z || ((str = aCallableS5S1000000_6.s0) != null && o.LJJJLIIL(str, "https://", false))) {
            try {
                list = C64734Pas.LJIIIZ(EF7.LIZIZ()).LIZLLL(NetworkUtils.getShareCookieHost());
                if (list != null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        URI create = URI.create(aCallableS5S1000000_6.s0);
                        String host = create.getHost();
                        kotlin.jvm.internal.o.LJIIIIZZ(host, "uri.host");
                        if (copyOnWriteArrayList.contains(FX8.LIZLLL(host))) {
                            CookieManager cookieManager = CookieManager.getInstance();
                            String host2 = create.getHost();
                            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{host2}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "-7310692074442667066"));
                            if (LIZJ.LIZ) {
                                cookie = (String) LIZJ.LIZIZ;
                            } else {
                                cookie = cookieManager.getCookie(host2);
                            }
                            FX8.LIZ(create, list, cookie);
                        }
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                list = null;
            }
            FX8.LJFF();
            FX8.LJI(FX8.LJ(aCallableS5S1000000_6.s0), null, list);
        }
        return null;
    }

    public static final Object call$1(ACallableS5S1000000_6 aCallableS5S1000000_6) {
        String syncNickname2Username;
        C10K LIZ = UserSettingsApi.LIZ(2, aCallableS5S1000000_6.s0);
        LIZ.LJIJI();
        if (LIZ.LJIIJJI() == null || !C82544WaS.LJ(LIZ)) {
            C221018lt.LIZIZ("ProfileNameSyncServiceImpl", "invalid bolt task ");
            return AbstractC65743Pr9.absent();
        }
        if (!o.LJJJJIZL("success", ((UserSettingsResponse) LIZ.LJIIJJI()).getMessage(), true) || ((UserSettingsResponse) LIZ.LJIIJJI()).getData() == null) {
            C221018lt.LIZIZ("ProfileNameSyncServiceImpl", "task result failed ");
            return AbstractC65743Pr9.absent();
        }
        UserSettingsResponse.UserSettingsData data = ((UserSettingsResponse) LIZ.LJIIJJI()).getData();
        if (data != null && (syncNickname2Username = data.getSyncNickname2Username()) != null) {
            return AbstractC65743Pr9.of(syncNickname2Username);
        }
        C221018lt.LIZIZ("ProfileNameSyncServiceImpl", "empty response");
        return AbstractC65743Pr9.absent();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$2(Y.ACallableS5S1000000_6 r10) {
        /*
            X.EdK r0 = X.C36858EdK.LIZJ
            r0.getClass()
            com.bytedance.keva.Keva r1 = X.C36858EdK.LIZ()
            java.lang.String r0 = "key_binding_msisdn_success"
            r1.erase(r0)
            com.bytedance.keva.Keva r1 = X.C36858EdK.LIZ()
            java.lang.String r0 = "key_msisdn_expired_time"
            r1.erase(r0)
            java.lang.String r1 = r10.s0
            X.F7E r0 = X.F7E.LJI
            r0.getClass()
            X.F7K r0 = X.F7E.LJ
            if (r0 == 0) goto L25
            r0.LIZJ()
        L25:
            java.lang.String r0 = "mccMnc"
            kotlin.jvm.internal.o.LJIIJ(r1, r0)
            com.tiktok.zero.rating.manager.ZeroRatingApi r0 = com.tiktok.zero.rating.manager.ZeroRatingApi.LIZLLL
            r0.getClass()
            X.Ol8 r0 = com.tiktok.zero.rating.manager.ZeroRatingApi.LIZIZ
            r7 = 0
            java.lang.Object r6 = r0.getValue()
            com.tiktok.zero.rating.manager.ZeroRatingApi$FetchMsisdnApi r6 = (com.tiktok.zero.rating.manager.ZeroRatingApi.FetchMsisdnApi) r6
            r0 = 0
            if (r6 == 0) goto L7b
            byte[] r2 = r1.getBytes()     // Catch: java.lang.Exception -> L7d
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Exception -> L76
            r1.update(r2)     // Catch: java.lang.Exception -> L76
            byte[] r10 = r1.digest()     // Catch: java.lang.Exception -> L76
            r1 = 32
            char[] r9 = new char[r1]     // Catch: java.lang.Exception -> L76
            r8 = 0
            r5 = 0
        L53:
            r1 = 16
            if (r8 >= r1) goto L70
            r4 = r10[r8]     // Catch: java.lang.Exception -> L76
            int r3 = r5 + 1
            char[] r2 = X.C44729Hgz.LIZ     // Catch: java.lang.Exception -> L76
            int r1 = r4 >>> 4
            r1 = r1 & 15
            char r1 = r2[r1]     // Catch: java.lang.Exception -> L76
            r9[r5] = r1     // Catch: java.lang.Exception -> L76
            int r5 = r3 + 1
            r1 = r4 & 15
            char r1 = r2[r1]     // Catch: java.lang.Exception -> L76
            r9[r3] = r1     // Catch: java.lang.Exception -> L76
            int r8 = r8 + 1
            goto L53
        L70:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L76
            r1.<init>(r9)     // Catch: java.lang.Exception -> L76
            goto L82
        L76:
            r1 = move-exception
            X.C16880lQ.LLLLIIL(r1)     // Catch: java.lang.Exception -> L7d
            goto L81
        L7b:
            r1 = r0
            goto L88
        L7d:
            r1 = move-exception
            X.C16880lQ.LLLLIIL(r1)
        L81:
            r1 = r0
        L82:
            if (r1 == 0) goto L93
        L84:
            X.Ek4 r1 = r6.fetchMsisdn(r1, r7)
        L88:
            if (r1 == 0) goto L92
            X.Pbt r1 = r1.execute()
            if (r1 == 0) goto L92
            T r0 = r1.LIZIZ
        L92:
            return r0
        L93:
            java.lang.String r1 = ""
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS5S1000000_6.call$2(Y.ACallableS5S1000000_6):java.lang.Object");
    }

    public static final Object call$3(ACallableS5S1000000_6 aCallableS5S1000000_6) {
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity == null) {
            return null;
        }
        Intent intent = new Intent(validTopActivity, (Class<?>) DFInstallBlankActivity.class);
        intent.putExtra("module_name", aCallableS5S1000000_6.s0);
        intent.putExtra("is_hold_permission_dialog", true);
        C16880lQ.LIZIZ(validTopActivity, intent);
        validTopActivity.overridePendingTransition(0, 0);
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS5S1000000_6 aCallableS5S1000000_6) {
        Object LIZ;
        SparkContext sparkContext;
        try {
            FCH.LIZIZ.LIZLLL();
            if (o.LJJJLIIL(aCallableS5S1000000_6.s0, "https", false)) {
                Uri.Builder builder = new Uri.Builder();
                builder.path("//webview/");
                builder.appendQueryParameter("url", aCallableS5S1000000_6.s0);
                String it = builder.build().toString();
                sparkContext = new SparkContext();
                kotlin.jvm.internal.o.LJIIIIZZ(it, "it");
                sparkContext.LJJIJLIJ(it);
            } else {
                sparkContext = new SparkContext();
                sparkContext.LJJIJLIJ(aCallableS5S1000000_6.s0);
            }
            SparkSchemaParam LJIIZILJ = sparkContext.LJIIZILJ(-1);
            LIZ = null;
            if (LJIIZILJ != null) {
                C60607NqV c60607NqV = new C60607NqV(UriProtector.parse(LJIIZILJ.getUrl()));
                InterfaceC37604EpM interfaceC37604EpM = (InterfaceC37604EpM) EXP.LIZIZ(InterfaceC37604EpM.class);
                if (interfaceC37604EpM != null) {
                    interfaceC37604EpM.LIZJ(LJIIZILJ.getUrl(), new C37531EoB(null, c60607NqV), EnumC37510Enq.Load);
                }
                LIZ = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        return C3C5.m6boximpl(LIZ);
    }

    public static final Object call$5(ACallableS5S1000000_6 aCallableS5S1000000_6) {
        return RiskApi.LIZ(aCallableS5S1000000_6.s0);
    }

    public ACallableS5S1000000_6(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public ACallableS5S1000000_6(String str, ProfileNameSyncServiceImpl profileNameSyncServiceImpl, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
