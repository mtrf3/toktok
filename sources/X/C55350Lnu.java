package X;

import Y.ARunnableS28S0200000_9;
import android.view.View;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.detail.panel.ReplyMessagePanel;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimPlayground;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Lnu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55350Lnu implements InterfaceC92963kq {
    public final /* synthetic */ ReplyMessagePanel LIZ;

    public C55350Lnu(ReplyMessagePanel replyMessagePanel) {
        this.LIZ = replyMessagePanel;
    }

    @Override // X.InterfaceC92963kq
    public final void LIZ(CharSequence emoji) {
        EmojiAnimPlayground emojiAnimPlayground;
        o.LJIIIZ(emoji, "emoji");
        ReplyMessagePanel replyMessagePanel = this.LIZ;
        C80985VqP c80985VqP = replyMessagePanel.LLJJJJLIIL;
        if (c80985VqP == null) {
            ViewStub viewStub = (ViewStub) replyMessagePanel.LLFII.findViewById(R.id.a5c);
            View view = null;
            if (viewStub != null) {
                view = viewStub.inflate();
            }
            if (!(view instanceof EmojiAnimPlayground) || (emojiAnimPlayground = (EmojiAnimPlayground) view) == null) {
                return;
            }
            replyMessagePanel.LLJJJJLIIL = new C80985VqP(emojiAnimPlayground);
            emojiAnimPlayground.post(new ARunnableS28S0200000_9(emoji, replyMessagePanel, 8));
            return;
        }
        c80985VqP.LIZJ(emoji.toString());
    }
}
