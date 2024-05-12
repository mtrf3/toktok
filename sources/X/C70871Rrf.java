package X;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Rrf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70871Rrf {
    public final String LIZ;
    public EnumC70873Rrh LIZIZ;
    public java.util.Map<String, ? extends Object> LIZJ;
    public List<C70872Rrg> LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;

    public final void LIZ() {
        long j = this.LJ;
        if (j == -1) {
            long j2 = this.LJFF;
            if (j2 != -1) {
                this.LJ = j2;
                this.LIZIZ = EnumC70873Rrh.INTERCEPTOR;
            }
        } else if (this.LJFF == -1 && j != -1) {
            this.LJFF = j;
        }
        if (this.LJI == -1 && LIZIZ()) {
            this.LJI = this.LJII;
        }
        long j3 = this.LJI;
        long j4 = this.LJII;
        if (j3 > j4) {
            this.LJI = j4;
        }
    }

    public final boolean LIZIZ() {
        if (this.LJII != -1) {
            return true;
        }
        return false;
    }

    public final void LIZJ() {
        Object LIZ;
        Object obj;
        Object obj2;
        Object obj3;
        try {
            if (this.LJIIIIZZ == -1 && LIZIZ()) {
                this.LJIIIIZZ = System.currentTimeMillis();
                LIZ();
                java.util.Map<String, ? extends Object> map = this.LIZJ;
                Object obj4 = null;
                if (map == null) {
                    obj = null;
                } else {
                    obj = map.get("previous_page");
                }
                java.util.Map<String, ? extends Object> map2 = this.LIZJ;
                if (map2 != null) {
                    obj2 = map2.get("entrance_form");
                } else {
                    obj2 = null;
                }
                java.util.Map<String, ? extends Object> map3 = this.LIZJ;
                if (map3 != null) {
                    obj4 = map3.get("enter_from_info");
                }
                java.util.Map<String, ? extends Object> map4 = this.LIZJ;
                if (map4 == null || (obj3 = map4.get("biz_type")) == null) {
                    obj3 = "";
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("init_stage_cost", this.LJI - this.LJ);
                jSONObject.put("data_mount_stage_cost", this.LJII - this.LJI);
                jSONObject.put("render_stage_cost", this.LJIIIIZZ - this.LJII);
                jSONObject.put("fp_cost", this.LJIIIIZZ - this.LJ);
                jSONObject.put("page_name", this.LIZ);
                jSONObject.put("start_type", this.LIZIZ.getType());
                jSONObject.put("start_to_now", System.currentTimeMillis() - this.LJ);
                jSONObject.put("biz_type", obj3);
                if (obj != null) {
                    jSONObject.put("previous_page", obj);
                }
                if (obj2 != null) {
                    jSONObject.put("enter_from", obj2);
                }
                if (obj4 != null) {
                    jSONObject.put("enter_from_info", obj4);
                }
                C48658J7u.LIZIZ("rd_tiktokec_meaningful_rendered", jSONObject);
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
        }
    }

    public final void LIZLLL() {
        Object obj;
        if (this.LJIIIZ == -1 && LIZIZ()) {
            this.LJIIIZ = System.currentTimeMillis();
            LIZ();
            java.util.Map<String, ? extends Object> map = this.LIZJ;
            Object obj2 = null;
            if (map != null) {
                obj = map.get("previous_page");
            } else {
                obj = null;
            }
            java.util.Map<String, ? extends Object> map2 = this.LIZJ;
            if (map2 != null) {
                obj2 = map2.get("entrance_form");
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("init_stage_cost", this.LJI - this.LJ);
                jSONObject.put("data_mount_stage_cost", this.LJII - this.LJI);
                jSONObject.put("image_fp_cost", this.LJIIIZ - this.LJ);
                jSONObject.put("image_stage_cost", this.LJIIIZ - this.LJII);
                jSONObject.put("page_name", this.LIZ);
                jSONObject.put("start_type", this.LIZIZ.getType());
                jSONObject.put("start_to_now", System.currentTimeMillis() - this.LJ);
                if (obj != null) {
                    jSONObject.put("previous_page", obj);
                }
                if (obj2 != null) {
                    jSONObject.put("enter_from", obj2);
                }
                C48658J7u.LIZIZ("rd_tiktokec_img_meaningful_rendered", jSONObject);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PagePerfInfo(pageName='");
        LIZ.append(this.LIZ);
        LIZ.append("', launch=");
        C48339Iy7.LIZLLL(this.LJFF, this.LJ, LIZ, ", create=");
        C48339Iy7.LIZLLL(this.LJI, this.LJFF, LIZ, ", render=");
        C48339Iy7.LIZLLL(this.LJIIIIZZ, this.LJII, LIZ, ", mounted=");
        C48339Iy7.LIZLLL(this.LJII, this.LJI, LIZ, ", total=");
        C48339Iy7.LIZLLL(this.LJIIIIZZ, this.LJ, LIZ, ", start_type: ");
        LIZ.append(this.LIZIZ.name());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C70871Rrf(String pageName) {
        o.LJIIIZ(pageName, "pageName");
        this.LIZ = pageName;
        this.LIZIZ = EnumC70873Rrh.LAUNCH;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJI = -1L;
        this.LJII = -1L;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
    }

    public final void LJ(String str, Long l, HashMap hashMap) {
        Object LIZ;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        try {
            if (this.LJFF == -1) {
                if (hashMap != null && this.LIZJ == null) {
                    this.LIZJ = hashMap;
                }
                if (l == null || l.longValue() <= 0) {
                    this.LJFF = System.currentTimeMillis();
                } else {
                    this.LJFF = l.longValue();
                }
                LIZ();
                java.util.Map<String, ? extends Object> map = this.LIZJ;
                Object obj5 = null;
                if (map == null) {
                    obj = null;
                } else {
                    obj = map.get("previous_page");
                }
                java.util.Map<String, ? extends Object> map2 = this.LIZJ;
                if (map2 != null) {
                    obj2 = map2.get("entrance_form");
                } else {
                    obj2 = null;
                }
                java.util.Map<String, ? extends Object> map3 = this.LIZJ;
                if (map3 == null) {
                    obj3 = null;
                } else {
                    obj3 = map3.get("enter_from_info");
                }
                java.util.Map<String, ? extends Object> map4 = this.LIZJ;
                if (map4 != null) {
                    obj5 = map4.get("start_to_now");
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("page_name", this.LIZ);
                if (C78685UuP.LJJJZ(str)) {
                    jSONObject.put("subpage_name", str);
                }
                jSONObject.put("start_type", this.LIZIZ.getType());
                if (obj != null) {
                    jSONObject.put("previous_page", obj);
                }
                if (obj2 != null) {
                    jSONObject.put("enter_from", obj2);
                }
                if (obj3 != null) {
                    jSONObject.put("enter_from_info", obj3);
                }
                if (obj5 != null) {
                    jSONObject.put("start_to_now", obj5);
                }
                java.util.Map<String, ? extends Object> map5 = this.LIZJ;
                if (map5 != null && (obj4 = map5.get("is_self")) != null) {
                    jSONObject.put("is_self", obj4);
                }
                C48658J7u.LIZIZ("rd_tiktokec_meaningful_intercept", jSONObject);
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
        }
    }
}
