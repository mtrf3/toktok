package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel$onClick$1", f = "OptionCategoryViewModel.kt", l = {60, BaseNotice.CREATOR}, m = "invokeSuspend")
/* renamed from: X.UwY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78818UwY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C78820Uwa LJLJI;
    public final /* synthetic */ OptionCategoryViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78818UwY(C78820Uwa c78820Uwa, OptionCategoryViewModel optionCategoryViewModel, InterfaceC67352kd<? super C78818UwY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c78820Uwa;
        this.LJLJJI = optionCategoryViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C78818UwY c78818UwY = new C78818UwY(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c78818UwY.LJLILLLLZI = obj;
        return c78818UwY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L19;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLIL
            r7 = 2
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L13
            if (r0 == r6) goto L3a
            if (r0 != r7) goto L5f
            X.C141335gf.LIZJ(r9)
        L10:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L13:
            X.C141335gf.LIZJ(r9)
            java.lang.Object r1 = r8.LJLILLLLZI
            X.Uwa r3 = r8.LJLJI
            X.Uw5 r0 = r3.LJ
            if (r0 == 0) goto L41
            com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel r2 = r8.LJLJJI
            r8.LJLILLLLZI = r1
            r8.LJLIL = r6
            r2.getClass()
            X.XIC r1 = X.C78613UtF.LIZ
            X.UwZ r0 = new X.UwZ
            r0.<init>(r3, r2, r4)
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r8)
            if (r0 != r5) goto L37
        L34:
            if (r0 != r5) goto L3d
            return r5
        L37:
            X.UCe r0 = X.C76800UCe.LIZ
            goto L34
        L3a:
            X.C141335gf.LIZJ(r9)
        L3d:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L10
        L41:
            com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel r3 = r8.LJLJJI
            X.Uwa r2 = r8.LJLJI
            r8.LJLILLLLZI = r4
            r8.LJLIL = r7
            r3.getClass()
            X.XIC r1 = X.C78613UtF.LIZ
            X.UwW r0 = new X.UwW
            r0.<init>(r2, r3, r4)
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r8)
            if (r0 != r5) goto L5c
        L59:
            if (r0 != r5) goto L10
            return r5
        L5c:
            X.UCe r0 = X.C76800UCe.LIZ
            goto L59
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78818UwY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
