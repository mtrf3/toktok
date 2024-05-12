package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TvR, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76201TvR extends AbstractC76212Tvc {
    public final InterfaceC75964Trc LIZJ;
    public final InterfaceC75963Trb LIZLLL;
    public final InterfaceC76193TvJ LJ;
    public final DataChannel LJFF;

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.d87, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…erve_card, parent, false)");
        return new C76202TvS(this, LLLLIILL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76201TvR(InterfaceC75964Trc inviteListener, InterfaceC75963Trb applyListener, InterfaceC76193TvJ replyReserveListener, DataChannel dataChannel) {
        super(0);
        o.LJIIIZ(inviteListener, "inviteListener");
        o.LJIIIZ(applyListener, "applyListener");
        o.LJIIIZ(replyReserveListener, "replyReserveListener");
        this.LIZJ = inviteListener;
        this.LIZLLL = applyListener;
        this.LJ = replyReserveListener;
        this.LJFF = dataChannel;
    }
}
