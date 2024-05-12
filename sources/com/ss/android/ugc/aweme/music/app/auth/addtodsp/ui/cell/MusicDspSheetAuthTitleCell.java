package com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.cell;

import X.C2PV;
import X.C2PW;
import X.C94509ai9;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* loaded from: classes34.dex */
public final class MusicDspSheetAuthTitleCell extends PowerCell<C94509ai9> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dwf;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        if (C2PV.LIZ() || C2PW.LIZ()) {
            this.itemView.findViewById(R.id.m8i).setVisibility(0);
        }
    }
}
