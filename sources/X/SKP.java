package X;

import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SKP extends SKX {
    public final int LIZ;
    public final Integer LIZIZ = null;

    @Override // X.SKZ
    public final Class<? extends SKZ> LJFF() {
        return SKP.class;
    }

    @Override // X.SKX
    public final int LJII() {
        return R.layout.ahg;
    }

    public SKP(int i) {
        this.LIZ = i;
    }

    @Override // X.SKZ
    public final void LIZLLL(SKV holder) {
        int i;
        o.LJIIIZ(holder, "holder");
        ((TextView) holder.itemView.findViewById(R.id.mo6)).setText(this.LIZ);
        TextView textView = (TextView) holder.itemView.findViewById(R.id.mlu);
        Integer num = this.LIZIZ;
        if (num != null) {
            textView.setText(num.intValue());
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }
}
