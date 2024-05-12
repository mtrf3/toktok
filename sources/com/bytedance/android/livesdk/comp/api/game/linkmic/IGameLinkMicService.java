package com.bytedance.android.livesdk.comp.api.game.linkmic;

import X.C75566TlC;
import X.InterfaceC06390Mx;
import X.InterfaceC30177Bsr;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkControlWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public interface IGameLinkMicService extends InterfaceC06390Mx {
    boolean Sw(Room room);

    int US(User user, String str);

    void WC(Fragment fragment, DataChannel dataChannel);

    void WG(Fragment fragment, Room room);

    int Yh0(String str);

    GameLinkControlWidget hE(InterfaceC30177Bsr interfaceC30177Bsr);

    C75566TlC qH();

    void sV();

    boolean ws(Runnable runnable, String str);
}
