package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.dataChannel.ShareGuideVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bev, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29313Bev extends CSR<CPY, C29278BeM> {
    @Override // X.CSR
    public final String LJIIIIZZ() {
        return "share_guide";
    }

    @Override // X.CSR
    public final int LJI() {
        Boolean bool;
        DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
        if (dataChannel == null || (bool = (Boolean) dataChannel.kv0(BCW.class)) == null || bool.booleanValue()) {
            return R.layout.d71;
        }
        return R.layout.d72;
    }

    @Override // X.CSR, X.AbstractC31414CUo
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder) {
        CSF holder = (CSF) viewHolder;
        o.LJIIIZ(holder, "holder");
        holder.onViewAttachedToWindow();
        DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
        if (dataChannel != null) {
            dataChannel.rv0(ShareGuideVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // X.CSR, X.AbstractC31414CUo
    public final void LJ(RecyclerView.ViewHolder viewHolder) {
        CSF holder = (CSF) viewHolder;
        o.LJIIIZ(holder, "holder");
        holder.onViewDetachedFromWindow();
        DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
        if (dataChannel != null) {
            dataChannel.rv0(ShareGuideVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // X.CSR
    public final C29278BeM LJIIJJI(View itemView) {
        o.LJIIIZ(itemView, "itemView");
        return new C29278BeM(itemView);
    }

    @Override // X.CSR
    /* renamed from: LJIIL */
    public final void LIZLLL(C29278BeM holder) {
        o.LJIIIZ(holder, "holder");
        holder.onViewAttachedToWindow();
        DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
        if (dataChannel != null) {
            dataChannel.rv0(ShareGuideVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // X.CSR
    /* renamed from: LJIILIIL */
    public final void LJ(C29278BeM holder) {
        o.LJIIIZ(holder, "holder");
        holder.onViewDetachedFromWindow();
        DataChannel dataChannel = LJIIIZ().LJIIIIZZ;
        if (dataChannel != null) {
            dataChannel.rv0(ShareGuideVisibilityChannel.class, Boolean.FALSE);
        }
    }
}
