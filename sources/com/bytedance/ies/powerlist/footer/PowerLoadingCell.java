package com.bytedance.ies.powerlist.footer;

import X.AbstractC72298SZa;
import X.C72299SZb;
import X.C72302SZe;
import X.C72304SZg;
import X.SYT;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class PowerLoadingCell extends PowerCell<SYT> {
    public void M() {
    }

    public void N() {
    }

    public void P() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(SYT t) {
        o.LJIIIZ(t, "t");
        AbstractC72298SZa abstractC72298SZa = t.LJLJI.LJLILLLLZI;
        if (abstractC72298SZa instanceof C72304SZg) {
            P();
        } else if (abstractC72298SZa instanceof C72299SZb) {
            N();
        } else {
            if (!(abstractC72298SZa instanceof C72302SZe)) {
                return;
            }
            M();
        }
    }
}
