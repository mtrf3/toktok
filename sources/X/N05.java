package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N05 extends AbstractC65781Prl implements InterfaceC88472Yns<C58620MzY, C76800UCe> {
    public final /* synthetic */ N07 LJLIL;
    public final /* synthetic */ InterfaceC58626Mze<OSJ<String, String, String>> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<C58620MzY, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N05(N07 n07, C58653N0f c58653N0f, String str, String str2, String str3, InterfaceC88472Yns interfaceC88472Yns) {
        super(1);
        this.LJLIL = n07;
        this.LJLILLLLZI = c58653N0f;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C58620MzY c58620MzY) {
        C58620MzY c58620MzY2 = c58620MzY;
        o.LJIIIZ(c58620MzY2, "$this$null");
        N07 n07 = this.LJLIL;
        InterfaceC58626Mze<OSJ<String, String, String>> interfaceC58626Mze = this.LJLILLLLZI;
        N07.LJJIIZI(c58620MzY2, interfaceC58626Mze, null, n07.LJJII(interfaceC58626Mze, c58620MzY2));
        N06.LIZ.getClass();
        c58620MzY2.LJII(N06.LJFF, this.LJLJI);
        c58620MzY2.LJII(N06.LJI, this.LJLJJI);
        C56593MIz c56593MIz = N06.LJIIIZ;
        String str = this.LJLJJL;
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c58620MzY2.LJII(c56593MIz, str);
        InterfaceC88472Yns<C58620MzY, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c58620MzY2);
        }
        return C76800UCe.LIZ;
    }
}
