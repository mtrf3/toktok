package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.avatar.ChangAvatarActionStage$loadResourceAndPublish$1", f = "ChangAvatarActionStage.kt", l = {206, 207, 208, 209}, m = "invokeSuspend")
/* renamed from: X.2mV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68512mV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C137415aL LJLJJI;
    public final /* synthetic */ C41356GKy LJLJJL;
    public final /* synthetic */ VideoPublishEditModel LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68512mV(C137415aL c137415aL, C41356GKy c41356GKy, VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd<? super C68512mV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c137415aL;
        this.LJLJJL = c41356GKy;
        this.LJLJJLL = videoPublishEditModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C68512mV c68512mV = new C68512mV(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c68512mV.LJLJI = obj;
        return c68512mV;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLILLLLZI
            r7 = 4
            r8 = 3
            r10 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L19
            if (r0 == r9) goto L50
            if (r0 == r10) goto L6c
            if (r0 == r8) goto L84
            if (r0 != r7) goto La2
            X.C141335gf.LIZJ(r13)
        L16:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L19:
            X.C141335gf.LIZJ(r13)
            java.lang.Object r11 = r12.LJLJI
            X.2pa r11 = (X.InterfaceC70422pa) r11
            X.2mX r1 = new X.2mX
            X.5aL r0 = r12.LJLJJI
            r1.<init>(r0, r5)
            X.XKn r4 = X.XKX.LIZIZ(r11, r5, r5, r1, r8)
            X.5aA r1 = new X.5aA
            X.5aL r0 = r12.LJLJJI
            r1.<init>(r0, r5)
            X.XKn r0 = X.XKX.LIZIZ(r11, r5, r5, r1, r8)
            X.2mU r3 = new X.2mU
            X.GKy r2 = r12.LJLJJL
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r12.LJLJJLL
            r3.<init>(r2, r1, r5)
            X.XKn r1 = X.XKX.LIZIZ(r11, r5, r5, r3, r8)
            r12.LJLJI = r0
            r12.LJLIL = r1
            r12.LJLILLLLZI = r9
            java.lang.Object r13 = r4.LJJIJ(r12)
            if (r13 != r6) goto L5b
            return r6
        L50:
            java.lang.Object r1 = r12.LJLIL
            X.2mE r1 = (X.InterfaceC68342mE) r1
            java.lang.Object r0 = r12.LJLJI
            X.2mE r0 = (X.InterfaceC68342mE) r0
            X.C141335gf.LIZJ(r13)
        L5b:
            java.util.List r13 = (java.util.List) r13
            r12.LJLJI = r1
            r12.LJLIL = r13
            r12.LJLILLLLZI = r10
            java.lang.Object r0 = r0.LJI(r12)
            if (r0 != r6) goto L6a
            return r6
        L6a:
            r4 = r13
            goto L77
        L6c:
            java.lang.Object r4 = r12.LJLIL
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r1 = r12.LJLJI
            X.2mE r1 = (X.InterfaceC68342mE) r1
            X.C141335gf.LIZJ(r13)
        L77:
            r12.LJLJI = r4
            r12.LJLIL = r5
            r12.LJLILLLLZI = r8
            java.lang.Object r0 = r1.LJI(r12)
            if (r0 != r6) goto L8b
            return r6
        L84:
            java.lang.Object r4 = r12.LJLJI
            java.util.List r4 = (java.util.List) r4
            X.C141335gf.LIZJ(r13)
        L8b:
            X.UtN r3 = X.C36636EZk.LIZ
            X.5P8 r2 = new X.5P8
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r12.LJLJJLL
            X.GKy r0 = r12.LJLJJL
            r2.<init>(r1, r4, r0, r5)
            r12.LJLJI = r5
            r12.LJLILLLLZI = r7
            java.lang.Object r0 = X.XKX.LJI(r3, r2, r12)
            if (r0 != r6) goto L16
            return r6
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68512mV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
