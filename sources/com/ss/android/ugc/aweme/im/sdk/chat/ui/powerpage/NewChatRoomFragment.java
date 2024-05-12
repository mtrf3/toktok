package com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage;

import X.AKT;
import X.ActivityC45651qj;
import X.C101543yg;
import X.C107794Kx;
import X.C16880lQ;
import X.C1E4;
import X.C208158Ex;
import X.C2U8;
import X.C35154Dqw;
import X.C36W;
import X.C3U3;
import X.C41132GCi;
import X.C41133GCj;
import X.C46276IEe;
import X.C48841JEv;
import X.C56642Ke;
import X.C5H3;
import X.C61410O8g;
import X.C77266UUc;
import X.C785336j;
import X.C785436k;
import X.C78613UtF;
import X.C89263es;
import X.C98313tT;
import X.C98503tm;
import X.C98583tu;
import X.C98593tv;
import X.C98773uD;
import X.C98823uI;
import X.C99003ua;
import X.C99013ub;
import X.C99033ud;
import X.C99203uu;
import X.EnumC112394b5;
import X.InterfaceC102253zp;
import X.InterfaceC109664Sc;
import X.InterfaceC61213O0r;
import X.InterfaceC63764P0u;
import X.JBR;
import X.JBS;
import X.LFH;
import X.MLP;
import X.QD3;
import X.R1V;
import X.XKX;
import Y.ACListenerS36S0200000_1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.relation.follow.model.RelationStatus;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

@InterfaceC61213O0r
/* loaded from: classes2.dex */
public final class NewChatRoomFragment extends Hilt_NewChatRoomFragment implements JBS, InterfaceC63764P0u, View.OnAttachStateChangeListener {
    public static final C99203uu Companion = new Object() { // from class: X.3uu
    };
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C5H3 enterChatParams$delegate;
    public final C5H3 enterTakoParams$delegate;
    public final C98313tT stopWatch;

    private final void addDebugLeakCheck() {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC63764P0u
    public void onAppBackground() {
    }

    @Override // X.InterfaceC63764P0u
    public void onAppForeground() {
    }

    @Override // X.JBS
    public /* bridge */ /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    public NewChatRoomFragment() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.enterChatParams$delegate = routeArgExtension.optionalArg(this, C98773uD.LJLIL, "key_enter_chat_params", C98593tv.class);
        this.enterTakoParams$delegate = routeArgExtension.optionalArg(this, C99013ub.LJLIL, "key_enter_bot_chat_params", C99003ua.class);
        this.stopWatch = new C98313tT(0);
    }

    private final C99003ua getEnterTakoParams() {
        return (C99003ua) this.enterTakoParams$delegate.getValue();
    }

    private final void logLeaveChatWithDuration() {
        C99033ud c99033ud = this.sessionInfo;
        if (c99033ud != null) {
            C98313tT c98313tT = this.stopWatch;
            C98583tu.LJ(c99033ud, c98313tT.LIZJ - c98313tT.LIZIZ, "NewChatRoomFragment");
        }
    }

    public final C98593tv getEnterChatParams() {
        return (C98593tv) this.enterChatParams$delegate.getValue();
    }

    private final String getChatType() {
        Integer valueOf;
        if (getTakoParams() != null) {
            return "tikbot";
        }
        C98593tv enterChatParams = getEnterChatParams();
        if (enterChatParams == null || (valueOf = Integer.valueOf(enterChatParams.getChatType())) == null || valueOf.intValue() != 3) {
            return "private";
        }
        return "group";
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment
    public void configImmersive() {
        C98593tv enterChatParams = getEnterChatParams();
        if (enterChatParams != null && enterChatParams.isBookMode()) {
            fragmentConfiguration(C41132GCi.LJLIL);
        } else {
            super.configImmersive();
        }
    }

    public final String getBusinessAccountIdWithWelcomeMsgEnabled() {
        boolean z;
        C98593tv enterChatParams;
        IMUser imUser;
        C98593tv enterChatParams2 = getEnterChatParams();
        if (enterChatParams2 != null) {
            z = o.LJ(enterChatParams2.getWelcomeMsgEnabled(), Boolean.TRUE);
        } else {
            z = false;
        }
        if (!z || (enterChatParams = getEnterChatParams()) == null || (imUser = enterChatParams.getImUser()) == null) {
            return null;
        }
        return imUser.getUid();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment
    public C98593tv getChatParams() {
        return getEnterChatParams();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment
    public C99003ua getTakoParams() {
        return getEnterTakoParams();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment
    public boolean isBookMode() {
        C98593tv enterChatParams = getEnterChatParams();
        if (enterChatParams == null || !enterChatParams.isBookMode()) {
            return false;
        }
        return true;
    }

    @Override // X.JBS
    public void onBackPressed_Activity() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.setResult(11);
        }
        if (requireActivity().isTaskRoot()) {
            C98503tm c98503tm = C98503tm.LIZ;
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C98823uI.LIZ(c98503tm, requireActivity, null, false, null, 12);
        }
        if (handleOnBackPressed()) {
            return;
        }
        C98593tv enterChatParams = getEnterChatParams();
        if (enterChatParams != null && enterChatParams.isReturnToInbox()) {
            C98503tm c98503tm2 = C98503tm.LIZ;
            ActivityC45651qj requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            C98823uI.LIZ(c98503tm2, requireActivity2, null, false, null, 12);
        }
        JBR.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (C35154Dqw.LIZ()) {
            MLP.LIZIZ.LIZ(EnumC112394b5.CHAT_ROOM);
        } else {
            R1V.LJIIIZ(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ActivityStack.removeAppBackGroundListener(this);
        this.stopWatch.stop();
        logLeaveChatWithDuration();
        _$_clearFindViewByIdCache();
    }

    public final void onExitChatRoom() {
        Object obj;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.setResult(11);
        }
        if (requireActivity().isTaskRoot()) {
            C98503tm c98503tm = C98503tm.LIZ;
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            C98823uI.LIZ(c98503tm, requireActivity, null, false, null, 12);
        }
        Context context = getContext();
        if (context != null) {
            obj = C16880lQ.LLILL(context, "input_method");
        } else {
            obj = null;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(mo49getActivity2.getWindow().getDecorView().getWindowToken(), 0);
            }
            mo49getActivity2.onBackPressed();
        }
    }

    private final View.OnClickListener getChatShortcutListener(C107794Kx c107794Kx) {
        Context context = getContext();
        if (context != null) {
            return new ACListenerS36S0200000_1(context, c107794Kx, 7);
        }
        return null;
    }

    private final boolean isShareToCurrentChat(C107794Kx c107794Kx) {
        String str;
        IMConversation iMConversation;
        boolean z = false;
        if (c107794Kx.LJLJI) {
            return false;
        }
        C99033ud c99033ud = this.sessionInfo;
        if (c99033ud != null && c99033ud.isGroupChat()) {
            z = true;
        }
        Object obj = null;
        if (z) {
            IMContact iMContact = c107794Kx.LJLIL;
            if ((iMContact instanceof IMConversation) && (iMConversation = (IMConversation) iMContact) != null) {
                str = iMConversation.getConversationId();
            } else {
                str = null;
            }
            C99033ud c99033ud2 = this.sessionInfo;
            if (c99033ud2 != null) {
                obj = c99033ud2.getConversationId();
            }
            return o.LJ(str, obj);
        }
        IMContact iMContact2 = c107794Kx.LJLIL;
        if (!(iMContact2 instanceof IMUser)) {
            iMContact2 = null;
        }
        C99033ud c99033ud3 = this.sessionInfo;
        if (c99033ud3 != null) {
            obj = c99033ud3.getSingleChatFromUser();
        }
        return o.LJ(iMContact2, obj);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        activityConfiguration(new AqS138S0200000_7(this, bundle, 15));
        LFH lfh = LFH.LIZIZ;
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        lfh.LIZIZ(requireActivity);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBlockUserSuccessEvent(C785436k event) {
        o.LJIIIZ(event, "event");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C785336j(this, mo49getActivity, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C41133GCj.LJLIL);
        if (C35154Dqw.LIZ()) {
            MLP.LIZIZ.LIZIZ(EnumC112394b5.CHAT_ROOM);
        } else {
            R1V.LIZ.LJII(1);
        }
        addDebugLeakCheck();
    }

    @QD3
    public final void onEvent(C107794Kx event) {
        String str;
        int dimensionPixelOffset;
        o.LJIIIZ(event, "event");
        if (o.LJ(event.LJLJJI, "video_sticker") && (o.LJ(event.LJLJJL, "personal_homepage") || o.LJ(event.LJLJJL, "others_homepage"))) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            str = C1E4.LJIJI(mo49getActivity, event);
        } else {
            str = null;
        }
        Integer fetchInputViewHeight = fetchInputViewHeight();
        if (fetchInputViewHeight != null) {
            dimensionPixelOffset = fetchInputViewHeight.intValue();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.ta);
        }
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        int LIZIZ = C61410O8g.LIZIZ(requireContext) + dimensionPixelOffset;
        if (str != null) {
            AKT akt = new AKT(this);
            akt.LJI(str);
            akt.LJ(R.style.ux);
            akt.LIZJ(3000L);
            akt.LIZ.LJLJL = LIZIZ;
            if (!isShareToCurrentChat(event)) {
                View.OnClickListener chatShortcutListener = getChatShortcutListener(event);
                C208158Ex c208158Ex = akt.LIZ;
                c208158Ex.LJLJLJ = chatShortcutListener;
                c208158Ex.LJLJJI = 0;
            } else {
                akt.LIZ.LJLJJI = 3;
            }
            akt.LJII();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke event) {
        FragmentManager fragmentManager;
        o.LJIIIZ(event, "event");
        try {
            InterfaceC109664Sc inboxAdapterService = IMService.createIIMServicebyMonsterPlugin(false).getInboxAdapterService();
            if (inboxAdapterService != null) {
                String string = JSONObjectProtectorUtils.getString(event.LJLIL, "eventName");
                o.LJIIIIZZ(string, "event.params.getString(\"eventName\")");
                Lifecycle.State currentState = getLifecycle().getCurrentState();
                o.LJIIIIZZ(currentState, "this@NewChatRoomFragment.lifecycle.currentState");
                if (inboxAdapterService.LJIIJ(string, currentState) && (fragmentManager = getFragmentManager()) != null) {
                    inboxAdapterService.LIZJ(fragmentManager, C36W.REPORT, null);
                }
            }
        } catch (JSONException unused) {
        }
    }

    @Override // X.JBS
    public void onNewIntent(Intent intent) {
        handleNewIntent(intent);
    }

    @QD3
    public final void onVideoPlayerStatusEvent(C46276IEe event) {
        o.LJIIIZ(event, "event");
        String chatType = getChatType();
        int i = event.LJLIL;
        String str = "";
        if (i != 1) {
            if (i != 5) {
                return;
            }
            InterfaceC102253zp imVideoService = IMService.createIIMServicebyMonsterPlugin(false).getImVideoService();
            String str2 = event.LJLILLLLZI;
            if (str2 != null) {
                str = str2;
            }
            imVideoService.LIZLLL(str, chatType, true);
            return;
        }
        InterfaceC102253zp imVideoService2 = IMService.createIIMServicebyMonsterPlugin(false).getImVideoService();
        String str3 = event.LJLILLLLZI;
        if (str3 != null) {
            str = str3;
        }
        imVideoService2.LIZLLL(str, chatType, false);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        Boolean bool;
        C99033ud c99033ud;
        IMUser singleChatFromUser;
        String singleChatFromUserId;
        o.LJIIIZ(v, "v");
        C99033ud c99033ud2 = this.sessionInfo;
        if (c99033ud2 != null && c99033ud2.isSingleChat() && this.chatRoomConfig.LJLJI) {
            C99033ud c99033ud3 = this.sessionInfo;
            if (c99033ud3 != null && (singleChatFromUserId = c99033ud3.getSingleChatFromUserId()) != null) {
                C89263es.LJFF(C89263es.LIZ(), singleChatFromUserId);
                bool = Boolean.valueOf(C89263es.LJ(C89263es.LIZ(), singleChatFromUserId));
            } else {
                bool = null;
            }
            if (o.LJ(bool, Boolean.TRUE) && (c99033ud = this.sessionInfo) != null && (singleChatFromUser = c99033ud.getSingleChatFromUser()) != null) {
                C2U8.LIZ(new C3U3(singleChatFromUser.getUid()));
                C77266UUc.LIZIZ.getRelationService().LJFF().postValue(new RelationStatus(singleChatFromUser.getUid(), singleChatFromUser.getFollowStatus(), null, null, null, 28, null));
            }
            C101543yg.LIZ.getClass();
            AKT akt = C101543yg.LIZLLL;
            if (akt != null) {
                akt.LIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityStack.addAppBackGroundListener(this);
        this.stopWatch.start();
        view.addOnAttachStateChangeListener(this);
    }

    @Override // X.JBS
    public void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
        onActivityResult(i, i2, intent);
    }
}
