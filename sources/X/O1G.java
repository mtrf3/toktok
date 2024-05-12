package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O1G<V> implements Callable<C76800UCe> {
    public final /* synthetic */ O1D LJLIL;
    public final /* synthetic */ O1I LJLILLLLZI;
    public final /* synthetic */ O1L LJLJI;
    public final /* synthetic */ String LJLJJI;

    public O1G(O1D o1d, O1W o1w, O1L o1l, String str) {
        this.LJLIL = o1d;
        this.LJLILLLLZI = o1w;
        this.LJLJI = o1l;
        this.LJLJJI = str;
    }

    @Override // java.util.concurrent.Callable
    public final C76800UCe call() {
        InterfaceC60276NlA interfaceC60276NlA;
        Object LIZ;
        O1K.LIZIZ(this.LJLILLLLZI, this.LJLJI);
        if (this.LJLILLLLZI.LJIIJJI && (interfaceC60276NlA = (InterfaceC60276NlA) this.LJLIL.getService(InterfaceC60276NlA.class)) != null) {
            Object obj = null;
            C60547NpX c60547NpX = new C60547NpX("bdx_resourceloader_fetch", null, null, 254);
            try {
                LIZ = UriProtector.getQueryParameter(this.LJLILLLLZI.LJFF, "surl");
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (!C3C5.m12isFailureimpl(LIZ)) {
                obj = LIZ;
            }
            String str = (String) obj;
            if (str == null) {
                str = this.LJLILLLLZI.LJFF.toString();
            }
            c60547NpX.LJ = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("res_url", this.LJLILLLLZI.LJFF.toString());
            jSONObject.put("res_state", "fail");
            jSONObject.put("res_message", this.LJLJJI);
            O1I o1i = this.LJLILLLLZI;
            if (o1i instanceof O1W) {
                jSONObject.put("res_gfm", ((O1W) o1i).LJIILLIIL);
                jSONObject.put("res_bfm", ((O1W) this.LJLILLLLZI).LJIJI);
                jSONObject.put("res_cfm", ((O1W) this.LJLILLLLZI).LJIJJ);
            }
            jSONObject.put("res_tag", this.LJLJI.LJIIJJI);
            c60547NpX.LJI = jSONObject;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("res_duration", SystemClock.uptimeMillis() - this.LJLILLLLZI.LJIILL);
            c60547NpX.LJII = jSONObject2;
            O1E LJJIJIIJIL = O1D.LJJIJIIJIL(this.LJLIL);
            String uri = this.LJLILLLLZI.LJFF.toString();
            o.LJFF(uri, "resInfo.srcUri.toString()");
            c60547NpX.LJIIIIZZ = Boolean.valueOf(O1K.LIZ(LJJIJIIJIL, uri));
            interfaceC60276NlA.LJ(c60547NpX);
        }
        return C76800UCe.LIZ;
    }
}
