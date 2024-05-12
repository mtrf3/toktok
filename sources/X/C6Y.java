package X;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;

/* loaded from: classes6.dex */
public class C6Y extends C6L {
    public final int LJLJJL;
    public final User LJLJJLL;
    public final boolean LJLJL;

    @Override // X.C8FQ
    public final void LIZ(View view) {
    }

    public void LIZJ(View view, C30926CBu c30926CBu, ISendCommentEvent.Sender sender) {
        throw null;
    }

    public C6Y(User user) {
        this.LJLJJLL = user;
        this.LJLJJL = -1;
        this.LJLJI = false;
    }

    @Override // X.C6L
    public void LIZIZ(View view) {
        User user = this.LJLJJLL;
        if (user == null) {
            return;
        }
        C30926CBu c30926CBu = new C30926CBu(1, C05170If.LIZ(user), "positive_reply", false);
        ISendCommentEvent.Sender sender = ISendCommentEvent.Sender.REPLY;
        sender.getLogArgs().clear();
        c30926CBu.LJIIIZ = sender;
        c30926CBu.LIZLLL = this.LJLJJLL;
        LIZJ(view, c30926CBu, sender);
        C73943T0h.LIZ().LIZIZ(c30926CBu);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.LJLJL) {
            textPaint.setColor(this.LJLJJL);
        }
    }

    public C6Y(int i, User user) {
        boolean z;
        this.LJLJJLL = user;
        this.LJLJJL = i;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJL = z;
        this.LJLJI = false;
    }
}
