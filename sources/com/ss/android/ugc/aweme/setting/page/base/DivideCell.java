package com.ss.android.ugc.aweme.setting.page.base;

import X.C158196It;
import X.C6JA;
import X.InterfaceC57784Mm4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public abstract class DivideCell<T extends C6JA> extends PowerCell<T> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 interfaceC57784Mm4) {
        int i;
        C6JA item = (C6JA) interfaceC57784Mm4;
        o.LJIIIZ(item, "item");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        if (itemView instanceof C158196It) {
            C158196It c158196It = (C158196It) itemView;
            c158196It.setTitleAllCap(true);
            boolean z = item.LJLIL;
            View view = c158196It.LJLIL;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            int i2 = item.LJLILLLLZI;
            if (i2 != -1) {
                c158196It.setTitle(c158196It.getContext().getText(i2));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        return new C158196It(context, null, 6);
    }
}
