package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerScene$onActivityCreated$4", f = "EditInfoStickerScene.kt", l = {297, 298}, m = "invokeSuspend")
/* renamed from: X.2ma, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68562ma extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C1548165t LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68562ma(C1548165t c1548165t, InterfaceC67352kd<? super C68562ma> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c1548165t;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C68562ma c68562ma = new C68562ma(this.LJLJI, interfaceC67352kd);
        c68562ma.LJLILLLLZI = obj;
        return c68562ma;
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
        C68572mb c68572mb = new C68572mb(this.LJLJI, (List) obj, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN, c68572mb, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}