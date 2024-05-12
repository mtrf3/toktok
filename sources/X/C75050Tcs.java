package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tcs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75050Tcs extends AbstractC76219Tvj {
    public final DataChannel LIZJ;
    public final InterfaceC75076TdI LIZLLL;
    public final int LJ;
    public final C31413CUn LJFF;

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dfm, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …     false,\n            )");
        return new C75062Td4(LLLLIILL, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
    }

    public C75050Tcs(DataChannel dataChannel, C75077TdJ c75077TdJ, int i, C31413CUn c31413CUn) {
        super(1);
        this.LIZJ = dataChannel;
        this.LIZLLL = c75077TdJ;
        this.LJ = i;
        this.LJFF = c31413CUn;
    }
}
