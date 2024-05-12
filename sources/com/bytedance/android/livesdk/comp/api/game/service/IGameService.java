package com.bytedance.android.livesdk.comp.api.game.service;

import X.ActivityC45651qj;
import X.C61494OBm;
import X.C65776Prg;
import X.InterfaceC06390Mx;
import X.OSZ;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.dialog.GameFloatWindowTipsDialog;
import com.bytedance.android.live.broadcast.dialog.GameScreenShareTipsDialog;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceSourceFragment;
import com.bytedance.android.live.broadcast.interruption.InterruptPreviewGuideDialog;
import com.bytedance.android.live.broadcast.interruption.PreviewMultiDeviceInterruptGuide;
import com.bytedance.android.live.broadcast.mirror.GameCastChooseFragment;
import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.preview.widget.GameAutoCoverMarkWidget;
import com.bytedance.android.livesdk.preview.widget.GameAutoCoverWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import kotlin.jvm.internal.AqS94S0300000_5;
import org.json.JSONObject;
import webcast.api.game.CreateInfoResponse;

/* loaded from: classes6.dex */
public interface IGameService extends InterfaceC06390Mx {
    void Cc();

    GameFloatWindowTipsDialog Co(String str);

    CreateInfoResponse.ResponseData DX();

    void Hc(JSONObject jSONObject);

    InterruptPreviewGuideDialog JF(Fragment fragment);

    void K10();

    GameAutoCoverWidget Km(String str);

    OSZ<Float, Float> LH();

    GameScreenShareTipsDialog O50(FragmentManager fragmentManager, AqS94S0300000_5 aqS94S0300000_5);

    boolean Ou();

    void Rt(LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    GameAutoCoverMarkWidget SV();

    boolean TM();

    void Tm();

    void U0(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    void Wg(String str);

    void Zf0(int i);

    void aE(String str, String str2, String str3);

    GameBroadcastFragment c1(C61494OBm c61494OBm, Bundle bundle);

    void dg0(Fragment fragment);

    GameCastChooseFragment du0(Bundle bundle);

    void gE(FragmentManager fragmentManager);

    void h90();

    String i80();

    void initPublicScreenConfiguration();

    C65776Prg m80();

    C65776Prg n70();

    GameDualDeviceSourceFragment pl0(int i, int i2, int i3, int i4, String str, String str2);

    boolean rH();

    String sC();

    void sm(LiveCore.Builder builder);

    PreviewMultiDeviceInterruptGuide uE(Fragment fragment);

    void uu(ActivityC45651qj activityC45651qj, GameLiveFragment gameLiveFragment);

    void wk0(JSONObject jSONObject);
}
