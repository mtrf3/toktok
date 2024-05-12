package com.ss.android.ugc.aweme.setting.page.datasave.zerorating;

import X.C16880lQ;
import X.InterfaceC57784Mm4;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public abstract class FreeDataCommonCell<T extends InterfaceC57784Mm4> extends PowerCell<T> implements View.OnClickListener {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(T t) {
        o.LJIIIZ(t, "t");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.axm, parent, false);
        C16880lQ.LJIIJ(this, LLLLIILL);
        return LLLLIILL;
    }
}
