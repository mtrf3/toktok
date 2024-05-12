package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TvQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76200TvQ extends AbstractC76212Tvc {
    public final InterfaceC75964Trc LIZJ;
    public final InterfaceC75963Trb LIZLLL;
    public final InterfaceC76194TvK LJ;
    public final DataChannel LJFF;

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.d8d, parent, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(\n      …arent,\n            false)");
        return new C76199TvP(this, LLLLIILL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76200TvQ(InterfaceC75964Trc inviteListener, InterfaceC75963Trb applyListener, InterfaceC76194TvK replyReserveListener, DataChannel dataChannel) {
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
