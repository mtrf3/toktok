package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EM2 extends EM4 {
    public final String LJJJI;
    public final EnumC58085Mqv LJJJIL;
    public final String LJJJJ;

    public final void LIZJ(JSONObject jSONObject) {
        LIZ("psi_exp_type", this.LIZIZ, jSONObject);
        if (this.LIZIZ != -1) {
            jSONObject.put("psi_exp_enable", this.LIZJ);
            jSONObject.put("psi_exp_success", this.LIZLLL);
            jSONObject.put("psi_cpu", ((Number) this.LIZ.getValue()).intValue());
        }
        String str = this.LJ;
        if (str != null) {
            jSONObject.put("psi_err_type", str);
        }
        String str2 = this.LJFF;
        if (str2 != null) {
            jSONObject.put("psi_err", str2);
        }
        Boolean bool = this.LJII;
        if (bool != null) {
            jSONObject.put("psi_degraded_success", bool.booleanValue());
        }
        LIZ("psi_input_origin_book_count", this.LJIIIIZZ, jSONObject);
        LIZ("psi_input_origin_contact_count", this.LJIIIZ, jSONObject);
        LIZ("psi_input_origin_contact_email_count", this.LJIIJ, jSONObject);
        LIZIZ(this.LJIIJJI, jSONObject, "psi_total_cost");
        LIZIZ(this.LJIIL, jSONObject, "psi_step1_cost");
        LIZIZ(this.LJIILIIL, jSONObject, "psi_s1_encrypt_cost");
        LIZIZ(this.LJIILJJIL, jSONObject, "psi_s1_api_cost");
        LIZIZ(this.LJIILL, jSONObject, "psi_s1_intersect_cost");
        LIZ("psi_s1_encrypts_count", this.LJIILLIIL, jSONObject);
        LIZ("psi_s1_hashab_count", this.LJIIZILJ, jSONObject);
        LIZ("psi_s1_bloom_size", this.LJIJ, jSONObject);
        LIZ("psi_s1_intersection_size", this.LJIJI, jSONObject);
        LIZ("psi_s1_encrypts_count_email", this.LJIJJ, jSONObject);
        LIZ("psi_s1_hashab_count_email", this.LJIJJLI, jSONObject);
        LIZ("psi_s1_bloom_size_email", this.LJIL, jSONObject);
        LIZ("psi_s1_intersection_size_email", this.LJJ, jSONObject);
        LIZIZ(this.LJJI, jSONObject, "psi_step2_cost");
        LIZIZ(this.LJJIFFI, jSONObject, "psi_s2_api_cost");
        LIZ("psi_s2_req_book_count", this.LJJII, jSONObject);
        LIZ("psi_s2_req_contact_count", this.LJJIII, jSONObject);
        LIZ("psi_s2_req_contact_email_count", this.LJJIIJ, jSONObject);
        Long l = this.LJJIIJZLJL;
        if (l != null) {
            LIZ("psi_s2_resp_register_contact_count", l.longValue(), jSONObject);
        }
        Long l2 = this.LJJIIZ;
        if (l2 != null) {
            LIZ("psi_s2_resp_unregister_count", l2.longValue(), jSONObject);
        }
        Long l3 = this.LJJIIZI;
        if (l3 != null) {
            LIZ("psi_s2_resp_unregister_attach_phone_count", l3.longValue(), jSONObject);
        }
        Long l4 = this.LJJIJ;
        if (l4 != null) {
            LIZ("psi_s2_resp_unregister_attach_count", l4.longValue(), jSONObject);
        }
        LIZIZ(this.LJJIJIIJI, jSONObject, "psi_s2_api_origin_cost");
        Long l5 = this.LJJIJIIJIL;
        if (l5 != null) {
            LIZ("psi_s2_resp_register_contact_origin_count", l5.longValue(), jSONObject);
        }
        Long l6 = this.LJJIJIL;
        if (l6 != null) {
            LIZ("psi_s2_resp_unregister_origin_count", l6.longValue(), jSONObject);
        }
        Boolean bool2 = this.LJJIJL;
        if (bool2 != null) {
            jSONObject.put("psi_exp_expect_phone", bool2.booleanValue());
        }
        Boolean bool3 = this.LJJIJLIJ;
        if (bool3 != null) {
            jSONObject.put("psi_exp_expect_email", bool3.booleanValue());
        }
        Boolean bool4 = this.LJJIL;
        if (bool4 != null) {
            jSONObject.put("psi_exp_expect_register", bool4.booleanValue());
        }
        Boolean bool5 = this.LJJIZ;
        if (bool5 != null) {
            jSONObject.put("psi_exp_expect_unregister", bool5.booleanValue());
        }
        Boolean bool6 = this.LJJJ;
        if (bool6 != null) {
            jSONObject.put("psi_exp_expect_provide_register", bool6.booleanValue());
        }
        Boolean bool7 = this.LJI;
        if (bool7 != null) {
            jSONObject.put("psi_exp_expect", bool7.booleanValue());
        }
    }

    public final void LIZLLL(String str) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJJJJ);
        LIZ.append('-');
        EnumC58085Mqv enumC58085Mqv = this.LJJJIL;
        if (enumC58085Mqv != null) {
            str2 = enumC58085Mqv.name();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append('}');
        X1D.LIZIZ(LIZ);
    }

    public EM2(String appSessionId, EnumC58085Mqv enumC58085Mqv) {
        o.LJIIIZ(appSessionId, "appSessionId");
        this.LJJJI = appSessionId;
        this.LJJJIL = enumC58085Mqv;
        this.LJJJJ = "ContactPef";
    }

    public final void LJFF(String str, Throwable th) {
        String str2;
        if (this.LJ == null && str != null) {
            this.LJ = str;
        }
        if (this.LJFF == null && th != null) {
            this.LJFF = th.getMessage();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("errType: ");
        LIZ.append(str);
        LIZ.append(" , err: ");
        LIZ.append(th);
        X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJJJJ);
        LIZ2.append('-');
        EnumC58085Mqv enumC58085Mqv = this.LJJJIL;
        if (enumC58085Mqv != null) {
            str2 = enumC58085Mqv.name();
        } else {
            str2 = null;
        }
        LIZ2.append(str2);
        LIZ2.append('}');
        X1D.LIZIZ(LIZ2);
    }

    public static void LIZ(String str, long j, JSONObject jSONObject) {
        if (j != -1) {
            jSONObject.put(str, j);
        }
    }

    public static void LIZIZ(EMC emc, JSONObject jSONObject, String str) {
        long j = emc.LIZ;
        if (j != -1) {
            jSONObject.put(str, j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object LJ(X.EMC r10, X.InterfaceC88472Yns<? super X.InterfaceC67352kd<? super T>, ? extends java.lang.Object> r11, X.InterfaceC67352kd<? super T> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof X.EM8
            if (r0 == 0) goto L26
            r3 = r12
            X.EM8 r3 = (X.EM8) r3
            int r2 = r3.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r3.LJLJJLL = r2
        L12:
            java.lang.Object r4 = r3.LJLJJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r3.LJLJJLL
            java.lang.String r8 = " cost: "
            r0 = 1
            if (r1 == 0) goto L3a
            if (r1 != r0) goto L32
            long r5 = r3.LJLJI
            X.EMC r10 = r3.LJLILLLLZI
            X.EM2 r7 = r3.LJLIL
            goto L2c
        L26:
            X.EM8 r3 = new X.EM8
            r3.<init>(r9, r12)
            goto L12
        L2c:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Throwable -> L30
            goto L51
        L30:
            r1 = move-exception
            goto L6e
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            X.C141335gf.LIZJ(r4)
            long r5 = android.os.SystemClock.uptimeMillis()
            r3.LJLIL = r9     // Catch: java.lang.Throwable -> L6c
            r3.LJLILLLLZI = r10     // Catch: java.lang.Throwable -> L6c
            r3.LJLJI = r5     // Catch: java.lang.Throwable -> L6c
            r3.LJLJJLL = r0     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r4 = r11.invoke(r3)     // Catch: java.lang.Throwable -> L6c
            if (r4 != r2) goto L50
            return r2
        L50:
            r7 = r9
        L51:
            r7.getClass()
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r5
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            java.lang.String r0 = r10.LIZIZ
            defpackage.b0.LJ(r3, r0, r8, r1)
            java.lang.String r0 = X.X1D.LIZIZ(r3)
            r7.LIZLLL(r0)
            r10.LIZ = r1
            return r4
        L6c:
            r1 = move-exception
            r7 = r9
        L6e:
            java.lang.String r0 = r10.LIZIZ     // Catch: java.lang.Throwable -> L74
            r7.LJFF(r0, r1)     // Catch: java.lang.Throwable -> L74
            throw r1     // Catch: java.lang.Throwable -> L74
        L74:
            r4 = move-exception
            r7.getClass()
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r5
            java.lang.StringBuilder r3 = X.X1D.LIZ()
            java.lang.String r0 = r10.LIZIZ
            defpackage.b0.LJ(r3, r0, r8, r1)
            java.lang.String r0 = X.X1D.LIZIZ(r3)
            r7.LIZLLL(r0)
            r10.LIZ = r1
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EM2.LJ(X.EMC, X.Yns, X.2kd):java.lang.Object");
    }
}
