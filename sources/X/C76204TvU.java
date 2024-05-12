package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TvU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76204TvU extends AbstractC76212Tvc {
    public final InterfaceC75964Trc LIZJ;
    public final InterfaceC75963Trb LIZLLL;
    public final InterfaceC76141TuT LJ;
    public final DataChannel LJFF;

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.d7u, parent, false);
        o.LJIIIIZZ(it, "it");
        C76203TvT c76203TvT = new C76203TvT(this, it);
        C76132TuK.LJJIIZI(c76203TvT);
        return c76203TvT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76204TvU(InterfaceC75964Trc mInviteListener, InterfaceC75963Trb mApplyListener, InterfaceC76141TuT reserveListener, DataChannel dataChannel) {
        super(0);
        o.LJIIIZ(mInviteListener, "mInviteListener");
        o.LJIIIZ(mApplyListener, "mApplyListener");
        o.LJIIIZ(reserveListener, "reserveListener");
        this.LIZJ = mInviteListener;
        this.LIZLLL = mApplyListener;
        this.LJ = reserveListener;
        this.LJFF = dataChannel;
    }
}
