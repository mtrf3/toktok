package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.data.datasource.FakeMessageModel$createFakeMessage$2", f = "FakeMessageModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2ys, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76182ys extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C76172yr LJLIL;
    public final /* synthetic */ List<FakeMessage> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76182ys(C76172yr c76172yr, List<FakeMessage> list, InterfaceC67352kd<? super C76182ys> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c76172yr;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76182ys(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C76172yr c76172yr = this.LJLIL;
        List<FakeMessage> messages = this.LJLILLLLZI;
        c76172yr.getClass();
        o.LJIIIZ(messages, "messages");
        for (FakeMessage fakeMessage : messages) {
            if (!fakeMessage.isValid$im_base_release()) {
                C34B.LJI("FakeMessageModel", "message is invalid");
                FakeMessage remove = c76172yr.LIZJ.remove(Integer.valueOf(fakeMessage.getMsgType()));
                if (remove != null) {
                    C34B.LJI("FakeMessageModel", "onDelMessage");
                    InterfaceC99673vf interfaceC99673vf = c76172yr.LJ;
                    if (interfaceC99673vf != null) {
                        interfaceC99673vf.y(remove);
                    }
                }
            } else {
                FakeMessage fakeMessage2 = c76172yr.LIZJ.get(Integer.valueOf(fakeMessage.getMsgType()));
                if (fakeMessage2 == null) {
                    c76172yr.LIZJ.put(Integer.valueOf(fakeMessage.getMsgType()), fakeMessage);
                    InterfaceC99673vf interfaceC99673vf2 = c76172yr.LJ;
                    if (interfaceC99673vf2 != null) {
                        interfaceC99673vf2.u7(AbstractC63551Owt.LIZ, fakeMessage);
                    }
                    C34B.LJI("FakeMessageModel", "onAddMessage");
                } else if (fakeMessage.needUpdate$im_base_release(fakeMessage2)) {
                    c76172yr.LIZJ.put(Integer.valueOf(fakeMessage.getMsgType()), fakeMessage);
                    InterfaceC99673vf interfaceC99673vf3 = c76172yr.LJ;
                    if (interfaceC99673vf3 != null) {
                        interfaceC99673vf3.X8(null, -1, C47261Igj.LJJIJIL(fakeMessage));
                    }
                    C34B.LJI("FakeMessageModel", "onUpdateMessage");
                } else {
                    C34B.LJI("FakeMessageModel", "discard message, not need to update");
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
