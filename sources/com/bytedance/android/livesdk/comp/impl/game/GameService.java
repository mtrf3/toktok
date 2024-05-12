package com.bytedance.android.livesdk.comp.impl.game;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass028;
import X.B4U;
import X.B83;
import X.BTJ;
import X.BZI;
import X.C05060Hu;
import X.C05500Jm;
import X.C09580Ze;
import X.C09720Zs;
import X.C0EH;
import X.C0JW;
import X.C0K2;
import X.C0NB;
import X.C0RK;
import X.C0RM;
import X.C0W0;
import X.C15380j0;
import X.C15390j1;
import X.C16880lQ;
import X.C19700py;
import X.C19710pz;
import X.C19720q0;
import X.C19730q1;
import X.C1DG;
import X.C1EW;
import X.C1NX;
import X.C276716t;
import X.C28787BRn;
import X.C29255Bdz;
import X.C29374Bfu;
import X.C30381Bw9;
import X.C30922CBq;
import X.C36801cS;
import X.C43588H8u;
import X.C48811vp;
import X.C48821vq;
import X.C48831vr;
import X.C48841vs;
import X.C48851vt;
import X.C4E;
import X.C61494OBm;
import X.C65352Pkq;
import X.C65776Prg;
import X.C77357UXp;
import X.CN1;
import X.EnumC21060sA;
import X.FP1;
import X.InterfaceC09240Xw;
import X.InterfaceC21070sB;
import X.InterfaceC259510d;
import X.InterfaceC30442Bx8;
import X.InterfaceC64592gB;
import X.InterfaceC78493UrJ;
import X.O5Y;
import X.OSZ;
import X.Q7L;
import X.T16;
import X.X1D;
import Y.AfS17S0001000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.dialog.GameFloatWindowTipsDialog;
import com.bytedance.android.live.broadcast.dialog.GameScreenShareTipsDialog;
import com.bytedance.android.live.broadcast.education.GameLiveNewBroadcastEducationBannerWidget;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceSourceFragment;
import com.bytedance.android.live.broadcast.highlight.PreviewHighLightVideoWidget;
import com.bytedance.android.live.broadcast.interruption.InterruptPreviewGuideDialog;
import com.bytedance.android.live.broadcast.interruption.PreviewMultiDeviceInterruptGuide;
import com.bytedance.android.live.broadcast.mirror.GameCastChooseFragment;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.speeddetector.NetworkSpeedDetectionDialog;
import com.bytedance.android.live.broadcast.tns.api.TnsPiracyApi;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.BroadcastClickStartLiveEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastOpenDefinitionDialogEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.GameCreateInfoRttGlobalChannel;
import com.bytedance.android.livesdk.dataChannel.LiveAccessTipsShowChannel;
import com.bytedance.android.livesdk.dataChannel.LiveBroadcastPreviewFragmentHideEvent;
import com.bytedance.android.livesdk.dataChannel.PreviewBroadcastBlockChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewPageSelectLiveMode;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.ServerAndClientTimeGapGlobalChannel;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableMobileGoliveContinueAutoSpeedtestSetting;
import com.bytedance.android.livesdk.livesetting.game.EnableMobileGameBroadcastFeedbackInfoAndDiagnose;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.preview.widget.GameAutoCoverMarkWidget;
import com.bytedance.android.livesdk.preview.widget.GameAutoCoverWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS94S0300000_5;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import webcast.api.game.CreateInfoResponse;

/* loaded from: classes6.dex */
public class GameService implements IGameService {
    public InterfaceC259510d LJLIL;
    public volatile boolean LJLILLLLZI;

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final C65776Prg m80() {
        return C65352Pkq.LIZ(GameLiveNewBroadcastEducationBannerWidget.class);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final C65776Prg n70() {
        return C65352Pkq.LIZ(PreviewHighLightVideoWidget.class);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void Cc() {
        C19700py.LIZ.getClass();
        C19700py.LJIJJ.set(true);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void K10() {
        Iterator it = ((LinkedHashMap) C19710pz.LIZ).entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC21070sB interfaceC21070sB = (InterfaceC21070sB) ((Map.Entry) it.next()).getValue();
            if (interfaceC21070sB != null) {
                interfaceC21070sB.LIZIZ();
            }
        }
        C19710pz.LIZIZ.set(true);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameAutoCoverMarkWidget SV() {
        return new GameAutoCoverMarkWidget();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final boolean TM() {
        C19720q0 LJII = C19700py.LIZ.LJII();
        if (LJII != null && LJII.LJJJI == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void h90() {
        C19700py c19700py = C19700py.LIZ;
        synchronized (c19700py) {
            if (C30922CBq.LIZIZ) {
                C0NB.LJIIIZ("GameBroadcastFeedbackDiagnose", "onGameLiveStart()");
            }
            c19700py.LJIIIZ();
            C19700py.LJIJJLI = null;
            C19700py.LIZJ.set(true);
            C19700py.LJFF.set(System.currentTimeMillis());
            C19700py.LJJ = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(new InterfaceC78493UrJ() { // from class: X.1Y3
                @Override // X.InterfaceC78493UrJ
                public final void LJJIL() {
                    C19700py.LJIL.set(true);
                    if (C30922CBq.LIZIZ) {
                        C0NB.LJIIIZ("GameBroadcastFeedbackDiagnose", "app enter background.");
                    }
                }

                @Override // X.InterfaceC78493UrJ
                public final void LLIIIZ() {
                    if (C30922CBq.LIZIZ) {
                        C0NB.LJIIIZ("GameBroadcastFeedbackDiagnose", "app enter foreground.");
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x03a8 A[Catch: all -> 0x03bb, TRY_LEAVE, TryCatch #0 {all -> 0x03bb, blocks: (B:143:0x0382, B:145:0x03a8), top: B:142:0x0382 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03e0  */
    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String i80() {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.GameService.i80():java.lang.String");
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void initPublicScreenConfiguration() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = true;
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Yj0(new C4E());
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final boolean rH() {
        return EnableMobileGameBroadcastFeedbackInfoAndDiagnose.INSTANCE.isEnable();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final String sC() {
        String jSONArray;
        String str;
        C19700py c19700py = C19700py.LIZ;
        synchronized (c19700py) {
            long currentTimeMillis = System.currentTimeMillis();
            C19720q0 LJII = c19700py.LJII();
            JSONArray jSONArray2 = new JSONArray();
            if (LJII != null) {
                C19700py.LIZJ(jSONArray2, LJII);
                C19700py.LIZLLL(jSONArray2, LJII);
                C19700py.LJ(jSONArray2, LJII);
                C19700py.LJI(jSONArray2, LJII);
                C19700py.LJFF(jSONArray2);
                int i = 0;
                if (C19700py.LJIJJ.getAndSet(false)) {
                    str = "link_mic_silence";
                    i = 1;
                } else {
                    str = "";
                }
                String valueOf = String.valueOf(i);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(str);
                jSONArray2.put(C19700py.LIZ("diagnose_audio_issue", valueOf, arrayList));
            }
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("diagnose().  result=");
                LIZ.append(jSONArray2);
                LIZ.append(", cost=");
                LIZ.append(System.currentTimeMillis() - currentTimeMillis);
                C0NB.LJIIIZ("GameBroadcastFeedbackDiagnose", X1D.LIZIZ(LIZ));
            }
            jSONArray = jSONArray2.toString();
            o.LJIIIIZZ(jSONArray, "jsonArray.toString()");
        }
        return jSONArray;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final OSZ<Float, Float> LH() {
        float f;
        Float f2;
        Float f3;
        InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId());
        float f4 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        if (LIZIZ == null) {
            return new OSZ<>(valueOf, valueOf);
        }
        C05060Hu DEVICE_OVERALL_SCORE = C05060Hu.LIZJ;
        o.LJIIIIZZ(DEVICE_OVERALL_SCORE, "DEVICE_OVERALL_SCORE");
        C05060Hu DEVICE_VIDEO_RECORD_SCENE_SCORE = C05060Hu.LJIIJ;
        o.LJIIIIZZ(DEVICE_VIDEO_RECORD_SCENE_SCORE, "DEVICE_VIDEO_RECORD_SCENE_SCORE");
        Bundle bundle = new Bundle();
        LIZIZ.LJIILIIL(new C05060Hu[]{DEVICE_OVERALL_SCORE, DEVICE_VIDEO_RECORD_SCENE_SCORE}, bundle);
        Object LLJJIII = C16880lQ.LLJJIII(bundle, DEVICE_OVERALL_SCORE.LIZ);
        if ((LLJJIII instanceof Float) && (f3 = (Float) LLJJIII) != null) {
            f = f3.floatValue();
        } else {
            f = 0.0f;
        }
        Float valueOf2 = Float.valueOf(f);
        Object LLJJIII2 = C16880lQ.LLJJIII(bundle, DEVICE_VIDEO_RECORD_SCENE_SCORE.LIZ);
        if ((LLJJIII2 instanceof Float) && (f2 = (Float) LLJJIII2) != null) {
            f4 = f2.floatValue();
        }
        return new OSZ<>(valueOf2, Float.valueOf(f4));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final boolean Ou() {
        return C276716t.LIZJ();
    }

    @Override // X.InterfaceC06390Mx
    public final void onInit() {
        if (LiveServiceManagerOptSetting.enable()) {
            return;
        }
        this.LJLILLLLZI = true;
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).Yj0(new C4E());
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final CreateInfoResponse.ResponseData DX() {
        return C09720Zs.LIZIZ;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void Tm() {
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameFloatWindowTipsDialog Co(String str) {
        GameFloatWindowTipsDialog gameFloatWindowTipsDialog = new GameFloatWindowTipsDialog();
        gameFloatWindowTipsDialog.LJLIL = str;
        return gameFloatWindowTipsDialog;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void Hc(JSONObject value) {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        o.LJIIIZ(value, "value");
        if (((LinkedHashMap) C19710pz.LIZ).get(EnumC21060sA.HIGH_PING_BITRATE_ADJUST_MODULE) != null && C30922CBq.LIZIZ) {
            try {
                str = JSONObjectProtectorUtils.getString(value, "adjustment");
            } catch (Exception unused) {
                str = "unknown";
            }
            try {
                obj = Long.valueOf(JSONObjectProtectorUtils.getLong(value, "bitrate_beforeadjust") / 1000);
            } catch (Exception unused2) {
                obj = -1;
            }
            try {
                obj2 = Long.valueOf(JSONObjectProtectorUtils.getLong(value, "bitrate_afteradjust") / 1000);
            } catch (Exception unused3) {
                obj2 = -1;
            }
            try {
                obj3 = Long.valueOf(JSONObjectProtectorUtils.getLong(value, "min_bitrate") / 1000);
            } catch (Exception unused4) {
                obj3 = -1;
            }
            try {
                obj4 = Long.valueOf(JSONObjectProtectorUtils.getLong(value, "max_bitrate") / 1000);
            } catch (Exception unused5) {
                obj4 = -1;
            }
            C0NB.LJIIIZ("HighPingBitrateOptimizePushStream", "[event_key:bitrate_adjust]. adjustment=" + str + ", bitrate_beforeadjust=" + obj + ", bitrate_afteradjust=" + obj2 + ", minBitrate=" + obj3 + ", max_bitrate=" + obj4);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final InterruptPreviewGuideDialog JF(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return new InterruptPreviewGuideDialog(fragment);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameAutoCoverWidget Km(String str) {
        return new GameAutoCoverWidget(str);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void Wg(String str) {
        if (C30922CBq.LIZIZ) {
            FP1.LJFF("cacheSaveToDraftFragmentId(). id=", str, "GameBroadcastMessageStationWidget");
        }
        ((ArrayList) C1NX.LJLJJLL).add(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fragment_id", str);
        linkedHashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        C0K2.LJII(-1, O5Y.LJJL("ttlive_highlight_to_draft_monitor"), linkedHashMap);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void Zf0(int i) {
        AbstractC73672Svk.LJJIJIL(Boolean.TRUE).LJJJ(T16.LIZ()).LJJJJZI(new AfS17S0001000_5(i, 4));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void dg0(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        final long currentTimeMillis = System.currentTimeMillis();
        C1EW.LIZ(((TnsPiracyApi) Q7L.LIZIZ(TnsPiracyApi.class)).getPreviewGameCreateInfo()).LJII(BTJ.LIZIZ(fragment)).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1PI
            public final /* synthetic */ C09720Zs LJLIL = C09720Zs.LIZ;

            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                int i;
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null) {
                    i = baseResponse.statusCode;
                } else {
                    i = -999999;
                }
                if (i == 0) {
                    C09720Zs.LIZ(0, "", true);
                    C09720Zs c09720Zs = this.LJLIL;
                    CreateInfoResponse.ResponseData responseData = (CreateInfoResponse.ResponseData) baseResponse.data;
                    c09720Zs.getClass();
                    C09720Zs.LIZIZ = responseData;
                    CreateInfoResponse.ResponseData responseData2 = (CreateInfoResponse.ResponseData) baseResponse.data;
                    long j = currentTimeMillis;
                    if (responseData2 != null) {
                        long j2 = responseData2.serverTimestamp;
                        if (j2 != -1) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            long j3 = (currentTimeMillis2 - j) / 2;
                            long j4 = (j2 - j) - j3;
                            if (C30922CBq.LIZIZ) {
                                StringBuilder LIZJ = V10.LIZJ("clientRequestTs=", j, ", serverResponseTs=");
                                LIZJ.append(j2);
                                C0MT.LIZLLL(LIZJ, ", clientResponseTs=", currentTimeMillis2, ", rtt=");
                                LIZJ.append(j3);
                                LIZJ.append(", gap=");
                                LIZJ.append(j4);
                                C0NB.LJIIIZ("GameCreateInfoManager", X1D.LIZIZ(LIZJ));
                            }
                            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                            dataChannelGlobal.tv0(ServerAndClientTimeGapGlobalChannel.class, Long.valueOf(j4));
                            dataChannelGlobal.tv0(GameCreateInfoRttGlobalChannel.class, Long.valueOf(j3));
                            return;
                        }
                    }
                    DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LJLJJI;
                    dataChannelGlobal2.tv0(ServerAndClientTimeGapGlobalChannel.class, -1L);
                    dataChannelGlobal2.tv0(GameCreateInfoRttGlobalChannel.class, -1L);
                    return;
                }
                C09720Zs.LIZ(i, "response status code not right.", false);
            }
        }, new InterfaceC64592gB() { // from class: X.1PJ
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("throwable=");
                LIZ.append(th.getClass().getName());
                LIZ.append(", message");
                LIZ.append(th.getMessage());
                C09720Zs.LIZ(-888888, X1D.LIZIZ(LIZ), false);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onError. message: ");
                LIZ2.append(th.getMessage());
                C0NB.LJ("GameCreateInfoManager", X1D.LIZIZ(LIZ2));
            }
        });
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameCastChooseFragment du0(Bundle bundle) {
        GameCastChooseFragment gameCastChooseFragment = new GameCastChooseFragment();
        gameCastChooseFragment.setArguments(bundle);
        return gameCastChooseFragment;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void gE(FragmentManager fragmentManager) {
        new NetworkSpeedDetectionDialog().show(fragmentManager, "NetworkSpeedDetectionDialog");
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void sm(LiveCore.Builder builder) {
        AbstractC73672Svk.LJJIJIL(Boolean.TRUE).LJJJ(T16.LIZ()).LJJJJZI(new AfS57S0100000_5(builder, 100));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final PreviewMultiDeviceInterruptGuide uE(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return new PreviewMultiDeviceInterruptGuide(fragment);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void wk0(JSONObject value) {
        o.LJIIIZ(value, "value");
        AbstractC73672Svk.LJJIJIL(Boolean.TRUE).LJJJ(T16.LIZ()).LJJJJZI(new AfS57S0100000_5(value, 99));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameScreenShareTipsDialog O50(FragmentManager fragmentManager, AqS94S0300000_5 aqS94S0300000_5) {
        if (fragmentManager != null) {
            GameScreenShareTipsDialog gameScreenShareTipsDialog = new GameScreenShareTipsDialog();
            gameScreenShareTipsDialog.show(fragmentManager, "GameScreenShareTipsDialog");
            gameScreenShareTipsDialog.LJLIL = aqS94S0300000_5;
            return gameScreenShareTipsDialog;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void Rt(final LifecycleOwner lifecycleOwner, final DataChannel dataChannel) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (EnableMobileGoliveContinueAutoSpeedtestSetting.INSTANCE.isEnable()) {
            if (C30922CBq.LIZIZ) {
                C0NB.LJIIIZ("GameBroadcastNewAutoSpeedDetectorHelper", "on enter game mode live preview page.");
            }
            C0RK.LIZ();
            InterfaceC30442Bx8.LLLZI.LIZ(new LinkedHashMap());
            lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.android.live.broadcast.speeddetector.GameBroadcastNewAutoSpeedDetectorHelper$onEnterGameModePreviewPage$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    int i = C05500Jm.LIZ[event.ordinal()];
                    if (i != 1) {
                        if (i != 2 || C0RK.LIZLLL) {
                            return;
                        }
                        C0W0 c0w0 = C0W0.DisconnectTypeAutoDetectionExitPreviewPage;
                        C0RK.LIZIZ(c0w0.getCode(), c0w0.getMessage());
                        C0RK.LIZ();
                        return;
                    }
                    DataChannel dataChannel2 = dataChannel;
                    LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                    if (dataChannel2 != null) {
                        dataChannel2.ov0(lifecycleOwner2, RoomCreateInfoChannel.class, new IDqS416S0100000(dataChannel2, 145));
                        dataChannel2.lv0(lifecycleOwner2, PreviewPageSelectLiveMode.class, new IDqS416S0100000(dataChannel2, 146));
                        dataChannel2.lv0(lifecycleOwner2, BroadcastClickStartLiveEvent.class, C48851vt.LJLIL);
                    }
                    DataChannel dataChannel3 = dataChannel;
                    LifecycleOwner lifecycleOwner3 = lifecycleOwner;
                    if (dataChannel3 == null) {
                        return;
                    }
                    dataChannel3.lv0(lifecycleOwner3, BroadcastOpenDefinitionDialogEvent.class, C48811vp.LJLIL);
                    dataChannel3.lv0(lifecycleOwner3, PreviewBroadcastBlockChannel.class, C48821vq.LJLIL);
                    dataChannel3.lv0(lifecycleOwner3, LiveBroadcastPreviewFragmentHideEvent.class, C48831vr.LJLIL);
                    dataChannel3.lv0(lifecycleOwner3, LiveAccessTipsShowChannel.class, C48841vs.LJLIL);
                }
            });
            return;
        }
        new C0RM(lifecycleOwner, dataChannel);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameBroadcastFragment c1(C61494OBm c61494OBm, Bundle bundle) {
        LivePerformanceManager LIZ = B4U.LIZ();
        LIZ.LJLILLLLZI = LiveMode.SCREEN_RECORD;
        LIZ.LJJIIZ(true);
        LIZ.LJJI("create_live");
        if (LivePerformanceManager.LJIL()) {
            if (LivePerformanceManager.LJIL() && !LIZ.LLIIL) {
                LIZ.LLIIL = true;
                Handler handler = LIZ.LJLLLLLL;
                if (handler == null) {
                    handler = LIZ.LJIJI();
                }
                handler.removeCallbacks(LIZ.LLJJI);
                Handler handler2 = LIZ.LJLLLLLL;
                if (handler2 == null) {
                    handler2 = LIZ.LJIJI();
                }
                handler2.post(LIZ.LLJJI);
            }
        } else {
            LIZ.LJJIJ();
        }
        GameBroadcastFragment gameBroadcastFragment = new GameBroadcastFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("extra", bundle);
        gameBroadcastFragment.setArguments(bundle2);
        gameBroadcastFragment.LJLJL = c61494OBm;
        return gameBroadcastFragment;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void uu(ActivityC45651qj activityC45651qj, GameLiveFragment gameLiveFragment) {
        InterfaceC259510d interfaceC259510d = this.LJLIL;
        if (interfaceC259510d == null) {
            interfaceC259510d = new C36801cS();
        }
        this.LJLIL = interfaceC259510d;
        interfaceC259510d.LIZ(activityC45651qj, gameLiveFragment);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void aE(String str, String str2, String str3) {
        String str4;
        String str5;
        Long l;
        long j;
        Integer num;
        C19700py c19700py = C19700py.LIZ;
        synchronized (c19700py) {
            long currentTimeMillis = System.currentTimeMillis();
            C19720q0 LJII = c19700py.LJII();
            if (LJII != null) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                PushStreamInfo.Quality quality = (PushStreamInfo.Quality) dataChannelGlobal.mv0(BroadcastShareScreenDefinition.class);
                Long l2 = null;
                if (quality != null) {
                    str4 = quality.sdkKey;
                } else {
                    str4 = null;
                }
                if (C77357UXp.LJJIJ()) {
                    str5 = "manual_speedtest";
                } else if (C77357UXp.LJJIIZI()) {
                    str5 = "auto_speedtest";
                } else {
                    Map<String, String> LIZJ = InterfaceC30442Bx8.LLLZI.LIZJ();
                    if (LIZJ == null || LIZJ.isEmpty()) {
                        str5 = "default";
                    } else {
                        str5 = "selected";
                    }
                }
                String resumeLiveDefinition = InterfaceC30442Bx8.LLLZIIL.LIZJ();
                String resumeLiveDefinitionType = InterfaceC30442Bx8.LLLZIL.LIZJ();
                o.LJIIIIZZ(resumeLiveDefinition, "resumeLiveDefinition");
                if (resumeLiveDefinition.length() > 0) {
                    o.LJIIIIZZ(resumeLiveDefinitionType, "resumeLiveDefinitionType");
                    if (resumeLiveDefinitionType.length() > 0) {
                        str4 = resumeLiveDefinition;
                        str5 = resumeLiveDefinitionType;
                    }
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_ttlive_feedback_diagnose");
                LIZ.LJIJJ(str3, "feedback_label_id");
                LIZ.LJIJJ(str2, "feedback_questionnaire_id");
                LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
                C19730q1 c19730q1 = C19700py.LIZLLL;
                if (c19730q1 != null) {
                    l = Long.valueOf(c19730q1.LIZIZ);
                } else {
                    l = null;
                }
                LIZ.LJIJJ(l, "room_id");
                LIZ.LJIJJ(str, "feedback_result");
                LIZ.LJIJJ(Integer.valueOf(LJII.LJJIIZI), "diagnose_video_birate_result");
                LIZ.LJIJJ(LJII.LJJIJ, "diagnose_video_birate_bad_reason");
                LIZ.LJIJJ(Integer.valueOf(LJII.LJJIJIIJI), "diagnose_video_framerate_result");
                LIZ.LJIJJ(LJII.LJJIJIIJIL, "diagnose_video_framerate_bad_reason");
                LIZ.LJIJJ(Integer.valueOf(LJII.LJJIJIL), "diagnose_push_stream_network_result");
                LIZ.LJIJJ(LJII.LJJIJL, "diagnose_push_stream_network_bad_reason");
                LIZ.LJIJJ(Integer.valueOf(LJII.LJJJI), "app_had_enter_background");
                LIZ.LJIJJ(Integer.valueOf(LJII.LJJIJLIJ), "diagnose_game_fps_result");
                LIZ.LJIJJ(LJII.LJJIL, "diagnose_game_fps_bad_reason");
                LIZ.LJIJJ(str4, "definitions");
                LIZ.LJIJJ(str5, "definition_select_strategy");
                String str6 = (String) dataChannelGlobal.mv0(C29255Bdz.class);
                if (str6 == null) {
                    str6 = "";
                }
                LIZ.LJIJJ(str6, "game_category");
                Long l3 = (Long) dataChannelGlobal.mv0(C30381Bw9.class);
                if (l3 != null) {
                    j = l3.longValue();
                } else {
                    j = 0;
                }
                double d = j * 8;
                double d2 = 1024;
                LIZ.LJIJJLI("speed_detection_result", Double.valueOf((d / d2) / d2));
                LIZ.LJIJJLI("real_bitrate_avg", Double.valueOf(LJII.LIZ));
                LIZ.LJIJJLI("real_video_framerate_avg", Double.valueOf(LJII.LJFF));
                C19730q1 c19730q12 = C19700py.LIZLLL;
                if (c19730q12 != null) {
                    num = Integer.valueOf(c19730q12.LJIIIIZZ);
                } else {
                    num = null;
                }
                LIZ.LJIJJ(num, "auto_bitrate_strategy");
                LIZ.LJIJJ(Integer.valueOf(C15390j1.LIZLLL(C15380j0.LIZLLL())), "cpu_cores");
                LIZ.LJIJJLI("cpu_speed_avg", Double.valueOf(LJII.LJIIZILJ));
                LIZ.LJIJJLI("cpu_rate_avg", Double.valueOf(LJII.LJIJ));
                LIZ.LJIJJLI("single_core_speed_avg", Double.valueOf(LJII.LJIJI));
                C19730q1 c19730q13 = C19700py.LIZLLL;
                if (c19730q13 != null) {
                    l2 = Long.valueOf(c19730q13.LIZ);
                }
                LIZ.LJIJJ(l2, "device_memory");
                LIZ.LJIJJLI("free_memory_avg", Double.valueOf(LJII.LJIJJ));
                LIZ.LJIJJLI("battery_thermal_avg", Double.valueOf(LJII.LJIJJLI));
                LIZ.LJIL("battery_thermal_max", Float.valueOf(LJII.LJIL));
                LIZ.LJIL("battery_thermal_min", Float.valueOf(LJII.LJJ));
                LIZ.LJIJJLI("battery_thermal_higher_percent", Double.valueOf(LJII.LJJI));
                LIZ.LJIJJLI("low_battery_percent", Double.valueOf(LJII.LJJIIJ));
                LIZ.LJIJJLI("saver_mode_percent", Double.valueOf(LJII.LJJIII));
                LIZ.LJIJJLI("low_push_bitrate_proportion", Double.valueOf(LJII.LIZJ));
                LIZ.LJIJJ(Integer.valueOf(LJII.LJ * 5), "low_push_bitrate_max_continuous_duration");
                LIZ.LJIJJLI("low_push_framerate_proportion", Double.valueOf(LJII.LJIIIIZZ));
                LIZ.LJIJJ(Integer.valueOf(LJII.LJIIJ * 5), "low_push_framerate_max_continuous_duration");
                LIZ.LJIJJLI("avg_push_rtt", Double.valueOf(LJII.LJIIJJI));
                LIZ.LJIJJ(Integer.valueOf(LJII.LJIILIIL * 5), "high_push_rtt_max_continuous_duration");
                LIZ.LJIJJLI("low_battery_proportion", Double.valueOf(LJII.LJJIIJ));
                LIZ.LJIJJ(Integer.valueOf(LJII.LJJII * 5), "high_temperature_max_continuous_duration");
                LIZ.LJIJJLI("power_save_mode_proportion", Double.valueOf(LJII.LJJIII));
                LIZ.LJIJJ(Long.valueOf(LJII.LJJIZ), "live_duration");
                LIZ.LJIL("low_live_core_network_proportion", Float.valueOf(LJII.LJJJ));
                LIZ.LJIL("avg_ping", Float.valueOf(LJII.LJIILL));
                LIZ.LJIL("high_ping_proportion", Float.valueOf(LJII.LJIILLIIL));
                LIZ.LJIJJ(Integer.valueOf(LJII.LJIILJJIL), "valid_ping_count");
                LIZ.LJJIIJZLJL();
            }
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("reportGameBroadcastFeedbackDiagnose(). cost=");
                LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
                C0NB.LJIIIZ("GameBroadcastFeedbackDiagnose", X1D.LIZIZ(LIZ2));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameDualDeviceSourceFragment pl0(int i, int i2, int i3, int i4, String str, String str2) {
        C0JW.LIZ.getClass();
        if (!C0JW.LIZLLL()) {
            return null;
        }
        StringBuilder LJ = AnonymousClass028.LJ("sourceIp = ", str, ",sourcePort = ", i, ",roomId=");
        C0EH.LIZLLL(LJ, str2, ",videoWidth = ", i2, ",videoHeight = ");
        LJ.append(i3);
        LJ.append(",version = ");
        LJ.append(i4);
        C0NB.LJIIIZ("GameDualDeviceSource", X1D.LIZIZ(LJ));
        GameDualDeviceSourceFragment gameDualDeviceSourceFragment = new GameDualDeviceSourceFragment();
        Bundle LIZLLL = C1DG.LIZLLL("video_width", i2, "video_height", i3);
        LIZLLL.putString("source_ip", str);
        LIZLLL.putInt("source_port", i);
        LIZLLL.putString("room_id", str2);
        LIZLLL.putInt("version", i4);
        gameDualDeviceSourceFragment.setArguments(LIZLLL);
        return gameDualDeviceSourceFragment;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void U0(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C43588H8u.LIZLLL(str4, "fragmentId", str5, "replayRoomId", str6, "replayTitle", str7, "businessExtra");
        InterfaceC259510d interfaceC259510d = this.LJLIL;
        if (interfaceC259510d == null) {
            interfaceC259510d = new C36801cS();
        }
        this.LJLIL = interfaceC259510d;
        interfaceC259510d.U0(context, str, str2, str3, str4, str5, str6, str7);
    }
}
