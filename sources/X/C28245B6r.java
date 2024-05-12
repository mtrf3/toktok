package X;

import Y.AObjectS22S0000000_5;
import Y.IDCListenerS159S0100000_5;
import Y.IDDListenerS145S0100000_5;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.ExtraResult;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CloseWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2Setting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBroadcastEnterOtherRoomKickOutSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePaidEventSchema;
import com.bytedance.android.livesdk.livesetting.watchlive.RemoveDrawLiveEndSetting;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.mvp.PaidRoomCheckDialog;
import com.bytedance.android.livesdk.widget.LiveAgeRestrictedWidget;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.HashMap;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.B6r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28245B6r implements InterfaceC28152B3c {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ LivePlayFragment LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:139:0x07e8, code lost:
    
        if (r3 != null) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x07e4  */
    /* JADX WARN: Type inference failed for: r3v232, types: [com.bytedance.android.livesdkapi.depend.model.live.Room, O] */
    /* JADX WARN: Type inference failed for: r3v233, types: [com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra, O] */
    /* JADX WARN: Type inference failed for: r3v234, types: [java.lang.String, O] */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.ss.ugc.live.sdk.message.interfaces.IMessageManager, O] */
    /* JADX WARN: Type inference failed for: r5v64, types: [X.OSZ, O] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.B6s, O] */
    @Override // X.InterfaceC28152B3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C28251B6x r22) {
        /*
            Method dump skipped, instructions count: 2826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28245B6r.LIZIZ(X.B6x):void");
    }

    public final void LIZJ(boolean z) {
        HashMap<String, String> hashMap;
        LivePlayFragment livePlayFragment = this.LIZIZ;
        EnterRoomConfig enterRoomConfig = livePlayFragment.LLLZL;
        if (enterRoomConfig != null && livePlayFragment.LLLLZI != null && "mall".equals(enterRoomConfig.mRoomsData.enterFromMerge)) {
            B3K b3k = this.LIZIZ.LLLLZI;
            long j = b3k.LJFF;
            if (j != -1 || b3k.LJI != -1) {
                long j2 = b3k.LJI;
                if (j2 != -1) {
                    j = j2;
                }
                long currentTimeMillis = System.currentTimeMillis() - j;
                EnterRoomConfig.ECWrapData eCWrapData = this.LIZIZ.LLLZL.mECData;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("real_duration", String.valueOf(currentTimeMillis));
                hashMap2.put("is_success", String.valueOf(z));
                if (eCWrapData != null && (hashMap = eCWrapData.ecCommonExtraParam) != null) {
                    hashMap2.putAll(hashMap);
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_enter_room_api_result");
                LIZ.LJJIFFI(hashMap2);
                LIZ.LJIIZILJ();
                LIZ.LJJIIJZLJL();
            }
        }
    }

    public C28245B6r(LivePlayFragment livePlayFragment, long j) {
        this.LIZIZ = livePlayFragment;
        this.LIZ = j;
    }

    @Override // X.InterfaceC28152B3c
    public final void LIZ(final int i, String str, final String str2, String str3) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.LIZIZ.Sl().LIZIZ("room_enter_failed");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("room/enter fail -> origin room_id = ");
        LIZ.append(this.LIZ);
        B4I.LIZ("LivePlayFragment", X1D.LIZIZ(LIZ));
        if (i == 4003043) {
            FragmentManager manager = this.LIZIZ.getChildFragmentManager();
            long j = this.LIZ;
            o.LJIIIZ(manager, "manager");
            PaidRoomCheckDialog paidRoomCheckDialog = new PaidRoomCheckDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("roomId", j);
            paidRoomCheckDialog.setArguments(bundle);
            paidRoomCheckDialog.show(manager, "PaidRoomCheckDialog.class");
            return;
        }
        boolean z6 = true;
        if (i == 4003072) {
            ActivityC45651qj fragmentActivity = this.LIZIZ.mo49getActivity();
            LivePlayFragment livePlayFragment = this.LIZIZ;
            EnterRoomConfig config = livePlayFragment.LLLZL;
            DataChannel channel = livePlayFragment.LLLIIL;
            o.LJIIIZ(fragmentActivity, "fragmentActivity");
            o.LJIIIZ(config, "config");
            o.LJIIIZ(channel, "channel");
            C32364Cn2 c32364Cn2 = new C32364Cn2(LivePaidEventSchema.INSTANCE.getValue());
            c32364Cn2.LIZIZ(config.mRoomsData.roomId, "room_id");
            c32364Cn2.LIZJ("request_id", config.mLogData.requestId);
            c32364Cn2.LIZJ("author_id", config.mLogData.anchorId);
            android.net.Uri uri = UriProtector.parse(c32364Cn2.LIZLLL());
            IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
            if (iHostAction != null && iHostAction.hostInterceptSpark(uri.toString())) {
                IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
                if (iHybridContainerService != null) {
                    String uri2 = uri.toString();
                    o.LJIIIIZZ(uri2, "uri.toString()");
                    iHybridContainerService.Vs0(fragmentActivity, uri2, new AqS171S0100000_5(channel, 556));
                    return;
                }
                return;
            }
            o.LJIIIIZZ(uri, "uri");
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "fragmentActivity.supportFragmentManager");
            if (C28249B6v.LIZ(0, uri, "disable_mask_click_close") == 0) {
                z = true;
            } else {
                z = false;
            }
            BNW K90 = ((IBrowserService) CN1.LIZ(IBrowserService.class)).K90(UriProtector.getQueryParameter(uri, "url"), C28249B6v.LIZIZ(uri, "fallback_url", ""));
            K90.LJFF(C28249B6v.LIZ(8, uri, "radius"), C28249B6v.LIZ(8, uri, "radius"));
            K90.LIZJ = C28249B6v.LIZ(LiveChatShowDelayForHotLiveSetting.DEFAULT, uri, "height");
            K90.LIZIZ = C28249B6v.LIZ((int) C15380j0.LJIJ(C15380j0.LJIIL()), uri, "width");
            K90.LIZLLL = C28249B6v.LIZ(0, uri, "margin");
            K90.LJIIIZ = 80;
            C28249B6v.LIZ(0, uri, "show_close");
            String uri3 = uri.toString();
            if (uri3 == null) {
                uri3 = "";
            }
            K90.LJIILLIIL = uri3;
            K90.LJIIJ = C28249B6v.LIZIZ(uri, "from_label", "");
            K90.LJIJ = C28249B6v.LIZIZ(uri, "title", "");
            if (ujb.o.LJJJJIZL("true", C28249B6v.LIZIZ(uri, "show_title_bar", ""), true) || o.LJ("1", C28249B6v.LIZIZ(uri, "show_title_bar", ""))) {
                z2 = true;
            } else {
                z2 = false;
            }
            K90.LJIJI = z2;
            if (ujb.o.LJJJJIZL("true", C28249B6v.LIZIZ(uri, "show_title_share", ""), true) || o.LJ("1", C28249B6v.LIZIZ(uri, "show_title_share", ""))) {
                z3 = true;
            } else {
                z3 = false;
            }
            K90.LJIJJLI = z3;
            if (ujb.o.LJJJJIZL("true", C28249B6v.LIZIZ(uri, "show_title_close", ""), true) || o.LJ("1", C28249B6v.LIZIZ(uri, "show_title_close", ""))) {
                z4 = true;
            } else {
                z4 = false;
            }
            K90.LJIJJ = z4;
            K90.LJIILIIL = z;
            K90.LJI(C28249B6v.LIZIZ(uri, "web_bg_color", ""));
            K90.LIZIZ(C28249B6v.LIZIZ(uri, "popup_enter_type", ""));
            K90.LIZJ(C28249B6v.LIZIZ(uri, "mask_alpha", CardStruct.IStatusCode.DEFAULT));
            if (C28249B6v.LIZ(0, uri, "landscape_custom_height") == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            K90.LJIIJJI = z5;
            int LIZ2 = C28249B6v.LIZ(-1, uri, "show_dim");
            if (LIZ2 != -1) {
                if (LIZ2 != 1) {
                    z6 = false;
                }
                K90.LJIIL = z6;
            }
            HybridDialogFragment LIZ3 = K90.LIZ();
            LIZ3.LJLILLLLZI = new IDDListenerS145S0100000_5(channel, 4);
            LIZ3.show(supportFragmentManager, "paidEventDialog");
            return;
        }
        LivePlayFragment livePlayFragment2 = this.LIZIZ;
        livePlayFragment2.LLLZ = true;
        livePlayFragment2.w = false;
        livePlayFragment2.LLLLLLL.LIZLLL = 1;
        DialogC77438UaI dialogC77438UaI = livePlayFragment2.LLJILJIL;
        if (dialogC77438UaI != null && dialogC77438UaI.isShowing()) {
            livePlayFragment2.LLJILJIL.dismiss();
        }
        this.LIZIZ.sm("fetch_room_error");
        LIZJ(false);
        C28643BLz c28643BLz = B57.LIZ;
        EnterRoomLinkSession LIZ4 = c28643BLz.LIZ();
        EnumC28203B5b enumC28203B5b = EnumC28203B5b.ServerApiCall;
        Event event = new Event("live_play_enter_room_fail", 1031, enumC28203B5b);
        event.LIZIZ("room enter api fail callback.");
        LIZ4.LIZIZ(event);
        if ((!TextUtils.isEmpty(str) && str.contains("30003")) || i == 30003) {
            BZI LIZ5 = C28787BRn.LIZ("rd_enter_room_live_end");
            LIZ5.LJIILLIIL(this.LIZIZ.LLLIIL);
            LIZ5.LJJIIJZLJL();
            this.LIZIZ.qm(201L, i, "room finish, live_end");
            EnterRoomLinkSession LIZ6 = c28643BLz.LIZ();
            Event event2 = new Event("live_play_enter_room_fail", 1032, EnumC28203B5b.BussinessApiCall);
            event2.LIZIZ("room enter show end fragment");
            LIZ6.LIZIZ(event2);
            LivePlayFragment livePlayFragment3 = this.LIZIZ;
            livePlayFragment3.getClass();
            if (!TextUtils.isEmpty(str3) && str3.contains("finished_perception_msg")) {
                try {
                    ExtraResult extraResult = (ExtraResult) C09650Zl.LIZJ.LJI(str3, ExtraResult.class);
                    livePlayFragment3.LLLLIIIILLL = new ControlMessage();
                    Text text = new Text();
                    text.defaultPattern = extraResult.finishedPerceptionMsg;
                    ControlMessage controlMessage = livePlayFragment3.LLLLIIIILLL;
                    controlMessage.perceptionAudienceText = text;
                    controlMessage.punishInfo = extraResult.punishInfo;
                } catch (Exception e) {
                    C0NB.LJ("LivePlayFragment", e.getMessage());
                }
            }
            this.LIZIZ.kn(false, null);
            if (RemoveDrawLiveEndSetting.INSTANCE.getValue()) {
                this.LIZIZ.Pm(R.string.mqr, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, this.LIZ, "end", true);
            }
            this.LIZIZ.xn(true);
            this.LIZIZ.Il(B3L.LJII);
            LivePlayFragment livePlayFragment4 = this.LIZIZ;
            livePlayFragment4.LLII = B5V.LIVE_FINISHED;
            EnterRoomConfig enterRoomConfig = livePlayFragment4.LLLZL;
            if (enterRoomConfig != null) {
                enterRoomConfig.mRoomsData.enterLiveAlive = 0;
                if ("webapp".equals(enterRoomConfig.mLogData.enterFrom)) {
                    BZI LIZ7 = C28787BRn.LIZ("livesdk_question_scan_success");
                    C06540Nm.LJFF((C29374Bfu) B83.LIZ().LIZIZ(), LIZ7, "user_id", "", "room_id");
                    C06490Nh.LIZLLL(LIZ7, "webapp", "enter_from", "", "live_type");
                    return;
                }
                return;
            }
            return;
        }
        BZI LIZ8 = C28787BRn.LIZ("rd_enter_room_failed");
        LIZ8.LJIILLIIL(this.LIZIZ.LLLIIL);
        LIZ8.LJJIIJZLJL();
        B5C b5c = B3L.LIZLLL;
        StringBuilder LJ = AnonymousClass028.LJ("Fail to enter the room. errMsg = ", str, " errorCode = ", i, " errPrompt = ");
        LJ.append(str2);
        String LIZIZ = X1D.LIZIZ(LJ);
        b5c.getClass();
        o.LJIIIZ(LIZIZ, "<set-?>");
        b5c.LIZJ = LIZIZ;
        this.LIZIZ.Il(b5c);
        if (i != 0) {
            i2 = i;
        } else {
            i2 = 103;
        }
        LivePlayFragment livePlayFragment5 = this.LIZIZ;
        livePlayFragment5.LLLLLLL.LJIIJ(i2, str, livePlayFragment5.LLJJIJIIJIL, this.LIZ, livePlayFragment5.LJLJL);
        this.LIZIZ.qm(205L, i2, a1.LJ("enter room request failure, errMsg = ", str, " ,frame_fail"));
        if (this.LIZIZ.mo49getActivity() != null && (C29306Beo.LJIIZILJ(this.LIZIZ.mo49getActivity().getRequestedOrientation()) || C29306Beo.LJIIZILJ(this.LIZIZ.LLFFF))) {
            LivePlayFragment livePlayFragment6 = this.LIZIZ;
            livePlayFragment6.LLFFF = 1;
            livePlayFragment6.mo49getActivity().setRequestedOrientation(this.LIZIZ.LLFFF);
        }
        if (i == 4003098) {
            EnterRoomLinkSession LIZ9 = c28643BLz.LIZ();
            Event event3 = new Event("live_play_enter_room_fail", 1036, enumC28203B5b);
            event3.LIZIZ("enter room api return fail.error_code = 4003098");
            LIZ9.LIZIZ(event3);
            B5S.LIZLLL(this.LIZIZ.LLLZL, B5T.UNSTABLE_CONNECTION, "slide_next_room");
            this.LIZIZ.Ml(B5U.ENTER_FAILED);
            return;
        }
        if (i == 4003157) {
            this.LIZIZ.Zl(str3);
            this.LIZIZ.Nl(B5U.LCC_PERCEPTION, "enter_room");
            return;
        }
        if (i == 4003110) {
            B5S.LJ(this.LIZIZ.LLLZL, B5T.IS_MINOR_AGE, "slide_next_room", Integer.valueOf(i));
            LivePlayFragment livePlayFragment7 = this.LIZIZ;
            LiveAgeRestrictedWidget liveAgeRestrictedWidget = livePlayFragment7.LLLIZZ;
            if (liveAgeRestrictedWidget == null) {
                livePlayFragment7.LLLIZZ = new LiveAgeRestrictedWidget(livePlayFragment7.LLIIIJ);
                RecyclableWidgetManager cm = livePlayFragment7.cm();
                cm.load(R.id.z8, livePlayFragment7.LLLIZZ);
                if (LiveRecycleWidgetV2Setting.INSTANCE.getValue()) {
                    cm.load(R.id.z1, cm.getRecyclableWidgetFromCacheOrNew(CloseWidget.class, null, new AObjectS22S0000000_5(9)));
                } else {
                    cm.load(R.id.z1, new CloseWidget());
                }
            } else {
                B35 b35 = livePlayFragment7.LLIIIJ;
                if (!liveAgeRestrictedWidget.isDestroyed && liveAgeRestrictedWidget.hasAttached) {
                    liveAgeRestrictedWidget.LJLIL = b35;
                }
            }
            livePlayFragment7.LLLIZZ.show();
            C30770C5u.LJII = false;
            BZI LIZ10 = C28787BRn.LIZ("livesdk_mature_theme_mask_show");
            LIZ10.LJIILLIIL(livePlayFragment7.LLLIIL);
            LIZ10.LJJIIJZLJL();
            return;
        }
        if (i == 4003135) {
            EnterRoomLinkSession LIZ11 = c28643BLz.LIZ();
            Event event4 = new Event("live_play_enter_room_fail", 1036, enumC28203B5b);
            event4.LIZIZ("enter room api return fail.error_code = 4003135");
            LIZ11.LIZIZ(event4);
            B5S.LIZLLL(this.LIZIZ.LLLZL, B5T.SUB_ONLY_ERROR, "slide_next_room");
            this.LIZIZ.Nl(B5U.SUB_ONLY_ERROR, str2);
            return;
        }
        if (i == 30015) {
            LivePlayFragment livePlayFragment8 = this.LIZIZ;
            BJ9 bj9 = livePlayFragment8.LLIIII;
            DataChannel dataChannel = livePlayFragment8.LLLIIL;
            bj9.getClass();
            BJ9.LJIIIIZZ(3, dataChannel, "live");
            C30868C9o.LIZJ(R.string.nzf);
            this.LIZIZ.qm(208L, i, "user is living");
            Event event5 = new Event("live_play_enter_room_fail", 33807, enumC28203B5b);
            StringBuilder LIZ12 = X1D.LIZ();
            LIZ12.append("enter room api return fail.You are live broadcasting dialog click cancel. error_code: ");
            LIZ12.append(i);
            LIZ12.append(", error_prompt: ");
            LIZ12.append(str2);
            event5.LIZIZ(X1D.LIZIZ(LIZ12));
            c28643BLz.LIZ().LIZIZ(event5);
            this.LIZIZ.Pl(B5T.ROOM_LIVING_SELF, "error", i);
            return;
        }
        if (i == 4003160) {
            this.LIZIZ.Zl(str3);
            this.LIZIZ.Nl(B5U.REGION_BLOCK, "enter_room");
            return;
        }
        if ((!TextUtils.isEmpty(str) && str.contains("30005")) || i == 30005) {
            if (LiveBroadcastEnterOtherRoomKickOutSetting.INSTANCE.getValue()) {
                LivePlayFragment livePlayFragment9 = this.LIZIZ;
                BJ9 bj92 = livePlayFragment9.LLIIII;
                DataChannel dataChannel2 = livePlayFragment9.LLLIIL;
                bj92.getClass();
                BJ9.LJIIIIZZ(4, dataChannel2, "live");
                C30868C9o.LIZJ(R.string.nzf);
                this.LIZIZ.qm(208L, i, "user is living");
                Event event6 = new Event("live_play_enter_room_fail", 33807, enumC28203B5b);
                StringBuilder LIZ13 = X1D.LIZ();
                LIZ13.append("enter room api return fail.You are live broadcasting dialog click cancel. error_code: ");
                LIZ13.append(i);
                LIZ13.append(", error_prompt: ");
                LIZ13.append(str2);
                event6.LIZIZ(X1D.LIZIZ(LIZ13));
                c28643BLz.LIZ().LIZIZ(event6);
                this.LIZIZ.Pl(B5T.ROOM_ENTER_API_BROADCASTING, "error", i);
                return;
            }
            DialogC77438UaI dialogC77438UaI2 = this.LIZIZ.LLJILJIL;
            if (dialogC77438UaI2 != null && dialogC77438UaI2.isShowing()) {
                return;
            }
            LivePlayFragment livePlayFragment10 = this.LIZIZ;
            BJ9 bj93 = livePlayFragment10.LLIIII;
            DataChannel dataChannel3 = livePlayFragment10.LLLIIL;
            bj93.getClass();
            BJ9.LJII(dataChannel3, "show");
            LivePlayFragment livePlayFragment11 = this.LIZIZ;
            C77437UaH c77437UaH = new C77437UaH(livePlayFragment11.getContext());
            c77437UaH.LJJII = false;
            c77437UaH.LIZIZ(R.string.svd);
            c77437UaH.LJ(R.string.svc, new IDCListenerS159S0100000_5(this, 5), false);
            c77437UaH.LIZJ(R.string.t1i, new DialogInterface.OnClickListener() { // from class: X.B5d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    C28245B6r c28245B6r = C28245B6r.this;
                    int i4 = i;
                    String str4 = str2;
                    c28245B6r.getClass();
                    dialogInterface.dismiss();
                    LivePlayFragment livePlayFragment12 = c28245B6r.LIZIZ;
                    if (livePlayFragment12.LLIIII != null) {
                        BJ9.LJII(livePlayFragment12.LLLIIL, "cancel");
                    }
                    c28245B6r.LIZIZ.qm(208L, i4, "user cancel, frame_fail");
                    Event event7 = new Event("live_play_enter_room_fail", 33807, EnumC28203B5b.ServerApiCall);
                    StringBuilder LIZ14 = X1D.LIZ();
                    LIZ14.append("enter room api return fail.You are live broadcasting dialog click cancel. error_code: ");
                    LIZ14.append(i4);
                    LIZ14.append(", error_prompt: ");
                    LIZ14.append(str4);
                    event7.LIZIZ(X1D.LIZIZ(LIZ14));
                    B57.LIZ.LIZ().LIZIZ(event7);
                    c28245B6r.LIZIZ.Pl(B5T.ROOM_ENTER_API_BROADCASTING, "error", i4);
                }
            }, false);
            livePlayFragment11.LLJILJIL = c77437UaH.LIZ();
            C16880lQ.LIZ(this.LIZIZ.LLJILJIL);
            return;
        }
        if (TextUtils.isEmpty(str2) || i == 0) {
            EnterRoomLinkSession LIZ14 = c28643BLz.LIZ();
            Event event7 = new Event("live_play_enter_room_fail", 1036, enumC28203B5b);
            event7.LIZIZ("enter room api return fail.error_code =0");
            LIZ14.LIZIZ(event7);
            B5S.LJ(this.LIZIZ.LLLZL, B5T.ENTER_LIVE_SERVER_ERROR, "slide_next_room", 103);
            this.LIZIZ.Ml(B5U.ENTER_FAILED);
            return;
        }
        Event event8 = new Event("live_play_enter_room_fail", 1037, enumC28203B5b);
        StringBuilder LIZ15 = X1D.LIZ();
        LIZ15.append("enter room api return fail. error_code: ");
        LIZ15.append(i);
        LIZ15.append(", error_prompt: ");
        LIZ15.append(str2);
        event8.LIZIZ(X1D.LIZIZ(LIZ15));
        c28643BLz.LIZ().LIZIZ(event8);
        B5S.LJ(this.LIZIZ.LLLZL, B5T.ENTER_LIVE_SERVER_ERROR, "slide_next_room", Integer.valueOf(i));
        this.LIZIZ.Nl(B5U.ENTER_FAILED, str2);
    }
}
