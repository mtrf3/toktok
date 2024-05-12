package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.videoarch.strategy.strategy.networkStrategy.LSPreconnDataHandle;
import com.ss.videoarch.strategy.strategy.networkStrategy.LSPreconnTask;
import com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VBd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79321VBd {
    public String LIZ;
    public Context LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public InterfaceC79323VBf LJI;
    public C79312VAu LJII;
    public final LSPreconnDataHandle LJ = new LSPreconnDataHandle();
    public final C38891FOd LJFF = new C38891FOd();
    public final VBE LJIIIIZZ = new VBE(this);

    public final boolean LIZ() {
        Boolean bool = Boolean.TRUE;
        try {
            Method method = Class.forName("com.ss.videoarch.live.ttquic.ContextUtils").getMethod("initApplicationContext", Context.class);
            method.setAccessible(true);
            method.invoke(null, C16880lQ.LLLLL(this.LIZIZ));
            Method method2 = Class.forName("com.ss.videoarch.live.ttquic.JNIUtils").getMethod("setClassLoader", ClassLoader.class);
            method2.setAccessible(true);
            method2.invoke(null, this.LIZIZ.getClassLoader());
        } catch (Throwable unused) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        this.LIZJ = booleanValue;
        return booleanValue;
    }

    public static C79322VBe LIZJ(JSONObject jSONObject) {
        C79322VBe c79322VBe = new C79322VBe();
        try {
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(jSONObject, "data"), "origin"), "main");
            JSONObject jSONObject3 = new JSONObject(jSONObject2.optString("sdk_params"));
            String optString = jSONObject3.optString("SuggestFormat");
            String optString2 = jSONObject3.optString("SuggestProtocol");
            if (TextUtils.isEmpty(optString2) && C79346VCc.LIZLLL().LJIIL.LIZLLL.mUseH2QByDefault == 1) {
                optString2 = "h2q";
            }
            if (optString2.equals("quic")) {
                c79322VBe.LIZIZ = EnumC79338VBu.QUIC;
            } else if (optString2.equals("h2q")) {
                c79322VBe.LIZIZ = EnumC79338VBu.H2Q;
            } else {
                return c79322VBe;
            }
            String host = new java.net.URL(jSONObject2.optString(optString)).getHost();
            c79322VBe.LIZ = host;
            DnsOptimizer.LJFF().LJIIIZ(host);
        } catch (MalformedURLException | JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return c79322VBe;
    }

    public final void LIZIZ(String str, String str2, boolean z) {
        if ((!this.LIZJ && LIZ()) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        this.LJFF.LIZ.execute(new LSPreconnTask(this.LJIIIIZZ, str, str2, this.LIZ, z));
    }
}
