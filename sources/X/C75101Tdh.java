package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75101Tdh extends C75100Tdg {
    @Override // X.C75100Tdg, X.AbstractC31414CUo
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return LIZJ(layoutInflater, viewGroup);
    }

    @Override // X.C75100Tdg
    /* renamed from: LJI */
    public final C75093TdZ LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        View LIZIZ;
        o.LJIIIZ(parent, "parent");
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            Context context = layoutInflater.getContext();
            o.LJIIIIZZ(context, "inflater.context");
            LIZIZ = C20780ri.LIZIZ(R.layout.dfo, context, parent, false);
        } else {
            LIZIZ = CZB.LIZ.LIZIZ(R.layout.dfo, parent, false);
        }
        return new C75095Tdb(LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI);
    }

    public C75101Tdh(DataChannel dataChannel, InterfaceC75119Tdz interfaceC75119Tdz, MultiGuestDataHolder multiGuestDataHolder, LinkControlDataHolder linkControlDataHolder, int i) {
        super(dataChannel, interfaceC75119Tdz, multiGuestDataHolder, linkControlDataHolder, i, null, 480);
    }
}
