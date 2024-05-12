package com.bytedance.android.livesdk.broadcast;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.B4U;
import X.B83;
import X.BZI;
import X.C03880Dg;
import X.C04330Ez;
import X.C0H1;
import X.C0NB;
import X.C0TT;
import X.C0TU;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C199097rd;
import X.C1S;
import X.C1T;
import X.C1U;
import X.C1X;
import X.C23010vJ;
import X.C28509BGv;
import X.C28787BRn;
import X.C29044Baa;
import X.C29046Bac;
import X.C29066Baw;
import X.C29108Bbc;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29689Bkz;
import X.C29S;
import X.C30922CBq;
import X.C31023CFn;
import X.C32537Cpp;
import X.C39202Fa2;
import X.C3C5;
import X.C47071t1;
import X.C4T;
import X.C65300Pk0;
import X.C72818Shy;
import X.C76800UCe;
import X.C78598Ut0;
import X.C7N;
import X.C90903hW;
import X.CB0;
import X.CN1;
import X.CXJ;
import X.EnumC29309Ber;
import X.I9A;
import X.InterfaceC30043Bqh;
import X.InterfaceC40159FpT;
import X.InterfaceC60761Nsz;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.T16;
import Y.ACListenerS25S0100000_5;
import Y.AfS54S0200000_5;
import Y.IDcS170S0100000_5;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.AnchorTechViewPagerDialog;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.CaptchaCheckFailedChannel;
import com.bytedance.android.livesdk.dataChannel.PerceptionDialogChannel;
import com.bytedance.android.livesdk.dataChannel.PunishInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMemoryOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveOverdrawOptimizeSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS187S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class LiveBroadcastEndFragment extends BaseFragment implements InterfaceC30043Bqh, InterfaceC40159FpT, InterfaceC72822Si2 {
    public Room LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJJLL;
    public PerceptionDialogInfo LJLJL;
    public PunishEventInfo LJLJLJ;
    public Integer LJLJLLL;
    public Integer LJLL;
    public C1U LJLLI;
    public String LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();
    public final long LJLLILLLL = System.currentTimeMillis();

    @Override // X.InterfaceC40159FpT
    public final void LLJIJIL() {
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.NV7
    public final void refresh() {
    }

    public LiveBroadcastEndFragment() {
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
        if (valueOf != null) {
            valueOf.longValue();
            C1S.LIZ = valueOf.longValue();
        }
    }

    @Override // X.InterfaceC40159FpT
    public final void close() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Context context;
        C1U c1u;
        Application application;
        C1T c1t;
        LiveMode liveMode;
        super.onDestroy();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.tv0(PerceptionDialogChannel.class, new PerceptionDialogInfo());
        dataChannelGlobal.tv0(PunishInfoChannel.class, new PunishEventInfo());
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("live_end_duration")) {
            BZI LIZ = C28787BRn.LIZ("live_end_duration");
            LIZ.LJIIZILJ();
            LIZ.LJIIL("video_type");
            LIZ.LJIIJJI("live_detail");
            LIZ.LJIJJ(String.valueOf(this.LJLJI), "duration");
            LIZ.LJJIIJZLJL();
        }
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("LiveBroadcastEndFragmentNew", "unRegisterXBridge");
        }
        C72818Shy.LJII("live_open_onboaring_tips", this);
        if (((IGameService) CN1.LIZ(IGameService.class)).rH()) {
            Room room = this.LJLIL;
            if (room != null) {
                liveMode = room.getStreamType();
            } else {
                liveMode = null;
            }
            if (liveMode == LiveMode.SCREEN_RECORD) {
                C72818Shy.LJII("screen_anchor_diagnose", this);
            }
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            context = C16880lQ.LLLLLILLIL(mo49getActivity);
        } else {
            context = null;
        }
        if ((context instanceof Application) && (application = (Application) context) != null) {
            C1U c1u2 = this.LJLLI;
            if (c1u2 != null) {
                c1t = c1u2.LIZJ;
            } else {
                c1t = null;
            }
            application.unregisterActivityLifecycleCallbacks(c1t);
        }
        Long l = -1L;
        if (l != null) {
            l.longValue();
            C1S.LIZ = l.longValue();
        }
        Long l2 = -1L;
        if (l2 != null) {
            l2.longValue();
            C1S.LIZIZ = l2.longValue();
        }
        if (LiveMemoryOptSetting.INSTANCE.enableMemoryOpt() && (c1u = this.LJLLI) != null) {
            synchronized (c1u.LIZ) {
                c1u.LIZIZ.clear();
            }
        }
        LiveMonitorSampleSetting.INSTANCE.release();
        C31023CFn.LIZJ(true);
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            C29689Bkz.LIZ.getClass();
            HandlerThread handlerThread = C29689Bkz.LIZJ;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            C29689Bkz.LIZJ = null;
            C29689Bkz.LIZLLL = null;
            LivePerformanceManager LIZ2 = B4U.LIZ();
            HandlerThread handlerThread2 = LIZ2.LJLLL;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
            }
            LIZ2.LJLLL = null;
            LIZ2.LJLLLLLL = null;
            C39202Fa2.LIZ.LIZLLL();
        }
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).UM();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJLJI = (SystemClock.elapsedRealtime() - this.LJLILLLLZI) + this.LJLJI;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJJLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            InterfaceC60761Nsz kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView();
            if (kitView != null) {
                kitView.onHide();
            }
            C78598Ut0.LJIJI(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, "container_disappear", new JSONObject());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L9;
     */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r3 = this;
            super.onResume()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.LJLILLLLZI = r0
            X.NtS r2 = r3.LJLJJLL
            if (r2 == 0) goto L31
            X.Nsz r0 = r2.getKitView()
            r1 = 0
            if (r0 == 0) goto L1b
            r0.onShow()
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L27
        L1b:
        L1c:
            X.NtS r0 = r3.LJLJJLL
            if (r0 == 0) goto L24
            com.bytedance.hybrid.spark.SparkContext r1 = r0.getSparkContext()
        L24:
            X.C60748Nsm.LIZJ(r1)
        L27:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "container_appear"
            X.C78598Ut0.LJIJI(r2, r0, r1)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.LiveBroadcastEndFragment.onResume():void");
    }

    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.bytedance.android.livesdkapi.depend.model.live.Room, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Boolean bool;
        ?? r1;
        Long l;
        Long l2;
        Context context;
        Application application;
        User owner;
        LiveMode liveMode;
        Window window;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) dataChannelGlobal.mv0(C4T.class);
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(0);
        }
        List list = (List) dataChannelGlobal.mv0(C29066Baw.class);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C1X) it.next()).LIZ(0);
            }
        }
        super.onCreate(bundle);
        EnumC29309Ber.END.config();
        Bundle arguments = getArguments();
        C1T c1t = null;
        if (arguments != null) {
            bool = Boolean.valueOf(arguments.getBoolean("is_one_tap_go_live", false));
        } else {
            bool = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            this.LJLJLLL = Integer.valueOf(arguments2.getInt("live_end_error_code", 0));
            this.LJLL = Integer.valueOf(arguments2.getInt("live_end_livecore_error_code", 0));
            arguments2.getInt("end_room_reason", 0);
        }
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LJLJJI;
        this.LJLJL = (PerceptionDialogInfo) dataChannelGlobal2.mv0(PerceptionDialogChannel.class);
        this.LJLJLJ = (PunishEventInfo) dataChannelGlobal2.mv0(PunishInfoChannel.class);
        if (o.LJ(bool, Boolean.TRUE)) {
            r1 = (Room) dataChannelGlobal2.mv0(C29108Bbc.class);
        } else {
            r1 = (Room) dataChannelGlobal2.mv0(C29044Baa.class);
        }
        this.LJLIL = r1;
        ((C32537Cpp) dataChannelGlobal2.gv0(C29046Bac.class)).LIZ = r1;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(18);
        }
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("LiveBroadcastEndFragmentNew", "registerXBridge");
        }
        C72818Shy.LIZLLL("live_open_onboaring_tips", this);
        if (((IGameService) CN1.LIZ(IGameService.class)).rH()) {
            Room room = this.LJLIL;
            if (room != null) {
                liveMode = room.getStreamType();
            } else {
                liveMode = null;
            }
            if (liveMode == LiveMode.SCREEN_RECORD) {
                C72818Shy.LIZLLL("screen_anchor_diagnose", this);
            }
        }
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("user_id", Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        Room room2 = this.LJLIL;
        if (room2 != null) {
            l = Long.valueOf(room2.getId());
        } else {
            l = null;
        }
        oszArr[1] = new OSZ("room_id", l);
        Room room3 = this.LJLIL;
        if (room3 != null && (owner = room3.getOwner()) != null) {
            l2 = Long.valueOf(owner.getId());
        } else {
            l2 = null;
        }
        oszArr[2] = new OSZ("anchor_id", l2);
        Map<? extends String, ? extends Object> LJJL = C113554cx.LJJL(oszArr);
        Map<String, Object> map = C1S.LIZJ;
        ((LinkedHashMap) map).clear();
        map.putAll(LJJL);
        this.LJLLI = new C1U();
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            context = C16880lQ.LLLLLILLIL(mo49getActivity2);
        } else {
            context = null;
        }
        if ((context instanceof Application) && (application = (Application) context) != null) {
            C1U c1u = this.LJLLI;
            if (c1u != null) {
                c1t = c1u.LIZJ;
            }
            application.registerActivityLifecycleCallbacks(c1t);
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        FragmentManager supportFragmentManager;
        String str2 = c199097rd.LJLIL;
        if (o.LJ(str2, "live_open_onboaring_tips")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            Activity activity = null;
            if (interfaceC78280Uns != null) {
                str = u.LJJIJIL(interfaceC78280Uns, "enter_from", "");
            } else {
                str = null;
            }
            C1U c1u = this.LJLLI;
            if (c1u != null) {
                synchronized (c1u.LIZ) {
                    if (!c1u.LIZIZ.isEmpty()) {
                        activity = c1u.LIZIZ.getLast();
                    }
                }
                if (activity != null) {
                    Bundle LIZ = C0H1.LIZ("ENTER_FROM_PARAM", str);
                    AnchorTechViewPagerDialog anchorTechViewPagerDialog = new AnchorTechViewPagerDialog();
                    anchorTechViewPagerDialog.setArguments(LIZ);
                    try {
                        ActivityC45651qj LJIILL = g0.LJIILL(activity);
                        if (LJIILL != null && (supportFragmentManager = LJIILL.getSupportFragmentManager()) != null) {
                            anchorTechViewPagerDialog.show(supportFragmentManager, supportFragmentManager.getClass().getName());
                            return;
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalStateException("Required value was null.");
                        }
                    } catch (IllegalStateException unused) {
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (o.LJ(str2, "screen_anchor_diagnose")) {
            AbstractC73672Svk.LJJIJIL(Boolean.TRUE).LJJJ(T16.LIZ()).LJJJJZI(new AfS54S0200000_5(this, c199097rd, 8));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        boolean z;
        Spannable spannable;
        Spannable spannable2;
        Spannable spannable3;
        Spannable spannable4;
        LiveDialog LIZ;
        Long valueOf;
        int i;
        Text text;
        Text text2;
        String str;
        Text text3;
        String str2;
        Text text4;
        Text text5;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C1S.LIZ > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C1S.LIZJ);
            long j2 = C1S.LIZ;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j2 != -1 && elapsedRealtime > j2) {
                j = elapsedRealtime - j2;
            } else {
                j = -1;
            }
            linkedHashMap.put("duration", Long.valueOf(j));
            C1S.LIZ("show", linkedHashMap);
            Long l = -1L;
            if (l != null) {
                l.longValue();
                C1S.LIZ = l.longValue();
            }
        }
        if (!LiveOverdrawOptimizeSettings.INSTANCE.enable()) {
            _$_findCachedViewById(R.id.fwm).setBackgroundResource(R.color.ar);
        }
        String str3 = (String) CB0.LIZ.getValue();
        Context context = getContext();
        String str4 = null;
        if (context == null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
        } else {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = C7N.LJIILIIL().Lm0(context, str3, "live_broadcast_end", true, new AqS187S0100000_5(this, 0));
        }
        this.LJLJJLL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && C78598Ut0.LJII(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJJLL) != null) {
            C78598Ut0.LJIJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
        }
        ((ViewGroup) _$_findCachedViewById(R.id.ux)).addView(this.LJLJJLL, -1, -1);
        C16880lQ.LJIILLIIL((ImageView) _$_findCachedViewById(R.id.af0), new ACListenerS25S0100000_5(this, 0));
        ((ImageView) _$_findCachedViewById(R.id.af0)).setVisibility(8);
        if (this.LJLJL == null || getContext() == null) {
            return;
        }
        Spannable spannable5 = CXJ.LIZ;
        PerceptionDialogInfo perceptionDialogInfo = this.LJLJL;
        if (perceptionDialogInfo != null && perceptionDialogInfo.title != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (perceptionDialogInfo != null) {
                text4 = perceptionDialogInfo.title;
                text5 = perceptionDialogInfo.title;
            } else {
                text4 = null;
                text5 = null;
            }
            o.LJI(text5);
            spannable = CXJ.LJFF(text4, text5.defaultPattern);
            Context context2 = getContext();
            o.LJI(context2);
            spannable.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(context2, R.color.ck)), 0, spannable.length(), 18);
            C23010vJ.LIZJ(getContext(), spannable, 0, spannable.length(), 33, 1, 700);
        } else {
            spannable = spannable5;
        }
        PerceptionDialogInfo perceptionDialogInfo2 = this.LJLJL;
        if (perceptionDialogInfo2 != null && perceptionDialogInfo2.subTitle != null) {
            if (perceptionDialogInfo2 != null) {
                text3 = perceptionDialogInfo2.subTitle;
                Text text6 = perceptionDialogInfo2.subTitle;
                if (text6 != null) {
                    str2 = text6.defaultPattern;
                    spannable2 = CXJ.LJFF(text3, str2);
                    C23010vJ.LJI(getContext(), spannable2, 0, spannable2.length(), 33, 3);
                }
            } else {
                text3 = null;
            }
            str2 = null;
            spannable2 = CXJ.LJFF(text3, str2);
            C23010vJ.LJI(getContext(), spannable2, 0, spannable2.length(), 33, 3);
        } else {
            spannable2 = spannable5;
        }
        PerceptionDialogInfo perceptionDialogInfo3 = this.LJLJL;
        if (perceptionDialogInfo3 != null && perceptionDialogInfo3.adviceActionText != null) {
            if (perceptionDialogInfo3 != null) {
                text2 = perceptionDialogInfo3.adviceActionText;
                Text text7 = perceptionDialogInfo3.adviceActionText;
                if (text7 != null) {
                    str = text7.defaultPattern;
                    spannable3 = CXJ.LJFF(text2, str);
                    Context context3 = getContext();
                    o.LJI(context3);
                    spannable3.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(context3, R.color.bc)), 0, spannable3.length(), 18);
                    C23010vJ.LIZJ(getContext(), spannable3, 0, spannable3.length(), 33, 3, 600);
                }
            } else {
                text2 = null;
            }
            str = null;
            spannable3 = CXJ.LJFF(text2, str);
            Context context32 = getContext();
            o.LJI(context32);
            spannable3.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(context32, R.color.bc)), 0, spannable3.length(), 18);
            C23010vJ.LIZJ(getContext(), spannable3, 0, spannable3.length(), 33, 3, 600);
        } else {
            spannable3 = spannable5;
        }
        Context context4 = getContext();
        o.LJI(context4);
        int LIZIZ = C04330Ez.LIZIZ(context4, R.color.cq);
        PerceptionDialogInfo perceptionDialogInfo4 = this.LJLJL;
        if (perceptionDialogInfo4 != null && perceptionDialogInfo4.defaultActionText != null) {
            if (perceptionDialogInfo4 != null) {
                text = perceptionDialogInfo4.defaultActionText;
                Text text8 = perceptionDialogInfo4.defaultActionText;
                if (text8 != null) {
                    str4 = text8.defaultPattern;
                }
            } else {
                text = null;
            }
            spannable4 = CXJ.LJFF(text, str4);
            spannable4.setSpan(new ForegroundColorSpan(LIZIZ), 0, spannable4.length(), 18);
            C23010vJ.LIZJ(getContext(), spannable4, 0, spannable4.length(), 33, 3, LiveChatShowDelayForHotLiveSetting.DEFAULT);
        } else {
            spannable4 = spannable5;
        }
        if (!o.LJ(spannable3, spannable5) && !o.LJ(spannable4, spannable5)) {
            C47071t1 c47071t1 = new C47071t1(getContext());
            c47071t1.LJII(spannable2);
            c47071t1.LJIILJJIL(spannable3, new IDcS170S0100000_5(this, 0));
            c47071t1.LJIILL(spannable4, new IDcS170S0100000_5(this, 1));
            c47071t1.LJIILJJIL = false;
            LIZ = c47071t1.LIZ();
        } else {
            if (!o.LJ(spannable3, spannable5) || o.LJ(spannable4, spannable5)) {
                return;
            }
            Context context5 = getContext();
            o.LJI(context5);
            spannable4.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(context5, R.color.ck)), 0, spannable4.length(), 18);
            C23010vJ.LIZJ(getContext(), spannable4, 0, spannable4.length(), 33, 3, 600);
            C47071t1 c47071t12 = new C47071t1(getContext());
            c47071t12.LJII(spannable2);
            c47071t12.LJIIJ(spannable4, new IDcS170S0100000_5(this, 2));
            c47071t12.LJIILJJIL = false;
            LIZ = c47071t12.LIZ();
        }
        if (LIZ == null) {
            return;
        }
        PerceptionDialogInfo perceptionDialogInfo5 = this.LJLJL;
        if (perceptionDialogInfo5 != null && (valueOf = Long.valueOf(perceptionDialogInfo5.iconType)) != null && valueOf.longValue() != 0) {
            long longValue = valueOf.longValue();
            if (longValue == 1) {
                i = R.drawable.cyk;
            } else if (longValue == 2) {
                i = R.drawable.cyg;
            } else if (longValue == 3) {
                i = R.drawable.cyf;
            } else if (longValue == 6) {
                i = R.drawable.cyi;
            } else if (longValue == 7) {
                i = R.drawable.cva;
            } else {
                i = R.drawable.cyh;
            }
            C0TU c0tu = C0TT.LIZ;
            Context context6 = LIZ.getContext();
            c0tu.getClass();
            LIZ.LJJIII(C0TU.LIZ(i, context6));
            boolean LIZIZ2 = c0tu.LIZIZ(i, false);
            LIZ.LLD = LIZIZ2;
            LiveIconView liveIconView = LIZ.LJLJJLL;
            if (liveIconView != null) {
                liveIconView.setIconAutoMirrored(LIZIZ2);
            }
            LIZ.LLD = false;
            LiveIconView liveIconView2 = LIZ.LJLJJLL;
            if (liveIconView2 != null) {
                liveIconView2.setIconAutoMirrored(false);
            }
        }
        if (!o.LJ(spannable, spannable5)) {
            LIZ.setTitle(spannable);
        }
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-2405188658997004873")).LIZ) {
            LIZ.show();
        }
        vl("show", "", this.LJLJLJ, this.LJLJL);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.d4o, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    public final void vl(String str, String str2, PunishEventInfo punishEventInfo, PerceptionDialogInfo perceptionDialogInfo) {
        String str3;
        String str4;
        String str5;
        Long l;
        Long l2;
        String str6;
        String str7;
        long j;
        LiveMode streamType;
        BZI LIZ = C28787BRn.LIZ("livesdk_violation_popup");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(str, "action_type");
        LIZ.LJIJJ("anchor", "user_type");
        LIZ.LJIJJ("finish_card", "scene_type");
        String str8 = null;
        if (punishEventInfo != null) {
            str3 = punishEventInfo.punishId;
        } else {
            str3 = null;
        }
        LIZ.LJIJJ(str3, "record_id");
        if (punishEventInfo != null) {
            str4 = punishEventInfo.punishType;
        } else {
            str4 = null;
        }
        LIZ.LJIJJ(str4, "violation_type");
        if (punishEventInfo != null) {
            str5 = punishEventInfo.punishReason;
        } else {
            str5 = null;
        }
        LIZ.LJIJJ(str5, "violation_reason");
        if (punishEventInfo != null) {
            l = Long.valueOf(punishEventInfo.violationUid);
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "violation_anchor_id");
        LIZ.LJIJJ(str2, "click_tab");
        if (punishEventInfo != null) {
            l2 = punishEventInfo.duration;
        } else {
            l2 = null;
        }
        LIZ.LJIJJ(l2, "period");
        if (perceptionDialogInfo != null) {
            str6 = perceptionDialogInfo.violationDetailUrl;
        } else {
            str6 = null;
        }
        if (!TextUtils.isEmpty(str6)) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str7, "is_detail_button");
        Room room = this.LJLIL;
        if (room != null && (streamType = room.getStreamType()) != null) {
            str8 = C28509BGv.LIZ(streamType);
        }
        LIZ.LJIJJ(str8, "live_type");
        if (C29306Beo.LJJIFFI((Boolean) DataChannelGlobal.LJLJJI.mv0(CaptchaCheckFailedChannel.class))) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Room room2 = this.LJLIL;
            if (room2 != null) {
                j = room2.getCreateTime();
            } else {
                j = 0;
            }
            I9A.LIZ(currentTimeMillis, j, LIZ, "live_duration");
        }
        LIZ.LJJIIJZLJL();
    }
}
