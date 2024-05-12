package X;

import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.settings.UploadAdWebPreloadInfoConfig;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import ujb.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class NJ0 {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public long LJ;
    public final CopyOnWriteArrayList<E35> LJFF = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<E35> LJI = new CopyOnWriteArrayList<>();
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public JSONObject LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(java.lang.String r10) {
        /*
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r4 = X.C35998EAw.LIZ(r10)
            X.2YJ r0 = X.C2YJ.LIZIZ
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = r0.LIZ
            java.lang.String r0 = "get()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig r0 = r1.getAdLandingPageConfig()     // Catch: X.C158056If -> L22
            java.util.List r1 = r0.getResourceExcludeUrl()     // Catch: X.C158056If -> L22
            if (r1 == 0) goto L26
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            goto L3a
        L22:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L26:
            java.lang.String r5 = "jsonp"
            java.lang.String r6 = "callback"
            java.lang.String r7 = "analytics.tiktok.com/i18n/pixel"
            java.lang.String r8 = "google-analytics.com/analytics"
            java.lang.String r9 = "connect.facebook.net"
            java.lang.String r10 = "www.googletagmanager.com"
            java.lang.String[] r0 = new java.lang.String[]{r5, r6, r7, r8, r9, r10}
            java.util.ArrayList r1 = X.C47261Igj.LJII(r0)
        L3a:
            java.util.Iterator r3 = r1.iterator()
        L3e:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L58
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "string"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = ujb.s.LJJJLZIJ(r4, r1, r2)
            if (r0 == 0) goto L3e
            r0 = 1
            return r0
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJ0.LIZLLL(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(java.lang.String r5) {
        /*
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r5 = X.C35998EAw.LIZ(r5)
            X.2YJ r0 = X.C2YJ.LIZIZ
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = r0.LIZ
            java.lang.String r0 = "get()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig r0 = r1.getAdLandingPageConfig()     // Catch: X.C158056If -> L1f
            java.util.List r0 = r0.getParsePathRegex()     // Catch: X.C158056If -> L1f
            if (r0 == 0) goto L23
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            goto L35
        L1f:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L23:
            java.lang.String r4 = "^https?:\\/\\/www\\.googletagmanager\\.com\\/(gtag\\/js|gtm\\.js)"
            java.lang.String r3 = "^https?:\\/\\/analytics\\.tiktok\\.com\\/i18n\\/pixel"
            java.lang.String r2 = "^https?:\\/\\/www\\.google-analytics\\.com/(?:ga|urchin|analytics)\\.js"
            java.lang.String r1 = "https?:\\/\\/connect\\.facebook\\.net\\/(.*)\\/fbevents\\.js"
            java.lang.String r0 = "https?:\\/\\/mc\\.yandex\\.ru\\/"
            java.lang.String[] r0 = new java.lang.String[]{r2, r4, r3, r1, r0}
            java.util.ArrayList r0 = X.C47261Igj.LJII(r0)
        L35:
            java.util.Iterator r3 = r0.iterator()
        L39:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            X.OJD r1 = new X.OJD
            java.lang.String r0 = "regex"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r1.<init>(r2)
            boolean r0 = r1.containsMatchIn(r5)
            if (r0 == 0) goto L39
            r0 = 1
            return r0
        L57:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJ0.LJ(java.lang.String):boolean");
    }

    public static OSZ LIZIZ(String str, JSONObject jSONObject) {
        JSONObject optJSONObject;
        String optString;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.optJSONObject(str)) == null || (optString = optJSONObject.optString("md5")) == null || o.LJJJJJL(optString)) {
            return null;
        }
        return new OSZ(optString, Integer.valueOf(optJSONObject.optInt("resourceType")));
    }

    public final void LIZ(String url, String str, EnumC59140NIy type) {
        kotlin.jvm.internal.o.LJIIIZ(url, "url");
        kotlin.jvm.internal.o.LJIIIZ(type, "type");
        long currentTimeMillis = System.currentTimeMillis();
        if (((Boolean) C35253DsX.LIZ.getValue()).booleanValue() && NJ2.LJIILJJIL && !NJ2.LJIILL) {
            boolean z = false;
            if (!o.LJJJLIIL(s.LJZI(url).toString(), "http://", false) && !o.LJJJLIIL(s.LJZI(url).toString(), "https://", false)) {
                return;
            }
            if (this.LJI.size() > 10000) {
                this.LJI.clear();
                this.LJIIIIZZ = 0;
            }
            if (LIZLLL(url) || LJ(url) || o.LJJJJJL(str)) {
                z = true;
            }
            if (this.LJIIIIZZ <= UploadAdWebPreloadInfoConfig.LIZ().maxUploadFailUrl) {
                int i = C59141NIz.LIZ[type.ordinal()];
                int i2 = 2;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            i2 = -1;
                        } else {
                            this.LJIIIZ++;
                        }
                    } else {
                        i2 = 3;
                    }
                }
                this.LJI.add(new E35(C35998EAw.LIZ(url), z, i2));
                this.LJIIIIZZ++;
            }
            this.LJIILIIL = (System.currentTimeMillis() - currentTimeMillis) + this.LJIILIIL;
        }
    }

    public final OSZ<String, Integer> LIZJ(String url, String str, String channelPath) {
        kotlin.jvm.internal.o.LJIIIZ(url, "url");
        kotlin.jvm.internal.o.LJIIIZ(channelPath, "channelPath");
        if (this.LJIIL == null) {
            this.LJIIL = AdLandPagePreloadServiceImpl.LJJI().LIZ(channelPath);
        }
        JSONObject jSONObject = this.LJIIL;
        if (jSONObject != null) {
            OSZ<String, Integer> LIZIZ = LIZIZ(url, jSONObject);
            if (LIZIZ == null) {
                return LIZIZ(str, jSONObject);
            }
            return LIZIZ;
        }
        return null;
    }
}
