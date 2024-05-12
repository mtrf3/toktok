package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatNoticeViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.421, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class AnonymousClass421 implements InterfaceC102323zw, InterfaceC1032543l {
    public final /* synthetic */ CommonChatNoticeAssem LIZ;

    public AnonymousClass421(CommonChatNoticeAssem commonChatNoticeAssem) {
        this.LIZ = commonChatNoticeAssem;
    }

    @Override // X.InterfaceC1032543l
    public final TAZ LIZIZ() {
        return new TAZ(2, this.LIZ, CommonChatNoticeAssem.class, "sendNoticeAck", "sendNoticeAck(Ljava/lang/String;I)Lkotlinx/coroutines/Job;", 8);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC102323zw) && (obj instanceof InterfaceC1032543l)) {
            return o.LJ(LIZIZ(), ((InterfaceC1032543l) obj).LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return LIZIZ().hashCode();
    }

    @Override // X.InterfaceC102323zw
    public final void LIZ(String p0) {
        o.LJIIIZ(p0, "p0");
        ChatNoticeViewModel chatNoticeViewModel = (ChatNoticeViewModel) this.LIZ.LJLJJL.getValue();
        if (chatNoticeViewModel != null) {
            XKX.LIZLLL(chatNoticeViewModel.LJLJJLL, chatNoticeViewModel.LJLJI, null, new C75802yG(p0, 2, chatNoticeViewModel, null), 2);
        }
    }
}
