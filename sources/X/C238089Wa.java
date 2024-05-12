package X;

import android.content.Context;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.aigc.ProfileAigcHelperUtil$deleteAIGCTempFilesInBackground$1", f = "ProfileAigcHelperUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9Wa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238089Wa extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Context LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238089Wa(Context context, InterfaceC67352kd<? super C238089Wa> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C238089Wa(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            C78250UnO c78250UnO = C78250UnO.LIZ;
            Context context = this.LJLIL;
            c78250UnO.getClass();
            C78250UnO.LIZ(context);
        } catch (Exception e) {
            C221018lt.LJ(e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
