package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorMediaProcess$buildRecordReturnArguments$1", f = "ExteriorMediaProcess.kt", l = {LiveAnchorEnableInnerBeautyMaxValue.DEFAULT, 90, 100, 102}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class HTT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ HTN LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTT(boolean z, HTN htn, String str, InterfaceC67352kd<? super HTT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = z;
        this.LJLJJI = htn;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        HTT htt = new HTT(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        htt.LJLILLLLZI = obj;
        return htt;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0094 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r12 = r18
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            r5 = r17
            int r0 = r5.LJLIL
            r3 = 4
            r8 = 3
            r10 = 2
            r11 = 1
            r7 = 0
            if (r0 == 0) goto L1d
            if (r0 == r11) goto L9b
            if (r0 == r10) goto L71
            if (r0 == r8) goto L95
            if (r0 != r3) goto Lb8
            X.C141335gf.LIZJ(r12)
        L1a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1d:
            X.C141335gf.LIZJ(r12)
            java.lang.Object r9 = r5.LJLILLLLZI
            X.2pa r9 = (X.InterfaceC70422pa) r9
            boolean r0 = r5.LJLJI
            if (r0 != 0) goto L4b
            X.HTN r0 = r5.LJLJJI
            X.HD2 r0 = r0.LJII
            java.lang.String r6 = r0.LIZ()
            java.lang.String r0 = "photoPathGenerator.generatePhotoPath()"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            X.HTZ r2 = new X.HTZ
            X.HTN r1 = r5.LJLJJI
            java.lang.String r0 = r5.LJLJJL
            r2.<init>(r1, r0, r6, r7)
            X.XKn r0 = X.XKX.LIZIZ(r9, r7, r7, r2, r8)
            r5.LJLIL = r11
            java.lang.Object r12 = r0.LJJIJ(r5)
            if (r12 != r4) goto L9e
            return r4
        L4b:
            X.HTN r0 = r5.LJLJJI
            boolean r0 = r0.LJ()
            if (r0 == 0) goto L7b
            X.HTN r0 = r5.LJLJJI
            java.lang.String r6 = r0.LIZIZ()
            X.HTV r2 = new X.HTV
            X.HTN r1 = r5.LJLJJI
            java.lang.String r0 = r5.LJLJJL
            r2.<init>(r1, r0, r6, r7)
            X.XKn r0 = X.XKX.LIZIZ(r9, r7, r7, r2, r8)
            r5.LJLILLLLZI = r9
            r5.LJLIL = r10
            java.lang.Object r12 = r0.LJJIJ(r5)
            if (r12 != r4) goto L78
            return r4
        L71:
            java.lang.Object r9 = r5.LJLILLLLZI
            X.2pa r9 = (X.InterfaceC70422pa) r9
            X.C141335gf.LIZJ(r12)
        L78:
            java.lang.String r12 = (java.lang.String) r12
            goto L7d
        L7b:
            java.lang.String r12 = r5.LJLJJL
        L7d:
            X.HTW r2 = new X.HTW
            X.HTN r1 = r5.LJLJJI
            java.lang.String r0 = r5.LJLJJL
            r2.<init>(r1, r0, r12, r7)
            X.XKn r0 = X.XKX.LIZIZ(r9, r7, r7, r2, r8)
            r5.LJLILLLLZI = r7
            r5.LJLIL = r8
            java.lang.Object r12 = r0.LJJIJ(r5)
            if (r12 != r4) goto L98
            return r4
        L95:
            X.C141335gf.LIZJ(r12)
        L98:
            com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel r12 = (com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel) r12
            goto La0
        L9b:
            X.C141335gf.LIZJ(r12)
        L9e:
            com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel r12 = (com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel) r12
        La0:
            X.XIF r0 = X.EXT.LIZ
            X.HTQ r11 = new X.HTQ
            X.HTN r13 = r5.LJLJJI
            boolean r14 = r5.LJLJI
            java.lang.String r15 = r5.LJLJJL
            r16 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            r5.LJLIL = r3
            java.lang.Object r0 = X.XKX.LJI(r0, r11, r5)
            if (r0 != r4) goto L1a
            return r4
        Lb8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HTT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
