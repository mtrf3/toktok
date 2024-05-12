package X;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.adg, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94232adg extends AbstractC93422aQc<C93721aVR, C94231adf> {
    @Override // X.AbstractC93422aQc
    public final C94231adf LIZIZ(RecyclerView parent) {
        o.LJIIIZ(parent, "parent");
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        frameLayout.setLayoutParams(C93902aYM.LJ(parent, -2, 0, 0, null, null, 252));
        C94635akB attrBlock = C94635akB.LJLIL;
        o.LJIIIZ(attrBlock, "attrBlock");
        attrBlock.invoke(frameLayout);
        return new C94231adf(frameLayout);
    }

    @Override // X.AbstractC93422aQc
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object data) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(viewHolder, "viewHolder");
    }
}
