package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.video2sticker.topbar.Video2StickerTopBarComponent$nextAction$1$job$1", f = "Video2StickerTopBarComponent.kt", l = {115, 116}, m = "invokeSuspend")
/* renamed from: X.5lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144255lN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C144245lM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C144255lN(C144245lM c144245lM, InterfaceC67352kd<? super C144255lN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c144245lM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C144255lN(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            C144245lM c144245lM = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = c144245lM.LLILZIL(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C144245lM c144245lM2 = this.LJLILLLLZI;
            this.LJLIL = 2;
            if (c144245lM2.LLILZLL(this) == enumC58928NAu) {
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
