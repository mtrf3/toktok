package X;

import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;

/* loaded from: classes6.dex */
public final /* synthetic */ class CI9 implements Runnable {
    public final /* synthetic */ LiveEmojiInputDialogFragment LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    public /* synthetic */ CI9(LiveEmojiInputDialogFragment liveEmojiInputDialogFragment, long j, int i, int i2) {
        this.LJLIL = liveEmojiInputDialogFragment;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LJLIL;
        long j = this.LJLILLLLZI;
        int i = this.LJLJI;
        int i2 = this.LJLJJI;
        if (!liveEmojiInputDialogFragment.isResumed() || !liveEmojiInputDialogFragment.LJLJL) {
            return;
        }
        C79057V0z.LJJJJZ(liveEmojiInputDialogFragment.getContext(), liveEmojiInputDialogFragment.LLI);
        int i3 = i + 1;
        C31089CIb c31089CIb = liveEmojiInputDialogFragment.LLI;
        if (c31089CIb == null || i3 > i2) {
            return;
        }
        c31089CIb.postDelayed(new CI9(liveEmojiInputDialogFragment, j, i3, i2), j);
    }
}
