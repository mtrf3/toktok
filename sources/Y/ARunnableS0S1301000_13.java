package Y;

import X.C16880lQ;
import X.C29889BoD;
import X.C78443UqV;
import X.C78446UqY;
import X.C78447UqZ;
import X.InterfaceC30737C4n;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS0S1301000_13 implements Runnable {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS0S1301000_13 aRunnableS0S1301000_13) {
        ViewGroup viewGroup;
        switch (aRunnableS0S1301000_13.i4) {
            case 0:
                Object obj = aRunnableS0S1301000_13.l1;
                String str = aRunnableS0S1301000_13.s0;
                JSONObject jSONObject = (JSONObject) aRunnableS0S1301000_13.l2;
                JSONObject jSONObject2 = (JSONObject) aRunnableS0S1301000_13.l3;
                obj.getClass();
                C78443UqV.LJJI().monitorDuration(str, jSONObject, jSONObject2);
                return;
            default:
                C78447UqZ c78447UqZ = (C78447UqZ) aRunnableS0S1301000_13.l1;
                String str2 = aRunnableS0S1301000_13.s0;
                Context context = (Context) aRunnableS0S1301000_13.l2;
                View view = (View) aRunnableS0S1301000_13.l3;
                InterfaceC30737C4n interfaceC30737C4n = null;
                if (str2 != null) {
                    c78447UqZ.getClass();
                    C78446UqY.LIZLLL = str2;
                    C29889BoD LIZIZ = C29889BoD.LIZIZ(context);
                    LIZIZ.LJII(str2, "hardware_info_gpu_name");
                    LIZIZ.LIZ();
                    WeakReference<InterfaceC30737C4n> weakReference = c78447UqZ.LJLILLLLZI.LIZJ;
                    if (weakReference != null) {
                        interfaceC30737C4n = weakReference.get();
                    }
                    C78446UqY c78446UqY = c78447UqZ.LJLILLLLZI;
                    String str3 = C78446UqY.LIZLLL;
                    c78446UqY.getClass();
                    if (interfaceC30737C4n != null) {
                        interfaceC30737C4n.LIZ(str3);
                    }
                }
                WeakReference<ViewGroup> weakReference2 = c78447UqZ.LJLILLLLZI.LIZIZ;
                if (weakReference2 == null || (viewGroup = weakReference2.get()) == null) {
                    return;
                }
                C16880lQ.LJLLL(view, viewGroup);
                return;
        }
    }

    public static final void run$1(ARunnableS0S1301000_13 aRunnableS0S1301000_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS0S1301000_13.l1;
        String str = aRunnableS0S1301000_13.s0;
        int i = aRunnableS0S1301000_13.i4;
        JSONObject jSONObject = (JSONObject) aRunnableS0S1301000_13.l2;
        JSONObject jSONObject2 = (JSONObject) aRunnableS0S1301000_13.l3;
        c78443UqV.getClass();
        C78443UqV.LJJI().monitorStatusAndDuration(str, i, jSONObject, jSONObject2);
    }

    public static final void run$2(ARunnableS0S1301000_13 aRunnableS0S1301000_13) {
        C78443UqV c78443UqV = (C78443UqV) aRunnableS0S1301000_13.l1;
        JSONObject jSONObject = (JSONObject) aRunnableS0S1301000_13.l2;
        String str = aRunnableS0S1301000_13.s0;
        int i = aRunnableS0S1301000_13.i4;
        JSONObject jSONObject2 = (JSONObject) aRunnableS0S1301000_13.l3;
        c78443UqV.getClass();
        C78443UqV.LJJI().monitorStatusAndDuration(str, i, jSONObject2, C78443UqV.LJIL(jSONObject));
    }

    public ARunnableS0S1301000_13(C78443UqV c78443UqV, JSONObject jSONObject, int i) {
        this.$t = i;
        this.l1 = c78443UqV;
        this.s0 = "bd_hybrid_monitor_service_all_in_one";
        this.i4 = 0;
        this.l2 = null;
        this.l3 = jSONObject;
    }

    public ARunnableS0S1301000_13(int i, Object obj, String str, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.i4 = i;
        this.l3 = obj3;
    }
}
