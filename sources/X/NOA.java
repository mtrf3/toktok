package X;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NOA implements InterfaceC59247NNb {
    public final Context LIZ;
    public final NOC LIZIZ;
    public final ArrayList<Integer> LIZJ;
    public final SparseArray<Bundle> LIZLLL;
    public CommonAdData LJ;

    public final NO9 LIZIZ() {
        C44421Hc1 c44421Hc1 = new C44421Hc1(this.LIZLLL, this.LIZJ, this.LIZIZ, this);
        Iterator it = c44421Hc1.LIZ.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Bundle bundle = (Bundle) ((SparseArray) c44421Hc1.LIZIZ).get(intValue);
            if (bundle == null) {
                bundle = new Bundle();
            }
            AbstractC59249NNd LIZ = c44421Hc1.LIZJ.LIZ(intValue, (InterfaceC59247NNb) c44421Hc1.LIZLLL, bundle);
            if (LIZ != null && LIZ.LIZIZ()) {
                C59289NOr LIZJ = LIZ.LIZJ();
                LIZ.LIZ(LIZJ.LIZ);
                ((JSONObject) c44421Hc1.LJ).put(String.valueOf(intValue), LIZJ.LIZIZ);
                if (LIZJ.LIZ) {
                    String jSONObject = ((JSONObject) c44421Hc1.LJ).toString();
                    o.LJIIIIZZ(jSONObject, "errorObj.toString()");
                    return new NO9(intValue, jSONObject, true);
                }
            }
        }
        String jSONObject2 = ((JSONObject) c44421Hc1.LJ).toString();
        o.LJIIIIZZ(jSONObject2, "errorObj.toString()");
        return new NO9(LiveLayoutPreloadThreadPriority.DEFAULT, jSONObject2, false);
    }

    @Override // X.InterfaceC59247NNb
    public final CommonAdData LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC59247NNb
    public final Context getContext() {
        return this.LIZ;
    }

    public NOA(Context context, NOC noc) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = noc;
        this.LIZJ = new ArrayList<>();
        this.LIZLLL = new SparseArray<>();
        C221108m2.LIZIZ(NOB.LJLIL);
    }

    public final NOA LIZJ(int i, Bundle bundle) {
        this.LIZJ.add(Integer.valueOf(i));
        this.LIZLLL.put(i, bundle);
        return this;
    }
}
