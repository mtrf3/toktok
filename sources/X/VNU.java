package X;

import Y.ARunnableS15S1100000_14;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.core.JSProxy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class VNU extends ContextWrapper implements VO0 {
    public InterfaceC79290V9y LJLIL;
    public InterfaceC79290V9y LJLILLLLZI;
    public JavaOnlyMap LJLJI;
    public final java.util.Map<String, ReadableMap> LJLJJI;
    public VNL LJLJJL;
    public VPV LJLJJLL;
    public C79655VNz LJLJL;
    public WeakReference<JSProxy> LJLJLJ;
    public UIBody LJLJLLL;
    public java.util.Map<String, C40052Fnk> LJLL;
    public WeakReference<VOR> LJLLI;
    public WeakReference<C79646VNq> LJLLILLLL;
    public String LJLLJ;
    public VNV LJLLL;
    public WeakReference<VNS> LJLLLL;
    public WeakReference<VOL> LJLLLLLL;
    public final DisplayMetrics LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public C47523Ikx LL;
    public List<VOJ> LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public WeakReference<C60740Nse> LLFII;
    public final VOE LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public int LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public int LLIL;
    public boolean LLILII;
    public WeakReference<Context> mContext;

    public void LJII(Exception exc, int i, JSONObject jSONObject) {
    }

    public void LJIIIIZZ(Exception exc) {
    }

    public abstract void handleException(Exception exc);

    public final Context LIZ() {
        return this.mContext.get();
    }

    public final C79646VNq LIZJ() {
        return this.LJLLILLLL.get();
    }

    public final C60740Nse LIZLLL() {
        WeakReference<C60740Nse> weakReference = this.LLFII;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final VMD LJ() {
        if (this.LJLLLL.get() != null) {
            return this.LJLLLL.get().getLynxConfigInfo();
        }
        return null;
    }

    public final VOR LJFF() {
        return this.LJLLI.get();
    }

    public final VNS LJI() {
        return this.LJLLLL.get();
    }

    public final C40052Fnk LIZIZ(String str) {
        String LIZIZ = C40051Fnj.LIZIZ(str);
        if (TextUtils.isEmpty(LIZIZ)) {
            return null;
        }
        synchronized (C40051Fnj.class) {
            if (this.LJLL == null) {
                this.LJLL = new HashMap();
            }
            C40052Fnk c40052Fnk = this.LJLL.get(LIZIZ);
            if (c40052Fnk == null) {
                C40052Fnk LIZ = C40051Fnj.LIZ(this, LIZIZ);
                if (LIZ != null) {
                    this.LJLL.put(LIZIZ, LIZ);
                }
                return LIZ;
            }
            return c40052Fnk;
        }
    }

    public final void LJIIIZ(LynxBaseUI lynxBaseUI) {
        VOE voe = this.LLFZ;
        if (voe == null) {
            return;
        }
        voe.getClass();
        if (lynxBaseUI.mExposureID != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(lynxBaseUI.mExposureScene);
            LIZ.append("_");
            LIZ.append(lynxBaseUI.mExposureID);
            LIZ.append("_");
            LIZ.append(lynxBaseUI.getSign());
            C79411VEp.LJ(new ARunnableS15S1100000_14(voe, X1D.LIZIZ(LIZ), 9));
        }
    }

    public VNU(Context context, DisplayMetrics displayMetrics) {
        super(context);
        this.LJLJJI = new HashMap();
        this.LJLJJLL = null;
        this.LJLLJ = null;
        this.LJLLL = null;
        this.mContext = null;
        this.LJLLLL = null;
        this.LJZ = false;
        this.LJZI = false;
        this.LJZL = false;
        this.LLF = false;
        this.LLFF = false;
        this.LLFFF = false;
        this.LLI = false;
        this.LLIFFJFJJ = false;
        this.LLII = true;
        this.LLIIII = true;
        this.LLIIIILZ = false;
        this.LLIIIJ = false;
        this.LLIIIL = false;
        this.LLIIIZ = false;
        this.LLIIJI = false;
        this.LLIIJLIL = 20;
        this.LLIIL = false;
        this.LLIILII = true;
        this.LLIILZL = true;
        this.LLIIZ = true;
        this.LLIL = -1;
        this.LLILII = false;
        this.mContext = new WeakReference<>(context);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        this.LJLZ = displayMetrics2;
        displayMetrics2.setTo(displayMetrics);
        this.LLFZ = new VOE();
    }

    public final void LJIIJJI(String str, JavaOnlyArray javaOnlyArray) {
        JSProxy jSProxy;
        WeakReference<JSProxy> weakReference = this.LJLJLJ;
        if (weakReference == null || (jSProxy = weakReference.get()) == null) {
            return;
        }
        C79639VNj c79639VNj = new C79639VNj("GlobalEventEmitter", jSProxy);
        JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
        javaOnlyArray2.pushString(str);
        javaOnlyArray2.pushArray(javaOnlyArray);
        c79639VNj.LIZIZ.LIZ(c79639VNj.LIZ, javaOnlyArray2);
    }

    public final void LJIIJ(String str, String str2, String str3) {
        if (this.LJLLL != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("src", str);
                jSONObject.put("error_msg", str3);
                jSONObject.put("type", str2);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            this.LJLLL.LJIJ(new LynxError(jSONObject.toString(), 301));
        }
    }
}
