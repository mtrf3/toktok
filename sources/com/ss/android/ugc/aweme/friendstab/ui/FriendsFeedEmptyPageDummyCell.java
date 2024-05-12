package com.ss.android.ugc.aweme.friendstab.ui;

import X.C1DI;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* loaded from: classes2.dex */
public final class FriendsFeedEmptyPageDummyCell extends PowerCell<Object> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.ayr, viewGroup, false, "from(parent.context)\n   …ummy_item, parent, false)");
    }
}
