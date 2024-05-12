package X;

import com.ss.android.ugc.aweme.external.router.AssetInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.utils.MediaModelUtils$covert2MediaModels$1", f = "MediaModelUtils.kt", l = {57}, m = "invokeSuspend")
/* renamed from: X.2uC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73282uC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ List<AssetInfo> LJLJJI;
    public final /* synthetic */ HMK LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<ArrayList<MediaModel>, C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C73282uC(List<AssetInfo> list, HMK hmk, InterfaceC88472Yns<? super ArrayList<MediaModel>, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C73282uC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = list;
        this.LJLJJL = hmk;
        this.LJLJJLL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C73282uC c73282uC = new C73282uC(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c73282uC.LJLJI = obj;
        return c73282uC;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002f -> B:5:0x0014). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLILLLLZI
            r7 = 1
            if (r0 == 0) goto L32
            if (r0 != r7) goto L8d
            java.lang.Object r1 = r12.LJLIL
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r2 = r12.LJLJI
            java.util.Collection r2 = (java.util.Collection) r2
            X.C141335gf.LIZJ(r13)
        L14:
            if (r13 == 0) goto L19
            r2.add(r13)
        L19:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r1.next()
            X.2mE r0 = (X.InterfaceC68342mE) r0
            r12.LJLJI = r2
            r12.LJLIL = r1
            r12.LJLILLLLZI = r7
            java.lang.Object r13 = r0.LJI(r12)
            if (r13 != r8) goto L14
            return r8
        L32:
            X.C141335gf.LIZJ(r13)
            java.lang.Object r9 = r12.LJLJI
            X.2pa r9 = (X.InterfaceC70422pa) r9
            java.util.List<com.ss.android.ugc.aweme.external.router.AssetInfo> r1 = r12.LJLJJI
            X.HMK r6 = r12.LJLJJL
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r5.<init>(r0)
            java.util.Iterator r11 = r1.iterator()
            r4 = 0
            r10 = 0
        L4e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r11.next()
            int r3 = r10 + 1
            r2 = 0
            if (r10 < 0) goto L95
            com.ss.android.ugc.aweme.external.router.AssetInfo r0 = (com.ss.android.ugc.aweme.external.router.AssetInfo) r0
            java.util.List<java.lang.String> r0 = r0.urls
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r4, r0)
            java.lang.String r0 = (java.lang.String) r0
            X.HMX r1 = new X.HMX
            r1.<init>(r0, r10, r6, r2)
            r0 = 3
            X.XKn r0 = X.XKX.LIZIZ(r9, r2, r2, r1, r0)
            r5.add(r0)
            r10 = r3
            goto L4e
        L76:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r5.iterator()
            goto L19
        L80:
            X.Yns<java.util.ArrayList<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel>, X.UCe> r1 = r12.LJLJJLL
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.invoke(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L8d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L95:
            X.C47261Igj.LJJJJJ()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73282uC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
