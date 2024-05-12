package X;

import com.ss.android.ugc.aweme.ecommerce.mall.bean.ForceFeed;
import com.ss.android.ugc.aweme.ecommerce.mall.vm.MallRacunViewModel;
import java.util.List;

/* loaded from: classes7.dex */
public final class E2N extends AbstractC65781Prl implements InterfaceC88472Yns<C35638Dyk, C76800UCe> {
    public final /* synthetic */ Integer LJLIL;
    public final /* synthetic */ MallRacunViewModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ List<ForceFeed> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2N(Integer num, MallRacunViewModel mallRacunViewModel, boolean z, String str, String str2, List<ForceFeed> list) {
        super(1);
        this.LJLIL = num;
        this.LJLILLLLZI = mallRacunViewModel;
        this.LJLJI = z;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r1 != r0.intValue()) goto L15;
     */
    @Override // X.InterfaceC88472Yns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(X.C35638Dyk r13) {
        /*
            r12 = this;
            X.Dyk r13 = (X.C35638Dyk) r13
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            java.lang.Integer r0 = r12.LJLIL
            r1 = 2
            if (r0 == 0) goto L51
            int r6 = r0.intValue()
        L10:
            com.ss.android.ugc.aweme.ecommerce.mall.bean.FragmentDataInfo r0 = r13.LJLILLLLZI
            r2 = 0
            if (r0 == 0) goto L4f
            X.2td r0 = r0.getRacunDataResp()
        L19:
            boolean r0 = r0 instanceof X.C72922tc
            if (r0 == 0) goto L29
            java.lang.Integer r0 = r13.LJLJJLL
            if (r0 == 0) goto L25
            int r1 = r0.intValue()
        L25:
            java.lang.Integer r0 = r12.LJLIL
            if (r0 != 0) goto L48
        L29:
            com.ss.android.ugc.aweme.ecommerce.mall.vm.MallRacunViewModel r0 = r12.LJLILLLLZI
            X.2pa r1 = r0.getAssemVMScope()
            X.EBR r3 = new X.EBR
            com.ss.android.ugc.aweme.ecommerce.mall.vm.MallRacunViewModel r4 = r12.LJLILLLLZI
            boolean r5 = r12.LJLJI
            java.lang.Integer r7 = r12.LJLIL
            java.lang.String r8 = r12.LJLJJI
            java.lang.String r9 = r12.LJLJJL
            java.util.List<com.ss.android.ugc.aweme.ecommerce.mall.bean.ForceFeed> r10 = r12.LJLJJLL
            r11 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 3
            X.XKX.LIZLLL(r1, r2, r2, r3, r0)
        L45:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L48:
            int r0 = r0.intValue()
            if (r1 != r0) goto L29
            goto L45
        L4f:
            r0 = r2
            goto L19
        L51:
            r6 = 2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2N.invoke(java.lang.Object):java.lang.Object");
    }
}
