package X;

import Y.IDFactoryS60S0000000_1;
import Y.IDcS135S0200000_1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.bottomsheet.IgnoreRecyclerAndPagerBottomSheetBehaviour;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.GroupQuickChatRoomFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.SingleQuickChatRoomFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedKeyboardDialogFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.DMNavArg;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.viewmodel.ChatInviteViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.fragment.SessionListFragmentV2;
import com.ss.android.ugc.aweme.im.sdk.common.controller.router.DmRouterInterceptor;
import com.ss.android.ugc.aweme.im.sdk.common.data.manager.keva.IMCriticalFlowKeva;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3tm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98503tm implements InterfaceC98813uH {
    public static final C98503tm LIZ = new C98503tm();

    @Override // X.InterfaceC98813uH
    public final DmRouterInterceptor LJI() {
        return new DmRouterInterceptor();
    }

    @Override // X.InterfaceC98813uH
    public final void LJIIIZ() {
        C2U8.LIZ(new IEvent() { // from class: X.3tr
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C2U8.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C2U8.LIZIZ(this);
                return this;
            }
        });
        if (C3TX.LIZIZ()) {
            C3K3.LIZ().LJ();
        } else {
            C37O.LIZIZ().LJI(true);
        }
    }

    @Override // X.InterfaceC98813uH
    public final void LIZIZ() {
        if (C115204fc.LIZ()) {
            C34B.LIZIZ("GlobalActionExecutor", "invokeOnInboxStartActions");
            C3Y2 c3y2 = new C3Y2("inbox_start");
            C3VM c3vm = C115114fT.LJI;
            if (c3vm != null) {
                c3vm.LIZIZ(c3y2, false);
            }
            List LIZJ = ((C169706lK) C115114fT.LIZIZ.getValue()).LIZJ();
            o.LJIIIIZZ(LIZJ, "enterInboxActionList.immutableList");
            Iterator it = LIZJ.iterator();
            while (it.hasNext()) {
                ((C3VL) it.next()).LJLIL.invoke();
            }
            C3VM c3vm2 = C115114fT.LJI;
            if (c3vm2 == null) {
                return;
            }
            c3vm2.LIZ(c3y2, C46B.LIZLLL);
        }
    }

    @Override // X.InterfaceC98813uH
    public final void LIZJ() {
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C3OL(System.currentTimeMillis(), null), 3);
    }

    @Override // X.InterfaceC98813uH
    public final String LIZ(String str) {
        return C81273Gx.LIZJ(str);
    }

    @Override // X.InterfaceC98813uH
    public final void LJ(String str) {
        String LIZJ = C81273Gx.LIZJ(str);
        if (LIZJ.length() > 0) {
            C76662ze.LJLIL.getClass();
            C76662ze.LJFF(LIZJ, null);
        }
    }

    @Override // X.InterfaceC98813uH
    public final void LJFF(C98593tv params) {
        ActivityC45651qj activityC45651qj;
        C99033ud c99033ud;
        o.LJIIIZ(params, "params");
        C78886Uxe.LJIIIZ(params);
        Context context = params.getContext();
        Activity activity = null;
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        }
        if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null && params.isQuickChat() && C00F.LIZ(31744, 0, "tt_im_chat_quick_interaction", true) > 0) {
            C100723xM.LIZJ("quick_chat_sheet");
            String sessionId = params.getSessionId();
            if (sessionId == null) {
                return;
            }
            if (params.getChatType() == 3) {
                c99033ud = new C98563ts(params.getUuid());
            } else {
                C98523to c98523to = new C98523to(params.getUuid());
                c98523to.setFromUser(params.getImUser());
                c98523to.setShareUserId(params.getShareUserId());
                c98523to.setChatExt(params.getChatExt());
                c98523to.setImAdLog(params.getImAdLog());
                c98523to.setTCM(params.isTCM());
                c98523to.setRecommendedChat(params.isRecommendedChat());
                c99033ud = c98523to;
            }
            c99033ud.setConversationId(sessionId);
            c99033ud.setEnterFrom(params.getEnterFrom());
            String enterFromForMob = params.getEnterFromForMob();
            String str = "";
            if (enterFromForMob == null) {
                enterFromForMob = "";
            }
            c99033ud.setEnterFromForMob(enterFromForMob);
            c99033ud.setChatType(params.getChatType());
            c99033ud.setUnreadCount(params.getUnreadCount());
            String enterMethodForMob = params.getEnterMethodForMob();
            if (enterMethodForMob == null) {
                enterMethodForMob = "";
            }
            c99033ud.setEnterMethod(enterMethodForMob);
            c99033ud.setAuthorId(params.getAuthorId());
            String groupId = params.getGroupId();
            if (groupId == null) {
                groupId = "";
            }
            c99033ud.setGroupId(groupId);
            String str2 = params.getExtraMobParams().get("panel_source");
            if (str2 != null) {
                str = str2;
            }
            c99033ud.setPanelSourceForMob(str);
            c99033ud.setShowKeyBoardByDefault(params.getShowKeyBoardByDefault());
            c99033ud.setInnerPushType(params.getInnerPushType());
            c99033ud.setScrollToMsgId(params.getScrollToMsgId());
            boolean fullScreenByDefault = params.getFullScreenByDefault();
            if (C00F.LIZ(31744, 0, "tt_im_chat_quick_interaction", true) <= 0) {
                return;
            }
            IMCriticalFlowKeva.LJI(c99033ud.getConversationId());
            Fragment LJJJIL = activityC45651qj.getSupportFragmentManager().LJJJIL("quick_chat_sheet");
            boolean z = LJJJIL instanceof BaseQuickChatRoomFragment;
            Fragment fragment = LJJJIL;
            if (!z || LJJJIL == null) {
                if (c99033ud instanceof C98563ts) {
                    GroupQuickChatRoomFragment groupQuickChatRoomFragment = new GroupQuickChatRoomFragment();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("key_session_info", c99033ud);
                    bundle.putBoolean("key_expand_to_fullscreen", fullScreenByDefault);
                    groupQuickChatRoomFragment.setArguments(bundle);
                    fragment = groupQuickChatRoomFragment;
                } else if (c99033ud instanceof C98523to) {
                    SingleQuickChatRoomFragment singleQuickChatRoomFragment = new SingleQuickChatRoomFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("key_session_info", c99033ud);
                    bundle2.putBoolean("key_expand_to_fullscreen", fullScreenByDefault);
                    singleQuickChatRoomFragment.setArguments(bundle2);
                    fragment = singleQuickChatRoomFragment;
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("quick_chat_sheet: session info has wrong type ");
                    LIZ2.append(c99033ud);
                    C34B.LIZJ("quick_chat_sheet", X1D.LIZIZ(LIZ2));
                    return;
                }
            }
            ASL asl = new ASL();
            asl.LIZ.LJLLILLLL = fragment;
            asl.LJI(4);
            asl.LJFF(48);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJZL = fullScreenByDefault;
            tuxSheet.LJZI = false;
            IgnoreRecyclerAndPagerBottomSheetBehaviour ignoreRecyclerAndPagerBottomSheetBehaviour = new IgnoreRecyclerAndPagerBottomSheetBehaviour();
            TuxSheet tuxSheet2 = asl.LIZ;
            tuxSheet2.LLFZ = ignoreRecyclerAndPagerBottomSheetBehaviour;
            C1DG.LJII(activityC45651qj, "activity.supportFragmentManager", tuxSheet2, "quick_chat_sheet");
            return;
        }
        IMUser imUser = params.getImUser();
        if (imUser != null && imUser.getUid() != null) {
            C80813Fd c80813Fd = C80813Fd.LIZ;
            String uid = imUser.getUid();
            o.LJIIIIZZ(uid, "it.uid");
            if (o.LJ(C80813Fd.LIZJ.get(uid), Boolean.TRUE)) {
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                if (C4WC.LIZIZ.LIZ(c80813Fd.LJIIJJI(imUser.getUid())) == null && imUser.getFollowStatus() != 2) {
                    Context context2 = params.getContext();
                    if (context2 == null) {
                        context2 = EF7.LIZIZ();
                    }
                    SmartRoute buildRoute = SmartRouter.buildRoute(context2, "//im/welcome_activity");
                    buildRoute.withParam("enterChatParams", params);
                    buildRoute.open();
                    return;
                }
            }
        }
        C100723xM.LIZJ("chat_room");
        BaseChatRoomFragment.Companion.getClass();
        C98743uA.LIZ(params);
    }

    @Override // X.InterfaceC98813uH
    public final void LJIIJ(Fragment fragment) {
        long j;
        int i;
        int i2;
        int i3;
        String str;
        Long l;
        Integer num;
        Long l2;
        DMNavArg dMNavArg;
        Long LJJIZ;
        o.LJIIIZ(fragment, "fragment");
        DMNavArg.Companion.getClass();
        Bundle arguments = fragment.getArguments();
        String str2 = null;
        if (arguments == null) {
            dMNavArg = null;
        } else {
            String string = arguments.getString("enter_from");
            String string2 = arguments.getString("enter_method");
            Integer valueOf = Integer.valueOf(arguments.getInt("message_cnt"));
            String string3 = arguments.getString("notice_type");
            String string4 = arguments.getString("im_group_invite_id");
            String string5 = arguments.getString("conversation_id");
            String string6 = arguments.getString("msg_id");
            if (string6 != null && (LJJIZ = C38350F3i.LJJIZ(string6)) != null) {
                j = LJJIZ.longValue();
            } else {
                j = 0;
            }
            String string7 = arguments.getString("is_member_request", CardStruct.IStatusCode.DEFAULT);
            o.LJIIIIZZ(string7, "arguments.getString(KEY_IS_MEMBER_REQUEST, \"0\")");
            Integer LJJIL = C38350F3i.LJJIL(string7);
            if (LJJIL != null) {
                i = LJJIL.intValue();
            } else {
                i = 0;
            }
            Integer valueOf2 = Integer.valueOf(i);
            String string8 = arguments.getString("chat_type", CardStruct.IStatusCode.DEFAULT);
            o.LJIIIIZZ(string8, "arguments.getString(KEY_CHAT_TYPE, \"0\")");
            Integer LJJIL2 = C38350F3i.LJJIL(string8);
            if (LJJIL2 != null) {
                i2 = LJJIL2.intValue();
            } else {
                i2 = 0;
            }
            Integer valueOf3 = Integer.valueOf(i2);
            String string9 = arguments.getString("message_preview_enabled", CardStruct.IStatusCode.DEFAULT);
            o.LJIIIIZZ(string9, "arguments.getString(KEY_…AGE_PREVIEW_ENABLED, \"0\")");
            Integer LJJIL3 = C38350F3i.LJJIL(string9);
            if (LJJIL3 != null) {
                i3 = LJJIL3.intValue();
            } else {
                i3 = 0;
            }
            Integer valueOf4 = Integer.valueOf(i3);
            String string10 = arguments.getString("reply_to_message_content");
            if (string10 != null) {
                str = android.net.Uri.decode(string10);
            } else {
                str = null;
            }
            String string11 = arguments.getString("reply_to_message_server_id");
            if (string11 != null) {
                l = C38350F3i.LJJIZ(string11);
            } else {
                l = null;
            }
            String string12 = arguments.getString("reply_to_message_type");
            if (string12 != null) {
                num = C38350F3i.LJJIL(string12);
            } else {
                num = null;
            }
            String string13 = arguments.getString("reply_to_message_from_uid");
            if (string13 != null) {
                l2 = C38350F3i.LJJIZ(string13);
            } else {
                l2 = null;
            }
            dMNavArg = new DMNavArg(string, string2, valueOf, string3, string4, string5, j, valueOf2, valueOf3, valueOf4, str, l, num, l2);
        }
        C98603tw c98603tw = new C98603tw(0);
        ActivityC45651qj requireActivity = fragment.requireActivity();
        o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
        c98603tw.LIZIZ(requireActivity, dMNavArg);
        ActivityC45651qj requireActivity2 = fragment.requireActivity();
        o.LJIIIIZZ(requireActivity2, "fragment.requireActivity()");
        C255099zl c255099zl = new C255099zl(requireActivity2);
        if (dMNavArg != null) {
            str2 = dMNavArg.getJumpedFromInviteId();
        }
        c255099zl.LIZ(str2);
    }

    @Override // X.InterfaceC98813uH
    public final ChatInviteViewModelImpl LJIILIIL(ActivityC45651qj activityC45651qj) {
        ChatInviteViewModelImpl chatInviteViewModelImpl;
        ChatInviteViewModelImpl.LJLJL.getClass();
        if (activityC45651qj == null || (chatInviteViewModelImpl = (ChatInviteViewModelImpl) ViewModelProviders.of(activityC45651qj, new IDFactoryS60S0000000_1(5)).get(ChatInviteViewModelImpl.class)) == null) {
            return null;
        }
        return chatInviteViewModelImpl;
    }

    public static void LJIIZILJ(List list, java.util.Map map) {
        String text;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C109544Rq c109544Rq = (C109544Rq) it.next();
                TextContent textContent = (TextContent) C62070OXq.LIZ(TextContent.class, c109544Rq.getContent());
                if (textContent != null && (text = textContent.getText()) != null) {
                    map.put(Long.valueOf(c109544Rq.getMsgId()), text);
                }
                C119954nH.LIZ.put(Long.valueOf(c109544Rq.getMsgId()), Long.valueOf(c109544Rq.getIndex()));
            }
        }
    }

    @Override // X.InterfaceC98813uH
    public final void LIZLLL(java.util.Map map, AqS167S0100000_1 aqS167S0100000_1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C31F.LIZ.getClass();
        C31G.LIZ();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
        List<C109544Rq> LJIIJ = C63164Oqe.LJIIJ(ORZ.LLJI(linkedHashMap2.keySet()));
        if ((!((ArrayList) LJIIJ).isEmpty()) && LJIIJ != null) {
            LIZ.getClass();
            LJIIZILJ(LJIIJ, linkedHashMap);
            if (linkedHashMap.size() == map.size()) {
                aqS167S0100000_1.invoke(linkedHashMap);
                return;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                if (!linkedHashMap.containsKey(entry.getKey())) {
                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                }
            }
            C31F.LIZ.getClass();
            C31G.LIZ();
            C63164Oqe.LIZIZ.LJIIIZ(linkedHashMap3, new IDcS135S0200000_1(aqS167S0100000_1, linkedHashMap, 12));
        }
    }

    @Override // X.InterfaceC98813uH
    public final void LJIILL(ActivityC45651qj activityC45651qj, String str, Bundle bundle) {
        Object obj;
        C109544Rq c109544Rq;
        if (bundle != null) {
            obj = C16880lQ.LLJJIII(bundle, "message");
        } else {
            obj = null;
        }
        if (!(obj instanceof C109544Rq) || (c109544Rq = (C109544Rq) obj) == null) {
            return;
        }
        C98793uF.LIZLLL(new C91453iP(c109544Rq, null, 6), activityC45651qj, "11", c109544Rq, 16);
        C1042547h.LJII(String.valueOf(c109544Rq.getSender()), "button", str, null, 24);
    }

    @Override // X.InterfaceC98813uH
    public final void LJIIL(Context context, String str, IMUser iMUser, C98803uG c98803uG) {
        Integer num;
        int i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, Integer> hashMap = C98533tp.LIZIZ;
        if (hashMap != null) {
            num = hashMap.get(str);
        } else {
            num = null;
        }
        boolean z = C98533tp.LIZLLL;
        boolean z2 = C98533tp.LJ;
        C98743uA c98743uA = BaseChatRoomFragment.Companion;
        C98593tv c98593tv = new C98593tv(context, iMUser);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        c98593tv.setChatType(i);
        c98593tv.setSessionId(str);
        c98593tv.setReportPage(true);
        c98593tv.setHighRiskConversation(z);
        c98593tv.setMediaMsgMasking(z2);
        c98593tv.setReportParams(c98803uG);
        c98743uA.getClass();
        C98743uA.LIZ(c98593tv);
    }

    @Override // X.InterfaceC98813uH
    public final void LJIILJJIL(FragmentManager fragmentManager, final Aweme aweme, final String str, final AqS167S0100000_1 aqS167S0100000_1) {
        final DetailFeedKeyboardDialogFragment LIZ2 = C92933kn.LIZ(fragmentManager);
        Bundle bundle = new Bundle();
        bundle.putBoolean("showEmojiTab", false);
        bundle.putSerializable("video", aweme);
        bundle.putString("enterFrom", "reply_im_icon");
        LIZ2.setArguments(bundle);
        LIZ2.LJLLLL = new InterfaceC92953kp() { // from class: X.3uL
            @Override // X.InterfaceC92953kp
            public final void ne() {
            }

            @Override // X.InterfaceC92953kp
            public final void n2(final CharSequence charSequence, boolean z) {
                if (charSequence != null) {
                    DetailFeedKeyboardDialogFragment detailFeedKeyboardDialogFragment = DetailFeedKeyboardDialogFragment.this;
                    String str2 = str;
                    Aweme aweme2 = aweme;
                    final InterfaceC88472Yns<CharSequence, C76800UCe> interfaceC88472Yns = aqS167S0100000_1;
                    detailFeedKeyboardDialogFragment.dismiss();
                    java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("enter_from", str2), new OSZ("from_group_id", aweme2.getAid()));
                    String charSequence2 = charSequence.toString();
                    C4J3 c4j3 = new C4J3() { // from class: X.3uM
                        @Override // X.C4J3
                        public final void LIZIZ() {
                            InterfaceC88472Yns<CharSequence, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                            if (interfaceC88472Yns2 != null) {
                                interfaceC88472Yns2.invoke(charSequence);
                            }
                        }
                    };
                    String LIZ3 = C3Y4.LIZ();
                    List asList = Arrays.asList(IMUser.fromUser(aweme2.getAuthor()));
                    C62374Odu c62374Odu = new C62374Odu();
                    c62374Odu.LIZ = "text";
                    c62374Odu.LIZIZ("key_enter_from", str2);
                    c62374Odu.LIZIZ("enter_method", "head_icon");
                    c62374Odu.LIZIZ("aid", aweme2.getAid());
                    C107274Ix.LJ(asList, "", new SharePackage(c62374Odu), TextContent.obtain(charSequence2, aweme2), null, LJJLIIIIJ, LIZ3, null, c4j3);
                }
            }
        };
        LIZ2.show(fragmentManager, "ReplyKeyboardDialogFragment");
    }

    @Override // X.InterfaceC98813uH
    public final void LJIILLIIL(Context context, Bundle bundle, boolean z, Integer num) {
        o.LJIIIZ(context, "context");
        if (z) {
            C98573tt.LIZ();
        }
        LIZJ();
        if (bundle != null && !bundle.containsKey("message_cnt")) {
            bundle.putInt("message_cnt", C54362LVe.LJIILJJIL(99));
        }
        if (INB.LIZIZ()) {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//chat/center");
            if (bundle != null) {
                buildRoute.withParam(bundle);
            }
            if (num != null) {
                buildRoute.addFlags(num.intValue());
            }
            buildRoute.open();
            return;
        }
        C61210O0o.LIZ.LIZJ(context, SessionListFragmentV2.class, bundle, LiveLayoutPreloadThreadPriority.DEFAULT, null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (r3 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r1 == null) goto L17;
     */
    @Override // X.InterfaceC98813uH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedQuickDMFrgament LJII(android.view.View r6, androidx.fragment.app.FragmentManager r7, android.os.Bundle r8, com.ss.android.ugc.aweme.feed.model.Aweme r9, X.C224508rW r10) {
        /*
            r5 = this;
            r3 = 0
            if (r9 != 0) goto L4
            return r3
        L4:
            if (r6 == 0) goto L9
            if (r7 != 0) goto La
        L9:
            return r3
        La:
            r4 = 2131368499(0x7f0a1a33, float:1.835695E38)
            android.view.View r1 = r6.findViewById(r4)
            java.lang.String r0 = "quick_dm_fragment_tag"
            androidx.fragment.app.Fragment r3 = r7.LJJJIL(r0)
            if (r3 == 0) goto L30
            if (r1 == 0) goto L24
            r0 = 0
            r1.setVisibility(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedQuickDMFrgament r3 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedQuickDMFrgament) r3
            if (r3 != 0) goto L59
            goto L9
        L24:
            X.1B3 r0 = new X.1B3
            r0.<init>(r7)
            r0.LJJI(r3)
            r0.LJI()
            goto L32
        L30:
            if (r1 != 0) goto L43
        L32:
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.content.Context r0 = r6.getContext()
            r1.<init>(r0)
            r1.setId(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r6.addView(r1)
        L43:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedQuickDMFrgament r3 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedQuickDMFrgament
            r3.<init>()
            r3.setArguments(r8)
            X.1B3 r2 = new X.1B3
            r2.<init>(r7)
            r1 = 1
            java.lang.String r0 = "reply_fragment_tag"
            r2.LJIIIIZZ(r4, r1, r3, r0)
            r2.LJI()
        L59:
            r3.LJLIL = r10
            r3.LLZL(r9)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98503tm.LJII(android.view.View, androidx.fragment.app.FragmentManager, android.os.Bundle, com.ss.android.ugc.aweme.feed.model.Aweme, X.8rW):com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedQuickDMFrgament");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x002d, code lost:
    
        if (r6 == null) goto L14;
     */
    @Override // X.InterfaceC98813uH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(android.view.View r9, androidx.fragment.app.FragmentManager r10, android.os.Bundle r11, java.lang.String r12, X.C55350Lnu r13) {
        /*
            r8 = this;
            r4 = 0
            if (r9 == 0) goto L6
            if (r10 != 0) goto L7
        L6:
            return
        L7:
            r7 = 2131368499(0x7f0a1a33, float:1.835695E38)
            android.view.View r6 = r9.findViewById(r7)
            java.lang.String r3 = "reply_fragment_tag"
            androidx.fragment.app.Fragment r5 = r10.LJJJIL(r3)
            r2 = 0
            if (r5 == 0) goto L2d
            if (r6 == 0) goto L21
            r6.setVisibility(r2)
            com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment r5 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment) r5
            if (r5 != 0) goto L59
            goto L6
        L21:
            X.1B3 r0 = new X.1B3
            r0.<init>(r10)
            r0.LJJI(r5)
            r0.LJI()
            goto L2f
        L2d:
            if (r6 != 0) goto L40
        L2f:
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            android.content.Context r0 = r9.getContext()
            r6.<init>(r0)
            r6.setId(r7)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r9.addView(r6)
        L40:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment r5 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment
            r5.<init>()
            if (r11 == 0) goto L4a
            r5.setArguments(r11)
        L4a:
            X.1B3 r1 = new X.1B3
            r1.<init>(r10)
            r0 = 1
            r1.LJIIIIZZ(r7, r0, r5, r3)
            r1.LJI()
            r6.setVisibility(r2)
        L59:
            r5.LJLJLLL = r13
            r5.LJLJL = r12
            java.lang.String r3 = r5.LJLJJI
            if (r3 == 0) goto L6
            if (r12 == 0) goto L6
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r12)
            if (r0 == 0) goto L6
            long r1 = r0.longValue()
            com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel r0 = r5.wl()
            r0.gv0(r1, r3, r4)
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98503tm.LJIIJJI(android.view.View, androidx.fragment.app.FragmentManager, android.os.Bundle, java.lang.String, X.Lnu):void");
    }

    @Override // X.InterfaceC98813uH
    public final void LJIIIIZZ(FragmentManager fragmentManager, final User user, final Aweme aweme, final String str, final String str2, final InterfaceC88472Yns<? super CharSequence, C76800UCe> interfaceC88472Yns, final InterfaceC92963kq interfaceC92963kq, final boolean z, String str3, InterfaceC110994Xf interfaceC110994Xf) {
        final DetailFeedKeyboardDialogFragment LIZ2 = C92933kn.LIZ(fragmentManager);
        Bundle bundle = new Bundle();
        bundle.putBoolean("showEmojiTab", false);
        bundle.putSerializable("user", user);
        bundle.putSerializable("video", aweme);
        bundle.putString("style", "reply_sharer");
        bundle.putString("enterFrom", str);
        bundle.putBoolean("fromQuickDmOnStory", z);
        bundle.putString("hint", str3);
        LIZ2.setArguments(bundle);
        LIZ2.LJLLLL = new InterfaceC92953kp() { // from class: X.3tn
            @Override // X.InterfaceC92953kp
            public final void ne() {
            }

            @Override // X.InterfaceC92953kp
            public final void n2(final CharSequence charSequence, boolean z2) {
                InterfaceC92963kq interfaceC92963kq2;
                String str4;
                if (charSequence != null) {
                    DetailFeedKeyboardDialogFragment detailFeedKeyboardDialogFragment = LIZ2;
                    User user2 = user;
                    Aweme aweme2 = aweme;
                    String str5 = str;
                    boolean z3 = z;
                    String str6 = str2;
                    final InterfaceC88472Yns<CharSequence, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                    detailFeedKeyboardDialogFragment.dismiss();
                    String charSequence2 = charSequence.toString();
                    if (z3) {
                        if (z2) {
                            str4 = "story_float_emoji";
                        } else {
                            str4 = "story_message_input_box";
                        }
                    } else {
                        str4 = "quick_reply_pannel";
                    }
                    C107274Ix.LJII(charSequence2, user2, aweme2, str5, str4, str6, Boolean.valueOf(z3), new C4J3() { // from class: X.3tq
                        @Override // X.C4J3
                        public final void LIZIZ() {
                            InterfaceC88472Yns<CharSequence, C76800UCe> interfaceC88472Yns3 = interfaceC88472Yns2;
                            if (interfaceC88472Yns3 != null) {
                                interfaceC88472Yns3.invoke(charSequence);
                            }
                        }
                    });
                }
                if (z2 && charSequence != null && (interfaceC92963kq2 = InterfaceC92963kq.this) != null) {
                    interfaceC92963kq2.LIZ(charSequence);
                }
            }
        };
        if (interfaceC110994Xf != null) {
            LIZ2.LJLL = interfaceC110994Xf;
        }
        LIZ2.show(fragmentManager, "ReplyKeyboardDialogFragment");
    }
}
