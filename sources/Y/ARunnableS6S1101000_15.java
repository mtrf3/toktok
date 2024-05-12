package Y;

import X.C86266XtO;
import X.C86267XtP;
import X.YSV;
import com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback;
import com.ss.android.videoshop.controller.VideoController;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class ARunnableS6S1101000_15 implements Runnable {
    public final int $t;
    public int i2;
    public Object l1;
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

    public final void LIZ$0() {
        C86266XtO c86266XtO = ((C86267XtP) this.l1).LJLJJLL;
        int i = this.i2;
        String str = this.s0;
        c86266XtO.LJLIL.LJLILLLLZI.LIZIZ();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            jSONObject.put("msg", str);
            jSONObject.put("data", new JSONArray());
            c86266XtO.LJLILLLLZI.LIZLLL(c86266XtO.LJLJI, jSONObject);
        } catch (JSONException unused) {
            c86266XtO.LJLILLLLZI.LIZLLL(c86266XtO.LJLJI, null);
        }
    }

    public static final void run$0(ARunnableS6S1101000_15 aRunnableS6S1101000_15) {
        boolean LIZ;
        String str;
        try {
            VideoController videoController = ((YSV) aRunnableS6S1101000_15.l1).LIZ;
            if (videoController != null) {
                int i = aRunnableS6S1101000_15.i2;
                try {
                    str = new JSONObject(aRunnableS6S1101000_15.s0).optString("info");
                } catch (Exception unused) {
                    str = "";
                }
                videoController.handleSubInfoCallback(i, 0, str);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S1101000_15 aRunnableS6S1101000_15) {
        boolean LIZ;
        try {
            aRunnableS6S1101000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS6S1101000_15 aRunnableS6S1101000_15) {
        boolean LIZ;
        try {
            ((IChooseMediaResultCallback) aRunnableS6S1101000_15.l1).onFailure(aRunnableS6S1101000_15.i2, aRunnableS6S1101000_15.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS6S1101000_15(Object obj, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i2 = i;
        this.s0 = str;
    }
}
