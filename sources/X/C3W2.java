package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.sharedar.viewmodel.SessionShareViewModel$realQueryFollowingFriendsV1$2", f = "SessionShareViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3W2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3W2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<C3W5>>, Object> {
    public final /* synthetic */ C85193Vz LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3W2(C85193Vz c85193Vz, long j, InterfaceC67352kd<? super C3W2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c85193Vz;
        this.LJLILLLLZI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3W2(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        if (r11 != null) goto L28;
     */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3W2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<C3W5>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
