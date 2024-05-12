package X;

import com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel$loadDraftVideos$1$1", f = "KidsDraftFeedViewModel.kt", l = {25, 26}, m = "invokeSuspend")
/* renamed from: X.2mQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68462mQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ KidsDraftFeedViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68462mQ(KidsDraftFeedViewModel kidsDraftFeedViewModel, InterfaceC67352kd<? super C68462mQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = kidsDraftFeedViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68462mQ(this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLILLLLZI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L22
            if (r0 == r1) goto L32
            if (r0 != r2) goto L47
            java.lang.Object r2 = r4.LJLIL
            X.C141335gf.LIZJ(r5)
        L11:
            if (r5 == 0) goto L1f
            com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel r1 = r4.LJLJI
            androidx.lifecycle.MutableLiveData<X.I0w> r0 = r1.LJLILLLLZI
            r0.postValue(r5)
            androidx.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel>> r0 = r1.LJLJI
            r0.postValue(r2)
        L1f:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L22:
            X.C141335gf.LIZJ(r5)
            com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel r0 = r4.LJLJI
            X.2mR r0 = r0.LJLIL
            r4.LJLILLLLZI = r1
            java.lang.Object r5 = r0.LIZIZ(r4)
            if (r5 != r3) goto L35
            return r3
        L32:
            X.C141335gf.LIZJ(r5)
        L35:
            com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel r0 = r4.LJLJI
            X.2mR r0 = r0.LJLIL
            r4.LJLIL = r5
            r4.LJLILLLLZI = r2
            X.I0w r0 = r0.LIZ()
            if (r0 != r3) goto L44
            return r3
        L44:
            r2 = r5
            r5 = r0
            goto L11
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68462mQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
