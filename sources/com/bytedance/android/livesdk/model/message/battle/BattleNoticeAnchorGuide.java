package com.bytedance.android.livesdk.model.message.battle;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class BattleNoticeAnchorGuide extends F9E {

    @InterfaceC65349Pkn("button_content")
    public BattleNoticeText buttonContent;

    @InterfaceC65349Pkn("content")
    public BattleNoticeText content;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.content, this.buttonContent};
    }
}