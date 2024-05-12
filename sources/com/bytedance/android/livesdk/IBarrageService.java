package com.bytedance.android.livesdk;

import X.ActivityC45651qj;
import X.C28660BMq;
import X.C29778BmQ;
import X.C29785BmX;
import X.InterfaceC06390Mx;
import X.InterfaceC29980Bpg;
import X.InterfaceC30182Bsw;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.List;

/* loaded from: classes6.dex */
public interface IBarrageService extends InterfaceC06390Mx {
    void N60(ActivityC45651qj activityC45651qj, LifecycleOwner lifecycleOwner, Room room, C29785BmX c29785BmX, boolean z, boolean z2, DataChannel dataChannel);

    Class<? extends LiveRecyclableWidget> Oa(InterfaceC29980Bpg interfaceC29980Bpg);

    Class<? extends LiveRecyclableWidget> Rc0(InterfaceC29980Bpg interfaceC29980Bpg);

    void W0();

    List<String> gj0();

    void hk0(long j, C28660BMq c28660BMq);

    InterfaceC29980Bpg hq0(long j);

    String j90(long j);

    List<Class<? extends LiveRecyclableWidget>> oS();

    C29778BmQ pw(DataChannel dataChannel, Context context, Room room, boolean z, ViewGroup viewGroup);

    Class w40();

    C28660BMq wm0(long j);

    void x90(Fragment fragment, DataChannel dataChannel, InterfaceC30182Bsw interfaceC30182Bsw);

    void zM(long j);
}
