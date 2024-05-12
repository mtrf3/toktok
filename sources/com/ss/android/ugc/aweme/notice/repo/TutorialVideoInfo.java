package com.ss.android.ugc.aweme.notice.repo;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TutorialVideoInfo extends F9E {

    @InterfaceC65349Pkn("button_caption")
    public final String button;

    @InterfaceC65349Pkn("deep_link")
    public final String deepLink;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("icon")
    public final String icon;

    @InterfaceC65349Pkn("msg_id")
    public final String msgId;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public TutorialVideoInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TutorialVideoInfo copy$default(TutorialVideoInfo tutorialVideoInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tutorialVideoInfo.msgId;
        }
        if ((i & 2) != 0) {
            str2 = tutorialVideoInfo.icon;
        }
        if ((i & 4) != 0) {
            str3 = tutorialVideoInfo.title;
        }
        if ((i & 8) != 0) {
            str4 = tutorialVideoInfo.desc;
        }
        if ((i & 16) != 0) {
            str5 = tutorialVideoInfo.button;
        }
        if ((i & 32) != 0) {
            str6 = tutorialVideoInfo.deepLink;
        }
        return tutorialVideoInfo.copy(str, str2, str3, str4, str5, str6);
    }

    public final TutorialVideoInfo copy(String msgId, String icon, String title, String desc, String button, String deepLink) {
        o.LJIIIZ(msgId, "msgId");
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(button, "button");
        o.LJIIIZ(deepLink, "deepLink");
        return new TutorialVideoInfo(msgId, icon, title, desc, button, deepLink);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.msgId, this.icon, this.title, this.desc, this.button, this.deepLink};
    }

    public final String getButton() {
        return this.button;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final String getTitle() {
        return this.title;
    }

    public TutorialVideoInfo(String msgId, String icon, String title, String desc, String button, String deepLink) {
        o.LJIIIZ(msgId, "msgId");
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(button, "button");
        o.LJIIIZ(deepLink, "deepLink");
        this.msgId = msgId;
        this.icon = icon;
        this.title = title;
        this.desc = desc;
        this.button = button;
        this.deepLink = deepLink;
    }

    public /* synthetic */ TutorialVideoInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "");
    }
}
