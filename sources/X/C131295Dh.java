package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.frame.VideoFrameCache$cancel$1", f = "VideoFrameCache.kt", l = {107}, m = "invokeSuspend")
/* renamed from: X.5Dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131295Dh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C131235Db LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131295Dh(C131235Db c131235Db, InterfaceC67352kd<? super C131295Dh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c131235Db;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131295Dh(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            XK4 xk4 = this.LJLILLLLZI.LJLL;
            InterfaceC131465Dy interfaceC131465Dy = new InterfaceC131465Dy() { // from class: X.5Ds
            };
            this.LJLIL = 1;
            if (xk4.LJIIIZ(interfaceC131465Dy, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}