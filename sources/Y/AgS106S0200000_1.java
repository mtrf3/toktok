package Y;

import X.C10I;
import X.C10K;
import X.C2IM;
import X.C76800UCe;
import X.C98593tv;
import X.InterfaceC97983sw;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.NewChatRoomFragment;

/* loaded from: classes2.dex */
public class AgS106S0200000_1 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final Object then$0(AgS106S0200000_1 agS106S0200000_1, C10K c10k) {
        Object lambda$onEvent$9;
        lambda$onEvent$9 = ((BaseListFragmentPanel) agS106S0200000_1.l0).lambda$onEvent$9((C2IM) agS106S0200000_1.l1, c10k);
        return lambda$onEvent$9;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$1(AgS106S0200000_1 agS106S0200000_1, C10K c10k) {
        Fragment newChatRoomFragment = new NewChatRoomFragment();
        C98593tv c98593tv = (C98593tv) agS106S0200000_1.l1;
        Bundle bundle = new Bundle();
        c98593tv.setBookMode(true);
        bundle.putSerializable("key_enter_chat_params", c98593tv);
        newChatRoomFragment.setArguments(bundle);
        ((InterfaceC97983sw) agS106S0200000_1.l0).LJFF(newChatRoomFragment, String.valueOf(((C98593tv) agS106S0200000_1.l1).getSessionId()));
        ((InterfaceC97983sw) agS106S0200000_1.l0).LJI();
        return C76800UCe.LIZ;
    }

    public AgS106S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
