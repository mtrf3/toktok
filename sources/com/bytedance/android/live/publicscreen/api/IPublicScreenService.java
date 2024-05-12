package com.bytedance.android.live.publicscreen.api;

import X.ActivityC45651qj;
import X.BXU;
import X.C1FC;
import X.C1UF;
import X.C29846BnW;
import X.C31080CHs;
import X.C31281CPl;
import X.C31285CPp;
import X.C31306CQk;
import X.C31353CSf;
import X.C31809Ce5;
import X.C37671dr;
import X.C37681ds;
import X.C78857UxB;
import X.CQL;
import X.CQQ;
import X.CR6;
import X.CRD;
import X.CRX;
import X.CSA;
import X.CSH;
import X.CUX;
import X.CW4;
import X.CWA;
import X.InterfaceC06390Mx;
import X.InterfaceC29848BnY;
import X.InterfaceC31286CPq;
import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.impl.giftHistory.GiftHistoryWidgetHelper;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.HistoryInfo;
import java.util.List;

/* loaded from: classes6.dex */
public interface IPublicScreenService extends InterfaceC06390Mx {
    BXU A4();

    Class<? extends IPublicScreenContextWidget> BD();

    void CO(Context context);

    void Dq0(long j);

    Class<? extends LiveRecyclableWidget> Dr();

    void Dv(int i, InterfaceC29848BnY interfaceC29848BnY);

    void F00(long j, CRD crd);

    void FY(CQQ cqq, CapsuleMessage capsuleMessage);

    void GL(long j, C29846BnW c29846BnW);

    Class<? extends LiveRecyclableWidget> Gh();

    void IX(long j, CQL cql);

    BottomMessage Ia0(long j);

    void Ji(long j, CR6 cr6, C31080CHs c31080CHs);

    Class<? extends LiveRecyclableWidget> KQ();

    CW4 KR(ActivityC45651qj activityC45651qj, InterfaceC31286CPq interfaceC31286CPq, C37681ds c37681ds, DataChannel dataChannel);

    void Ks(DataChannel dataChannel);

    void LLFFF(Room room, DataChannel dataChannel);

    void LLZZLLIL(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner);

    void Lb0(long j, CSH<? extends CRD> csh, boolean z);

    void Lk0(long j, String str);

    Class<? extends LiveRecyclableWidget> Lo();

    CSH<? extends CRD> MB(CR6 cr6);

    void NN(long j);

    void O60();

    void OF(long j, C29846BnW c29846BnW);

    void QF(String str);

    void Qm(long j, HistoryInfo historyInfo);

    Class<? extends LiveRecyclableWidget> Rn();

    Class<? extends LiveRecyclableWidget> SE();

    void UM();

    CSH<? extends CRD> UW(long j, C31353CSf c31353CSf, boolean z);

    Class<? extends LiveRecyclableWidget> Ub0();

    void XO(CR6 cr6);

    void Yj0(CRX crx);

    void ZD(long j, CUX cux);

    CRD b5(CR6 cr6);

    void bt(long j, long j2);

    boolean bu0(boolean z);

    void c00(Room room);

    void c20(int i);

    C31281CPl cw(DataChannel dataChannel);

    void df(long j);

    void df0(long j, CQL cql, C31306CQk c31306CQk);

    void dh0(long j, CSH<? extends CRD> csh, Object obj);

    long e10(long j);

    GiftHistoryWidgetHelper e70(LifecycleOwner lifecycleOwner, DataChannel dataChannel, TextView textView, C31809Ce5 c31809Ce5, boolean z, C1UF c1uf);

    List<InterfaceC29848BnY> hr0(int i);

    ChatMessage ib(long j, String str, User user, Long l);

    List<CRX> jh0();

    CSA kh(Context context, ChatMessage chatMessage);

    C78857UxB m90();

    void nv(CRD crd);

    void ny(long j, Text text, long j2, PunishEventInfo punishEventInfo, int i, int i2, String str);

    void onPlayFragmentCreate();

    Class<? extends LiveRecyclableWidget> ow();

    ChatMessage pP(long j, String str, User user, int i, C1FC c1fc);

    Class<? extends IPublicScreenHolderWidget> pq(boolean z);

    Long qo(long j);

    void rE();

    Class<? extends IPublicScreenHolderWidget> sn();

    void t80(CQQ cqq, CR6 cr6);

    CWA uc(ActivityC45651qj activityC45651qj, InterfaceC31286CPq interfaceC31286CPq, C37671dr c37671dr, DataChannel dataChannel);

    void ue0(long j, long j2, CR6 cr6);

    void x9(ActivityC45651qj activityC45651qj, User user);

    C31285CPp xG(DataChannel dataChannel);

    boolean xg(Room room);
}
