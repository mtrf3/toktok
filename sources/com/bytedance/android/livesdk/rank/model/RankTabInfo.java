package com.bytedance.android.livesdk.rank.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public final class RankTabInfo extends F9E {
    public String LJLIL;
    public int LJLILLLLZI;

    @InterfaceC65349Pkn("list_lynx_type")
    public long listLynxType;

    @InterfaceC65349Pkn("rank_type")
    public int rankType;

    @InterfaceC65349Pkn("title_text")
    public Text title;

    @Override // X.F9E
    public final Object[] getObjects() {
        Text text = this.title;
        return new Object[]{Integer.valueOf(this.rankType), text, text};
    }
}
