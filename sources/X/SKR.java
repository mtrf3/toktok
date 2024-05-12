package X;

import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SKR extends SKX {
    public final int LIZ = R.string.px;

    @Override // X.SKZ
    public final Class<? extends SKZ> LJFF() {
        return SKR.class;
    }

    @Override // X.SKX
    public final int LJII() {
        return R.layout.ahb;
    }

    @Override // X.SKZ
    public final void LIZLLL(SKV holder) {
        o.LJIIIZ(holder, "holder");
        ((TextView) holder.itemView.findViewById(R.id.byd)).setText(this.LIZ);
    }
}
