package com.bytedance.android.livesdk.quiz;

import X.AnonymousClass149;
import X.B35;
import X.B57;
import X.B83;
import X.BQH;
import X.BZI;
import X.C01R;
import X.C06490Nh;
import X.C09650Zl;
import X.C0K2;
import X.C0NB;
import X.C113554cx;
import X.C16880lQ;
import X.C199097rd;
import X.C28302B8w;
import X.C28787BRn;
import X.C29374Bfu;
import X.C29927Bop;
import X.C31012CFc;
import X.C65814PsI;
import X.C68322mC;
import X.C72818Shy;
import X.C73933Szx;
import X.C73969T1h;
import X.C78528Urs;
import X.CN1;
import X.EnumC31509CYf;
import X.InterfaceC29856Bng;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.JF1;
import X.ORS;
import X.ORZ;
import X.T16;
import X.X1D;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.IHybridPerformanceService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.activity.quiz.model.QuizUserIdentityInfo;
import com.bytedance.android.livesdk.dataChannel.MultiWindowModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizAudioFixSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizCardValidateSetting;
import com.bytedance.android.livesdk.model.message.ActivityQuizCardMessage;
import com.bytedance.android.livesdk.model.message.ActivityQuizCardMessageSEIWrapper;
import com.bytedance.android.livesdk.model.message.ActivityQuizUserIdentityMessage;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.play.core.appupdate.u;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes6.dex */
public final class ActQuizWidget extends LiveWidget implements OnMessageListener, InterfaceC72822Si2 {
    public Room LJLIL;
    public ActivityQuizUserIdentityMessage LJLJJL;
    public long LJLJL;
    public boolean LJLJLJ;
    public String LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public final List<String> LJLILLLLZI = new ArrayList();
    public final List<String> LJLJI = new ArrayList();
    public final List<String> LJLJJI = new ArrayList();
    public final Handler LJLJJLL = new Handler(C16880lQ.LLJJJJ());
    public boolean LJLJLLL = true;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLZ() {
        Context context = this.context;
        if (context != null) {
            ((IBrowserService) CN1.LIZ(IBrowserService.class)).zb(context, LJZI("EOYQuizCard"));
            ((IBrowserService) CN1.LIZ(IBrowserService.class)).zb(context, LJZI("EOYQuizIdentity"));
            ((IBrowserService) CN1.LIZ(IBrowserService.class)).zb(context, LJZI("EOYQuizResult"));
            C0NB.LJIIIZ("EOYQuiz", "clear storages");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C0NB.LJIIIZ("EOYQuiz", "quiz widget onDestroy isSuppressed=false");
        AnonymousClass149.LIZ.LJFF(false);
        this.LJLJJLL.removeCallbacksAndMessages(null);
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        LJLZ();
        ((IHybridPerformanceService) CN1.LIZ(IHybridPerformanceService.class)).xY();
        C72818Shy.LJII("quiz_identity_status_change", this);
        C72818Shy.LJII("quiz_page_status_open", this);
        C72818Shy.LJII("quiz_page_status_close", this);
        this.LJLJLLL = false;
        if (!o.LJ(this.LJLLI, this.LJLL)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = this.LJLLI;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("primary_id", str);
            linkedHashMap.put("reason", "leave_room");
            String str3 = this.LJLLILLLL;
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("card_from", str3);
            C0K2.LJII(0, "ttlive_eoy_quiz_discard_card_monitor", C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap));
            BZI LIZ = C28787BRn.LIZ("livesdk_eoy_quiz_discard_card_monitor");
            LIZ.LJIILLIIL(this.dataChannel);
            String str4 = this.LJLLI;
            if (str4 == null) {
                str4 = "";
            }
            LIZ.LJIJJ(str4, "primary_id");
            LIZ.LJIJJ("leave_room", "reason");
            String str5 = this.LJLLILLLL;
            if (str5 != null) {
                str2 = str5;
            }
            LIZ.LJIJJ(str2, "card_from");
            LIZ.LJJIIJZLJL();
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Long l;
        super.onCreate();
        this.LJLJLLL = true;
        this.LJLIL = (Room) this.dataChannel.kv0(RoomChannel.class);
        this.dataChannel.kv0(RoomUserChannel.class);
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.kv0(C29927Bop.class);
        this.dataChannel.lv0(this, MultiWindowModeChannel.class, BQH.LJLIL);
        LJLZ();
        IHybridPerformanceService iHybridPerformanceService = (IHybridPerformanceService) CN1.LIZ(IHybridPerformanceService.class);
        if (iHybridPerformanceService != null) {
            iHybridPerformanceService.Eu0();
            iHybridPerformanceService.OT(new AqS171S0100000_5(this, 480));
        }
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.ACTIVITY_QUIZ_CARD_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.ACTIVITY_QUIZ_USER_IDENTITY_MESSAGE.getIntType(), this);
        }
        C72818Shy.LIZLLL("quiz_identity_status_change", this);
        C72818Shy.LIZLLL("quiz_page_status_open", this);
        C72818Shy.LIZLLL("quiz_page_status_close", this);
        C65814PsI.LIZ().getClass();
        ActQuizApi actQuizApi = (ActQuizApi) C65814PsI.LIZJ(ActQuizApi.class);
        Room room = this.LJLIL;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        ((InterfaceC29856Bng) actQuizApi.queryUserIdentity(String.valueOf(l)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LJ(this))).LIZJ(new AfS57S0100000_5(this, 163), C28302B8w.LJLIL);
    }

    public static String LJZ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            String str2 = (String) ORZ.LLFII(s.LJLJJL(str, new String[]{"-"}, 0, 6));
            if (str2 == null) {
                return "";
            }
            return str2;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String LJZI(String str) {
        Long l;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        Room room = this.LJLIL;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ.append(l);
        LIZ.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        return X1D.LIZIZ(LIZ);
    }

    public final void LL(ActivityQuizUserIdentityMessage activityQuizUserIdentityMessage) {
        int i;
        Long l;
        int i2;
        ActivityQuizUserIdentityMessage activityQuizUserIdentityMessage2 = this.LJLJJL;
        if (activityQuizUserIdentityMessage2 != null && o.LJ(activityQuizUserIdentityMessage2.primaryId, activityQuizUserIdentityMessage.primaryId) && activityQuizUserIdentityMessage.version <= activityQuizUserIdentityMessage2.version) {
            return;
        }
        this.LJLJJL = activityQuizUserIdentityMessage;
        if (o.LJ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getServerDeviceId(), activityQuizUserIdentityMessage.retainDeviceId)) {
            i = 1;
        } else {
            i = 2;
        }
        IWatchLiveService iWatchLiveService = (IWatchLiveService) CN1.LIZ(IWatchLiveService.class);
        Room room = this.LJLIL;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        iWatchLiveService.Il0(i, l);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set user status by identity status=");
        LIZ.append(i);
        C0NB.LJIIIZ("EOYQuiz", X1D.LIZIZ(LIZ));
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).qk0(this.context, GsonProtectorUtils.toJson(C09650Zl.LIZIZ, activityQuizUserIdentityMessage), LJZI("EOYQuizIdentity"));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("storage identity msg pk:");
        LIZ2.append(activityQuizUserIdentityMessage.primaryId);
        C0NB.LJIIIZ("EOYQuiz", X1D.LIZIZ(LIZ2));
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        QuizUserIdentityInfo quizUserIdentityInfo = activityQuizUserIdentityMessage.body;
        if (quizUserIdentityInfo != null) {
            i2 = quizUserIdentityInfo.userStatus;
        } else {
            i2 = 0;
        }
        jSONObject.put("user_status", i2);
        jSONObject.put("sender", "client");
        C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "quiz_identity_status_change");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.bytedance.android.livesdk.model.message.ActivityQuizCardMessage
            java.lang.String r8 = "message"
            if (r0 == 0) goto L24
            java.util.List<java.lang.String> r1 = r11.LJLILLLLZI
            r7 = r12
            com.bytedance.android.livesdk.model.message.ActivityQuizCardMessage r7 = (com.bytedance.android.livesdk.model.message.ActivityQuizCardMessage) r7
            java.lang.String r0 = r7.primaryId
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L16
            return
        L16:
            java.lang.String r1 = "card"
            java.lang.String r0 = r7.primaryId
            r11.LLFF(r1, r0, r8)
            boolean r0 = r11.LLF(r7, r8)
            if (r0 == 0) goto L35
            return
        L24:
            boolean r0 = r12 instanceof com.bytedance.android.livesdk.model.message.ActivityQuizUserIdentityMessage
            if (r0 == 0) goto L8e
            com.bytedance.android.livesdk.model.message.ActivityQuizUserIdentityMessage r12 = (com.bytedance.android.livesdk.model.message.ActivityQuizUserIdentityMessage) r12
            java.lang.String r1 = r12.primaryId
            java.lang.String r0 = "identity"
            r11.LLFF(r0, r1, r8)
            r11.LL(r12)
            goto L8e
        L35:
            java.lang.Class<com.bytedance.android.live.livepullstream.api.IPullStreamService> r0 = com.bytedance.android.live.livepullstream.api.IPullStreamService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.livepullstream.api.IPullStreamService r0 = (com.bytedance.android.live.livepullstream.api.IPullStreamService) r0
            X.BQ9 r0 = r0.Tx()
            X.BPq r0 = r0.LIZIZ
            r9 = 0
            if (r0 == 0) goto L4f
            long r3 = r0.LJJJJLL()
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 > 0) goto L9a
        L4f:
            com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSEIDelaySetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSEIDelaySetting.INSTANCE
            long r3 = r0.getValue()
        L55:
            float r1 = (float) r3
            float r0 = r7.seiDelayMultiple
            float r1 = r1 * r0
            long r5 = (long) r1
            long r0 = r7.seiDelayBias
            long r5 = r5 + r0
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "receive card msg pk is: "
            r2.append(r0)
            java.lang.String r1 = r7.primaryId
            java.lang.String r0 = " seiDelay: "
            defpackage.b0.LJ(r2, r1, r0, r3)
            java.lang.String r0 = "delayTimeMs: "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            java.lang.String r0 = "EOYQuiz"
            X.C0NB.LJIIIZ(r0, r1)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L8f
            android.os.Handler r2 = r11.LJLJJLL
            Y.ARunnableS24S0200000_5 r1 = new Y.ARunnableS24S0200000_5
            r0 = 31
            r1.<init>(r11, r12, r0)
            r2.postDelayed(r1, r5)
        L8e:
            return
        L8f:
            com.bytedance.android.livesdk.model.message.ActivityQuizCardMessageSEIWrapper r0 = new com.bytedance.android.livesdk.model.message.ActivityQuizCardMessageSEIWrapper
            r0.<init>()
            r0.quizCardMessage = r7
            r11.LJZL(r0, r8)
            goto L8e
        L9a:
            com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSEIDelayMaxTimeSetting r5 = com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSEIDelayMaxTimeSetting.INSTANCE
            long r1 = r5.getValue()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L55
            long r1 = r5.getValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L55
            long r3 = r5.getValue()
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.quiz.ActQuizWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        InterfaceC78280Uns interfaceC78280Uns;
        String str2 = c199097rd.LJLIL;
        int hashCode = str2.hashCode();
        if (hashCode != -1080414863) {
            if (hashCode != -73738234) {
                if (hashCode != 855686065 || !str2.equals("quiz_page_status_close")) {
                    return;
                }
                C0NB.LJIIIZ("EOYQuiz", "receive js event quiz_page_status_close isSuppressed=false");
                AnonymousClass149.LIZ.LJFF(false);
                return;
            }
            if (!str2.equals("quiz_identity_status_change")) {
                return;
            }
            InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
            Long l = null;
            if (interfaceC78280Uns2 != null) {
                str = u.LJJIJIL(interfaceC78280Uns2, "sender", "");
            } else {
                str = null;
            }
            if (o.LJ("client", str) || (interfaceC78280Uns = c199097rd.LJLILLLLZI) == null) {
                return;
            }
            int i = interfaceC78280Uns.getInt("user_status");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("set user status by event status=");
            LIZ.append(i);
            C0NB.LJIIIZ("EOYQuiz", X1D.LIZIZ(LIZ));
            IWatchLiveService iWatchLiveService = (IWatchLiveService) CN1.LIZ(IWatchLiveService.class);
            Room room = this.LJLIL;
            if (room != null) {
                l = Long.valueOf(room.getId());
            }
            iWatchLiveService.Il0(i, l);
            return;
        }
        if (!str2.equals("quiz_page_status_open") || ((IBrowserService) CN1.LIZ(IBrowserService.class)).Wn(this.context, LJZI("EOYQuizCard")) == null) {
            return;
        }
        C0NB.LJIIIZ("EOYQuiz", "receive js event quiz_page_status_open isSuppressed=true");
        AnonymousClass149.LIZ.LJFF(true);
    }

    /* JADX WARN: Type inference failed for: r0v48, types: [X.B35, T] */
    public final void LJZL(ActivityQuizCardMessageSEIWrapper activityQuizCardMessageSEIWrapper, String str) {
        try {
            ActivityQuizCardMessage activityQuizCardMessage = activityQuizCardMessageSEIWrapper.quizCardMessage;
            if (activityQuizCardMessage != null) {
                String str2 = activityQuizCardMessage.primaryId;
                if (((ArrayList) this.LJLILLLLZI).contains(str2)) {
                    return;
                }
                ((ArrayList) this.LJLILLLLZI).add(str2);
                if (((ArrayList) this.LJLILLLLZI).size() > 1024) {
                    ORS.LJJLJ(this.LJLILLLLZI);
                }
                this.LJLJL = activityQuizCardMessage.timestamp;
                ((IBrowserService) CN1.LIZ(IBrowserService.class)).qk0(this.context, C09650Zl.LIZIZ.LJIILL(activityQuizCardMessageSEIWrapper), LJZI("EOYQuizCard"));
                ((IBrowserService) CN1.LIZ(IBrowserService.class)).Yd0().LIZ();
                AnonymousClass149.LIZ.LIZIZ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("storage card msg pk:");
                LIZ.append(activityQuizCardMessage.primaryId);
                C0NB.LJIIIZ("EOYQuiz", X1D.LIZIZ(LIZ));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("primary_id", activityQuizCardMessage.primaryId);
                C0K2.LJII(0, "ttlive_eoy_quiz_open_card_monitor", C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap));
                BZI LIZ2 = C28787BRn.LIZ("livesdk_eoy_quiz_open_card_monitor");
                LIZ2.LJIILLIIL(this.dataChannel);
                LIZ2.LJIJJ(activityQuizCardMessage.primaryId, "primary_id");
                LIZ2.LJIJJ(LJZ(activityQuizCardMessage.primaryId), "card_type");
                LIZ2.LJIJJ(str, "card_from");
                LIZ2.LJJIIJZLJL();
                this.LJLL = activityQuizCardMessage.primaryId;
                C68322mC c68322mC = new C68322mC();
                if (LiveQuizAudioFixSetting.INSTANCE.getValue()) {
                    ?? LIZLLL = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Wp().LIZLLL(B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag);
                    c68322mC.element = LIZLLL;
                    if (LIZLLL != 0) {
                        LIZLLL.saveAudioStatus();
                    }
                    B35 b35 = (B35) c68322mC.element;
                    if (b35 != null) {
                        b35.setAudioRespondDisableForQuiz(true);
                    }
                }
                IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
                Context context = this.context;
                o.LJIIIIZZ(context, "context");
                iHybridContainerService.Vs0(context, activityQuizCardMessage.schema, new AqS136S0200000_5(this, (ActQuizWidget) c68322mC, (C68322mC<B35>) 11));
            }
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("handle card error: ");
            LIZ3.append(e);
            C0NB.LJIIIZ("EOYQuiz", X1D.LIZIZ(LIZ3));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("event_id", "handle_card_exception");
            linkedHashMap2.put("msg", e.toString());
            C0K2.LJII(1, "ttlive_eoy_quiz_exp_monitor", C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap2));
        }
    }

    public final boolean LLF(ActivityQuizCardMessage activityQuizCardMessage, String str) {
        String str2;
        if (LiveQuizCardValidateSetting.INSTANCE.getValue()) {
            if (activityQuizCardMessage == null) {
                return true;
            }
            if (activityQuizCardMessage.timestamp < this.LJLJL) {
                if (!((ArrayList) this.LJLJI).contains(activityQuizCardMessage.primaryId)) {
                    ((ArrayList) this.LJLJI).add(activityQuizCardMessage.primaryId);
                    if (((ArrayList) this.LJLJI).size() > 1024) {
                        ORS.LJJLJ(this.LJLJI);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("primary_id", activityQuizCardMessage.primaryId);
                    linkedHashMap.put("reason", "old_timestamp");
                    linkedHashMap.put("card_from", str);
                    C0K2.LJII(0, "ttlive_eoy_quiz_discard_card_monitor", C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap));
                    BZI LIZ = C28787BRn.LIZ("livesdk_eoy_quiz_discard_card_monitor");
                    LIZ.LJIILLIIL(this.dataChannel);
                    LIZ.LJIJJ(activityQuizCardMessage.primaryId, "primary_id");
                    C06490Nh.LIZLLL(LIZ, "old_timestamp", "reason", str, "card_from");
                }
            } else if (activityQuizCardMessage.expiredTime > 0 && C31012CFc.LIZJ() > activityQuizCardMessage.expiredTime) {
                if (!((ArrayList) this.LJLJI).contains(activityQuizCardMessage.primaryId)) {
                    ((ArrayList) this.LJLJI).add(activityQuizCardMessage.primaryId);
                    if (((ArrayList) this.LJLJI).size() > 1024) {
                        ORS.LJJLJ(this.LJLJI);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("primary_id", activityQuizCardMessage.primaryId);
                    linkedHashMap2.put("reason", "expired_time");
                    linkedHashMap2.put("card_from", str);
                    C0K2.LJII(0, "ttlive_eoy_quiz_discard_card_monitor", C113554cx.LJJLIIIJLLLLLLLZ(linkedHashMap2));
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_eoy_quiz_discard_card_monitor");
                    LIZ2.LJIILLIIL(this.dataChannel);
                    LIZ2.LJIJJ(activityQuizCardMessage.primaryId, "primary_id");
                    C06490Nh.LIZLLL(LIZ2, "expired_time", "reason", str, "card_from");
                }
            }
            return true;
        }
        if (activityQuizCardMessage == null) {
            str2 = null;
            this.LJLLI = str2;
            this.LJLLILLLL = str;
            return false;
        }
        str2 = activityQuizCardMessage.primaryId;
        this.LJLLI = str2;
        this.LJLLILLLL = str;
        return false;
    }

    public final void LLFF(String str, String str2, String str3) {
        if (((ArrayList) this.LJLJJI).contains(str2)) {
            return;
        }
        ((ArrayList) this.LJLJJI).add(str2);
        if (((ArrayList) this.LJLJJI).size() > 1024) {
            ORS.LJJLJ(this.LJLJJI);
        }
        LinkedHashMap LIZIZ = JF1.LIZIZ("primary_id", str2, "card_from", str3);
        LIZIZ.put("card_type", str);
        C0K2.LJII(0, "ttlive_eoy_quiz_receive_msg_monitor", C113554cx.LJJLIIIJLLLLLLLZ(LIZIZ));
        if (o.LJ(str, "card")) {
            BZI LIZ = C28787BRn.LIZ("livesdk_eoy_quiz_receive_card_monitor");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJIJJ(str2, "primary_id");
            LIZ.LJIJJ(str3, "card_from");
            LIZ.LJIJJ(LJZ(str2), "card_type");
            LIZ.LJJIIJZLJL();
            return;
        }
        if (!o.LJ(str, "identity")) {
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_eoy_quiz_receive_identity_monitor");
        LIZ2.LJIILLIIL(this.dataChannel);
        C06490Nh.LIZLLL(LIZ2, str2, "primary_id", str3, "card_from");
    }
}
