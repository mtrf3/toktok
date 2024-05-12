package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Nkc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC60242Nkc implements Callable {
    public final /* synthetic */ C60241Nkb LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    public CallableC60242Nkc(C60241Nkb c60241Nkb, String str, long j, long j2) {
        this.LJLIL = c60241Nkb;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        android.net.Uri parse;
        Long remove;
        String str = this.LJLILLLLZI;
        if (str == null || (parse = UriProtector.parse(str)) == null) {
            return null;
        }
        C60238NkY c60238NkY = this.LJLIL.LIZJ;
        long j = this.LJLJI;
        long j2 = this.LJLJJI;
        c60238NkY.getClass();
        if ((o.LJ(parse.getScheme(), "http") || o.LJ(parse.getScheme(), "https")) && (remove = c60238NkY.LLIZ.remove(parse)) != null) {
            remove.longValue();
            System.currentTimeMillis();
        }
        if (!c60238NkY.LLIZLLLIL) {
            C60203Njz c60203Njz = (C60203Njz) c60238NkY.LLF.LIZJ(C60203Njz.class);
            if (c60203Njz != null && c60203Njz.LIZJ == null) {
                InterfaceC60276NlA interfaceC60276NlA = (InterfaceC60276NlA) C60299NlX.LIZ(c60238NkY, InterfaceC60276NlA.class);
                if (interfaceC60276NlA != null) {
                    C60547NpX c60547NpX = new C60547NpX("bdx_monitor_web_first_screen_duration", null, null, 254);
                    c60547NpX.LIZJ = c60238NkY.LJLLLLLL;
                    c60547NpX.LJII = Q7K.LIZLLL("duration", j);
                    interfaceC60276NlA.LJ(c60547NpX);
                }
                InterfaceC60276NlA interfaceC60276NlA2 = (InterfaceC60276NlA) C60299NlX.LIZ(c60238NkY, InterfaceC60276NlA.class);
                if (interfaceC60276NlA2 != null) {
                    C60547NpX c60547NpX2 = new C60547NpX("bdx_monitor_web_timeline", null, null, 254);
                    c60547NpX2.LIZJ = c60238NkY.LJLLLLLL;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("precreate", c60203Njz.LJ);
                    c60547NpX2.LJI = jSONObject;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("init_to_start_render", c60203Njz.LIZLLL);
                    jSONObject2.put("webview_create", c60203Njz.LJFF);
                    jSONObject2.put("webview_render", j2);
                    c60547NpX2.LJII = jSONObject2;
                    interfaceC60276NlA2.LJ(c60547NpX2);
                }
            }
            c60238NkY.LLIZLLLIL = true;
        }
        return C76800UCe.LIZ;
    }
}
