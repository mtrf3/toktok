package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidget;
import com.bytedance.android.livesdk.chatroom.widget.SwitchDefinitionTipsWidgetV2;
import com.bytedance.android.livesdk.dataChannel.AudienceLastSelectDefinitionInfo;
import com.bytedance.android.livesdk.dataChannel.AudienceResolutionBanAuto;
import com.bytedance.android.livesdk.dataChannel.AudienceResolutionDegrade;
import com.bytedance.android.livesdk.dataChannel.AudienceShowSwitchDefinitionEvent;
import com.bytedance.android.livesdk.dataChannel.BufferingEvent;
import com.bytedance.android.livesdk.dataChannel.GameLiveAbrNewResolution;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV3Setting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableCacheLastSelectDefinitionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerErrorCountSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowStallTimeInterval;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowStallWhenReachCount;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.PreviewEnterUseSurfaceView;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import defpackage.i0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.B8p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28295B8p implements InterfaceC28740BPs {
    public int LIZ;
    public final int LIZIZ = LivePlayerErrorCountSetting.INSTANCE.getValue();
    public List<C28299B8t> LIZJ = new ArrayList();
    public final /* synthetic */ LivePlayFragment LIZLLL;

    @Override // X.InterfaceC28740BPs
    public final void c() {
        LivePlayFragment livePlayFragment = this.LIZLLL;
        if (livePlayFragment.LLIIJI || livePlayFragment.LLILL.LIZ.getVisibility() != 0) {
            return;
        }
        this.LIZLLL.LJII();
    }

    @Override // X.InterfaceC28740BPs
    public final void g() {
        this.LIZLLL.l.LIZIZ();
    }

    @Override // X.InterfaceC28740BPs
    public final void j() {
        DataChannel dataChannel = this.LIZLLL.LLLIIL;
        if (dataChannel != null) {
            dataChannel.qv0(BufferingEvent.class, Boolean.FALSE);
        }
        if (C28592BKa.LIZ() <= 0 || !C28592BKa.LIZ) {
            return;
        }
        ((IHostResource) CN1.LIZ(IHostResource.class)).l60();
    }

    @Override // X.InterfaceC28740BPs
    public final void k() {
        if (PreviewEnterUseSurfaceView.INSTANCE.isEnable(this.LIZLLL.LLLZL) && (this.LIZLLL.LLJILLL instanceof CVS)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("renderViewChanged=");
            LIZ.append(true);
            B4I.LIZ("onTextureRenderDrawFrame", X1D.LIZIZ(LIZ));
            LivePlayFragment livePlayFragment = this.LIZLLL;
            if (livePlayFragment.LLIZ != null && livePlayFragment.LLIZLLLIL != null) {
                livePlayFragment.Qm();
            }
            InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(this.LIZLLL.LLLLZ);
            if (LIZIZ != null) {
                LIZIZ.LJJJJIZL(true);
            }
        }
    }

    @Override // X.InterfaceC28740BPs
    public final void n() {
        boolean z;
        boolean z2;
        C0NB.LIZIZ("LivePlayFragment", "onBufferingStart");
        ShowAudienceDefinitionSelectionSetting showAudienceDefinitionSelectionSetting = ShowAudienceDefinitionSelectionSetting.INSTANCE;
        boolean z3 = true;
        if (showAudienceDefinitionSelectionSetting.isEnable() && EnableCacheLastSelectDefinitionSetting.INSTANCE.isEnable() && LiveMode.isWatchGameLiveOrPCLive(this.LIZLLL.LJLLJ)) {
            java.util.Map<String, String> LIZJ = InterfaceC30442Bx8.LLLZ.LIZJ();
            if (LIZJ != null && LIZJ.size() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!LiveRecycleWidgetV3Setting.INSTANCE.getValue() ? System.currentTimeMillis() - SwitchDefinitionTipsWidget.LJLJLJ <= 10000 : System.currentTimeMillis() - SwitchDefinitionTipsWidgetV2.LJLJLJ <= 10000) {
                z3 = false;
            }
            boolean aK = ((IDefinitionService) CN1.LIZ(IDefinitionService.class)).aK();
            StringBuilder LIZLLL = C00F.LIZLLL("onBufferingStart(). hadManuallySelect=", z2, "; hadBeyond10Sec=", z3, "; isLowestDefinition=");
            FT5.LJ(LIZLLL, aK, LIZLLL, "LivePlayFragment");
            DataChannel dataChannel = this.LIZLLL.LLLIIL;
            if (dataChannel != null && z2 && z3 && !aK) {
                dataChannel.qv0(AudienceShowSwitchDefinitionEvent.class, Boolean.FALSE);
            }
        } else {
            java.util.Map<String, String> LIZJ2 = InterfaceC30442Bx8.LLLZ.LIZJ();
            if (LIZJ2 != null && LIZJ2.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            C10S.LIZ("tryHandleBufferingByAuto mannual ", z, "LivePlayFragment");
            if (z && showAudienceDefinitionSelectionSetting.isEnable() && EnableCacheLastSelectDefinitionSetting.INSTANCE.isEnableAutoTips() && LiveMode.isWatchGameLiveOrPCLive(this.LIZLLL.LJLLJ)) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                if (dataChannelGlobal.mv0(AudienceResolutionBanAuto.class) == null || !((Boolean) dataChannelGlobal.mv0(AudienceResolutionBanAuto.class)).booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    LivePlayFragment livePlayFragment = this.LIZLLL;
                    if (currentTimeMillis - livePlayFragment.LLLLIILL >= 1000) {
                        livePlayFragment.LLLLIILL = System.currentTimeMillis();
                        LivePlayFragment livePlayFragment2 = this.LIZLLL;
                        livePlayFragment2.getClass();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        livePlayFragment2.LLLLLJIL.add(Long.valueOf(currentTimeMillis2));
                        if (livePlayFragment2.LLLLLJIL.size() > ShowStallWhenReachCount.INSTANCE.getValue()) {
                            livePlayFragment2.LLLLLJIL.remove(0);
                        }
                        ArrayList arrayList = new ArrayList(livePlayFragment2.LLLLLJIL);
                        int i = 0;
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            if (currentTimeMillis2 - ((Long) ListProtector.get(arrayList, i2)).longValue() <= ShowStallTimeInterval.INSTANCE.getValue()) {
                                i++;
                            }
                        }
                        long j = i;
                        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.F;
                        int intValue = c48459J0d.LIZJ().intValue();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("tryHandleBufferingByAuto count: ");
                        LIZ.append(j);
                        LIZ.append(" nonAutoStallTipsCount:");
                        LIZ.append(intValue);
                        LIZ.append(" mIsStallTipsShown:");
                        C19U.LIZJ(LIZ, this.LIZLLL.LLLLIIL, LIZ, "LivePlayFragment");
                        if (j >= ShowStallWhenReachCount.INSTANCE.getValue()) {
                            C48459J0d<Long> c48459J0d2 = InterfaceC30442Bx8.G;
                            long longValue = c48459J0d2.LIZJ().longValue();
                            Long valueOf = Long.valueOf(System.currentTimeMillis());
                            Locale locale = Locale.ENGLISH;
                            if (!new SimpleDateFormat("MMdd", locale).format(new Date(valueOf.longValue())).equals(new SimpleDateFormat("MMdd", locale).format(new Date(Long.valueOf(longValue).longValue())))) {
                                c48459J0d.LIZ(0);
                            }
                            if (intValue < 3) {
                                LivePlayFragment livePlayFragment3 = this.LIZLLL;
                                if (!livePlayFragment3.LLLLIIL) {
                                    livePlayFragment3.LLLIIL.qv0(AudienceShowSwitchDefinitionEvent.class, Boolean.TRUE);
                                    this.LIZLLL.LLLLIIL = true;
                                    c48459J0d.LIZ(Integer.valueOf(intValue + 1));
                                    c48459J0d2.LIZ(Long.valueOf(System.currentTimeMillis()));
                                }
                            }
                        }
                    }
                }
            }
        }
        DataChannel dataChannel2 = this.LIZLLL.LLLIIL;
        if (dataChannel2 != null) {
            dataChannel2.qv0(BufferingEvent.class, Boolean.TRUE);
        }
        if (C28592BKa.LIZ() <= 0 || !C28592BKa.LIZ) {
            return;
        }
        ((IHostResource) CN1.LIZ(IHostResource.class)).nr(false);
    }

    @Override // X.InterfaceC28740BPs
    public final void o() {
        this.LIZLLL.LJII();
    }

    @Override // X.InterfaceC28740BPs
    public final void f() {
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("invite_issue_check", "LinkIn_Guest_onPlayerDetached");
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "liveplay_player_detached");
        C28733BPl.LJIILIIL().LIZIZ("ttlive_pullstream", hashMap);
        this.LIZLLL.T4();
        LivePlayFragment livePlayFragment = this.LIZLLL;
        livePlayFragment.LLLLLZIL = true;
        B32 b32 = livePlayFragment.LLLLLLL;
        long j = livePlayFragment.LJLIL;
        String str = livePlayFragment.LLJJIJIIJIL;
        String str2 = livePlayFragment.LJLJL;
        b32.getClass();
        if (B32.LJII) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "room_type", str);
        C05630Jz.LIZ(0, "error_code", jSONObject);
        C05630Jz.LJI(jSONObject, "error_msg", "player detach");
        C05630Jz.LJFF(jSONObject, "room_id", j);
        C05630Jz.LJI(jSONObject, "pull_url", str2);
        Pair LJIIIZ = B32.LJIIIZ();
        C05630Jz.LJI(jSONObject, "enter_from_merge", (String) LJIIIZ.first);
        C05630Jz.LJI(jSONObject, "enter_method", (String) LJIIIZ.second);
        C0K2.LJIIJJI(0, "ttlive_player_detach_when_pulling", jSONObject);
    }

    public C28295B8p(LivePlayFragment livePlayFragment) {
        this.LIZLLL = livePlayFragment;
    }

    public final void LIZ(JSONObject jSONObject) {
        String optString = jSONObject.optString("anchor_link_mic_id");
        JSONArray optJSONArray = jSONObject.optJSONArray("grids");
        if (optJSONArray == null) {
            this.LIZLLL.LLLIIL.rv0(MuteMicChannel.class, Boolean.FALSE);
        }
        int length = optJSONArray.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(optJSONArray, i);
            if ((jSONObject2 != null && !TextUtils.isEmpty(jSONObject2.optString("uid_str")) && jSONObject2.optString("uid_str").equals(optString)) || (!TextUtils.isEmpty(jSONObject2.optString("link_mic_id")) && jSONObject2.optString("link_mic_id").equals(optString))) {
                if (jSONObject2.optBoolean("mute_a", false) || jSONObject2.optInt("mute_a", 0) == 1) {
                    z = true;
                }
                this.LIZLLL.LLLIIL.rv0(MuteMicChannel.class, Boolean.valueOf(z));
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0313 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage, O] */
    @Override // X.InterfaceC28740BPs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(X.C28272B7s r26) {
        /*
            Method dump skipped, instructions count: 1427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28295B8p.d(X.B7s):void");
    }

    @Override // X.InterfaceC28740BPs
    public final void h(String str) {
        FP1.LJFF("onResolutionDegrade. newResolution=", str, "LivePlayFragment");
        this.LIZLLL.LLLIIL.rv0(AudienceResolutionDegrade.class, str);
        this.LIZLLL.yn();
    }

    @Override // X.InterfaceC28740BPs
    public final void l(String sdkKey) {
        int i;
        int i2;
        int i3;
        String str;
        FP1.LJFF("onAbrResolutionChanged. newResolution=", sdkKey, "LivePlayFragment");
        if (LiveMode.isWatchGameLiveOrPCLive(this.LIZLLL.LJLLJ)) {
            this.LIZLLL.LLLIIL.rv0(GameLiveAbrNewResolution.class, sdkKey);
            LivePlayFragment livePlayFragment = this.LIZLLL;
            livePlayFragment.getClass();
            if (!TextUtils.isEmpty(sdkKey)) {
                boolean z = !TextUtils.isEmpty(livePlayFragment.LLZZJLIL);
                C48459J0d<Long> c48459J0d = InterfaceC30442Bx8.E;
                long longValue = c48459J0d.LIZJ().longValue();
                C48459J0d<Long> c48459J0d2 = InterfaceC30442Bx8.D;
                long longValue2 = c48459J0d2.LIZJ().longValue();
                String sdkKey2 = livePlayFragment.LLZZJLIL;
                o.LJIIIZ(sdkKey2, "sdkKey");
                java.util.Map<String, Integer> map = B96.LIZ;
                Integer num = (Integer) ((LinkedHashMap) map).get(sdkKey2);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                o.LJIIIZ(sdkKey, "sdkKey");
                Integer num2 = (Integer) ((LinkedHashMap) map).get(sdkKey);
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = 0;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("showAbrSwitchTips, mLastAbrResolution = ");
                C0EH.LIZLLL(LIZ, livePlayFragment.LLZZJLIL, ", lastLevel = ", i, ", newLevel = ");
                b1.LJ(LIZ, i2, LIZ, "LivePlayFragment");
                if (i > i2) {
                    if (System.currentTimeMillis() - longValue > 86400000 && z) {
                        C30868C9o.LIZJ(R.string.ovk);
                        c48459J0d.LIZ(Long.valueOf(System.currentTimeMillis()));
                        i3 = 1;
                    }
                    i3 = 0;
                } else {
                    if (i < i2 && System.currentTimeMillis() - longValue2 > 86400000 && z) {
                        C30868C9o.LIZJ(R.string.ovl);
                        c48459J0d2.LIZ(Long.valueOf(System.currentTimeMillis()));
                        i3 = 1;
                    }
                    i3 = 0;
                }
                String str2 = livePlayFragment.LLZZJLIL;
                String valueOf = String.valueOf(livePlayFragment.LLLIIL.kv0(BCN.class));
                String Tl = livePlayFragment.Tl();
                int i4 = livePlayFragment.LLFFF;
                String str3 = CardStruct.IStatusCode.DEFAULT;
                if (i4 == 1) {
                    str = CardStruct.IStatusCode.DEFAULT;
                } else {
                    str = "1";
                }
                try {
                    if (livePlayFragment.LLLIIL.kv0(AudienceLastSelectDefinitionInfo.class) != null) {
                        String str4 = (String) ((java.util.Map) livePlayFragment.LLLIIL.kv0(AudienceLastSelectDefinitionInfo.class)).get("start_time");
                        if (TextUtils.isEmpty(str4)) {
                            str4 = String.valueOf(System.currentTimeMillis());
                        }
                        str3 = String.valueOf((System.currentTimeMillis() - CastLongProtector.parseLong(str4)) / 1000);
                    }
                } catch (Exception e) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("reportAbrSwitchChanged. catch exception= ");
                    LIZ2.append(e.getMessage());
                    C0NB.LJIIIZ("LivePlayFragment", X1D.LIZIZ(LIZ2));
                }
                BZI LIZ3 = C28787BRn.LIZ("livesdk_live_definition_auto_selection_success");
                LIZ3.LJIJJ(String.valueOf(livePlayFragment.LJLJJI), "anchor_id");
                LIZ3.LJIJJ(valueOf, "room_id");
                LIZ3.LJIJJ(str, "room_orientation");
                LIZ3.LJIJJ(str2, "current_definition");
                LIZ3.LJIJJ(str3, "duration");
                C78895Uxn.LIZIZ(LIZ3, sdkKey, "previous_definition", i3, "if_notification");
                LIZ3.LJIJJ(String.valueOf(((C29374Bfu) TTL.LIZJ(LIZ3, Tl, "live_type")).getCurrentUserId()), "user_id");
                LIZ3.LJIJ(Tl);
                LIZ3.LJJIIJZLJL();
                livePlayFragment.LLZZJLIL = sdkKey;
            }
        }
        this.LIZLLL.yn();
    }

    @Override // X.InterfaceC28740BPs
    public final void onError(Exception exc) {
        String substring = android.util.Log.getStackTraceString(exc).substring(0, 200);
        LivePlayFragment livePlayFragment = this.LIZLLL;
        livePlayFragment.LLLLLLL.LJIIJ(105, substring, livePlayFragment.LLJJIJIIJIL, livePlayFragment.LJLIL, livePlayFragment.LJLJL);
        LivePlayFragment livePlayFragment2 = this.LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        livePlayFragment2.qm(204L, -1L, KMP.LJFF(LIZ, "onError, ", exc, LIZ));
        this.LIZLLL.sm("pull_stream_error");
        Event event = new Event("live_play_enter_room_fail", 1035, EnumC28203B5b.SdkInterfaceCall);
        event.LIZIZ("player error, there is some problem while starting player.");
        B57.LIZ.LIZ().LIZIZ(event);
        B5S.LIZLLL(this.LIZLLL.LLLZL, B5T.LIVE_PLAYER_ERROR, "slide_next_room");
        this.LIZLLL.Ml(B5U.PLAYER_ERROR);
        EnumC12790ep enumC12790ep = EnumC12790ep.StartLivePlay;
        HashMap hashMap = new HashMap();
        hashMap.put("error", "ttplayer init failed");
        C12800eq.LJ(enumC12790ep, hashMap);
        EnumC12790ep enumC12790ep2 = EnumC12790ep.ScrollWatchLivePlay;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("error", "ttplayer init failed");
        C12800eq.LJ(enumC12790ep2, hashMap2);
        this.LIZ = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC28740BPs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r21, long r23) {
        /*
            Method dump skipped, instructions count: 1159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28295B8p.e(long, long):void");
    }

    @Override // X.InterfaceC28740BPs
    public final void i(int i, String str) {
        java.util.Map map = (java.util.Map) GsonProtectorUtils.fromJson(C09650Zl.LIZJ, str, new C28298B8s().getType());
        if (map.containsKey("error_code")) {
            String str2 = (String) map.get("error_code");
            if (str2 != null) {
                B32 b32 = this.LIZLLL.LLLLLLL;
                int intValue = CastIntegerProtector.valueOf(str2).intValue();
                LivePlayFragment livePlayFragment = this.LIZLLL;
                long j = livePlayFragment.LJLIL;
                String str3 = livePlayFragment.LLJJIJIIJIL;
                String str4 = livePlayFragment.LJLJL;
                if (B32.LJII) {
                    b32.getClass();
                } else {
                    int i2 = b32.LIZLLL;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            b32.LJIIJ(intValue, str, str3, j, str4);
                        } else if (b32.LJ == null) {
                            b32.LJ = new C28250B6w(intValue, str, str3, j, str4);
                        }
                    }
                }
                BJL bjl = (BJL) DataChannelGlobal.LJLJJI.mv0(C29054Bak.class);
                if (bjl != null) {
                    bjl.LJJIIZ = this.LIZLLL.LLLZL.mLogData.fromPortalId;
                }
                C28657BMn.LIZIZ(i0.LJFF("onPlayerError, ", str), 209L, CastIntegerProtector.valueOf(str2).intValue(), 0L, 0L, "", C78847Ux1.LJJJI(this.LIZLLL.LLLZL), this.LIZLLL.LLLIIL);
                ((ArrayList) this.LIZLLL.LLJLILLLLZIIL).add(str2);
                B34 b34 = this.LIZLLL.e;
                if (b34 != null) {
                    b34.LIZLLL = true;
                }
            }
            ((ArrayList) this.LIZJ).add(new C28299B8t(i));
        }
        int i3 = this.LIZ + 1;
        this.LIZ = i3;
        if (i3 > this.LIZIZ) {
            Event event = new Event("live_play_enter_room_fail", 33809, EnumC28203B5b.SdkInterfaceCall);
            event.LIZIZ(C38393F4z.LJFF(this.LIZJ));
            this.LIZ = 0;
            this.LIZJ = new ArrayList();
            B57.LIZ.LIZ().LIZIZ(event);
        }
        B5C b5c = B49.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error_play_player_error errorCode = ");
        LIZ.append(i);
        String LIZIZ = X1D.LIZIZ(LIZ);
        b5c.getClass();
        o.LJIIIZ(LIZIZ, "<set-?>");
        b5c.LIZIZ = LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Player call back error when live errorMsg = ");
        LIZ2.append(str);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(LIZIZ2, "<set-?>");
        b5c.LIZJ = LIZIZ2;
        C28184B4i c28184B4i = this.LIZLLL.LLLLLLLLL;
        if (c28184B4i != null) {
            c28184B4i.LJIIL(b5c);
        }
        this.LIZLLL.l.LJI(Integer.valueOf(i), str);
    }

    @Override // X.InterfaceC28740BPs
    public final void m(long j, long j2) {
        this.LIZLLL.l.LJIJJLI(j, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    @Override // X.InterfaceC28740BPs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onVideoSizeChanged(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28295B8p.onVideoSizeChanged(int, int):void");
    }
}
