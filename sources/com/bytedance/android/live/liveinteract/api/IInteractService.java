package com.bytedance.android.live.liveinteract.api;

import X.AbstractC32579CqV;
import X.B3G;
import X.B5Y;
import X.BAP;
import X.C73893SzJ;
import X.InterfaceC06390Mx;
import X.InterfaceC28235B6h;
import X.InterfaceC30069Br7;
import X.InterfaceC32187CkB;
import X.InterfaceC58334Muw;
import X.InterfaceC65784Pro;
import X.InterfaceC75238Tfu;
import X.InterfaceC75512TkK;
import X.TX0;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import tikcast.linkmic.controller.LinkedUserInfo;

/* loaded from: classes6.dex */
public interface IInteractService extends InterfaceC06390Mx {
    boolean Ao();

    String BF(boolean z, Room room);

    void BL(LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    SurfaceView Bo();

    Set<Long> DD();

    LiveWidget EF();

    int Ef();

    int Em();

    String FZ();

    void Fe(InterfaceC75512TkK interfaceC75512TkK);

    int Fy();

    boolean GQ();

    int GR();

    boolean Hu0();

    boolean I80();

    void Jj();

    void Js0(InterfaceC75512TkK interfaceC75512TkK);

    String K9();

    String KU(long j);

    Map<String, String> L00();

    long LJJLI();

    boolean LLLLZLLIL();

    Set<Long> M10();

    int MS(String str);

    InterfaceC75238Tfu Mb(ViewGroup viewGroup, DataChannel dataChannel);

    String Ng(User user);

    List<TeamUsersInfo> Nh0();

    boolean OB();

    CohostTopic P20();

    void PO(TX0 tx0);

    void PW(Boolean bool, String str, JSONObject jSONObject);

    void Pb(Context context);

    Class<? extends LiveRecyclableWidget> Pm();

    Rect Q00();

    boolean QA();

    List<Long> QD();

    boolean Qe0();

    boolean Qh(boolean z);

    Set<Long> Rt0();

    long S6();

    void Ty(String str, WeakReference<InterfaceC58334Muw> weakReference);

    boolean UX();

    void Uf(long j);

    boolean VY();

    boolean Vc();

    User Vp(Long l);

    void WA(Map<String, String> map);

    void Wb0();

    int Wd(User user);

    void Wj();

    void Wx(DataChannel dataChannel);

    boolean Wy();

    long X90();

    boolean Xu0();

    boolean Y40();

    void Yl0(BAP bap);

    User Yt();

    int Yu0();

    boolean ZQ();

    boolean ZR();

    boolean Zf();

    boolean Zs0();

    void ad0(TX0 tx0);

    String co0();

    boolean cx();

    boolean dX();

    void e1();

    AbstractC32579CqV e60(int i, Context context, DataChannel dataChannel, C73893SzJ c73893SzJ, ARunnableS41S0100000_5 aRunnableS41S0100000_5, boolean z);

    void eS();

    long eq();

    void fR(Room room);

    InterfaceC32187CkB fh();

    String gB();

    Object gI();

    String getConnectionType();

    String getDebugInfo();

    boolean gr0();

    boolean gt(String str);

    String h00();

    boolean h80();

    long hV();

    boolean hw(User user);

    Set<Long> iP();

    void initPublicScreenConfiguration();

    boolean isNeedPublishFrame();

    boolean kg(DataChannel dataChannel, boolean z);

    InterfaceC30069Br7 lS();

    long lt0();

    boolean mT();

    boolean mr0();

    InterfaceC28235B6h n60(LiveMode liveMode);

    boolean n8();

    B3G nE(ViewGroup viewGroup, DataChannel dataChannel, LifecycleOwner lifecycleOwner);

    void ns0(List<LinkedUserInfo> list);

    void od0(DataChannel dataChannel);

    boolean on();

    boolean p00(User user);

    Rect po0(long j);

    boolean q3();

    void rd(String str, Map<String, String> map);

    void sL();

    boolean ta0();

    void uX(String str);

    void vs(Room room, InterfaceC65784Pro<Boolean> interfaceC65784Pro);

    void wN(Context context, boolean z);

    long xX();

    void xt();

    B5Y xz(long j);

    boolean yA();

    void yW(Room room);

    void yo0();

    void yp0();

    int yr();
}
