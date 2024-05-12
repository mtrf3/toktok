package X;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BTG extends C98T {
    public BTG() {
        super(300L);
    }

    @Override // X.C98T
    public final void LIZ(View view) {
        int i;
        String str;
        if (view != null) {
            BTH.LJLILLLLZI = !view.isSelected();
            LivePlayFragment livePlayFragment = BTH.LJLLLLLL;
            if (livePlayFragment != null) {
                livePlayFragment.vm("internal window user set", BTH.LJLILLLLZI);
            }
            view.setSelected(BTH.LJLILLLLZI);
            TuxIconView tuxIconView = (TuxIconView) view;
            if (BTH.LJLILLLLZI) {
                i = R.raw.icon_speaker_x_mark_ltr;
            } else {
                i = R.raw.icon_speaker_2_ltr;
            }
            tuxIconView.setIconRes(i);
            BTH bth = BTH.LJLIL;
            OSZ[] oszArr = new OSZ[1];
            if (BTH.LJLILLLLZI) {
                str = "mute";
            } else {
                str = "unmute";
            }
            oszArr[0] = new OSZ("mute_type", str);
            bth.getClass();
            BTH.LJIIIZ("livesdk_tiktokec_mini_window_mute", oszArr);
        }
    }
}
