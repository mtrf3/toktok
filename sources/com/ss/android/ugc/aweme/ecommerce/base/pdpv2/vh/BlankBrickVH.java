package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh;

import X.KL2;
import X.RXN;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BlankBrickVH extends BaseBrickVH<RXN> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void T(RXN item) {
        float f;
        Float f2;
        o.LJIIIZ(item, "item");
        Context context = this.itemView.getContext();
        BrickStyle LJII = item.LJII();
        if (LJII != null && (f2 = LJII.height) != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        this.itemView.setLayoutParams(new RecyclerView.LayoutParams(-1, (int) KL2.LIZJ(context, f)));
    }
}
