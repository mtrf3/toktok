package X;

import com.ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel$loadKidsProfileData$1$1", f = "KidsProfileViewModel.kt", l = {44, 45}, m = "invokeSuspend")
/* renamed from: X.2se, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72322se extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ KidsProfileViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72322se(KidsProfileViewModel kidsProfileViewModel, InterfaceC67352kd<? super C72322se> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = kidsProfileViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72322se(this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r11 = r13
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLILLLLZI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L7f
            if (r0 == r1) goto L8f
            if (r0 != r2) goto Lb7
            java.lang.Object r1 = r12.LJLIL
            java.util.List r1 = (java.util.List) r1
            X.C141335gf.LIZJ(r11)
        L14:
            X.2sf r11 = (X.InterfaceC72332sf) r11
            com.ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel r0 = r12.LJLJI
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r3 = r0.LJLJJL
            int r2 = r1.size()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r2)
            r3.postValue(r0)
            if (r11 == 0) goto Lb4
            com.ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel r5 = r12.LJLJI
            androidx.lifecycle.MutableLiveData<X.2sf> r0 = r5.LJLJI
            r0.postValue(r11)
            X.2si r4 = new X.2si
            X.2sk r6 = new X.2sk
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r11.getUserAvatar()
            java.lang.String r8 = r11.getUserId()
            java.lang.String r10 = ""
            if (r8 != 0) goto L40
            r8 = r10
        L40:
            java.lang.String r9 = r11.getSecUserId()
            if (r9 != 0) goto L47
            r9 = r10
        L47:
            java.lang.String r0 = r11.getUniqueId()
            if (r0 != 0) goto L7d
            java.lang.String r0 = r11.getShortId()
            if (r0 != 0) goto L7d
        L53:
            r6.<init>(r7, r8, r9, r10, r11)
            r4.<init>(r6)
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L68:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r1 = (com.ss.android.ugc.aweme.draft.model.AwemeDraft) r1
            X.2sh r0 = new X.2sh
            r0.<init>(r1)
            r3.add(r0)
            goto L68
        L7d:
            r10 = r0
            goto L53
        L7f:
            X.C141335gf.LIZJ(r11)
            com.ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel r0 = r12.LJLJI
            X.2sg r0 = r0.LJLIL
            r12.LJLILLLLZI = r1
            java.lang.Object r11 = r0.LIZIZ()
            if (r11 != r3) goto L92
            return r3
        L8f:
            X.C141335gf.LIZJ(r11)
        L92:
            java.util.List r11 = (java.util.List) r11
            com.ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel r0 = r12.LJLJI
            X.2sg r0 = r0.LJLIL
            r12.LJLIL = r11
            r12.LJLILLLLZI = r2
            X.2sf r0 = r0.LIZ()
            if (r0 != r3) goto La3
            return r3
        La3:
            r1 = r11
            r11 = r0
            goto L14
        La7:
            androidx.lifecycle.MutableLiveData<java.util.List<X.2sj>> r1 = r5.LJLJJI
            java.util.List r0 = X.C47261Igj.LJJIJ(r4)
            java.util.List r0 = X.ORZ.LLIIIZ(r3, r0)
            r1.postValue(r0)
        Lb4:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lb7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72322se.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
