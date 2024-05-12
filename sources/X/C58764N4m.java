package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.N4m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C58764N4m {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public final C58765N4n LJ = new C58765N4n();
    public String LJFF;

    public final void LIZLLL() {
        this.LJ.LIZ("ad_event_type", "debug");
    }

    public final void LJI() {
        this.LJ.LIZ("is_ad_event", "1");
        String LLJILJILJ = C16880lQ.LLJILJILJ(EF7.LIZIZ());
        if (!C38354F3m.LJ(LLJILJILJ)) {
            this.LJ.LIZ("nt", LLJILJILJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            r6 = this;
            r6.LJI()
            java.lang.String r2 = r6.LIZ
            java.lang.String r3 = r6.LIZIZ
            X.N4n r0 = r6.LJ
            org.json.JSONObject r5 = r0.LIZ
            java.lang.String r1 = r6.LIZJ
            if (r1 == 0) goto L1a
            java.lang.String r0 = "[+-]?\\d+"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L1a
            java.lang.String r4 = r6.LIZJ
            goto L1c
        L1a:
            java.lang.String r4 = "0"
        L1c:
            java.lang.String r0 = r6.LIZLLL     // Catch: java.lang.NumberFormatException -> L25
            if (r0 == 0) goto L29
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L25
            goto L2b
        L25:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
        L29:
            r0 = 0
        L2b:
            X.C58657N0j.LIZ(r0, r2, r3, r4, r5)
            java.lang.Class<X.N4o> r2 = X.C58766N4o.class
            monitor-enter(r2)
            X.N4m r0 = X.C58766N4o.LIZ     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L45
            X.C58766N4o.LIZ = r6     // Catch: java.lang.Throwable -> L47
            r1 = 0
            r6.LIZ = r1     // Catch: java.lang.Throwable -> L47
            r6.LIZIZ = r1     // Catch: java.lang.Throwable -> L47
            r6.LIZJ = r1     // Catch: java.lang.Throwable -> L47
            r6.LIZLLL = r1     // Catch: java.lang.Throwable -> L47
            X.N4n r0 = r6.LJ     // Catch: java.lang.Throwable -> L47
            r0.LIZ = r1     // Catch: java.lang.Throwable -> L47
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47
            return
        L47:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L47
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58764N4m.LJIIIIZZ():void");
    }

    public final void LJIIIZ() {
        EF7.LIZIZ();
        LJI();
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("category", "event_v3");
            if (!TextUtils.isEmpty(this.LIZ)) {
                hashMap.put("tag", this.LIZ);
            }
            if (!TextUtils.isEmpty(this.LIZIZ)) {
                hashMap.put("label", this.LIZIZ);
            }
            if (!TextUtils.isEmpty(this.LIZJ)) {
                hashMap.put("value", this.LIZJ);
            }
            if (!TextUtils.isEmpty(this.LIZLLL)) {
                hashMap.put("ext_value", this.LIZLLL);
            }
            C58765N4n c58765N4n = this.LJ;
            if (c58765N4n.LIZ == null) {
                c58765N4n.LIZ = new JSONObject();
            }
            JSONObject jSONObject = c58765N4n.LIZ;
            C55509LqT.LIZ.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, jSONObject);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.equals("has_v3", next)) {
                    try {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof String) {
                            hashMap.put(next, (String) opt);
                        } else {
                            hashMap.put(next, new Gson().LJIILL(opt));
                        }
                    } catch (Exception e) {
                        C78983UzD.LJIIZILJ(e);
                    }
                }
            }
            if (!TextUtils.isEmpty(this.LJFF) && C59835Ne3.LIZ() != null) {
                C59835Ne3.LIZ().onEventV3Map(this.LJFF, hashMap);
            }
        } catch (Exception e2) {
            C78983UzD.LJIIZILJ(e2);
        }
        synchronized (C58766N4o.class) {
            if (C58766N4o.LIZ == null) {
                C58766N4o.LIZ = this;
                this.LIZ = null;
                this.LIZIZ = null;
                this.LIZJ = null;
                this.LIZLLL = null;
                this.LJ.LIZ = null;
            }
        }
    }

    public final void LIZ(Object obj) {
        this.LJ.LIZ("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), obj));
    }

    public final void LIZIZ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            LIZJ(awemeRawAd.getCreativeId());
            LJFF(awemeRawAd.getLogExtra());
            this.LJ.LIZ("ad_id", awemeRawAd.getAdId());
        }
    }

    public final void LIZJ(Long l) {
        String l2;
        if (l == null) {
            l2 = null;
        } else {
            l2 = l.toString();
        }
        this.LIZJ = l2;
    }

    public final void LJ(AwemeRawAd awemeRawAd) {
        String l;
        if (awemeRawAd != null) {
            LIZJ(awemeRawAd.getCreativeId());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId == null) {
                l = null;
            } else {
                l = groupId.toString();
            }
            this.LIZLLL = l;
            LJFF(awemeRawAd.getLogExtra());
        }
    }

    public final void LJFF(String str) {
        this.LJ.LIZ("log_extra", str);
    }

    public final void LJII(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LJ.LIZ("refer", str);
        }
    }
}
