package X;

import fjb.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.track.ECEvent$post$1", f = "ECEvent.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2nm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69302nm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AbstractC69312nn LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69302nm(AbstractC69312nn abstractC69312nn, InterfaceC67352kd<? super C69302nm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = abstractC69312nn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69302nm(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            HashMap<String, Object> LIZ = this.LJLIL.LIZ();
            if (LIZ != null) {
                this.LJLIL.LIZIZ.putAll(LIZ);
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : this.LJLIL.LIZIZ.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            C48658J7u.LIZIZ(this.LJLIL.LIZ, jSONObject);
        } catch (Throwable unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
