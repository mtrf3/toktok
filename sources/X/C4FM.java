package X;

import java.util.ArrayList;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.systembigemoji.EmojiModel$onLoadEmojiData$1$1", f = "EmojiModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4FM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C4FM(InterfaceC67352kd<? super C4FM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4FM(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Iterator it = ((ArrayList) C4FF.LJLJL).iterator();
        while (it.hasNext()) {
            ((C4FT) it.next()).LIZJ(C4FF.LJLJJI);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C4FM(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
