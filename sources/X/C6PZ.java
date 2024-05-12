package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerManager$addSticker$1", f = "StickerManager.kt", l = {401}, m = "invokeSuspend")
/* renamed from: X.6PZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6PZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C6OX LJLILLLLZI;
    public final /* synthetic */ C6PV LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6PZ(C6OX c6ox, C6PV c6pv, InterfaceC67352kd<? super C6PZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c6ox;
        this.LJLJI = c6pv;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C6PZ(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C6OX c6ox = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = c6ox.LJIJJLI(false, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        StickerModel stickerModel = (StickerModel) obj;
        Iterator it = ((ArrayList) this.LJLJI.LJIIL).iterator();
        while (it.hasNext()) {
            ((InterfaceC160026Pu) it.next()).LJIILL(stickerModel);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
