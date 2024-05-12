package com.ss.android.ugc.aweme.im.service.service;

import X.C116144h8;
import X.C3KX;
import X.C3L4;
import X.C3MD;
import X.C82093Kb;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.MLE;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface IImInboxDmService {
    void clearDMUnreadCache();

    boolean enableSkylightAvatarOpt();

    Object getActiveContacts(InterfaceC67352kd<? super List<C116144h8>> interfaceC67352kd);

    C3KX getCachedDMUnreadInfo();

    int getDMRecommendedChatCount();

    MLE getDMSessionLoadConfig();

    Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] getDmCell();

    View getDmEntranceView(Context context, String str);

    C3KX getPostedDMUnreadInfo();

    boolean hasUnreadMessageRequest();

    void onInboxTabClicked();

    void onNodeVisibilityChanged(boolean z);

    void onNoticeManagerInit();

    void onReceiveDMUnreadCount(int i, boolean z);

    void onReceiveInboxPerfMetric(JSONObject jSONObject);

    void onReceiveNoticeData(Throwable th);

    void onReceiveNoticeUnreadCount(boolean z);

    void onReceiveUnreadCount(List<? extends C3L4> list, int i, boolean z);

    void onReceivedDMData(C3MD c3md, Throwable th);

    void onSDKLogout();

    void onSubmitDMData();

    void onUnreadBadgeShow();

    void onUnreadBubbleShow(boolean z);

    C82093Kb optInboxWhiteScreenTime();
}
