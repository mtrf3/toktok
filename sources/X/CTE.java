package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.RichChatMessage;

/* loaded from: classes6.dex */
public final class CTE extends CTF<RichChatMessage> {
    public static final String[] LJJ = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    public final boolean LJIL;

    @Override // X.CTF, X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return null;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        this.LJIJJLI.getClass();
        return null;
    }

    @Override // X.CTF
    public final String LLFFF() {
        return ((RichChatMessage) this.LJIJJLI).color;
    }

    @Override // X.CTF
    public final void LLFII() {
        this.LJIJJLI.getClass();
    }

    @Override // X.CTF
    public final void LLFZ() {
        this.LJIJJLI.getClass();
    }

    @Override // X.CTF
    public final void LLI() {
        this.LJIJJLI.getClass();
    }

    @Override // X.CTF
    public final ImageModel LLIFFJFJJ() {
        return ((RichChatMessage) this.LJIJJLI).icon;
    }

    @Override // X.CTF
    public final void LLFF() {
        C73943T0h.LIZ().LIZIZ(new C31376CTc((RichChatMessage) this.LJIJJLI));
    }

    @Override // X.CTF
    public final boolean LLII() {
        return this.LJIL;
    }

    public CTE(RichChatMessage richChatMessage) {
        super(richChatMessage);
        boolean z = false;
        int i = 0;
        while (true) {
            String[] strArr = LJJ;
            if (i >= strArr.length) {
                break;
            }
            if (TextUtils.equals(strArr[i], richChatMessage.actionType)) {
                z = true;
                break;
            }
            i++;
        }
        this.LJIL = z;
    }
}
