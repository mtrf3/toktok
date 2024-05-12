package X;

import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.avatar.StickerInfoInit$createInfoSticker$2$1", f = "StickerInfoInit.kt", l = {182, 183}, m = "invokeSuspend")
/* renamed from: X.2mZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68552mZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C137415aL LJLJI;
    public final /* synthetic */ InterfaceC67352kd<List<? extends OSZ<C121514pn, ? extends StickerItemModel>>> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C68552mZ(C137415aL c137415aL, InterfaceC67352kd<? super List<? extends OSZ<C121514pn, ? extends StickerItemModel>>> interfaceC67352kd, InterfaceC67352kd<? super C68552mZ> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLJI = c137415aL;
        this.LJLJJI = interfaceC67352kd;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C68552mZ c68552mZ = new C68552mZ(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c68552mZ.LJLILLLLZI = obj;
        return c68552mZ;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = C5ZG.LIZ(interfaceC70422pa, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        C5ZC c5zc = new C5ZC(this.LJLJI, (List) obj, this.LJLJJI, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN, c5zc, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
