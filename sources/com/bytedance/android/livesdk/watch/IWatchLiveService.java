package com.bytedance.android.livesdk.watch;

import X.ActivityC45651qj;
import X.B3X;
import X.B4K;
import X.B51;
import X.BTF;
import X.BZM;
import X.C28267B7n;
import X.C29294Bec;
import X.C59414NTm;
import X.C71151RwB;
import X.C76800UCe;
import X.C87854Ydu;
import X.C87855Ydv;
import X.InterfaceC06390Mx;
import X.InterfaceC28161B3l;
import X.InterfaceC65784Pro;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.dislike.LiveLongPressDialog;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.drawerfeed.LiveNonPersonalizedDialog;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.IRecyclableWidget;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public interface IWatchLiveService extends InterfaceC06390Mx {
    C87854Ydu CU(DataChannel dataChannel);

    void E8(long j);

    void F2(Map map);

    void F4(String str, InterfaceC28161B3l interfaceC28161B3l);

    C87855Ydv F60(DataChannel dataChannel);

    void FU(Room room, String str, String str2, String str3);

    void Gi(Room room, String str, String str2, String str3);

    List IU(DataChannel dataChannel, LiveMode liveMode);

    void Il0(int i, Long l);

    void JI(int i);

    LiveDrawerDialogV3 JJ(BZM bzm, Bundle bundle);

    boolean JM(String str);

    void Kc0(Activity activity);

    boolean Kd();

    void LLFFF(Room room, DataChannel dataChannel);

    void LLZZLLIL(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner);

    void Lj0(C71151RwB c71151RwB);

    boolean M(String str, String str2, boolean z);

    void Oj0();

    void P70();

    void Pb0();

    List<Class<? extends IRecyclableWidget>> RK();

    boolean Rb(Long l);

    void S1(Context context);

    void U();

    void W5(String str);

    void Wk(float f, float f2, float f3, float f4);

    int Yy();

    int ZY();

    void Zd0(long j, boolean z);

    void af();

    boolean ba(String str);

    boolean d10(Context context, Long l, C28267B7n c28267B7n);

    void dP(C59414NTm c59414NTm);

    LiveNonPersonalizedDialog f20();

    void h60();

    boolean hU(Context context, Long l, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    Map<String, String> jM();

    int k30();

    LiveLongPressDialog km0(IHostLongPressCallback iHostLongPressCallback, Context context, Room room, String str, String str2, String str3);

    C29294Bec l4();

    boolean n20(Long l);

    void nT(Context context);

    void nd0(ActivityC45651qj activityC45651qj, DialogFragment dialogFragment);

    void pb(String str);

    void pn(Room room, String str, String str2, String str3);

    B4K r6(ActivityC45651qj activityC45651qj, BZM bzm, int i);

    List<B51> rR();

    void tM(Long l, BTF btf);

    void vT(MotionEvent motionEvent, String str);

    B3X w();

    LiveRoomFragment w0(EnterRoomConfig enterRoomConfig);

    boolean w9(String str);

    boolean we(Long l);

    void y10(long j, Activity activity);

    String zK();
}
