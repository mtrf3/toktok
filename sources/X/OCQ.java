package X;

import Y.ARunnableS11S1100000_10;
import android.os.Handler;
import android.webkit.JavascriptInterface;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class OCQ {
    public final OCS LIZ;
    public final /* synthetic */ OCP LIZIZ;

    @JavascriptInterface
    public void callMethodParams(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "-2023727633612652411");
        if (c03880Dg.LIZJ(300001, "com/bytedance/bdturing/methods/JsBridgeModule$AndroidJsInterface", "callMethodParams", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/bdturing/methods/JsBridgeModule$AndroidJsInterface", "callMethodParams", null, objArr, this, c65300Pk0, false);
            return;
        }
        Handler handler = this.LIZIZ.LIZIZ;
        if (handler == null) {
            c03880Dg.LIZIZ(300001, "com/bytedance/bdturing/methods/JsBridgeModule$AndroidJsInterface", "callMethodParams", null, objArr, this, c65300Pk0, true);
        } else {
            handler.post(new ARunnableS11S1100000_10(this, str, 12));
            c03880Dg.LIZIZ(300001, "com/bytedance/bdturing/methods/JsBridgeModule$AndroidJsInterface", "callMethodParams", null, objArr, this, c65300Pk0, true);
        }
    }

    @JavascriptInterface
    public void offMethodParams(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "-2023727633612652411");
        if (c03880Dg.LIZJ(300001, "com/bytedance/bdturing/methods/JsBridgeModule$AndroidJsInterface", "offMethodParams", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/bdturing/methods/JsBridgeModule$AndroidJsInterface", "offMethodParams", null, objArr, this, c65300Pk0, false);
        } else {
            c03880Dg.LIZIZ(300001, "com/bytedance/bdturing/methods/JsBridgeModule$AndroidJsInterface", "offMethodParams", null, objArr, this, c65300Pk0, true);
        }
    }

    @JavascriptInterface
    public void onMethodParams(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "-2023727633612652411");
        if (c03880Dg.LIZJ(300001, "com/bytedance/bdturing/methods/JsBridgeModule$AndroidJsInterface", "onMethodParams", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/bdturing/methods/JsBridgeModule$AndroidJsInterface", "onMethodParams", null, objArr, this, c65300Pk0, false);
            return;
        }
        try {
            JSONObjectProtectorUtils.getString(new JSONObject(str), "__callback_id");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        c03880Dg.LIZIZ(300001, "com/bytedance/bdturing/methods/JsBridgeModule$AndroidJsInterface", "onMethodParams", null, objArr, this, c65300Pk0, true);
    }

    public OCQ(OCP ocp, OCS ocs) {
        this.LIZIZ = ocp;
        this.LIZ = ocs;
    }
}
