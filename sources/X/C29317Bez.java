package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.dataChannel.LinkBattleGuideVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bez, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29317Bez extends CSR<C29572Bj6, C29325Bf7> {
    @Override // X.CSR
    public final int LJI() {
        return R.layout.d70;
    }

    @Override // X.CSR
    public final String LJIIIIZZ() {
        return "link_battle_guide";
    }

    @Override // X.CSR, X.AbstractC31414CUo
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder) {
        CSF holder = (CSF) viewHolder;
        o.LJIIIZ(holder, "holder");
        holder.onViewAttachedToWindow();
        DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
        if (dataChannel != null) {
            dataChannel.rv0(LinkBattleGuideVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // X.CSR, X.AbstractC31414CUo
    public final void LJ(RecyclerView.ViewHolder viewHolder) {
        CSF holder = (CSF) viewHolder;
        o.LJIIIZ(holder, "holder");
        holder.onViewDetachedFromWindow();
        DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
        if (dataChannel != null) {
            dataChannel.rv0(LinkBattleGuideVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // X.CSR
    public final C29325Bf7 LJIIJJI(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        return new C29325Bf7(itemView);
    }

    @Override // X.CSR
    /* renamed from: LJIIL */
    public final void LIZLLL(C29325Bf7 holder) {
        o.LJIIIZ(holder, "holder");
        holder.onViewAttachedToWindow();
        DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
        if (dataChannel != null) {
            dataChannel.rv0(LinkBattleGuideVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // X.CSR
    /* renamed from: LJIILIIL */
    public final void LJ(C29325Bf7 holder) {
        o.LJIIIZ(holder, "holder");
        holder.onViewDetachedFromWindow();
        DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
        if (dataChannel != null) {
            dataChannel.rv0(LinkBattleGuideVisibilityChannel.class, Boolean.FALSE);
        }
    }
}
