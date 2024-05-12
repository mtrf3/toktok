package com.bytedance.android.live.function;

import X.ActivityC45651qj;
import X.C28448BEm;
import X.C29930Bos;
import X.C76800UCe;
import X.CG4;
import X.InterfaceC06050Lp;
import X.InterfaceC06060Lq;
import X.InterfaceC06390Mx;
import X.InterfaceC62096OYq;
import X.InterfaceC74834TYo;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.interaction.LiveInteractionFeaturesFragment;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessCanvasWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessToolbarWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveGiftPollEffectWidget;
import com.bytedance.android.livesdk.interaction.poll.ui.progresseffect.widget.LiveNormalPollEffectWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import java.util.Locale;

/* loaded from: classes.dex */
public interface IRoomFunctionService extends InterfaceC06390Mx {
    void Ao0(long j, InterfaceC06060Lq interfaceC06060Lq);

    void B7();

    Class<? extends LiveRecyclableWidget> Br();

    void C50(long j, InterfaceC06050Lp interfaceC06050Lp);

    void D(DataChannel dataChannel);

    LiveNormalPollEffectWidget E10(RecyclableWidgetManager recyclableWidgetManager);

    int F(long j);

    void Hp0();

    void Jc(Fragment fragment, Room room, DataChannel dataChannel);

    DialogInterface Je0(Context context, boolean z, Room room, C29930Bos c29930Bos, IHostLongPressCallback iHostLongPressCallback, InterfaceC62096OYq interfaceC62096OYq);

    void KX(long j, InterfaceC06060Lq interfaceC06060Lq);

    void LLFFF(Room room, DataChannel dataChannel);

    void LLZZLLIL(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner);

    void Lk();

    DrawGuessCanvasWidget Qz();

    InterfaceC74834TYo RG(ViewModelProvider viewModelProvider);

    void Tc0(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    void VJ(Context context, DataChannel dataChannel, boolean z, boolean z2, long j);

    boolean Xc(Room room);

    void ZO();

    void am0(DataChannel dataChannel, boolean z);

    LiveInteractionFeaturesFragment bn0(Bundle bundle);

    Class<? extends LiveRecyclableWidget> br();

    LiveGiftPollEffectWidget bv0();

    void ca0(Fragment fragment, String str);

    CG4 fb(DataChannel dataChannel);

    void fm(Room room);

    void initPublicScreenConfiguration();

    void jp0(long j, InterfaceC06050Lp interfaceC06050Lp);

    void m20(DataChannel dataChannel);

    DrawGuessToolbarWidget mR(Fragment fragment);

    boolean nU(DataChannel dataChannel);

    void nj0(DataChannel dataChannel);

    void no(C28448BEm c28448BEm, FragmentManager fragmentManager);

    void onEnterBroadcastPreview();

    void onLocaleChanged(Locale locale);

    Class<? extends LiveRecyclableWidget> pf0();

    long pz();

    Class<? extends LiveRecyclableWidget> rF();

    void sS(int i, long j);

    void u00(String str, ActivityC45651qj activityC45651qj, DataChannel dataChannel, boolean z, String str2);

    int u4(long j);

    void uG(long j, InterfaceC06050Lp interfaceC06050Lp);

    void uk0(long j, InterfaceC06050Lp interfaceC06050Lp);

    void uw(DataChannel dataChannel, boolean z);

    Class<? extends LiveRecyclableWidget> vN();

    void wJ(int i, long j);

    void xk(DataChannel dataChannel);

    DrawGuessStatusWidget yG();

    Class<? extends LiveRecyclableWidget> z10();

    Class<? extends LiveRecyclableWidget> z50();

    boolean zq();

    boolean zt();
}
