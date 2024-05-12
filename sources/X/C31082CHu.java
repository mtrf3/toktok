package X;

import android.text.Editable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.utils.EmoteFixTextHelper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CHu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31082CHu implements InterfaceC42231lD {
    public final /* synthetic */ LiveEmojiInputDialogFragment LIZ;

    @Override // X.InterfaceC32191Od
    public final void LIZIZ(C0Y5 c0y5) {
    }

    @Override // X.InterfaceC32191Od
    public final void LIZ() {
        this.LIZ.vl();
    }

    public C31082CHu(LiveEmojiInputDialogFragment liveEmojiInputDialogFragment) {
        this.LIZ = liveEmojiInputDialogFragment;
    }

    @Override // X.C0YL
    public final void LIZJ(C31061Ju c31061Ju) {
        C31089CIb c31089CIb;
        int i;
        String string;
        if (c31061Ju == null || c31061Ju.previewEmoji == null || (c31089CIb = this.LIZ.LLI) == null || c31089CIb.getText() == null) {
            return;
        }
        int length = c31061Ju.previewEmoji.length() + this.LIZ.LLILII.LIZ();
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LIZ;
        boolean z = liveEmojiInputDialogFragment.LJLLJ;
        if (z) {
            i = 15;
        } else {
            i = 100;
        }
        if (length > i) {
            if (z) {
                string = liveEmojiInputDialogFragment.getString(R.string.knl);
            } else {
                string = liveEmojiInputDialogFragment.getString(R.string.knl);
            }
            C30868C9o.LJI(string);
            return;
        }
        if (TextUtils.isEmpty(c31061Ju.previewEmoji)) {
            return;
        }
        int selectionStart = this.LIZ.LLI.getSelectionStart();
        Editable text = this.LIZ.LLI.getText();
        this.LIZ.LLJI = true;
        text.insert(selectionStart, c31061Ju.previewEmoji);
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment2 = this.LIZ;
        int i2 = 0;
        liveEmojiInputDialogFragment2.LLJI = false;
        EmoteFixTextHelper emoteFixTextHelper = liveEmojiInputDialogFragment2.LLILII;
        String emoji = c31061Ju.previewEmoji;
        emoteFixTextHelper.getClass();
        o.LJIIIZ(emoji, "emoji");
        if (!emoteFixTextHelper.isReceiveInput || selectionStart > emoteFixTextHelper.list.size() || selectionStart < 0) {
            return;
        }
        ListProtector.add(emoteFixTextHelper.list, selectionStart, new EmoteFixTextHelper.EmoteText(2, null, null, emoji, 6));
        int length2 = emoji.length() - 2;
        if (length2 < 0) {
            return;
        }
        while (true) {
            ListProtector.add(emoteFixTextHelper.list, selectionStart + 1 + i2, new EmoteFixTextHelper.EmoteText(3, null, null, null, 14));
            if (i2 == length2) {
                return;
            } else {
                i2++;
            }
        }
    }
}
