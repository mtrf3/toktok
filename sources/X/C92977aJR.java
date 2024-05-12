package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aJR, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92977aJR extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC274515x, C76800UCe> {
    public final /* synthetic */ List<AbstractC39201gK> LJLIL;
    public final /* synthetic */ List<AbstractC39201gK> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ List<AbstractC39201gK> LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C92977aJR(List<? extends AbstractC39201gK> list, List<? extends AbstractC39201gK> list2, long j, int i, List<? extends AbstractC39201gK> list3, int i2, int i3) {
        super(1);
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
        this.LJLJI = j;
        this.LJLJJI = i;
        this.LJLJJL = list3;
        this.LJLJJLL = i2;
        this.LJLJL = i3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC274515x abstractC274515x) {
        AbstractC274515x layout = abstractC274515x;
        o.LJIIIZ(layout, "$this$layout");
        List<AbstractC39201gK> list = this.LJLIL;
        int i = this.LJLJJLL;
        int i2 = 0;
        int i3 = 0;
        for (AbstractC39201gK abstractC39201gK : list) {
            AbstractC274515x.LJI(layout, abstractC39201gK, 0, i3);
            i3 += abstractC39201gK.LJLILLLLZI + i;
        }
        List<AbstractC39201gK> list2 = this.LJLILLLLZI;
        int i4 = this.LJLJL;
        int i5 = this.LJLJJLL;
        for (AbstractC39201gK abstractC39201gK2 : list2) {
            AbstractC274515x.LJI(layout, abstractC39201gK2, i4, i3);
            i3 += abstractC39201gK2.LJLILLLLZI + i5;
        }
        int LJII = C23360vs.LJII(this.LJLJI) - this.LJLJJI;
        for (AbstractC39201gK abstractC39201gK3 : this.LJLJJL) {
            AbstractC274515x.LJI(layout, abstractC39201gK3, LJII, i2);
            i2 += abstractC39201gK3.LJLILLLLZI;
        }
        return C76800UCe.LIZ;
    }
}
