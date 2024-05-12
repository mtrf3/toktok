package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.lynx.bridge.TTLiveLynxBridgeModule;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Exp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38129Exp extends AbstractC38114Exa {
    public final InterfaceC65784Pro<String> LJIIJJI;
    public TTLiveLynxBridgeModule LJIIL;
    public InterfaceC31964Cga LJIILIIL;
    public AbstractC65781Prl LJIILJJIL;

    @Override // X.AbstractC38114Exa
    public final void LJIIIIZZ(C38116Exc c38116Exc) {
    }

    @Override // X.AbstractC38114Exa
    public final View LJFF() {
        InterfaceC31964Cga interfaceC31964Cga = this.LJIILIIL;
        if (interfaceC31964Cga != null) {
            return interfaceC31964Cga.LIZJ();
        }
        return null;
    }

    @Override // X.AbstractC38114Exa
    public final String LJI() {
        return this.LJIIJJI.invoke();
    }

    public C38129Exp(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJIIJJI = interfaceC65784Pro;
    }

    @Override // X.AbstractC38114Exa
    public final Context LJ(C38116Exc environment) {
        o.LJIIIZ(environment, "environment");
        Context context = environment.LJFF;
        if (context == null) {
            Activity topActivity = ((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity();
            o.LJIIIIZZ(topActivity, "getService(IHostAction::class.java).topActivity");
            return topActivity;
        }
        return context;
    }

    @Override // X.AbstractC38114Exa
    public final void LJIIIZ(String str) {
        String str2;
        Object remove;
        JSONObject jSONObject = new JSONObject(str);
        Object remove2 = jSONObject.remove("__event_id");
        if ((remove2 instanceof String) && (str2 = (String) remove2) != null && (remove = jSONObject.remove("__params")) != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("data", remove);
            JavaOnlyMap LIZLLL = C38377F4j.LIZLLL(jSONObject2);
            InterfaceC31964Cga interfaceC31964Cga = this.LJIILIIL;
            if (interfaceC31964Cga != null) {
                interfaceC31964Cga.LIZ(str2, JavaOnlyArray.of(LIZLLL));
            }
        }
    }

    @Override // X.AbstractC38114Exa
    public final void LJIIJ(String str, C38117Exd c38117Exd) {
        if (c38117Exd == null) {
            return;
        }
        TTLiveLynxBridgeModule tTLiveLynxBridgeModule = this.LJIIL;
        if (tTLiveLynxBridgeModule != null) {
            tTLiveLynxBridgeModule.invokeCallback$livehybrid_impl_release(new JSONObject(str), c38117Exd);
        } else {
            o.LJIJI("lynxBridgeModule");
            throw null;
        }
    }

    @Override // X.AbstractC38114Exa
    public final void LJIIJJI(JSONObject jSONObject, C38117Exd c38117Exd) {
        if (c38117Exd == null) {
            return;
        }
        TTLiveLynxBridgeModule tTLiveLynxBridgeModule = this.LJIIL;
        if (tTLiveLynxBridgeModule != null) {
            tTLiveLynxBridgeModule.invokeCallback$livehybrid_impl_release(jSONObject, c38117Exd);
        } else {
            o.LJIJI("lynxBridgeModule");
            throw null;
        }
    }

    public final C38117Exd LJIILLIIL(String methodName, String str, String str2, String str3) {
        o.LJIIIZ(methodName, "methodName");
        C38128Exo c38128Exo = new C38128Exo();
        c38128Exo.LIZJ = methodName;
        c38128Exo.LIZLLL = str;
        c38128Exo.LJ = str3;
        c38128Exo.LJFF = str2;
        C38117Exd c38117Exd = new C38117Exd(c38128Exo);
        LJIIL(c38117Exd);
        return c38117Exd;
    }
}
