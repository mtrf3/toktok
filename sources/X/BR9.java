package X;

import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.model.message.GoodyBagMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import webcast.api.goody_bag.GetRoomGoodyBagResponse;

/* loaded from: classes6.dex */
public interface BR9 {
    void LIZ();

    GoodyBagBaseInfo LIZIZ();

    void LIZJ();

    GoodyBagMessage LIZLLL();

    void LJ(GetRoomGoodyBagResponse.ResponseData responseData);

    void LJFF(DataChannel dataChannel, InterfaceC28772BQy interfaceC28772BQy);

    boolean isAnchor();

    void onPause();

    void onResume();
}
