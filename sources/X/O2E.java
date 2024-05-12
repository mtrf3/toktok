package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O2E extends O2X {
    public static O2Z LIZJ(O26 o26, O1V o1v) {
        byte[] bArr;
        Integer num = o1v.LIZLLL;
        O2Z o2z = null;
        if (num == null || num.intValue() != 2) {
            if (o1v.LJFF.length() == 0 || o1v.LJI.length() == 0) {
                if (o26 instanceof O2Z) {
                    o26.getClass();
                }
                C39048FUe.LIZIZ(C39048FUe.LIZIZ, "MemoryLoader:return null because channel or bundle is empty", null, null, 6);
                return null;
            }
            C61250O2c c61250O2c = C61271O2x.LIZ;
            String cacheKey = C38517F9t.LIZ(o1v);
            c61250O2c.getClass();
            o.LJIIJ(cacheKey, "cacheKey");
            O26 o262 = c61250O2c.LIZIZ.get(cacheKey);
            if (o262 != null) {
                o2z = new O2Z(o262.LJI, 0L, 2046);
                o2z.LJII = o262.LJII;
                o2z.LJIIIIZZ = o262.LJIIIIZZ;
                o2z.LJIIIZ = o262.LJIIIZ;
                o2z.LJIIJ = o262.LJIIJ;
                o2z.LJIIJJI = o262.LJIIJJI;
                o2z.LJIIL = o262.LJIIL;
                o2z.LJIILIIL = o262.LJIILIIL;
                if (o262 instanceof O2Z) {
                    O2Z o2z2 = (O2Z) o262;
                    String str = o2z2.LJIJJ;
                    o.LJIIJ(str, "<set-?>");
                    o2z.LJIJJ = str;
                    o2z.LJIJ = o2z2.LJIJ;
                    o2z.LJIJJLI = o2z2.LJIJJLI;
                }
                String str2 = o262.LJIILJJIL;
                o.LJIIJ(str2, "<set-?>");
                o2z.LJIILJJIL = str2;
                o2z.LJIILL = o262.LJIILL;
                String str3 = o262.LIZ;
                o.LJIIJ(str3, "<set-?>");
                o2z.LIZ = str3;
                C24730y5 c24730y5 = o262.LIZJ;
                o.LJIIJ(c24730y5, "<set-?>");
                o2z.LIZJ = c24730y5;
                o2z.LIZIZ = o262.LIZIZ;
                o2z.LJIJ = cacheKey;
                O2Y o2y = c61250O2c.LIZ;
                if (o2y != null && (bArr = o2y.get(cacheKey)) != null) {
                    o2z.LJIIL = new ByteArrayInputStream(bArr);
                }
            }
            return o2z;
        }
        if (o26 instanceof O2Z) {
            o26.getClass();
        }
        C39048FUe.LIZIZ(C39048FUe.LIZIZ, "MemoryLoader:return null because dynamic is 2", null, null, 6);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r4 != null) goto L5;
     */
    @Override // X.O2X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.O26 LIZIZ(X.O26 r7, X.O1V r8) {
        /*
            r6 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.o.LJIIJ(r7, r0)
            X.O2u r5 = new X.O2u
            r5.<init>()
            X.O2Z r4 = LIZJ(r7, r8)
            boolean r0 = r4 instanceof X.O2Z
            if (r0 == 0) goto L33
            r0 = 1
            r4.LJIJI = r0
            org.json.JSONArray r1 = r7.LIZLLL
            r4.getClass()
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.o.LJIIJ(r1, r0)
            r4.LIZLLL = r1
        L21:
            org.json.JSONObject r0 = r7.LJIILLIIL
            r4.LJIILLIIL = r0
            org.json.JSONObject r3 = r4.LJIILLIIL
            if (r3 == 0) goto L32
            java.lang.String r2 = "me_total"
            long r0 = r5.LIZIZ()
            r3.put(r2, r0)
        L32:
            return r4
        L33:
            if (r4 == 0) goto L32
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O2E.LIZIZ(X.O26, X.O1V):X.O26");
    }

    @Override // X.O2X
    public final void LIZ(O26 input, O1V o1v, InterfaceC88472Yns<? super O26, C76800UCe> resolve, InterfaceC88472Yns<? super Throwable, C76800UCe> reject) {
        o.LJIIJ(input, "input");
        o.LJIIJ(resolve, "resolve");
        o.LJIIJ(reject, "reject");
        C61268O2u c61268O2u = new C61268O2u();
        O2Z LIZJ = LIZJ(input, o1v);
        if (LIZJ == null) {
            JSONObject jSONObject = input.LJIILLIIL;
            if (jSONObject != null) {
                jSONObject.put("me_total", c61268O2u.LIZIZ());
            }
            JSONArray jSONArray = input.LIZLLL;
            JSONObject LJ = C47135Ieh.LJ("name", "Memory", "status", "fail");
            LJ.put("message", "not found");
            jSONArray.put(LJ);
            reject.invoke(new Throwable("memory loader return null"));
            return;
        }
        LIZJ.LJIJI = true;
        JSONObject jSONObject2 = input.LJIILLIIL;
        LIZJ.LJIILLIIL = jSONObject2;
        if (jSONObject2 != null) {
            jSONObject2.put("me_total", c61268O2u.LIZIZ());
        }
        InputStream LIZJ2 = LIZJ.LIZJ();
        if (LIZJ2 != null && LIZJ2.available() > 0) {
            try {
                if (LIZJ.LJIIIZ != O29.BUILTIN && LIZJ2 != null) {
                    LIZJ2.close();
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            JSONArray jSONArray2 = input.LIZLLL;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("name", "Memory");
            jSONObject3.put("status", "success");
            jSONArray2.put(jSONObject3);
            input.LIZLLL = jSONArray2;
            LIZJ.LIZLLL = jSONArray2;
            resolve.invoke(LIZJ);
            return;
        }
        boolean z = input instanceof O2Z;
        JSONArray jSONArray3 = input.LIZLLL;
        JSONObject LJ2 = C47135Ieh.LJ("name", "Memory", "status", "failed");
        LJ2.put("message", "size 0");
        jSONArray3.put(LJ2);
        input.LIZLLL = jSONArray3;
        reject.invoke(new Throwable("memory loader size is 0"));
    }
}
