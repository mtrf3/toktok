package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TvV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76205TvV extends AbstractC76212Tvc {
    public final InterfaceC75964Trc LIZJ;
    public final InterfaceC75963Trb LIZLLL;
    public final DataChannel LJ;

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.d7t, parent, false);
        o.LJIIIIZZ(it, "it");
        C76206TvW c76206TvW = new C76206TvW(this, it);
        C76132TuK.LJJIIZI(c76206TvW);
        return c76206TvW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76205TvV(InterfaceC75964Trc inviteListener, InterfaceC75963Trb applyListener, InterfaceC76141TuT reserveListener, DataChannel dataChannel) {
        super(0);
        o.LJIIIZ(inviteListener, "inviteListener");
        o.LJIIIZ(applyListener, "applyListener");
        o.LJIIIZ(reserveListener, "reserveListener");
        this.LIZJ = inviteListener;
        this.LIZLLL = applyListener;
        this.LJ = dataChannel;
    }
}
