package X;

import android.view.View;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState;
import org.json.JSONObject;

/* renamed from: X.aGt, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92819aGt extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ CheckoutNavBarState LJLIL;
    public final /* synthetic */ C92158a6E LJLILLLLZI;
    public final /* synthetic */ InterfaceC91773a01 LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJL;
    public final /* synthetic */ C92283a8F LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92819aGt(CheckoutNavBarState checkoutNavBarState, C92158a6E c92158a6E, InterfaceC91773a01 interfaceC91773a01, View view, InterfaceC70422pa interfaceC70422pa, C92283a8F c92283a8F, InterfaceC65784Pro interfaceC65784Pro) {
        super(0);
        this.LJLIL = checkoutNavBarState;
        this.LJLILLLLZI = c92158a6E;
        this.LJLJI = interfaceC91773a01;
        this.LJLJJI = view;
        this.LJLJJL = interfaceC70422pa;
        this.LJLJJLL = c92283a8F;
        this.LJLJL = interfaceC65784Pro;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.LJLIL.getDisplayDialogOnClose()) {
            this.LJLILLLLZI.LJFF();
            C91863a1T.LIZIZ(this.LJLJI, this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
            C92283a8F c92283a8F = this.LJLJJLL;
            c92283a8F.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("obj_id", EnumC92042a4M.Close.getObjId());
            c92283a8F.LJ(jSONObject);
            return;
        }
        C92283a8F c92283a8F2 = this.LJLJJLL;
        c92283a8F2.getClass();
        String eventName = EnumC92044a4O.CheckoutPayResultClick.getEventName();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("obj_id", EnumC92042a4M.Close.getObjId());
        c92283a8F2.LIZ(eventName, jSONObject2);
        XKX.LIZLLL(this.LJLJJL, null, null, new C93115aLf(this.LJLJL, null), 3);
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
