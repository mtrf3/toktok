package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class SKQ extends SKX {
    public final int LIZ;

    @Override // X.SKZ
    public final Class<? extends SKZ> LJFF() {
        return SKQ.class;
    }

    @Override // X.SKX
    public final int LJII() {
        return R.layout.ahk;
    }

    public SKQ(int i) {
        this.LIZ = i;
    }

    @Override // X.SKZ
    public final void LIZLLL(SKV holder) {
        o.LJIIIZ(holder, "holder");
        holder.itemView.findViewById(R.id.hld).getLayoutParams().height = this.LIZ;
    }
}
