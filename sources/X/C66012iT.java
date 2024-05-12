package X;

import com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.helper.RelationModelFilterHelper$updateRelationUserShareStatus$1", f = "RelationModelFilterHelper.kt", l = {75, 77, 82}, m = "invokeSuspend")
/* renamed from: X.2iT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66012iT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final /* synthetic */ java.util.Map<String, String> LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ InterfaceC88472Yns<ShareStateResponse, C76800UCe> LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C66012iT(java.util.Map<String, String> map, String str, String str2, boolean z, boolean z2, InterfaceC88472Yns<? super ShareStateResponse, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C66012iT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = map;
        this.LJLJJLL = str;
        this.LJLJL = str2;
        this.LJLJLJ = z;
        this.LJLJLLL = z2;
        this.LJLL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66012iT(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.3FK] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0044 -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r11.LJLJJI
            r3 = 3
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L47
            if (r1 == r0) goto L91
            if (r1 == r4) goto Ld3
            if (r1 != r3) goto Lcb
            int r6 = r11.LJLJI
            java.lang.Object r5 = r11.LJLILLLLZI
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r9 = r11.LJLIL
            java.util.Map r9 = (java.util.Map) r9
            X.C141335gf.LIZJ(r12)
        L1c:
            int r0 = X.C3FK.LIZLLL
            int r6 = r6 + r0
        L1f:
            int r0 = r5.size()
            if (r6 >= r0) goto Ld6
            X.3FK r4 = X.C3FK.LIZ
            int r1 = X.C3FK.LIZLLL
            int r1 = r1 + r6
            int r0 = r5.size()
            int r0 = java.lang.Math.min(r1, r0)
            java.util.List r1 = r5.subList(r6, r0)
            X.Yns<com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse, X.UCe> r0 = r11.LJLL
            r11.LJLIL = r9
            r11.LJLILLLLZI = r5
            r11.LJLJI = r6
            r11.LJLJJI = r3
            java.lang.Object r0 = r4.LIZ(r1, r9, r0, r11)
            if (r0 != r2) goto L1c
            return r2
        L47:
            X.C141335gf.LIZJ(r12)
            java.util.Map<java.lang.String, java.lang.String> r9 = r11.LJLJJL
            if (r9 != 0) goto L53
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
        L53:
            java.util.Map<java.lang.String, java.lang.String> r1 = r11.LJLJJL
            if (r1 == 0) goto L7c
            java.util.ArrayList r12 = new java.util.ArrayList
            int r0 = r1.size()
            r12.<init>(r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L68:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            r12.add(r0)
            goto L68
        L7c:
            X.3FK r5 = X.C3FK.LIZ
            java.lang.String r6 = r11.LJLJJLL
            java.lang.String r7 = r11.LJLJL
            boolean r8 = r11.LJLJLJ
            boolean r10 = r11.LJLJLLL
            r11.LJLIL = r9
            r11.LJLJJI = r0
            java.lang.Object r12 = r5.LJ(r6, r7, r8, r9, r10, r11)
            if (r12 != r2) goto L98
            return r2
        L91:
            java.lang.Object r9 = r11.LJLIL
            java.util.Map r9 = (java.util.Map) r9
            X.C141335gf.LIZJ(r12)
        L98:
            java.util.List r12 = (java.util.List) r12
        L9a:
            boolean r0 = r11.LJLJLLL
            if (r0 != 0) goto Lae
            X.3FK r3 = X.C3FK.LIZ
            X.Yns<com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse, X.UCe> r1 = r11.LJLL
            r0 = 0
            r11.LJLIL = r0
            r11.LJLJJI = r4
            java.lang.Object r0 = r3.LIZ(r12, r9, r1, r11)
            if (r0 != r2) goto Ld6
            return r2
        Lae:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "secUidList size: "
            r1.append(r0)
            int r0 = r12.size()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "RelationModelFilterHelper"
            X.C34B.LJI(r0, r1)
            r5 = r12
            r6 = 0
            goto L1f
        Lcb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Ld3:
            X.C141335gf.LIZJ(r12)
        Ld6:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66012iT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
