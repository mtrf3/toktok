package com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage;

import X.C05040Hs;
import X.C0M6;
import X.C109544Rq;
import X.C1HQ;
import X.C2U8;
import X.C3OQ;
import X.C3Y4;
import X.C48841JEv;
import X.C5H3;
import X.C62070OXq;
import X.C78613UtF;
import X.C85323Wm;
import X.C98533tp;
import X.C98593tv;
import X.C98753uB;
import X.C98763uC;
import X.C99003ua;
import X.C99033ud;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import X.XKX;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.im.sdk.common.data.manager.keva.IMCriticalFlowKeva;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r(attachActivity = SelectChatMsgHostActivity.class)
/* loaded from: classes2.dex */
public final class SelectChatMsgFragment extends Hilt_SelectChatMsgFragment implements JBS {
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C5H3 LJLJJI = RouteArgExtension.INSTANCE.optionalArg(this, C98753uB.LJLIL, "key_enter_chat_params", C98593tv.class);
    public boolean LJLJJL = true;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment
    public final C99003ua getTakoParams() {
        return null;
    }

    @Override // X.JBS
    public final /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment
    public final C98593tv getChatParams() {
        return (C98593tv) this.LJLJJI.getValue();
    }

    @Override // X.JBS
    public final void onBackPressed_Activity() {
        String conversationId;
        C99033ud c99033ud = this.sessionInfo;
        if (c99033ud != null && (conversationId = c99033ud.getConversationId()) != null && conversationId.length() > 0) {
            C98763uC c98763uC = new C98763uC();
            c98763uC.LJLILLLLZI = conversationId;
            C2U8.LIZ(c98763uC);
        }
        handleOnBackPressed();
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C3OQ(null), 3);
        JBR.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getFpsMonitor().LIZ("is_report_page", "1");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment
    public final void initParam(boolean z) {
        String str;
        List<C109544Rq> list;
        boolean z2;
        String conversationId;
        C99033ud c99033ud;
        int i;
        Integer LIZIZ;
        super.initParam(z);
        C99033ud c99033ud2 = this.sessionInfo;
        String content = null;
        if (c99033ud2 != null) {
            str = c99033ud2.getConversationId();
        } else {
            str = null;
        }
        C99033ud c99033ud3 = this.sessionInfo;
        if (c99033ud3 != null) {
            HashMap<String, List<C109544Rq>> hashMap = C98533tp.LIZ;
            if (hashMap != null) {
                list = hashMap.get(str);
            } else {
                list = null;
            }
            c99033ud3.setSelectMsgList(list);
        }
        boolean z3 = false;
        if (str != null && (c99033ud = this.sessionInfo) != null) {
            C0M6<String, Integer> c0m6 = C98533tp.LIZJ;
            if (c0m6 == null || (LIZIZ = c0m6.LIZIZ(str)) == null) {
                i = 0;
            } else {
                i = LIZIZ.intValue();
            }
            c99033ud.setDefaultMsgSelectedNum(i);
        }
        C99033ud c99033ud4 = this.sessionInfo;
        if (c99033ud4 != null) {
            C98593tv c98593tv = (C98593tv) this.LJLJJI.getValue();
            if (c98593tv != null) {
                z2 = c98593tv.isReportPage();
            } else {
                z2 = false;
            }
            c99033ud4.setReportPage(z2);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LJLJJL && !this.hasPause) {
            this.LJLJJL = false;
            C99033ud c99033ud5 = this.sessionInfo;
            if (c99033ud5 != null && (conversationId = c99033ud5.getConversationId()) != null) {
                Keva LJ = IMCriticalFlowKeva.LIZ.LJ();
                if (conversationId.length() == 0) {
                    z3 = true;
                }
                content = "";
                if (!z3) {
                    content = LJ.getString(conversationId, "");
                    LJ.clear();
                    o.LJIIIIZZ(content, "content");
                }
            }
            IMCriticalFlowKeva.ReportPageConfig reportPageConfig = (IMCriticalFlowKeva.ReportPageConfig) C62070OXq.LIZ(IMCriticalFlowKeva.ReportPageConfig.class, content);
            if (reportPageConfig == null) {
                return;
            }
            long j = reportPageConfig.timeStamp;
            long j2 = currentTimeMillis - j;
            String str2 = reportPageConfig.entrance;
            if (j <= 0 || j2 <= 0) {
                return;
            }
            String LIZ = C3Y4.LIZ();
            C85323Wm LIZJ = C05040Hs.LIZJ(str2, "enterMethod", "onEventV3");
            C1HQ c1hq = new C1HQ();
            c1hq.put("duration", String.valueOf(j2));
            c1hq.put("enter_method", str2);
            c1hq.put("process_id", LIZ);
            LIZJ.LIZIZ("enter_report_page_performance", c1hq);
        }
    }

    @Override // X.JBS
    public final void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
        onActivityResult(i, i2, intent);
    }
}
