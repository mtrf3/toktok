package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.NIl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59127NIl {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public final C59129NIn LJ = new C59129NIn();
    public String LJFF;

    public final void LIZ(Object obj) {
        this.LJ.LIZ("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), obj));
    }

    public final void LIZIZ(Aweme aweme) {
        if (aweme == null) {
            throw new NullPointerException("getAwemeRawAd");
        }
        LIZLLL(aweme.getAwemeRawAd().getCreativeId());
        LJII(aweme.getAwemeRawAd().getLogExtra());
        this.LJ.LIZ("ad_id", aweme.getAwemeRawAd().getAdId());
    }

    public final void LIZJ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            LIZLLL(awemeRawAd.getCreativeId());
            LJII(awemeRawAd.getLogExtra());
            this.LJ.LIZ("ad_id", awemeRawAd.getAdId());
        }
    }

    public final void LIZLLL(Long l) {
        String l2;
        if (l == null) {
            l2 = null;
        } else {
            l2 = l.toString();
        }
        this.LIZJ = l2;
    }

    public final void LJ(Aweme aweme) {
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            LJFF(aweme.getAwemeRawAd());
        }
    }

    public final void LJFF(AwemeRawAd awemeRawAd) {
        String l;
        if (awemeRawAd != null) {
            LIZLLL(awemeRawAd.getCreativeId());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId == null) {
                l = null;
            } else {
                l = groupId.toString();
            }
            this.LIZLLL = l;
            LJII(awemeRawAd.getLogExtra());
        }
    }

    public final void LJI(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.LJ.LIZ(next, jSONObject.opt(next));
            }
        }
    }

    public final void LJII(String str) {
        this.LJ.LIZ("log_extra", str);
    }

    public final void LJIIIIZZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LJ.LIZ("refer", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(android.content.Context r11) {
        /*
            r10 = this;
            r5 = r11
            if (r5 != 0) goto L7
            android.content.Context r5 = X.EF7.LIZIZ()
        L7:
            X.NIn r2 = r10.LJ
            java.lang.String r1 = "is_ad_event"
            java.lang.String r0 = "1"
            r2.LIZ(r1, r0)
            java.lang.String r2 = X.C16880lQ.LLJILJILJ(r5)
            boolean r0 = X.C38354F3m.LJ(r2)
            if (r0 != 0) goto L21
            X.NIn r1 = r10.LJ
            java.lang.String r0 = "nt"
            r1.LIZ(r0, r2)
        L21:
            X.OJY r2 = X.C73340SqO.LJIL()
            java.lang.String r6 = r10.LIZ
            java.lang.String r7 = r10.LIZIZ
            X.NIn r0 = r10.LJ
            org.json.JSONObject r9 = r0.LIZ
            java.lang.String r1 = r10.LIZJ
            if (r1 == 0) goto L3c
            java.lang.String r0 = "[+-]?\\d+"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L3c
            java.lang.String r8 = r10.LIZJ
            goto L3e
        L3c:
            java.lang.String r8 = "0"
        L3e:
            java.lang.String r0 = r10.LIZLLL     // Catch: java.lang.NumberFormatException -> L47
            if (r0 == 0) goto L4b
            long r3 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L47
            goto L4d
        L47:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L4b:
            r3 = 0
        L4d:
            r2.getClass()
            X.NN1.LIZJ(r3, r5, r6, r7, r8, r9)
            java.lang.Class<X.NIm> r2 = X.C59128NIm.class
            monitor-enter(r2)
            X.NIl r0 = X.C59128NIm.LIZ     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L6a
            X.C59128NIm.LIZ = r10     // Catch: java.lang.Throwable -> L6c
            r1 = 0
            r10.LIZ = r1     // Catch: java.lang.Throwable -> L6c
            r10.LIZIZ = r1     // Catch: java.lang.Throwable -> L6c
            r10.LIZJ = r1     // Catch: java.lang.Throwable -> L6c
            r10.LIZLLL = r1     // Catch: java.lang.Throwable -> L6c
            X.NIn r0 = r10.LJ     // Catch: java.lang.Throwable -> L6c
            r0.LIZ = r1     // Catch: java.lang.Throwable -> L6c
        L6a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
            return
        L6c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L6c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59127NIl.LJIIIZ(android.content.Context):void");
    }
}
