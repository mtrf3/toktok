package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v5.n;

/* renamed from: X.XsY, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class RunnableC86214XsY implements Runnable {
    public final WeakReference<C86220Xse> LJLIL;
    public final WeakReference<InterfaceC86221Xsf> LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C86220Xse c86220Xse = this.LJLIL.get();
            InterfaceC86221Xsf interfaceC86221Xsf = this.LJLILLLLZI.get();
            if (c86220Xse != null && interfaceC86221Xsf != null) {
                try {
                    interfaceC86221Xsf.LIZJ(LIZ(c86220Xse));
                } catch (JSONException unused) {
                    interfaceC86221Xsf.LIZ(0, "uploadFailed");
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static JSONArray LIZ(C86220Xse c86220Xse) {
        String str = c86220Xse.LIZJ;
        final n nVar = new n();
        try {
            AVExternalServiceImpl.LIZ().abilityService().processService().compressPhoto(str, 216, 384, new IAVProcessService.IProcessCallback() { // from class: X.Xsg
                @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
                public final void finish(Object obj) {
                    n.this.LJ(obj);
                }
            });
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        C10K<TResult> c10k = nVar.LIZ;
        try {
            c10k.LJIJI();
        } catch (InterruptedException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        String str2 = (String) c10k.LJIIJJI();
        if (str2 != null) {
            try {
                C37247Ejb.LIZIZ.getClass();
                str2 = OXG.LIZ(C37246Eja.LJ(str2));
            } catch (IOException e3) {
                C16880lQ.LLLLIIL(e3);
            }
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(c86220Xse.LIZ)) {
            jSONObject.put("url", c86220Xse.LIZ);
        }
        if (!TextUtils.isEmpty(c86220Xse.LIZIZ)) {
            jSONObject.put("uri", c86220Xse.LIZIZ);
        }
        jSONObject.put("base64", str2);
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    public RunnableC86214XsY(C86220Xse c86220Xse, InterfaceC86221Xsf interfaceC86221Xsf) {
        this.LJLIL = new WeakReference<>(c86220Xse);
        this.LJLILLLLZI = new WeakReference<>(interfaceC86221Xsf);
    }
}
