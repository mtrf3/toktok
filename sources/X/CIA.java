package X;

import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CIA implements C0C3 {
    public final /* synthetic */ LiveEmojiInputDialogFragment LJLIL;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public CIA(LiveEmojiInputDialogFragment liveEmojiInputDialogFragment) {
        this.LJLIL = liveEmojiInputDialogFragment;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        if (this.LJLIL.LLIIZ.getCurrentItem() == 0) {
            this.LJLIL.LLFFF.setIconAttr(R.attr.arm);
            this.LJLIL.LLFII.setIcon(R.drawable.cvn);
        } else {
            this.LJLIL.LLFII.setIconAttr(R.attr.arm);
            this.LJLIL.LLFFF.setIconAttr(R.attr.arl);
        }
    }
}
