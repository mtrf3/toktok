package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U2S extends AbstractC76219Tvj {
    public final InterfaceC76555U2t LIZJ;
    public final DataChannel LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2S(InterfaceC76555U2t interfaceC76555U2t, DataChannel dataChannel) {
        super(0);
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZJ = interfaceC76555U2t;
        this.LIZLLL = dataChannel;
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.dev, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …     false,\n            )");
        return new C76549U2n(LLLLIILL, this.LIZJ, this.LIZLLL);
    }
}
