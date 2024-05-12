package X;

import com.ss.android.ugc.aweme.detail.component.biz.AddYoursBottomShootComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.detail.component.biz.AddYoursBottomShootComponent$clickButton$1", f = "AddYoursBottomShootComponent.kt", l = {151}, m = "invokeSuspend")
/* renamed from: X.8l6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220528l6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AbstractC220518l5 LJLILLLLZI;
    public final /* synthetic */ AddYoursBottomShootComponent LJLJI;
    public final /* synthetic */ Aweme LJLJJI;
    public final /* synthetic */ ActivityC45651qj LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C220528l6(AbstractC220518l5 abstractC220518l5, AddYoursBottomShootComponent addYoursBottomShootComponent, Aweme aweme, ActivityC45651qj activityC45651qj, InterfaceC67352kd<? super C220528l6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = abstractC220518l5;
        this.LJLJI = addYoursBottomShootComponent;
        this.LJLJJI = aweme;
        this.LJLJJL = activityC45651qj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C220528l6(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r5 == null) goto L14;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r5 = r20
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            r4 = r19
            int r0 = r4.LJLIL
            r8 = 0
            r13 = 1
            if (r0 == 0) goto L5b
            if (r0 != r13) goto L81
            X.C141335gf.LIZJ(r5)
        L11:
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r5 = (com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct) r5
        L13:
            if (r5 == 0) goto L56
        L15:
            com.ss.android.ugc.aweme.detail.component.biz.AddYoursBottomShootComponent r0 = r4.LJLJI
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.LJLJJI
            X.8l5 r3 = r4.LJLILLLLZI
            X.1qj r1 = r4.LJLJJL
            com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam r4 = new com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam
            r6 = 0
            boolean r7 = X.C226388uY.LJ()
            X.KRA r0 = r0.getPanelContext()
            X.M89 r0 = r0.LIZJ
            if (r0 == 0) goto L30
            java.lang.String r8 = r0.getHotEnterMethod()
        L30:
            java.lang.String r9 = "add_yours"
            java.lang.String r10 = "detail_page_shoot"
            int r0 = r2.getFollowStatus()
            java.lang.String r11 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            int r0 = r3.LIZIZ
            if (r0 == r13) goto L59
        L45:
            r14 = 0
            r17 = 3714(0xe82, float:5.204E-42)
            r12 = r6
            r15 = r14
            r16 = r14
            r18 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.8l2 r0 = X.C220488l2.LIZIZ
            r0.LJIIJ(r1, r2, r4)
        L56:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L59:
            r13 = 0
            goto L45
        L5b:
            X.C141335gf.LIZJ(r5)
            X.8l5 r1 = r4.LJLILLLLZI
            boolean r0 = r1 instanceof X.C220498l3
            if (r0 == 0) goto L69
            X.8l3 r1 = (X.C220498l3) r1
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r5 = r1.LJ
            goto L13
        L69:
            boolean r0 = r1 instanceof X.C220508l4
            if (r0 == 0) goto L56
            r0 = r1
            X.8l4 r0 = (X.C220508l4) r0
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r5 = r0.LJFF
            if (r5 != 0) goto L15
            X.8l2 r2 = X.C220488l2.LIZIZ
            long r0 = r1.LIZ
            r4.LJLIL = r13
            java.lang.Object r5 = r2.LIZ(r0, r4)
            if (r5 != r3) goto L11
            return r3
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220528l6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
