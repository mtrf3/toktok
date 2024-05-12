package X;

import fjb.a;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.elements.PayResultPageKt$PayResultPage$4", f = "PayResultPage.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aL6, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93080aL6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C92283a8F LJLIL;
    public final /* synthetic */ C92108a5Q LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93080aL6(C92283a8F c92283a8F, C92108a5Q c92108a5Q, InterfaceC67352kd<? super C93080aL6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c92283a8F;
        this.LJLILLLLZI = c92108a5Q;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93080aL6(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        C92283a8F c92283a8F = this.LJLIL;
        int i = C91855a1L.LIZ[this.LJLILLLLZI.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "failed";
            } else {
                str = "pending";
            }
        } else {
            str = "success";
        }
        String LIZ = this.LJLILLLLZI.LIZ();
        c92283a8F.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("result", str);
        if (LIZ != null) {
            jSONObject.put("err_code", LIZ);
        }
        c92283a8F.LIZLLL(EnumC92044a4O.CheckoutPayResultShow.getEventName(), jSONObject);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
