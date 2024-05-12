package X;

import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.aGR, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92791aGR extends AbstractC65781Prl implements InterfaceC88474Ynu<InterfaceC06520Nk, NavBackStackEntry, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ PIViewModel LJLIL;
    public final /* synthetic */ Boolean LJLILLLLZI;
    public final /* synthetic */ C92145a61 LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ C08370Un LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92791aGR(PIViewModel pIViewModel, Boolean bool, C92145a61 c92145a61, float f, C08370Un c08370Un, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, int i, int i2) {
        super(4);
        this.LJLIL = pIViewModel;
        this.LJLILLLLZI = bool;
        this.LJLJI = c92145a61;
        this.LJLJJI = f;
        this.LJLJJL = c08370Un;
        this.LJLJJLL = interfaceC65784Pro;
        this.LJLJL = i;
        this.LJLJLJ = i2;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(InterfaceC06520Nk defaultComposable, NavBackStackEntry navBackStackEntry, InterfaceC24520xk interfaceC24520xk, Integer num) {
        String string;
        String string2;
        boolean parseBoolean;
        NavBackStackEntry it = navBackStackEntry;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        num.intValue();
        o.LJIIIZ(defaultComposable, "$this$defaultComposable");
        o.LJIIIZ(it, "it");
        Bundle bundle = it.LJLJI;
        if (bundle == null || (string = bundle.getString("url")) == null) {
            string = "";
        }
        Bundle bundle2 = it.LJLJI;
        if (bundle2 == null || (string2 = bundle2.getString("disableBackground")) == null) {
            parseBoolean = false;
        } else {
            parseBoolean = Boolean.parseBoolean(string2);
        }
        C91875a1f.LIZ(0.0f, 0, C1DJ.LJ(interfaceC24520xk2, -819897532, new C92790aGQ(this.LJLIL, this.LJLILLLLZI, parseBoolean, this.LJLJI, this.LJLJJI, string, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ)), interfaceC24520xk2, 432, 1);
        return C76800UCe.LIZ;
    }
}
