package com.ss.android.ugc.aweme.framework.services;

import X.F9E;
import X.HH1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class StickerTagChangeData extends F9E {
    public final String panel;
    public final String tabId;
    public final String tabKey;
    public final String tabName;

    public static /* synthetic */ StickerTagChangeData copy$default(StickerTagChangeData stickerTagChangeData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stickerTagChangeData.panel;
        }
        if ((i & 2) != 0) {
            str2 = stickerTagChangeData.tabName;
        }
        if ((i & 4) != 0) {
            str3 = stickerTagChangeData.tabKey;
        }
        if ((i & 8) != 0) {
            str4 = stickerTagChangeData.tabId;
        }
        return stickerTagChangeData.copy(str, str2, str3, str4);
    }

    public final StickerTagChangeData copy(String panel, String tabName, String tabKey, String str) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(tabName, "tabName");
        o.LJIIIZ(tabKey, "tabKey");
        return new StickerTagChangeData(panel, tabName, tabKey, str);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.panel, this.tabName, this.tabKey, this.tabId};
    }

    public final String getPanel() {
        return this.panel;
    }

    public final String getTabId() {
        return this.tabId;
    }

    public final String getTabKey() {
        return this.tabKey;
    }

    public final String getTabName() {
        return this.tabName;
    }

    public StickerTagChangeData(String str, String str2, String str3, String str4) {
        HH1.LIZ(str, "panel", str2, "tabName", str3, "tabKey");
        this.panel = str;
        this.tabName = str2;
        this.tabKey = str3;
        this.tabId = str4;
    }

    public /* synthetic */ StickerTagChangeData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
