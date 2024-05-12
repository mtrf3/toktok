package Y;

import X.C34B;
import X.C92723kS;
import X.C92753kV;
import X.InterfaceC64592gB;
import X.X1D;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;

/* loaded from: classes2.dex */
public class AfS0S0100100_1 implements InterfaceC64592gB {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S0100100_1 afS0S0100100_1, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("success ");
        LIZ.append(obj);
        C34B.LIZIZ("ChatViewModel", X1D.LIZIZ(LIZ));
        ChatViewModel chatViewModel = (ChatViewModel) afS0S0100100_1.l0;
        if (chatViewModel.LJLLI != afS0S0100100_1.j1) {
            return;
        }
        chatViewModel.LJLJLLL.setValue(new C92723kS(obj));
    }

    public static final void accept$1(AfS0S0100100_1 afS0S0100100_1, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fail ");
        LIZ.append(th.getMessage());
        C34B.LIZJ("ChatViewModel", X1D.LIZIZ(LIZ));
        ChatViewModel chatViewModel = (ChatViewModel) afS0S0100100_1.l0;
        if (chatViewModel.LJLLI != afS0S0100100_1.j1) {
            return;
        }
        chatViewModel.LJLJLLL.setValue(new C92753kV(th));
    }

    public AfS0S0100100_1(ChatViewModel chatViewModel, long j, int i) {
        this.$t = i;
        this.l0 = chatViewModel;
        this.j1 = j;
    }
}
