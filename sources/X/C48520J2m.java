package X;

import Y.ARunnableS19S0300000_8;
import com.ss.android.ml.process.bl.AfOPModel;
import com.ss.android.ml.process.bl.MLConfigModel;
import defpackage.i0;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.J2m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48520J2m extends AbstractC48521J2n {
    public final String LIZJ;
    public final C48519J2l LIZLLL;
    public final J30 LJ;
    public long LJFF;
    public int LJI;

    @Override // X.AbstractC48521J2n
    public final boolean LIZIZ() {
        return this.LJ.LIZJ();
    }

    @Override // X.AbstractC48521J2n
    public final boolean LIZLLL() {
        H2L h2l;
        boolean z;
        if (J3Y.LIZ) {
            String str = this.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ml sdk isEnvReady enable:");
            LIZ.append(LIZIZ());
            LIZ.append(" hasInit:");
            H2L h2l2 = this.LJ.LIZJ;
            if (h2l2 != null) {
                z = ((J32) h2l2).LJI;
            } else {
                z = false;
            }
            LIZ.append(z);
            J3Y.LIZ(str, X1D.LIZIZ(LIZ));
        }
        if (!LIZIZ() || (h2l = this.LJ.LIZJ) == null || !((J32) h2l).LJI) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC48521J2n
    public final void LJ() {
        this.LJ.LIZLLL();
    }

    @Override // X.AbstractC48521J2n
    public final void LIZ(C35750E1i c35750E1i) {
        Integer num;
        if (o.LJ("fillMonitorData", "fillMonitorData")) {
            Object LIZ = c35750E1i.LIZ("monitorType");
            JSONObject jSONObject = null;
            if (LIZ instanceof Integer) {
                num = (Integer) LIZ;
            } else {
                num = null;
            }
            Object LIZ2 = c35750E1i.LIZ("json");
            if (LIZ2 instanceof JSONObject) {
                jSONObject = (JSONObject) LIZ2;
            }
            if (num != null && jSONObject != null) {
                int intValue = num.intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        return;
                    }
                    jSONObject.put("sdk_duration", this.LJFF);
                    jSONObject.put("sdk_success", this.LJI);
                    C48528J2u c48528J2u = C34901Dmr.LIZ.get(this.LIZ);
                    if (c48528J2u == null) {
                        return;
                    }
                    C48529J2v c48529J2v = c48528J2u.LJIIJJI;
                    if (c48529J2v != null && c48529J2v.LIZIZ() >= 0.0f) {
                        jSONObject.put("pre_cost", Float.valueOf(c48529J2v.LIZIZ()));
                    }
                    C48529J2v c48529J2v2 = c48528J2u.LJIIL;
                    if (c48529J2v2 != null && c48529J2v2.LIZIZ() >= 0.0f) {
                        jSONObject.put("infer_cost", Float.valueOf(c48529J2v2.LIZIZ()));
                    }
                    C48529J2v c48529J2v3 = c48528J2u.LJIILIIL;
                    if (c48529J2v3 != null && c48529J2v3.LIZIZ() >= 0.0f) {
                        jSONObject.put("post_cost", Float.valueOf(c48529J2v3.LIZIZ()));
                    }
                    c48528J2u.LJ.LIZ();
                    c48528J2u.LJFF.LIZ();
                    c48528J2u.LJI.LIZ();
                    c48528J2u.LJII = false;
                    c48528J2u.LJIIIIZZ = false;
                    c48528J2u.LJIIIZ = false;
                    c48528J2u.LIZ();
                    return;
                }
                C48528J2u c48528J2u2 = C34901Dmr.LIZ.get(this.LIZ);
                if (c48528J2u2 == null) {
                    return;
                }
                C48529J2v c48529J2v4 = c48528J2u2.LJFF;
                if (c48529J2v4 != null && c48529J2v4.LIZIZ() >= 0.0f) {
                    jSONObject.put("download_cost", Float.valueOf(c48529J2v4.LIZIZ()));
                    c48529J2v4.LIZ();
                }
                C48529J2v c48529J2v5 = c48528J2u2.LJI;
                if (c48529J2v5 == null || c48529J2v5.LIZIZ() < 0.0f) {
                    return;
                }
                jSONObject.put("model_cost", Float.valueOf(c48529J2v5.LIZIZ()));
                c48529J2v5.LIZ();
            }
        }
    }

    @Override // X.AbstractC48521J2n
    public final C47333Iht LJI(C47322Ihi c47322Ihi) {
        int i;
        Float f = null;
        List<String> list = null;
        C47333Iht c47333Iht = new C47333Iht((Object) null);
        String str = this.LIZLLL.LIZJ;
        if (str == null) {
            str = "";
        }
        try {
            try {
                this.LJFF = -1L;
            } catch (Exception unused) {
                String str2 = this.LIZJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("ml sdk name:");
                LIZ.append(this.LIZ);
                LIZ.append(" outputType:");
                LIZ.append(str);
                LIZ.append(" run fail.");
                J3Y.LIZIZ().LIZIZ(str2, X1D.LIZIZ(LIZ));
                i = -6;
                c47333Iht.LJ = -6;
            }
            if (c47322Ihi == null) {
                c47333Iht.LJ = -3;
                this.LJI = -3;
                return c47333Iht;
            }
            if (!this.LJ.LIZLLL()) {
                if (J3Y.LIZ) {
                    J3Y.LIZJ(this.LIZJ, "ml sdk classify run skip, env not ready!", null);
                }
                c47333Iht.LJ = -2;
                this.LJI = -2;
                return c47333Iht;
            }
            J30 j30 = this.LJ;
            H2L h2l = j30.LIZJ;
            List<? extends J5M> LJ = j30.LJ();
            MLConfigModel mLConfigModel = this.LJ.LJFF;
            AfOPModel afOPModel = mLConfigModel.output;
            List<String> list2 = mLConfigModel.feature_list;
            if (o.LJ(str, "classify")) {
                long currentTimeMillis = System.currentTimeMillis();
                java.util.Map<String, Object> LIZ2 = c47322Ihi.LIZ();
                HashMap hashMap = new HashMap();
                if (h2l != null) {
                    list = ((J32) h2l).LIZJ(LIZ2, LJ, afOPModel, list2, hashMap);
                }
                this.LJFF = System.currentTimeMillis() - currentTimeMillis;
                if (list != null && (!list.isEmpty())) {
                    c47333Iht.LJ = 0;
                    c47333Iht.LIZIZ = hashMap;
                    c47333Iht.LIZ = list.get(0);
                    if (J3Y.LIZ) {
                        String str3 = this.LIZJ;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("ml sdk name:");
                        LIZ3.append(this.LIZ);
                        LIZ3.append(" outputType:");
                        LIZ3.append(str);
                        LIZ3.append(" run output result:");
                        LIZ3.append(list);
                        LIZ3.append(" probabilityMap:");
                        LIZ3.append(hashMap);
                        LIZ3.append(" outResult:");
                        LIZ3.append(c47333Iht);
                        J3Y.LIZ(str3, X1D.LIZIZ(LIZ3));
                    }
                } else {
                    c47333Iht.LJ = -5;
                }
            } else if (o.LJ(str, "regression")) {
                long currentTimeMillis2 = System.currentTimeMillis();
                java.util.Map<String, Object> LIZ4 = c47322Ihi.LIZ();
                if (h2l != null) {
                    f = Float.valueOf(((J32) h2l).LIZIZ(LIZ4, LJ, afOPModel, list2));
                }
                this.LJFF = System.currentTimeMillis() - currentTimeMillis2;
                if (f != null) {
                    c47333Iht.LJ = 0;
                    c47333Iht.LIZJ = f;
                    if (J3Y.LIZ) {
                        String str4 = this.LIZJ;
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("ml sdk name:");
                        LIZ5.append(this.LIZ);
                        LIZ5.append(" outputType:");
                        LIZ5.append(str);
                        LIZ5.append(" output result:");
                        LIZ5.append(f);
                        LIZ5.append(" outputData:");
                        LIZ5.append(c47333Iht);
                        J3Y.LIZ(str4, X1D.LIZIZ(LIZ5));
                    }
                } else {
                    c47333Iht.LJ = -5;
                }
            } else {
                c47333Iht.LJ = -8;
            }
            i = c47333Iht.LJ;
            this.LJI = i;
            return c47333Iht;
        } catch (Throwable th) {
            this.LJI = c47333Iht.LJ;
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48520J2m(String name, C47663InD c47663InD) {
        super(name, c47663InD);
        C48528J2u c48528J2u;
        o.LJIIIZ(name, "name");
        String LJFF = i0.LJFF("ml#", name);
        this.LIZJ = LJFF;
        C48519J2l c48519J2l = new C48519J2l(c47663InD);
        this.LIZLLL = c48519J2l;
        J30 j30 = new J30(c48519J2l);
        this.LJ = j30;
        j30.LJIIJ = LJFF;
        if (!j30.LIZJ() || (c48528J2u = C34901Dmr.LIZ.get(name)) == null) {
            return;
        }
        c48528J2u.LIZ = C78880UxY.LJJIFFI(c47663InD);
    }

    @Override // X.AbstractC48521J2n
    public final void LJFF(C47322Ihi c47322Ihi, C48522J2o c48522J2o) {
        J3U.LIZIZ(new ARunnableS19S0300000_8(c47322Ihi, this, c48522J2o, 8));
    }
}
