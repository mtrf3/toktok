package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O1H extends O1T {
    @Override // X.O1T
    public final O1I LIZIZ(O1I input, O1U o1u) {
        o.LJIIJ(input, "input");
        C61237O1p c61237O1p = new C61237O1p();
        O1W LIZJ = LIZJ(input, o1u);
        if (LIZJ instanceof O1W) {
            LIZJ.LJIJ = true;
            C60547NpX c60547NpX = input.LIZLLL;
            LIZJ.getClass();
            o.LJIIJ(c60547NpX, "<set-?>");
            LIZJ.LIZLLL = c60547NpX;
            JSONArray jSONArray = input.LJ;
            o.LJIIJ(jSONArray, "<set-?>");
            LIZJ.LJ = jSONArray;
            JSONObject jSONObject = LIZJ.LIZLLL.LJII;
            if (jSONObject != null) {
                jSONObject.put("me_total", c61237O1p.LIZIZ());
            }
        }
        return LIZJ;
    }

    public final O1W LIZJ(O1I o1i, O1U o1u) {
        byte[] bArr;
        Integer num = o1u.LIZJ;
        O1W o1w = null;
        if (num == null || num.intValue() != 2) {
            if (o1u.LJ.length() == 0 || o1u.LJFF.length() == 0) {
                if (o1i instanceof O1W) {
                    O1W o1w2 = (O1W) o1i;
                    o1w2.getClass();
                    o1w2.LJIJJLI = "memory channel/bundle is empty";
                }
                C39973FmT.LIZIZ(this, "MemoryLoader:return null because channel or bundle is empty", null, null, 6);
                return null;
            }
            C61243O1v c61243O1v = C61242O1u.LIZ;
            String cacheKey = C61030NxK.LIZ(o1i, o1u);
            c61243O1v.getClass();
            o.LJIIJ(cacheKey, "cacheKey");
            O1I o1i2 = c61243O1v.LIZIZ.get(cacheKey);
            if (o1i2 != null) {
                o1w = new O1W(o1i2.LJFF, 0L, 2046);
                o1w.LJI = o1i2.LJI;
                o1w.LJII = o1i2.LJII;
                o1w.LJIIIIZZ = o1i2.LJIIIIZZ;
                o1w.LJIIIZ = o1i2.LJIIIZ;
                o1w.LJIIJ = o1i2.LJIIJ;
                o1w.LJIIJJI = o1i2.LJIIJJI;
                o1w.LJIIL = o1i2.LJIIL;
                o1w.LJIILIIL = o1i2.LJIILIIL;
                if (o1i2 instanceof O1W) {
                    O1W o1w3 = (O1W) o1i2;
                    String str = o1w3.LJIL;
                    o.LJIIJ(str, "<set-?>");
                    o1w.LJIL = str;
                    o1w.LJIIZILJ = o1w3.LJIIZILJ;
                    o1w.LJJ = o1w3.LJJ;
                }
                String str2 = o1i2.LJIILJJIL;
                o.LJIIJ(str2, "<set-?>");
                o1w.LJIILJJIL = str2;
                o1w.LJIILL = o1i2.LJIILL;
                String str3 = o1i2.LIZ;
                o.LJIIJ(str3, "<set-?>");
                o1w.LIZ = str3;
                C60547NpX c60547NpX = o1i2.LIZLLL;
                o.LJIIJ(c60547NpX, "<set-?>");
                o1w.LIZLLL = c60547NpX;
                C60547NpX c60547NpX2 = o1i2.LIZJ;
                o.LJIIJ(c60547NpX2, "<set-?>");
                o1w.LIZJ = c60547NpX2;
                o1w.LIZIZ = o1i2.LIZIZ;
                o1w.LJIIZILJ = cacheKey;
                C61234O1m c61234O1m = c61243O1v.LIZ;
                if (c61234O1m != null && (bArr = c61234O1m.get(cacheKey)) != null) {
                    o1w.LJIIL = new ByteArrayInputStream(bArr);
                }
            }
            return o1w;
        }
        if (o1i instanceof O1W) {
            O1W o1w4 = (O1W) o1i;
            o1w4.getClass();
            o1w4.LJIJJLI = "memory dynamic is 2";
        }
        C39973FmT.LIZIZ(this, "MemoryLoader:return null because dynamic is 2", null, null, 6);
        return null;
    }

    @Override // X.O1T
    public final void LIZ(O1I input, O1U o1u, InterfaceC88472Yns<? super O1I, C76800UCe> resolve, InterfaceC88472Yns<? super Throwable, C76800UCe> reject) {
        o.LJIIJ(input, "input");
        o.LJIIJ(resolve, "resolve");
        o.LJIIJ(reject, "reject");
        C61237O1p c61237O1p = new C61237O1p();
        O1W LIZJ = LIZJ(input, o1u);
        if (LIZJ == null) {
            JSONObject jSONObject = input.LIZLLL.LJII;
            if (jSONObject != null) {
                jSONObject.put("me_total", c61237O1p.LIZIZ());
            }
            JSONArray jSONArray = input.LJ;
            JSONObject LJ = C47135Ieh.LJ("name", "Memory", "status", "fail");
            LJ.put("message", "not found");
            jSONArray.put(LJ);
            reject.invoke(new Throwable("memory loader return null"));
            return;
        }
        LIZJ.LJIJ = true;
        C60547NpX c60547NpX = input.LIZLLL;
        o.LJIIJ(c60547NpX, "<set-?>");
        LIZJ.LIZLLL = c60547NpX;
        JSONObject jSONObject2 = c60547NpX.LJII;
        if (jSONObject2 != null) {
            jSONObject2.put("me_total", c61237O1p.LIZIZ());
        }
        InputStream LIZIZ = LIZJ.LIZIZ();
        if (LIZIZ != null && LIZIZ.available() > 0) {
            try {
                if (LIZJ.LJIIIIZZ != EnumC60490Noc.BUILTIN && LIZIZ != null) {
                    LIZIZ.close();
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            JSONArray jSONArray2 = input.LJ;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("name", "Memory");
            jSONObject3.put("status", "success");
            jSONArray2.put(jSONObject3);
            input.LJ = jSONArray2;
            LIZJ.LJ = jSONArray2;
            resolve.invoke(LIZJ);
            return;
        }
        if (input instanceof O1W) {
            ((O1W) input).LJIJJLI = "memory size 0";
        }
        JSONArray jSONArray3 = input.LJ;
        JSONObject LJ2 = C47135Ieh.LJ("name", "Memory", "status", "failed");
        LJ2.put("message", "size 0");
        jSONArray3.put(LJ2);
        input.LJ = jSONArray3;
        reject.invoke(new Throwable("memory loader size is 0"));
    }
}
