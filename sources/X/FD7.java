package X;

import com.ss.android.ugc.aweme.ecommerce.core.router.EcomGeckoUpdateInterceptor;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FD7 extends AbstractC65781Prl implements InterfaceC88474Ynu<String, String, Boolean, String, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FD7(String str, String str2, String str3) {
        super(4);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(String str, String str2, Boolean bool, String str3) {
        String context = str2;
        o.LJIIIZ(context, "context");
        EcomGeckoUpdateInterceptor ecomGeckoUpdateInterceptor = EcomGeckoUpdateInterceptor.LJLIL;
        String str4 = this.LJLIL;
        String str5 = this.LJLILLLLZI;
        String str6 = this.LJLJI;
        ecomGeckoUpdateInterceptor.getClass();
        FD6.LIZ(new C36681EaT(str4, str, str5, str6, bool.booleanValue(), context, str3));
        return C76800UCe.LIZ;
    }
}
