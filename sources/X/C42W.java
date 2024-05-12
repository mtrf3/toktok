package X;

import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.42W, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42W extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Boolean, C76800UCe> {
    public static final C42W LJLIL = new C42W();

    public C42W() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem selectSubscribe, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            C34B.LIZIZ("IMChatPerfLogger", "openChatroomKeyboard");
            C40443Fu3.LIZ("chat_room_keyboard").start();
        } else {
            C34B.LIZIZ("IMChatPerfLogger", "dismissChatroomKeyboard");
            InterfaceC55057LjB LIZIZ = C40443Fu3.LIZIZ("chat_room_keyboard");
            if (LIZIZ != null) {
                LIZIZ.stop();
            }
        }
        return C76800UCe.LIZ;
    }
}
