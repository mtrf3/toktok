package X;

import Y.IDCallableS415S0100000_17;
import com.benchmark.tools.DefaultSharedpreference;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes19.dex */
public final class ZUU extends ZUN {
    public ZTV LIZIZ;
    public long LIZJ;
    public volatile ZUA LIZLLL = ZUA.INVALID;
    public final InterfaceC36621EYv<TypedInput> LJ = new ZUO(this);

    public final void LIZIZ() {
        ZTV ztv = this.LIZIZ;
        ztv.getClass();
        if (ZU4.LIZJ.LIZIZ.LJ) {
            try {
                if (ztv.LJI) {
                    C47261Igj.LJIILJJIL("ByteBenchServiceManager");
                    ztv.LIZIZ.unbindService(ztv.LIZJ);
                    ztv.LIZ = null;
                    ztv.LJI = false;
                    ztv.LIZJ = null;
                    return;
                }
                return;
            } catch (Throwable th) {
                C38901fq.LJIIIZ(th);
                return;
            }
        }
        ztv.LJFF.release();
    }

    public final void LIZ(String str) {
        if (str != null) {
            DefaultSharedpreference.getInstance().setString(C09590Zf.LJIILLIIL.LIZ, "benchmark", str);
        } else {
            str = DefaultSharedpreference.getInstance().getString(C09590Zf.LJIILLIIL.LIZ, "benchmark");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("status_code", -1);
            if (optInt != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("loadByteBenchProcess failed: ");
                LIZ.append(optInt);
                LIZ.append("  ");
                LIZ.append(jSONObject.optString("message"));
                X1D.LIZIZ(LIZ);
                C47261Igj.LJIILL("BytebenchV2");
                this.LIZ.LIZ(103, -optInt, "loadBytebench with invalid status_code");
                return;
            }
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(JSONObjectProtectorUtils.getJSONObject(jSONObject, "data"), "resource_list");
            if (jSONArray == null) {
                C89999ZTv.LIZ(new ZUB(this, str), C89999ZTv.LJ);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i));
            }
            ZU8 zu8 = new ZU8(this, str);
            ZU9 zu9 = new ZU9(this);
            C47261Igj.LJIILJJIL("BytebenchV2");
            C89999ZTv.LIZ(new IDCallableS415S0100000_17(arrayList, 1), C89999ZTv.LJ).LIZIZ(new ZUP(zu8, zu9), C89999ZTv.LJFF);
        } catch (Exception e) {
            this.LIZ.LIZ(103, -1, e.getMessage());
            C38901fq.LJIIIZ(e);
        }
    }
}
