package X;

import android.os.Bundle;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ip2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47776Ip2 {
    public Boolean LIZ;
    public Integer LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public Boolean LJI;
    public Integer LJII;
    public Integer LJIIIIZZ;
    public Integer LJIIIZ;
    public Float LJIIJ;
    public Boolean LJIIJJI;
    public Integer LJIIL;
    public Integer LJIILIIL;
    public Integer LJIILJJIL;
    public Boolean LJIILL;
    public Integer LJIILLIIL;
    public Boolean LJIIZILJ;
    public Integer LJIJ;
    public Integer LJIJI;
    public Float LJIJJ;
    public Boolean LJIJJLI;
    public final java.util.Map<String, String> LJIL = new HashMap();
    public Boolean LJJ;
    public Integer LJJI;
    public Integer LJJIFFI;
    public Bundle LJJII;

    public final void LIZIZ() {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = null;
        this.LJIIZILJ = null;
        this.LJIJ = null;
        this.LJIJI = null;
        this.LJIJJ = null;
        this.LJIJJLI = null;
        ((HashMap) this.LJIL).clear();
        this.LJJ = null;
        this.LJJI = null;
        this.LJJIFFI = null;
        this.LJJII = null;
    }

    public final String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        JSONObject jSONObject = new JSONObject();
        try {
            Boolean bool = this.LIZ;
            int i5 = 0;
            if (bool != null) {
                if (bool.booleanValue()) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                jSONObject.put("e", i4);
            }
            Integer num = this.LJJI;
            if (num != null) {
                jSONObject.put("st", num);
            }
            Integer num2 = this.LJIIIIZZ;
            if (num2 != null) {
                jSONObject.put("mw", num2);
            }
            Integer num3 = this.LJIIIZ;
            if (num3 != null) {
                jSONObject.put("mh", num3);
            }
            Integer num4 = this.LJJIFFI;
            if (num4 != null) {
                jSONObject.put("sw", num4);
            }
            Integer num5 = this.LJIJ;
            if (num5 != null) {
                jSONObject.put("cw", num5);
            }
            Integer num6 = this.LJIJI;
            if (num6 != null) {
                jSONObject.put("ch", num6);
            }
            Integer num7 = this.LIZIZ;
            if (num7 != null) {
                jSONObject.put("ft", num7);
            }
            Integer num8 = this.LJIIL;
            if (num8 != null) {
                jSONObject.put("cft", num8);
            }
            Long l = this.LIZJ;
            if (l != null) {
                jSONObject.put("mid", l);
            }
            Long l2 = this.LIZLLL;
            if (l2 != null) {
                jSONObject.put("mad", l2);
            }
            Integer num9 = this.LJIILIIL;
            if (num9 != null) {
                jSONObject.put("cd", num9);
            }
            Integer num10 = this.LJFF;
            if (num10 != null) {
                jSONObject.put("ss", num10);
            }
            Integer num11 = this.LJIILLIIL;
            if (num11 != null) {
                jSONObject.put("cs", num11);
            }
            Boolean bool2 = this.LJI;
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                jSONObject.put("es", i3);
            }
            Boolean bool3 = this.LJIIZILJ;
            if (bool3 != null) {
                if (bool3.booleanValue()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject.put("is", i2);
            }
            Float f = this.LJIIJ;
            if (f != null) {
                jSONObject.put("mf", f);
            }
            Float f2 = this.LJIJJ;
            if (f2 != null) {
                jSONObject.put("cf", f2);
            }
            Boolean bool4 = this.LJIIJJI;
            if (bool4 != null) {
                if (bool4.booleanValue()) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("eh", i);
            }
            Boolean bool5 = this.LJIJJLI;
            if (bool5 != null) {
                if (bool5.booleanValue()) {
                    i5 = 1;
                }
                jSONObject.put("ih", i5);
            }
            if (this.LJIL != null) {
                jSONObject.put("ei", new JSONObject(this.LJIL));
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject.toString();
    }

    public C47776Ip2() {
        LIZIZ();
    }

    public final Object LIZ() {
        return this.LJJII;
    }

    public final void LIZJ(int i) {
        this.LJIIIZ = Integer.valueOf(i);
    }

    public final void LIZLLL(int i) {
        this.LJIIIIZZ = Integer.valueOf(i);
    }
}
