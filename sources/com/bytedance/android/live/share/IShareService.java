package com.bytedance.android.live.share;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.BNI;
import X.C29867Bnr;
import X.C29930Bos;
import X.C30093BrV;
import X.InterfaceC06390Mx;
import X.InterfaceC62096OYq;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.share.LiveShareDialog;
import com.bytedance.android.livesdk.share.LiveShareWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* loaded from: classes6.dex */
public interface IShareService extends InterfaceC06390Mx {
    AbstractC73672Svk Ib(String str, long j, String str2, String str3);

    boolean Qn0(Room room);

    LiveShareDialog RQ(C29930Bos c29930Bos, InterfaceC62096OYq interfaceC62096OYq);

    List Zp0(LiveMode liveMode, Room room, DataChannel dataChannel);

    C29867Bnr bW(ActivityC45651qj activityC45651qj, Context context, LiveMode liveMode, LifecycleOwner lifecycleOwner);

    LiveShareWidget lB();

    BNI un0();

    boolean vo0(Room room);

    C30093BrV wp0();
}
