package ee1;

import X.AbstractC64674PZu;
import X.C16880lQ;
import X.C36841Ed3;
import X.C48162IvG;
import X.C64686Pa6;
import X.F9J;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import defpackage.a1;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class l {
    public static volatile l LJIIL;
    public static final AtomicBoolean LJIILIIL;
    public Context LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(true);
    public final AtomicLong LIZJ = new AtomicLong(0);
    public final List<AbstractC64674PZu> LIZLLL = new ArrayList();
    public final ReentrantReadWriteLock LJ = new ReentrantReadWriteLock();
    public final List<C48162IvG> LJFF = new ArrayList();
    public final ReentrantReadWriteLock LJI = new ReentrantReadWriteLock();
    public final AtomicInteger LJII = new AtomicInteger(0);
    public final AtomicLong LJIIIIZZ = new AtomicLong(0);
    public final ConcurrentMap<String, String> LJIIIZ = new ConcurrentHashMap();
    public String LJIIJ;
    public String LJIIJJI;

    static {
        C16880lQ.LJLLJ(l.class);
        LJIILIIL = new AtomicBoolean(false);
    }

    public static l LJ() {
        if (LJIIL == null) {
            synchronized (l.class) {
                if (LJIIL == null) {
                    LJIIL = new l();
                }
            }
        }
        return LJIIL;
    }

    public final int LIZIZ() {
        return this.LJII.get();
    }

    public final long LIZJ() {
        return this.LJIIIIZZ.get();
    }

    public static void LJFF(Context context) {
        if (C36841Ed3.LIZJ(context) && !LJIILIIL.get()) {
            SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "ttnet_tnc_config");
            String string = LIZIZ.getString("tnc_config_str", null);
            String string2 = LIZIZ.getString("ttnet_tnc_etag", null);
            String string3 = LIZIZ.getString("ttnet_tnc_abtest", null);
            try {
                if (!TextUtils.isEmpty(string)) {
                    LJ().LJI(0, System.currentTimeMillis(), string2, string3, new JSONObject(string));
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            LJIILIIL.set(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[LOOP:0: B:11:0x0043->B:42:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ee1.e LIZ(ee1.m r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee1.l.LIZ(ee1.m):ee1.e");
    }

    public final String LIZLLL(String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && !str.contains("/network/get_network") && !str.contains("/get_domains/v5") && !str.contains("/ies/speed")) {
            String str3 = null;
            try {
                URL url = new URL(str);
                String protocol = url.getProtocol();
                try {
                    str3 = url.getHost();
                } catch (Throwable unused) {
                }
                str2 = str3;
                str3 = protocol;
            } catch (Throwable unused2) {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str3) && (("http".equals(str3) || "https".equals(str3)) && !TextUtils.isEmpty(str2))) {
                ConcurrentMap<String, String> concurrentMap = this.LJIIIZ;
                if (concurrentMap == null || !((ConcurrentHashMap) concurrentMap).containsKey(str2)) {
                    Logger.debug();
                } else {
                    String str4 = (String) ((ConcurrentHashMap) this.LJIIIZ).get(str2);
                    if (TextUtils.isEmpty(str4)) {
                        return str;
                    }
                    Logger.debug();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str3);
                    LIZ.append("://");
                    LIZ.append(str2);
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    String LJ = a1.LJ(str3, "://", str4);
                    if (str.startsWith(LIZIZ)) {
                        str = str.replaceFirst(LIZIZ, LJ);
                    }
                    Logger.debug();
                    return str;
                }
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[LOOP:0: B:17:0x004e->B:23:0x0061, LOOP_START, PHI: r3
      0x004e: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:16:0x004c, B:23:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(org.json.JSONObject r21) {
        /*
            r20 = this;
            java.lang.String r0 = "action"
            r2 = r21
            java.lang.String r6 = r2.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Lf
            return
        Lf:
            java.lang.String r1 = "act_priority"
            r0 = -1
            int r8 = r2.optInt(r1, r0)
            if (r8 >= 0) goto L19
            return
        L19:
            java.lang.String r0 = "param"
            org.json.JSONObject r7 = r2.optJSONObject(r0)
            if (r7 != 0) goto L22
            return
        L22:
            java.lang.String r0 = "lifecycle"
            java.lang.String r1 = r2.optString(r0)
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)
            r3 = 0
            if (r0 == 0) goto L64
            r9 = 0
        L33:
            r11 = r9
        L34:
            java.lang.String r0 = "rule_id"
            int r0 = r2.optInt(r0)
            long r13 = (long) r0
            java.lang.String r0 = "sign"
            java.lang.String r15 = r2.optString(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r0 = "request_method"
            org.json.JSONArray r5 = r2.optJSONArray(r0)
            if (r5 == 0) goto L8f
        L4e:
            int r0 = r5.length()
            if (r3 >= r0) goto L8f
            java.lang.String r4 = r5.optString(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L61
            r1.add(r4)
        L61:
            int r3 = r3 + 1
            goto L4e
        L64:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r0 = X.C61694OJe.LIZJ(r1, r5)
            r4 = 1
            if (r0 != r4) goto L8c
            int r1 = r5.size()
            r0 = 2
            if (r1 != r0) goto L8c
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r9 = r0.longValue()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r4)
            java.lang.Long r0 = (java.lang.Long) r0
            long r11 = r0.longValue()
            goto L34
        L8c:
            r9 = -1
            goto L33
        L8f:
            java.lang.String r0 = "set_req_priority"
            int r19 = r2.optInt(r0, r8)
            r2 = r20
            java.util.concurrent.atomic.AtomicLong r0 = r2.LIZJ
            long r16 = r0.get()
            r18 = r1
            X.PZx r1 = X.AbstractC64677PZx.LIZ(r6, r7, r8, r9, r11, r13, r15, r16, r18, r19)
            boolean r0 = r1 instanceof X.AbstractC64674PZu
            if (r0 == 0) goto Lae
            java.util.List<X.PZu> r0 = r2.LIZLLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ee1.l.LJII(org.json.JSONObject):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(org.json.JSONObject r18) {
        /*
            r17 = this;
            java.lang.String r1 = "act_priority"
            r0 = -1
            r2 = r18
            int r5 = r2.optInt(r1, r0)
            if (r5 >= 0) goto Lc
            return
        Lc:
            java.lang.String r0 = "param"
            org.json.JSONObject r4 = r2.optJSONObject(r0)
            if (r4 != 0) goto L15
            return
        L15:
            java.lang.String r0 = "lifecycle"
            java.lang.String r1 = r2.optString(r0)
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L47
            r6 = 0
        L25:
            r8 = r6
        L26:
            java.lang.String r3 = "delay"
            r10 = 0
            java.lang.String r12 = ""
            r1 = r17
            java.util.concurrent.atomic.AtomicLong r0 = r1.LIZJ
            long r13 = r0.get()
            r15 = 0
            r16 = 0
            X.PZx r2 = X.AbstractC64677PZx.LIZ(r3, r4, r5, r6, r8, r10, r12, r13, r15, r16)
            boolean r0 = r2 instanceof X.C48162IvG
            if (r0 == 0) goto L46
            java.util.List<X.IvG> r0 = r1.LJFF
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
        L46:
            return
        L47:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r0 = X.C61694OJe.LIZJ(r1, r3)
            r2 = 1
            if (r0 != r2) goto L70
            int r1 = r3.size()
            r0 = 2
            if (r1 != r0) goto L70
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r8 = r0.longValue()
            goto L26
        L70:
            r6 = -1
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: ee1.l.LJIIIIZZ(org.json.JSONObject):void");
    }

    public final void LJI(int i, long j, String str, String str2, JSONObject jSONObject) {
        Logger.debug();
        this.LJII.set(i);
        this.LJIIJ = str;
        this.LJIIJJI = str2;
        this.LJIIIIZZ.set(j);
        JSONArray optJSONArray = jSONObject.optJSONArray("request_delay_actions");
        try {
            this.LJI.writeLock().lock();
            ((ArrayList) this.LJFF).clear();
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        LJIIIIZZ(optJSONObject);
                    }
                }
            }
            if (!((ArrayList) this.LJFF).isEmpty()) {
                Collections.sort(this.LJFF, new C64686Pa6());
            }
            this.LJI.writeLock().unlock();
            Logger.debug();
            int optInt = jSONObject.optInt("ttnet_url_dispatcher_enabled", -1);
            if (optInt >= 0) {
                AtomicBoolean atomicBoolean = this.LIZIZ;
                boolean z = true;
                if (optInt != 1) {
                    z = false;
                }
                atomicBoolean.set(z);
            }
            long optInt2 = jSONObject.optInt("ttnet_dispatch_actions_epoch", -1);
            if (optInt2 == this.LIZJ.get()) {
                Logger.debug();
                return;
            }
            this.LIZJ.set(optInt2);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("ttnet_dispatch_actions");
            if (optJSONArray2 == null) {
                return;
            }
            try {
                this.LJ.writeLock().lock();
                ((ArrayList) this.LIZLLL).clear();
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                    if (optJSONObject2 != null) {
                        LJII(optJSONObject2);
                    }
                }
                if (!((ArrayList) this.LIZLLL).isEmpty()) {
                    Collections.sort(this.LIZLLL, new C64686Pa6());
                }
            } finally {
                this.LJ.writeLock().unlock();
                Logger.debug();
            }
        } catch (Throwable th) {
            this.LJI.writeLock().unlock();
            Logger.debug();
            throw th;
        }
    }
}
