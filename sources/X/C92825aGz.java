package X;

import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.pipo.checkout.api.network.model.request.PaymentMethod;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.aGz, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92825aGz extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C05P LJLIL;
    public final /* synthetic */ InterfaceC91961a33 LJLILLLLZI;
    public final /* synthetic */ C92283a8F LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<CheckoutAction, C76800UCe> LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ InterfaceC91773a01 LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<CheckoutAction, C76800UCe> LJLJL;
    public final /* synthetic */ C91706Zyw LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92825aGz(C05P c05p, InterfaceC91961a33 interfaceC91961a33, C92283a8F c92283a8F, InterfaceC88472Yns<? super CheckoutAction, C76800UCe> interfaceC88472Yns, View view, InterfaceC91773a01 interfaceC91773a01, InterfaceC88472Yns<? super CheckoutAction, C76800UCe> interfaceC88472Yns2, C91706Zyw c91706Zyw) {
        super(0);
        this.LJLIL = c05p;
        this.LJLILLLLZI = interfaceC91961a33;
        this.LJLJI = c92283a8F;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = view;
        this.LJLJJLL = interfaceC91773a01;
        this.LJLJL = interfaceC88472Yns2;
        this.LJLJLJ = c91706Zyw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        boolean booleanValue;
        Object obj;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        Boolean bool;
        boolean booleanValue2;
        C05P c05p = this.LJLIL;
        if (c05p != null) {
            c05p.hide();
        }
        InterfaceC91961a33 interfaceC91961a33 = this.LJLILLLLZI;
        boolean z = false;
        String str = "";
        if (interfaceC91961a33 instanceof C92233a7R) {
            C92283a8F c92283a8F = this.LJLJI;
            String paymentMethod = ((C92233a7R) interfaceC91961a33).LJLIL.getPaymentMethod();
            if (paymentMethod != null) {
                str = paymentMethod;
            }
            Boolean isDefault = ((C92233a7R) this.LJLILLLLZI).LJLIL.isDefault();
            if (isDefault != null) {
                z = isDefault.booleanValue();
            }
            c92283a8F.LJII(str, true, z);
            InterfaceC88472Yns<CheckoutAction, C76800UCe> interfaceC88472Yns = this.LJLJJI;
            java.util.Map<String, InterfaceC91938a2g<?>> map = ((C91942a2k) C91943a2l.LJIIJJI.getValue()).LIZIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (!(entry.getValue() instanceof C92182a6c)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ORS.LJJLIIIJILLIZJL(((InterfaceC91938a2g) ((Map.Entry) it.next()).getValue()).LIZIZ(), arrayList);
            }
            interfaceC88472Yns.invoke(new CheckoutAction.StoredMethodConfirm(arrayList, this.LJLJJL, this.LJLJJLL, new IDqS418S0100000_31(this.LJLJLJ, 75)));
        } else if (interfaceC91961a33 instanceof C92231a7P) {
            String model = ((C92231a7P) interfaceC91961a33).LJLIL.getModel();
            if (o.LJ(model, EnumC91968a3A.PayOnToken.getType())) {
                C92283a8F c92283a8F2 = this.LJLJI;
                String paymentMethod2 = ((C92231a7P) this.LJLILLLLZI).LJLIL.getPaymentMethod();
                if (paymentMethod2 != null) {
                    str = paymentMethod2;
                }
                Boolean isDefault2 = ((C92231a7P) this.LJLILLLLZI).LJLIL.isDefault();
                if (isDefault2 == null) {
                    booleanValue2 = false;
                } else {
                    booleanValue2 = isDefault2.booleanValue();
                }
                c92283a8F2.LJII(str, false, booleanValue2);
                this.LJLJL.invoke(new CheckoutAction.StorePaymentMethod(((C92220a7E) C91943a2l.LJIIJJI.getValue()).LIZLLL(), this.LJLJJL, this.LJLJJLL, new IDqS418S0100000_31(this.LJLJLJ, 77)));
            } else if (o.LJ(model, EnumC91968a3A.TokenizeAndPay.getType()) || o.LJ(model, EnumC91968a3A.Pay.getType())) {
                C92283a8F c92283a8F3 = this.LJLJI;
                String paymentMethod3 = ((C92231a7P) this.LJLILLLLZI).LJLIL.getPaymentMethod();
                if (paymentMethod3 != null) {
                    str = paymentMethod3;
                }
                Boolean isDefault3 = ((C92231a7P) this.LJLILLLLZI).LJLIL.isDefault();
                if (isDefault3 == null) {
                    booleanValue = false;
                } else {
                    booleanValue = isDefault3.booleanValue();
                }
                c92283a8F3.LJII(str, true, booleanValue);
                InterfaceC88472Yns<CheckoutAction, C76800UCe> interfaceC88472Yns2 = this.LJLJJI;
                C44001o4 c44001o4 = C91943a2l.LJIIJJI;
                PaymentMethod LIZLLL = ((C92220a7E) c44001o4.getValue()).LIZLLL();
                Iterator it2 = ((LinkedHashMap) ((C91942a2k) c44001o4.getValue()).LIZIZ).values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (obj instanceof C92182a6c) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C92182a6c c92182a6c = (C92182a6c) obj;
                if (c92182a6c != null && (parcelableSnapshotMutableState = c92182a6c.LIZJ) != null && (bool = (Boolean) parcelableSnapshotMutableState.getValue()) != null) {
                    z = bool.booleanValue();
                }
                interfaceC88472Yns2.invoke(new CheckoutAction.MethodConfirm(LIZLLL, z, this.LJLJJL, this.LJLJJLL, new IDqS418S0100000_31(this.LJLJLJ, 79)));
            }
        }
        return C76800UCe.LIZ;
    }
}
