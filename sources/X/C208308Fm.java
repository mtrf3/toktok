package X;

import android.content.Context;
import com.ss.android.common.lib.AppLogNewUtils;
import fjb.a;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.net.monitor.StatusViewMonitor$Companion$monitor$1", f = "StatusViewMonitor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8Fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208308Fm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ JSONObject LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Context LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208308Fm(JSONObject jSONObject, int i, String str, String str2, Context context, InterfaceC67352kd<? super C208308Fm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = jSONObject;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C208308Fm(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            this.LJLIL.put("network_status", this.LJLILLLLZI).put(WM7.SCENE_SERVICE, this.LJLJI);
            if (o.LJ(this.LJLJJI, "prf_network_error_page_retry") || o.LJ(this.LJLJJI, "prf_enter_network_error_page")) {
                Context context = this.LJLJJL;
                if (context != null) {
                    JSONObject jSONObject = this.LJLIL;
                    Context LLLLL = C16880lQ.LLLLL(context);
                    o.LJIIIIZZ(LLLLL, "context.applicationContext");
                    jSONObject.put("error_tag", C48484J1c.LIZ(LLLLL));
                } else {
                    this.LJLIL.put("error_tag", -1);
                }
            }
        } catch (Exception unused) {
        }
        AppLogNewUtils.onEventV3(this.LJLJJI, this.LJLIL);
        return C76800UCe.LIZ;
    }
}
