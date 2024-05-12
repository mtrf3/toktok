package com.bytedance.android.livesdk.comp.api.game.service;

import X.C30451BxH;
import X.C30579BzL;
import X.C30605Bzl;
import X.C30607Bzn;
import X.C31043CGh;
import X.C76800UCe;
import X.InterfaceC06390Mx;
import X.InterfaceC88472Yns;
import X.UZK;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.TaskProfitInfo;
import com.bytedance.android.livesdk.model.message.PartnershipGameOfflineMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import webcast.api.partnership.AnchorRoomInfoResponse;

/* loaded from: classes6.dex */
public interface IGamePartnershipService extends InterfaceC06390Mx {
    void AA(Context context, InterfaceC88472Yns<? super List<TaskProfitInfo>, C76800UCe> interfaceC88472Yns);

    Boolean Ac(long j);

    void Bc0(Context context, Room room, DataChannel dataChannel, InterfaceC88472Yns<? super C30605Bzl, C76800UCe> interfaceC88472Yns);

    void Ei0(Room room);

    boolean GB(long j, String str, boolean z);

    void Ka0();

    void Np(Context context, String str, String str2);

    BriefGameTask OL();

    void QB(Room room);

    void QC();

    boolean Rj0(long j, List<PartnershipGameOfflineMessage.OfflineGameInfo> list);

    C30579BzL S00();

    void Uy(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    C30607Bzn aT();

    void dk(Activity activity, String str, String str2, InterfaceC88472Yns<? super JSONObject, C76800UCe> interfaceC88472Yns);

    C31043CGh eD();

    Class<? extends LiveRecyclableWidget> hS();

    Class<? extends LiveRecyclableWidget> mw();

    void nh(long j, InterfaceC88472Yns<? super AnchorRoomInfoResponse.ResponseData, C76800UCe> interfaceC88472Yns);

    UZK oK();

    void qn(long j, DataChannel dataChannel);

    void ri0(Context context, String str, Map<String, String> map);

    void y40(FragmentManager fragmentManager, String str, Map<String, String> map);

    C30451BxH zi0();
}
