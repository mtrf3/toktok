package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* renamed from: X.TKo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74470TKo extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC82244WPo, FilterBean, EnumC82260WQe, C76800UCe> {
    public static final C74470TKo LJLIL = new C74470TKo();

    public C74470TKo() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC82244WPo interfaceC82244WPo, FilterBean filterBean, EnumC82260WQe enumC82260WQe) {
        InterfaceC82244WPo list = interfaceC82244WPo;
        FilterBean filter = filterBean;
        o.LJIIIZ(list, "list");
        o.LJIIIZ(filter, "filter");
        o.LJIIIZ(enumC82260WQe, "<anonymous parameter 2>");
        list.LIZJ(filter);
        return C76800UCe.LIZ;
    }
}
