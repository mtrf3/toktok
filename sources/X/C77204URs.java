package X;

import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.dialogcenter.common.RelationAuthDialogCenter$serve$1", f = "RelationAuthDialogCenter.kt", l = {66, 67, SubscriptionExpireRemindHourSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.URs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77204URs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super URP>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public URP LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C77202URq LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77204URs(C77202URq c77202URq, InterfaceC67352kd<? super C77204URs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c77202URq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C77204URs c77204URs = new C77204URs(this.LJLJJL, interfaceC67352kd);
        c77204URs.LJLJJI = obj;
        return c77204URs;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0066 -> B:21:0x0077). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r10 = r20
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            r5 = r19
            int r0 = r5.LJLJI
            r12 = 0
            r1 = 0
            r3 = 3
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L1d
            if (r0 == r7) goto L4d
            if (r0 == r8) goto L69
            if (r0 != r3) goto Lbe
            X.C141335gf.LIZJ(r10)
        L18:
            X.USW r1 = X.USW.LIZ
            monitor-enter(r1)
            goto Lb5
        L1d:
            X.C141335gf.LIZJ(r10)
            java.lang.Object r2 = r5.LJLJJI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.URq r0 = r5.LJLJJL
            java.util.List r0 = r0.LIZIZ(r1)
            java.util.Iterator r6 = r0.iterator()
        L2e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r1 = r6.next()
            X.USJ r1 = (X.USJ) r1
            X.URq r0 = r5.LJLJJL
            X.URw r0 = r0.LIZIZ
            r5.LJLJJI = r2
            r5.LJLIL = r6
            r5.LJLILLLLZI = r12
            r5.LJLJI = r7
            java.lang.Object r10 = r1.LIZ(r0, r5)
            if (r10 != r4) goto L58
            return r4
        L4d:
            java.lang.Object r6 = r5.LJLIL
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r5.LJLJJI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.C141335gf.LIZJ(r10)
        L58:
            X.URP r10 = (X.URP) r10
            r5.LJLJJI = r2
            r5.LJLIL = r6
            r5.LJLILLLLZI = r10
            r5.LJLJI = r8
            java.lang.Object r0 = r2.emit(r10, r5)
            if (r0 != r4) goto L77
            return r4
        L69:
            X.URP r0 = r5.LJLILLLLZI
            java.lang.Object r6 = r5.LJLIL
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r5.LJLJJI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.C141335gf.LIZJ(r10)
            r10 = r0
        L77:
            X.URq r9 = r5.LJLJJL
            X.URw r0 = r9.LIZIZ
            X.URv r1 = r0.LJLIL
            java.lang.String r0 = "config"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.lang.String r0 = "curRes"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            X.URw r0 = new X.URw
            r0.<init>(r1, r10)
            r9.LIZIZ = r0
            X.Ltu r1 = r10.LJLJL
            X.Ltu r0 = X.EnumC55722Ltu.BEFORE_AUTH_PIPELINE
            if (r1 != r0) goto L2e
            boolean r0 = r10.LJLIL
            if (r0 != 0) goto L2e
            r11 = 0
            X.Ltu r17 = X.EnumC55722Ltu.START_AUTH_PIPELINE
            r18 = 63
            r13 = r12
            r14 = r12
            r15 = r11
            r16 = r12
            X.URP r0 = X.URP.L(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r5.LJLJJI = r12
            r5.LJLIL = r12
            r5.LJLILLLLZI = r12
            r5.LJLJI = r3
            java.lang.Object r0 = r2.emit(r0, r5)
            if (r0 != r4) goto L18
            return r4
        Lb5:
            X.USW.LIZIZ = r12     // Catch: java.lang.Throwable -> Lbb
            monitor-exit(r1)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lbb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        Lbe:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77204URs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super URP> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
