package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TaU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74902TaU extends AbstractC76219Tvj {
    public final DataChannel LIZJ;
    public final TVD LIZLLL;

    public C74902TaU(DataChannel dataChannel, TVD tvd) {
        super(2);
        this.LIZJ = dataChannel;
        this.LIZLLL = tvd;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.d7m, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…list_user, parent, false)");
        return new C74901TaT(LLLLIILL, this.LIZJ, this.LIZLLL);
    }
}
