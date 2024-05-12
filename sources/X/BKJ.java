package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public interface BKJ {
    void Ah(boolean z);

    Room B2();

    void C5();

    void Db();

    void Jf(boolean z);

    EnterRoomConfig Jj();

    void Kd(Room room, EnterRoomConfig enterRoomConfig);

    DataChannel LJIIL();

    void LJLJJL();

    void LLLFF();

    void LLLIIII(boolean z);

    void LLZLI();

    void Mj(LiveRoomFragment liveRoomFragment);

    void Nc();

    B5V O3();

    void T4();

    void U5();

    void Uj();

    void Vh();

    void W2(InterfaceC28159B3j interfaceC28159B3j);

    int dd();

    B42 ea();

    void el();

    void ga(int i);

    String getCurrentUrl();

    Fragment getFragment();

    long getRoomId();

    void h7();

    String m2();

    boolean onBackPressed();

    void t7(int i);

    void u3();
}
