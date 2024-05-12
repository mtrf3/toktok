package X;

import kotlin.jvm.internal.o;

/* renamed from: X.36E, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C36E extends TBS implements InterfaceC88471Ynr<Integer, Integer, C76800UCe> {
    public C36E(C3TV c3tv) {
        super(2, c3tv, C3TV.class, "logChatListLongPress", "logChatListLongPress(II)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Integer num, Integer num2) {
        String str;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        this.receiver.getClass();
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        if (intValue2 == 25) {
            str = "tcm";
        } else if (intValue == 20) {
            str = "group";
        } else {
            str = "private";
        }
        c1hq.put("chat_type", str);
        c1hq.put("target", "report");
        onEventV3.LIZIZ("chat_list_feedback", c1hq);
        return C76800UCe.LIZ;
    }
}
