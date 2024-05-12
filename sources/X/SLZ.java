package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SLZ extends SKQ implements SLP {
    public final /* synthetic */ C71934SLa LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SLZ(C71934SLa c71934SLa, int i) {
        super(i);
        this.LIZIZ = c71934SLa;
    }

    @Override // X.SLP
    public final void LIZ(SKZ skz, SKZ skz2, SKV holder, int i) {
        View _$_findCachedViewById;
        o.LJIIIZ(holder, "holder");
        boolean z = true;
        int i2 = 0;
        if (skz != null ? (skz instanceof SLZ) : !(skz2 instanceof InterfaceC71918SKk) || ((_$_findCachedViewById = this.LIZIZ.LJLL._$_findCachedViewById(R.id.lgi)) != null && _$_findCachedViewById.getVisibility() == 0)) {
            z = false;
        }
        View findViewById = holder.itemView.findViewById(R.id.hld);
        if (!z) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
    }

    @Override // X.SLP
    public final void LIZIZ(SKZ skz, SKZ skz2, SKV holder, int i) {
        o.LJIIIZ(holder, "holder");
        LIZ(skz, skz2, holder, i);
    }
}
