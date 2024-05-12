package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SKj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71917SKj extends SKZ implements InterfaceC71918SKk {
    public final InterfaceC71908SKa LIZ;

    @Override // X.SKZ
    public final InterfaceC71908SKa LJ() {
        return this.LIZ;
    }

    public C71917SKj(C71997SNl c71997SNl) {
        this.LIZ = c71997SNl;
    }

    @Override // X.SKZ
    public final void LIZLLL(SKV holder) {
        o.LJIIIZ(holder, "holder");
        View findViewById = holder.itemView.findViewById(R.id.dri);
        if (findViewById != null) {
            findViewById.setBackground(null);
            if (Build.VERSION.SDK_INT >= 23) {
                findViewById.setForeground(null);
            }
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                findViewById.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // X.InterfaceC71918SKk
    public final void LIZJ(SKV holder, boolean z, boolean z2) {
        o.LJIIIZ(holder, "holder");
        AI8 ai8 = (AI8) holder.itemView.findViewById(R.id.l3q);
        if (ai8 != null) {
            ai8.LJ(z, z2);
        }
    }

    @Override // X.SLP
    public final void LIZ(SKZ skz, SKZ skz2, SKV skv, int i) {
        C71916SKi.LIZ(this, skz, skz2, skv);
    }

    @Override // X.SLP
    public final void LIZIZ(SKZ skz, SKZ skz2, SKV holder, int i) {
        o.LJIIIZ(holder, "holder");
        C71916SKi.LIZ(this, skz, skz2, holder);
    }
}
