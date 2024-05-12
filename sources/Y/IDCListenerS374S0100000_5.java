package Y;

import X.C0RN;
import X.C79057V0z;
import android.view.View;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.view.StickerEditFragment;
import com.bytedance.android.livesdk.game.GameCategoryListFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class IDCListenerS374S0100000_5 implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                return;
            case 1:
                onFocusChange$1(this, view, z);
                return;
            case 2:
                onFocusChange$2(this, view, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS374S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(IDCListenerS374S0100000_5 iDCListenerS374S0100000_5, View view, boolean z) {
        view.postDelayed(new ARunnableS41S0100000_5(iDCListenerS374S0100000_5, 123), 100L);
        ((LiveEmojiInputDialogFragment) iDCListenerS374S0100000_5.l0).LLI.setOnFocusChangeListener(null);
        ((LiveEmojiInputDialogFragment) iDCListenerS374S0100000_5.l0).LLJILJILJ = true;
    }

    public static final void onFocusChange$1(IDCListenerS374S0100000_5 iDCListenerS374S0100000_5, View view, boolean z) {
        view.postDelayed(new ARunnableS41S0100000_5((StickerEditFragment) iDCListenerS374S0100000_5.l0, 135), 100L);
        LiveEditText liveEditText = ((StickerEditFragment) iDCListenerS374S0100000_5.l0).LJLIL;
        if (liveEditText == null) {
            return;
        }
        liveEditText.setOnFocusChangeListener(null);
    }

    public static final void onFocusChange$2(IDCListenerS374S0100000_5 iDCListenerS374S0100000_5, View view, boolean z) {
        C0RN.LIZLLL("et_search onFocusChanged. hasFocus=", z, "GameCategoryListDialog");
        if (!z) {
            C79057V0z.LJJIIJZLJL(((GameCategoryListFragment) iDCListenerS374S0100000_5.l0)._$_findCachedViewById(R.id.czv).getContext(), (LiveEditText) ((GameCategoryListFragment) iDCListenerS374S0100000_5.l0)._$_findCachedViewById(R.id.czv));
        }
    }
}
