package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Grt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42857Grt extends AbstractC42838Gra<C6J6> {
    public final InterfaceC42865Gs1 LJLL;
    public final C42848Grk LJLLI;

    public C42857Grt(C42847Grj listener, C42848Grk c42848Grk) {
        o.LJIIIZ(listener, "listener");
        this.LJLL = listener;
        this.LJLLI = c42848Grk;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    @Override // X.AbstractC42841Grd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r11, int r12) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42857Grt.onBindBasicViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC42841Grd
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View itemView = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bbp, viewGroup, false);
        o.LJIIIIZZ(itemView, "itemView");
        return new C42858Gru(itemView, this.LJLLI, this.LJLL);
    }
}
